package u0;

import J.C0278m0;
import J2.AbstractC0324v;
import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import m2.C0870l;
import n2.C0958j;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class Y extends AbstractC0324v {

    /* renamed from: t, reason: collision with root package name */
    public static final C0870l f11005t = new C0870l(O.f10946p);

    /* renamed from: u, reason: collision with root package name */
    public static final C2.b f11006u = new C2.b(1);

    /* renamed from: j, reason: collision with root package name */
    public final Choreographer f11007j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f11008k;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11013p;
    public boolean q;

    /* renamed from: s, reason: collision with root package name */
    public final C0278m0 f11015s;

    /* renamed from: l, reason: collision with root package name */
    public final Object f11009l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public final C0958j f11010m = new C0958j();

    /* renamed from: n, reason: collision with root package name */
    public List f11011n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public List f11012o = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final X f11014r = new X(this);

    public Y(Choreographer choreographer, Handler handler) {
        this.f11007j = choreographer;
        this.f11008k = handler;
        this.f11015s = new C0278m0(choreographer, this);
    }

    public static final void x(Y y3) {
        Runnable runnable;
        boolean z3;
        do {
            synchronized (y3.f11009l) {
                C0958j c0958j = y3.f11010m;
                runnable = (Runnable) (c0958j.isEmpty() ? null : c0958j.o());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (y3.f11009l) {
                    C0958j c0958j2 = y3.f11010m;
                    runnable = (Runnable) (c0958j2.isEmpty() ? null : c0958j2.o());
                }
            }
            synchronized (y3.f11009l) {
                if (y3.f11010m.isEmpty()) {
                    z3 = false;
                    y3.f11013p = false;
                } else {
                    z3 = true;
                }
            }
        } while (z3);
    }

    @Override // J2.AbstractC0324v
    public final void r(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        synchronized (this.f11009l) {
            this.f11010m.f(runnable);
            if (!this.f11013p) {
                this.f11013p = true;
                this.f11008k.post(this.f11014r);
                if (!this.q) {
                    this.q = true;
                    this.f11007j.postFrameCallback(this.f11014r);
                }
            }
        }
    }
}
