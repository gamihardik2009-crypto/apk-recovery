package K2;

import B1.F;
import D.C0053w;
import J2.AbstractC0324v;
import J2.C0311h;
import J2.C0325w;
import J2.E;
import J2.H;
import J2.J;
import J2.Z;
import J2.m0;
import O2.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import q2.InterfaceC1078i;
import z2.h;

/* loaded from: classes.dex */
public final class d extends AbstractC0324v implements E {
    private volatile d _immediate;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f4607j;

    /* renamed from: k, reason: collision with root package name */
    public final String f4608k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4609l;

    /* renamed from: m, reason: collision with root package name */
    public final d f4610m;

    public d(Handler handler, String str, boolean z3) {
        this.f4607j = handler;
        this.f4608k = str;
        this.f4609l = z3;
        this._immediate = z3 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f4610m = dVar;
    }

    @Override // J2.E
    public final void c(long j3, C0311h c0311h) {
        F f3 = new F(6, (Object) c0311h, (Object) this, false);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f4607j.postDelayed(f3, j3)) {
            c0311h.u(new C0053w(this, 12, f3));
        } else {
            x(c0311h.f4403l, f3);
        }
    }

    @Override // J2.E
    public final J e(long j3, final Runnable runnable, InterfaceC1078i interfaceC1078i) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f4607j.postDelayed(runnable, j3)) {
            return new J() { // from class: K2.c
                @Override // J2.J
                public final void a() {
                    d.this.f4607j.removeCallbacks(runnable);
                }
            };
        }
        x(interfaceC1078i, runnable);
        return m0.f4415h;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f4607j == this.f4607j;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4607j);
    }

    @Override // J2.AbstractC0324v
    public final void r(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        if (this.f4607j.post(runnable)) {
            return;
        }
        x(interfaceC1078i, runnable);
    }

    @Override // J2.AbstractC0324v
    public final String toString() {
        d dVar;
        String str;
        Q2.d dVar2 = H.f4356a;
        d dVar3 = o.f5202a;
        if (this == dVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar3.f4610m;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f4608k;
        if (str2 == null) {
            str2 = this.f4607j.toString();
        }
        if (!this.f4609l) {
            return str2;
        }
        return str2 + ".immediate";
    }

    @Override // J2.AbstractC0324v
    public final boolean w() {
        return (this.f4609l && h.a(Looper.myLooper(), this.f4607j.getLooper())) ? false : true;
    }

    public final void x(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        Z z3 = (Z) interfaceC1078i.s(C0325w.f4437i);
        if (z3 != null) {
            z3.a(cancellationException);
        }
        H.f4357b.r(interfaceC1078i, runnable);
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
