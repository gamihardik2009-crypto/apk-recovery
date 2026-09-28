package b1;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: b1.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517N extends C0516M {
    public static final C0521S q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        q = C0521S.b(null, windowInsets);
    }

    public C0517N(C0521S c0521s, WindowInsets windowInsets) {
        super(c0521s, windowInsets);
    }

    @Override // b1.AbstractC0513J, b1.C0518O
    public final void d(View view) {
    }

    @Override // b1.AbstractC0513J, b1.C0518O
    public W0.b f(int i2) {
        Insets insets;
        insets = this.f7099c.getInsets(AbstractC0520Q.a(i2));
        return W0.b.c(insets);
    }

    @Override // b1.AbstractC0513J, b1.C0518O
    public W0.b g(int i2) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f7099c.getInsetsIgnoringVisibility(AbstractC0520Q.a(i2));
        return W0.b.c(insetsIgnoringVisibility);
    }

    @Override // b1.AbstractC0513J, b1.C0518O
    public boolean o(int i2) {
        boolean isVisible;
        isVisible = this.f7099c.isVisible(AbstractC0520Q.a(i2));
        return isVisible;
    }
}
