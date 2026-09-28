package R0;

import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class n extends z2.i implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final n f5418j = new n(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final n f5419k = new n(2, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5420i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i2, int i3) {
        super(i2);
        this.f5420i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f5420i) {
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
