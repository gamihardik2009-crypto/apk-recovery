package n;

import a0.C0442s;
import a0.EnumC0441r;
import a0.InterfaceC0426c;
import a0.InterfaceC0439p;
import r.C1084d;
import r.C1085e;
import r0.InterfaceC1129r;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.InterfaceC1258p;
import v.C1333E;

/* renamed from: n.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890I extends AbstractC1256n implements InterfaceC0426c, t0.m0, InterfaceC1258p, InterfaceC0439p {

    /* renamed from: w, reason: collision with root package name */
    public EnumC0441r f8688w;

    /* renamed from: x, reason: collision with root package name */
    public final C0888G f8689x;

    /* renamed from: y, reason: collision with root package name */
    public final C0891J f8690y;

    /* renamed from: z, reason: collision with root package name */
    public final C0892K f8691z;

    public C0890I(r.l lVar) {
        C0888G c0888g = new C0888G();
        c0888g.f8684u = lVar;
        K0(c0888g);
        this.f8689x = c0888g;
        C0891J c0891j = new C0891J();
        K0(c0891j);
        this.f8690y = c0891j;
        C0892K c0892k = new C0892K();
        K0(c0892k);
        this.f8691z = c0892k;
        K0(new C0442s());
    }

    @Override // a0.InterfaceC0426c
    public final void D(EnumC0441r enumC0441r) {
        L K02;
        if (z2.h.a(this.f8688w, enumC0441r)) {
            return;
        }
        boolean a3 = enumC0441r.a();
        C1333E c1333e = null;
        if (a3) {
            J2.B.r(y0(), null, 0, new C0889H(this, null), 3);
        }
        if (this.f5869t) {
            AbstractC1248f.p(this);
        }
        C0888G c0888g = this.f8689x;
        r.l lVar = c0888g.f8684u;
        if (lVar != null) {
            if (a3) {
                C1084d c1084d = c0888g.f8685v;
                if (c1084d != null) {
                    c0888g.K0(lVar, new C1085e(c1084d));
                    c0888g.f8685v = null;
                }
                C1084d c1084d2 = new C1084d();
                c0888g.K0(lVar, c1084d2);
                c0888g.f8685v = c1084d2;
            } else {
                C1084d c1084d3 = c0888g.f8685v;
                if (c1084d3 != null) {
                    c0888g.K0(lVar, new C1085e(c1084d3));
                    c0888g.f8685v = null;
                }
            }
        }
        C0892K c0892k = this.f8691z;
        if (a3 != c0892k.f8695u) {
            if (a3) {
                InterfaceC1129r interfaceC1129r = c0892k.f8696v;
                if (interfaceC1129r != null && interfaceC1129r.n() && (K02 = c0892k.K0()) != null) {
                    K02.K0(c0892k.f8696v);
                }
            } else {
                L K03 = c0892k.K0();
                if (K03 != null) {
                    K03.K0(null);
                }
            }
            c0892k.f8695u = a3;
        }
        C0891J c0891j = this.f8690y;
        if (a3) {
            c0891j.getClass();
            z2.s sVar = new z2.s();
            AbstractC1248f.s(c0891j, new D.c0(sVar, 9, c0891j));
            C1333E c1333e2 = (C1333E) sVar.f11909h;
            if (c1333e2 != null) {
                c1333e2.b();
                c1333e = c1333e2;
            }
            c0891j.f8692u = c1333e;
        } else {
            C1333E c1333e3 = c0891j.f8692u;
            if (c1333e3 != null) {
                c1333e3.c();
            }
            c0891j.f8692u = null;
        }
        c0891j.f8693v = a3;
        this.f8688w = enumC0441r;
    }

    public final void N0(r.l lVar) {
        C1084d c1084d;
        C0888G c0888g = this.f8689x;
        if (z2.h.a(c0888g.f8684u, lVar)) {
            return;
        }
        r.l lVar2 = c0888g.f8684u;
        if (lVar2 != null && (c1084d = c0888g.f8685v) != null) {
            lVar2.c(new C1085e(c1084d));
        }
        c0888g.f8685v = null;
        c0888g.f8684u = lVar;
    }

    @Override // t0.m0
    public final void k(A0.k kVar) {
        EnumC0441r enumC0441r = this.f8688w;
        boolean z3 = false;
        if (enumC0441r != null && enumC0441r.a()) {
            z3 = true;
        }
        F2.d[] dVarArr = A0.w.f123a;
        A0.x xVar = A0.t.f105k;
        F2.d dVar = A0.w.f123a[4];
        Boolean valueOf = Boolean.valueOf(z3);
        xVar.getClass();
        kVar.e(xVar, valueOf);
        kVar.e(A0.j.f54u, new A0.a(null, new B.y(29, this)));
    }

    @Override // t0.InterfaceC1258p
    public final void q0(t0.Z z3) {
        this.f8691z.q0(z3);
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
