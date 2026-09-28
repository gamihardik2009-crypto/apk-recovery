package o1;

import m.AbstractC0831e;
import n1.C0945f;

/* loaded from: classes.dex */
public final class r extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final r f9275j = new r(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final r f9276k = new r(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final r f9277l = new r(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final r f9278m = new r(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final r f9279n = new r(1, 4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9280i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i2, int i3) {
        super(i2);
        this.f9280i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f9280i) {
            case 0:
                return l.z.c(AbstractC0831e.n(700, 0, null, 6), 0.0f, 2);
            case 1:
                return l.z.d(AbstractC0831e.n(700, 0, null, 6), 2);
            case 2:
                return ((C0945f) obj).f9032m;
            case 3:
                return l.z.c(AbstractC0831e.n(700, 0, null, 6), 0.0f, 2);
            default:
                return l.z.d(AbstractC0831e.n(700, 0, null, 6), 2);
        }
    }
}
