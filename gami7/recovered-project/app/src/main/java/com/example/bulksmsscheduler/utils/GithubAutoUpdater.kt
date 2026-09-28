package com.example.bulksmsscheduler.utils

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.content.FileProvider
import com.example.bulksmsscheduler.BuildConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.File
import java.net.HttpURLConnection
import java.net.URL

object GithubAutoUpdater {

    private const val TAG = "GithubAutoUpdater"
    private const val GITHUB_API_URL = "https://api.github.com/repos/gamihardik2009-crypto/apk-recovery/releases/latest"
    private const val APK_DOWNLOAD_URL = "https://github.com/gamihardik2009-crypto/apk-recovery/releases/latest/download/gami.apk"

    data class UpdateInfo(
        val versionName: String,
        val apkUrl: String,
    )

    suspend fun checkForUpdate(): UpdateInfo? = withContext(Dispatchers.IO) {
        try {
            val url = URL(GITHUB_API_URL)
            val connection = (url.openConnection() as HttpURLConnection).apply {
                requestMethod = "GET"
                setRequestProperty("User-Agent", "BulkSmsScheduler-AndroidApp")
                setRequestProperty("Accept", "application/vnd.github.v3+json")
                connectTimeout = 5000
                readTimeout = 5000
                instanceFollowRedirects = true
            }
            Log.d(TAG, "Response code: ${connection.responseCode}")
            if (connection.responseCode == 200) {
                val responseText = connection.inputStream.bufferedReader().use { it.readText() }
                Log.d(TAG, "Response: $responseText")
                val json = JSONObject(responseText)
                val tagName = json.optString("tag_name", "").removePrefix("v").trim()
                val currentVersion = BuildConfig.VERSION_NAME.removePrefix("v").trim()
                Log.d(TAG, "Remote tag: $tagName, Local version: $currentVersion")

                if (tagName.isNotEmpty() && isNewerVersion(tagName, currentVersion)) {
                    return@withContext UpdateInfo(versionName = tagName, apkUrl = APK_DOWNLOAD_URL)
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error checking update", e)
        }
        return@withContext null
    }

    suspend fun downloadAndInstall(context: Context, apkUrl: String, onProgress: (Int) -> Unit = {}): Boolean = withContext(Dispatchers.IO) {
        try {
            val file = File(context.cacheDir, "gami_update.apk")
            if (file.exists()) file.delete()

            val url = URL(apkUrl)
            val connection = (url.openConnection() as HttpURLConnection).apply {
                connectTimeout = 10000
                readTimeout = 15000
            }
            val fileLength = connection.contentLength
            val inputStream = connection.inputStream
            val outputStream = file.outputStream()

            val data = ByteArray(4096)
            var total: Long = 0
            var count: Int
            while (inputStream.read(data).also { count = it } != -1) {
                total += count.toLong()
                if (fileLength > 0) {
                    onProgress(((total * 100) / fileLength).toInt())
                }
                outputStream.write(data, 0, count)
            }
            outputStream.flush()
            outputStream.close()
            inputStream.close()

            withContext(Dispatchers.Main) {
                installApk(context, file)
            }
            return@withContext true
        } catch (e: Exception) {
            e.printStackTrace()
            return@withContext false
        }
    }

    private fun installApk(context: Context, file: File) {
        val uri = FileProvider.getUriForFile(context, "${context.packageName}.fileprovider", file)
        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(uri, "application/vnd.android.package-archive")
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
    }

    private fun isNewerVersion(remote: String, local: String): Boolean {
        try {
            val remoteParts = remote.split(".").map { it.toIntOrNull() ?: 0 }
            val localParts = local.split(".").map { it.toIntOrNull() ?: 0 }
            val maxLength = maxOf(remoteParts.size, localParts.size)
            for (i in 0 until maxLength) {
                val r = remoteParts.getOrNull(i) ?: 0
                val l = localParts.getOrNull(i) ?: 0
                if (r > l) return true
                if (r < l) return false
            }
        } catch (e: Exception) {
            return remote != local
        }
        return false
    }
}
