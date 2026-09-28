package W2;

import p1.C1058a;

/* loaded from: classes.dex */
public final class D extends A {

    /* renamed from: b, reason: collision with root package name */
    public static final D f6112b = new D(E.f6113a);

    @Override // W2.A
    public final int c(Object obj) {
        short[] sArr = (short[]) obj;
        z2.h.f(sArr, "<this>");
        return sArr.length;
    }

    @Override // W2.A
    public final void d(C1058a c1058a, Object obj, int i2) {
        short[] sArr = (short[]) obj;
        z2.h.f(c1058a, "encoder");
        z2.h.f(sArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            short s3 = sArr[i3];
            z zVar = this.f6108a;
            z2.h.f(zVar, "descriptor");
            c1058a.f(zVar, i3);
            c1058a.m(s3);
        }
    }
}
