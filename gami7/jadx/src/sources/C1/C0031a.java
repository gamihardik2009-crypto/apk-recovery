package C1;

import android.content.Context;
import java.io.File;

/* renamed from: C1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0031a f619a = new C0031a();

    public final File a(Context context) {
        z2.h.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        z2.h.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
