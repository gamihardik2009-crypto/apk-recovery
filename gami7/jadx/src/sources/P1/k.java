package P1;

import B1.C;
import H.AbstractC0107g0;
import H.C0093e0;
import H.D1;
import H.H2;
import J.C0285q;
import Y1.C0421g;
import c2.AbstractC0626c;
import m2.C0880v;
import n1.y;
import y.C1394b;
import y.C1396d;

/* loaded from: classes.dex */
public final class k implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5251h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f5252i;

    public /* synthetic */ k(y yVar, int i2) {
        this.f5251h = i2;
        this.f5252i = yVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = 0;
        C0880v c0880v = C0880v.f8657a;
        y yVar = this.f5252i;
        switch (this.f5251h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q.A()) {
                    V.l lVar = V.l.f5857b;
                    float f3 = 24;
                    float f4 = 0;
                    C1396d c1396d = y.e.f11486a;
                    H2.a(C.v(lVar, new C1396d(new C1394b(f3), new C1394b(f3), new C1394b(f4), new C1394b(f4))), ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2498p, 0L, 8, null, R.b.c(-1139422204, new j(i2, yVar), c0285q), c0285q, 199680, 20);
                    break;
                } else {
                    c0285q.P();
                    break;
                }
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q2.A()) {
                    D1.e(new C0421g(yVar, 1), null, false, null, null, AbstractC0626c.f7326h, c0285q2, 196608, 30);
                    break;
                } else {
                    c0285q2.P();
                    break;
                }
        }
        return c0880v;
    }
}
