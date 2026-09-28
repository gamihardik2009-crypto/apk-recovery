package e0;

import J2.r;
import K1.m;
import O0.k;
import android.graphics.Paint;
import b0.AbstractC0503a;
import c0.AbstractC0571K;
import c0.AbstractC0598q;
import c0.C0588g;
import c0.C0589h;
import c0.C0594m;
import c0.C0603v;
import c0.InterfaceC0570J;
import c0.InterfaceC0600s;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0652b implements InterfaceC0654d {

    /* renamed from: h, reason: collision with root package name */
    public final C0651a f7551h;

    /* renamed from: i, reason: collision with root package name */
    public final m f7552i;

    /* renamed from: j, reason: collision with root package name */
    public C0589h f7553j;

    /* renamed from: k, reason: collision with root package name */
    public C0589h f7554k;

    public C0652b() {
        O0.c cVar = AbstractC0653c.f7555a;
        k kVar = k.f5148h;
        C0656f c0656f = new C0656f();
        C0651a c0651a = new C0651a();
        c0651a.f7547a = cVar;
        c0651a.f7548b = kVar;
        c0651a.f7549c = c0656f;
        c0651a.f7550d = 0L;
        this.f7551h = c0651a;
        this.f7552i = new m(this);
    }

    public static C0589h a(C0652b c0652b, long j3, AbstractC0655e abstractC0655e, float f3, C0594m c0594m, int i2) {
        C0589h d3 = c0652b.d(abstractC0655e);
        if (f3 != 1.0f) {
            j3 = C0603v.b(C0603v.d(j3) * f3, j3);
        }
        if (!C0603v.c(AbstractC0571K.c(d3.f7254a.getColor()), j3)) {
            d3.e(j3);
        }
        if (d3.f7256c != null) {
            d3.h(null);
        }
        if (!z2.h.a(d3.f7257d, c0594m)) {
            d3.f(c0594m);
        }
        if (!AbstractC0571K.m(d3.f7255b, i2)) {
            d3.d(i2);
        }
        if (!d3.f7254a.isFilterBitmap()) {
            d3.g(1);
        }
        return d3;
    }

    @Override // e0.InterfaceC0654d
    public final void B(InterfaceC0570J interfaceC0570J, AbstractC0598q abstractC0598q, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f7551h.f7549c.g(interfaceC0570J, b(abstractC0598q, abstractC0655e, f3, c0594m, i2, 1));
    }

    @Override // e0.InterfaceC0654d
    public final void X(InterfaceC0570J interfaceC0570J, long j3, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f7551h.f7549c.g(interfaceC0570J, a(this, j3, abstractC0655e, f3, c0594m, i2));
    }

    @Override // e0.InterfaceC0654d
    public final void Z(C0588g c0588g, long j3, long j4, long j5, long j6, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2, int i3) {
        this.f7551h.f7549c.l(c0588g, j3, j4, j5, j6, b(null, abstractC0655e, f3, c0594m, i2, i3));
    }

    public final C0589h b(AbstractC0598q abstractC0598q, AbstractC0655e abstractC0655e, float f3, C0594m c0594m, int i2, int i3) {
        C0589h d3 = d(abstractC0655e);
        if (abstractC0598q != null) {
            abstractC0598q.a(f3, e(), d3);
        } else {
            if (d3.f7256c != null) {
                d3.h(null);
            }
            long c3 = AbstractC0571K.c(d3.f7254a.getColor());
            long j3 = C0603v.f7272b;
            if (!C0603v.c(c3, j3)) {
                d3.e(j3);
            }
            if (d3.f7254a.getAlpha() / 255.0f != f3) {
                d3.c(f3);
            }
        }
        if (!z2.h.a(d3.f7257d, c0594m)) {
            d3.f(c0594m);
        }
        if (!AbstractC0571K.m(d3.f7255b, i2)) {
            d3.d(i2);
        }
        if (d3.f7254a.isFilterBitmap() != i3) {
            d3.g(i3);
        }
        return d3;
    }

    @Override // O0.b
    public final float c() {
        return this.f7551h.f7547a.c();
    }

    @Override // e0.InterfaceC0654d
    public final void c0(C0588g c0588g, long j3, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f7551h.f7549c.a(c0588g, j3, b(null, abstractC0655e, f3, c0594m, i2, 1));
    }

    public final C0589h d(AbstractC0655e abstractC0655e) {
        if (z2.h.a(abstractC0655e, g.f7556a)) {
            C0589h c0589h = this.f7553j;
            if (c0589h != null) {
                return c0589h;
            }
            C0589h g3 = AbstractC0571K.g();
            g3.l(0);
            this.f7553j = g3;
            return g3;
        }
        if (!(abstractC0655e instanceof h)) {
            throw new r();
        }
        C0589h c0589h2 = this.f7554k;
        if (c0589h2 == null) {
            c0589h2 = AbstractC0571K.g();
            c0589h2.l(1);
            this.f7554k = c0589h2;
        }
        Paint paint = c0589h2.f7254a;
        float strokeWidth = paint.getStrokeWidth();
        h hVar = (h) abstractC0655e;
        float f3 = hVar.f7557a;
        if (strokeWidth != f3) {
            c0589h2.k(f3);
        }
        int a3 = c0589h2.a();
        int i2 = hVar.f7559c;
        if (!AbstractC0571K.o(a3, i2)) {
            c0589h2.i(i2);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f4 = hVar.f7558b;
        if (strokeMiter != f4) {
            c0589h2.f7254a.setStrokeMiter(f4);
        }
        int b3 = c0589h2.b();
        int i3 = hVar.f7560d;
        if (!AbstractC0571K.p(b3, i3)) {
            c0589h2.j(i3);
        }
        if (!z2.h.a(null, null)) {
            c0589h2.f7254a.setPathEffect(null);
        }
        return c0589h2;
    }

    @Override // e0.InterfaceC0654d
    public final m e0() {
        return this.f7552i;
    }

    @Override // e0.InterfaceC0654d
    public final k getLayoutDirection() {
        return this.f7551h.f7548b;
    }

    @Override // e0.InterfaceC0654d
    public final void h0(AbstractC0598q abstractC0598q, long j3, long j4, long j5, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f7551h.f7549c.s(b0.c.d(j3), b0.c.e(j3), b0.f.d(j4) + b0.c.d(j3), b0.f.b(j4) + b0.c.e(j3), AbstractC0503a.b(j5), AbstractC0503a.c(j5), b(abstractC0598q, abstractC0655e, f3, c0594m, i2, 1));
    }

    @Override // e0.InterfaceC0654d
    public final void k0(long j3, float f3, long j4, float f4, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f7551h.f7549c.k(f3, j4, a(this, j3, abstractC0655e, f4, c0594m, i2));
    }

    @Override // e0.InterfaceC0654d
    public final void o(AbstractC0598q abstractC0598q, long j3, long j4, float f3, int i2, float f4, C0594m c0594m, int i3) {
        InterfaceC0600s interfaceC0600s = this.f7551h.f7549c;
        C0589h c0589h = this.f7554k;
        if (c0589h == null) {
            c0589h = AbstractC0571K.g();
            c0589h.l(1);
            this.f7554k = c0589h;
        }
        if (abstractC0598q != null) {
            abstractC0598q.a(f4, e(), c0589h);
        } else if (c0589h.f7254a.getAlpha() / 255.0f != f4) {
            c0589h.c(f4);
        }
        if (!z2.h.a(c0589h.f7257d, c0594m)) {
            c0589h.f(c0594m);
        }
        if (!AbstractC0571K.m(c0589h.f7255b, i3)) {
            c0589h.d(i3);
        }
        Paint paint = c0589h.f7254a;
        if (paint.getStrokeWidth() != f3) {
            c0589h.k(f3);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            c0589h.f7254a.setStrokeMiter(4.0f);
        }
        if (!AbstractC0571K.o(c0589h.a(), i2)) {
            c0589h.i(i2);
        }
        if (!AbstractC0571K.p(c0589h.b(), 0)) {
            c0589h.j(0);
        }
        if (!z2.h.a(null, null)) {
            c0589h.f7254a.setPathEffect(null);
        }
        if (!paint.isFilterBitmap()) {
            c0589h.g(1);
        }
        interfaceC0600s.j(j3, j4, c0589h);
    }

    @Override // O0.b
    public final float s() {
        return this.f7551h.f7547a.s();
    }

    @Override // e0.InterfaceC0654d
    public final void u(AbstractC0598q abstractC0598q, long j3, long j4, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f7551h.f7549c.i(b0.c.d(j3), b0.c.e(j3), b0.f.d(j4) + b0.c.d(j3), b0.f.b(j4) + b0.c.e(j3), b(abstractC0598q, abstractC0655e, f3, c0594m, i2, 1));
    }

    @Override // e0.InterfaceC0654d
    public final void v(long j3, long j4, long j5, float f3, int i2, float f4, C0594m c0594m, int i3) {
        InterfaceC0600s interfaceC0600s = this.f7551h.f7549c;
        C0589h c0589h = this.f7554k;
        if (c0589h == null) {
            c0589h = AbstractC0571K.g();
            c0589h.l(1);
            this.f7554k = c0589h;
        }
        C0589h c0589h2 = c0589h;
        long b3 = f4 == 1.0f ? j3 : C0603v.b(C0603v.d(j3) * f4, j3);
        if (!C0603v.c(AbstractC0571K.c(c0589h2.f7254a.getColor()), b3)) {
            c0589h2.e(b3);
        }
        if (c0589h2.f7256c != null) {
            c0589h2.h(null);
        }
        if (!z2.h.a(c0589h2.f7257d, c0594m)) {
            c0589h2.f(c0594m);
        }
        if (!AbstractC0571K.m(c0589h2.f7255b, i3)) {
            c0589h2.d(i3);
        }
        Paint paint = c0589h2.f7254a;
        if (paint.getStrokeWidth() != f3) {
            c0589h2.k(f3);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            c0589h2.f7254a.setStrokeMiter(4.0f);
        }
        if (!AbstractC0571K.o(c0589h2.a(), i2)) {
            c0589h2.i(i2);
        }
        if (!AbstractC0571K.p(c0589h2.b(), 0)) {
            c0589h2.j(0);
        }
        if (!z2.h.a(null, null)) {
            c0589h2.f7254a.setPathEffect(null);
        }
        if (!paint.isFilterBitmap()) {
            c0589h2.g(1);
        }
        interfaceC0600s.j(j4, j5, c0589h2);
    }

    @Override // e0.InterfaceC0654d
    public final void w0(long j3, long j4, long j5, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f7551h.f7549c.i(b0.c.d(j4), b0.c.e(j4), b0.f.d(j5) + b0.c.d(j4), b0.f.b(j5) + b0.c.e(j4), a(this, j3, abstractC0655e, f3, c0594m, i2));
    }

    @Override // e0.InterfaceC0654d
    public final void x0(long j3, long j4, long j5, long j6, AbstractC0655e abstractC0655e, float f3, C0594m c0594m, int i2) {
        this.f7551h.f7549c.s(b0.c.d(j4), b0.c.e(j4), b0.f.d(j5) + b0.c.d(j4), b0.f.b(j5) + b0.c.e(j4), AbstractC0503a.b(j6), AbstractC0503a.c(j6), a(this, j3, abstractC0655e, f3, c0594m, i2));
    }
}
