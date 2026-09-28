package W2;

import p1.C1058a;

/* loaded from: classes.dex */
public final class E implements T2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final E f6113a = new E();

    /* renamed from: b, reason: collision with root package name */
    public static final B f6114b = new B("kotlin.Short", U2.d.f5811m);

    @Override // T2.a
    public final void a(C1058a c1058a, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        z2.h.f(c1058a, "encoder");
        c1058a.m(shortValue);
    }

    @Override // T2.a
    public final U2.f b() {
        return f6114b;
    }
}
