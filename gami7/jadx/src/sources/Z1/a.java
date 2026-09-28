package Z1;

import H.t5;
import J.C0285q;
import m2.C0880v;
import s.T;

/* loaded from: classes.dex */
public final class a implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public static final a f6398i = new a(0);

    /* renamed from: j, reason: collision with root package name */
    public static final a f6399j = new a(1);

    /* renamed from: k, reason: collision with root package name */
    public static final a f6400k = new a(2);

    /* renamed from: l, reason: collision with root package name */
    public static final a f6401l = new a(3);

    /* renamed from: m, reason: collision with root package name */
    public static final a f6402m = new a(4);

    /* renamed from: n, reason: collision with root package name */
    public static final a f6403n = new a(5);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6404h;

    public /* synthetic */ a(int i2) {
        this.f6404h = i2;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f6404h) {
            case 0:
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$TextButton");
                if ((intValue & 81) == 16 && c0285q.A()) {
                    c0285q.P();
                } else {
                    t5.b("OK", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 6, 0, 131070);
                }
                break;
            case 1:
                C0285q c0285q2 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$TextButton");
                if ((intValue2 & 81) == 16 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    t5.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q2, 6, 0, 131070);
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
                z2.h.f((T) obj, "$this$TextButton");
                if ((intValue4 & 81) == 16 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    t5.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q4, 6, 0, 131070);
                }
                break;
            case 4:
                C0285q c0285q5 = (C0285q) obj2;
                int intValue5 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$Button");
                if ((intValue5 & 81) == 16 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    t5.b("Send All Now (Immediate)", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q5, 6, 0, 131070);
                }
                break;
            default:
                C0285q c0285q6 = (C0285q) obj2;
                int intValue6 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$OutlinedButton");
                if ((intValue6 & 81) == 16 && c0285q6.A()) {
                    c0285q6.P();
                } else {
                    t5.b("Add to End of Plan", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q6, 6, 0, 131070);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
