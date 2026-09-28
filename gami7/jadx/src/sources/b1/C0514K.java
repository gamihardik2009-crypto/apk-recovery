package b1;

import android.view.WindowInsets;

/* renamed from: b1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0514K extends AbstractC0513J {

    /* renamed from: m, reason: collision with root package name */
    public W0.b f7104m;

    public C0514K(C0521S c0521s, WindowInsets windowInsets) {
        super(c0521s, windowInsets);
        this.f7104m = null;
    }

    @Override // b1.C0518O
    public C0521S b() {
        return C0521S.b(null, this.f7099c.consumeStableInsets());
    }

    @Override // b1.C0518O
    public C0521S c() {
        return C0521S.b(null, this.f7099c.consumeSystemWindowInsets());
    }

    @Override // b1.C0518O
    public final W0.b i() {
        if (this.f7104m == null) {
            WindowInsets windowInsets = this.f7099c;
            this.f7104m = W0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f7104m;
    }

    @Override // b1.C0518O
    public boolean m() {
        return this.f7099c.isConsumed();
    }

    @Override // b1.C0518O
    public void r(W0.b bVar) {
        this.f7104m = bVar;
    }
}
