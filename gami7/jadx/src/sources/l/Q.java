package l;

import J.C0257c;
import J.C0274k0;
import J.W;
import m.C0829d;
import m.InterfaceC0817A;
import m.InterfaceC0840m;
import m.y0;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;

/* loaded from: classes.dex */
public final class Q extends K {

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0840m f8156u;

    /* renamed from: v, reason: collision with root package name */
    public V.c f8157v;

    /* renamed from: w, reason: collision with root package name */
    public y2.e f8158w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8161z;

    /* renamed from: x, reason: collision with root package name */
    public long f8159x = androidx.compose.animation.b.f6543a;

    /* renamed from: y, reason: collision with root package name */
    public long f8160y = B1.C.c(0, 0, 15);

    /* renamed from: A, reason: collision with root package name */
    public final C0274k0 f8155A = C0257c.N(null, W.f4109m);

    public Q(InterfaceC0817A interfaceC0817A, V.c cVar, y2.e eVar) {
        this.f8156u = interfaceC0817A;
        this.f8157v = cVar;
        this.f8158w = eVar;
    }

    @Override // V.n
    public final void C0() {
        this.f8159x = androidx.compose.animation.b.f6543a;
        this.f8161z = false;
    }

    @Override // V.n
    public final void E0() {
        this.f8155A.setValue(null);
    }

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        InterfaceC1093G interfaceC1093G2;
        long j4;
        AbstractC1103Q a3;
        long H3;
        if (interfaceC1096J.F()) {
            this.f8160y = j3;
            this.f8161z = true;
            a3 = interfaceC1093G.a(j3);
        } else {
            if (this.f8161z) {
                j4 = this.f8160y;
                interfaceC1093G2 = interfaceC1093G;
            } else {
                interfaceC1093G2 = interfaceC1093G;
                j4 = j3;
            }
            a3 = interfaceC1093G2.a(j4);
        }
        AbstractC1103Q abstractC1103Q = a3;
        long e3 = l0.c.e(abstractC1103Q.f9834h, abstractC1103Q.f9835i);
        if (interfaceC1096J.F()) {
            this.f8159x = e3;
            H3 = e3;
        } else {
            long j5 = O0.j.a(this.f8159x, androidx.compose.animation.b.f6543a) ^ true ? this.f8159x : e3;
            C0274k0 c0274k0 = this.f8155A;
            N n3 = (N) c0274k0.getValue();
            if (n3 != null) {
                C0829d c0829d = n3.f8143a;
                boolean z3 = (O0.j.a(j5, ((O0.j) c0829d.d()).f5147a) || ((Boolean) c0829d.f8425d.getValue()).booleanValue()) ? false : true;
                if (!O0.j.a(j5, ((O0.j) c0829d.f8426e.getValue()).f5147a) || z3) {
                    n3.f8144b = ((O0.j) c0829d.d()).f5147a;
                    J2.B.r(y0(), null, 0, new O(n3, j5, this, null), 3);
                }
            } else {
                n3 = new N(new C0829d(new O0.j(j5), y0.f8609h, new O0.j(l0.c.e(1, 1)), 8), j5);
            }
            c0274k0.setValue(n3);
            H3 = B1.C.H(j3, ((O0.j) n3.f8143a.d()).f5147a);
        }
        int i2 = (int) (H3 >> 32);
        int i3 = (int) (H3 & 4294967295L);
        return interfaceC1096J.C(i2, i3, C0971w.f9166h, new P(this, e3, i2, i3, interfaceC1096J, abstractC1103Q));
    }
}
