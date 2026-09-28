package H;

import I.AbstractC0239d;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import java.util.ArrayList;
import java.util.List;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1166e;
import s.AbstractC1177p;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* renamed from: H.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078c extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2366i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2367j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0078c(y2.e eVar, int i2) {
        super(2);
        this.f2366i = i2;
        this.f2367j = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        S.j jVar;
        switch (this.f2366i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    V.o k3 = androidx.compose.foundation.layout.a.h(V.l.f5857b, AbstractC0127j.f2750d).k(new HorizontalAlignElement(V.b.f5843u));
                    c0285q.V(733328855);
                    s.r f3 = AbstractC1177p.f(V.b.f5831h, false, c0285q, 0);
                    c0285q.V(-1323940314);
                    int i2 = c0285q.f4194P;
                    InterfaceC0282o0 n3 = c0285q.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i = C1252j.f10598b;
                    R.a i3 = AbstractC1108W.i(k3);
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
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
                        B1.t.q(i2, c0285q, i2, c1250h);
                    }
                    B1.t.r(0, i3, new J.C0(c0285q), c0285q, 2058660585);
                    this.f2367j.j(c0285q, 0);
                    c0285q.r(false);
                    c0285q.r(true);
                    c0285q.r(false);
                    c0285q.r(false);
                }
                return C0880v.f8657a;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                    }
                    V.o k4 = androidx.compose.foundation.layout.a.h(new LayoutWeightElement(B1.C.z(1.0f, Float.MAX_VALUE), false), AbstractC0127j.f2752f).k(new HorizontalAlignElement(V.b.f5842t));
                    c0285q2.V(733328855);
                    s.r f4 = AbstractC1177p.f(V.b.f5831h, false, c0285q2, 0);
                    c0285q2.V(-1323940314);
                    int i4 = c0285q2.f4194P;
                    InterfaceC0282o0 n4 = c0285q2.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i2 = C1252j.f10598b;
                    R.a i5 = AbstractC1108W.i(k4);
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
                    C0257c.V(c0285q2, f4, C1252j.f10602f);
                    C0257c.V(c0285q2, n4, C1252j.f10601e);
                    C1250h c1250h2 = C1252j.f10603g;
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i4))) {
                        B1.t.q(i4, c0285q2, i4, c1250h2);
                    }
                    B1.t.r(0, i5, new J.C0(c0285q2), c0285q2, 2058660585);
                    this.f2367j.j(c0285q2, 0);
                    c0285q2.r(false);
                    c0285q2.r(true);
                    c0285q2.r(false);
                    c0285q2.r(false);
                }
                return C0880v.f8657a;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    V.o a3 = s.T.a(s.T.f10079a, V.l.f5857b);
                    c0285q3.V(733328855);
                    s.r f5 = AbstractC1177p.f(V.b.f5831h, false, c0285q3, 0);
                    c0285q3.V(-1323940314);
                    int i6 = c0285q3.f4194P;
                    InterfaceC0282o0 n5 = c0285q3.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i3 = C1252j.f10598b;
                    R.a i7 = AbstractC1108W.i(a3);
                    if (!(c0285q3.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q3.Y();
                    if (c0285q3.f4193O) {
                        c0285q3.m(c1251i3);
                    } else {
                        c0285q3.h0();
                    }
                    C0257c.V(c0285q3, f5, C1252j.f10602f);
                    C0257c.V(c0285q3, n5, C1252j.f10601e);
                    C1250h c1250h3 = C1252j.f10603g;
                    if (c0285q3.f4193O || !z2.h.a(c0285q3.K(), Integer.valueOf(i6))) {
                        B1.t.q(i6, c0285q3, i6, c1250h3);
                    }
                    B1.t.r(0, i7, new J.C0(c0285q3), c0285q3, 2058660585);
                    this.f2367j.j(c0285q3, 0);
                    c0285q3.r(false);
                    c0285q3.r(true);
                    c0285q3.r(false);
                    c0285q3.r(false);
                }
                return C0880v.f8657a;
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    V.g gVar = V.b.f5837n;
                    c0285q4.V(733328855);
                    V.l lVar = V.l.f5857b;
                    s.r f6 = AbstractC1177p.f(gVar, false, c0285q4, 6);
                    c0285q4.V(-1323940314);
                    int i8 = c0285q4.f4194P;
                    InterfaceC0282o0 n6 = c0285q4.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i4 = C1252j.f10598b;
                    R.a i9 = AbstractC1108W.i(lVar);
                    if (!(c0285q4.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q4.Y();
                    if (c0285q4.f4193O) {
                        c0285q4.m(c1251i4);
                    } else {
                        c0285q4.h0();
                    }
                    C0257c.V(c0285q4, f6, C1252j.f10602f);
                    C0257c.V(c0285q4, n6, C1252j.f10601e);
                    C1250h c1250h4 = C1252j.f10603g;
                    if (c0285q4.f4193O || !z2.h.a(c0285q4.K(), Integer.valueOf(i8))) {
                        B1.t.q(i8, c0285q4, i8, c1250h4);
                    }
                    B1.t.r(0, i9, new J.C0(c0285q4), c0285q4, 2058660585);
                    this.f2367j.j(c0285q4, 0);
                    c0285q4.r(false);
                    c0285q4.r(true);
                    c0285q4.r(false);
                    c0285q4.r(false);
                }
                return C0880v.f8657a;
            case 4:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    V.o g3 = androidx.compose.foundation.layout.c.g(V.l.f5857b, AbstractC0239d.f3642f, AbstractC0239d.f3641e);
                    V.g gVar2 = V.b.f5835l;
                    c0285q5.V(733328855);
                    s.r f7 = AbstractC1177p.f(gVar2, false, c0285q5, 6);
                    c0285q5.V(-1323940314);
                    int i10 = c0285q5.f4194P;
                    InterfaceC0282o0 n7 = c0285q5.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i5 = C1252j.f10598b;
                    R.a i11 = AbstractC1108W.i(g3);
                    if (!(c0285q5.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q5.Y();
                    if (c0285q5.f4193O) {
                        c0285q5.m(c1251i5);
                    } else {
                        c0285q5.h0();
                    }
                    C0257c.V(c0285q5, f7, C1252j.f10602f);
                    C0257c.V(c0285q5, n7, C1252j.f10601e);
                    C1250h c1250h5 = C1252j.f10603g;
                    if (c0285q5.f4193O || !z2.h.a(c0285q5.K(), Integer.valueOf(i10))) {
                        B1.t.q(i10, c0285q5, i10, c1250h5);
                    }
                    B1.t.r(0, i11, new J.C0(c0285q5), c0285q5, 2058660585);
                    this.f2367j.j(c0285q5, 0);
                    c0285q5.r(false);
                    c0285q5.r(true);
                    c0285q5.r(false);
                    c0285q5.r(false);
                }
                return C0880v.f8657a;
            case AbstractC1166e.f10138f /* 5 */:
                C0285q c0285q6 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q6.A()) {
                    c0285q6.P();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
                    V.g gVar3 = V.b.f5835l;
                    c0285q6.V(733328855);
                    s.r f8 = AbstractC1177p.f(gVar3, false, c0285q6, 6);
                    c0285q6.V(-1323940314);
                    int i12 = c0285q6.f4194P;
                    InterfaceC0282o0 n8 = c0285q6.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i6 = C1252j.f10598b;
                    R.a i13 = AbstractC1108W.i(fillElement);
                    if (!(c0285q6.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q6.Y();
                    if (c0285q6.f4193O) {
                        c0285q6.m(c1251i6);
                    } else {
                        c0285q6.h0();
                    }
                    C0257c.V(c0285q6, f8, C1252j.f10602f);
                    C0257c.V(c0285q6, n8, C1252j.f10601e);
                    C1250h c1250h6 = C1252j.f10603g;
                    if (c0285q6.f4193O || !z2.h.a(c0285q6.K(), Integer.valueOf(i12))) {
                        B1.t.q(i12, c0285q6, i12, c1250h6);
                    }
                    B1.t.r(0, i13, new J.C0(c0285q6), c0285q6, 2058660585);
                    this.f2367j.j(c0285q6, 0);
                    c0285q6.r(false);
                    c0285q6.r(true);
                    c0285q6.r(false);
                    c0285q6.r(false);
                }
                return C0880v.f8657a;
            case AbstractC1166e.f10136d /* 6 */:
                C0285q c0285q7 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q7.A()) {
                    c0285q7.P();
                } else {
                    V.o a4 = androidx.compose.foundation.layout.c.a(V.l.f5857b, I.j.f3681d, I.j.f3679b);
                    V.g gVar4 = V.b.f5835l;
                    c0285q7.V(733328855);
                    s.r f9 = AbstractC1177p.f(gVar4, false, c0285q7, 6);
                    c0285q7.V(-1323940314);
                    int i14 = c0285q7.f4194P;
                    InterfaceC0282o0 n9 = c0285q7.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i7 = C1252j.f10598b;
                    R.a i15 = AbstractC1108W.i(a4);
                    if (!(c0285q7.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q7.Y();
                    if (c0285q7.f4193O) {
                        c0285q7.m(c1251i7);
                    } else {
                        c0285q7.h0();
                    }
                    C0257c.V(c0285q7, f9, C1252j.f10602f);
                    C0257c.V(c0285q7, n9, C1252j.f10601e);
                    C1250h c1250h7 = C1252j.f10603g;
                    if (c0285q7.f4193O || !z2.h.a(c0285q7.K(), Integer.valueOf(i14))) {
                        B1.t.q(i14, c0285q7, i14, c1250h7);
                    }
                    B1.t.r(0, i15, new J.C0(c0285q7), c0285q7, 2058660585);
                    this.f2367j.j(c0285q7, 0);
                    c0285q7.r(false);
                    c0285q7.r(true);
                    c0285q7.r(false);
                    c0285q7.r(false);
                }
                return C0880v.f8657a;
            case 7:
                C0285q c0285q8 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q8.A()) {
                    c0285q8.P();
                } else {
                    t5.a(C0.K.a(P5.a((O5) c0285q8.l(P5.f1917a), I.u.f3804e), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), this.f2367j, c0285q8, 0);
                }
                return C0880v.f8657a;
            case 8:
                C0285q c0285q9 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q9.A()) {
                    c0285q9.P();
                } else {
                    V.o c3 = androidx.compose.ui.layout.a.c(V.l.f5857b, "Container");
                    c0285q9.V(733328855);
                    s.r f10 = AbstractC1177p.f(V.b.f5831h, true, c0285q9, 48);
                    c0285q9.V(-1323940314);
                    int i16 = c0285q9.f4194P;
                    InterfaceC0282o0 n10 = c0285q9.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i8 = C1252j.f10598b;
                    R.a i17 = AbstractC1108W.i(c3);
                    if (!(c0285q9.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q9.Y();
                    if (c0285q9.f4193O) {
                        c0285q9.m(c1251i8);
                    } else {
                        c0285q9.h0();
                    }
                    C0257c.V(c0285q9, f10, C1252j.f10602f);
                    C0257c.V(c0285q9, n10, C1252j.f10601e);
                    C1250h c1250h8 = C1252j.f10603g;
                    if (c0285q9.f4193O || !z2.h.a(c0285q9.K(), Integer.valueOf(i16))) {
                        B1.t.q(i16, c0285q9, i16, c1250h8);
                    }
                    B1.t.r(0, i17, new J.C0(c0285q9), c0285q9, 2058660585);
                    this.f2367j.j(c0285q9, 0);
                    c0285q9.r(false);
                    c0285q9.r(true);
                    c0285q9.r(false);
                    c0285q9.r(false);
                }
                return C0880v.f8657a;
            default:
                S.b bVar = (S.b) obj;
                List list = (List) this.f2367j.j(bVar, obj2);
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                    Object obj3 = list.get(i18);
                    if (obj3 != null && (jVar = bVar.f5542i) != null && !jVar.c(obj3)) {
                        throw new IllegalArgumentException("item can't be saved".toString());
                    }
                }
                if (!list.isEmpty()) {
                    return new ArrayList(list);
                }
                return null;
        }
    }
}
