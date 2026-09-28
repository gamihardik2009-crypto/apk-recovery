package H;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import java.time.Instant;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1177p;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* renamed from: H.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066a1 extends z2.i implements y2.g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I f2275i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ K f2276j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.c f2277k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f2278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f2279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J0 f2280n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0180q3 f2281o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B0 f2282p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0066a1(I i2, K k3, y2.c cVar, H h2, Long l3, J0 j02, InterfaceC0180q3 interfaceC0180q3, B0 b02) {
        super(4);
        this.f2275i = i2;
        this.f2276j = k3;
        this.f2277k = cVar;
        this.f2278l = h2;
        this.f2279m = l3;
        this.f2280n = j02;
        this.f2281o = interfaceC0180q3;
        this.f2282p = b02;
    }

    @Override // y2.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        androidx.compose.foundation.lazy.a aVar = (androidx.compose.foundation.lazy.a) obj;
        int intValue = ((Number) obj2).intValue();
        C0285q c0285q = (C0285q) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i2 = (c0285q.g(aVar) ? 4 : 2) | intValue2;
        } else {
            i2 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i2 |= c0285q.e(intValue) ? 32 : 16;
        }
        if ((i2 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            J j3 = (J) this.f2275i;
            j3.getClass();
            K k3 = this.f2276j;
            if (intValue > 0) {
                k3 = j3.d(Instant.ofEpochMilli(k3.f1657e).atZone(J.f1611d).toLocalDate().plusMonths(intValue));
            }
            V.o a3 = androidx.compose.foundation.lazy.a.a(aVar);
            c0285q.V(733328855);
            s.r f3 = AbstractC1177p.f(V.b.f5831h, false, c0285q, 0);
            c0285q.V(-1323940314);
            int i3 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i4 = AbstractC1108W.i(a3);
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
            C0257c.V(c0285q, f3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i3))) {
                B1.t.q(i3, c0285q, i3, c1250h);
            }
            B1.t.r(0, i4, new J.C0(c0285q), c0285q, 2058660585);
            A1.g(k3, this.f2277k, this.f2278l.f1547k, this.f2279m, null, this.f2280n, this.f2281o, this.f2282p, c0285q, 221184);
            B1.t.u(c0285q, false, true, false, false);
        }
        return C0880v.f8657a;
    }
}
