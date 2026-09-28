package J;

import m2.C0880v;

/* renamed from: J.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267h extends z2.i implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final C0267h f4141j = new C0267h(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0267h f4142k = new C0267h(2, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4143i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0267h(int i2, int i3) {
        super(i2);
        this.f4143i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f4143i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                }
                break;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                }
                break;
        }
        return C0880v.f8657a;
    }
}
