package p;

import H.P3;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class T extends M {
    public P3 E;
    public X F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f9499G;

    /* renamed from: H, reason: collision with root package name */
    public y2.f f9500H;

    /* renamed from: I, reason: collision with root package name */
    public y2.f f9501I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f9502J;

    @Override // p.M
    public final Object R0(K k3, InterfaceC1073d interfaceC1073d) {
        Object b3 = this.E.b(new P(k3, this, null), interfaceC1073d);
        return b3 == EnumC1145a.f10026h ? b3 : C0880v.f8657a;
    }

    @Override // p.M
    public final void S0(long j3) {
        if (!this.f5869t || z2.h.a(this.f9500H, O.f9476a)) {
            return;
        }
        J2.B.r(y0(), null, 0, new Q(this, j3, null), 3);
    }

    @Override // p.M
    public final void T0(long j3) {
        if (!this.f5869t || z2.h.a(this.f9501I, O.f9477b)) {
            return;
        }
        J2.B.r(y0(), null, 0, new S(this, j3, null), 3);
    }

    @Override // p.M
    public final boolean U0() {
        return this.f9499G;
    }
}
