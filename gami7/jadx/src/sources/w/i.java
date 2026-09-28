package w;

import J.C0283p;
import J2.B;
import V.n;
import m2.C0880v;
import o2.C0997c;
import p.C1027l;
import q2.InterfaceC1073d;
import r0.InterfaceC1129r;
import r2.EnumC1145a;
import t0.AbstractC1248f;
import t0.InterfaceC1263v;
import t0.Z;
import t0.p0;

/* loaded from: classes.dex */
public final class i extends n implements InterfaceC1371a, InterfaceC1263v, p0 {

    /* renamed from: w, reason: collision with root package name */
    public static final C0997c f11428w = new C0997c(7);

    /* renamed from: u, reason: collision with root package name */
    public C1027l f11429u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11430v;

    public static final b0.d K0(i iVar, InterfaceC1129r interfaceC1129r, y2.a aVar) {
        b0.d dVar;
        if (!iVar.f5869t || !iVar.f11430v) {
            return null;
        }
        Z u3 = AbstractC1248f.u(iVar);
        if (!interfaceC1129r.n()) {
            interfaceC1129r = null;
        }
        if (interfaceC1129r == null || (dVar = (b0.d) aVar.c()) == null) {
            return null;
        }
        b0.d D3 = u3.D(interfaceC1129r, false);
        return dVar.i(K1.f.e(D3.f7060a, D3.f7061b));
    }

    @Override // t0.InterfaceC1263v
    public final void b0(Z z3) {
        this.f11430v = true;
    }

    @Override // w.InterfaceC1371a
    public final Object n0(Z z3, y2.a aVar, InterfaceC1073d interfaceC1073d) {
        Object e3 = B.e(new h(this, z3, aVar, new C0283p(this, z3, aVar, 7), null), interfaceC1073d);
        return e3 == EnumC1145a.f10026h ? e3 : C0880v.f8657a;
    }

    @Override // t0.p0
    public final Object w() {
        return f11428w;
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
