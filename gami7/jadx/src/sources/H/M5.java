package H;

import J.C0257c;
import J.C0261e;
import J.C0266g0;
import J.C0274k0;
import java.util.concurrent.atomic.AtomicReference;
import m.AbstractC0831e;
import m.C0829d;

/* loaded from: classes.dex */
public final class M5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1753a;

    /* renamed from: b, reason: collision with root package name */
    public final C0274k0 f1754b;

    /* renamed from: c, reason: collision with root package name */
    public final C0274k0 f1755c;

    /* renamed from: d, reason: collision with root package name */
    public final C0274k0 f1756d;

    /* renamed from: e, reason: collision with root package name */
    public final C0266g0 f1757e;

    /* renamed from: f, reason: collision with root package name */
    public final C0266g0 f1758f;

    /* renamed from: g, reason: collision with root package name */
    public final J.F f1759g;

    /* renamed from: h, reason: collision with root package name */
    public final C0829d f1760h;

    public M5(int i2, int i3, boolean z3) {
        if (i2 < 0 || i2 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range".toString());
        }
        if (i3 < 0 || i3 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        this.f1753a = z3;
        J.W w2 = J.W.f4109m;
        K1.m mVar = J.M0.f4051a;
        new C0261e(0);
        new J.D();
        C0257c.N(new O0.h(0L), J.W.f4109m);
        this.f1754b = C0257c.N(new C0186r3(0), w2);
        this.f1755c = C0257c.N(Boolean.valueOf(i2 >= 12 && !z3), w2);
        this.f1756d = C0257c.N(Boolean.valueOf(i2 >= 12), w2);
        C0266g0 L3 = C0257c.L(((i2 % 12) * 0.5235988f) - 1.5707964f);
        this.f1757e = L3;
        this.f1758f = C0257c.L((i3 * 0.10471976f) - 1.5707964f);
        new AtomicReference(null);
        S2.e.a();
        this.f1759g = C0257c.F(new w5(this, 4));
        this.f1760h = AbstractC0831e.a(L3.g());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(q2.InterfaceC1073d r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof H.L5
            if (r0 == 0) goto L14
            r0 = r10
            H.L5 r0 = (H.L5) r0
            int r1 = r0.f1721o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f1721o = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            H.L5 r0 = new H.L5
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.f1719m
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r5.f1721o
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2e
            C1.y.J(r10)
            goto Laf
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            float r1 = r5.f1718l
            H.M5 r4 = r5.f1717k
            C1.y.J(r10)
            goto L8e
        L3e:
            C1.y.J(r10)
            int r10 = r9.e()
            boolean r10 = H.C0186r3.a(r10, r2)
            J.g0 r1 = r9.f1757e
            J.g0 r6 = r9.f1758f
            if (r10 == 0) goto L5c
            float r10 = r6.g()
            float r1 = r1.g()
            m2.g r10 = H.K5.j(r10, r1)
            goto L68
        L5c:
            float r10 = r1.g()
            float r1 = r6.g()
            m2.g r10 = H.K5.j(r10, r1)
        L68:
            java.lang.Object r1 = r10.f8646h
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r10 = r10.f8647i
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            r5.f1717k = r9
            r5.f1718l = r10
            r5.f1721o = r4
            m.d r1 = r9.f1760h
            java.lang.Object r1 = r1.e(r6, r5)
            if (r1 != r0) goto L8c
            return r0
        L8c:
            r4 = r9
            r1 = r10
        L8e:
            m.d r10 = r4.f1760h
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r1)
            r1 = 200(0xc8, float:2.8E-43)
            r6 = 0
            r7 = 6
            m.w0 r7 = m.AbstractC0831e.n(r1, r2, r6, r7)
            r5.f1717k = r6
            r5.f1721o = r3
            r8 = 12
            r1 = r10
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r8
            java.lang.Object r10 = m.C0829d.b(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto Laf
            return r0
        Laf:
            m2.v r10 = m2.C0880v.f8657a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: H.M5.a(q2.d):java.lang.Object");
    }

    public final int b() {
        return (((int) ((this.f1757e.g() + (0.2617994f + 1.5707963267948966d)) / 0.5235988f)) % 12) + (((Boolean) this.f1759g.getValue()).booleanValue() ? 12 : 0);
    }

    public final int c() {
        int b3 = b();
        if (this.f1753a) {
            return b3 % 24;
        }
        if (b3 % 12 == 0) {
            return 12;
        }
        return ((Boolean) this.f1759g.getValue()).booleanValue() ? b3 - 12 : b3;
    }

    public final int d() {
        return ((int) ((this.f1758f.g() + (0.05235988f + 1.5707963267948966d)) / 0.10471976f)) % 60;
    }

    public final int e() {
        return ((C0186r3) this.f1754b.getValue()).f3063a;
    }

    public final void f(int i2) {
        this.f1756d.setValue(Boolean.valueOf(i2 >= 12));
        this.f1757e.h(((i2 % 12) * 0.5235988f) - 1.5707964f);
    }

    public final void g(int i2) {
        this.f1754b.setValue(new C0186r3(i2));
    }
}
