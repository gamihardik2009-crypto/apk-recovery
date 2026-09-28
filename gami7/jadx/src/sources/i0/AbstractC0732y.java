package i0;

import c0.AbstractC0571K;
import c0.C0594m;
import c0.C0603v;

/* renamed from: i0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0732y {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7958a = 0;

    static {
        int i2 = C0603v.f7278h;
    }

    public static final boolean a(C0594m c0594m) {
        if (c0594m instanceof C0594m) {
            if (AbstractC0571K.m(c0594m.f7266c, 5) || AbstractC0571K.m(c0594m.f7266c, 3)) {
                return true;
            }
        } else if (c0594m == null) {
            return true;
        }
        return false;
    }
}
