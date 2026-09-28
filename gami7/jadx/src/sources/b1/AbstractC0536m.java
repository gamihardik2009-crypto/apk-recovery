package b1;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: b1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0536m {
    public static C0521S a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0521S b3 = C0521S.b(null, rootWindowInsets);
        C0518O c0518o = b3.f7111a;
        c0518o.q(b3);
        c0518o.d(view.getRootView());
        return b3;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
