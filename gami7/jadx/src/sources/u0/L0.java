package u0;

import C0.C0018a;
import android.graphics.Canvas;
import android.os.Build;
import c0.AbstractC0569I;
import c0.AbstractC0571K;
import c0.AbstractC0585d;
import c0.C0565E;
import c0.C0573M;
import c0.C0580U;
import c0.C0589h;
import c0.C0601t;
import c0.InterfaceC0600s;
import f0.C0663b;
import n1.C0944e;

/* loaded from: classes.dex */
public final class L0 implements t0.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final C1314v f10911h;

    /* renamed from: i, reason: collision with root package name */
    public y2.e f10912i;

    /* renamed from: j, reason: collision with root package name */
    public y2.a f10913j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10914k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10916m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10917n;

    /* renamed from: o, reason: collision with root package name */
    public C0589h f10918o;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC1302o0 f10921s;

    /* renamed from: t, reason: collision with root package name */
    public int f10922t;

    /* renamed from: l, reason: collision with root package name */
    public final D0 f10915l = new D0();

    /* renamed from: p, reason: collision with root package name */
    public final A0 f10919p = new A0(C1290i0.f11059k);
    public final C0601t q = new C0601t();

    /* renamed from: r, reason: collision with root package name */
    public long f10920r = C0580U.f7240b;

    public L0(C1314v c1314v, C0018a c0018a, C0944e c0944e) {
        this.f10911h = c1314v;
        this.f10912i = c0018a;
        this.f10913j = c0944e;
        InterfaceC1302o0 j02 = Build.VERSION.SDK_INT >= 29 ? new J0() : new H0(c1314v);
        j02.H();
        j02.E(false);
        this.f10921s = j02;
    }

    @Override // t0.e0
    public final void a(C0573M c0573m) {
        y2.a aVar;
        int i2 = c0573m.f7199h | this.f10922t;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            this.f10920r = c0573m.f7211u;
        }
        InterfaceC1302o0 interfaceC1302o0 = this.f10921s;
        boolean v3 = interfaceC1302o0.v();
        D0 d02 = this.f10915l;
        boolean z3 = false;
        boolean z4 = v3 && !(d02.f10847g ^ true);
        if ((i2 & 1) != 0) {
            interfaceC1302o0.n(c0573m.f7200i);
        }
        if ((i2 & 2) != 0) {
            interfaceC1302o0.e(c0573m.f7201j);
        }
        if ((i2 & 4) != 0) {
            interfaceC1302o0.d(c0573m.f7202k);
        }
        if ((i2 & 8) != 0) {
            interfaceC1302o0.c(c0573m.f7203l);
        }
        if ((i2 & 16) != 0) {
            interfaceC1302o0.j(c0573m.f7204m);
        }
        if ((i2 & 32) != 0) {
            interfaceC1302o0.r(c0573m.f7205n);
        }
        if ((i2 & 64) != 0) {
            interfaceC1302o0.K(AbstractC0571K.A(c0573m.f7206o));
        }
        if ((i2 & 128) != 0) {
            interfaceC1302o0.F(AbstractC0571K.A(c0573m.f7207p));
        }
        if ((i2 & 1024) != 0) {
            interfaceC1302o0.i(c0573m.f7209s);
        }
        if ((i2 & 256) != 0) {
            interfaceC1302o0.o(c0573m.q);
        }
        if ((i2 & 512) != 0) {
            interfaceC1302o0.b(c0573m.f7208r);
        }
        if ((i2 & 2048) != 0) {
            interfaceC1302o0.k(c0573m.f7210t);
        }
        if (i3 != 0) {
            interfaceC1302o0.D(C0580U.b(this.f10920r) * interfaceC1302o0.f());
            interfaceC1302o0.q(C0580U.c(this.f10920r) * interfaceC1302o0.h());
        }
        boolean z5 = c0573m.f7213w;
        C1.b bVar = AbstractC0571K.f7193a;
        boolean z6 = z5 && c0573m.f7212v != bVar;
        if ((i2 & 24576) != 0) {
            interfaceC1302o0.B(z6);
            interfaceC1302o0.E(c0573m.f7213w && c0573m.f7212v == bVar);
        }
        if ((131072 & i2) != 0) {
            interfaceC1302o0.g();
        }
        if ((32768 & i2) != 0) {
            interfaceC1302o0.C(c0573m.f7214x);
        }
        boolean c3 = this.f10915l.c(c0573m.f7198B, c0573m.f7202k, z6, c0573m.f7205n, c0573m.f7215y);
        if (d02.f10846f) {
            interfaceC1302o0.m(d02.b());
        }
        if (z6 && !(!d02.f10847g)) {
            z3 = true;
        }
        C1314v c1314v = this.f10911h;
        if (z4 == z3 && (!z3 || !c3)) {
            s1.f11145a.a(c1314v);
        } else if (!this.f10914k && !this.f10916m) {
            c1314v.invalidate();
            m(true);
        }
        if (!this.f10917n && interfaceC1302o0.J() > 0.0f && (aVar = this.f10913j) != null) {
            aVar.c();
        }
        if ((i2 & 7963) != 0) {
            this.f10919p.c();
        }
        this.f10922t = c0573m.f7199h;
    }

    @Override // t0.e0
    public final void b(float[] fArr) {
        float[] a3 = this.f10919p.a(this.f10921s);
        if (a3 != null) {
            C0565E.g(fArr, a3);
        }
    }

    @Override // t0.e0
    public final void c() {
        InterfaceC1302o0 interfaceC1302o0 = this.f10921s;
        if (interfaceC1302o0.l()) {
            interfaceC1302o0.p();
        }
        this.f10912i = null;
        this.f10913j = null;
        this.f10916m = true;
        m(false);
        C1314v c1314v = this.f10911h;
        c1314v.F = true;
        c1314v.D(this);
    }

    @Override // t0.e0
    public final long d(long j3, boolean z3) {
        InterfaceC1302o0 interfaceC1302o0 = this.f10921s;
        A0 a02 = this.f10919p;
        if (!z3) {
            return C0565E.b(j3, a02.b(interfaceC1302o0));
        }
        float[] a3 = a02.a(interfaceC1302o0);
        if (a3 != null) {
            return C0565E.b(j3, a3);
        }
        return 9187343241974906880L;
    }

    @Override // t0.e0
    public final void e(long j3) {
        InterfaceC1302o0 interfaceC1302o0 = this.f10921s;
        int A3 = interfaceC1302o0.A();
        int z3 = interfaceC1302o0.z();
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        if (A3 == i2 && z3 == i3) {
            return;
        }
        if (A3 != i2) {
            interfaceC1302o0.s(i2 - A3);
        }
        if (z3 != i3) {
            interfaceC1302o0.w(i3 - z3);
        }
        s1.f11145a.a(this.f10911h);
        this.f10919p.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    @Override // t0.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r5 = this;
            boolean r0 = r5.f10914k
            u0.o0 r1 = r5.f10921s
            if (r0 != 0) goto Lc
            boolean r0 = r1.l()
            if (r0 != 0) goto L35
        Lc:
            boolean r0 = r1.v()
            if (r0 == 0) goto L20
            u0.D0 r0 = r5.f10915l
            boolean r2 = r0.f10847g
            r2 = r2 ^ 1
            if (r2 != 0) goto L20
            r0.d()
            c0.J r0 = r0.f10845e
            goto L21
        L20:
            r0 = 0
        L21:
            y2.e r2 = r5.f10912i
            if (r2 == 0) goto L31
            n0.B r3 = new n0.B
            r4 = 17
            r3.<init>(r4, r2)
            c0.t r2 = r5.q
            r1.L(r2, r0, r3)
        L31:
            r0 = 0
            r5.m(r0)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.L0.f():void");
    }

    @Override // t0.e0
    public final void g(long j3) {
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        float b3 = C0580U.b(this.f10920r) * i2;
        InterfaceC1302o0 interfaceC1302o0 = this.f10921s;
        interfaceC1302o0.D(b3);
        interfaceC1302o0.q(C0580U.c(this.f10920r) * i3);
        if (interfaceC1302o0.G(interfaceC1302o0.A(), interfaceC1302o0.z(), interfaceC1302o0.A() + i2, interfaceC1302o0.z() + i3)) {
            interfaceC1302o0.m(this.f10915l.b());
            if (!this.f10914k && !this.f10916m) {
                this.f10911h.invalidate();
                m(true);
            }
            this.f10919p.c();
        }
    }

    @Override // t0.e0
    public final void h(b0.b bVar, boolean z3) {
        InterfaceC1302o0 interfaceC1302o0 = this.f10921s;
        A0 a02 = this.f10919p;
        if (!z3) {
            C0565E.c(a02.b(interfaceC1302o0), bVar);
            return;
        }
        float[] a3 = a02.a(interfaceC1302o0);
        if (a3 != null) {
            C0565E.c(a3, bVar);
            return;
        }
        bVar.f7054a = 0.0f;
        bVar.f7055b = 0.0f;
        bVar.f7056c = 0.0f;
        bVar.f7057d = 0.0f;
    }

    @Override // t0.e0
    public final void i(float[] fArr) {
        C0565E.g(fArr, this.f10919p.b(this.f10921s));
    }

    @Override // t0.e0
    public final void invalidate() {
        if (this.f10914k || this.f10916m) {
            return;
        }
        this.f10911h.invalidate();
        m(true);
    }

    @Override // t0.e0
    public final boolean j(long j3) {
        AbstractC0569I abstractC0569I;
        float d3 = b0.c.d(j3);
        float e3 = b0.c.e(j3);
        InterfaceC1302o0 interfaceC1302o0 = this.f10921s;
        if (interfaceC1302o0.x()) {
            return 0.0f <= d3 && d3 < ((float) interfaceC1302o0.f()) && 0.0f <= e3 && e3 < ((float) interfaceC1302o0.h());
        }
        if (!interfaceC1302o0.v()) {
            return true;
        }
        D0 d02 = this.f10915l;
        if (d02.f10853m && (abstractC0569I = d02.f10843c) != null) {
            return N.w(abstractC0569I, b0.c.d(j3), b0.c.e(j3), null, null);
        }
        return true;
    }

    @Override // t0.e0
    public final void k(InterfaceC0600s interfaceC0600s, C0663b c0663b) {
        Canvas a3 = AbstractC0585d.a(interfaceC0600s);
        boolean isHardwareAccelerated = a3.isHardwareAccelerated();
        InterfaceC1302o0 interfaceC1302o0 = this.f10921s;
        if (isHardwareAccelerated) {
            f();
            boolean z3 = interfaceC1302o0.J() > 0.0f;
            this.f10917n = z3;
            if (z3) {
                interfaceC0600s.o();
            }
            interfaceC1302o0.y(a3);
            if (this.f10917n) {
                interfaceC0600s.h();
                return;
            }
            return;
        }
        float A3 = interfaceC1302o0.A();
        float z4 = interfaceC1302o0.z();
        float u3 = interfaceC1302o0.u();
        float t3 = interfaceC1302o0.t();
        if (interfaceC1302o0.a() < 1.0f) {
            C0589h c0589h = this.f10918o;
            if (c0589h == null) {
                c0589h = AbstractC0571K.g();
                this.f10918o = c0589h;
            }
            c0589h.c(interfaceC1302o0.a());
            a3.saveLayer(A3, z4, u3, t3, c0589h.f7254a);
        } else {
            interfaceC0600s.f();
        }
        interfaceC0600s.q(A3, z4);
        interfaceC0600s.n(this.f10919p.b(interfaceC1302o0));
        if (interfaceC1302o0.v() || interfaceC1302o0.x()) {
            this.f10915l.a(interfaceC0600s);
        }
        y2.e eVar = this.f10912i;
        if (eVar != null) {
            eVar.j(interfaceC0600s, null);
        }
        interfaceC0600s.b();
        m(false);
    }

    @Override // t0.e0
    public final void l(C0018a c0018a, C0944e c0944e) {
        m(false);
        this.f10916m = false;
        this.f10917n = false;
        this.f10920r = C0580U.f7240b;
        this.f10912i = c0018a;
        this.f10913j = c0944e;
    }

    public final void m(boolean z3) {
        if (z3 != this.f10914k) {
            this.f10914k = z3;
            this.f10911h.v(this, z3);
        }
    }
}
