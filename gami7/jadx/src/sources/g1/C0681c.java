package g1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681c extends C1.b {
    @Override // C1.b
    public final Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
