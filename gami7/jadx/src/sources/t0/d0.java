package t0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class d0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f10562b = new d0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10563a;

    public /* synthetic */ d0(int i2) {
        this.f10563a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10563a) {
            case 0:
                C1236E c1236e = (C1236E) obj;
                C1236E c1236e2 = (C1236E) obj2;
                int g3 = z2.h.g(c1236e2.q, c1236e.q);
                return g3 != 0 ? g3 : z2.h.g(c1236e.hashCode(), c1236e2.hashCode());
            default:
                C1236E c1236e3 = (C1236E) obj;
                C1236E c1236e4 = (C1236E) obj2;
                int g4 = z2.h.g(c1236e3.q, c1236e4.q);
                return g4 != 0 ? g4 : z2.h.g(c1236e3.hashCode(), c1236e4.hashCode());
        }
    }
}
