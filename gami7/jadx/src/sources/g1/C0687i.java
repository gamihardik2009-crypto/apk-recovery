package g1;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import h1.C0698b;
import j.C0751g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: g1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687i {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f7718j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile C0687i f7719k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f7720a;

    /* renamed from: b, reason: collision with root package name */
    public final C0751g f7721b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f7722c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f7723d;

    /* renamed from: e, reason: collision with root package name */
    public final C0684f f7724e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0686h f7725f;

    /* renamed from: g, reason: collision with root package name */
    public final C1.b f7726g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7727h;

    /* renamed from: i, reason: collision with root package name */
    public final C0682d f7728i;

    public C0687i(r rVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7720a = reentrantReadWriteLock;
        this.f7722c = 3;
        InterfaceC0686h interfaceC0686h = rVar.f7753a;
        this.f7725f = interfaceC0686h;
        int i2 = rVar.f7754b;
        this.f7727h = i2;
        this.f7728i = rVar.f7755c;
        this.f7723d = new Handler(Looper.getMainLooper());
        this.f7721b = new C0751g(0);
        this.f7726g = new C1.b(21, false);
        C0684f c0684f = new C0684f(this);
        this.f7724e = c0684f;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f7722c = 0;
            } catch (Throwable th) {
                this.f7720a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC0686h.c(new C0683e(c0684f));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static C0687i a() {
        C0687i c0687i;
        synchronized (f7718j) {
            try {
                c0687i = f7719k;
                if (!(c0687i != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0687i;
    }

    public static boolean c() {
        return f7719k != null;
    }

    public final int b() {
        this.f7720a.readLock().lock();
        try {
            return this.f7722c;
        } finally {
            this.f7720a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f7727h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f7720a.writeLock().lock();
        try {
            if (this.f7722c == 0) {
                return;
            }
            this.f7722c = 0;
            this.f7720a.writeLock().unlock();
            C0684f c0684f = this.f7724e;
            C0687i c0687i = c0684f.f7715a;
            try {
                c0687i.f7725f.c(new C0683e(c0684f));
            } catch (Throwable th) {
                c0687i.e(th);
            }
        } finally {
            this.f7720a.writeLock().unlock();
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f7720a.writeLock().lock();
        try {
            this.f7722c = 2;
            arrayList.addAll(this.f7721b);
            this.f7721b.clear();
            this.f7720a.writeLock().unlock();
            this.f7723d.post(new J1.e(arrayList, this.f7722c, th));
        } catch (Throwable th2) {
            this.f7720a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        this.f7720a.writeLock().lock();
        try {
            this.f7722c = 1;
            arrayList.addAll(this.f7721b);
            this.f7721b.clear();
            this.f7720a.writeLock().unlock();
            this.f7723d.post(new J1.e(arrayList, this.f7722c, null));
        } catch (Throwable th) {
            this.f7720a.writeLock().unlock();
            throw th;
        }
    }

    public final void g(EditorInfo editorInfo) {
        if (b() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C0684f c0684f = this.f7724e;
        c0684f.getClass();
        Bundle bundle = editorInfo.extras;
        C0698b c0698b = (C0698b) c0684f.f7717c.f4547i;
        int a3 = c0698b.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a3 != 0 ? ((ByteBuffer) c0698b.f7787k).getInt(a3 + c0698b.f7784h) : 0);
        Bundle bundle2 = editorInfo.extras;
        c0684f.f7715a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
