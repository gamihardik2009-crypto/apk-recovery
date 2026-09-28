package W2;

import p1.C1058a;

/* renamed from: W2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411l extends A {

    /* renamed from: b, reason: collision with root package name */
    public static final C0411l f6147b = new C0411l(C0412m.f6148a);

    @Override // W2.A
    public final int c(Object obj) {
        float[] fArr = (float[]) obj;
        z2.h.f(fArr, "<this>");
        return fArr.length;
    }

    @Override // W2.A
    public final void d(C1058a c1058a, Object obj, int i2) {
        float[] fArr = (float[]) obj;
        z2.h.f(c1058a, "encoder");
        z2.h.f(fArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            float f3 = fArr[i3];
            z zVar = this.f6108a;
            z2.h.f(zVar, "descriptor");
            c1058a.f(zVar, i3);
            c1058a.h(f3);
        }
    }
}
