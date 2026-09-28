package u0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import c0.AbstractC0571K;
import c0.C0584c;
import c0.C0601t;
import c0.InterfaceC0570J;
import f0.AbstractC0667f;
import n0.C0919B;

/* loaded from: classes.dex */
public final class J0 implements InterfaceC1302o0 {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f10907a = AbstractC0667f.s();

    @Override // u0.InterfaceC1302o0
    public final int A() {
        int left;
        left = this.f10907a.getLeft();
        return left;
    }

    @Override // u0.InterfaceC1302o0
    public final void B(boolean z3) {
        this.f10907a.setClipToOutline(z3);
    }

    @Override // u0.InterfaceC1302o0
    public final void C(int i2) {
        RenderNode renderNode = this.f10907a;
        if (AbstractC0571K.n(i2, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC0571K.n(i2, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // u0.InterfaceC1302o0
    public final void D(float f3) {
        this.f10907a.setPivotX(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void E(boolean z3) {
        this.f10907a.setClipToBounds(z3);
    }

    @Override // u0.InterfaceC1302o0
    public final void F(int i2) {
        this.f10907a.setSpotShadowColor(i2);
    }

    @Override // u0.InterfaceC1302o0
    public final boolean G(int i2, int i3, int i4, int i5) {
        boolean position;
        position = this.f10907a.setPosition(i2, i3, i4, i5);
        return position;
    }

    @Override // u0.InterfaceC1302o0
    public final boolean H() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f10907a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // u0.InterfaceC1302o0
    public final void I(Matrix matrix) {
        this.f10907a.getMatrix(matrix);
    }

    @Override // u0.InterfaceC1302o0
    public final float J() {
        float elevation;
        elevation = this.f10907a.getElevation();
        return elevation;
    }

    @Override // u0.InterfaceC1302o0
    public final void K(int i2) {
        this.f10907a.setAmbientShadowColor(i2);
    }

    @Override // u0.InterfaceC1302o0
    public final void L(C0601t c0601t, InterfaceC0570J interfaceC0570J, C0919B c0919b) {
        RecordingCanvas beginRecording;
        beginRecording = this.f10907a.beginRecording();
        C0584c c0584c = c0601t.f7270a;
        Canvas canvas = c0584c.f7245a;
        c0584c.f7245a = beginRecording;
        if (interfaceC0570J != null) {
            c0584c.f();
            c0584c.d(interfaceC0570J, 1);
        }
        c0919b.l(c0584c);
        if (interfaceC0570J != null) {
            c0584c.b();
        }
        c0601t.f7270a.f7245a = canvas;
        this.f10907a.endRecording();
    }

    @Override // u0.InterfaceC1302o0
    public final float a() {
        float alpha;
        alpha = this.f10907a.getAlpha();
        return alpha;
    }

    @Override // u0.InterfaceC1302o0
    public final void b(float f3) {
        this.f10907a.setRotationY(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void c(float f3) {
        this.f10907a.setTranslationX(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void d(float f3) {
        this.f10907a.setAlpha(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void e(float f3) {
        this.f10907a.setScaleY(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final int f() {
        int width;
        width = this.f10907a.getWidth();
        return width;
    }

    @Override // u0.InterfaceC1302o0
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            K0.f10909a.a(this.f10907a, null);
        }
    }

    @Override // u0.InterfaceC1302o0
    public final int h() {
        int height;
        height = this.f10907a.getHeight();
        return height;
    }

    @Override // u0.InterfaceC1302o0
    public final void i(float f3) {
        this.f10907a.setRotationZ(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void j(float f3) {
        this.f10907a.setTranslationY(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void k(float f3) {
        this.f10907a.setCameraDistance(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final boolean l() {
        boolean hasDisplayList;
        hasDisplayList = this.f10907a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // u0.InterfaceC1302o0
    public final void m(Outline outline) {
        this.f10907a.setOutline(outline);
    }

    @Override // u0.InterfaceC1302o0
    public final void n(float f3) {
        this.f10907a.setScaleX(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void o(float f3) {
        this.f10907a.setRotationX(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void p() {
        this.f10907a.discardDisplayList();
    }

    @Override // u0.InterfaceC1302o0
    public final void q(float f3) {
        this.f10907a.setPivotY(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void r(float f3) {
        this.f10907a.setElevation(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void s(int i2) {
        this.f10907a.offsetLeftAndRight(i2);
    }

    @Override // u0.InterfaceC1302o0
    public final int t() {
        int bottom;
        bottom = this.f10907a.getBottom();
        return bottom;
    }

    @Override // u0.InterfaceC1302o0
    public final int u() {
        int right;
        right = this.f10907a.getRight();
        return right;
    }

    @Override // u0.InterfaceC1302o0
    public final boolean v() {
        boolean clipToOutline;
        clipToOutline = this.f10907a.getClipToOutline();
        return clipToOutline;
    }

    @Override // u0.InterfaceC1302o0
    public final void w(int i2) {
        this.f10907a.offsetTopAndBottom(i2);
    }

    @Override // u0.InterfaceC1302o0
    public final boolean x() {
        boolean clipToBounds;
        clipToBounds = this.f10907a.getClipToBounds();
        return clipToBounds;
    }

    @Override // u0.InterfaceC1302o0
    public final void y(Canvas canvas) {
        canvas.drawRenderNode(this.f10907a);
    }

    @Override // u0.InterfaceC1302o0
    public final int z() {
        int top;
        top = this.f10907a.getTop();
        return top;
    }
}
