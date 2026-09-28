package J2;

import q2.AbstractC1070a;
import q2.C1074e;
import q2.C1079j;
import q2.InterfaceC1075f;
import q2.InterfaceC1076g;
import q2.InterfaceC1077h;
import q2.InterfaceC1078i;

/* renamed from: J2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0324v extends AbstractC1070a implements InterfaceC1075f {

    /* renamed from: i, reason: collision with root package name */
    public static final C0323u f4434i = new C0323u(C1074e.f9782h, C0322t.f4429i);

    public AbstractC0324v() {
        super(C1074e.f9782h);
    }

    @Override // q2.AbstractC1070a, q2.InterfaceC1078i
    public final InterfaceC1078i h(InterfaceC1077h interfaceC1077h) {
        z2.h.f(interfaceC1077h, "key");
        boolean z3 = interfaceC1077h instanceof C0323u;
        C1079j c1079j = C1079j.f9784h;
        if (z3) {
            C0323u c0323u = (C0323u) interfaceC1077h;
            InterfaceC1077h interfaceC1077h2 = this.f9776h;
            z2.h.f(interfaceC1077h2, "key");
            if ((interfaceC1077h2 == c0323u || c0323u.f4432i == interfaceC1077h2) && ((InterfaceC1076g) c0323u.f4431h.l(this)) != null) {
                return c1079j;
            }
        } else if (C1074e.f9782h == interfaceC1077h) {
            return c1079j;
        }
        return this;
    }

    public abstract void r(InterfaceC1078i interfaceC1078i, Runnable runnable);

    @Override // q2.AbstractC1070a, q2.InterfaceC1078i
    public final InterfaceC1076g s(InterfaceC1077h interfaceC1077h) {
        z2.h.f(interfaceC1077h, "key");
        if (!(interfaceC1077h instanceof C0323u)) {
            if (C1074e.f9782h == interfaceC1077h) {
                return this;
            }
            return null;
        }
        C0323u c0323u = (C0323u) interfaceC1077h;
        InterfaceC1077h interfaceC1077h2 = this.f9776h;
        z2.h.f(interfaceC1077h2, "key");
        if (interfaceC1077h2 != c0323u && c0323u.f4432i != interfaceC1077h2) {
            return null;
        }
        InterfaceC1076g interfaceC1076g = (InterfaceC1076g) c0323u.f4431h.l(this);
        if (interfaceC1076g instanceof InterfaceC1076g) {
            return interfaceC1076g;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + B.j(this);
    }

    public void v(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        r(interfaceC1078i, runnable);
    }

    public boolean w() {
        return !(this instanceof t0);
    }
}
