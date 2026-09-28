package W2;

import p1.C1058a;

/* loaded from: classes.dex */
public final class s implements T2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s f6157a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final B f6158b = new B("kotlin.Long", U2.d.f5810l);

    @Override // T2.a
    public final void a(C1058a c1058a, Object obj) {
        long longValue = ((Number) obj).longValue();
        z2.h.f(c1058a, "encoder");
        c1058a.j(longValue);
    }

    @Override // T2.a
    public final U2.f b() {
        return f6158b;
    }
}
