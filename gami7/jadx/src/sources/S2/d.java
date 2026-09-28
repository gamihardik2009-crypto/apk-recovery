package S2;

import J2.B;
import J2.C0311h;
import O2.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.C0880v;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5628h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z3) {
        super(z3 ? 1 : 0);
        this.owner = z3 ? null : e.f5629a;
    }

    public final Object c(Object obj, InterfaceC1073d interfaceC1073d) {
        int i2;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f5636g;
            int i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = this.f5637a;
            if (i3 > i4) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > i4) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i4));
            } else {
                c3 = 0;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5628h;
                if (i3 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f5629a) {
                                c3 = obj2 == obj ? (char) 1 : (char) 2;
                            }
                        }
                        if (c3 == 1) {
                            c3 = 2;
                            break;
                        }
                        if (c3 == 2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    break;
                }
            }
        }
        c3 = 1;
        C0880v c0880v = C0880v.f8657a;
        if (c3 == 0) {
            return c0880v;
        }
        if (c3 != 1) {
            if (c3 != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        C0311h l3 = B.l(AbstractC0948C.i(interfaceC1073d));
        try {
            a(new c(this, l3, obj));
            Object q = l3.q();
            EnumC1145a enumC1145a = EnumC1145a.f10026h;
            if (q != enumC1145a) {
                q = c0880v;
            }
            return q == enumC1145a ? q : c0880v;
        } catch (Throwable th) {
            l3.A();
            throw th;
        }
    }

    public final void d(Object obj) {
        while (Math.max(h.f5636g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5628h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            v vVar = e.f5629a;
            if (obj2 != vVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, vVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(B.j(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f5636g.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f5628h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
