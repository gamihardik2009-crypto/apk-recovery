package W2;

import p1.C1058a;

/* renamed from: W2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401b implements T2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0401b f6132a = new C0401b();

    /* renamed from: b, reason: collision with root package name */
    public static final B f6133b = new B("kotlin.Boolean", U2.d.f5804f);

    @Override // T2.a
    public final void a(C1058a c1058a, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        z2.h.f(c1058a, "encoder");
        c1058a.b(booleanValue);
    }

    @Override // T2.a
    public final U2.f b() {
        return f6133b;
    }
}
