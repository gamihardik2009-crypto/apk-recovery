package H;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1177p;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* renamed from: H.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085d extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2423i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2424j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2425k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0085d(y2.e eVar, y2.e eVar2, int i2) {
        super(2);
        this.f2423i = i2;
        this.f2424j = eVar;
        this.f2425k = eVar2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2423i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    V.o k3 = androidx.compose.foundation.layout.a.h(V.l.f5857b, AbstractC0127j.f2751e).k(new HorizontalAlignElement(this.f2424j == null ? V.b.f5842t : V.b.f5843u));
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
                    this.f2425k.j(c0285q, 0);
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
                    c0285q2.V(-1969500671);
                    y2.e eVar = this.f2424j;
                    if (eVar != null) {
                        eVar.j(c0285q2, 0);
                    }
                    c0285q2.r(false);
                    this.f2425k.j(c0285q2, 0);
                }
                return C0880v.f8657a;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    AbstractC0127j.b(AbstractC0162o.f2958a, AbstractC0162o.f2959b, R.b.b(c0285q3, -909933713, new C0085d(this.f2424j, this.f2425k, 1)), c0285q3, 438);
                }
                return C0880v.f8657a;
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    c0285q4.V(1914517404);
                    y2.e eVar2 = this.f2424j;
                    if (eVar2 != null) {
                        eVar2.j(c0285q4, 0);
                    }
                    c0285q4.r(false);
                    this.f2425k.j(c0285q4, 0);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    AbstractC0127j.b(I0.f1579b, I0.f1580c, R.b.b(c0285q5, -330605494, new C0085d(this.f2424j, this.f2425k, 3)), c0285q5, 438);
                }
                return C0880v.f8657a;
        }
    }
}
