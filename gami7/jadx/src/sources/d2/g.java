package d2;

import B1.t;
import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.AbstractC0223x4;
import H.C0093e0;
import H.D1;
import H.H4;
import H.O5;
import H.P5;
import H.t5;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.V0;
import J.X0;
import V.o;
import androidx.compose.foundation.layout.FillElement;
import c0.C0578S;
import c0.C0603v;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import m2.C0880v;
import r0.InterfaceC1094H;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1177p;
import s.AbstractC1179s;
import s.C1160M;
import s.C1165d;
import s.C1168g;
import s.C1170i;
import s.C1180t;
import s.C1181u;
import s.Q;
import s.S;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import y.C1394b;
import y.C1396d;

/* loaded from: classes.dex */
public final class g implements y2.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ R1.e f7505h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.a f7506i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f7507j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.a f7508k;

    public g(R1.e eVar, y2.a aVar, n nVar, y2.a aVar2) {
        this.f7505h = eVar;
        this.f7506i = aVar;
        this.f7507j = nVar;
        this.f7508k = aVar2;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C1251i c1251i;
        C1251i c1251i2;
        C1250h c1250h;
        C1250h c1250h2;
        C1251i c1251i3;
        C1250h c1250h3;
        C1250h c1250h4;
        C0285q c0285q = (C0285q) obj2;
        int intValue = ((Number) obj3).intValue();
        z2.h.f((C1181u) obj, "$this$Card");
        if ((intValue & 81) == 16 && c0285q.A()) {
            c0285q.P();
        } else {
            V.l lVar = V.l.f5857b;
            o i2 = androidx.compose.foundation.layout.a.i(lVar, 20);
            C1180t a3 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q, 0);
            int i3 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            o d3 = V.a.d(c0285q, i2);
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i4 = C1252j.f10598b;
            boolean z3 = c0285q.f4195a instanceof InterfaceC0259d;
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i4);
            } else {
                c0285q.h0();
            }
            C1250h c1250h5 = C1252j.f10602f;
            C0257c.V(c0285q, a3, c1250h5);
            C1250h c1250h6 = C1252j.f10601e;
            C0257c.V(c0285q, n3, c1250h6);
            C1250h c1250h7 = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i3))) {
                t.q(i3, c0285q, i3, c1250h7);
            }
            C1250h c1250h8 = C1252j.f10600d;
            C0257c.V(c0285q, d3, c1250h8);
            FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
            C1168g c1168g = AbstractC1173l.f10155g;
            V.f fVar = V.b.f5840r;
            S a4 = Q.a(c1168g, fVar, c0285q, 54);
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n4 = c0285q.n();
            o d4 = V.a.d(c0285q, fillElement);
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i4);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, a4, c1250h5);
            C0257c.V(c0285q, n4, c1250h6);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                t.q(i4, c0285q, i4, c1250h7);
            }
            C0257c.V(c0285q, d4, c1250h8);
            C1165d c1165d = AbstractC1173l.f10149a;
            S a5 = Q.a(c1165d, fVar, c0285q, 48);
            int i5 = c0285q.f4194P;
            InterfaceC0282o0 n5 = c0285q.n();
            o d5 = V.a.d(c0285q, lVar);
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i4);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, a5, c1250h5);
            C0257c.V(c0285q, n5, c1250h6);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i5))) {
                t.q(i5, c0285q, i5, c1250h7);
            }
            C0257c.V(c0285q, d5, c1250h8);
            o j3 = androidx.compose.foundation.layout.c.j(lVar, 36);
            X0 x02 = AbstractC0107g0.f2597a;
            o b3 = androidx.compose.foundation.a.b(j3, C0603v.b(0.1f, ((C0093e0) c0285q.l(x02)).f2483a), y.e.f11486a);
            InterfaceC1094H e3 = AbstractC1177p.e(V.b.f5835l, false);
            int i6 = c0285q.f4194P;
            InterfaceC0282o0 n6 = c0285q.n();
            o d6 = V.a.d(c0285q, b3);
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i4);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, e3, c1250h5);
            C0257c.V(c0285q, n6, c1250h6);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i6))) {
                t.q(i6, c0285q, i6, c1250h7);
            }
            C0257c.V(c0285q, d6, c1250h8);
            C0712e c0712e = l0.c.f8280b;
            if (c0712e != null) {
                c1251i = c1251i4;
            } else {
                C0711d c0711d = new C0711d("Filled.Email", false);
                int i7 = AbstractC0732y.f7958a;
                c1251i = c1251i4;
                C0578S c0578s = new C0578S(C0603v.f7272b);
                V0 v0 = new V0(1);
                v0.h(20.0f, 4.0f);
                v0.f(4.0f, 4.0f);
                v0.c(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                v0.f(2.0f, 18.0f);
                v0.c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                v0.e(16.0f);
                v0.c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                v0.f(22.0f, 6.0f);
                v0.c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                v0.a();
                v0.h(20.0f, 8.0f);
                v0.g(-8.0f, 5.0f);
                v0.g(-8.0f, -5.0f);
                v0.f(4.0f, 6.0f);
                v0.g(8.0f, 5.0f);
                v0.g(8.0f, -5.0f);
                v0.l(2.0f);
                v0.a();
                C0711d.a(c0711d, v0.f4104h, c0578s);
                c0712e = c0711d.b();
                l0.c.f8280b = c0712e;
            }
            AbstractC0088d2.a(c0712e, null, androidx.compose.foundation.layout.c.j(lVar, 18), ((C0093e0) c0285q.l(x02)).f2483a, c0285q, 432, 0);
            c0285q.r(true);
            float f3 = 12;
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.n(lVar, f3));
            R1.e eVar = this.f7505h;
            String str = eVar.f5491b;
            X0 x03 = P5.f1917a;
            C1251i c1251i5 = c1251i;
            t5.b(str, null, 0L, 0L, null, H0.k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(x03)).f1861h, c0285q, 196608, 0, 65502);
            c0285q.r(true);
            V.f fVar2 = V.b.q;
            S a6 = Q.a(c1165d, fVar2, c0285q, 0);
            int i8 = c0285q.f4194P;
            InterfaceC0282o0 n7 = c0285q.n();
            o d7 = V.a.d(c0285q, lVar);
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c1251i2 = c1251i5;
                c0285q.m(c1251i2);
            } else {
                c1251i2 = c1251i5;
                c0285q.h0();
            }
            C0257c.V(c0285q, a6, c1250h5);
            C0257c.V(c0285q, n7, c1250h6);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i8))) {
                c1250h = c1250h7;
                t.q(i8, c0285q, i8, c1250h);
                c1250h2 = c1250h8;
            } else {
                c1250h2 = c1250h8;
                c1250h = c1250h7;
            }
            C0257c.V(c0285q, d7, c1250h2);
            C1250h c1250h9 = c1250h2;
            C1250h c1250h10 = c1250h;
            H4.a(eVar.f5494e, new S1.c(this.f7507j, 5, eVar), androidx.compose.ui.graphics.a.b(lVar, 0.8f, 0.8f, 0.0f, 0.0f, 0.0f, null, false, 131068), null, false, null, null, c0285q, 384, 120);
            D1.e(this.f7506i, null, false, null, null, c.f7492k, c0285q, 196608, 30);
            c0285q.r(true);
            c0285q.r(true);
            float f4 = 16;
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.b(lVar, f4));
            C1251i c1251i6 = c1251i2;
            AbstractC0223x4.a(fillElement, new C1396d(new C1394b(4), new C1394b(f4), new C1394b(f4), new C1394b(f4)), C0603v.b(0.4f, ((C0093e0) c0285q.l(x02)).f2485c), 0L, 0.0f, 0.0f, null, R.b.c(32894073, new f(eVar, 1), c0285q), c0285q, 12582918, 120);
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.b(lVar, f4));
            S a7 = Q.a(c1168g, fVar, c0285q, 54);
            int i9 = c0285q.f4194P;
            InterfaceC0282o0 n8 = c0285q.n();
            o d8 = V.a.d(c0285q, fillElement);
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c1251i3 = c1251i6;
                c0285q.m(c1251i3);
            } else {
                c1251i3 = c1251i6;
                c0285q.h0();
            }
            C0257c.V(c0285q, a7, c1250h5);
            C0257c.V(c0285q, n8, c1250h6);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i9))) {
                c1250h3 = c1250h10;
                t.q(i9, c0285q, i9, c1250h3);
                c1250h4 = c1250h9;
            } else {
                c1250h4 = c1250h9;
                c1250h3 = c1250h10;
            }
            C0257c.V(c0285q, d8, c1250h4);
            StringBuilder sb = new StringBuilder();
            String str2 = eVar.f5492c;
            sb.append(str2.length() > 0 ? str2.concat(" ") : "");
            sb.append(eVar.f5493d);
            C1250h c1250h11 = c1250h4;
            C1251i c1251i7 = c1251i3;
            C1250h c1250h12 = c1250h3;
            t5.b(sb.toString().length() + " characters", null, ((C0093e0) c0285q.l(x02)).f2500s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(x03)).f1868o, c0285q, 0, 0, 65530);
            float f5 = (float) 8;
            S a8 = Q.a(new C1170i(f5), fVar2, c0285q, 6);
            int i10 = c0285q.f4194P;
            InterfaceC0282o0 n9 = c0285q.n();
            o d9 = V.a.d(c0285q, lVar);
            if (!z3) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i7);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, a8, c1250h5);
            C0257c.V(c0285q, n9, c1250h6);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i10))) {
                t.q(i10, c0285q, i10, c1250h12);
            }
            C0257c.V(c0285q, d9, c1250h11);
            D1.a(this.f7508k, null, false, y.e.a(f3), null, null, null, new C1160M(f4, f5, f4, f5), null, c.f7493l, c0285q, 817889280, 374);
            c0285q.r(true);
            c0285q.r(true);
            c0285q.r(true);
        }
        return C0880v.f8657a;
    }
}
