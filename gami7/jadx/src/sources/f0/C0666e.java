package f0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.ViewGroup;
import c0.AbstractC0571K;
import c0.AbstractC0585d;
import c0.C0584c;
import c0.C0601t;
import c0.C0603v;
import c0.InterfaceC0600s;
import e0.C0652b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666e implements InterfaceC0665d {

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicBoolean f7610z = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final C0601t f7611b;

    /* renamed from: c, reason: collision with root package name */
    public final C0652b f7612c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f7613d;

    /* renamed from: e, reason: collision with root package name */
    public long f7614e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f7615f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7616g;

    /* renamed from: h, reason: collision with root package name */
    public int f7617h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7618i;

    /* renamed from: j, reason: collision with root package name */
    public float f7619j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7620k;

    /* renamed from: l, reason: collision with root package name */
    public float f7621l;

    /* renamed from: m, reason: collision with root package name */
    public float f7622m;

    /* renamed from: n, reason: collision with root package name */
    public float f7623n;

    /* renamed from: o, reason: collision with root package name */
    public float f7624o;

    /* renamed from: p, reason: collision with root package name */
    public float f7625p;
    public long q;

    /* renamed from: r, reason: collision with root package name */
    public long f7626r;

    /* renamed from: s, reason: collision with root package name */
    public float f7627s;

    /* renamed from: t, reason: collision with root package name */
    public float f7628t;

    /* renamed from: u, reason: collision with root package name */
    public float f7629u;

    /* renamed from: v, reason: collision with root package name */
    public float f7630v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7631w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7632x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7633y;

    public C0666e(ViewGroup viewGroup, C0601t c0601t, C0652b c0652b) {
        this.f7611b = c0601t;
        this.f7612c = c0652b;
        RenderNode create = RenderNode.create("Compose", viewGroup);
        this.f7613d = create;
        this.f7614e = 0L;
        if (f7610z.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                l lVar = l.f7683a;
                lVar.c(create, lVar.a(create));
                lVar.d(create, lVar.b(create));
            }
            C0672k.f7682a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        h(0);
        this.f7617h = 0;
        this.f7618i = 3;
        this.f7619j = 1.0f;
        this.f7621l = 1.0f;
        this.f7622m = 1.0f;
        int i2 = C0603v.f7278h;
        this.q = AbstractC0571K.r();
        this.f7626r = AbstractC0571K.r();
        this.f7630v = 8.0f;
    }

    @Override // f0.InterfaceC0665d
    public final float A() {
        return this.f7628t;
    }

    @Override // f0.InterfaceC0665d
    public final long B() {
        return this.f7626r;
    }

    @Override // f0.InterfaceC0665d
    public final void C(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j3;
            l.f7683a.c(this.f7613d, AbstractC0571K.A(j3));
        }
    }

    @Override // f0.InterfaceC0665d
    public final float D() {
        return this.f7625p;
    }

    @Override // f0.InterfaceC0665d
    public final float E() {
        return this.f7622m;
    }

    @Override // f0.InterfaceC0665d
    public final float F() {
        return this.f7630v;
    }

    @Override // f0.InterfaceC0665d
    public final float G() {
        return this.f7629u;
    }

    @Override // f0.InterfaceC0665d
    public final int H() {
        return this.f7618i;
    }

    @Override // f0.InterfaceC0665d
    public final void I(long j3) {
        if (K1.f.G(j3)) {
            this.f7620k = true;
            this.f7613d.setPivotX(O0.j.c(this.f7614e) / 2.0f);
            this.f7613d.setPivotY(O0.j.b(this.f7614e) / 2.0f);
        } else {
            this.f7620k = false;
            this.f7613d.setPivotX(b0.c.d(j3));
            this.f7613d.setPivotY(b0.c.e(j3));
        }
    }

    @Override // f0.InterfaceC0665d
    public final long J() {
        return this.q;
    }

    @Override // f0.InterfaceC0665d
    public final float K() {
        return this.f7623n;
    }

    @Override // f0.InterfaceC0665d
    public final void L(boolean z3) {
        this.f7631w = z3;
        f();
    }

    @Override // f0.InterfaceC0665d
    public final int M() {
        return this.f7617h;
    }

    @Override // f0.InterfaceC0665d
    public final float N() {
        return this.f7627s;
    }

    @Override // f0.InterfaceC0665d
    public final float a() {
        return this.f7619j;
    }

    @Override // f0.InterfaceC0665d
    public final void b(float f3) {
        this.f7628t = f3;
        this.f7613d.setRotationY(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void c(float f3) {
        this.f7623n = f3;
        this.f7613d.setTranslationX(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void d(float f3) {
        this.f7619j = f3;
        this.f7613d.setAlpha(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void e(float f3) {
        this.f7622m = f3;
        this.f7613d.setScaleY(f3);
    }

    public final void f() {
        boolean z3 = this.f7631w;
        boolean z4 = false;
        boolean z5 = z3 && !this.f7616g;
        if (z3 && this.f7616g) {
            z4 = true;
        }
        if (z5 != this.f7632x) {
            this.f7632x = z5;
            this.f7613d.setClipToBounds(z5);
        }
        if (z4 != this.f7633y) {
            this.f7633y = z4;
            this.f7613d.setClipToOutline(z4);
        }
    }

    @Override // f0.InterfaceC0665d
    public final void g() {
    }

    public final void h(int i2) {
        RenderNode renderNode = this.f7613d;
        if (B2.a.p(i2, 1)) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (B2.a.p(i2, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // f0.InterfaceC0665d
    public final void i(float f3) {
        this.f7629u = f3;
        this.f7613d.setRotation(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void j(float f3) {
        this.f7624o = f3;
        this.f7613d.setTranslationY(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void k(float f3) {
        this.f7630v = f3;
        this.f7613d.setCameraDistance(-f3);
    }

    @Override // f0.InterfaceC0665d
    public final boolean l() {
        return this.f7613d.isValid();
    }

    @Override // f0.InterfaceC0665d
    public final void m(Outline outline) {
        this.f7613d.setOutline(outline);
        this.f7616g = outline != null;
        f();
    }

    @Override // f0.InterfaceC0665d
    public final void n(float f3) {
        this.f7621l = f3;
        this.f7613d.setScaleX(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void o(float f3) {
        this.f7627s = f3;
        this.f7613d.setRotationX(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void p() {
        C0672k.f7682a.a(this.f7613d);
    }

    @Override // f0.InterfaceC0665d
    public final void q(int i2) {
        this.f7617h = i2;
        if (B2.a.p(i2, 1) || !AbstractC0571K.m(this.f7618i, 3)) {
            h(1);
        } else {
            h(this.f7617h);
        }
    }

    @Override // f0.InterfaceC0665d
    public final void r(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7626r = j3;
            l.f7683a.d(this.f7613d, AbstractC0571K.A(j3));
        }
    }

    @Override // f0.InterfaceC0665d
    public final boolean s() {
        return this.f7631w;
    }

    @Override // f0.InterfaceC0665d
    public final float t() {
        return this.f7621l;
    }

    @Override // f0.InterfaceC0665d
    public final void u(InterfaceC0600s interfaceC0600s) {
        DisplayListCanvas a3 = AbstractC0585d.a(interfaceC0600s);
        z2.h.d(a3, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        a3.drawRenderNode(this.f7613d);
    }

    @Override // f0.InterfaceC0665d
    public final Matrix v() {
        Matrix matrix = this.f7615f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f7615f = matrix;
        }
        this.f7613d.getMatrix(matrix);
        return matrix;
    }

    @Override // f0.InterfaceC0665d
    public final void w(float f3) {
        this.f7625p = f3;
        this.f7613d.setElevation(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void x(O0.b bVar, O0.k kVar, C0663b c0663b, y2.c cVar) {
        Canvas start = this.f7613d.start(O0.j.c(this.f7614e), O0.j.b(this.f7614e));
        try {
            C0601t c0601t = this.f7611b;
            Canvas t3 = c0601t.a().t();
            c0601t.a().u(start);
            C0584c a3 = c0601t.a();
            C0652b c0652b = this.f7612c;
            long U3 = l0.c.U(this.f7614e);
            O0.b f3 = c0652b.e0().f();
            O0.k h2 = c0652b.e0().h();
            InterfaceC0600s e3 = c0652b.e0().e();
            long j3 = c0652b.e0().j();
            C0663b g3 = c0652b.e0().g();
            K1.m e02 = c0652b.e0();
            e02.o(bVar);
            e02.q(kVar);
            e02.n(a3);
            e02.r(U3);
            e02.p(c0663b);
            a3.f();
            try {
                cVar.l(c0652b);
                a3.b();
                K1.m e03 = c0652b.e0();
                e03.o(f3);
                e03.q(h2);
                e03.n(e3);
                e03.r(j3);
                e03.p(g3);
                c0601t.a().u(t3);
            } catch (Throwable th) {
                a3.b();
                K1.m e04 = c0652b.e0();
                e04.o(f3);
                e04.q(h2);
                e04.n(e3);
                e04.r(j3);
                e04.p(g3);
                throw th;
            }
        } finally {
            this.f7613d.end(start);
        }
    }

    @Override // f0.InterfaceC0665d
    public final float y() {
        return this.f7624o;
    }

    @Override // f0.InterfaceC0665d
    public final void z(int i2, int i3, long j3) {
        this.f7613d.setLeftTopRightBottom(i2, i3, O0.j.c(j3) + i2, O0.j.b(j3) + i3);
        if (O0.j.a(this.f7614e, j3)) {
            return;
        }
        if (this.f7620k) {
            this.f7613d.setPivotX(O0.j.c(j3) / 2.0f);
            this.f7613d.setPivotY(O0.j.b(j3) / 2.0f);
        }
        this.f7614e = j3;
    }
}
