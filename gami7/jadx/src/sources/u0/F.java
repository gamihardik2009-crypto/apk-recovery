package u0;

import java.util.Comparator;
import n2.AbstractC0960l;
import t0.C1236E;

/* loaded from: classes.dex */
public final class F implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10858a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f10859b;

    public F(Comparator comparator) {
        this.f10859b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10858a) {
            case 0:
                int compare = this.f10859b.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return C1236E.f10375P.compare(((A0.q) obj).f71c, ((A0.q) obj2).f71c);
            default:
                int compare2 = this.f10859b.compare(obj, obj2);
                return compare2 != 0 ? compare2 : AbstractC0960l.g(Integer.valueOf(((A0.q) obj).f75g), Integer.valueOf(((A0.q) obj2).f75g));
        }
    }

    public F(F f3) {
        this.f10859b = f3;
    }
}
