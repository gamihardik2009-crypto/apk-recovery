package X1;

import B1.C;
import B1.t;
import C0.K;
import C1.y;
import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.AbstractC0223x4;
import H.C0093e0;
import H.O5;
import H.P5;
import H.t5;
import H0.k;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.X0;
import P1.i;
import V.l;
import V.o;
import a.AbstractC0423a;
import androidx.compose.foundation.layout.FillElement;
import c0.AbstractC0571K;
import c0.C0603v;
import i0.C0712e;
import m2.C0880v;
import r0.InterfaceC1094H;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1177p;
import s.AbstractC1179s;
import s.C1167f;
import s.C1170i;
import s.C1180t;
import s.C1181u;
import s.Q;
import s.S;
import s.T;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class e implements y2.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6222h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f6223i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f6224j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6225k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6226l;

    public e(long j3, String str, String str2, C0712e c0712e) {
        this.f6223i = j3;
        this.f6224j = str;
        this.f6225k = str2;
        this.f6226l = c0712e;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C1251i c1251i;
        C1250h c1250h;
        switch (this.f6222h) {
            case 0:
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                z2.h.f((C1181u) obj, "$this$Card");
                if ((intValue & 81) == 16 && c0285q.A()) {
                    c0285q.P();
                } else {
                    l lVar = l.f5857b;
                    o k3 = androidx.compose.foundation.layout.a.i(lVar, 20).k(androidx.compose.foundation.layout.c.f6639a);
                    C1180t a3 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q, 48);
                    int i2 = c0285q.f4194P;
                    InterfaceC0282o0 n3 = c0285q.n();
                    o d3 = V.a.d(c0285q, k3);
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
                    C1250h c1250h2 = C1252j.f10602f;
                    C0257c.V(c0285q, a3, c1250h2);
                    C1250h c1250h3 = C1252j.f10601e;
                    C0257c.V(c0285q, n3, c1250h3);
                    C1250h c1250h4 = C1252j.f10603g;
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
                        t.q(i2, c0285q, i2, c1250h4);
                    }
                    C1250h c1250h5 = C1252j.f10600d;
                    C0257c.V(c0285q, d3, c1250h5);
                    o j3 = androidx.compose.foundation.layout.c.j(lVar, 48);
                    long j4 = this.f6223i;
                    o b3 = androidx.compose.foundation.a.b(j3, C0603v.b(0.1f, j4), y.e.f11486a);
                    InterfaceC1094H e3 = AbstractC1177p.e(V.b.f5835l, false);
                    int i3 = c0285q.f4194P;
                    InterfaceC0282o0 n4 = c0285q.n();
                    o d4 = V.a.d(c0285q, b3);
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
                    C0257c.V(c0285q, e3, c1250h2);
                    C0257c.V(c0285q, n4, c1250h3);
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i3))) {
                        t.q(i3, c0285q, i3, c1250h4);
                    }
                    C0257c.V(c0285q, d4, c1250h5);
                    AbstractC0088d2.a((C0712e) this.f6226l, null, androidx.compose.foundation.layout.c.j(lVar, 24), j4, c0285q, 432, 0);
                    c0285q.r(true);
                    AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.b(lVar, 16));
                    X0 x02 = P5.f1917a;
                    K k4 = ((O5) c0285q.l(x02)).f1858e;
                    k kVar = k.f3404m;
                    X0 x03 = AbstractC0107g0.f2597a;
                    t5.b(this.f6224j, null, ((C0093e0) c0285q.l(x03)).q, 0L, null, kVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, k4, c0285q, 196608, 0, 65498);
                    t5.b((String) this.f6225k, null, ((C0093e0) c0285q.l(x03)).f2500s, 0L, null, k.f3402k, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(x02)).f1864k, c0285q, 196608, 0, 65498);
                    c0285q.r(true);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q2 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                z2.h.f((C1181u) obj, "$this$Card");
                if ((intValue2 & 81) == 16 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    l lVar2 = l.f5857b;
                    float f3 = 16;
                    o i4 = androidx.compose.foundation.layout.a.i(lVar2, f3);
                    C1167f c1167f = AbstractC1173l.f10151c;
                    V.e eVar = V.b.f5842t;
                    C1180t a4 = AbstractC1179s.a(c1167f, eVar, c0285q2, 0);
                    int i5 = c0285q2.f4194P;
                    InterfaceC0282o0 n5 = c0285q2.n();
                    o d5 = V.a.d(c0285q2, i4);
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i3 = C1252j.f10598b;
                    boolean z4 = c0285q2.f4195a instanceof InterfaceC0259d;
                    if (!z4) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c0285q2.m(c1251i3);
                    } else {
                        c0285q2.h0();
                    }
                    C1250h c1250h6 = C1252j.f10602f;
                    C0257c.V(c0285q2, a4, c1250h6);
                    C1250h c1250h7 = C1252j.f10601e;
                    C0257c.V(c0285q2, n5, c1250h7);
                    C1250h c1250h8 = C1252j.f10603g;
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i5))) {
                        t.q(i5, c0285q2, i5, c1250h8);
                    }
                    C1250h c1250h9 = C1252j.f10600d;
                    C0257c.V(c0285q2, d5, c1250h9);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
                    V.f fVar = V.b.f5840r;
                    S a5 = Q.a(AbstractC1173l.f10149a, fVar, c0285q2, 48);
                    int i6 = c0285q2.f4194P;
                    InterfaceC0282o0 n6 = c0285q2.n();
                    o d6 = V.a.d(c0285q2, fillElement);
                    if (!z4) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c0285q2.m(c1251i3);
                    } else {
                        c0285q2.h0();
                    }
                    C0257c.V(c0285q2, a5, c1250h6);
                    C0257c.V(c0285q2, n6, c1250h7);
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i6))) {
                        t.q(i6, c0285q2, i6, c1250h8);
                    }
                    C0257c.V(c0285q2, d6, c1250h9);
                    T t3 = T.f10079a;
                    R1.b bVar = (R1.b) this.f6225k;
                    l0.c.c(bVar.f5476b, androidx.compose.foundation.layout.c.j(lVar2, 36), c0285q2, 48, 0);
                    float f4 = 12;
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.n(lVar2, f4));
                    o a6 = T.a(t3, lVar2);
                    C1180t a7 = AbstractC1179s.a(c1167f, eVar, c0285q2, 0);
                    int i7 = c0285q2.f4194P;
                    InterfaceC0282o0 n7 = c0285q2.n();
                    o d7 = V.a.d(c0285q2, a6);
                    if (!z4) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c0285q2.m(c1251i3);
                    } else {
                        c0285q2.h0();
                    }
                    C0257c.V(c0285q2, a7, c1250h6);
                    C0257c.V(c0285q2, n7, c1250h7);
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i7))) {
                        t.q(i7, c0285q2, i7, c1250h8);
                    }
                    C0257c.V(c0285q2, d7, c1250h9);
                    X0 x04 = P5.f1917a;
                    t5.b(bVar.f5476b, null, 0L, 0L, null, k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q2.l(x04)).f1863j, c0285q2, 196608, 0, 65502);
                    K k5 = ((O5) c0285q2.l(x04)).f1865l;
                    X0 x05 = AbstractC0107g0.f2597a;
                    t5.b(bVar.f5477c, null, ((C0093e0) c0285q2.l(x05)).f2500s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k5, c0285q2, 0, 0, 65530);
                    c0285q2.r(true);
                    R1.f fVar2 = (R1.f) this.f6226l;
                    l0.c.i(fVar2.f5501f.name(), null, c0285q2, 0, 2);
                    c0285q2.r(true);
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.b(lVar2, f3));
                    AbstractC0223x4.a(fillElement, y.e.a(f4), C0603v.b(0.2f, ((C0093e0) c0285q2.l(x05)).f2499r), 0L, 0.0f, 0.0f, null, R.b.c(-720618075, new i(3, fVar2), c0285q2), c0285q2, 12582918, 120);
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.b(lVar2, f3));
                    S a8 = Q.a(AbstractC1173l.f10155g, fVar, c0285q2, 54);
                    int i8 = c0285q2.f4194P;
                    InterfaceC0282o0 n8 = c0285q2.n();
                    o d8 = V.a.d(c0285q2, fillElement);
                    if (!z4) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c1251i = c1251i3;
                        c0285q2.m(c1251i);
                    } else {
                        c1251i = c1251i3;
                        c0285q2.h0();
                    }
                    C0257c.V(c0285q2, a8, c1250h6);
                    C0257c.V(c0285q2, n8, c1250h7);
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i8))) {
                        c1250h = c1250h8;
                        t.q(i8, c0285q2, i8, c1250h);
                    } else {
                        c1250h = c1250h8;
                    }
                    C0257c.V(c0285q2, d8, c1250h9);
                    S a9 = Q.a(new C1170i(f3), V.b.q, c0285q2, 6);
                    int i9 = c0285q2.f4194P;
                    InterfaceC0282o0 n9 = c0285q2.n();
                    o d9 = V.a.d(c0285q2, lVar2);
                    if (!z4) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c0285q2.m(c1251i);
                    } else {
                        c0285q2.h0();
                    }
                    C0257c.V(c0285q2, a9, c1250h6);
                    C0257c.V(c0285q2, n9, c1250h7);
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i9))) {
                        t.q(i9, c0285q2, i9, c1250h);
                    }
                    C0257c.V(c0285q2, d9, c1250h9);
                    C0712e w2 = y.w();
                    String str = fVar2.f5499d;
                    long j5 = this.f6223i;
                    C.g(w2, str, j5, c0285q2, 0);
                    C0712e N3 = AbstractC0423a.N();
                    String str2 = this.f6224j;
                    z2.h.c(str2);
                    C.g(N3, str2, j5, c0285q2, 0);
                    c0285q2.r(true);
                    R1.c cVar = R1.c.f5483h;
                    R1.c cVar2 = fVar2.f5501f;
                    if (cVar2 == cVar) {
                        c0285q2.U(-1649980838);
                        AbstractC0088d2.a(l0.c.z(), "Delivered", androidx.compose.foundation.layout.c.j(lVar2, 20), AbstractC0571K.d(4279213400L), c0285q2, 3504, 0);
                        c0285q2.r(false);
                    } else if (cVar2 == R1.c.f5484i) {
                        c0285q2.U(-1649649293);
                        AbstractC0088d2.a(y.B(), "Failed", androidx.compose.foundation.layout.c.j(lVar2, 20), ((C0093e0) c0285q2.l(x05)).f2504w, c0285q2, 432, 0);
                        c0285q2.r(false);
                    } else {
                        c0285q2.U(-1649371564);
                        c0285q2.r(false);
                    }
                    c0285q2.r(true);
                    c0285q2.r(true);
                }
                return C0880v.f8657a;
        }
    }

    public e(R1.b bVar, R1.f fVar, long j3, String str) {
        this.f6225k = bVar;
        this.f6226l = fVar;
        this.f6223i = j3;
        this.f6224j = str;
    }
}
