package W;

import android.view.ViewStructure;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5886a = new c();

    public final int a(ViewStructure viewStructure, int i2) {
        return viewStructure.addChildCount(i2);
    }

    public final ViewStructure b(ViewStructure viewStructure, int i2) {
        return viewStructure.newChild(i2);
    }

    public final void c(ViewStructure viewStructure, int i2, int i3, int i4, int i5, int i6, int i7) {
        viewStructure.setDimens(i2, i3, i4, i5, i6, i7);
    }

    public final void d(ViewStructure viewStructure, int i2, String str, String str2, String str3) {
        viewStructure.setId(i2, str, str2, str3);
    }
}
