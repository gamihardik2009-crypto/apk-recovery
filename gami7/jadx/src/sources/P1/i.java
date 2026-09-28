package P1;

import H.AbstractC0067a2;
import H.AbstractC0107g0;
import H.C0093e0;
import H.D1;
import H.O5;
import H.P5;
import H.Z3;
import H.t5;
import J.C0266g0;
import J.C0285q;
import android.content.Context;
import c0.AbstractC0571K;
import c0.C0603v;
import m2.C0880v;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class i implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5247h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5248i;

    public /* synthetic */ i(int i2, Object obj) {
        this.f5247h = i2;
        this.f5248i = obj;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        String str;
        switch (this.f5247h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    t5.b(((S1.m) this.f5248i).f5619b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(P5.f1917a)).f1867n, c0285q, 0, 0, 65534);
                }
                break;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    t5.b(((R1.b) this.f5248i) == null ? "Add New Client" : "Edit Client", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q2, 0, 0, 131070);
                }
                break;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    D1.i((Z3) this.f5248i, null, null, c0285q3, 6, 6);
                }
                break;
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    t5.b(((R1.f) this.f5248i).f5505j, androidx.compose.foundation.layout.a.i(V.l.f5857b, 12), ((C0093e0) c0285q4.l(AbstractC0107g0.f2597a)).q, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((O5) c0285q4.l(P5.f1917a)).f1864k, c0285q4, 48, 3120, 55288);
                }
                break;
            case 4:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    R1.c cVar = (R1.c) this.f5248i;
                    if (cVar == null || (str = cVar.name()) == null) {
                        str = "All Activity";
                    }
                    t5.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q5, 0, 0, 131070);
                }
                break;
            case AbstractC1166e.f10138f /* 5 */:
                C0285q c0285q6 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q6.A()) {
                    c0285q6.P();
                } else {
                    AbstractC0067a2.a(b2.c.f7151a, b2.c.f7152b, new V1.a(3, (a2.l) this.f5248i), null, false, y.e.a(16), ((C0093e0) c0285q6.l(AbstractC0107g0.f2597a)).f2504w, C0603v.f7273c, null, null, c0285q6, 12582966, 792);
                }
                break;
            case AbstractC1166e.f10136d /* 6 */:
                C0285q c0285q7 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q7.A()) {
                    c0285q7.P();
                } else {
                    D1.b(null, y.e.a(16), D1.l(C0603v.b(0.3f, ((C0093e0) c0285q7.l(AbstractC0107g0.f2597a)).f2499r), c0285q7, 0), null, null, R.b.c(965005559, new j(3, (C0266g0) this.f5248i), c0285q7), c0285q7, 196608, 25);
                }
                break;
            default:
                C0285q c0285q8 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q8.A()) {
                    c0285q8.P();
                } else {
                    D1.b(null, y.e.a(16), D1.l(AbstractC0571K.d(4293457385L), c0285q8, 6), null, l0.c.b(1, C0603v.b(0.2f, AbstractC0571K.d(4281236786L))), R.b.c(1595080670, new j(4, (Context) this.f5248i), c0285q8), c0285q8, 221184, 9);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
