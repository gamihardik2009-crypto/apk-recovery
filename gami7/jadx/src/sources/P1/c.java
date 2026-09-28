package P1;

import C1.y;
import J.C0257c;
import J.C0285q;
import e2.AbstractC0661d;
import m2.C0880v;

/* loaded from: classes.dex */
public final class c implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public static final c f5232i = new c(0);

    /* renamed from: j, reason: collision with root package name */
    public static final c f5233j = new c(1);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5234h;

    public /* synthetic */ c(int i2) {
        this.f5234h = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f5234h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                int intValue = ((Number) obj2).intValue() & 11;
                C0880v c0880v = C0880v.f8657a;
                if (intValue == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    C0257c.e(c0285q, c0880v, new b(l0.c.K(new f.a(1), new a(0), c0285q, 56), null));
                    y.d(0, c0285q);
                }
                return c0880v;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    AbstractC0661d.a(false, d.f5235a, c0285q2, 48, 1);
                }
                return C0880v.f8657a;
        }
    }
}
