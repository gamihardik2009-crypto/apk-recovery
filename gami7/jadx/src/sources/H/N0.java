package H;

import J.C0274k0;
import m2.C0880v;

/* loaded from: classes.dex */
public final class N0 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1764i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B1 f1765j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N0(B1 b12, int i2) {
        super(1);
        this.f1764i = i2;
        this.f1765j = b12;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f1764i) {
            case 0:
                int i2 = ((E1) obj).f1426a;
                B1 b12 = this.f1765j;
                Long b3 = b12.b();
                if (b3 != null) {
                    b12.c(b12.f1341c.a(b3.longValue()).f1657e);
                }
                b12.f1344f.setValue(new E1(i2));
                return C0880v.f8657a;
            case 1:
                Long l3 = (Long) obj;
                B1 b13 = this.f1765j;
                C0274k0 c0274k0 = b13.f1343e;
                if (l3 != null) {
                    H c3 = b13.f1341c.c(l3.longValue());
                    E2.d dVar = b13.f1339a;
                    int i3 = c3.f1544h;
                    if (!dVar.a(i3)) {
                        throw new IllegalArgumentException(("The provided date's year (" + i3 + ") is out of the years range of " + dVar + '.').toString());
                    }
                    c0274k0.setValue(c3);
                } else {
                    c0274k0.setValue(null);
                }
                return C0880v.f8657a;
            default:
                this.f1765j.c(((Number) obj).longValue());
                return C0880v.f8657a;
        }
    }
}
