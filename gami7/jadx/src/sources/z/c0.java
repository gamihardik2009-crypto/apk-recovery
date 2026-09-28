package z;

import H.R3;
import c0.AbstractC0598q;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f11628a;

    static {
        B.F f3 = new B.F(23);
        f3.t(Float.valueOf(1.0f), 0);
        f3.t(Float.valueOf(1.0f), 499);
        f3.t(Float.valueOf(0.0f), 500);
        f3.t(Float.valueOf(0.0f), 999);
        f11628a = 2;
    }

    public static final V.o a(S s3, I0.z zVar, I0.s sVar, AbstractC0598q abstractC0598q, boolean z3) {
        V.l lVar = V.l.f5857b;
        return z3 ? V.a.b(lVar, new R3(abstractC0598q, s3, zVar, sVar, 2)) : lVar;
    }
}
