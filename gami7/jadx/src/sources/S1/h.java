package S1;

import B1.C;
import J.V0;
import c0.C0578S;
import c0.C0603v;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;

/* loaded from: classes.dex */
public final class h extends m {

    /* renamed from: d, reason: collision with root package name */
    public static final h f5613d;

    static {
        C0712e c0712e = C.f248d;
        if (c0712e == null) {
            C0711d c0711d = new C0711d("Filled.Home", false);
            int i2 = AbstractC0732y.f7958a;
            C0578S c0578s = new C0578S(C0603v.f7272b);
            V0 v0 = new V0(1);
            v0.h(10.0f, 20.0f);
            v0.l(-6.0f);
            v0.e(4.0f);
            v0.l(6.0f);
            v0.e(5.0f);
            v0.l(-8.0f);
            v0.e(3.0f);
            v0.f(12.0f, 3.0f);
            v0.f(2.0f, 12.0f);
            v0.e(3.0f);
            v0.l(8.0f);
            v0.a();
            C0711d.a(c0711d, v0.f4104h, c0578s);
            c0712e = c0711d.b();
            C.f248d = c0712e;
        }
        f5613d = new h("home", "Home", c0712e);
    }
}
