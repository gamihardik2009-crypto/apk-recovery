package W1;

import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.C0093e0;
import H.t5;
import J.C0285q;
import a.AbstractC0423a;
import m2.C0880v;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class S implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public static final S f5977i = new S(0);

    /* renamed from: j, reason: collision with root package name */
    public static final S f5978j = new S(1);

    /* renamed from: k, reason: collision with root package name */
    public static final S f5979k = new S(2);

    /* renamed from: l, reason: collision with root package name */
    public static final S f5980l = new S(3);

    /* renamed from: m, reason: collision with root package name */
    public static final S f5981m = new S(4);

    /* renamed from: n, reason: collision with root package name */
    public static final S f5982n = new S(5);

    /* renamed from: o, reason: collision with root package name */
    public static final S f5983o = new S(6);

    /* renamed from: p, reason: collision with root package name */
    public static final S f5984p = new S(7);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5985h;

    public /* synthetic */ S(int i2) {
        this.f5985h = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f5985h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    AbstractC0088d2.a(B2.a.s(), "Close", null, 0L, c0285q, 48, 12);
                }
                break;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    t5.b("Client Name", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q2, 6, 0, 131070);
                }
                break;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    t5.b("Mobile Number", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q3, 6, 0, 131070);
                }
                break;
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    AbstractC0088d2.a(AbstractC0423a.M(), "Edit", null, ((C0093e0) c0285q4.l(AbstractC0107g0.f2597a)).f2483a, c0285q4, 48, 4);
                }
                break;
            case 4:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    AbstractC0088d2.a(K1.f.v(), "Delete", null, ((C0093e0) c0285q5.l(AbstractC0107g0.f2597a)).f2504w, c0285q5, 48, 4);
                }
                break;
            case AbstractC1166e.f10138f /* 5 */:
                C0285q c0285q6 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q6.A()) {
                    c0285q6.P();
                } else {
                    t5.b("Name OFF", androidx.compose.foundation.layout.a.j(V.l.f5857b, 6, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new C0.K(((C0093e0) c0285q6.l(AbstractC0107g0.f2597a)).f2504w, B1.C.X(10), H0.k.f3404m, 0L, 0, 0L, 16777208), c0285q6, 54, 0, 65532);
                }
                break;
            case AbstractC1166e.f10136d /* 6 */:
                C0285q c0285q7 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q7.A()) {
                    c0285q7.P();
                } else {
                    t5.b("Delete Client", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q7, 6, 0, 131070);
                }
                break;
            default:
                C0285q c0285q8 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q8.A()) {
                    c0285q8.P();
                } else {
                    t5.b("Clear Imported Clients", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q8, 6, 0, 131070);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
