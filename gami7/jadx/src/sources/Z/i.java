package Z;

import B.F;
import B1.C;
import V.n;
import c0.C0594m;
import e0.C0652b;
import i0.C0706A;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.AbstractC1108W;
import r0.C1098L;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1126o;
import t0.C1238G;
import t0.InterfaceC1257o;
import t0.InterfaceC1264w;

/* loaded from: classes.dex */
public final class i extends n implements InterfaceC1264w, InterfaceC1257o {

    /* renamed from: u, reason: collision with root package name */
    public C0706A f6386u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6387v;

    /* renamed from: w, reason: collision with root package name */
    public V.c f6388w;

    /* renamed from: x, reason: collision with root package name */
    public C1098L f6389x;

    /* renamed from: y, reason: collision with root package name */
    public float f6390y;

    /* renamed from: z, reason: collision with root package name */
    public C0594m f6391z;

    public static boolean L0(long j3) {
        if (!b0.f.a(j3, 9205357640488583168L)) {
            float b3 = b0.f.b(j3);
            if (!Float.isInfinite(b3) && !Float.isNaN(b3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean M0(long j3) {
        if (!b0.f.a(j3, 9205357640488583168L)) {
            float d3 = b0.f.d(j3);
            if (!Float.isInfinite(d3) && !Float.isNaN(d3)) {
                return true;
            }
        }
        return false;
    }

    public final boolean K0() {
        return this.f6387v && this.f6386u.b() != 9205357640488583168L;
    }

    public final long N0(long j3) {
        boolean z3 = false;
        boolean z4 = O0.a.d(j3) && O0.a.c(j3);
        if (O0.a.f(j3) && O0.a.e(j3)) {
            z3 = true;
        }
        if ((!K0() && z4) || z3) {
            return O0.a.a(j3, O0.a.h(j3), 0, O0.a.g(j3), 0, 10);
        }
        long b3 = this.f6386u.b();
        long i2 = C.i(C.K(j3, M0(b3) ? Math.round(b0.f.d(b3)) : O0.a.j(j3)), C.J(j3, L0(b3) ? Math.round(b0.f.b(b3)) : O0.a.i(j3)));
        if (K0()) {
            long i3 = C.i(!M0(this.f6386u.b()) ? b0.f.d(i2) : b0.f.d(this.f6386u.b()), !L0(this.f6386u.b()) ? b0.f.b(i2) : b0.f.b(this.f6386u.b()));
            i2 = (b0.f.d(i2) == 0.0f || b0.f.b(i2) == 0.0f) ? 0L : AbstractC1108W.j(i3, this.f6389x.a(i3, i2));
        }
        return O0.a.a(j3, C.K(j3, Math.round(b0.f.d(i2))), 0, C.J(j3, Math.round(b0.f.b(i2))), 0, 10);
    }

    @Override // t0.InterfaceC1264w
    public final int a(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        if (!K0()) {
            return interfaceC1093G.b0(i2);
        }
        long N02 = N0(C.c(i2, 0, 13));
        return Math.max(O0.a.i(N02), interfaceC1093G.b0(i2));
    }

    @Override // t0.InterfaceC1264w
    public final int b(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        if (!K0()) {
            return interfaceC1093G.b(i2);
        }
        long N02 = N0(C.c(i2, 0, 13));
        return Math.max(O0.a.i(N02), interfaceC1093G.b(i2));
    }

    @Override // t0.InterfaceC1264w
    public final int d(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        if (!K0()) {
            return interfaceC1093G.a0(i2);
        }
        long N02 = N0(C.c(0, i2, 7));
        return Math.max(O0.a.j(N02), interfaceC1093G.a0(i2));
    }

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        AbstractC1103Q a3 = interfaceC1093G.a(N0(j3));
        return interfaceC1096J.C(a3.f9834h, a3.f9835i, C0971w.f9166h, new C.h(a3, 4));
    }

    @Override // t0.InterfaceC1257o
    public final void g(C1238G c1238g) {
        long j3;
        float f3;
        float f4;
        long b3 = this.f6386u.b();
        long i2 = C.i(M0(b3) ? b0.f.d(b3) : b0.f.d(c1238g.f10415h.e()), L0(b3) ? b0.f.b(b3) : b0.f.b(c1238g.f10415h.e()));
        try {
            if (b0.f.d(c1238g.f10415h.e()) != 0.0f) {
                C0652b c0652b = c1238g.f10415h;
                if (b0.f.b(c0652b.e()) != 0.0f) {
                    j3 = AbstractC1108W.j(i2, this.f6389x.a(i2, c0652b.e()));
                    long j4 = j3;
                    V.c cVar = this.f6388w;
                    long e3 = l0.c.e(Math.round(b0.f.d(j4)), Math.round(b0.f.b(j4)));
                    C0652b c0652b2 = c1238g.f10415h;
                    long a3 = cVar.a(e3, l0.c.e(Math.round(b0.f.d(c0652b2.e())), Math.round(b0.f.b(c0652b2.e()))), c1238g.getLayoutDirection());
                    f3 = (int) (a3 >> 32);
                    f4 = (int) (a3 & 4294967295L);
                    ((F) c1238g.f10415h.f7552i.f4558a).H(f3, f4);
                    this.f6386u.a(c1238g, j4, this.f6390y, this.f6391z);
                    ((F) c1238g.f10415h.f7552i.f4558a).H(-f3, -f4);
                    c1238g.a();
                    return;
                }
            }
            this.f6386u.a(c1238g, j4, this.f6390y, this.f6391z);
            ((F) c1238g.f10415h.f7552i.f4558a).H(-f3, -f4);
            c1238g.a();
            return;
        } catch (Throwable th) {
            ((F) c1238g.f10415h.f7552i.f4558a).H(-f3, -f4);
            throw th;
        }
        j3 = 0;
        long j42 = j3;
        V.c cVar2 = this.f6388w;
        long e32 = l0.c.e(Math.round(b0.f.d(j42)), Math.round(b0.f.b(j42)));
        C0652b c0652b22 = c1238g.f10415h;
        long a32 = cVar2.a(e32, l0.c.e(Math.round(b0.f.d(c0652b22.e())), Math.round(b0.f.b(c0652b22.e()))), c1238g.getLayoutDirection());
        f3 = (int) (a32 >> 32);
        f4 = (int) (a32 & 4294967295L);
        ((F) c1238g.f10415h.f7552i.f4558a).H(f3, f4);
    }

    @Override // t0.InterfaceC1264w
    public final int h(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        if (!K0()) {
            return interfaceC1093G.L(i2);
        }
        long N02 = N0(C.c(0, i2, 7));
        return Math.max(O0.a.j(N02), interfaceC1093G.L(i2));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f6386u + ", sizeToIntrinsics=" + this.f6387v + ", alignment=" + this.f6388w + ", alpha=" + this.f6390y + ", colorFilter=" + this.f6391z + ')';
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
