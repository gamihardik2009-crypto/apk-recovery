package s;

import H.v5;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import java.util.HashMap;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* renamed from: s.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1177p {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f10165a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f10166b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final r f10167c = new r(V.b.f5831h, false);

    /* renamed from: d, reason: collision with root package name */
    public static final C1176o f10168d = C1176o.f10162b;

    public static final void a(V.o oVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(-211209833);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            int i4 = c0285q.f4194P;
            V.o d3 = V.a.d(c0285q, oVar);
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            if (!(c0285q.f4195a instanceof InterfaceC0259d)) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, f10168d, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C0257c.V(c0285q, d3, C1252j.f10600d);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                B1.t.q(i4, c0285q, i4, c1250h);
            }
            c0285q.r(true);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new v5(oVar, i2, 1);
        }
    }

    public static final void b(AbstractC1102P abstractC1102P, AbstractC1103Q abstractC1103Q, InterfaceC1093G interfaceC1093G, O0.k kVar, int i2, int i3, V.c cVar) {
        V.c cVar2;
        Object p3 = interfaceC1093G.p();
        C1174m c1174m = p3 instanceof C1174m ? (C1174m) p3 : null;
        AbstractC1102P.e(abstractC1102P, abstractC1103Q, ((c1174m == null || (cVar2 = c1174m.f10156u) == null) ? cVar : cVar2).a(l0.c.e(abstractC1103Q.f9834h, abstractC1103Q.f9835i), l0.c.e(i2, i3), kVar));
    }

    public static final HashMap c(boolean z3) {
        HashMap hashMap = new HashMap(9);
        d(hashMap, z3, V.b.f5831h);
        d(hashMap, z3, V.b.f5832i);
        d(hashMap, z3, V.b.f5833j);
        d(hashMap, z3, V.b.f5834k);
        d(hashMap, z3, V.b.f5835l);
        d(hashMap, z3, V.b.f5836m);
        d(hashMap, z3, V.b.f5837n);
        d(hashMap, z3, V.b.f5838o);
        d(hashMap, z3, V.b.f5839p);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean z3, V.g gVar) {
        hashMap.put(gVar, new r(gVar, z3));
    }

    public static final InterfaceC1094H e(V.g gVar, boolean z3) {
        InterfaceC1094H interfaceC1094H = (InterfaceC1094H) (z3 ? f10165a : f10166b).get(gVar);
        return interfaceC1094H == null ? new r(gVar, z3) : interfaceC1094H;
    }

    public static final r f(V.g gVar, boolean z3, C0285q c0285q, int i2) {
        if (z2.h.a(gVar, V.b.f5831h) && !z3) {
            c0285q.U(-1710139705);
            c0285q.r(false);
            return f10167c;
        }
        c0285q.U(-1710100211);
        boolean z4 = true;
        boolean z5 = (((i2 & 14) ^ 6) > 4 && c0285q.g(gVar)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !c0285q.h(z3)) && (i2 & 48) != 32) {
            z4 = false;
        }
        boolean z6 = z5 | z4;
        Object K3 = c0285q.K();
        if (z6 || K3 == C0275l.f4150a) {
            K3 = new r(gVar, z3);
            c0285q.e0(K3);
        }
        r rVar = (r) K3;
        c0285q.r(false);
        return rVar;
    }
}
