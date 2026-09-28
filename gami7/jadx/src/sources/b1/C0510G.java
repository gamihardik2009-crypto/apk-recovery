package b1;

import android.view.WindowInsets;

/* renamed from: b1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0510G extends AbstractC0512I {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f7091c;

    public C0510G() {
        this.f7091c = D0.g.e();
    }

    @Override // b1.AbstractC0512I
    public C0521S b() {
        WindowInsets build;
        a();
        build = this.f7091c.build();
        C0521S b3 = C0521S.b(null, build);
        b3.f7111a.p(this.f7093b);
        return b3;
    }

    @Override // b1.AbstractC0512I
    public void d(W0.b bVar) {
        this.f7091c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // b1.AbstractC0512I
    public void e(W0.b bVar) {
        this.f7091c.setStableInsets(bVar.d());
    }

    @Override // b1.AbstractC0512I
    public void f(W0.b bVar) {
        this.f7091c.setSystemGestureInsets(bVar.d());
    }

    @Override // b1.AbstractC0512I
    public void g(W0.b bVar) {
        this.f7091c.setSystemWindowInsets(bVar.d());
    }

    @Override // b1.AbstractC0512I
    public void h(W0.b bVar) {
        this.f7091c.setTappableElementInsets(bVar.d());
    }

    public C0510G(C0521S c0521s) {
        super(c0521s);
        WindowInsets.Builder e3;
        WindowInsets a3 = c0521s.a();
        if (a3 != null) {
            e3 = D0.g.f(a3);
        } else {
            e3 = D0.g.e();
        }
        this.f7091c = e3;
    }
}
