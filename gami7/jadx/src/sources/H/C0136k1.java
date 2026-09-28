package H;

import a.AbstractC0423a;
import a0.AbstractC0427d;
import a0.C0442s;
import java.util.Map;
import l.C0805n;
import l.C0811u;
import m.AbstractC0831e;

/* renamed from: H.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136k1 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2799i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2800j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0136k1(int i2, int i3) {
        super(1);
        this.f2799i = i3;
        this.f2800j = i2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C0811u H3;
        int i2 = 1;
        int i3 = this.f2800j;
        switch (this.f2799i) {
            case 0:
                ((Number) obj).intValue();
                return Integer.valueOf(i3);
            case 1:
                ((Number) obj).intValue();
                return Integer.valueOf(i3);
            case 2:
                if (E1.a(((E1) ((C0805n) obj).c()).f1426a, 1)) {
                    C0200u c0200u = C0200u.f3152r;
                    m.x0 x0Var = l.z.f8260a;
                    Map map = m.E0.f8301a;
                    H3 = B2.a.H(l.z.h(AbstractC0831e.m(400.0f, new O0.h(AbstractC0423a.m(1, 1)), 1), c0200u).a(l.z.c(AbstractC0831e.n(100, 100, null, 4), 0.0f, 2)), l.z.d(AbstractC0831e.n(100, 0, null, 6), 2).a(l.z.i(new C0136k1(i3, r1 ? 1 : 0))));
                } else {
                    H3 = B2.a.H(l.z.h(AbstractC0831e.n(0, 50, null, 5), new C0136k1(i3, i2)).a(l.z.c(AbstractC0831e.n(100, 100, null, 4), 0.0f, 2)), l.z.i(C0200u.f3153s).a(l.z.d(AbstractC0831e.n(100, 0, null, 6), 2)));
                }
                H3.f8245d = new l.S(true, C0114h0.f2658z);
                return H3;
            case 3:
                Boolean C3 = AbstractC0427d.C((C0442s) obj, i3);
                return Boolean.valueOf(C3 != null ? C3.booleanValue() : false);
            default:
                Boolean C4 = AbstractC0427d.C((C0442s) obj, i3);
                return Boolean.valueOf(C4 != null ? C4.booleanValue() : false);
        }
    }
}
