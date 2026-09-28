package b2;

import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.C0093e0;
import H.t5;
import J.C0285q;
import a.AbstractC0423a;
import m2.C0880v;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550a implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public static final C0550a f7146i = new C0550a(0);

    /* renamed from: j, reason: collision with root package name */
    public static final C0550a f7147j = new C0550a(1);

    /* renamed from: k, reason: collision with root package name */
    public static final C0550a f7148k = new C0550a(2);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7149h;

    public /* synthetic */ C0550a(int i2) {
        this.f7149h = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f7149h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    t5.b("Retry All Failed", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 6, 0, 131070);
                }
                break;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    AbstractC0088d2.a(AbstractC0423a.N(), null, null, 0L, c0285q2, 48, 12);
                }
                break;
            default:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    AbstractC0088d2.a(AbstractC0423a.N(), null, null, ((C0093e0) c0285q3.l(AbstractC0107g0.f2597a)).f2483a, c0285q3, 48, 4);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
