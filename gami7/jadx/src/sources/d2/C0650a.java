package d2;

import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.C0093e0;
import H.t5;
import J.C0285q;
import m2.C0880v;
import s.AbstractC1166e;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650a implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public static final C0650a f7468i = new C0650a(0);

    /* renamed from: j, reason: collision with root package name */
    public static final C0650a f7469j = new C0650a(1);

    /* renamed from: k, reason: collision with root package name */
    public static final C0650a f7470k = new C0650a(2);

    /* renamed from: l, reason: collision with root package name */
    public static final C0650a f7471l = new C0650a(3);

    /* renamed from: m, reason: collision with root package name */
    public static final C0650a f7472m = new C0650a(4);

    /* renamed from: n, reason: collision with root package name */
    public static final C0650a f7473n = new C0650a(5);

    /* renamed from: o, reason: collision with root package name */
    public static final C0650a f7474o = new C0650a(6);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7475h;

    public /* synthetic */ C0650a(int i2) {
        this.f7475h = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f7475h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    AbstractC0088d2.a(B2.a.r(), "Add Template", null, 0L, c0285q, 48, 12);
                }
                break;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    t5.b("Message", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q2, 6, 0, 131070);
                }
                break;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    AbstractC0088d2.a(K1.f.v(), null, null, ((C0093e0) c0285q3.l(AbstractC0107g0.f2597a)).f2504w, c0285q3, 48, 4);
                }
                break;
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    t5.b("Delete Template", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q4, 6, 0, 131070);
                }
                break;
            case 4:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    t5.b("Are you sure you want to delete this template?", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q5, 6, 0, 131070);
                }
                break;
            case AbstractC1166e.f10138f /* 5 */:
                C0285q c0285q6 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q6.A()) {
                    c0285q6.P();
                } else {
                    t5.b("Title", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q6, 6, 0, 131070);
                }
                break;
            default:
                C0285q c0285q7 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q7.A()) {
                    c0285q7.P();
                } else {
                    t5.b("Greeting", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q7, 6, 0, 131070);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
