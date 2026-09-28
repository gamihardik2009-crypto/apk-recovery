package X1;

import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.C0093e0;
import J.C0285q;
import J.V0;
import c0.C0578S;
import c0.C0603v;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import m2.C0880v;

/* loaded from: classes.dex */
public final class g implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public static final g f6229h = new g();

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            C0712e c0712e = l0.c.f8281c;
            if (c0712e == null) {
                C0711d c0711d = new C0711d("Filled.Search", false);
                int i2 = AbstractC0732y.f7958a;
                C0578S c0578s = new C0578S(C0603v.f7272b);
                V0 v0 = new V0(1);
                v0.h(15.5f, 14.0f);
                v0.e(-0.79f);
                v0.g(-0.28f, -0.27f);
                v0.b(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
                v0.b(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
                v0.i(3.0f, 5.91f, 3.0f, 9.5f);
                v0.i(5.91f, 16.0f, 9.5f, 16.0f);
                v0.c(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
                v0.g(0.27f, 0.28f);
                v0.l(0.79f);
                v0.g(5.0f, 4.99f);
                v0.f(20.49f, 19.0f);
                v0.g(-4.99f, -5.0f);
                v0.a();
                v0.h(9.5f, 14.0f);
                v0.b(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
                v0.i(7.01f, 5.0f, 9.5f, 5.0f);
                v0.i(14.0f, 7.01f, 14.0f, 9.5f);
                v0.i(11.99f, 14.0f, 9.5f, 14.0f);
                v0.a();
                C0711d.a(c0711d, v0.f4104h, c0578s);
                c0712e = c0711d.b();
                l0.c.f8281c = c0712e;
            }
            AbstractC0088d2.a(c0712e, null, null, ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2483a, c0285q, 48, 4);
        }
        return C0880v.f8657a;
    }
}
