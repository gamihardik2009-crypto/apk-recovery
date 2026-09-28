package n;

import J.C0257c;
import J.C0268h0;
import m2.C0880v;
import p.InterfaceC1047v0;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class w0 implements InterfaceC1047v0 {

    /* renamed from: i, reason: collision with root package name */
    public static final K1.e f8882i;

    /* renamed from: a, reason: collision with root package name */
    public final C0268h0 f8883a;

    /* renamed from: e, reason: collision with root package name */
    public float f8887e;

    /* renamed from: b, reason: collision with root package name */
    public final C0268h0 f8884b = C0257c.M(0);

    /* renamed from: c, reason: collision with root package name */
    public final r.l f8885c = new r.l();

    /* renamed from: d, reason: collision with root package name */
    public final C0268h0 f8886d = C0257c.M(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public final p.r f8888f = new p.r(new A0.n(29, this));

    /* renamed from: g, reason: collision with root package name */
    public final J.F f8889g = C0257c.F(new v0(this, 1));

    /* renamed from: h, reason: collision with root package name */
    public final J.F f8890h = C0257c.F(new v0(this, 0));

    static {
        u0 u0Var = u0.f8859i;
        C0909q c0909q = C0909q.f8829l;
        K1.e eVar = S.n.f5572a;
        f8882i = new K1.e(u0Var, c0909q);
    }

    public w0(int i2) {
        this.f8883a = C0257c.M(i2);
    }

    @Override // p.InterfaceC1047v0
    public final boolean a() {
        return ((Boolean) this.f8889g.getValue()).booleanValue();
    }

    @Override // p.InterfaceC1047v0
    public final float b(float f3) {
        return this.f8888f.b(f3);
    }

    @Override // p.InterfaceC1047v0
    public final boolean c() {
        return ((Boolean) this.f8890h.getValue()).booleanValue();
    }

    @Override // p.InterfaceC1047v0
    public final boolean d() {
        return this.f8888f.d();
    }

    @Override // p.InterfaceC1047v0
    public final Object e(c0 c0Var, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        Object e3 = this.f8888f.e(c0Var, eVar, interfaceC1073d);
        return e3 == EnumC1145a.f10026h ? e3 : C0880v.f8657a;
    }

    public final int f() {
        return this.f8883a.g();
    }
}
