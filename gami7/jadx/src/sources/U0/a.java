package U0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (r1 == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent a(android.content.Context r6, android.content.BroadcastReceiver r7, android.content.IntentFilter r8, java.lang.String r9, android.os.Handler r10, int r11) {
        /*
            r0 = r11 & 4
            if (r0 == 0) goto Lac
            if (r9 != 0) goto Lac
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r6.getPackageName()
            r9.append(r11)
            java.lang.String r11 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            int r11 = android.os.Process.myPid()
            int r0 = android.os.Process.myUid()
            java.lang.String r1 = r6.getPackageName()
            int r11 = r6.checkPermission(r9, r11, r0)
            r2 = -1
            if (r11 == r2) goto L93
            java.lang.String r11 = T0.b.d(r9)
            if (r11 != 0) goto L35
            goto L8e
        L35:
            if (r1 != 0) goto L47
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String[] r1 = r1.getPackagesForUid(r0)
            if (r1 == 0) goto L93
            int r2 = r1.length
            if (r2 <= 0) goto L93
            r2 = 0
            r1 = r1[r2]
        L47:
            int r2 = android.os.Process.myUid()
            java.lang.String r3 = r6.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r4 = android.app.AppOpsManager.class
            if (r2 != r0) goto L82
            boolean r2 = java.util.Objects.equals(r3, r1)
            if (r2 == 0) goto L82
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L77
            android.app.AppOpsManager r2 = T0.c.c(r6)
            int r3 = android.os.Binder.getCallingUid()
            int r1 = T0.c.a(r2, r11, r3, r1)
            if (r1 == 0) goto L6e
            goto L8c
        L6e:
            java.lang.String r1 = T0.c.b(r6)
            int r1 = T0.c.a(r2, r11, r0, r1)
            goto L8c
        L77:
            java.lang.Object r0 = T0.b.a(r6, r4)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            int r1 = T0.b.c(r0, r11, r1)
            goto L8c
        L82:
            java.lang.Object r0 = T0.b.a(r6, r4)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            int r1 = T0.b.c(r0, r11, r1)
        L8c:
            if (r1 != 0) goto L93
        L8e:
            android.content.Intent r6 = r6.registerReceiver(r7, r8, r9, r10)
            return r6
        L93:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Permission "
            r7.<init>(r8)
            r7.append(r9)
            java.lang.String r8 = " is required by your application to receive broadcasts, please add it to your manifest"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        Lac:
            r5 = r11 & 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            android.content.Intent r6 = r0.registerReceiver(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.a.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, java.lang.String, android.os.Handler, int):android.content.Intent");
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
