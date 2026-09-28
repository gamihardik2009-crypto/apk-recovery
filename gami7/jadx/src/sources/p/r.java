package p;

import J.C0257c;
import J.C0274k0;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class r implements InterfaceC1047v0 {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f9668a;

    /* renamed from: b, reason: collision with root package name */
    public final C1037q f9669b = new C1037q(this);

    /* renamed from: c, reason: collision with root package name */
    public final n.f0 f9670c = new n.f0();

    /* renamed from: d, reason: collision with root package name */
    public final C0274k0 f9671d;

    /* renamed from: e, reason: collision with root package name */
    public final C0274k0 f9672e;

    /* renamed from: f, reason: collision with root package name */
    public final C0274k0 f9673f;

    public r(y2.c cVar) {
        this.f9668a = cVar;
        Boolean bool = Boolean.FALSE;
        J.W w2 = J.W.f4109m;
        this.f9671d = C0257c.N(bool, w2);
        this.f9672e = C0257c.N(bool, w2);
        this.f9673f = C0257c.N(bool, w2);
    }

    @Override // p.InterfaceC1047v0
    public final float b(float f3) {
        return ((Number) this.f9668a.l(Float.valueOf(f3))).floatValue();
    }

    @Override // p.InterfaceC1047v0
    public final boolean d() {
        return ((Boolean) this.f9671d.getValue()).booleanValue();
    }

    @Override // p.InterfaceC1047v0
    public final Object e(n.c0 c0Var, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        Object e3 = J2.B.e(new C1035p(this, c0Var, eVar, null), interfaceC1073d);
        return e3 == EnumC1145a.f10026h ? e3 : C0880v.f8657a;
    }
}
