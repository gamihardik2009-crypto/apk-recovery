package u0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import c0.AbstractC0571K;
import c0.C0584c;
import c0.C0601t;
import c0.InterfaceC0570J;
import n0.C0919B;

/* loaded from: classes.dex */
public final class H0 implements InterfaceC1302o0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f10898g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f10899a;

    /* renamed from: b, reason: collision with root package name */
    public int f10900b;

    /* renamed from: c, reason: collision with root package name */
    public int f10901c;

    /* renamed from: d, reason: collision with root package name */
    public int f10902d;

    /* renamed from: e, reason: collision with root package name */
    public int f10903e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10904f;

    public H0(C1314v c1314v) {
        RenderNode create = RenderNode.create("Compose", c1314v);
        this.f10899a = create;
        if (f10898g) {
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
                N0 n02 = N0.f10929a;
                n02.c(create, n02.a(create));
                n02.d(create, n02.b(create));
            }
            M0.f10924a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f10898g = false;
        }
    }

    @Override // u0.InterfaceC1302o0
    public final int A() {
        return this.f10900b;
    }

    @Override // u0.InterfaceC1302o0
    public final void B(boolean z3) {
        this.f10899a.setClipToOutline(z3);
    }

    @Override // u0.InterfaceC1302o0
    public final void C(int i2) {
        if (AbstractC0571K.n(i2, 1)) {
            this.f10899a.setLayerType(2);
            this.f10899a.setHasOverlappingRendering(true);
        } else if (AbstractC0571K.n(i2, 2)) {
            this.f10899a.setLayerType(0);
            this.f10899a.setHasOverlappingRendering(false);
        } else {
            this.f10899a.setLayerType(0);
            this.f10899a.setHasOverlappingRendering(true);
        }
    }

    @Override // u0.InterfaceC1302o0
    public final void D(float f3) {
        this.f10899a.setPivotX(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void E(boolean z3) {
        this.f10904f = z3;
        this.f10899a.setClipToBounds(z3);
    }

    @Override // u0.InterfaceC1302o0
    public final void F(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            N0.f10929a.d(this.f10899a, i2);
        }
    }

    @Override // u0.InterfaceC1302o0
    public final boolean G(int i2, int i3, int i4, int i5) {
        this.f10900b = i2;
        this.f10901c = i3;
        this.f10902d = i4;
        this.f10903e = i5;
        return this.f10899a.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // u0.InterfaceC1302o0
    public final boolean H() {
        return this.f10899a.setHasOverlappingRendering(true);
    }

    @Override // u0.InterfaceC1302o0
    public final void I(Matrix matrix) {
        this.f10899a.getMatrix(matrix);
    }

    @Override // u0.InterfaceC1302o0
    public final float J() {
        return this.f10899a.getElevation();
    }

    @Override // u0.InterfaceC1302o0
    public final void K(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            N0.f10929a.c(this.f10899a, i2);
        }
    }

    @Override // u0.InterfaceC1302o0
    public final void L(C0601t c0601t, InterfaceC0570J interfaceC0570J, C0919B c0919b) {
        DisplayListCanvas start = this.f10899a.start(f(), h());
        Canvas t3 = c0601t.a().t();
        c0601t.a().u((Canvas) start);
        C0584c a3 = c0601t.a();
        if (interfaceC0570J != null) {
            a3.f();
            a3.d(interfaceC0570J, 1);
        }
        c0919b.l(a3);
        if (interfaceC0570J != null) {
            a3.b();
        }
        c0601t.a().u(t3);
        this.f10899a.end(start);
    }

    @Override // u0.InterfaceC1302o0
    public final float a() {
        return this.f10899a.getAlpha();
    }

    @Override // u0.InterfaceC1302o0
    public final void b(float f3) {
        this.f10899a.setRotationY(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void c(float f3) {
        this.f10899a.setTranslationX(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void d(float f3) {
        this.f10899a.setAlpha(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void e(float f3) {
        this.f10899a.setScaleY(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final int f() {
        return this.f10902d - this.f10900b;
    }

    @Override // u0.InterfaceC1302o0
    public final void g() {
    }

    @Override // u0.InterfaceC1302o0
    public final int h() {
        return this.f10903e - this.f10901c;
    }

    @Override // u0.InterfaceC1302o0
    public final void i(float f3) {
        this.f10899a.setRotation(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void j(float f3) {
        this.f10899a.setTranslationY(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void k(float f3) {
        this.f10899a.setCameraDistance(-f3);
    }

    @Override // u0.InterfaceC1302o0
    public final boolean l() {
        return this.f10899a.isValid();
    }

    @Override // u0.InterfaceC1302o0
    public final void m(Outline outline) {
        this.f10899a.setOutline(outline);
    }

    @Override // u0.InterfaceC1302o0
    public final void n(float f3) {
        this.f10899a.setScaleX(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void o(float f3) {
        this.f10899a.setRotationX(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void p() {
        M0.f10924a.a(this.f10899a);
    }

    @Override // u0.InterfaceC1302o0
    public final void q(float f3) {
        this.f10899a.setPivotY(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void r(float f3) {
        this.f10899a.setElevation(f3);
    }

    @Override // u0.InterfaceC1302o0
    public final void s(int i2) {
        this.f10900b += i2;
        this.f10902d += i2;
        this.f10899a.offsetLeftAndRight(i2);
    }

    @Override // u0.InterfaceC1302o0
    public final int t() {
        return this.f10903e;
    }

    @Override // u0.InterfaceC1302o0
    public final int u() {
        return this.f10902d;
    }

    @Override // u0.InterfaceC1302o0
    public final boolean v() {
        return this.f10899a.getClipToOutline();
    }

    @Override // u0.InterfaceC1302o0
    public final void w(int i2) {
        this.f10901c += i2;
        this.f10903e += i2;
        this.f10899a.offsetTopAndBottom(i2);
    }

    @Override // u0.InterfaceC1302o0
    public final boolean x() {
        return this.f10904f;
    }

    @Override // u0.InterfaceC1302o0
    public final void y(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f10899a);
    }

    @Override // u0.InterfaceC1302o0
    public final int z() {
        return this.f10901c;
    }
}
