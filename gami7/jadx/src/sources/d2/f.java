package d2;

import B1.t;
import H.AbstractC0107g0;
import H.C0093e0;
import H.O5;
import H.P5;
import H.t5;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import V.o;
import m2.C0880v;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1180t;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class f implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7503h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ R1.e f7504i;

    public /* synthetic */ f(R1.e eVar, int i2) {
        this.f7503h = i2;
        this.f7504i = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        R1.e eVar;
        boolean z3;
        switch (this.f7503h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    t5.b(this.f7504i == null ? "Add Template" : "Edit Template", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 0, 0, 131070);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    V.l lVar = V.l.f5857b;
                    o i2 = androidx.compose.foundation.layout.a.i(lVar, 16);
                    C1180t a3 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q2, 0);
                    int i3 = c0285q2.f4194P;
                    InterfaceC0282o0 n3 = c0285q2.n();
                    o d3 = V.a.d(c0285q2, i2);
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i = C1252j.f10598b;
                    if (!(c0285q2.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c0285q2.m(c1251i);
                    } else {
                        c0285q2.h0();
                    }
                    C0257c.V(c0285q2, a3, C1252j.f10602f);
                    C0257c.V(c0285q2, n3, C1252j.f10601e);
                    C1250h c1250h = C1252j.f10603g;
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i3))) {
                        t.q(i3, c0285q2, i3, c1250h);
                    }
                    C0257c.V(c0285q2, d3, C1252j.f10600d);
                    c0285q2.U(256459594);
                    R1.e eVar2 = this.f7504i;
                    if (eVar2.f5492c.length() > 0) {
                        eVar = eVar2;
                        t5.b(eVar2.f5492c, null, ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2483a, 0L, null, H0.k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q2.l(P5.f1917a)).f1866m, c0285q2, 196608, 0, 65498);
                        AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.b(lVar, 4));
                        z3 = false;
                    } else {
                        eVar = eVar2;
                        z3 = false;
                    }
                    c0285q2.r(z3);
                    t5.b(eVar.f5493d, null, ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2486d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q2.l(P5.f1917a)).f1863j, c0285q2, 0, 0, 65530);
                    c0285q2.r(true);
                }
                return C0880v.f8657a;
        }
    }
}
