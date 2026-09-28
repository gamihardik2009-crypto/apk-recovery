package l;

import c0.C0580U;
import m.i0;
import m.j0;
import m.p0;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0789D extends K {

    /* renamed from: A, reason: collision with root package name */
    public y2.a f8117A;

    /* renamed from: B, reason: collision with root package name */
    public w f8118B;

    /* renamed from: C, reason: collision with root package name */
    public long f8119C = androidx.compose.animation.b.f6543a;

    /* renamed from: D, reason: collision with root package name */
    public V.c f8120D;
    public final C0788C E;
    public final C0788C F;

    /* renamed from: u, reason: collision with root package name */
    public p0 f8121u;

    /* renamed from: v, reason: collision with root package name */
    public j0 f8122v;

    /* renamed from: w, reason: collision with root package name */
    public j0 f8123w;

    /* renamed from: x, reason: collision with root package name */
    public j0 f8124x;

    /* renamed from: y, reason: collision with root package name */
    public C0790E f8125y;

    /* renamed from: z, reason: collision with root package name */
    public C0791F f8126z;

    public C0789D(p0 p0Var, j0 j0Var, j0 j0Var2, j0 j0Var3, C0790E c0790e, C0791F c0791f, y2.a aVar, w wVar) {
        this.f8121u = p0Var;
        this.f8122v = j0Var;
        this.f8123w = j0Var2;
        this.f8124x = j0Var3;
        this.f8125y = c0790e;
        this.f8126z = c0791f;
        this.f8117A = aVar;
        this.f8118B = wVar;
        B1.C.c(0, 0, 15);
        this.E = new C0788C(this, 0);
        this.F = new C0788C(this, 1);
    }

    @Override // V.n
    public final void C0() {
        this.f8119C = androidx.compose.animation.b.f6543a;
    }

    public final V.c K0() {
        V.c cVar;
        if (this.f8121u.f().a(EnumC0812v.f8246h, EnumC0812v.f8247i)) {
            C0810t c0810t = this.f8125y.f8128a.f8169c;
            if (c0810t == null || (cVar = c0810t.f8238a) == null) {
                C0810t c0810t2 = this.f8126z.f8131a.f8169c;
                if (c0810t2 != null) {
                    return c0810t2.f8238a;
                }
                return null;
            }
        } else {
            C0810t c0810t3 = this.f8126z.f8131a.f8169c;
            if (c0810t3 == null || (cVar = c0810t3.f8238a) == null) {
                C0810t c0810t4 = this.f8125y.f8128a.f8169c;
                if (c0810t4 != null) {
                    return c0810t4.f8238a;
                }
                return null;
            }
        }
        return cVar;
    }

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        C0580U c0580u;
        if (this.f8121u.f8547a.g() == this.f8121u.f8550d.getValue()) {
            this.f8120D = null;
        } else if (this.f8120D == null) {
            V.c K02 = K0();
            if (K02 == null) {
                K02 = V.b.f5831h;
            }
            this.f8120D = K02;
        }
        boolean F = interfaceC1096J.F();
        C0971w c0971w = C0971w.f9166h;
        if (F) {
            AbstractC1103Q a3 = interfaceC1093G.a(j3);
            long e3 = l0.c.e(a3.f9834h, a3.f9835i);
            this.f8119C = e3;
            return interfaceC1096J.C((int) (e3 >> 32), (int) (4294967295L & e3), c0971w, new C.h(a3, 6));
        }
        if (!((Boolean) this.f8117A.c()).booleanValue()) {
            AbstractC1103Q a4 = interfaceC1093G.a(j3);
            return interfaceC1096J.C(a4.f9834h, a4.f9835i, c0971w, new C.h(a4, 7));
        }
        w wVar = this.f8118B;
        j0 j0Var = wVar.f8250a;
        C0790E c0790e = wVar.f8253d;
        C0791F c0791f = wVar.f8254e;
        i0 a5 = j0Var != null ? j0Var.a(new x(c0790e, c0791f, 0), new x(c0790e, c0791f, 1)) : null;
        j0 j0Var2 = wVar.f8251b;
        i0 a6 = j0Var2 != null ? j0Var2.a(new x(c0790e, c0791f, 2), new x(c0790e, c0791f, 3)) : null;
        if (wVar.f8252c.f8547a.g() == EnumC0812v.f8246h) {
            L l3 = c0790e.f8128a.f8170d;
            if (l3 != null) {
                c0580u = new C0580U(l3.f8141b);
            } else {
                L l4 = c0791f.f8131a.f8170d;
                if (l4 != null) {
                    c0580u = new C0580U(l4.f8141b);
                }
                c0580u = null;
            }
        } else {
            L l5 = c0791f.f8131a.f8170d;
            if (l5 != null) {
                c0580u = new C0580U(l5.f8141b);
            } else {
                L l6 = c0790e.f8128a.f8170d;
                if (l6 != null) {
                    c0580u = new C0580U(l6.f8141b);
                }
                c0580u = null;
            }
        }
        j0 j0Var3 = wVar.f8255f;
        L2.d dVar = new L2.d(a5, a6, j0Var3 != null ? j0Var3.a(C0794c.f8184s, new L2.d(c0580u, c0790e, c0791f, 8)) : null, 7);
        AbstractC1103Q a7 = interfaceC1093G.a(j3);
        long e4 = l0.c.e(a7.f9834h, a7.f9835i);
        long j4 = O0.j.a(this.f8119C, androidx.compose.animation.b.f6543a) ^ true ? this.f8119C : e4;
        j0 j0Var4 = this.f8122v;
        i0 a8 = j0Var4 != null ? j0Var4.a(this.E, new C0787B(this, j4, 0)) : null;
        if (a8 != null) {
            e4 = ((O0.j) a8.getValue()).f5147a;
        }
        long H3 = B1.C.H(j3, e4);
        j0 j0Var5 = this.f8123w;
        long j5 = j0Var5 != null ? ((O0.h) j0Var5.a(C0794c.f8191z, new C0787B(this, j4, 1)).getValue()).f5141a : 0L;
        j0 j0Var6 = this.f8124x;
        long j6 = j0Var6 != null ? ((O0.h) j0Var6.a(this.F, new C0787B(this, j4, 2)).getValue()).f5141a : 0L;
        V.c cVar = this.f8120D;
        return interfaceC1096J.C((int) (H3 >> 32), (int) (4294967295L & H3), c0971w, new C0786A(a7, O0.h.c(cVar != null ? cVar.a(j4, H3, O0.k.f5148h) : 0L, j6), j5, dVar, 0));
    }
}
