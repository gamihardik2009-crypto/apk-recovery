package H;

import C0.C0024g;

/* loaded from: classes.dex */
public final class C1 implements I0.I {

    /* renamed from: a, reason: collision with root package name */
    public final C0189s0 f1365a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1366b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1367c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1368d;

    /* renamed from: e, reason: collision with root package name */
    public final B.F f1369e;

    public C1(C0189s0 c0189s0) {
        this.f1365a = c0189s0;
        String str = c0189s0.f3073a;
        char c3 = c0189s0.f3074b;
        this.f1366b = H2.l.T(str, c3, 0, false, 6);
        this.f1367c = H2.l.W(c0189s0.f3073a, c3);
        this.f1368d = c0189s0.f3075c.length();
        this.f1369e = new B.F(4, this);
    }

    @Override // I0.I
    public final I0.G b(C0024g c0024g) {
        int length = c0024g.f500a.length();
        int i2 = 0;
        String str = c0024g.f500a;
        int i3 = this.f1368d;
        if (length > i3) {
            E2.d m02 = B1.C.m0(0, i3);
            z2.h.f(str, "<this>");
            z2.h.f(m02, "range");
            str = str.substring(m02.f1076h, m02.f1077i + 1);
            z2.h.e(str, "substring(...)");
        }
        String str2 = "";
        int i4 = 0;
        while (i2 < str.length()) {
            int i5 = i4 + 1;
            str2 = str2 + str.charAt(i2);
            if (i5 == this.f1366b || i4 + 2 == this.f1367c) {
                str2 = str2 + this.f1365a.f3074b;
            }
            i2++;
            i4 = i5;
        }
        return new I0.G(new C0024g(str2, null, 6), this.f1369e);
    }
}
