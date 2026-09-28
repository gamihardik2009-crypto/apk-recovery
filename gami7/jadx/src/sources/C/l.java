package C;

import A0.t;
import A0.w;
import A0.x;
import B.y;
import B1.C;
import C0.C0019b;
import C0.C0024g;
import C0.K;
import C0.s;
import D0.D;
import V.n;
import c0.AbstractC0598q;
import c0.C0575O;
import c0.C0603v;
import c0.InterfaceC0600s;
import e0.AbstractC0655e;
import java.util.LinkedHashMap;
import java.util.Map;
import r0.AbstractC1103Q;
import r0.AbstractC1114c;
import r0.C1125n;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1126o;
import t0.AbstractC1248f;
import t0.C1238G;
import t0.InterfaceC1257o;
import t0.InterfaceC1264w;
import t0.m0;
import z.N;

/* loaded from: classes.dex */
public final class l extends n implements InterfaceC1264w, InterfaceC1257o, m0 {

    /* renamed from: A, reason: collision with root package name */
    public int f394A;

    /* renamed from: B, reason: collision with root package name */
    public Map f395B;

    /* renamed from: C, reason: collision with root package name */
    public e f396C;

    /* renamed from: D, reason: collision with root package name */
    public k f397D;
    public j E;

    /* renamed from: u, reason: collision with root package name */
    public String f398u;

    /* renamed from: v, reason: collision with root package name */
    public K f399v;

    /* renamed from: w, reason: collision with root package name */
    public H0.d f400w;

    /* renamed from: x, reason: collision with root package name */
    public int f401x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f402y;

    /* renamed from: z, reason: collision with root package name */
    public int f403z;

    public final e K0() {
        if (this.f396C == null) {
            this.f396C = new e(this.f398u, this.f399v, this.f400w, this.f401x, this.f402y, this.f403z, this.f394A);
        }
        e eVar = this.f396C;
        z2.h.c(eVar);
        return eVar;
    }

    public final e L0(O0.b bVar) {
        e eVar;
        j jVar = this.E;
        if (jVar != null && jVar.f390c && (eVar = jVar.f391d) != null) {
            eVar.c(bVar);
            return eVar;
        }
        e K02 = K0();
        K02.c(bVar);
        return K02;
    }

    @Override // t0.InterfaceC1264w
    public final int a(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return L0(interfaceC1126o).a(i2, interfaceC1126o.getLayoutDirection());
    }

    @Override // t0.InterfaceC1264w
    public final int b(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return L0(interfaceC1126o).a(i2, interfaceC1126o.getLayoutDirection());
    }

