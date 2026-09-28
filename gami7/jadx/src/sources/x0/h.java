package x0;

import android.os.Bundle;
import android.view.ViewStructure;

/* loaded from: classes.dex */
public abstract class h {
    public static Bundle a(ViewStructure viewStructure) {
        return viewStructure.getExtras();
    }

    public static void b(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public static void c(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public static void d(ViewStructure viewStructure, int i2, int i3, int i4, int i5, int i6, int i7) {
        viewStructure.setDimens(i2, i3, i4, i5, i6, i7);
    }

    public static void e(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void f(ViewStructure viewStructure, float f3, int i2, int i3, int i4) {
        viewStructure.setTextStyle(f3, i2, i3, i4);
    }
}
