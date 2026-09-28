package s;

import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1126o;
import t0.InterfaceC1264w;

/* loaded from: classes.dex */
public final class U extends V.n implements InterfaceC1264w {

    /* renamed from: u, reason: collision with root package name */
    public float f10080u;

    /* renamed from: v, reason: collision with root package name */
    public float f10081v;

    /* renamed from: w, reason: collision with root package name */
    public float f10082w;

    /* renamed from: x, reason: collision with root package name */
    public float f10083x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10084y;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long K0(O0.b r8) {
        /*
            r7 = this;
            float r0 = r7.f10082w
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = O0.e.a(r0, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L18
            float r0 = r7.f10082w
            int r0 = r8.l(r0)
            if (r0 >= 0) goto L19
            r0 = r3
            goto L19
        L18:
            r0 = r2
        L19:
            float r4 = r7.f10083x
            boolean r4 = O0.e.a(r4, r1)
            if (r4 != 0) goto L2b
            float r4 = r7.f10083x
            int r4 = r8.l(r4)
            if (r4 >= 0) goto L2c
            r4 = r3
            goto L2c
        L2b:
            r4 = r2
        L2c:
            float r5 = r7.f10080u
            boolean r5 = O0.e.a(r5, r1)
            if (r5 != 0) goto L43
            float r5 = r7.f10080u
            int r5 = r8.l(r5)
            if (r5 <= r0) goto L3d
            r5 = r0
        L3d:
            if (r5 >= 0) goto L40
            r5 = r3
        L40:
            if (r5 == r2) goto L43
            goto L44
        L43:
            r5 = r3
        L44:
            float r6 = r7.f10081v
            boolean r1 = O0.e.a(r6, r1)
            if (r1 != 0) goto L5b
            float r1 = r7.f10081v
            int r8 = r8.l(r1)
            if (r8 <= r4) goto L55
            r8 = r4
        L55:
            if (r8 >= 0) goto L58
            r8 = r3
        L58:
            if (r8 == r2) goto L5b
            r3 = r8
        L5b:
            long r0 = B1.C.b(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.U.K0(O0.b):long");
    }

    @Override // t0.InterfaceC1264w
    public final int a(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        long K02 = K0(interfaceC1126o);
        return O0.a.e(K02) ? O0.a.g(K02) : B1.C.J(K02, interfaceC1093G.b0(i2));
    }

    @Override // t0.InterfaceC1264w
    public final int b(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        long K02 = K0(interfaceC1126o);
        return O0.a.e(K02) ? O0.a.g(K02) : B1.C.J(K02, interfaceC1093G.b(i2));
    }

    @Override // t0.InterfaceC1264w
    public final int d(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        long K02 = K0(interfaceC1126o);
        return O0.a.f(K02) ? O0.a.h(K02) : B1.C.K(K02, interfaceC1093G.a0(i2));
    }

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        int j4;
        int h2;
        int i2;
        int g3;
        long b3;
        long K02 = K0(interfaceC1096J);
        if (this.f10084y) {
            b3 = B1.C.I(j3, K02);
        } else {
            if (O0.e.a(this.f10080u, Float.NaN)) {
                j4 = O0.a.j(j3);
                int h3 = O0.a.h(K02);
                if (j4 > h3) {
                    j4 = h3;
                }
            } else {
                j4 = O0.a.j(K02);
            }
            if (O0.e.a(this.f10082w, Float.NaN)) {
                h2 = O0.a.h(j3);
                int j5 = O0.a.j(K02);
                if (h2 < j5) {
                    h2 = j5;
                }
            } else {
                h2 = O0.a.h(K02);
            }
            if (O0.e.a(this.f10081v, Float.NaN)) {
                i2 = O0.a.i(j3);
                int g4 = O0.a.g(K02);
                if (i2 > g4) {
                    i2 = g4;
                }
            } else {
                i2 = O0.a.i(K02);
            }
            if (O0.e.a(this.f10083x, Float.NaN)) {
                g3 = O0.a.g(j3);
                int i3 = O0.a.i(K02);
                if (g3 < i3) {
                    g3 = i3;
                }
            } else {
                g3 = O0.a.g(K02);
            }
            b3 = B1.C.b(j4, h2, i2, g3);
        }
        AbstractC1103Q a3 = interfaceC1093G.a(b3);
        return interfaceC1096J.C(a3.f9834h, a3.f9835i, C0971w.f9166h, new C.h(a3, 11));
    }

    @Override // t0.InterfaceC1264w
    public final int h(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        long K02 = K0(interfaceC1126o);
        return O0.a.f(K02) ? O0.a.h(K02) : B1.C.K(K02, interfaceC1093G.L(i2));
    }
}
