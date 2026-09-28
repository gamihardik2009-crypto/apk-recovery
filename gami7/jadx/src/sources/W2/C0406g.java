package W2;

import p1.C1058a;

/* renamed from: W2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406g implements T2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0406g f6138a = new C0406g();

    /* renamed from: b, reason: collision with root package name */
    public static final B f6139b = new B("kotlin.Char", U2.d.f5806h);

    @Override // T2.a
    public final void a(C1058a c1058a, Object obj) {
        char charValue = ((Character) obj).charValue();
        z2.h.f(c1058a, "encoder");
        c1058a.d(charValue);
    }

    @Override // T2.a
    public final U2.f b() {
        return f6139b;
    }
}
