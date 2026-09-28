package D;

import C0.C0024g;
import I0.C0244a;
import I0.InterfaceC0252i;
import java.util.List;
import n2.AbstractC0962n;
import n2.AbstractC0963o;
import z.p0;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final C0024g f765a;

    /* renamed from: b, reason: collision with root package name */
    public final long f766b;

    /* renamed from: c, reason: collision with root package name */
    public final C0.H f767c;

    /* renamed from: d, reason: collision with root package name */
    public final I0.s f768d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f769e;

    /* renamed from: f, reason: collision with root package name */
    public long f770f;

    /* renamed from: g, reason: collision with root package name */
    public final C0024g f771g;

    /* renamed from: h, reason: collision with root package name */
    public final I0.z f772h;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f773i;

    public T(I0.z zVar, I0.s sVar, p0 p0Var, f0 f0Var) {
        C0024g c0024g = zVar.f3932a;
        C0.H h2 = p0Var != null ? p0Var.f11788a : null;
        long j3 = zVar.f3933b;
        this.f765a = c0024g;
        this.f766b = j3;
        this.f767c = h2;
        this.f768d = sVar;
        this.f769e = f0Var;
        this.f770f = j3;
        this.f771g = c0024g;
        this.f772h = zVar;
        this.f773i = p0Var;
    }

    public final List a(y2.c cVar) {
        if (!C0.J.b(this.f770f)) {
            return AbstractC0963o.v(new C0244a("", 0), new I0.x(C0.J.e(this.f770f), C0.J.e(this.f770f)));
        }
        InterfaceC0252i interfaceC0252i = (InterfaceC0252i) cVar.l(this);
        if (interfaceC0252i != null) {
            return AbstractC0962n.l(interfaceC0252i);
        }
        return null;
    }

    public final Integer b() {
        C0.H h2 = this.f767c;
        if (h2 == null) {
            return null;
        }
        int d3 = C0.J.d(this.f770f);
        I0.s sVar = this.f768d;
        return Integer.valueOf(sVar.i(h2.d(h2.e(sVar.l(d3)), true)));
    }

    public final Integer c() {
        C0.H h2 = this.f767c;
        if (h2 == null) {
            return null;
        }
        int e3 = C0.J.e(this.f770f);
        I0.s sVar = this.f768d;
        return Integer.valueOf(sVar.i(h2.h(h2.e(sVar.l(e3)))));
    }

    public final Integer d() {
        int length;
        C0.H h2 = this.f767c;
        if (h2 == null) {
            return null;
        }
        int q = q();
        while (true) {
            C0024g c0024g = this.f765a;
            if (q < c0024g.f500a.length()) {
                int length2 = this.f771g.f500a.length() - 1;
                if (q <= length2) {
                    length2 = q;
                }
                long k3 = h2.k(length2);
                int i2 = C0.J.f472c;
                int i3 = (int) (k3 & 4294967295L);
                if (i3 > q) {
                    length = this.f768d.i(i3);
                    break;
                }
                q++;
            } else {
                length = c0024g.f500a.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i2;
        C0.H h2 = this.f767c;
        if (h2 == null) {
            return null;
        }
        int q = q();
        while (true) {
            if (q <= 0) {
                i2 = 0;
                break;
            }
            int length = this.f771g.f500a.length() - 1;
            if (q <= length) {
                length = q;
            }
            long k3 = h2.k(length);
            int i3 = C0.J.f472c;
            int i4 = (int) (k3 >> 32);
            if (i4 < q) {
                i2 = this.f768d.i(i4);
                break;
            }
            q--;
        }
        return Integer.valueOf(i2);
    }

    public final boolean f() {
        C0.H h2 = this.f767c;
        return (h2 != null ? h2.i(q()) : null) != N0.h.f4990i;
    }

    public final int g(C0.H h2, int i2) {
        int q = q();
        f0 f0Var = this.f769e;
        if (f0Var.f845a == null) {
            f0Var.f845a = Float.valueOf(h2.c(q).f7060a);
        }
        int e3 = h2.e(q) + i2;
        if (e3 < 0) {
            return 0;
        }
        C0.o oVar = h2.f462b;
        if (e3 >= oVar.f528f) {
            return this.f771g.f500a.length();
        }
        float b3 = oVar.b(e3) - 1;
        Float f3 = f0Var.f845a;
        z2.h.c(f3);
        float floatValue = f3.floatValue();
        if ((f() && floatValue >= h2.g(e3)) || (!f() && floatValue <= h2.f(e3))) {
            return h2.d(e3, true);
        }
        return this.f768d.i(oVar.e(K1.f.e(f3.floatValue(), b3)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(z.p0 r6, int r7) {
        /*
            r5 = this;
            r0.r r0 = r6.f11789b
            if (r0 == 0) goto L11
            r0.r r1 = r6.f11790c
            if (r1 == 0) goto Le
            r2 = 1
            b0.d r0 = r1.D(r0, r2)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L13
        L11:
            b0.d r0 = b0.d.f7059e
        L13:
            I0.z r1 = r5.f772h
            long r1 = r1.f3933b
            int r3 = C0.J.f472c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            I0.s r2 = r5.f768d
            int r1 = r2.l(r1)
            C0.H r6 = r6.f11788a
            b0.d r1 = r6.c(r1)
            float r3 = r0.d()
            float r0 = r0.c()
            long r3 = B1.C.i(r3, r0)
            float r0 = b0.f.b(r3)
            float r7 = (float) r7
            float r0 = r0 * r7
            float r7 = r1.f7061b
            float r0 = r0 + r7
            float r7 = r1.f7060a
            long r0 = K1.f.e(r7, r0)
            C0.o r6 = r6.f462b
            int r6 = r6.e(r0)
            int r6 = r2.i(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D.T.h(z.p0, int):int");
    }

    public final void i() {
        C0024g c0024g = this.f771g;
        f0 f0Var = this.f769e;
        f0Var.f845a = null;
        if (c0024g.f500a.length() > 0) {
            if (f()) {
                f0Var.f845a = null;
                if (c0024g.f500a.length() > 0) {
                    String str = c0024g.f500a;
                    long j3 = this.f770f;
                    int i2 = C0.J.f472c;
                    int p3 = z.N.p(str, (int) (j3 & 4294967295L));
                    if (p3 != -1) {
                        p(p3, p3);
                        return;
                    }
                    return;
                }
                return;
            }
            f0Var.f845a = null;
            if (c0024g.f500a.length() > 0) {
                String str2 = c0024g.f500a;
                long j4 = this.f770f;
                int i3 = C0.J.f472c;
                int m3 = z.N.m(str2, (int) (j4 & 4294967295L));
                if (m3 != -1) {
                    p(m3, m3);
                }
            }
        }
    }

    public final void j() {
        this.f769e.f845a = null;
        C0024g c0024g = this.f771g;
        if (c0024g.f500a.length() > 0) {
            int d3 = C0.J.d(this.f770f);
            String str = c0024g.f500a;
            int n3 = z.N.n(str, d3);
            if (n3 == C0.J.d(this.f770f) && n3 != str.length()) {
                n3 = z.N.n(str, n3 + 1);
            }
            p(n3, n3);
        }
    }

    public final void k() {
        this.f769e.f845a = null;
        C0024g c0024g = this.f771g;
        if (c0024g.f500a.length() > 0) {
            int e3 = C0.J.e(this.f770f);
            String str = c0024g.f500a;
            int o3 = z.N.o(str, e3);
            if (o3 == C0.J.e(this.f770f) && o3 != 0) {
                o3 = z.N.o(str, o3 - 1);
            }
            p(o3, o3);
        }
    }

    public final void l() {
        C0024g c0024g = this.f771g;
        f0 f0Var = this.f769e;
        f0Var.f845a = null;
        if (c0024g.f500a.length() > 0) {
            if (f()) {
                f0Var.f845a = null;
                if (c0024g.f500a.length() > 0) {
                    String str = c0024g.f500a;
                    long j3 = this.f770f;
                    int i2 = C0.J.f472c;
                    int m3 = z.N.m(str, (int) (j3 & 4294967295L));
                    if (m3 != -1) {
                        p(m3, m3);
                        return;
                    }
                    return;
                }
                return;
            }
            f0Var.f845a = null;
            if (c0024g.f500a.length() > 0) {
                String str2 = c0024g.f500a;
                long j4 = this.f770f;
                int i3 = C0.J.f472c;
                int p3 = z.N.p(str2, (int) (j4 & 4294967295L));
                if (p3 != -1) {
                    p(p3, p3);
                }
            }
        }
    }

    public final void m() {
        Integer b3;
        this.f769e.f845a = null;
        if (this.f771g.f500a.length() <= 0 || (b3 = b()) == null) {
            return;
        }
        int intValue = b3.intValue();
        p(intValue, intValue);
    }

    public final void n() {
        Integer c3;
        this.f769e.f845a = null;
        if (this.f771g.f500a.length() <= 0 || (c3 = c()) == null) {
            return;
        }
        int intValue = c3.intValue();
        p(intValue, intValue);
    }

    public final void o() {
        if (this.f771g.f500a.length() > 0) {
            int i2 = C0.J.f472c;
            this.f770f = B1.C.j((int) (this.f766b >> 32), (int) (this.f770f & 4294967295L));
        }
    }

    public final void p(int i2, int i3) {
        this.f770f = B1.C.j(i2, i3);
    }

    public final int q() {
        long j3 = this.f770f;
        int i2 = C0.J.f472c;
        return this.f768d.l((int) (j3 & 4294967295L));
    }
}
