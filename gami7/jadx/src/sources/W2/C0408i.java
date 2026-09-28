package W2;

import p1.C1058a;

/* renamed from: W2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408i implements T2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0408i f6141a = new C0408i();

    /* renamed from: b, reason: collision with root package name */
    public static final B f6142b = new B("kotlin.Double", U2.d.f5807i);

    @Override // T2.a
    public final void a(C1058a c1058a, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        z2.h.f(c1058a, "encoder");
        c1058a.e(doubleValue);
    }

    @Override // T2.a
    public final U2.f b() {
        return f6142b;
    }
}
