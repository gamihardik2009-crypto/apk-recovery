package f0;

import B1.C;
import R0.t;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import c0.C0584c;
import c0.C0601t;
import c0.InterfaceC0600s;
import e0.AbstractC0653c;
import e0.C0652b;

/* loaded from: classes.dex */
public final class n extends View {

    /* renamed from: r, reason: collision with root package name */
    public static final t f7685r = new t(2);

    /* renamed from: h, reason: collision with root package name */
    public final View f7686h;

    /* renamed from: i, reason: collision with root package name */
    public final C0601t f7687i;

    /* renamed from: j, reason: collision with root package name */
    public final C0652b f7688j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7689k;

    /* renamed from: l, reason: collision with root package name */
    public Outline f7690l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7691m;

    /* renamed from: n, reason: collision with root package name */
    public O0.b f7692n;

    /* renamed from: o, reason: collision with root package name */
    public O0.k f7693o;

    /* renamed from: p, reason: collision with root package name */
    public y2.c f7694p;
    public C0663b q;

    public n(View view, C0601t c0601t, C0652b c0652b) {
        super(view.getContext());
        this.f7686h = view;
        this.f7687i = c0601t;
        this.f7688j = c0652b;
        setOutlineProvider(f7685r);
        this.f7691m = true;
        this.f7692n = AbstractC0653c.f7555a;
        this.f7693o = O0.k.f5148h;
        InterfaceC0665d.f7609a.getClass();
        this.f7694p = C0662a.f7587k;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0601t c0601t = this.f7687i;
        C0584c c0584c = c0601t.f7270a;
        Canvas canvas2 = c0584c.f7245a;
        c0584c.f7245a = canvas;
        O0.b bVar = this.f7692n;
        O0.k kVar = this.f7693o;
        long i2 = C.i(getWidth(), getHeight());
        C0663b c0663b = this.q;
        y2.c cVar = this.f7694p;
        C0652b c0652b = this.f7688j;
        O0.b f3 = c0652b.e0().f();
        O0.k h2 = c0652b.e0().h();
        InterfaceC0600s e3 = c0652b.e0().e();
        long j3 = c0652b.e0().j();
        C0663b c0663b2 = (C0663b) c0652b.e0().f4559b;
        K1.m e02 = c0652b.e0();
        e02.o(bVar);
        e02.q(kVar);
        e02.n(c0584c);
        e02.r(i2);
        e02.f4559b = c0663b;
        c0584c.f();
        try {
            cVar.l(c0652b);
            c0584c.b();
            K1.m e03 = c0652b.e0();
            e03.o(f3);
            e03.q(h2);
            e03.n(e3);
            e03.r(j3);
            e03.f4559b = c0663b2;
            c0601t.f7270a.f7245a = canvas2;
            this.f7689k = false;
        } catch (Throwable th) {
            c0584c.b();
            K1.m e04 = c0652b.e0();
            e04.o(f3);
            e04.q(h2);
            e04.n(e3);
            e04.r(j3);
            e04.f4559b = c0663b2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f7691m;
    }

    public final C0601t getCanvasHolder() {
        return this.f7687i;
    }

    public final View getOwnerView() {
        return this.f7686h;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f7691m;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f7689k) {
            return;
        }
        this.f7689k = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z3) {
        if (this.f7691m != z3) {
            this.f7691m = z3;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z3) {
        this.f7689k = z3;
    }
}
