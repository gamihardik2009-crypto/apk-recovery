package W2;

import p1.C1058a;

/* renamed from: W2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405f extends A {

    /* renamed from: b, reason: collision with root package name */
    public static final C0405f f6137b = new C0405f(C0406g.f6138a);

    @Override // W2.A
    public final int c(Object obj) {
        char[] cArr = (char[]) obj;
        z2.h.f(cArr, "<this>");
        return cArr.length;
    }

    @Override // W2.A
    public final void d(C1058a c1058a, Object obj, int i2) {
        char[] cArr = (char[]) obj;
        z2.h.f(c1058a, "encoder");
        z2.h.f(cArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            char c3 = cArr[i3];
            z zVar = this.f6108a;
            z2.h.f(zVar, "descriptor");
            c1058a.f(zVar, i3);
            c1058a.d(c3);
        }
    }
}
