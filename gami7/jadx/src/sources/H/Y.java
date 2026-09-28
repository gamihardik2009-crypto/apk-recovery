package H;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import c0.C0603v;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1173l;
import s.AbstractC1177p;
import s.C1165d;
import s.InterfaceC1159L;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class Y extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f2164i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1159L f2165j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2166k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.e f2167l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.e f2168m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f2169n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.e f2170o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f2171p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(float f3, InterfaceC1159L interfaceC1159L, y2.e eVar, y2.e eVar2, y2.e eVar3, long j3, y2.e eVar4, long j4) {
        super(2);
        this.f2164i = f3;
        this.f2165j = interfaceC1159L;
        this.f2166k = eVar;
        this.f2167l = eVar2;
        this.f2168m = eVar3;
        this.f2169n = j3;
        this.f2170o = eVar4;
        this.f2171p = j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        boolean z3;
        ?? r5;
        boolean z4;
        boolean z5;
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            V.l lVar = V.l.f5857b;
            V.o h2 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.a(lVar, Float.NaN, this.f2164i), this.f2165j);
            X x2 = X.f2130b;
            c0285q.V(-1323940314);
            int i2 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i3 = AbstractC1108W.i(h2);
            boolean z6 = c0285q.f4195a instanceof InterfaceC0259d;
            if (!z6) {
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
            C0257c.V(c0285q, x2, c1250h);
            C1250h c1250h2 = C1252j.f10601e;
            C0257c.V(c0285q, n3, c1250h2);
            C1250h c1250h3 = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
                B1.t.q(i2, c0285q, i2, c1250h3);
            }
            B1.t.r(0, i3, new J.C0(c0285q), c0285q, 2058660585);
            c0285q.V(651014582);
            V.g gVar = V.b.f5835l;
            y2.e eVar = this.f2166k;
            y2.e eVar2 = this.f2167l;
            if (eVar == null && eVar2 == null) {
                r5 = 0;
            } else {
                V.o c3 = androidx.compose.ui.layout.a.c(lVar, "leadingIcon");
                c0285q.V(733328855);
                s.r f3 = AbstractC1177p.f(gVar, false, c0285q, 6);
                c0285q.V(-1323940314);
                int i4 = c0285q.f4194P;
                InterfaceC0282o0 n4 = c0285q.n();
                R.a i5 = AbstractC1108W.i(c3);
                if (!z6) {
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
                if (eVar != null) {
                    c0285q.V(1725997334);
                    eVar.j(c0285q, 0);
                    c0285q.r(false);
                    z3 = false;
                } else if (eVar2 != null) {
                    c0285q.V(1725997437);
                    C0257c.a(AbstractC0183r0.f3050a.a(new C0603v(this.f2169n)), eVar2, c0285q, 8);
                    z3 = false;
                    c0285q.r(false);
                } else {
                    z3 = false;
                    c0285q.V(1725997699);
                    c0285q.r(false);
                }
                B1.t.u(c0285q, z3, true, z3, z3);
                r5 = z3;
            }
            c0285q.r(r5);
            V.o j3 = androidx.compose.foundation.layout.a.j(androidx.compose.ui.layout.a.c(lVar, "label"), AbstractC0086d0.f2426a, (float) r5);
            C1165d c1165d = AbstractC1173l.f10149a;
            V.f fVar = V.b.f5840r;
            c0285q.V(693286680);
            s.S a3 = s.Q.a(c1165d, fVar, c0285q, 54);
            c0285q.V(-1323940314);
            int i6 = c0285q.f4194P;
            InterfaceC0282o0 n5 = c0285q.n();
            R.a i7 = AbstractC1108W.i(j3);
            if (!z6) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, a3, c1250h);
            C0257c.V(c0285q, n5, c1250h2);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i6))) {
                B1.t.q(i6, c0285q, i6, c1250h3);
            }
            B1.t.r(0, i7, new J.C0(c0285q), c0285q, 2058660585);
            this.f2170o.j(c0285q, 0);
            c0285q.r(false);
            c0285q.r(true);
            c0285q.r(false);
            c0285q.r(false);
            c0285q.V(-313041276);
            y2.e eVar3 = this.f2168m;
            if (eVar3 != null) {
                V.o c4 = androidx.compose.ui.layout.a.c(lVar, "trailingIcon");
                c0285q.V(733328855);
                s.r f4 = AbstractC1177p.f(gVar, false, c0285q, 6);
                c0285q.V(-1323940314);
                int i8 = c0285q.f4194P;
                InterfaceC0282o0 n6 = c0285q.n();
                R.a i9 = AbstractC1108W.i(c4);
                if (!z6) {
                    C0257c.I();
                    throw null;
                }
                c0285q.Y();
                if (c0285q.f4193O) {
                    c0285q.m(c1251i);
                } else {
                    c0285q.h0();
                }
                C0257c.V(c0285q, f4, c1250h);
                C0257c.V(c0285q, n6, c1250h2);
                if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i8))) {
                    B1.t.q(i8, c0285q, i8, c1250h3);
                }
                B1.t.r(0, i9, new J.C0(c0285q), c0285q, 2058660585);
                C0257c.a(AbstractC0183r0.f3050a.a(new C0603v(this.f2171p)), eVar3, c0285q, 8);
                z4 = false;
                z5 = true;
                B1.t.u(c0285q, false, true, false, false);
            } else {
                z4 = false;
                z5 = true;
            }
            B1.t.u(c0285q, z4, z4, z5, z4);
        }
        return C0880v.f8657a;
    }
}
