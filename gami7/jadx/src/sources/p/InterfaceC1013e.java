package p;

import m.InterfaceC0840m;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1013e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1011d f9585a = C1011d.f9576a;

    default float a(float f3, float f4, float f5) {
        f9585a.getClass();
        float f6 = f4 + f3;
        if ((f3 >= 0.0f && f6 <= f5) || (f3 < 0.0f && f6 > f5)) {
            return 0.0f;
        }
        float f7 = f6 - f5;
        return Math.abs(f3) < Math.abs(f7) ? f3 : f7;
    }

    default InterfaceC0840m b() {
        f9585a.getClass();
        return C1011d.f9577b;
    }
}
