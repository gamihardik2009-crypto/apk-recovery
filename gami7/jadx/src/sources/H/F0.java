package H;

import I.AbstractC0240e;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J2.InterfaceC0328z;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import java.util.ArrayList;
import l.C0787B;
import m2.C0880v;
import n1.C0945f;
import n2.AbstractC0961m;
import o.AbstractC0990p;
import o.C0976b;
import p.C1055z0;
import r0.AbstractC1108W;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1177p;
import s.AbstractC1179s;
import s.C1168g;
import s.C1180t;
import s.C1181u;
import s.InterfaceC1159L;
import s.InterfaceC1169h;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import u.C1270a;
import u0.AbstractC1296l0;
import u0.C1274a0;
import u0.C1314v;

/* loaded from: classes.dex */
public final class F0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1455i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1456j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1457k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1458l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(Object obj, Object obj2, Object obj3, int i2) {
        super(2);
        this.f1455i = i2;
        this.f1457k = obj;
        this.f1456j = obj2;
        this.f1458l = obj3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        V.l lVar = V.l.f5857b;
        C0880v c0880v = C0880v.f8657a;
        Object obj3 = this.f1456j;
        Object obj4 = this.f1458l;
        Object obj5 = this.f1457k;
        switch (this.f1455i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    C1168g c1168g = AbstractC1173l.f10155g;
                    c0285q.V(-483455358);
                    C1180t a3 = AbstractC1179s.a(c1168g, V.b.f5842t, c0285q, 6);
                    c0285q.V(-1323940314);
                    int i2 = c0285q.f4194P;
                    InterfaceC0282o0 n3 = c0285q.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i = C1252j.f10598b;
                    R.a i3 = AbstractC1108W.i(lVar);
                    boolean z3 = c0285q.f4195a instanceof InterfaceC0259d;
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
                    C1250h c1250h = C1252j.f10602f;
                    C0257c.V(c0285q, a3, c1250h);
                    C1250h c1250h2 = C1252j.f10601e;
                    C0257c.V(c0285q, n3, c1250h2);
                    C1250h c1250h3 = C1252j.f10603g;
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
                        B1.t.q(i2, c0285q, i2, c1250h3);
                    }
                    B1.t.r(0, i3, new J.C0(c0285q), c0285q, 2058660585);
                    ((y2.f) obj5).i(C1181u.f10180a, c0285q, 6);
                    V.o h2 = androidx.compose.foundation.layout.a.h(new HorizontalAlignElement(V.b.f5844v), I0.f1578a);
                    c0285q.V(733328855);
                    s.r f3 = AbstractC1177p.f(V.b.f5831h, false, c0285q, 0);
                    c0285q.V(-1323940314);
                    int i4 = c0285q.f4194P;
                    InterfaceC0282o0 n4 = c0285q.n();
                    R.a i5 = AbstractC1108W.i(h2);
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
                    C0257c.V(c0285q, f3, c1250h);
                    C0257c.V(c0285q, n4, c1250h2);
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                        B1.t.q(i4, c0285q, i4, c1250h3);
                    }
                    B1.t.r(0, i5, new J.C0(c0285q), c0285q, 2058660585);
                    float f4 = AbstractC0240e.f3662a;
                    D1.h(AbstractC0107g0.d(26, c0285q), P5.a((O5) c0285q.l(P5.f1917a), I.F.f3547n), R.b.b(c0285q, 1174914401, new C0085d((y2.e) obj3, (y2.e) obj4, 4)), c0285q, 384);
                    B1.t.u(c0285q, false, true, false, false);
                    B1.t.u(c0285q, false, true, false, false);
                }
                return c0880v;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    V.o c3 = androidx.compose.ui.layout.a.c(lVar, "Container");
                    long j3 = ((b0.f) ((InterfaceC0258c0) obj5).getValue()).f7072a;
                    float f5 = R2.f1949a;
                    V.o c4 = androidx.compose.ui.draw.a.c(c3, new C0787B(j3, (InterfaceC1159L) obj4));
                    c0285q2.V(733328855);
                    s.r f6 = AbstractC1177p.f(V.b.f5831h, true, c0285q2, 48);
                    c0285q2.V(-1323940314);
                    int i6 = c0285q2.f4194P;
                    InterfaceC0282o0 n5 = c0285q2.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i2 = C1252j.f10598b;
                    R.a i7 = AbstractC1108W.i(c4);
                    if (!(c0285q2.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c0285q2.m(c1251i2);
                    } else {
                        c0285q2.h0();
                    }
                    C0257c.V(c0285q2, f6, C1252j.f10602f);
                    C0257c.V(c0285q2, n5, C1252j.f10601e);
                    C1250h c1250h4 = C1252j.f10603g;
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i6))) {
                        B1.t.q(i6, c0285q2, i6, c1250h4);
                    }
                    B1.t.r(0, i7, new J.C0(c0285q2), c0285q2, 2058660585);
                    ((y2.e) obj3).j(c0285q2, 0);
                    c0285q2.r(false);
                    c0285q2.r(true);
                    c0285q2.r(false);
                    c0285q2.r(false);
                }
                return c0880v;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    C0976b c0976b = (C0976b) obj5;
                    AbstractC0990p.a(c0976b, (V.o) obj3, R.b.c(1156688164, new D.H(5, c0976b, (y2.c) obj4), c0285q3), c0285q3, 384, 0);
                }
                return c0880v;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                J2.B.r((InterfaceC0328z) obj5, null, 0, new o1.u(floatValue, (m.W) obj3, (C0945f) obj4, null), 3);
                return c0880v;
            case 4:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                z2.p pVar = (z2.p) obj5;
                p.C0 c02 = (p.C0) obj3;
                long g3 = c02.g(c02.c(floatValue2 - pVar.f11906h));
                p.C0 c03 = ((C1055z0) obj4).f9724a;
                pVar.f11906h += c02.c(c02.f(p.C0.a(c03, c03.f9391h, g3, 1)));
                return c0880v;
            case AbstractC1166e.f10138f /* 5 */:
                O0.b bVar = (O0.b) obj;
                long j4 = ((O0.a) obj2).f5132a;
                if (O0.a.h(j4) == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
                }
                O0.k kVar = O0.k.f5148h;
                InterfaceC1159L interfaceC1159L = (InterfaceC1159L) obj5;
                int h3 = O0.a.h(j4) - bVar.l(androidx.compose.foundation.layout.a.d(interfaceC1159L, kVar) + androidx.compose.foundation.layout.a.e(interfaceC1159L, kVar));
                InterfaceC1169h interfaceC1169h = (InterfaceC1169h) obj4;
                int l3 = bVar.l(interfaceC1169h.a());
                ((C1270a) obj3).getClass();
                int i8 = h3 - (2 * l3);
                int i9 = i8 / 3;
                int i10 = i8 % 3;
                ArrayList arrayList = new ArrayList(3);
                int i11 = 0;
                while (i11 < 3) {
                    arrayList.add(Integer.valueOf((i11 < i10 ? 1 : 0) + i9));
                    i11++;
                }
                int[] W3 = AbstractC0961m.W(arrayList);
                int[] iArr = new int[W3.length];
                interfaceC1169h.c(bVar, h3, W3, kVar, iArr);
                return new u.s(W3, iArr);
            default:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    AbstractC1296l0.a((C1314v) obj5, (C1274a0) obj4, (y2.e) obj3, c0285q4, 0);
                }
                return c0880v;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(Object obj, Object obj2, y2.e eVar, int i2) {
        super(2);
        this.f1455i = i2;
        this.f1457k = obj;
        this.f1458l = obj2;
        this.f1456j = eVar;
    }
}
