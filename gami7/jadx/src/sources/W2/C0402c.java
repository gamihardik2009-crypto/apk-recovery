package W2;

import p1.C1058a;

/* renamed from: W2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402c extends A {

    /* renamed from: b, reason: collision with root package name */
    public static final C0402c f6134b = new C0402c(C0403d.f6135a);

    @Override // W2.A
    public final int c(Object obj) {
        byte[] bArr = (byte[]) obj;
        z2.h.f(bArr, "<this>");
        return bArr.length;
    }

    @Override // W2.A
    public final void d(C1058a c1058a, Object obj, int i2) {
        byte[] bArr = (byte[]) obj;
        z2.h.f(c1058a, "encoder");
        z2.h.f(bArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            byte b3 = bArr[i3];
            z zVar = this.f6108a;
            z2.h.f(zVar, "descriptor");
            c1058a.f(zVar, i3);
            c1058a.c(b3);
        }
    }
}
