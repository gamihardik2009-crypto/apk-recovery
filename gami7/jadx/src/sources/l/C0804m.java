package l;

import D.C0053w;
import J.InterfaceC0258c0;
import J.W0;
import m.i0;
import m.j0;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1126o;
import r0.InterfaceC1131t;

/* renamed from: l.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804m implements InterfaceC1131t {

    /* renamed from: b, reason: collision with root package name */
    public final j0 f8222b;

    /* renamed from: c, reason: collision with root package name */
    public final W0 f8223c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0805n f8224d;

    public C0804m(C0805n c0805n, j0 j0Var, InterfaceC0258c0 interfaceC0258c0) {
        this.f8224d = c0805n;
        this.f8222b = j0Var;
        this.f8223c = interfaceC0258c0;
    }

    @Override // r0.InterfaceC1131t
    public final int a(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return interfaceC1093G.b0(i2);
    }

    @Override // r0.InterfaceC1131t
    public final int b(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return interfaceC1093G.b(i2);
    }

    @Override // r0.InterfaceC1131t
    public final int d(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return interfaceC1093G.a0(i2);
    }

    @Override // r0.InterfaceC1131t
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        AbstractC1103Q a3 = interfaceC1093G.a(j3);
        C0805n c0805n = this.f8224d;
        i0 a4 = this.f8222b.a(new C0053w(c0805n, 18, this), new A0.n(25, c0805n));
        c0805n.getClass();
        long e3 = interfaceC1096J.F() ? l0.c.e(a3.f9834h, a3.f9835i) : ((O0.j) a4.getValue()).f5147a;
        return interfaceC1096J.C((int) (e3 >> 32), (int) (4294967295L & e3), C0971w.f9166h, new C0803l(c0805n, a3, e3));
    }

    @Override // r0.InterfaceC1131t
    public final int h(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return interfaceC1093G.L(i2);
    }
}
