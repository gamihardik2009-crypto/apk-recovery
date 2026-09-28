package Z1;

import B1.t;
import C0.K;
import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.AbstractC0223x4;
import H.C0093e0;
import H.C0229y4;
import H.D1;
import H.H4;
import H.t5;
import I.z;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.X0;
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
import s.C1168g;
import s.C1180t;
import s.C1181u;
import s.Q;
import s.S;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class f implements y2.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f6429h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.c f6430i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ R1.a f6431j;

    public f(boolean z3, y2.c cVar, R1.a aVar) {
        this.f6429h = z3;
        this.f6430i = cVar;
        this.f6431j = aVar;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        long b3;
        boolean z3;
        long j3;
        long j4;
        C0285q c0285q;
        boolean z4;
        long j5;
        long j6;
        C0285q c0285q2 = (C0285q) obj2;
        int intValue = ((Number) obj3).intValue();
        z2.h.f((C1181u) obj, "$this$Card");
        if ((intValue & 81) == 16 && c0285q2.A()) {
            c0285q2.P();
        } else {
            l lVar = l.f5857b;
            float f3 = 20;
            o i2 = androidx.compose.foundation.layout.a.i(lVar, f3);
            C1167f c1167f = AbstractC1173l.f10151c;
            V.e eVar = V.b.f5842t;
            C1180t a3 = AbstractC1179s.a(c1167f, eVar, c0285q2, 0);
            int i3 = c0285q2.f4194P;
            InterfaceC0282o0 n3 = c0285q2.n();
            o d3 = V.a.d(c0285q2, i2);
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            boolean z5 = c0285q2.f4195a instanceof InterfaceC0259d;
            if (!z5) {
                C0257c.I();
                throw null;
            }
            c0285q2.Y();
            if (c0285q2.f4193O) {
                c0285q2.m(c1251i);
            } else {
                c0285q2.h0();
            }
            C1250h c1250h = C1252j.f10602f;
            C0257c.V(c0285q2, a3, c1250h);
            C1250h c1250h2 = C1252j.f10601e;
            C0257c.V(c0285q2, n3, c1250h2);
            C1250h c1250h3 = C1252j.f10603g;
            if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i3))) {
                t.q(i3, c0285q2, i3, c1250h3);
            }
            C1250h c1250h4 = C1252j.f10600d;
            C0257c.V(c0285q2, d3, c1250h4);
            FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
            C1168g c1168g = AbstractC1173l.f10155g;
            V.f fVar = V.b.f5840r;
            S a4 = Q.a(c1168g, fVar, c0285q2, 54);
            int i4 = c0285q2.f4194P;
            InterfaceC0282o0 n4 = c0285q2.n();
            o d4 = V.a.d(c0285q2, fillElement);
            if (!z5) {
                C0257c.I();
                throw null;
            }
            c0285q2.Y();
            if (c0285q2.f4193O) {
                c0285q2.m(c1251i);
            } else {
                c0285q2.h0();
            }
            C0257c.V(c0285q2, a4, c1250h);
            C0257c.V(c0285q2, n4, c1250h2);
            if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i4))) {
                t.q(i4, c0285q2, i4, c1250h3);
            }
            C0257c.V(c0285q2, d4, c1250h4);
            S a5 = Q.a(AbstractC1173l.f10149a, fVar, c0285q2, 48);
            int i5 = c0285q2.f4194P;
            InterfaceC0282o0 n5 = c0285q2.n();
            o d5 = V.a.d(c0285q2, lVar);
            if (!z5) {
                C0257c.I();
                throw null;
            }
            c0285q2.Y();
            if (c0285q2.f4193O) {
                c0285q2.m(c1251i);
            } else {
                c0285q2.h0();
            }
            C0257c.V(c0285q2, a5, c1250h);
            C0257c.V(c0285q2, n5, c1250h2);
            if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i5))) {
                t.q(i5, c0285q2, i5, c1250h3);
            }
            C0257c.V(c0285q2, d5, c1250h4);
            o j7 = androidx.compose.foundation.layout.c.j(lVar, 48);
            boolean z6 = this.f6429h;
            if (z6) {
                c0285q2.U(1434714570);
                b3 = C0603v.b(0.1f, ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2483a);
                c0285q2.r(false);
                z3 = false;
            } else {
                c0285q2.U(1434717386);
                b3 = C0603v.b(0.1f, ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2504w);
                z3 = false;
                c0285q2.r(false);
            }
            o b4 = androidx.compose.foundation.a.b(j7, b3, y.e.f11486a);
            InterfaceC1094H e3 = AbstractC1177p.e(V.b.f5835l, z3);
            int i6 = c0285q2.f4194P;
            InterfaceC0282o0 n6 = c0285q2.n();
            o d6 = V.a.d(c0285q2, b4);
            if (!z5) {
                C0257c.I();
                throw null;
            }
            c0285q2.Y();
            if (c0285q2.f4193O) {
                c0285q2.m(c1251i);
            } else {
                c0285q2.h0();
            }
            C0257c.V(c0285q2, e3, c1250h);
            C0257c.V(c0285q2, n6, c1250h2);
            if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i6))) {
                t.q(i6, c0285q2, i6, c1250h3);
            }
            C0257c.V(c0285q2, d6, c1250h4);
            C0712e L3 = AbstractC0423a.L();
            if (z6) {
                c0285q2.U(1152019230);
                j3 = ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2483a;
                c0285q2.r(false);
            } else {
                c0285q2.U(1152020476);
                j3 = ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2504w;
                c0285q2.r(false);
            }
            AbstractC0088d2.a(L3, null, androidx.compose.foundation.layout.c.j(lVar, 24), j3, c0285q2, 432, 0);
            c0285q2.r(true);
            float f4 = 16;
            AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.n(lVar, f4));
            C1180t a6 = AbstractC1179s.a(c1167f, eVar, c0285q2, 0);
            int i7 = c0285q2.f4194P;
            InterfaceC0282o0 n7 = c0285q2.n();
            o d7 = V.a.d(c0285q2, lVar);
            if (!z5) {
                C0257c.I();
                throw null;
            }
            c0285q2.Y();
            if (c0285q2.f4193O) {
                c0285q2.m(c1251i);
            } else {
                c0285q2.h0();
            }
            C0257c.V(c0285q2, a6, c1250h);
            C0257c.V(c0285q2, n7, c1250h2);
            if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i7))) {
                t.q(i7, c0285q2, i7, c1250h3);
            }
            C0257c.V(c0285q2, d7, c1250h4);
            K k3 = D1.x(c0285q2).f1861h;
            H0.k kVar = H0.k.f3403l;
            if (z6) {
                c0285q2.U(1152036489);
                j4 = D1.t(c0285q2).f2486d;
            } else {
                c0285q2.U(1152038087);
                j4 = D1.t(c0285q2).f2507z;
            }
            c0285q2.r(false);
            t5.b("Automation Engine", null, j4, 0L, null, kVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, k3, c0285q2, 196614, 0, 65498);
            String str = z6 ? "Running Smoothly" : "Engine Stopped";
            K k4 = D1.x(c0285q2).f1865l;
            if (z6) {
                c0285q = c0285q2;
                c0285q.U(1152047817);
                j5 = D1.t(c0285q).f2486d;
                z4 = false;
            } else {
                c0285q = c0285q2;
                z4 = false;
                c0285q.U(1152049415);
                j5 = D1.t(c0285q).f2507z;
            }
            c0285q.r(z4);
            C0285q c0285q3 = c0285q;
            t5.b(str, null, C0603v.b(0.7f, j5), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k4, c0285q3, 0, 0, 65530);
            c0285q3.r(true);
            c0285q3.r(true);
            long j8 = C0603v.f7273c;
            long j9 = D1.t(c0285q3).f2483a;
            c0285q3.V(1937926421);
            long j10 = C0603v.f7276f;
            float f5 = z.f3831a;
            long d8 = AbstractC0107g0.d(11, c0285q3);
            long d9 = AbstractC0107g0.d(24, c0285q3);
            long d10 = AbstractC0107g0.d(44, c0285q3);
            long d11 = AbstractC0107g0.d(24, c0285q3);
            long d12 = AbstractC0107g0.d(44, c0285q3);
            long b5 = C0603v.b(1.0f, AbstractC0107g0.d(35, c0285q3));
            X0 x02 = AbstractC0107g0.f2597a;
            C0229y4 c0229y4 = new C0229y4(j8, j9, j10, d8, d9, d10, d11, d12, AbstractC0571K.k(b5, ((C0093e0) c0285q3.l(x02)).f2498p), AbstractC0571K.k(C0603v.b(0.12f, AbstractC0107g0.d(18, c0285q3)), ((C0093e0) c0285q3.l(x02)).f2498p), j10, AbstractC0571K.k(C0603v.b(0.38f, AbstractC0107g0.d(18, c0285q3)), ((C0093e0) c0285q3.l(x02)).f2498p), AbstractC0571K.k(C0603v.b(0.38f, AbstractC0107g0.d(18, c0285q3)), ((C0093e0) c0285q3.l(x02)).f2498p), AbstractC0571K.k(C0603v.b(0.12f, AbstractC0107g0.d(44, c0285q3)), ((C0093e0) c0285q3.l(x02)).f2498p), AbstractC0571K.k(C0603v.b(0.12f, AbstractC0107g0.d(18, c0285q3)), ((C0093e0) c0285q3.l(x02)).f2498p), AbstractC0571K.k(C0603v.b(0.38f, AbstractC0107g0.d(44, c0285q3)), ((C0093e0) c0285q3.l(x02)).f2498p));
            c0285q3.r(false);
            H4.a(z6, this.f6430i, null, null, false, c0229y4, null, c0285q3, 0, 92);
            c0285q3.r(true);
            AbstractC1166e.a(c0285q3, androidx.compose.foundation.layout.c.b(lVar, f3));
            if (z6) {
                c0285q3.U(1941541164);
                j6 = D1.t(c0285q3).f2486d;
            } else {
                c0285q3.U(1941542762);
                j6 = D1.t(c0285q3).f2507z;
            }
            c0285q3.r(false);
            AbstractC0223x4.a(fillElement, y.e.a(f4), C0603v.b(0.05f, j6), 0L, 0.0f, 0.0f, null, R.b.c(596377935, new P1.h(1, this.f6431j, z6), c0285q3), c0285q3, 12582918, 120);
            c0285q3.r(true);
        }
        return C0880v.f8657a;
    }
}
