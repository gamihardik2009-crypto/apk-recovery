package f0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import c0.AbstractC0571K;
import c0.AbstractC0585d;
import c0.AbstractC0595n;
import c0.C0584c;
import c0.C0601t;
import c0.C0603v;
import c0.InterfaceC0600s;
import e0.C0652b;

/* renamed from: f0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668g implements InterfaceC0665d {

    /* renamed from: b, reason: collision with root package name */
    public final C0601t f7634b;

    /* renamed from: c, reason: collision with root package name */
    public final C0652b f7635c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f7636d;

    /* renamed from: e, reason: collision with root package name */
    public long f7637e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f7638f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7639g;

    /* renamed from: h, reason: collision with root package name */
    public float f7640h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7641i;

    /* renamed from: j, reason: collision with root package name */
    public float f7642j;

    /* renamed from: k, reason: collision with root package name */
    public float f7643k;

    /* renamed from: l, reason: collision with root package name */
    public float f7644l;

    /* renamed from: m, reason: collision with root package name */
    public float f7645m;

    /* renamed from: n, reason: collision with root package name */
    public float f7646n;

    /* renamed from: o, reason: collision with root package name */
    public long f7647o;

    /* renamed from: p, reason: collision with root package name */
    public long f7648p;
    public float q;

    /* renamed from: r, reason: collision with root package name */
    public float f7649r;

    /* renamed from: s, reason: collision with root package name */
    public float f7650s;

    /* renamed from: t, reason: collision with root package name */
    public float f7651t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7652u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7653v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7654w;

    /* renamed from: x, reason: collision with root package name */
    public int f7655x;

    public C0668g() {
        C0601t c0601t = new C0601t();
        C0652b c0652b = new C0652b();
        this.f7634b = c0601t;
        this.f7635c = c0652b;
        RenderNode b3 = AbstractC0595n.b();
        this.f7636d = b3;
        this.f7637e = 0L;
        b3.setClipToBounds(false);
        h(b3, 0);
        this.f7640h = 1.0f;
        this.f7641i = 3;
        this.f7642j = 1.0f;
        this.f7643k = 1.0f;
        long j3 = C0603v.f7272b;
        this.f7647o = j3;
        this.f7648p = j3;
        this.f7651t = 8.0f;
        this.f7655x = 0;
    }

    public static void h(RenderNode renderNode, int i2) {
        if (B2.a.p(i2, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (B2.a.p(i2, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // f0.InterfaceC0665d
    public final float A() {
        return this.f7649r;
    }

    @Override // f0.InterfaceC0665d
    public final long B() {
        return this.f7648p;
    }

    @Override // f0.InterfaceC0665d
    public final void C(long j3) {
        this.f7647o = j3;
        this.f7636d.setAmbientShadowColor(AbstractC0571K.A(j3));
    }

    @Override // f0.InterfaceC0665d
    public final float D() {
        return this.f7646n;
    }

    @Override // f0.InterfaceC0665d
    public final float E() {
        return this.f7643k;
    }

    @Override // f0.InterfaceC0665d
    public final float F() {
        return this.f7651t;
    }

    @Override // f0.InterfaceC0665d
    public final float G() {
        return this.f7650s;
    }

    @Override // f0.InterfaceC0665d
    public final int H() {
        return this.f7641i;
    }

    @Override // f0.InterfaceC0665d
    public final void I(long j3) {
        if (K1.f.G(j3)) {
            this.f7636d.resetPivot();
        } else {
            this.f7636d.setPivotX(b0.c.d(j3));
            this.f7636d.setPivotY(b0.c.e(j3));
        }
    }

    @Override // f0.InterfaceC0665d
    public final long J() {
        return this.f7647o;
    }

    @Override // f0.InterfaceC0665d
    public final float K() {
        return this.f7644l;
    }

    @Override // f0.InterfaceC0665d
    public final void L(boolean z3) {
        this.f7652u = z3;
        f();
    }

    @Override // f0.InterfaceC0665d
    public final int M() {
        return this.f7655x;
    }

    @Override // f0.InterfaceC0665d
    public final float N() {
        return this.q;
    }

    @Override // f0.InterfaceC0665d
    public final float a() {
        return this.f7640h;
    }

    @Override // f0.InterfaceC0665d
    public final void b(float f3) {
        this.f7649r = f3;
        this.f7636d.setRotationY(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void c(float f3) {
        this.f7644l = f3;
        this.f7636d.setTranslationX(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void d(float f3) {
        this.f7640h = f3;
        this.f7636d.setAlpha(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void e(float f3) {
        this.f7643k = f3;
        this.f7636d.setScaleY(f3);
    }

    public final void f() {
        boolean z3 = this.f7652u;
        boolean z4 = false;
        boolean z5 = z3 && !this.f7639g;
        if (z3 && this.f7639g) {
            z4 = true;
        }
        if (z5 != this.f7653v) {
            this.f7653v = z5;
            this.f7636d.setClipToBounds(z5);
        }
        if (z4 != this.f7654w) {
            this.f7654w = z4;
            this.f7636d.setClipToOutline(z4);
        }
    }

    @Override // f0.InterfaceC0665d
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            m.f7684a.a(this.f7636d, null);
        }
    }

    @Override // f0.InterfaceC0665d
    public final void i(float f3) {
        this.f7650s = f3;
        this.f7636d.setRotationZ(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void j(float f3) {
        this.f7645m = f3;
        this.f7636d.setTranslationY(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void k(float f3) {
        this.f7651t = f3;
        this.f7636d.setCameraDistance(f3);
    }

    @Override // f0.InterfaceC0665d
    public final boolean l() {
        boolean hasDisplayList;
        hasDisplayList = this.f7636d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // f0.InterfaceC0665d
    public final void m(Outline outline) {
        this.f7636d.setOutline(outline);
        this.f7639g = outline != null;
        f();
    }

    @Override // f0.InterfaceC0665d
    public final void n(float f3) {
        this.f7642j = f3;
        this.f7636d.setScaleX(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void o(float f3) {
        this.q = f3;
        this.f7636d.setRotationX(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void p() {
        this.f7636d.discardDisplayList();
    }

    @Override // f0.InterfaceC0665d
    public final void q(int i2) {
        this.f7655x = i2;
        if (B2.a.p(i2, 1) || (!AbstractC0571K.m(this.f7641i, 3))) {
            h(this.f7636d, 1);
        } else {
            h(this.f7636d, this.f7655x);
        }
    }

    @Override // f0.InterfaceC0665d
    public final void r(long j3) {
        this.f7648p = j3;
        this.f7636d.setSpotShadowColor(AbstractC0571K.A(j3));
    }

    @Override // f0.InterfaceC0665d
    public final boolean s() {
        return this.f7652u;
    }

    @Override // f0.InterfaceC0665d
    public final float t() {
        return this.f7642j;
    }

    @Override // f0.InterfaceC0665d
    public final void u(InterfaceC0600s interfaceC0600s) {
        AbstractC0585d.a(interfaceC0600s).drawRenderNode(this.f7636d);
    }

    @Override // f0.InterfaceC0665d
    public final Matrix v() {
        Matrix matrix = this.f7638f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f7638f = matrix;
        }
        this.f7636d.getMatrix(matrix);
        return matrix;
    }

    @Override // f0.InterfaceC0665d
    public final void w(float f3) {
        this.f7646n = f3;
        this.f7636d.setElevation(f3);
    }

    @Override // f0.InterfaceC0665d
    public final void x(O0.b bVar, O0.k kVar, C0663b c0663b, y2.c cVar) {
        RecordingCanvas beginRecording;
        C0652b c0652b = this.f7635c;
        beginRecording = this.f7636d.beginRecording();
        try {
            C0601t c0601t = this.f7634b;
            C0584c c0584c = c0601t.f7270a;
            Canvas canvas = c0584c.f7245a;
            c0584c.f7245a = beginRecording;
            K1.m mVar = c0652b.f7552i;
            mVar.o(bVar);
            mVar.q(kVar);
            mVar.f4559b = c0663b;
            mVar.r(this.f7637e);
            mVar.n(c0584c);
            cVar.l(c0652b);
            c0601t.f7270a.f7245a = canvas;
        } finally {
            this.f7636d.endRecording();
        }
    }

    @Override // f0.InterfaceC0665d
    public final float y() {
        return this.f7645m;
    }

    @Override // f0.InterfaceC0665d
    public final void z(int i2, int i3, long j3) {
        this.f7636d.setPosition(i2, i3, ((int) (j3 >> 32)) + i2, ((int) (4294967295L & j3)) + i3);
        this.f7637e = l0.c.U(j3);
    }
}
