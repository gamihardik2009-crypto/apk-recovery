package W2;

import p1.C1058a;

/* loaded from: classes.dex */
public final class p extends A {

    /* renamed from: b, reason: collision with root package name */
    public static final p f6153b = new p(q.f6154a);

    @Override // W2.A
    public final int c(Object obj) {
        int[] iArr = (int[]) obj;
        z2.h.f(iArr, "<this>");
        return iArr.length;
    }

    @Override // W2.A
    public final void d(C1058a c1058a, Object obj, int i2) {
        int[] iArr = (int[]) obj;
        z2.h.f(c1058a, "encoder");
        z2.h.f(iArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            z zVar = this.f6108a;
            z2.h.f(zVar, "descriptor");
            c1058a.f(zVar, i3);
            c1058a.i(i4);
        }
    }
}
