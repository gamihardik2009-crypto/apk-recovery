package s;

import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1126o;
import t0.InterfaceC1264w;

/* renamed from: s.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153F extends V.n implements InterfaceC1264w {

    /* renamed from: u, reason: collision with root package name */
    public int f10052u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10053v;

    @Override // t0.InterfaceC1264w
    public final int a(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return interfaceC1093G.b0(i2);
    }

    @Override // t0.InterfaceC1264w
    public final int b(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return interfaceC1093G.b(i2);
    }

    @Override // t0.InterfaceC1264w
    public final int d(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return this.f10052u == 1 ? interfaceC1093G.L(i2) : interfaceC1093G.a0(i2);
    }

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        int L3 = this.f10052u == 1 ? interfaceC1093G.L(O0.a.g(j3)) : interfaceC1093G.a0(O0.a.g(j3));
        if (L3 < 0) {
            L3 = 0;
        }
        if (L3 >= 0) {
            long L4 = B1.C.L(L3, L3, 0, Integer.MAX_VALUE);
            if (this.f10053v) {
                L4 = B1.C.I(j3, L4);
            }
            AbstractC1103Q a3 = interfaceC1093G.a(L4);
            return interfaceC1096J.C(a3.f9834h, a3.f9835i, C0971w.f9166h, new C.h(a3, 10));
        }
        K1.f.R("width(" + L3 + ") must be >= 0");
        throw null;
    }

    @Override // t0.InterfaceC1264w
    public final int h(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return this.f10052u == 1 ? interfaceC1093G.L(i2) : interfaceC1093G.a0(i2);
    }
}
