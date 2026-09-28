package u0;

import java.util.Comparator;
import m2.C0865g;

/* loaded from: classes.dex */
public final class B implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final B f10823b = new B(0);

    /* renamed from: c, reason: collision with root package name */
    public static final B f10824c = new B(1);

    /* renamed from: d, reason: collision with root package name */
    public static final B f10825d = new B(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10826a;

    public /* synthetic */ B(int i2) {
        this.f10826a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10826a) {
            case 0:
                b0.d f3 = ((A0.q) obj).f();
                b0.d f4 = ((A0.q) obj2).f();
                int compare = Float.compare(f3.f7060a, f4.f7060a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(f3.f7061b, f4.f7061b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(f3.f7063d, f4.f7063d);
                return compare3 != 0 ? compare3 : Float.compare(f3.f7062c, f4.f7062c);
            case 1:
                b0.d f5 = ((A0.q) obj).f();
                b0.d f6 = ((A0.q) obj2).f();
                int compare4 = Float.compare(f6.f7062c, f5.f7062c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(f5.f7061b, f6.f7061b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(f5.f7063d, f6.f7063d);
                return compare6 != 0 ? compare6 : Float.compare(f6.f7060a, f5.f7060a);
            default:
                C0865g c0865g = (C0865g) obj;
                C0865g c0865g2 = (C0865g) obj2;
                int compare7 = Float.compare(((b0.d) c0865g.f8646h).f7061b, ((b0.d) c0865g2.f8646h).f7061b);
                return compare7 != 0 ? compare7 : Float.compare(((b0.d) c0865g.f8646h).f7063d, ((b0.d) c0865g2.f8646h).f7063d);
        }
    }
}
