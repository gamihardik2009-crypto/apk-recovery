package W2;

import p1.C1058a;

/* loaded from: classes.dex */
public final class r extends A {

    /* renamed from: b, reason: collision with root package name */
    public static final r f6156b = new r(s.f6157a);

    @Override // W2.A
    public final int c(Object obj) {
        long[] jArr = (long[]) obj;
        z2.h.f(jArr, "<this>");
        return jArr.length;
    }

    @Override // W2.A
    public final void d(C1058a c1058a, Object obj, int i2) {
        long[] jArr = (long[]) obj;
        z2.h.f(c1058a, "encoder");
        z2.h.f(jArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = jArr[i3];
            z zVar = this.f6108a;
            z2.h.f(zVar, "descriptor");
            c1058a.f(zVar, i3);
            c1058a.j(j3);
        }
    }
}
