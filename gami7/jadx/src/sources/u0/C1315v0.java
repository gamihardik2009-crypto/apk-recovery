package u0;

import C0.C0018a;
import android.graphics.Canvas;
import android.os.Build;
import b0.AbstractC0503a;
import c0.AbstractC0569I;
import c0.AbstractC0571K;
import c0.AbstractC0585d;
import c0.C0565E;
import c0.C0566F;
import c0.C0567G;
import c0.C0568H;
import c0.C0573M;
import c0.C0580U;
import c0.C0589h;
import c0.C0591j;
import c0.C0603v;
import c0.InterfaceC0561A;
import c0.InterfaceC0570J;
import c0.InterfaceC0600s;
import e0.C0652b;
import f0.C0663b;
import f0.InterfaceC0665d;
import n0.C0919B;
import n1.C0944e;

/* renamed from: u0.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1315v0 implements t0.e0 {

    /* renamed from: h, reason: collision with root package name */
    public C0663b f11228h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0561A f11229i;

    /* renamed from: j, reason: collision with root package name */
    public final C1314v f11230j;

    /* renamed from: k, reason: collision with root package name */
    public y2.e f11231k;

    /* renamed from: l, reason: collision with root package name */
    public y2.a f11232l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11234n;

    /* renamed from: p, reason: collision with root package name */
    public float[] f11236p;
    public boolean q;

    /* renamed from: u, reason: collision with root package name */
    public int f11240u;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC0569I f11242w;

    /* renamed from: x, reason: collision with root package name */
    public C0591j f11243x;

    /* renamed from: y, reason: collision with root package name */
    public C0589h f11244y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11245z;

    /* renamed from: m, reason: collision with root package name */
    public long f11233m = l0.c.e(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public final float[] f11235o = C0565E.a();

    /* renamed from: r, reason: collision with root package name */
    public O0.b f11237r = B2.a.e();

    /* renamed from: s, reason: collision with root package name */
    public O0.k f11238s = O0.k.f5148h;

    /* renamed from: t, reason: collision with root package name */
    public final C0652b f11239t = new C0652b();

    /* renamed from: v, reason: collision with root package name */
    public long f11241v = C0580U.f7240b;

    /* renamed from: A, reason: collision with root package name */
    public final C0919B f11227A = new C0919B(15, this);

    public C1315v0(C0663b c0663b, InterfaceC0561A interfaceC0561A, C1314v c1314v, C0018a c0018a, C0944e c0944e) {
        this.f11228h = c0663b;
        this.f11229i = interfaceC0561A;
        this.f11230j = c1314v;
        this.f11231k = c0018a;
        this.f11232l = c0944e;
    }

    @Override // t0.e0
    public final void a(C0573M c0573m) {
        y2.a aVar;
        int i2;
        y2.a aVar2;
        int i3 = c0573m.f7199h | this.f11240u;
        this.f11238s = c0573m.f7197A;
        this.f11237r = c0573m.f7216z;
        int i4 = i3 & 4096;
        if (i4 != 0) {
            this.f11241v = c0573m.f7211u;
        }
        if ((i3 & 1) != 0) {
            C0663b c0663b = this.f11228h;
            float f3 = c0573m.f7200i;
            InterfaceC0665d interfaceC0665d = c0663b.f7589a;
            if (interfaceC0665d.t() != f3) {
                interfaceC0665d.n(f3);
            }
        }
        if ((i3 & 2) != 0) {
            C0663b c0663b2 = this.f11228h;
            float f4 = c0573m.f7201j;
            InterfaceC0665d interfaceC0665d2 = c0663b2.f7589a;
            if (interfaceC0665d2.E() != f4) {
                interfaceC0665d2.e(f4);
            }
        }
        if ((i3 & 4) != 0) {
            this.f11228h.f(c0573m.f7202k);
        }
        if ((i3 & 8) != 0) {
            C0663b c0663b3 = this.f11228h;
            float f5 = c0573m.f7203l;
            InterfaceC0665d interfaceC0665d3 = c0663b3.f7589a;
            if (interfaceC0665d3.K() != f5) {
                interfaceC0665d3.c(f5);
            }
        }
        if ((i3 & 16) != 0) {
            C0663b c0663b4 = this.f11228h;
            float f6 = c0573m.f7204m;
            InterfaceC0665d interfaceC0665d4 = c0663b4.f7589a;
            if (interfaceC0665d4.y() != f6) {
                interfaceC0665d4.j(f6);
            }
        }
        boolean z3 = false;
        if ((i3 & 32) != 0) {
            C0663b c0663b5 = this.f11228h;
            float f7 = c0573m.f7205n;
            InterfaceC0665d interfaceC0665d5 = c0663b5.f7589a;
            if (interfaceC0665d5.D() != f7) {
                interfaceC0665d5.w(f7);
                interfaceC0665d5.L(interfaceC0665d5.s() || f7 > 0.0f);
                c0663b5.f7594f = true;
                c0663b5.a();
            }
            if (c0573m.f7205n > 0.0f && !this.f11245z && (aVar2 = this.f11232l) != null) {
                aVar2.c();
            }
        }
        if ((i3 & 64) != 0) {
            C0663b c0663b6 = this.f11228h;
            long j3 = c0573m.f7206o;
            InterfaceC0665d interfaceC0665d6 = c0663b6.f7589a;
            if (!C0603v.c(j3, interfaceC0665d6.J())) {
                interfaceC0665d6.C(j3);
            }
        }
        if ((i3 & 128) != 0) {
            C0663b c0663b7 = this.f11228h;
            long j4 = c0573m.f7207p;
            InterfaceC0665d interfaceC0665d7 = c0663b7.f7589a;
            if (!C0603v.c(j4, interfaceC0665d7.B())) {
                interfaceC0665d7.r(j4);
            }
        }
        if ((i3 & 1024) != 0) {
            C0663b c0663b8 = this.f11228h;
            float f8 = c0573m.f7209s;
            InterfaceC0665d interfaceC0665d8 = c0663b8.f7589a;
            if (interfaceC0665d8.G() != f8) {
                interfaceC0665d8.i(f8);
            }
        }
        if ((i3 & 256) != 0) {
            C0663b c0663b9 = this.f11228h;
            float f9 = c0573m.q;
            InterfaceC0665d interfaceC0665d9 = c0663b9.f7589a;
            if (interfaceC0665d9.N() != f9) {
                interfaceC0665d9.o(f9);
            }
        }
        if ((i3 & 512) != 0) {
            C0663b c0663b10 = this.f11228h;
            float f10 = c0573m.f7208r;
            InterfaceC0665d interfaceC0665d10 = c0663b10.f7589a;
            if (interfaceC0665d10.A() != f10) {
                interfaceC0665d10.b(f10);
            }
        }
        if ((i3 & 2048) != 0) {
            C0663b c0663b11 = this.f11228h;
            float f11 = c0573m.f7210t;
            InterfaceC0665d interfaceC0665d11 = c0663b11.f7589a;
            if (interfaceC0665d11.F() != f11) {
                interfaceC0665d11.k(f11);
            }
        }
        if (i4 != 0) {
            if (C0580U.a(this.f11241v, C0580U.f7240b)) {
                C0663b c0663b12 = this.f11228h;
                if (!b0.c.b(c0663b12.f7607t, 9205357640488583168L)) {
                    c0663b12.f7607t = 9205357640488583168L;
                    c0663b12.f7589a.I(9205357640488583168L);
                }
            } else {
                C0663b c0663b13 = this.f11228h;
                long e3 = K1.f.e(C0580U.b(this.f11241v) * ((int) (this.f11233m >> 32)), C0580U.c(this.f11241v) * ((int) (this.f11233m & 4294967295L)));
                if (!b0.c.b(c0663b13.f7607t, e3)) {
                    c0663b13.f7607t = e3;
                    c0663b13.f7589a.I(e3);
                }
            }
        }
        if ((i3 & 16384) != 0) {
            C0663b c0663b14 = this.f11228h;
            boolean z4 = c0573m.f7213w;
            InterfaceC0665d interfaceC0665d12 = c0663b14.f7589a;
            if (interfaceC0665d12.s() != z4) {
                interfaceC0665d12.L(z4);
                c0663b14.f7594f = true;
                c0663b14.a();
            }
        }
        if ((131072 & i3) != 0) {
            InterfaceC0665d interfaceC0665d13 = this.f11228h.f7589a;
            interfaceC0665d13.getClass();
            if (!z2.h.a(null, null)) {
                interfaceC0665d13.g();
            }
        }
        if ((32768 & i3) != 0) {
            C0663b c0663b15 = this.f11228h;
            int i5 = c0573m.f7214x;
            if (AbstractC0571K.n(i5, 0)) {
                i2 = 0;
            } else if (AbstractC0571K.n(i5, 1)) {
                i2 = 1;
            } else {
                i2 = 2;
                if (!AbstractC0571K.n(i5, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            InterfaceC0665d interfaceC0665d14 = c0663b15.f7589a;
            if (!B2.a.p(interfaceC0665d14.M(), i2)) {
                interfaceC0665d14.q(i2);
            }
        }
        if (!z2.h.a(this.f11242w, c0573m.f7198B)) {
            AbstractC0569I abstractC0569I = c0573m.f7198B;
            this.f11242w = abstractC0569I;
            if (abstractC0569I != null) {
                C0663b c0663b16 = this.f11228h;
                if (abstractC0569I instanceof C0567G) {
                    b0.d dVar = ((C0567G) abstractC0569I).f7190a;
                    c0663b16.g(K1.f.e(dVar.f7060a, dVar.f7061b), B1.C.i(dVar.d(), dVar.c()), 0.0f);
                } else if (abstractC0569I instanceof C0566F) {
                    c0663b16.f7598j = null;
                    c0663b16.f7596h = 9205357640488583168L;
                    c0663b16.f7595g = 0L;
                    c0663b16.f7597i = 0.0f;
                    c0663b16.f7594f = true;
                    c0663b16.f7601m = false;
                    c0663b16.f7599k = ((C0566F) abstractC0569I).f7189a;
                    c0663b16.a();
                } else if (abstractC0569I instanceof C0568H) {
                    C0568H c0568h = (C0568H) abstractC0569I;
                    C0591j c0591j = c0568h.f7192b;
                    if (c0591j != null) {
                        c0663b16.f7598j = null;
                        c0663b16.f7596h = 9205357640488583168L;
                        c0663b16.f7595g = 0L;
                        c0663b16.f7597i = 0.0f;
                        c0663b16.f7594f = true;
                        c0663b16.f7601m = false;
                        c0663b16.f7599k = c0591j;
                        c0663b16.a();
                    } else {
                        b0.e eVar = c0568h.f7191a;
                        c0663b16.g(K1.f.e(eVar.f7064a, eVar.f7065b), B1.C.i(eVar.b(), eVar.a()), AbstractC0503a.b(eVar.f7071h));
                    }
                }
                if ((abstractC0569I instanceof C0566F) && Build.VERSION.SDK_INT < 33 && (aVar = this.f11232l) != null) {
                    aVar.c();
                }
            }
            z3 = true;
        }
        this.f11240u = c0573m.f7199h;
        if (i3 != 0 || z3) {
            s1.f11145a.a(this.f11230j);
        }
    }

    @Override // t0.e0
    public final void b(float[] fArr) {
        float[] m3 = m();
        if (m3 != null) {
            C0565E.g(fArr, m3);
        }
    }

    @Override // t0.e0
    public final void c() {
        this.f11231k = null;
        this.f11232l = null;
        this.f11234n = true;
        boolean z3 = this.q;
        C1314v c1314v = this.f11230j;
        if (z3) {
            this.q = false;
            c1314v.v(this, false);
        }
        InterfaceC0561A interfaceC0561A = this.f11229i;
        if (interfaceC0561A != null) {
            interfaceC0561A.a(this.f11228h);
            c1314v.D(this);
        }
    }

    @Override // t0.e0
    public final long d(long j3, boolean z3) {
        if (!z3) {
            return C0565E.b(j3, n());
        }
        float[] m3 = m();
        if (m3 != null) {
            return C0565E.b(j3, m3);
        }
        return 9187343241974906880L;
    }

    @Override // t0.e0
    public final void e(long j3) {
        C0663b c0663b = this.f11228h;
        if (!O0.h.a(c0663b.f7605r, j3)) {
            c0663b.f7605r = j3;
            long j4 = c0663b.f7606s;
            c0663b.f7589a.z((int) (j3 >> 32), (int) (j3 & 4294967295L), j4);
        }
        s1.f11145a.a(this.f11230j);
    }

    @Override // t0.e0
    public final void f() {
        if (this.q) {
            if (!C0580U.a(this.f11241v, C0580U.f7240b) && !O0.j.a(this.f11228h.f7606s, this.f11233m)) {
                C0663b c0663b = this.f11228h;
                long e3 = K1.f.e(C0580U.b(this.f11241v) * ((int) (this.f11233m >> 32)), C0580U.c(this.f11241v) * ((int) (this.f11233m & 4294967295L)));
                if (!b0.c.b(c0663b.f7607t, e3)) {
                    c0663b.f7607t = e3;
                    c0663b.f7589a.I(e3);
                }
            }
            C0663b c0663b2 = this.f11228h;
            O0.b bVar = this.f11237r;
            O0.k kVar = this.f11238s;
            long j3 = this.f11233m;
            boolean a3 = O0.j.a(c0663b2.f7606s, j3);
            InterfaceC0665d interfaceC0665d = c0663b2.f7589a;
            if (!a3) {
                c0663b2.f7606s = j3;
                long j4 = c0663b2.f7605r;
                interfaceC0665d.z((int) (j4 >> 32), (int) (4294967295L & j4), j3);
                if (c0663b2.f7596h == 9205357640488583168L) {
                    c0663b2.f7594f = true;
                    c0663b2.a();
                }
            }
            c0663b2.f7590b = bVar;
            c0663b2.f7591c = kVar;
            c0663b2.f7592d = this.f11227A;
            interfaceC0665d.getClass();
            c0663b2.e();
            if (this.q) {
                this.q = false;
                this.f11230j.v(this, false);
            }
        }
    }

    @Override // t0.e0
    public final void g(long j3) {
        if (O0.j.a(j3, this.f11233m)) {
            return;
        }
        this.f11233m = j3;
        if (this.q || this.f11234n) {
            return;
        }
        C1314v c1314v = this.f11230j;
        c1314v.invalidate();
        if (true != this.q) {
            this.q = true;
            c1314v.v(this, true);
        }
    }

    @Override // t0.e0
    public final void h(b0.b bVar, boolean z3) {
        if (!z3) {
            C0565E.c(n(), bVar);
            return;
        }
        float[] m3 = m();
        if (m3 != null) {
            C0565E.c(m3, bVar);
            return;
        }
        bVar.f7054a = 0.0f;
        bVar.f7055b = 0.0f;
        bVar.f7056c = 0.0f;
        bVar.f7057d = 0.0f;
    }

    @Override // t0.e0
    public final void i(float[] fArr) {
        C0565E.g(fArr, n());
    }

    @Override // t0.e0
    public final void invalidate() {
        if (this.q || this.f11234n) {
            return;
        }
        C1314v c1314v = this.f11230j;
        c1314v.invalidate();
        if (true != this.q) {
            this.q = true;
            c1314v.v(this, true);
        }
    }

    @Override // t0.e0
    public final boolean j(long j3) {
        float d3 = b0.c.d(j3);
        float e3 = b0.c.e(j3);
        if (this.f11228h.f7589a.s()) {
            return N.w(this.f11228h.c(), d3, e3, null, null);
        }
        return true;
    }

    @Override // t0.e0
    public final void k(InterfaceC0600s interfaceC0600s, C0663b c0663b) {
        Canvas a3 = AbstractC0585d.a(interfaceC0600s);
        if (a3.isHardwareAccelerated()) {
            f();
            this.f11245z = this.f11228h.f7589a.D() > 0.0f;
            C0652b c0652b = this.f11239t;
            K1.m mVar = c0652b.f7552i;
            mVar.n(interfaceC0600s);
            mVar.f4559b = c0663b;
            C1.y.q(c0652b, this.f11228h);
            return;
        }
        C0663b c0663b2 = this.f11228h;
        long j3 = c0663b2.f7605r;
        float f3 = (int) (j3 >> 32);
        float f4 = (int) (j3 & 4294967295L);
        long j4 = this.f11233m;
        float f5 = ((int) (j4 >> 32)) + f3;
        float f6 = f4 + ((int) (j4 & 4294967295L));
        if (c0663b2.f7589a.a() < 1.0f) {
            C0589h c0589h = this.f11244y;
            if (c0589h == null) {
                c0589h = AbstractC0571K.g();
                this.f11244y = c0589h;
            }
            c0589h.c(this.f11228h.f7589a.a());
            a3.saveLayer(f3, f4, f5, f6, c0589h.f7254a);
        } else {
            interfaceC0600s.f();
        }
        interfaceC0600s.q(f3, f4);
        interfaceC0600s.n(n());
        if (this.f11228h.f7589a.s() && this.f11228h.f7589a.s()) {
            AbstractC0569I c3 = this.f11228h.c();
            if (c3 instanceof C0567G) {
                InterfaceC0600s.c(interfaceC0600s, ((C0567G) c3).f7190a);
            } else if (c3 instanceof C0568H) {
                C0591j c0591j = this.f11243x;
                if (c0591j == null) {
                    c0591j = AbstractC0571K.h();
                    this.f11243x = c0591j;
                }
                c0591j.e();
                InterfaceC0570J.b(c0591j, ((C0568H) c3).f7191a);
                interfaceC0600s.d(c0591j, 1);
            } else if (c3 instanceof C0566F) {
                interfaceC0600s.d(((C0566F) c3).f7189a, 1);
            }
        }
        y2.e eVar = this.f11231k;
        if (eVar != null) {
            eVar.j(interfaceC0600s, null);
        }
        interfaceC0600s.b();
    }

    @Override // t0.e0
    public final void l(C0018a c0018a, C0944e c0944e) {
        InterfaceC0561A interfaceC0561A = this.f11229i;
        if (interfaceC0561A == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle".toString());
        }
        if (!this.f11228h.q) {
            throw new IllegalArgumentException("layer should have been released before reuse".toString());
        }
        this.f11228h = interfaceC0561A.b();
        this.f11234n = false;
        this.f11231k = c0018a;
        this.f11232l = c0944e;
        this.f11241v = C0580U.f7240b;
        this.f11245z = false;
        this.f11233m = l0.c.e(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f11242w = null;
        this.f11240u = 0;
    }

    public final float[] m() {
        float[] n3 = n();
        float[] fArr = this.f11236p;
        if (fArr == null) {
            fArr = C0565E.a();
            this.f11236p = fArr;
        }
        if (N.t(n3, fArr)) {
            return fArr;
        }
        return null;
    }

    public final float[] n() {
        C0663b c0663b = this.f11228h;
        long R3 = K1.f.G(c0663b.f7607t) ? B1.C.R(l0.c.U(this.f11233m)) : c0663b.f7607t;
        float[] fArr = this.f11235o;
        C0565E.d(fArr);
        float[] a3 = C0565E.a();
        C0565E.h(-b0.c.d(R3), -b0.c.e(R3), 0.0f, a3);
        C0565E.g(fArr, a3);
        float[] a4 = C0565E.a();
        InterfaceC0665d interfaceC0665d = c0663b.f7589a;
        C0565E.h(interfaceC0665d.K(), interfaceC0665d.y(), 0.0f, a4);
        double N3 = (interfaceC0665d.N() * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(N3);
        float sin = (float) Math.sin(N3);
        float f3 = a4[1];
        float f4 = a4[2];
        float f5 = a4[5];
        float f6 = a4[6];
        float f7 = a4[9];
        float f8 = a4[10];
        float f9 = a4[13];
        float f10 = a4[14];
        a4[1] = (f3 * cos) - (f4 * sin);
        a4[2] = (f4 * cos) + (f3 * sin);
        a4[5] = (f5 * cos) - (f6 * sin);
        a4[6] = (f6 * cos) + (f5 * sin);
        a4[9] = (f7 * cos) - (f8 * sin);
        a4[10] = (f8 * cos) + (f7 * sin);
        a4[13] = (f9 * cos) - (f10 * sin);
        a4[14] = (f10 * cos) + (f9 * sin);
        double A3 = (interfaceC0665d.A() * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(A3);
        float sin2 = (float) Math.sin(A3);
        float f11 = a4[0];
        float f12 = a4[2];
        float f13 = a4[4];
        float f14 = a4[6];
        float f15 = (f14 * sin2) + (f13 * cos2);
        float f16 = (f14 * cos2) + ((-f13) * sin2);
        float f17 = a4[8];
        float f18 = a4[10];
        float f19 = a4[12];
        float f20 = a4[14];
        a4[0] = (f12 * sin2) + (f11 * cos2);
        a4[2] = (f12 * cos2) + ((-f11) * sin2);
        a4[4] = f15;
        a4[6] = f16;
        a4[8] = (f18 * sin2) + (f17 * cos2);
        a4[10] = (f18 * cos2) + ((-f17) * sin2);
        a4[12] = (f20 * sin2) + (f19 * cos2);
        a4[14] = (f20 * cos2) + ((-f19) * sin2);
        C0565E.e(a4, interfaceC0665d.G());
        C0565E.f(interfaceC0665d.t(), interfaceC0665d.E(), 1.0f, a4);
        C0565E.g(fArr, a4);
        float[] a5 = C0565E.a();
        C0565E.h(b0.c.d(R3), b0.c.e(R3), 0.0f, a5);
        C0565E.g(fArr, a5);
        return fArr;
    }
}
