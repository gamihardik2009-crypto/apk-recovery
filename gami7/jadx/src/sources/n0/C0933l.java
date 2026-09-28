package n0;

import g2.C0690a;
import m2.C0880v;
import t0.AbstractC1248f;
import t0.InterfaceC1254l;
import t0.k0;
import t0.p0;
import u0.AbstractC1296l0;
import u0.C1308s;
import u0.L;

/* renamed from: n0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0933l extends V.n implements p0, k0, InterfaceC1254l {

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0935n f8950u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8951v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8952w;

    @Override // V.n
    public final void D0() {
        M0();
    }

    public final void K0() {
        InterfaceC0935n interfaceC0935n;
        z2.s sVar = new z2.s();
        AbstractC1248f.y(this, new C0690a(sVar, 3));
        C0933l c0933l = (C0933l) sVar.f11909h;
        if (c0933l == null || (interfaceC0935n = c0933l.f8950u) == null) {
            interfaceC0935n = this.f8950u;
        }
        InterfaceC0936o interfaceC0936o = (InterfaceC0936o) AbstractC1248f.i(this, AbstractC1296l0.f11099s);
        if (interfaceC0936o != null) {
            C1308s c1308s = (C1308s) interfaceC0936o;
            if (interfaceC0935n == null) {
                InterfaceC0935n.f8954a.getClass();
                interfaceC0935n = AbstractC0937p.f8955a;
            }
            L.f10910a.a(c1308s.f11143a, interfaceC0935n);
        }
    }

    public final void L0() {
        z2.o oVar = new z2.o();
        oVar.f11905h = true;
        if (!this.f8951v) {
            AbstractC1248f.z(this, new Y.c(oVar));
        }
        if (oVar.f11905h) {
            K0();
        }
    }

    public final void M0() {
        C0880v c0880v;
        InterfaceC0936o interfaceC0936o;
        if (this.f8952w) {
            this.f8952w = false;
            if (this.f5869t) {
                z2.s sVar = new z2.s();
                AbstractC1248f.y(this, new C0690a(sVar, 1));
                C0933l c0933l = (C0933l) sVar.f11909h;
                if (c0933l != null) {
                    c0933l.K0();
                    c0880v = C0880v.f8657a;
                } else {
                    c0880v = null;
                }
                if (c0880v != null || (interfaceC0936o = (InterfaceC0936o) AbstractC1248f.i(this, AbstractC1296l0.f11099s)) == null) {
                    return;
                }
                InterfaceC0935n.f8954a.getClass();
                L.f10910a.a(((C1308s) interfaceC0936o).f11143a, AbstractC0937p.f8955a);
            }
        }
    }

    @Override // t0.k0
    public final void Y() {
        M0();
    }

    @Override // t0.k0
    public final void t0(C0930i c0930i, EnumC0931j enumC0931j, long j3) {
        if (enumC0931j == EnumC0931j.f8947i) {
            if (AbstractC0937p.d(c0930i.f8945c, 4)) {
                this.f8952w = true;
                L0();
            } else if (AbstractC0937p.d(c0930i.f8945c, 5)) {
                M0();
            }
        }
    }

    @Override // t0.p0
    public final /* bridge */ /* synthetic */ Object w() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
