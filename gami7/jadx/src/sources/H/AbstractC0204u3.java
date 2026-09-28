package H;

import J.C0285q;
import c0.AbstractC0571K;
import c0.InterfaceC0576P;
import m.AbstractC0837j;
import s.AbstractC1166e;
import y.C1394b;
import y.C1396d;

/* renamed from: H.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0204u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final J.X0 f3177a = new J.X0(C0100f0.f2569u);

    public static final InterfaceC0576P a(int i2, C0285q c0285q) {
        C0198t3 c0198t3 = (C0198t3) c0285q.l(f3177a);
        switch (AbstractC0837j.d(i2)) {
            case 0:
                return c0198t3.f3138e;
            case 1:
                return b(c0198t3.f3138e);
            case 2:
                return c0198t3.f3134a;
            case 3:
                return b(c0198t3.f3134a);
            case 4:
                return y.e.f11486a;
            case AbstractC1166e.f10138f /* 5 */:
                return c0198t3.f3137d;
            case AbstractC1166e.f10136d /* 6 */:
                float f3 = (float) 0.0d;
                return C1396d.a(c0198t3.f3137d, new C1394b(f3), null, null, new C1394b(f3), 6);
            case 7:
                return b(c0198t3.f3137d);
            case 8:
                return c0198t3.f3136c;
            case AbstractC1166e.f10135c /* 9 */:
                return AbstractC0571K.f7193a;
            case AbstractC1166e.f10137e /* 10 */:
                return c0198t3.f3135b;
            default:
                throw new J2.r();
        }
    }

    public static final C1396d b(C1396d c1396d) {
        float f3 = (float) 0.0d;
        return C1396d.a(c1396d, null, null, new C1394b(f3), new C1394b(f3), 3);
    }
}
