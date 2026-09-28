package p;

/* renamed from: p.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1051x0 implements InterfaceC1012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f9705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1055z0 f9706b;

    public C1051x0(C0 c02, C1055z0 c1055z0) {
        this.f9705a = c02;
        this.f9706b = c1055z0;
    }

    @Override // p.InterfaceC1012d0
    public final float a(float f3) {
        C0 c02 = this.f9705a;
        long d3 = c02.d(c02.g(f3));
        C0 c03 = this.f9706b.f9724a;
        c03.f9390g = 2;
        n.j0 j0Var = c03.f9385b;
        return c02.c(c02.f((j0Var == null || !(c03.f9384a.a() || c03.f9384a.c())) ? C0.a(c03, c03.f9391h, d3, 2) : j0Var.b(d3, c03.f9390g, c03.f9393j)));
    }
}
