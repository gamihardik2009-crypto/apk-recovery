package W2;

import p1.C1058a;

/* renamed from: W2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407h extends A {

    /* renamed from: b, reason: collision with root package name */
    public static final C0407h f6140b = new C0407h(C0408i.f6141a);

    @Override // W2.A
    public final int c(Object obj) {
        double[] dArr = (double[]) obj;
        z2.h.f(dArr, "<this>");
        return dArr.length;
    }

    @Override // W2.A
    public final void d(C1058a c1058a, Object obj, int i2) {
        double[] dArr = (double[]) obj;
        z2.h.f(c1058a, "encoder");
        z2.h.f(dArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            double d3 = dArr[i3];
            z zVar = this.f6108a;
            z2.h.f(zVar, "descriptor");
            c1058a.f(zVar, i3);
            c1058a.e(d3);
        }
    }
}
