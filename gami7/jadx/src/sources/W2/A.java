package W2;

import p1.C1058a;

/* loaded from: classes.dex */
public abstract class A implements T2.a {

    /* renamed from: a, reason: collision with root package name */
    public final z f6108a;

    public A(T2.a aVar) {
        this.f6108a = new z(aVar.b());
    }

    @Override // T2.a
    public final void a(C1058a c1058a, Object obj) {
        z2.h.f(c1058a, "encoder");
        int c3 = c(obj);
        z2.h.f(this.f6108a, "descriptor");
        d(c1058a, obj, c3);
    }

    @Override // T2.a
    public final U2.f b() {
        return this.f6108a;
    }

    public abstract int c(Object obj);

    public abstract void d(C1058a c1058a, Object obj, int i2);
}
