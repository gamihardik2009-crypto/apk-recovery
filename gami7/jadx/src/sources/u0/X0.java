package u0;

import C0.C0018a;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import c0.AbstractC0569I;
import c0.AbstractC0571K;
import c0.C0565E;
import c0.C0573M;
import c0.C0580U;
import c0.C0584c;
import c0.C0601t;
import c0.InterfaceC0570J;
import c0.InterfaceC0600s;
import f0.C0663b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import n1.C0944e;

/* loaded from: classes.dex */
public final class X0 extends View implements t0.e0 {

    /* renamed from: A, reason: collision with root package name */
    public static boolean f10986A;

    /* renamed from: w, reason: collision with root package name */
    public static final R0.t f10987w = new R0.t(3);

    /* renamed from: x, reason: collision with root package name */
    public static Method f10988x;

    /* renamed from: y, reason: collision with root package name */
    public static Field f10989y;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f10990z;

    /* renamed from: h, reason: collision with root package name */
    public final C1314v f10991h;

    /* renamed from: i, reason: collision with root package name */
    public final C1309s0 f10992i;

    /* renamed from: j, reason: collision with root package name */
    public y2.e f10993j;

    /* renamed from: k, reason: collision with root package name */
    public y2.a f10994k;

    /* renamed from: l, reason: collision with root package name */
    public final D0 f10995l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10996m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f10997n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10998o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10999p;
    public final C0601t q;

    /* renamed from: r, reason: collision with root package name */
    public final A0 f11000r;

    /* renamed from: s, reason: collision with root package name */
    public long f11001s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11002t;

    /* renamed from: u, reason: collision with root package name */
    public final long f11003u;

    /* renamed from: v, reason: collision with root package name */
    public int f11004v;

    public X0(C1314v c1314v, C1309s0 c1309s0, C0018a c0018a, C0944e c0944e) {
        super(c1314v.getContext());
        this.f10991h = c1314v;
        this.f10992i = c1309s0;
        this.f10993j = c0018a;
        this.f10994k = c0944e;
        this.f10995l = new D0();
        this.q = new C0601t();
        this.f11000r = new A0(C1290i0.f11060l);
        this.f11001s = C0580U.f7240b;
        this.f11002t = true;
        setWillNotDraw(false);
        c1309s0.addView(this);
        this.f11003u = View.generateViewId();
    }

