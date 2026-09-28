package I0;

import B1.RunnableC0015e;
import C0.J;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import m2.EnumC0863e;
import m2.InterfaceC0862d;
import n0.C0919B;
import z.C1426q;

/* loaded from: classes.dex */
public final class C implements t {

    /* renamed from: a, reason: collision with root package name */
    public final View f3845a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.r f3846b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f3847c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3848d;

    /* renamed from: e, reason: collision with root package name */
    public y2.c f3849e;

    /* renamed from: f, reason: collision with root package name */
    public y2.c f3850f;

    /* renamed from: g, reason: collision with root package name */
    public z f3851g;

    /* renamed from: h, reason: collision with root package name */
    public m f3852h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3853i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0862d f3854j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f3855k;

    /* renamed from: l, reason: collision with root package name */
    public final C0248e f3856l;

    /* renamed from: m, reason: collision with root package name */
    public final L.d f3857m;

    /* renamed from: n, reason: collision with root package name */
    public RunnableC0015e f3858n;

    public C(View view, n0.v vVar) {
        Q1.r rVar = new Q1.r(view);
        final Choreographer choreographer = Choreographer.getInstance();
        Executor executor = new Executor() { // from class: I0.D
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                choreographer.postFrameCallback(new E(runnable, 0));
            }
        };
        this.f3845a = view;
        this.f3846b = rVar;
        this.f3847c = executor;
        this.f3849e = C0247d.f3872m;
        this.f3850f = C0247d.f3873n;
        this.f3851g = new z("", J.f471b, 4);
        this.f3852h = m.f3904g;
        this.f3853i = new ArrayList();
        this.f3854j = B2.a.x(EnumC0863e.f8644i, new B.y(12, this));
        this.f3856l = new C0248e(vVar, rVar);
        this.f3857m = new L.d(new B[16]);
    }

    @Override // I0.t
    public final void a(b0.d dVar) {
        Rect rect;
        this.f3855k = new Rect(B2.a.D(dVar.f7060a), B2.a.D(dVar.f7061b), B2.a.D(dVar.f7062c), B2.a.D(dVar.f7063d));
        if (!this.f3853i.isEmpty() || (rect = this.f3855k) == null) {
            return;
        }
        this.f3845a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // I0.t
    public final void b() {
        i(B.f3842j);
    }

    @Override // I0.t
    public final void c() {
        i(B.f3843k);
    }

    @Override // I0.t
    public final void d() {
        this.f3848d = false;
        this.f3849e = C0247d.f3874o;
        this.f3850f = C0247d.f3875p;
        this.f3855k = null;
        i(B.f3841i);
    }

    @Override // I0.t
    public final void e(z zVar, s sVar, C0.H h2, C0919B c0919b, b0.d dVar, b0.d dVar2) {
        C0248e c0248e = this.f3856l;
        synchronized (c0248e.f3879c) {
            try {
                c0248e.f3886j = zVar;
                c0248e.f3888l = sVar;
                c0248e.f3887k = h2;
                c0248e.f3889m = c0919b;
                c0248e.f3890n = dVar;
                c0248e.f3891o = dVar2;
                if (!c0248e.f3881e) {
                    if (c0248e.f3880d) {
                    }
                }
                c0248e.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I0.t
    public final void f(z zVar, z zVar2) {
        boolean z3 = (J.a(this.f3851g.f3933b, zVar2.f3933b) && z2.h.a(this.f3851g.f3934c, zVar2.f3934c)) ? false : true;
        this.f3851g = zVar2;
        int size = this.f3853i.size();
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = (u) ((WeakReference) this.f3853i.get(i2)).get();
            if (uVar != null) {
                uVar.f3919d = zVar2;
            }
        }
        C0248e c0248e = this.f3856l;
        synchronized (c0248e.f3879c) {
            c0248e.f3886j = null;
            c0248e.f3888l = null;
            c0248e.f3887k = null;
            c0248e.f3889m = C0247d.f3869j;
            c0248e.f3890n = null;
            c0248e.f3891o = null;
        }
        if (z2.h.a(zVar, zVar2)) {
            if (z3) {
                Q1.r rVar = this.f3846b;
                int e3 = J.e(zVar2.f3933b);
                int d3 = J.d(zVar2.f3933b);
                J j3 = this.f3851g.f3934c;
                int e4 = j3 != null ? J.e(j3.f473a) : -1;
                J j4 = this.f3851g.f3934c;
                ((InputMethodManager) ((InterfaceC0862d) rVar.f5323c).getValue()).updateSelection((View) rVar.f5322b, e3, d3, e4, j4 != null ? J.d(j4.f473a) : -1);
                return;
            }
            return;
        }
        if (zVar != null && (!z2.h.a(zVar.f3932a.f500a, zVar2.f3932a.f500a) || (J.a(zVar.f3933b, zVar2.f3933b) && !z2.h.a(zVar.f3934c, zVar2.f3934c)))) {
            Q1.r rVar2 = this.f3846b;
            ((InputMethodManager) ((InterfaceC0862d) rVar2.f5323c).getValue()).restartInput((View) rVar2.f5322b);
            return;
        }
        int size2 = this.f3853i.size();
        for (int i3 = 0; i3 < size2; i3++) {
            u uVar2 = (u) ((WeakReference) this.f3853i.get(i3)).get();
            if (uVar2 != null) {
                z zVar3 = this.f3851g;
                Q1.r rVar3 = this.f3846b;
                if (uVar2.f3923h) {
                    uVar2.f3919d = zVar3;
                    if (uVar2.f3921f) {
                        ((InputMethodManager) ((InterfaceC0862d) rVar3.f5323c).getValue()).updateExtractedText((View) rVar3.f5322b, uVar2.f3920e, l0.c.T(zVar3));
                    }
                    J j5 = zVar3.f3934c;
                    int e5 = j5 != null ? J.e(j5.f473a) : -1;
                    J j6 = zVar3.f3934c;
                    int d4 = j6 != null ? J.d(j6.f473a) : -1;
                    long j7 = zVar3.f3933b;
                    ((InputMethodManager) ((InterfaceC0862d) rVar3.f5323c).getValue()).updateSelection((View) rVar3.f5322b, J.e(j7), J.d(j7), e5, d4);
                }
            }
        }
    }

    @Override // I0.t
    public final void g() {
        i(B.f3840h);
    }

    @Override // I0.t
    public final void h(z zVar, m mVar, L2.d dVar, C1426q c1426q) {
        this.f3848d = true;
        this.f3851g = zVar;
        this.f3852h = mVar;
        this.f3849e = dVar;
        this.f3850f = c1426q;
        i(B.f3840h);
    }

    public final void i(B b3) {
        this.f3857m.b(b3);
        if (this.f3858n == null) {
            RunnableC0015e runnableC0015e = new RunnableC0015e(2, this);
            this.f3847c.execute(runnableC0015e);
            this.f3858n = runnableC0015e;
        }
    }
}
