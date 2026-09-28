package g1;

import android.os.Trace;

/* loaded from: classes.dex */
public final class l implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = Y0.g.f6237a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C0687i.c()) {
                C0687i.a().d();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i3 = Y0.g.f6237a;
            Trace.endSection();
            throw th;
        }
    }
}
