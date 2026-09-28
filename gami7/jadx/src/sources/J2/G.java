package J2;

import O2.AbstractC0369a;
import java.util.concurrent.CancellationException;
import m2.AbstractC0868j;
import m2.C0880v;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public abstract class G extends Q2.h {

    /* renamed from: j, reason: collision with root package name */
    public int f4355j;

    public G(int i2) {
        super(0L, Q2.k.f5359g);
        this.f4355j = i2;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract InterfaceC1073d d();

    public Throwable e(Object obj) {
        C0319p c0319p = obj instanceof C0319p ? (C0319p) obj : null;
        if (c0319p != null) {
            return c0319p.f4422a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            B1.C.p(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        z2.h.c(th);
        B.m(new A("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().n());
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = C0880v.f8657a;
        Q2.i iVar = this.f5350i;
        try {
            InterfaceC1073d d3 = d();
            z2.h.d(d3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            O2.h hVar = (O2.h) d3;
            InterfaceC1073d interfaceC1073d = hVar.f5180l;
            Object obj2 = hVar.f5182n;
            InterfaceC1078i n3 = interfaceC1073d.n();
            Object l3 = AbstractC0369a.l(n3, obj2);
            u0 y3 = l3 != AbstractC0369a.f5170f ? B.y(interfaceC1073d, n3, l3) : null;
            try {
                InterfaceC1078i n4 = interfaceC1073d.n();
                Object h2 = h();
                Throwable e3 = e(h2);
                Z z3 = (e3 == null && B.q(this.f4355j)) ? (Z) n4.s(C0325w.f4437i) : null;
                if (z3 != null && !z3.b()) {
                    CancellationException i2 = z3.i();
                    c(h2, i2);
                    interfaceC1073d.t(C1.y.n(i2));
                } else if (e3 != null) {
                    interfaceC1073d.t(C1.y.n(e3));
                } else {
                    interfaceC1073d.t(f(h2));
                }
                if (y3 == null || y3.n0()) {
                    AbstractC0369a.g(n3, l3);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = C1.y.n(th);
                }
                g(null, AbstractC0868j.a(obj));
            } catch (Throwable th2) {
                if (y3 == null || y3.n0()) {
                    AbstractC0369a.g(n3, l3);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = C1.y.n(th4);
            }
            g(th3, AbstractC0868j.a(obj));
        }
    }
}