    private final InterfaceC0570J getManualClipPath() {
        if (getClipToOutline()) {
            D0 d02 = this.f10995l;
            if (!(!d02.f10847g)) {
                d02.d();
                return d02.f10845e;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z3) {
        if (z3 != this.f10998o) {
            this.f10998o = z3;
            this.f10991h.v(this, z3);
        }
    }

    @Override // t0.e0
    public final void a(C0573M c0573m) {
        y2.a aVar;
        int i2 = c0573m.f7199h | this.f11004v;
        if ((i2 & 4096) != 0) {
            long j3 = c0573m.f7211u;
            this.f11001s = j3;
            setPivotX(C0580U.b(j3) * getWidth());
            setPivotY(C0580U.c(this.f11001s) * getHeight());
        }
        if ((i2 & 1) != 0) {
            setScaleX(c0573m.f7200i);
        }
        if ((i2 & 2) != 0) {
            setScaleY(c0573m.f7201j);
        }
        if ((i2 & 4) != 0) {
            setAlpha(c0573m.f7202k);
        }
        if ((i2 & 8) != 0) {
            setTranslationX(c0573m.f7203l);
        }
        if ((i2 & 16) != 0) {
            setTranslationY(c0573m.f7204m);
        }
        if ((i2 & 32) != 0) {
            setElevation(c0573m.f7205n);
        }
        if ((i2 & 1024) != 0) {
            setRotation(c0573m.f7209s);
        }
        if ((i2 & 256) != 0) {
            setRotationX(c0573m.q);
        }
        if ((i2 & 512) != 0) {
            setRotationY(c0573m.f7208r);
        }
        if ((i2 & 2048) != 0) {
            setCameraDistancePx(c0573m.f7210t);
        }
        boolean z3 = true;
        boolean z4 = getManualClipPath() != null;
        boolean z5 = c0573m.f7213w;
        C1.b bVar = AbstractC0571K.f7193a;
        boolean z6 = z5 && c0573m.f7212v != bVar;
        if ((i2 & 24576) != 0) {
            this.f10996m = z5 && c0573m.f7212v == bVar;
            m();
            setClipToOutline(z6);
        }
        boolean c3 = this.f10995l.c(c0573m.f7198B, c0573m.f7202k, z6, c0573m.f7205n, c0573m.f7215y);
        D0 d02 = this.f10995l;
        if (d02.f10846f) {
            setOutlineProvider(d02.b() != null ? f10987w : null);
        }
        boolean z7 = getManualClipPath() != null;
        if (z4 != z7 || (z7 && c3)) {
            invalidate();
        }
        if (!this.f10999p && getElevation() > 0.0f && (aVar = this.f10994k) != null) {
            aVar.c();
        }
        if ((i2 & 7963) != 0) {
            this.f11000r.c();
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = i2 & 64;
            Z0 z02 = Z0.f11018a;
            if (i4 != 0) {
                z02.a(this, AbstractC0571K.A(c0573m.f7206o));
            }
            if ((i2 & 128) != 0) {
                z02.b(this, AbstractC0571K.A(c0573m.f7207p));
            }
        }
        if (i3 >= 31 && (131072 & i2) != 0) {
            a1.f11027a.a(this, null);
        }
        if ((i2 & 32768) != 0) {
            int i5 = c0573m.f7214x;
            if (AbstractC0571K.n(i5, 1)) {
                setLayerType(2, null);
            } else if (AbstractC0571K.n(i5, 2)) {
                setLayerType(0, null);
                z3 = false;
            } else {
                setLayerType(0, null);
            }
            this.f11002t = z3;
        }
        this.f11004v = c0573m.f7199h;
    }

    @Override // t0.e0
    public final void b(float[] fArr) {
        float[] a3 = this.f11000r.a(this);
        if (a3 != null) {
            C0565E.g(fArr, a3);
        }
    }

    @Override // t0.e0
    public final void c() {
        setInvalidated(false);
        C1314v c1314v = this.f10991h;
        c1314v.F = true;
        this.f10993j = null;
        this.f10994k = null;
        c1314v.D(this);
        this.f10992i.removeViewInLayout(this);
    }

    @Override // t0.e0
    public final long d(long j3, boolean z3) {
        A0 a02 = this.f11000r;
        if (!z3) {
            return C0565E.b(j3, a02.b(this));
        }
        float[] a3 = a02.a(this);
        if (a3 != null) {
            return C0565E.b(j3, a3);
        }
        return 9187343241974906880L;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z3;
        C0601t c0601t = this.q;
        C0584c c0584c = c0601t.f7270a;
        Canvas canvas2 = c0584c.f7245a;
        c0584c.f7245a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z3 = false;
        } else {
            c0584c.f();
            this.f10995l.a(c0584c);
            z3 = true;
        }
        y2.e eVar = this.f10993j;
        if (eVar != null) {
            eVar.j(c0584c, null);
        }
        if (z3) {
            c0584c.b();
        }
        c0601t.f7270a.f7245a = canvas2;
        setInvalidated(false);
    }

    @Override // t0.e0
    public final void e(long j3) {
        int i2 = (int) (j3 >> 32);
        int left = getLeft();
        A0 a02 = this.f11000r;
        if (i2 != left) {
            offsetLeftAndRight(i2 - getLeft());
            a02.c();
        }
        int i3 = (int) (j3 & 4294967295L);
        if (i3 != getTop()) {
            offsetTopAndBottom(i3 - getTop());
            a02.c();
        }
    }

    @Override // t0.e0
    public final void f() {
        if (!this.f10998o || f10986A) {
            return;
        }
        N.D(this);
        setInvalidated(false);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // t0.e0
    public final void g(long j3) {
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        if (i2 == getWidth() && i3 == getHeight()) {
            return;
        }
        setPivotX(C0580U.b(this.f11001s) * i2);
        setPivotY(C0580U.c(this.f11001s) * i3);
        setOutlineProvider(this.f10995l.b() != null ? f10987w : null);
        layout(getLeft(), getTop(), getLeft() + i2, getTop() + i3);
        m();
        this.f11000r.c();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C1309s0 getContainer() {
        return this.f10992i;
    }

    public long getLayerId() {
        return this.f11003u;
    }

    public final C1314v getOwnerView() {
        return this.f10991h;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return W0.a(this.f10991h);
        }
        return -1L;
    }

    @Override // t0.e0
    public final void h(b0.b bVar, boolean z3) {
        A0 a02 = this.f11000r;
        if (!z3) {
            C0565E.c(a02.b(this), bVar);
            return;
        }
        float[] a3 = a02.a(this);
        if (a3 != null) {
            C0565E.c(a3, bVar);
            return;
        }
        bVar.f7054a = 0.0f;
        bVar.f7055b = 0.0f;
        bVar.f7056c = 0.0f;
        bVar.f7057d = 0.0f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f11002t;
    }

    @Override // t0.e0
    public final void i(float[] fArr) {
        C0565E.g(fArr, this.f11000r.b(this));
    }

    @Override // android.view.View, t0.e0
    public final void invalidate() {
        if (this.f10998o) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f10991h.invalidate();
    }

    @Override // t0.e0
    public final boolean j(long j3) {
        AbstractC0569I abstractC0569I;
        float d3 = b0.c.d(j3);
        float e3 = b0.c.e(j3);
        if (this.f10996m) {
            return 0.0f <= d3 && d3 < ((float) getWidth()) && 0.0f <= e3 && e3 < ((float) getHeight());
        }
        if (!getClipToOutline()) {
            return true;
        }
        D0 d02 = this.f10995l;
        if (d02.f10853m && (abstractC0569I = d02.f10843c) != null) {
            return N.w(abstractC0569I, b0.c.d(j3), b0.c.e(j3), null, null);
        }
        return true;
    }

    @Override // t0.e0
    public final void k(InterfaceC0600s interfaceC0600s, C0663b c0663b) {
        boolean z3 = getElevation() > 0.0f;
        this.f10999p = z3;
        if (z3) {
            interfaceC0600s.o();
        }
        this.f10992i.a(interfaceC0600s, this, getDrawingTime());
        if (this.f10999p) {
            interfaceC0600s.h();
        }
    }

    @Override // t0.e0
    public final void l(C0018a c0018a, C0944e c0944e) {
        this.f10992i.addView(this);
        this.f10996m = false;
        this.f10999p = false;
        this.f11001s = C0580U.f7240b;
        this.f10993j = c0018a;
        this.f10994k = c0944e;
    }

    public final void m() {
        Rect rect;
        if (this.f10996m) {
            Rect rect2 = this.f10997n;
            if (rect2 == null) {
                this.f10997n = new Rect(0, 0, getWidth(), getHeight());
            } else {
                z2.h.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f10997n;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
    }

    public final void setCameraDistancePx(float f3) {
        setCameraDistance(f3 * getResources().getDisplayMetrics().densityDpi);
    }
}
