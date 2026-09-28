package androidx.profileinstaller;

import C1.z;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import o2.C0997c;
import q1.AbstractC1064f;
import y1.InterfaceC1400b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1400b {
    @Override // y1.InterfaceC1400b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // y1.InterfaceC1400b
    public final Object b(Context context) {
        AbstractC1064f.a(new z(this, 7, context.getApplicationContext()));
        return new C0997c(3);
    }
}
