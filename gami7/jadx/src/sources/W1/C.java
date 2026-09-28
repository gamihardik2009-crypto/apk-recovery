package W1;

import H.AbstractC0107g0;
import H.C0093e0;
import H.D1;
import H.O5;
import H.P5;
import H.V;
import H.t5;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.W0;
import J.X0;
import M2.d0;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m2.C0880v;
import n2.AbstractC0949a;
import n2.AbstractC0961m;
import n2.AbstractC0964p;
import n2.C0972x;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1160M;
import s.C1168g;
import s.C1170i;
import s.C1180t;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class C implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y2.a f5910h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.a f5911i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W0 f5912j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f5913k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f5914l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f5915m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W0 f5916n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W0 f5917o;

    public C(y2.a aVar, y2.a aVar2, InterfaceC0258c0 interfaceC0258c0, P p3, boolean z3, ArrayList arrayList, InterfaceC0258c0 interfaceC0258c02, InterfaceC0258c0 interfaceC0258c03) {
        this.f5910h = aVar;
        this.f5911i = aVar2;
        this.f5912j = interfaceC0258c0;
        this.f5913k = p3;
        this.f5914l = z3;
        this.f5915m = arrayList;
        this.f5916n = interfaceC0258c02;
        this.f5917o = interfaceC0258c03;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C1251i c1251i;
        C1250h c1250h;
        C1250h c1250h2;
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            V.l lVar = V.l.f5857b;
            V.o i2 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.f6640b, 20);
            C1180t a3 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q, 0);
            int i3 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            V.o d3 = V.a.d(c0285q, i2);
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i2 = C1252j.f10598b;
            boolean z3 = c0285q.f4195a instanceof InterfaceC0259d;
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i2);
            } else {
                c0285q.h0();
            }
            C1250h c1250h3 = C1252j.f10602f;
            C0257c.V(c0285q, a3, c1250h3);
            C1250h c1250h4 = C1252j.f10601e;
            C0257c.V(c0285q, n3, c1250h4);
            C1250h c1250h5 = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i3))) {
                B1.t.q(i3, c0285q, i3, c1250h5);
            }
            C1250h c1250h6 = C1252j.f10600d;
            C0257c.V(c0285q, d3, c1250h6);
            FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
            C1168g c1168g = AbstractC1173l.f10155g;
            V.f fVar = V.b.f5840r;
            s.S a4 = s.Q.a(c1168g, fVar, c0285q, 54);
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n4 = c0285q.n();
            V.o d4 = V.a.d(c0285q, fillElement);
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i2);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, a4, c1250h3);
            C0257c.V(c0285q, n4, c1250h4);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                B1.t.q(i4, c0285q, i4, c1250h5);
            }
            C0257c.V(c0285q, d4, c1250h6);
            X0 x02 = P5.f1917a;
            C0.K k3 = ((O5) c0285q.l(x02)).f1859f;
            H0.k kVar = H0.k.f3403l;
            t5.b("Import Contacts", null, 0L, 0L, null, kVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, k3, c0285q, 196614, 0, 65502);
            D1.e(this.f5911i, null, false, null, null, T.f5995j, c0285q, 196608, 30);
            c0285q.r(true);
            float f3 = 16;
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.b(lVar, f3));
            String str = (String) this.f5912j.getValue();
            final P p3 = this.f5913k;
            final int i5 = 0;
            l0.c.a(str, new y2.c() { // from class: W1.z
                @Override // y2.c
                public final Object l(Object obj3) {
                    switch (i5) {
                        case 0:
                            String str2 = (String) obj3;
                            P p4 = p3;
                            z2.h.f(p4, "$viewModel");
                            z2.h.f(str2, "it");
                            p4.f5961d.k(str2);
                            break;
                        default:
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            P p5 = p3;
                            z2.h.f(p5, "$viewModel");
                            d0 d0Var = p5.f5964g;
                            if (booleanValue) {
                                Iterable iterable = (Iterable) p5.f5966i.f4811h.getValue();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj4 : iterable) {
                                    if (!((U) obj4).f6004c) {
                                        arrayList.add(obj4);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(AbstractC0964p.z(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((U) it.next()).f6003b);
                                }
                                d0Var.k(AbstractC0961m.b0(arrayList2));
                            } else {
                                d0Var.k(C0972x.f9167h);
                            }
                            break;
                    }
                    return C0880v.f8657a;
                }
            }, "Search contacts...", null, c0285q, 384, 8);
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.b(lVar, f3));
            s.S a5 = s.Q.a(c1168g, fVar, c0285q, 54);
            int i6 = c0285q.f4194P;
            InterfaceC0282o0 n5 = c0285q.n();
            V.o d5 = V.a.d(c0285q, fillElement);
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c1251i = c1251i2;
                c0285q.m(c1251i);
            } else {
                c1251i = c1251i2;
                c0285q.h0();
            }
            C0257c.V(c0285q, a5, c1250h3);
            C0257c.V(c0285q, n5, c1250h4);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i6))) {
                c1250h = c1250h5;
                B1.t.q(i6, c0285q, i6, c1250h);
                c1250h2 = c1250h6;
            } else {
                c1250h2 = c1250h6;
                c1250h = c1250h5;
            }
            C0257c.V(c0285q, d5, c1250h2);
            s.S a6 = s.Q.a(AbstractC1173l.f10149a, fVar, c0285q, 48);
            int i7 = c0285q.f4194P;
            InterfaceC0282o0 n6 = c0285q.n();
            V.o d6 = V.a.d(c0285q, lVar);
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, a6, c1250h3);
            C0257c.V(c0285q, n6, c1250h4);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i7))) {
                B1.t.q(i7, c0285q, i7, c1250h);
            }
            C0257c.V(c0285q, d6, c1250h2);
            final int i8 = 1;
            V.a(this.f5914l, new y2.c() { // from class: W1.z
                @Override // y2.c
                public final Object l(Object obj3) {
                    switch (i8) {
                        case 0:
                            String str2 = (String) obj3;
                            P p4 = p3;
                            z2.h.f(p4, "$viewModel");
                            z2.h.f(str2, "it");
                            p4.f5961d.k(str2);
                            break;
                        default:
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            P p5 = p3;
                            z2.h.f(p5, "$viewModel");
                            d0 d0Var = p5.f5964g;
                            if (booleanValue) {
                                Iterable iterable = (Iterable) p5.f5966i.f4811h.getValue();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj4 : iterable) {
                                    if (!((U) obj4).f6004c) {
                                        arrayList.add(obj4);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(AbstractC0964p.z(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((U) it.next()).f6003b);
                                }
                                d0Var.k(AbstractC0961m.b0(arrayList2));
                            } else {
                                d0Var.k(C0972x.f9167h);
                            }
                            break;
                    }
                    return C0880v.f8657a;
                }
            }, null, !this.f5915m.isEmpty(), null, null, c0285q, 0, 52);
            t5.b("Select All", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(x02)).f1863j, c0285q, 6, 0, 65534);
            c0285q.r(true);
            StringBuilder sb = new StringBuilder();
            W0 w02 = this.f5916n;
            sb.append(((Set) w02.getValue()).size());
            sb.append(" selected");
            t5.b(sb.toString(), null, ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2483a, 0L, null, kVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(x02)).f1864k, c0285q, 196608, 0, 65498);
            c0285q.r(true);
            float f4 = 8;
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.b(lVar, f4));
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            AbstractC0949a.a(new LayoutWeightElement(B1.C.z(1.0f, Float.MAX_VALUE), true), null, null, false, new C1170i(f4), null, null, false, new C0382c(this.f5917o, w02, p3), c0285q, 24576, 238);
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.b(lVar, f3));
            D1.a(this.f5910h, fillElement, !((Set) w02.getValue()).isEmpty(), y.e.a(12), null, null, null, new C1160M(f3, f3, f3, f3), null, R.b.c(2094281178, new A(w02, 0), c0285q), c0285q, 817889328, 368);
            c0285q.r(true);
        }
        return C0880v.f8657a;
    }
}
