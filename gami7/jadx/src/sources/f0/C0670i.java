package f0;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import c0.AbstractC0571K;
import c0.AbstractC0585d;
import c0.C0584c;
import c0.C0601t;
import c0.C0603v;
import c0.InterfaceC0600s;
import e0.C0652b;
import g0.AbstractC0677a;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670i implements InterfaceC0665d {

    /* renamed from: A, reason: collision with root package name */
    public static final C0669h f7656A = new C0669h();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0677a f7657b;

    /* renamed from: c, reason: collision with root package name */
    public final C0601t f7658c;

    /* renamed from: d, reason: collision with root package name */
    public final n f7659d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f7660e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f7661f;

    /* renamed from: g, reason: collision with root package name */
    public int f7662g;

    /* renamed from: h, reason: collision with root package name */
    public int f7663h;

    /* renamed from: i, reason: collision with root package name */
    public long f7664i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7665j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7666k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7667l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7668m;

    /* renamed from: n, reason: collision with root package name */
    public int f7669n;

    /* renamed from: o, reason: collision with root package name */
    public float f7670o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7671p;
    public float q;

    /* renamed from: r, reason: collision with root package name */
    public float f7672r;

    /* renamed from: s, reason: collision with root package name */
    public float f7673s;

    /* renamed from: t, reason: collision with root package name */
    public float f7674t;

    /* renamed from: u, reason: collision with root package name */
    public float f7675u;

    /* renamed from: v, reason: collision with root package name */
    public long f7676v;

    /* renamed from: w, reason: collision with root package name */
    public long f7677w;

    /* renamed from: x, reason: collision with root package name */
    public float f7678x;

    /* renamed from: y, reason: collision with root package name */
    public float f7679y;

    /* renamed from: z, reason: collision with root package name */
    public float f7680z;

    public C0670i(AbstractC0677a abstractC0677a) {
        C0601t c0601t = new C0601t();
        C0652b c0652b = new C0652b();
        this.f7657b = abstractC0677a;
        this.f7658c = c0601t;
        n nVar = new n(abstractC0677a, c0601t, c0652b);
        this.f7659d = nVar;
        this.f7660e = abstractC0677a.getResources();
        this.f7661f = new Rect();
        abstractC0677a.addView(nVar);
        nVar.setClipBounds(null);
        this.f7664i = 0L;
        View.generateViewId();
        this.f7668m = 3;
        this.f7669n = 0;
        this.f7670o = 1.0f;
        this.q = 1.0f;
        this.f7672r = 1.0f;
        long j3 = C0603v.f7272b;
        this.f7676v = j3;
        this.f7677w = j3;
    }

    @Override // f0.InterfaceC0665d
    public final float A() {
        return this.f7679y;
    }

    @Override // f0.InterfaceC0665d
    public final long B() {
        return this.f7677w;
    }

    @Override // f0.InterfaceC0665d
    public final void C(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7676v = j3;
            o.f7695a.b(this.f7659d, AbstractC0571K.A(j3));
        }
    }

    @Override // f0.InterfaceC0665d
    public final float D() {
        return this.f7675u;
    }

    @Override // f0.InterfaceC0665d
    public final float E() {
        return this.f7672r;
    }

    @Override // f0.InterfaceC0665d
    public final float F() {
        return this.f7659d.getCameraDistance() / this.f7660e.getDisplayMetrics().densityDpi;
    }

    @Override // f0.InterfaceC0665d
    public final float G() {
        return this.f7680z;
    }

    @Override // f0.InterfaceC0665d
    public final int H() {
        return this.f7668m;
    }

    @Override // f0.InterfaceC0665d
    public final void I(long j3) {
        boolean G3 = K1.f.G(j3);
        n nVar = this.f7659d;
        if (!G3) {
            this.f7671p = false;
            nVar.setPivotX(b0.c.d(j3));
            nVar.setPivotY(b0.c.e(j3));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                o.f7695a.a(nVar);
                return;
            }
            this.f7671p = true;
            nVar.setPivotX(((int) (this.f7664i >> 32)) / 2.0f);
            nVar.setPivotY(((int) (this.f7664i & 4294967295L)) / 2.0f);
        }
    }

    @Override // f0.InterfaceC0665d
    public final long J() {
        return this.f7676v;
    }

    @Override // f0.InterfaceC0665d
    public final float K() {
        return this.f7673s;
    }

    @Override // f0.InterfaceC0665d
    public final void L(boolean z3) {
        boolean z4 = false;
        this.f7667l = z3 && !this.f7666k;
        this.f7665j = true;
        if (z3 && this.f7666k) {
            z4 = true;
        }
        this.f7659d.setClipToOutline(z4);
    }

    @Override // f0.InterfaceC0665d
    public final int M() {
        return this.f7669n;
    }

    @Override // f0.InterfaceC0665d
    public final float N() {
        return this.f7678x;
    }

    @Override // f0.InterfaceC0665d
    public final float a() {
        return this.f7670o;
    }

    @Override // f0.InterfaceC0665d
    public final void b(float f3) {
        this.f7679y = f3;
        this.f7659d.setRotationY(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void c(float f3) {
        this.f7673s = f3;
        this.f7659d.setTranslationX(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void d(float f3) {
        this.f7670o = f3;
        this.f7659d.setAlpha(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void e(float f3) {
        this.f7672r = f3;
        this.f7659d.setScaleY(f3);
    }

    public final void f(int i2) {
        boolean z3 = true;
        boolean p3 = B2.a.p(i2, 1);
        n nVar = this.f7659d;
        if (p3) {
            nVar.setLayerType(2, null);
        } else if (B2.a.p(i2, 2)) {
            nVar.setLayerType(0, null);
            z3 = false;
        } else {
            nVar.setLayerType(0, null);
        }
        nVar.setCanUseCompositingLayer$ui_graphics_release(z3);
    }

    @Override // f0.InterfaceC0665d
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            p.f7696a.a(this.f7659d, null);
        }
    }

    @Override // f0.InterfaceC0665d
    public final void i(float f3) {
        this.f7680z = f3;
        this.f7659d.setRotation(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void j(float f3) {
        this.f7674t = f3;
        this.f7659d.setTranslationY(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void k(float f3) {
        this.f7659d.setCameraDistance(f3 * this.f7660e.getDisplayMetrics().densityDpi);
    }

    @Override // f0.InterfaceC0665d
    public final void m(Outline outline) {
        n nVar = this.f7659d;
        nVar.f7690l = outline;
        nVar.invalidateOutline();
        if (s() && outline != null) {
            nVar.setClipToOutline(true);
            if (this.f7667l) {
                this.f7667l = false;
                this.f7665j = true;
            }
        }
        this.f7666k = outline != null;
    }

    @Override // f0.InterfaceC0665d
    public final void n(float f3) {
        this.q = f3;
        this.f7659d.setScaleX(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void o(float f3) {
        this.f7678x = f3;
        this.f7659d.setRotationX(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void p() {
        this.f7657b.removeViewInLayout(this.f7659d);
    }

    @Override // f0.InterfaceC0665d
    public final void q(int i2) {
        this.f7669n = i2;
        if (B2.a.p(i2, 1) || (!AbstractC0571K.m(this.f7668m, 3))) {
            f(1);
        } else {
            f(this.f7669n);
        }
    }

    @Override // f0.InterfaceC0665d
    public final void r(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7677w = j3;
            o.f7695a.c(this.f7659d, AbstractC0571K.A(j3));
        }
    }

    @Override // f0.InterfaceC0665d
    public final boolean s() {
        return this.f7667l || this.f7659d.getClipToOutline();
    }

    @Override // f0.InterfaceC0665d
    public final float t() {
        return this.q;
    }

    @Override // f0.InterfaceC0665d
    public final void u(InterfaceC0600s interfaceC0600s) {
        Rect rect;
        boolean z3 = this.f7665j;
        n nVar = this.f7659d;
        if (z3) {
            if (!s() || this.f7666k) {
                rect = null;
            } else {
                rect = this.f7661f;
                rect.left = 0;
                rect.top = 0;
                rect.right = nVar.getWidth();
                rect.bottom = nVar.getHeight();
            }
            nVar.setClipBounds(rect);
        }
        if (AbstractC0585d.a(interfaceC0600s).isHardwareAccelerated()) {
            this.f7657b.a(interfaceC0600s, nVar, nVar.getDrawingTime());
        }
    }

    @Override // f0.InterfaceC0665d
    public final Matrix v() {
        return this.f7659d.getMatrix();
    }

    @Override // f0.InterfaceC0665d
    public final void w(float f3) {
        this.f7675u = f3;
        this.f7659d.setElevation(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void x(O0.b bVar, O0.k kVar, C0663b c0663b, y2.c cVar) {
        n nVar = this.f7659d;
        ViewParent parent = nVar.getParent();
        AbstractC0677a abstractC0677a = this.f7657b;
        if (parent == null) {
            abstractC0677a.addView(nVar);
        }
        nVar.f7692n = bVar;
        nVar.f7693o = kVar;
        nVar.f7694p = cVar;
        nVar.q = c0663b;
        if (nVar.isAttachedToWindow()) {
            nVar.setVisibility(4);
            nVar.setVisibility(0);
            try {
                C0601t c0601t = this.f7658c;
                C0669h c0669h = f7656A;
                C0584c c0584c = c0601t.f7270a;
                Canvas canvas = c0584c.f7245a;
                c0584c.f7245a = c0669h;
                abstractC0677a.a(c0584c, nVar, nVar.getDrawingTime());
                c0601t.f7270a.f7245a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // f0.InterfaceC0665d
    public final float y() {
        return this.f7674t;
    }

    @Override // f0.InterfaceC0665d
    public final void z(int i2, int i3, long j3) {
        boolean a3 = O0.j.a(this.f7664i, j3);
        n nVar = this.f7659d;
        if (a3) {
            int i4 = this.f7662g;
            if (i4 != i2) {
                nVar.offsetLeftAndRight(i2 - i4);
            }
            int i5 = this.f7663h;
            if (i5 != i3) {
                nVar.offsetTopAndBottom(i3 - i5);
            }
        } else {
            if (s()) {
                this.f7665j = true;
            }
            int i6 = (int) (j3 >> 32);
            int i7 = (int) (4294967295L & j3);
            nVar.layout(i2, i3, i2 + i6, i3 + i7);
            this.f7664i = j3;
            if (this.f7671p) {
                nVar.setPivotX(i6 / 2.0f);
                nVar.setPivotY(i7 / 2.0f);
            }
        }
        this.f7662g = i2;
        this.f7663h = i3;
    }
}
