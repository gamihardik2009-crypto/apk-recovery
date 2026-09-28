package f0;

import G.z;
import android.graphics.Outline;
import android.os.Build;
import b0.AbstractC0503a;
import c0.AbstractC0569I;
import c0.C0566F;
import c0.C0567G;
import c0.C0568H;
import c0.C0589h;
import c0.C0591j;
import c0.InterfaceC0570J;
import e0.AbstractC0653c;
import j.AbstractC0740F;
import j.C0736B;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0665d f7589a;

    /* renamed from: e, reason: collision with root package name */
    public Outline f7593e;

    /* renamed from: i, reason: collision with root package name */
    public float f7597i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0569I f7598j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0570J f7599k;

    /* renamed from: l, reason: collision with root package name */
    public C0591j f7600l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7601m;

    /* renamed from: n, reason: collision with root package name */
    public C0589h f7602n;

    /* renamed from: o, reason: collision with root package name */
    public int f7603o;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public long f7605r;

    /* renamed from: s, reason: collision with root package name */
    public long f7606s;

    /* renamed from: t, reason: collision with root package name */
    public long f7607t;

    /* renamed from: b, reason: collision with root package name */
    public O0.b f7590b = AbstractC0653c.f7555a;

    /* renamed from: c, reason: collision with root package name */
    public O0.k f7591c = O0.k.f5148h;

    /* renamed from: d, reason: collision with root package name */
    public y2.c f7592d = C0662a.f7586j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7594f = true;

    /* renamed from: g, reason: collision with root package name */
    public long f7595g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f7596h = 9205357640488583168L;

    /* renamed from: p, reason: collision with root package name */
    public final z f7604p = new z();

    public C0663b(InterfaceC0665d interfaceC0665d) {
        this.f7589a = interfaceC0665d;
        interfaceC0665d.L(false);
        this.f7605r = 0L;
        this.f7606s = 0L;
        this.f7607t = 9205357640488583168L;
    }

    public final void a() {
        if (this.f7594f) {
            InterfaceC0665d interfaceC0665d = this.f7589a;
            if (interfaceC0665d.s() || interfaceC0665d.D() > 0.0f) {
                InterfaceC0570J interfaceC0570J = this.f7599k;
                if (interfaceC0570J != null) {
                    Outline outline = this.f7593e;
                    if (outline == null) {
                        outline = new Outline();
                        this.f7593e = outline;
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 > 28 || ((C0591j) interfaceC0570J).f7260a.isConvex()) {
                        if (i2 > 30) {
                            C0671j.f7681a.a(outline, interfaceC0570J);
                        } else {
                            if (!(interfaceC0570J instanceof C0591j)) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((C0591j) interfaceC0570J).f7260a);
                        }
                        this.f7601m = !outline.canClip();
                    } else {
                        Outline outline2 = this.f7593e;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        this.f7601m = true;
                    }
                    this.f7599k = interfaceC0570J;
                    outline.setAlpha(interfaceC0665d.a());
                    interfaceC0665d.m(outline);
                } else {
                    Outline outline3 = this.f7593e;
                    if (outline3 == null) {
                        outline3 = new Outline();
                        this.f7593e = outline3;
                    }
                    long U3 = l0.c.U(this.f7606s);
                    long j3 = this.f7595g;
                    long j4 = this.f7596h;
                    if (j4 != 9205357640488583168L) {
                        U3 = j4;
                    }
                    outline3.setRoundRect(Math.round(b0.c.d(j3)), Math.round(b0.c.e(j3)), Math.round(b0.f.d(U3) + b0.c.d(j3)), Math.round(b0.f.b(U3) + b0.c.e(j3)), this.f7597i);
                    outline3.setAlpha(interfaceC0665d.a());
                    interfaceC0665d.m(outline3);
                }
            } else {
                interfaceC0665d.m(null);
            }
        }
        this.f7594f = false;
    }

    public final void b() {
        if (this.q && this.f7603o == 0) {
            z zVar = this.f7604p;
            C0663b c0663b = (C0663b) zVar.f1214b;
            if (c0663b != null) {
                c0663b.d();
                zVar.f1214b = null;
            }
            C0736B c0736b = (C0736B) zVar.f1216d;
            if (c0736b != null) {
                Object[] objArr = c0736b.f7965b;
                long[] jArr = c0736b.f7964a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j3 = jArr[i2];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j3) < 128) {
                                    ((C0663b) objArr[(i2 << 3) + i4]).d();
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                c0736b.b();
            }
            this.f7589a.p();
        }
    }

    public final AbstractC0569I c() {
        AbstractC0569I c0567g;
        AbstractC0569I abstractC0569I = this.f7598j;
        InterfaceC0570J interfaceC0570J = this.f7599k;
        if (abstractC0569I != null) {
            return abstractC0569I;
        }
        if (interfaceC0570J != null) {
            C0566F c0566f = new C0566F(interfaceC0570J);
            this.f7598j = c0566f;
            return c0566f;
        }
        long U3 = l0.c.U(this.f7606s);
        long j3 = this.f7595g;
        long j4 = this.f7596h;
        if (j4 != 9205357640488583168L) {
            U3 = j4;
        }
        float d3 = b0.c.d(j3);
        float e3 = b0.c.e(j3);
        float d4 = b0.f.d(U3) + d3;
        float b3 = b0.f.b(U3) + e3;
        float f3 = this.f7597i;
        if (f3 > 0.0f) {
            long d5 = B2.a.d(f3, f3);
            long d6 = B2.a.d(AbstractC0503a.b(d5), AbstractC0503a.c(d5));
            c0567g = new C0568H(new b0.e(d3, e3, d4, b3, d6, d6, d6, d6));
        } else {
            c0567g = new C0567G(new b0.d(d3, e3, d4, b3));
        }
        this.f7598j = c0567g;
        return c0567g;
    }

    public final void d() {
        this.f7603o--;
        b();
    }

    public final void e() {
        z zVar = this.f7604p;
        zVar.f1215c = (C0663b) zVar.f1214b;
        C0736B c0736b = (C0736B) zVar.f1216d;
        if (c0736b != null && c0736b.h()) {
            C0736B c0736b2 = (C0736B) zVar.f1217e;
            if (c0736b2 == null) {
                int i2 = AbstractC0740F.f7972a;
                c0736b2 = new C0736B();
                zVar.f1217e = c0736b2;
            }
            c0736b2.i(c0736b);
            c0736b.b();
        }
        zVar.f1213a = true;
        this.f7589a.x(this.f7590b, this.f7591c, this, this.f7592d);
        zVar.f1213a = false;
        C0663b c0663b = (C0663b) zVar.f1215c;
        if (c0663b != null) {
            c0663b.d();
        }
        C0736B c0736b3 = (C0736B) zVar.f1217e;
        if (c0736b3 == null || !c0736b3.h()) {
            return;
        }
        Object[] objArr = c0736b3.f7965b;
        long[] jArr = c0736b3.f7964a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            ((C0663b) objArr[(i3 << 3) + i5]).d();
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        c0736b3.b();
    }

    public final void f(float f3) {
        InterfaceC0665d interfaceC0665d = this.f7589a;
        if (interfaceC0665d.a() == f3) {
            return;
        }
        interfaceC0665d.d(f3);
    }

    public final void g(long j3, long j4, float f3) {
        if (b0.c.b(this.f7595g, j3) && b0.f.a(this.f7596h, j4) && this.f7597i == f3 && this.f7599k == null) {
            return;
        }
        this.f7598j = null;
        this.f7599k = null;
        this.f7594f = true;
        this.f7601m = false;
        this.f7595g = j3;
        this.f7596h = j4;
        this.f7597i = f3;
        a();
    }
}
