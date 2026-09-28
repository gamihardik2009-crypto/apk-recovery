package c2;

import H.AbstractC0107g0;
import H.AbstractC0224y;
import H.C0093e0;
import H.N5;
import I.C;
import J.C0266g0;
import J.C0285q;
import J.InterfaceC0258c0;
import J.W0;
import J.X0;
import J2.InterfaceC0328z;
import Y1.H;
import c0.C0603v;
import java.time.format.DateTimeFormatter;
import m2.C0880v;
import n1.y;

/* loaded from: classes.dex */
public final class h implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f7358h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f7359i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DateTimeFormatter f7360j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f7361k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W0 f7362l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7363m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7364n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7365o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0266g0 f7366p;

    public h(y yVar, H h2, DateTimeFormatter dateTimeFormatter, InterfaceC0328z interfaceC0328z, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, InterfaceC0258c0 interfaceC0258c03, InterfaceC0258c0 interfaceC0258c04, C0266g0 c0266g0) {
        this.f7358h = yVar;
        this.f7359i = h2;
        this.f7360j = dateTimeFormatter;
        this.f7361k = interfaceC0328z;
        this.f7362l = interfaceC0258c0;
        this.f7363m = interfaceC0258c02;
        this.f7364n = interfaceC0258c03;
        this.f7365o = interfaceC0258c04;
        this.f7366p = c0266g0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        R.a aVar;
        R.a aVar2;
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            R.a aVar3 = AbstractC0626c.f7325g;
            R.a c3 = R.b.c(-477219680, new P1.k(this.f7358h, 1), c0285q);
            R.a c4 = R.b.c(260543511, new g(this.f7359i, this.f7360j, this.f7361k, this.f7362l, this.f7363m, this.f7364n, this.f7365o, this.f7366p, this.f7358h), c0285q);
            X0 x02 = AbstractC0107g0.f2597a;
            long j3 = ((C0093e0) c0285q.l(x02)).f2498p;
            long j4 = ((C0093e0) c0285q.l(x02)).q;
            c0285q.V(2142919275);
            long j5 = C0603v.f7277g;
            C0093e0 c0093e0 = (C0093e0) c0285q.l(x02);
            N5 n5 = c0093e0.f2472P;
            if (n5 == null) {
                float f3 = C.f3464a;
                aVar = c3;
                aVar2 = c4;
                n5 = new N5(AbstractC0107g0.c(c0093e0, 35), C0603v.c(AbstractC0107g0.c(c0093e0, 35), c0093e0.f2498p) ? AbstractC0107g0.f(c0093e0, C.f3468e) : AbstractC0107g0.c(c0093e0, 35), AbstractC0107g0.c(c0093e0, C.f3467d), AbstractC0107g0.c(c0093e0, C.f3465b), AbstractC0107g0.c(c0093e0, C.f3469f));
                c0093e0.f2472P = n5;
            } else {
                aVar = c3;
                aVar2 = c4;
            }
            if (j3 == j5) {
                j3 = n5.f1797a;
            }
            long j6 = j3;
            long j7 = j5 != j5 ? j5 : n5.f1798b;
            long j8 = j5 != j5 ? j5 : n5.f1799c;
            if (j4 == j5) {
                j4 = n5.f1800d;
            }
            long j9 = j4;
            if (j5 == j5) {
                j5 = n5.f1801e;
            }
            N5 n52 = new N5(j6, j7, j8, j9, j5);
            c0285q.r(false);
            AbstractC0224y.b(aVar3, null, aVar, aVar2, null, n52, c0285q, 3462, 82);
        }
        return C0880v.f8657a;
    }
}
