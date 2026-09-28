package Y1;

import D.O;
import H.AbstractC0107g0;
import H.C0093e0;
import H.Z3;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.W0;
import J.X0;
import J2.InterfaceC0328z;
import androidx.compose.foundation.layout.FillElement;
import c0.C0564D;
import c0.C0603v;
import java.util.List;
import m2.C0880v;
import n2.AbstractC0949a;
import n2.AbstractC0963o;
import r0.InterfaceC1094H;
import s.AbstractC1173l;
import s.AbstractC1177p;
import s.C1165d;
import s.C1170i;
import s.InterfaceC1159L;
import t.C1213h;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class n implements y2.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f6325h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n1.y f6326i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W0 f6327j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f6328k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f6329l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W0 f6330m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z3 f6331n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W0 f6332o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f6333p;
    public final /* synthetic */ W0 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6334r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W0 f6335s;

    public n(String str, n1.y yVar, InterfaceC0258c0 interfaceC0258c0, InterfaceC0328z interfaceC0328z, H h2, InterfaceC0258c0 interfaceC0258c02, Z3 z3, InterfaceC0258c0 interfaceC0258c03, float f3, InterfaceC0258c0 interfaceC0258c04, InterfaceC0258c0 interfaceC0258c05, InterfaceC0258c0 interfaceC0258c06) {
        this.f6325h = str;
        this.f6326i = yVar;
        this.f6327j = interfaceC0258c0;
        this.f6328k = interfaceC0328z;
        this.f6329l = h2;
        this.f6330m = interfaceC0258c02;
        this.f6331n = z3;
        this.f6332o = interfaceC0258c03;
        this.f6333p = f3;
        this.q = interfaceC0258c04;
        this.f6334r = interfaceC0258c05;
        this.f6335s = interfaceC0258c06;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        InterfaceC1159L interfaceC1159L = (InterfaceC1159L) obj;
        C0285q c0285q = (C0285q) obj2;
        int intValue = ((Number) obj3).intValue();
        z2.h.f(interfaceC1159L, "paddingValues");
        if ((intValue & 14) == 0) {
            intValue |= c0285q.g(interfaceC1159L) ? 4 : 2;
        }
        if ((intValue & 91) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f6640b;
            InterfaceC1094H e3 = AbstractC1177p.e(V.b.f5831h, false);
            int i2 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            V.o d3 = V.a.d(c0285q, fillElement);
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
            C0257c.V(c0285q, e3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
                B1.t.q(i2, c0285q, i2, c1250h);
            }
            C0257c.V(c0285q, d3, C1252j.f10600d);
            V.o b3 = androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.f6639a, 260);
            X0 x02 = AbstractC0107g0.f2597a;
            AbstractC1177p.a(androidx.compose.foundation.a.a(b3, new C0564D(AbstractC0963o.v(new C0603v(C0603v.b(0.15f, ((C0093e0) c0285q.l(x02)).f2483a)), new C0603v(((C0093e0) c0285q.l(x02)).f2496n)), null, K1.f.e(0.0f, 0.0f), K1.f.e(0.0f, Float.POSITIVE_INFINITY), 0)), c0285q, 0);
            V.o h2 = androidx.compose.foundation.layout.a.h(fillElement, interfaceC1159L);
            float f3 = 20;
            V.o k3 = androidx.compose.foundation.layout.a.k(h2, f3, 0.0f, 2);
            C1165d c1165d = AbstractC1173l.f10149a;
            C1170i c1170i = new C1170i(f3);
            final float f4 = this.f6333p;
            final W0 w02 = this.q;
            final String str = this.f6325h;
            final n1.y yVar = this.f6326i;
            final W0 w03 = this.f6327j;
            final InterfaceC0328z interfaceC0328z = this.f6328k;
            final H h3 = this.f6329l;
            final W0 w04 = this.f6330m;
            final Z3 z3 = this.f6331n;
            final W0 w05 = this.f6332o;
            final InterfaceC0258c0 interfaceC0258c0 = this.f6334r;
            final W0 w06 = this.f6335s;
            AbstractC0949a.a(k3, null, null, false, c1170i, null, null, false, new y2.c() { // from class: Y1.f
                @Override // y2.c
                public final Object l(Object obj4) {
                    C1213h c1213h = (C1213h) obj4;
                    n1.y yVar2 = yVar;
                    z2.h.f(yVar2, "$navController");
                    W0 w07 = w03;
                    z2.h.f(w07, "$settings$delegate");
                    InterfaceC0328z interfaceC0328z2 = interfaceC0328z;
                    z2.h.f(interfaceC0328z2, "$scope");
                    H h4 = h3;
                    z2.h.f(h4, "$viewModel");
                    W0 w08 = w04;
                    z2.h.f(w08, "$clientCount$delegate");
                    Z3 z32 = z3;
                    z2.h.f(z32, "$snackbarHostState");
                    W0 w09 = w05;
                    z2.h.f(w09, "$templateCount$delegate");
                    W0 w010 = w02;
                    z2.h.f(w010, "$homeStats$delegate");
                    InterfaceC0258c0 interfaceC0258c02 = interfaceC0258c0;
                    z2.h.f(interfaceC0258c02, "$showRetryDialog$delegate");
                    W0 w011 = w06;
                    z2.h.f(w011, "$recentSchedules$delegate");
                    z2.h.f(c1213h, "$this$LazyColumn");
                    C1213h.q(c1213h, new R.a(431867171, new P1.m(str, yVar2), true));
                    R1.a aVar = (R1.a) w07.getValue();
                    if (aVar != null && aVar.f5473h) {
                        C1213h.q(c1213h, AbstractC0417c.f6283c);
                    }
                    C1213h.q(c1213h, new R.a(-779505268, new k(w07, interfaceC0328z2, h4, w08, z32, w09), true));
                    R1.a aVar2 = (R1.a) w07.getValue();
                    if (aVar2 != null && aVar2.f5472g) {
                        C1213h.q(c1213h, new R.a(-1863051247, new l(f4, 0), true));
                    }
                    C1213h.q(c1213h, new R.a(558986987, new P1.m(w08, 2, w010), true));
                    C1213h.q(c1213h, new R.a(1897479242, new P1.m(w010, 3, interfaceC0258c02), true));
                    C1213h.q(c1213h, AbstractC0417c.f6284d);
                    if (((List) w011.getValue()).isEmpty()) {
                        C1213h.q(c1213h, AbstractC0417c.f6285e);
                    }
                    List list = (List) w011.getValue();
                    c1213h.r(list.size(), new W1.w(new P1.a(3), list, 2), new O(6, list), new R.a(-632812321, new m(0, list), true));
                    C1213h.q(c1213h, AbstractC0417c.f6286f);
                    return C0880v.f8657a;
                }
            }, c0285q, 24576, 238);
            c0285q.r(true);
        }
        return C0880v.f8657a;
    }
}
