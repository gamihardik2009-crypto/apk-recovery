package W2;

import p1.C1058a;

/* renamed from: W2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400a extends A {

    /* renamed from: b, reason: collision with root package name */
    public static final C0400a f6131b = new C0400a(C0401b.f6132a);

    @Override // W2.A
    public final int c(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        z2.h.f(zArr, "<this>");
        return zArr.length;
    }

    @Override // W2.A
    public final void d(C1058a c1058a, Object obj, int i2) {
        boolean[] zArr = (boolean[]) obj;
        z2.h.f(c1058a, "encoder");
        z2.h.f(zArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z3 = zArr[i3];
            z zVar = this.f6108a;
            z2.h.f(zVar, "descriptor");
            c1058a.f(zVar, i3);
            c1058a.b(z3);
        }
    }
}
