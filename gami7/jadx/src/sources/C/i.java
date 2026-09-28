package C;

import A0.t;
import A0.w;
import A0.x;
import B.y;
import B1.C;
import C0.AbstractC0025h;
import C0.AbstractC0030m;
import C0.C0022e;
import C0.C0024g;
import C0.H;
import C0.K;
import C0.o;
import V.n;
import a.AbstractC0423a;
import c0.AbstractC0598q;
import c0.C0575O;
import c0.C0603v;
import c0.InterfaceC0600s;
import e0.AbstractC0655e;
import java.util.List;
import java.util.Map;
import n2.C0970v;
import r0.InterfaceC1093G;
import r0.InterfaceC1126o;
import t0.AbstractC1248f;
import t0.C1238G;
import t0.InterfaceC1257o;
import t0.InterfaceC1264w;
import t0.m0;
import z.N;

/* loaded from: classes.dex */
public final class i extends n implements InterfaceC1264w, InterfaceC1257o, m0 {

    /* renamed from: A, reason: collision with root package name */
    public int f375A;

    /* renamed from: B, reason: collision with root package name */
    public int f376B;

    /* renamed from: C, reason: collision with root package name */
    public List f377C;

    /* renamed from: D, reason: collision with root package name */
    public y2.c f378D;
    public y2.c E;
    public Map F;

    /* renamed from: G, reason: collision with root package name */
    public d f379G;

    /* renamed from: H, reason: collision with root package name */
    public g f380H;

    /* renamed from: I, reason: collision with root package name */
    public f f381I;

    /* renamed from: u, reason: collision with root package name */
    public C0024g f382u;

    /* renamed from: v, reason: collision with root package name */
    public K f383v;

    /* renamed from: w, reason: collision with root package name */
    public H0.d f384w;

    /* renamed from: x, reason: collision with root package name */
    public y2.c f385x;

    /* renamed from: y, reason: collision with root package name */
    public int f386y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f387z;

    public final void K0(boolean z3, boolean z4, boolean z5, boolean z6) {
        if (z4 || z5 || z6) {
            d L02 = L0();
            C0024g c0024g = this.f382u;
            K k3 = this.f383v;
            H0.d dVar = this.f384w;
            int i2 = this.f386y;
            boolean z7 = this.f387z;
            int i3 = this.f375A;
            int i4 = this.f376B;
            List list = this.f377C;
            L02.f334a = c0024g;
            L02.f335b = k3;
            L02.f336c = dVar;
            L02.f337d = i2;
            L02.f338e = z7;
            L02.f339f = i3;
            L02.f340g = i4;
            L02.f341h = list;
            L02.f345l = null;
            L02.f347n = null;
            L02.f349p = -1;
            L02.f348o = -1;
        }
        if (this.f5869t) {
            if (z4 || (z3 && this.f380H != null)) {
                AbstractC1248f.p(this);
            }
            if (z4 || z5 || z6) {
                AbstractC1248f.o(this);
                AbstractC1248f.n(this);
            }
            if (z3) {
                AbstractC1248f.n(this);
            }
        }
    }

    public final d L0() {
        if (this.f379G == null) {
            this.f379G = new d(this.f382u, this.f383v, this.f384w, this.f386y, this.f387z, this.f375A, this.f376B, this.f377C);
        }
        d dVar = this.f379G;
        z2.h.c(dVar);
        return dVar;
    }

    public final d M0(O0.b bVar) {
        d dVar;
        f fVar = this.f381I;
        if (fVar != null && fVar.f369c && (dVar = fVar.f370d) != null) {
            dVar.c(bVar);
            return dVar;
        }
        d L02 = L0();
        L02.c(bVar);
        return L02;
    }

    public final boolean N0(y2.c cVar, y2.c cVar2, y2.c cVar3) {
        boolean z3;
        if (this.f385x != cVar) {
            this.f385x = cVar;
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f378D != cVar2) {
            this.f378D = cVar2;
            z3 = true;
        }
        if (!z2.h.a(null, null)) {
            z3 = true;
        }
        if (this.E == cVar3) {
            return z3;
        }
        this.E = cVar3;
        return true;
    }

    public final boolean O0(K k3, List list, int i2, int i3, boolean z3, H0.d dVar, int i4) {
        boolean z4 = !this.f383v.c(k3);
        this.f383v = k3;
        if (!z2.h.a(this.f377C, list)) {
            this.f377C = list;
            z4 = true;
        }
        if (this.f376B != i2) {
            this.f376B = i2;
            z4 = true;
        }
        if (this.f375A != i3) {
            this.f375A = i3;
            z4 = true;
        }
        if (this.f387z != z3) {
            this.f387z = z3;
            z4 = true;
        }
        if (!z2.h.a(this.f384w, dVar)) {
            this.f384w = dVar;
            z4 = true;
        }
        if (K1.f.t(this.f386y, i4)) {
            return z4;
        }
        this.f386y = i4;
        return true;
    }

    public final boolean P0(C0024g c0024g) {
        boolean z3 = true;
        boolean z4 = !z2.h.a(this.f382u.f500a, c0024g.f500a);
        boolean z5 = !z2.h.a(this.f382u.a(), c0024g.a());
        List list = this.f382u.f502c;
        List list2 = C0970v.f9165h;
        if (list == null) {
            list = list2;
        }
        List list3 = c0024g.f502c;
        if (list3 != null) {
            list2 = list3;
        }
        boolean z6 = !z2.h.a(list, list2);
        boolean z7 = !z2.h.a(this.f382u.f503d, c0024g.f503d);
        if (!z4 && !z5 && !z6 && !z7) {
            z3 = false;
        }
        if (z3) {
            this.f382u = c0024g;
        }
        if (z4) {
            this.f381I = null;
        }
        return z3;
    }

