package W1;

import H.AbstractC0088d2;
import H.O5;
import H.P5;
import H.t5;
import J.C0285q;
import a.AbstractC0423a;
import i0.C0712e;
import m2.C0880v;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class Q implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public static final Q f5968i = new Q(0);

    /* renamed from: j, reason: collision with root package name */
    public static final Q f5969j = new Q(1);

    /* renamed from: k, reason: collision with root package name */
    public static final Q f5970k = new Q(2);

    /* renamed from: l, reason: collision with root package name */
    public static final Q f5971l = new Q(3);

    /* renamed from: m, reason: collision with root package name */
    public static final Q f5972m = new Q(4);

    /* renamed from: n, reason: collision with root package name */
    public static final Q f5973n = new Q(5);

    /* renamed from: o, reason: collision with root package name */
    public static final Q f5974o = new Q(6);

    /* renamed from: p, reason: collision with root package name */
    public static final Q f5975p = new Q(7);
    public static final Q q = new Q(8);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5976h;

    public /* synthetic */ Q(int i2) {
        this.f5976h = i2;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f5976h) {
            case 0:
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                z2.h.f((s.T) obj, "$this$Button");
                if ((intValue & 81) == 16 && c0285q.A()) {
                    c0285q.P();
                } else {
                    t5.b("Delete", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 6, 0, 131070);
                }
                break;
            case 1:
                C0285q c0285q2 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                z2.h.f((s.T) obj, "$this$Button");
                if ((intValue2 & 81) == 16 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    t5.b("Save", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q2, 6, 0, 131070);
                }
                break;
            case 2:
                C0285q c0285q3 = (C0285q) obj2;
                int intValue3 = ((Number) obj3).intValue();
                z2.h.f((s.T) obj, "$this$TextButton");
                if ((intValue3 & 81) == 16 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    t5.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q3, 6, 0, 131070);
                }
                break;
            case 3:
                C0285q c0285q4 = (C0285q) obj2;
                int intValue4 = ((Number) obj3).intValue();
                z2.h.f((s.T) obj, "$this$TextButton");
                if ((intValue4 & 81) == 16 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    t5.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q4, 6, 0, 131070);
                }
                break;
            case 4:
                C0285q c0285q5 = (C0285q) obj2;
                int intValue5 = ((Number) obj3).intValue();
                z2.h.f((s.T) obj, "$this$Button");
                if ((intValue5 & 81) == 16 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    t5.b("Clear All", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q5, 6, 0, 131070);
                }
                break;
            case AbstractC1166e.f10138f /* 5 */:
                C0285q c0285q6 = (C0285q) obj2;
                int intValue6 = ((Number) obj3).intValue();
                z2.h.f((s.T) obj, "$this$TextButton");
                if ((intValue6 & 81) == 16 && c0285q6.A()) {
                    c0285q6.P();
                } else {
                    t5.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q6, 6, 0, 131070);
                }
                break;
            case AbstractC1166e.f10136d /* 6 */:
                C0285q c0285q7 = (C0285q) obj2;
                int intValue7 = ((Number) obj3).intValue();
                z2.h.f((s.T) obj, "$this$OutlinedButton");
                if ((intValue7 & 81) == 16 && c0285q7.A()) {
                    c0285q7.P();
                } else {
                    C0712e L3 = AbstractC0423a.L();
                    V.l lVar = V.l.f5857b;
                    AbstractC0088d2.a(L3, null, androidx.compose.foundation.layout.c.j(lVar, 16), 0L, c0285q7, 432, 8);
                    AbstractC1166e.a(c0285q7, androidx.compose.foundation.layout.c.n(lVar, 4));
                    t5.b("Deduplicate", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q7.l(P5.f1917a)).f1868o, c0285q7, 6, 0, 65534);
                }
                break;
            case 7:
                C0285q c0285q8 = (C0285q) obj2;
                int intValue8 = ((Number) obj3).intValue();
                z2.h.f((s.T) obj, "$this$OutlinedButton");
                if ((intValue8 & 81) == 16 && c0285q8.A()) {
                    c0285q8.P();
                } else {
                    C0712e v3 = K1.f.v();
                    V.l lVar2 = V.l.f5857b;
                    AbstractC0088d2.a(v3, null, androidx.compose.foundation.layout.c.j(lVar2, 16), 0L, c0285q8, 432, 8);
                    AbstractC1166e.a(c0285q8, androidx.compose.foundation.layout.c.n(lVar2, 4));
                    t5.b("Clear Contacts", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q8.l(P5.f1917a)).f1868o, c0285q8, 6, 0, 65534);
                }
                break;
            default:
                C0285q c0285q9 = (C0285q) obj2;
                int intValue9 = ((Number) obj3).intValue();
                z2.h.f((s.T) obj, "$this$OutlinedButton");
                if ((intValue9 & 81) == 16 && c0285q9.A()) {
                    c0285q9.P();
                } else {
                    C0712e v4 = K1.f.v();
                    V.l lVar3 = V.l.f5857b;
                    AbstractC0088d2.a(v4, null, androidx.compose.foundation.layout.c.j(lVar3, 16), 0L, c0285q9, 432, 8);
                    AbstractC1166e.a(c0285q9, androidx.compose.foundation.layout.c.n(lVar3, 4));
                    t5.b("Clear CSV", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q9.l(P5.f1917a)).f1868o, c0285q9, 6, 0, 65534);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
