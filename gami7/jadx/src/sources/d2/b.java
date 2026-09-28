package d2;

import H.AbstractC0088d2;
import H.t5;
import J.C0285q;
import a.AbstractC0423a;
import i0.C0712e;
import m2.C0880v;
import s.AbstractC1166e;
import s.T;

/* loaded from: classes.dex */
public final class b implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public static final b f7476i = new b(0);

    /* renamed from: j, reason: collision with root package name */
    public static final b f7477j = new b(1);

    /* renamed from: k, reason: collision with root package name */
    public static final b f7478k = new b(2);

    /* renamed from: l, reason: collision with root package name */
    public static final b f7479l = new b(3);

    /* renamed from: m, reason: collision with root package name */
    public static final b f7480m = new b(4);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7481h;

    public /* synthetic */ b(int i2) {
        this.f7481h = i2;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f7481h) {
            case 0:
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$Button");
                if ((intValue & 81) == 16 && c0285q.A()) {
                    c0285q.P();
                } else {
                    C0712e M3 = AbstractC0423a.M();
                    V.l lVar = V.l.f5857b;
                    AbstractC0088d2.a(M3, null, androidx.compose.foundation.layout.c.j(lVar, 16), 0L, c0285q, 432, 8);
                    AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.n(lVar, 4));
                    t5.b("Edit", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 6, 0, 131070);
                }
                break;
            case 1:
                C0285q c0285q2 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$Button");
                if ((intValue2 & 81) == 16 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    t5.b("Delete", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q2, 6, 0, 131070);
                }
                break;
            case 2:
                C0285q c0285q3 = (C0285q) obj2;
                int intValue3 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$TextButton");
                if ((intValue3 & 81) == 16 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    t5.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q3, 6, 0, 131070);
                }
                break;
            case 3:
                C0285q c0285q4 = (C0285q) obj2;
                int intValue4 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$Button");
                if ((intValue4 & 81) == 16 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    t5.b("Save", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q4, 6, 0, 131070);
                }
                break;
            default:
                C0285q c0285q5 = (C0285q) obj2;
                int intValue5 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$TextButton");
                if ((intValue5 & 81) == 16 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    t5.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q5, 6, 0, 131070);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
