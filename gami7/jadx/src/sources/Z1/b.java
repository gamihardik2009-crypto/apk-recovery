package Z1;

import C1.y;
import H.AbstractC0088d2;
import H.t5;
import J.C0285q;
import V.l;
import m2.C0880v;

/* loaded from: classes.dex */
public final class b implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public static final b f6405i = new b(0);

    /* renamed from: j, reason: collision with root package name */
    public static final b f6406j = new b(1);

    /* renamed from: k, reason: collision with root package name */
    public static final b f6407k = new b(2);

    /* renamed from: l, reason: collision with root package name */
    public static final b f6408l = new b(3);

    /* renamed from: m, reason: collision with root package name */
    public static final b f6409m = new b(4);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6410h;

    public /* synthetic */ b(int i2) {
        this.f6410h = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0880v c0880v = C0880v.f8657a;
        switch (this.f6410h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q.A()) {
                    t5.b("Retry Failed Messages", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 6, 0, 131070);
                    break;
                } else {
                    c0285q.P();
                    break;
                }
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q2.A()) {
                    t5.b("Select Start Date", androidx.compose.foundation.layout.a.i(l.f5857b, 16), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q2, 54, 0, 131068);
                    break;
                } else {
                    c0285q2.P();
                    break;
                }
                break;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q3.A()) {
                    t5.b("Automation Setup", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q3, 6, 0, 131070);
                    break;
                } else {
                    c0285q3.P();
                    break;
                }
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q4.A()) {
                    t5.b("Start Date", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q4, 6, 0, 131070);
                    break;
                } else {
                    c0285q4.P();
                    break;
                }
                break;
            default:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q5.A()) {
                    AbstractC0088d2.a(y.w(), null, null, 0L, c0285q5, 48, 12);
                    break;
                } else {
                    c0285q5.P();
                    break;
                }
        }
        return c0880v;
    }
}
