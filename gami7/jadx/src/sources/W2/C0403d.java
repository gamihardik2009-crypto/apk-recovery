package W2;

import p1.C1058a;

/* renamed from: W2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403d implements T2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0403d f6135a = new C0403d();

    /* renamed from: b, reason: collision with root package name */
    public static final B f6136b = new B("kotlin.Byte", U2.d.f5805g);

    @Override // T2.a
    public final void a(C1058a c1058a, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        z2.h.f(c1058a, "encoder");
        c1058a.c(byteValue);
    }

    @Override // T2.a
    public final U2.f b() {
        return f6136b;
    }
}