    @Override // t0.InterfaceC1264w
    public final int d(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return N.l(L0(interfaceC1126o).d(interfaceC1126o.getLayoutDirection()).c());
    }

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        long j4;
        boolean z3;
        s sVar;
        e L02 = L0(interfaceC1096J);
        O0.k layoutDirection = interfaceC1096J.getLayoutDirection();
        if (L02.f356g > 1) {
            b bVar = L02.f362m;
            K k3 = L02.f351b;
            O0.b bVar2 = L02.f358i;
            z2.h.c(bVar2);
            b u3 = K1.f.u(bVar, layoutDirection, k3, bVar2, L02.f352c);
            L02.f362m = u3;
            j4 = u3.a(j3, L02.f356g);
        } else {
            j4 = j3;
        }
        C0019b c0019b = L02.f359j;
        if (c0019b == null || (sVar = L02.f363n) == null || sVar.b() || layoutDirection != L02.f364o || (!O0.a.b(j4, L02.f365p) && (O0.a.h(j4) != O0.a.h(L02.f365p) || O0.a.g(j4) < c0019b.b() || c0019b.f485d.f947d))) {
            C0019b b3 = L02.b(j4, layoutDirection);
            L02.f365p = j4;
            long H3 = C.H(j4, l0.c.e(N.l(b3.d()), N.l(b3.b())));
            L02.f361l = H3;
            L02.f360k = !K1.f.t(L02.f353d, 3) && (((float) ((int) (H3 >> 32))) < b3.d() || ((float) ((int) (H3 & 4294967295L))) < b3.b());
            L02.f359j = b3;
            z3 = true;
        } else {
            if (!O0.a.b(j4, L02.f365p)) {
                C0019b c0019b2 = L02.f359j;
                z2.h.c(c0019b2);
                long H4 = C.H(j4, l0.c.e(N.l(Math.min(c0019b2.f482a.f4510i.b(), c0019b2.d())), N.l(c0019b2.b())));
                L02.f361l = H4;
                L02.f360k = !K1.f.t(L02.f353d, 3) && (((float) ((int) (H4 >> 32))) < c0019b2.d() || ((float) ((int) (H4 & 4294967295L))) < c0019b2.b());
                L02.f365p = j4;
            }
            z3 = false;
        }
        s sVar2 = L02.f363n;
        if (sVar2 != null) {
            sVar2.b();
        }
        C0019b c0019b3 = L02.f359j;
        z2.h.c(c0019b3);
        long j5 = L02.f361l;
        if (z3) {
            AbstractC1248f.t(this, 2).Z0();
            Map map = this.f395B;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            C1125n c1125n = AbstractC1114c.f9858a;
            D d3 = c0019b3.f485d;
            map.put(c1125n, Integer.valueOf(Math.round(d3.d(0))));
            map.put(AbstractC1114c.f9859b, Integer.valueOf(Math.round(d3.d(d3.f950g - 1))));
            this.f395B = map;
        }
        int i2 = (int) (j5 >> 32);
        int i3 = (int) (j5 & 4294967295L);
        int min = Math.min(i2, 262142);
        int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int m3 = C.m(min2 == Integer.MAX_VALUE ? min : min2);
        AbstractC1103Q a3 = interfaceC1093G.a(C.b(min, min2, Math.min(m3, i3), i3 != Integer.MAX_VALUE ? Math.min(m3, i3) : Integer.MAX_VALUE));
        Map map2 = this.f395B;
        z2.h.c(map2);
        return interfaceC1096J.C(i2, i3, map2, new h(a3, 1));
    }

    @Override // t0.InterfaceC1257o
    public final void g(C1238G c1238g) {
        if (this.f5869t) {
            e L02 = L0(c1238g);
            C0019b c0019b = L02.f359j;
            if (c0019b == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f396C + ", textSubstitution=" + this.E + ')').toString());
            }
            InterfaceC0600s e3 = c1238g.f10415h.f7552i.e();
            boolean z3 = L02.f360k;
            if (z3) {
                long j3 = L02.f361l;
                e3.f();
                e3.p(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L), 1);
            }
            try {
                C0.C c3 = this.f399v.f475a;
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
                if (c4 != null) {
                    c0019b.g(e3, c4, this.f399v.f475a.f427a.a(), c0575o2, jVar2, abstractC0655e2, 3);
                } else {
                    long j4 = C0603v.f7277g;
                    if (j4 == 16) {
                        j4 = this.f399v.b() != 16 ? this.f399v.b() : C0603v.f7272b;
                    }
                    c0019b.f(e3, j4, c0575o2, jVar2, abstractC0655e2, 3);
                }
                if (z3) {
                    e3.b();
                }
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
        return N.l(L0(interfaceC1126o).d(interfaceC1126o.getLayoutDirection()).a());
    }

    @Override // t0.m0
    public final void k(A0.k kVar) {
        k kVar2 = this.f397D;
        if (kVar2 == null) {
            kVar2 = new k(this, 0);
            this.f397D = kVar2;
        }
        w.g(kVar, new C0024g(this.f398u, null, 6));
        j jVar = this.E;
        if (jVar != null) {
            boolean z3 = jVar.f390c;
            x xVar = t.f116w;
            F2.d[] dVarArr = w.f123a;
            F2.d dVar = dVarArr[15];
            Boolean valueOf = Boolean.valueOf(z3);
            xVar.getClass();
            kVar.e(xVar, valueOf);
            C0024g c0024g = new C0024g(jVar.f389b, null, 6);
            x xVar2 = t.f115v;
            F2.d dVar2 = dVarArr[14];
            xVar2.getClass();
            kVar.e(xVar2, c0024g);
        }
        kVar.e(A0.j.f44j, new A0.a(null, new k(this, 1)));
        kVar.e(A0.j.f45k, new A0.a(null, new k(this, 2)));
        kVar.e(A0.j.f46l, new A0.a(null, new y(3, this)));
        w.c(kVar, kVar2);
    }
}