    @Override // t0.InterfaceC1264w
    public final int a(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return M0(interfaceC1126o).a(i2, interfaceC1126o.getLayoutDirection());
    }

    @Override // t0.m0
    public final boolean a0() {
        return true;
    }

    @Override // t0.InterfaceC1264w
    public final int b(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return M0(interfaceC1126o).a(i2, interfaceC1126o.getLayoutDirection());
    }

    @Override // t0.InterfaceC1264w
    public final int d(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return N.l(M0(interfaceC1126o).d(interfaceC1126o.getLayoutDirection()).c());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    @Override // t0.InterfaceC1264w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r0.InterfaceC1095I f(r0.InterfaceC1096J r8, r0.InterfaceC1093G r9, long r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C.i.f(r0.J, r0.G, long):r0.I");
    }

    @Override // t0.InterfaceC1257o
    public final void g(C1238G c1238g) {
        if (this.f5869t) {
            InterfaceC0600s e3 = c1238g.f10415h.f7552i.e();
            H h2 = M0(c1238g).f347n;
            if (h2 == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            long j3 = h2.f463c;
            float f3 = (int) (j3 >> 32);
            o oVar = h2.f462b;
            boolean z3 = ((f3 > oVar.f526d ? 1 : (f3 == oVar.f526d ? 0 : -1)) < 0 || oVar.f525c || (((float) ((int) (j3 & 4294967295L))) > oVar.f527e ? 1 : (((float) ((int) (j3 & 4294967295L))) == oVar.f527e ? 0 : -1)) < 0) && !K1.f.t(this.f386y, 3);
            if (z3) {
                b0.d n3 = AbstractC0423a.n(0L, C.i((int) (j3 >> 32), (int) (j3 & 4294967295L)));
                e3.f();
                InterfaceC0600s.c(e3, n3);
            }
            try {
                C0.C c3 = this.f383v.f475a;
                N0.j jVar = c3.f439m;
                if (jVar == null) {
                    jVar = N0.j.f4993b;
                }
                N0.j jVar2 = jVar;
                C0575O c0575o = c3.f440n;
                if (c0575o == null) {
                    c0575o = C0575O.f7219d;
                }
                C0575O c0575o2 = c0575o;
                AbstractC0655e abstractC0655e = c3.f442p;
                if (abstractC0655e == null) {
                    abstractC0655e = e0.g.f7556a;
                }
                AbstractC0655e abstractC0655e2 = abstractC0655e;
                AbstractC0598q c4 = c3.f427a.c();
                o oVar2 = h2.f462b;
                if (c4 != null) {
                    o.h(oVar2, e3, c4, this.f383v.f475a.f427a.a(), c0575o2, jVar2, abstractC0655e2);
                } else {
                    long j4 = C0603v.f7277g;
                    if (j4 == 16) {
                        j4 = this.f383v.b() != 16 ? this.f383v.b() : C0603v.f7272b;
                    }
                    o.g(oVar2, e3, j4, c0575o2, jVar2, abstractC0655e2);
                }
                if (z3) {
                    e3.b();
                }
                f fVar = this.f381I;
                if (fVar == null || !fVar.f369c) {
                    C0024g c0024g = this.f382u;
                    int length = c0024g.f500a.length();
                    List list = c0024g.f503d;
                    if (list != null) {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            C0022e c0022e = (C0022e) list.get(i2);
                            if ((c0022e.f496a instanceof AbstractC0030m) && AbstractC0025h.c(0, length, c0022e.f497b, c0022e.f498c)) {
                                break;
                            }
                        }
                    }
                }
                List list2 = this.f377C;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                c1238g.a();
            } catch (Throwable th) {
                if (z3) {
                    e3.b();
                }
                throw th;
            }
        }
    }

    @Override // t0.InterfaceC1264w
    public final int h(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return N.l(M0(interfaceC1126o).d(interfaceC1126o.getLayoutDirection()).a());
    }

    @Override // t0.m0
    public final void k(A0.k kVar) {
        g gVar = this.f380H;
        if (gVar == null) {
            gVar = new g(this, 0);
            this.f380H = gVar;
        }
        w.g(kVar, this.f382u);
        f fVar = this.f381I;
        if (fVar != null) {
            C0024g c0024g = fVar.f368b;
            x xVar = t.f115v;
            F2.d[] dVarArr = w.f123a;
            F2.d dVar = dVarArr[14];
            xVar.getClass();
            kVar.e(xVar, c0024g);
            boolean z3 = fVar.f369c;
            x xVar2 = t.f116w;
            F2.d dVar2 = dVarArr[15];
            Boolean valueOf = Boolean.valueOf(z3);
            xVar2.getClass();
            kVar.e(xVar2, valueOf);
        }
        kVar.e(A0.j.f44j, new A0.a(null, new g(this, 1)));
        kVar.e(A0.j.f45k, new A0.a(null, new g(this, 2)));
        kVar.e(A0.j.f46l, new A0.a(null, new y(2, this)));
        w.c(kVar, gVar);
    }
}
