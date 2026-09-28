package J2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.C0880v;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import q2.InterfaceC1076g;
import q2.InterfaceC1077h;
import q2.InterfaceC1078i;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public class i0 implements Z, InterfaceC0316m, o0 {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4409h = AtomicReferenceFieldUpdater.newUpdater(i0.class, Object.class, "_state");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4410i = AtomicReferenceFieldUpdater.newUpdater(i0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public i0(boolean z3) {
        this._state = z3 ? B.f4351j : B.f4350i;
    }

    public static C0315l c0(O2.k kVar) {
        while (kVar.p()) {
            O2.k k3 = kVar.k();
            if (k3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = O2.k.f5191i;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (O2.k) obj;
                    if (!kVar.p()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = k3;
            }
        }
        while (true) {
            kVar = kVar.o();
            if (!kVar.p()) {
                if (kVar instanceof C0315l) {
                    return (C0315l) kVar;
                }
                if (kVar instanceof k0) {
                    return null;
                }
            }
        }
    }

    public static String i0(Object obj) {
        if (!(obj instanceof g0)) {
            return obj instanceof V ? ((V) obj).b() ? "Active" : "New" : obj instanceof C0319p ? "Cancelled" : "Completed";
        }
        g0 g0Var = (g0) obj;
        return g0Var.d() ? "Cancelling" : g0Var.e() ? "Completing" : "Active";
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i A(InterfaceC1078i interfaceC1078i) {
        return AbstractC0948C.n(this, interfaceC1078i);
    }

    @Override // J2.Z
    public final InterfaceC0314k C(i0 i0Var) {
        return (InterfaceC0314k) B.n(this, true, new C0315l(i0Var), 2);
    }

    public final boolean F(V v3, k0 k0Var, d0 d0Var) {
        char c3;
        h0 h0Var = new h0(d0Var, this, v3);
        do {
            O2.k k3 = k0Var.k();
            if (k3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = O2.k.f5191i;
                Object obj = atomicReferenceFieldUpdater.get(k0Var);
                while (true) {
                    k3 = (O2.k) obj;
                    if (!k3.p()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(k3);
                }
            }
            O2.k.f5191i.lazySet(d0Var, k3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = O2.k.f5190h;
            atomicReferenceFieldUpdater2.lazySet(d0Var, k0Var);
            h0Var.f4405c = k0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(k3, k0Var, h0Var)) {
                    c3 = h0Var.a(k3) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(k3) != k0Var) {
                    c3 = 0;
                    break;
                }
            }
            if (c3 == 1) {
                return true;
            }
        } while (c3 != 2);
        return false;
    }

    public void G(Object obj) {
    }

    public void I(Object obj) {
        G(obj);
    }

    public final boolean J(Object obj) {
        O2.v vVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = B.f4345d;
        if (T()) {
            do {
                Object V2 = V();
                if (!(V2 instanceof V) || ((V2 instanceof g0) && ((g0) V2).e())) {
                    obj2 = B.f4345d;
                    break;
                }
                obj2 = j0(V2, new C0319p(P(obj), false));
            } while (obj2 == B.f4347f);
            if (obj2 == B.f4346e) {
                return true;
            }
        }
        if (obj2 == B.f4345d) {
            Throwable th = null;
            loop1: while (true) {
                Object V3 = V();
                if (!(V3 instanceof g0)) {
                    if (!(V3 instanceof V)) {
                        vVar = B.f4348g;
                        break;
                    }
                    if (th == null) {
                        th = P(obj);
                    }
                    V v3 = (V) V3;
                    if (v3.b()) {
                        k0 U3 = U(v3);
                        if (U3 == null) {
                            continue;
                        } else {
                            g0 g0Var = new g0(U3, th);
                            do {
                                atomicReferenceFieldUpdater = f4409h;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, v3, g0Var)) {
                                    d0(U3, th);
                                    vVar = B.f4345d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == v3);
                        }
                    } else {
                        Object j02 = j0(V3, new C0319p(th, false));
                        if (j02 == B.f4345d) {
                            throw new IllegalStateException(("Cannot happen in " + V3).toString());
                        }
                        if (j02 != B.f4347f) {
                            obj2 = j02;
                            break;
                        }
                    }
                } else {
                    synchronized (V3) {
                        try {
                            g0 g0Var2 = (g0) V3;
                            g0Var2.getClass();
                            if (g0.f4397k.get(g0Var2) == B.f4349h) {
                                vVar = B.f4348g;
                            } else {
                                boolean d3 = ((g0) V3).d();
                                if (th == null) {
                                    th = P(obj);
                                }
                                ((g0) V3).a(th);
                                Throwable c3 = d3 ^ true ? ((g0) V3).c() : null;
                                if (c3 != null) {
                                    d0(((g0) V3).f4398h, c3);
                                }
                                vVar = B.f4345d;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = vVar;
        }
        if (obj2 != B.f4345d && obj2 != B.f4346e) {
            if (obj2 == B.f4348g) {
                return false;
            }
            G(obj2);
        }
        return true;
    }

    public void K(CancellationException cancellationException) {
        J(cancellationException);
    }

    public final boolean L(Throwable th) {
        if (Z()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC0314k interfaceC0314k = (InterfaceC0314k) f4410i.get(this);
        return (interfaceC0314k == null || interfaceC0314k == m0.f4415h) ? z3 : interfaceC0314k.d(th) || z3;
    }

    public String M() {
        return "Job was cancelled";
    }

    public boolean N(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return J(th) && S();
    }

    public final void O(V v3, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4410i;
        InterfaceC0314k interfaceC0314k = (InterfaceC0314k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0314k != null) {
            interfaceC0314k.a();
            atomicReferenceFieldUpdater.set(this, m0.f4415h);
        }
        r rVar = null;
        C0319p c0319p = obj instanceof C0319p ? (C0319p) obj : null;
        Throwable th = c0319p != null ? c0319p.f4422a : null;
        if (v3 instanceof d0) {
            try {
                ((d0) v3).r(th);
                return;
            } catch (Throwable th2) {
                X(new r("Exception in completion handler " + v3 + " for " + this, th2));
                return;
            }
        }
        k0 f3 = v3.f();
        if (f3 != null) {
            Object n3 = f3.n();
            z2.h.d(n3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (O2.k kVar = (O2.k) n3; !z2.h.a(kVar, f3); kVar = kVar.o()) {
                if (kVar instanceof d0) {
                    d0 d0Var = (d0) kVar;
                    try {
                        d0Var.r(th);
                    } catch (Throwable th3) {
                        if (rVar != null) {
                            B1.C.p(rVar, th3);
                        } else {
                            rVar = new r("Exception in completion handler " + d0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (rVar != null) {
                X(rVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable P(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        i0 i0Var = (i0) ((o0) obj);
        Object V2 = i0Var.V();
        if (V2 instanceof g0) {
            cancellationException = ((g0) V2).c();
        } else if (V2 instanceof C0319p) {
            cancellationException = ((C0319p) V2).f4422a;
        } else {
            if (V2 instanceof V) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + V2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new a0("Parent job is ".concat(i0(V2)), cancellationException, i0Var);
        }
        return cancellationException2;
    }

    public final Object Q(g0 g0Var, Object obj) {
        Throwable R3;
        C0319p c0319p = obj instanceof C0319p ? (C0319p) obj : null;
        Throwable th = c0319p != null ? c0319p.f4422a : null;
        synchronized (g0Var) {
            g0Var.d();
            ArrayList<Throwable> g3 = g0Var.g(th);
            R3 = R(g0Var, g3);
            if (R3 != null && g3.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g3.size()));
                for (Throwable th2 : g3) {
                    if (th2 != R3 && th2 != R3 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        B1.C.p(R3, th2);
                    }
                }
            }
        }
        if (R3 != null && R3 != th) {
            obj = new C0319p(R3, false);
        }
        if (R3 != null && (L(R3) || W(R3))) {
            z2.h.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0319p.f4421b.compareAndSet((C0319p) obj, 0, 1);
        }
        e0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4409h;
        Object w2 = obj instanceof V ? new W((V) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, g0Var, w2) && atomicReferenceFieldUpdater.get(this) == g0Var) {
        }
        O(g0Var, obj);
        return obj;
    }

    public final Throwable R(g0 g0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (g0Var.d()) {
                return new a0(M(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof s0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof s0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean S() {
        return true;
    }

    public boolean T() {
        return this instanceof C0317n;
    }

    public final k0 U(V v3) {
        k0 f3 = v3.f();
        if (f3 != null) {
            return f3;
        }
        if (v3 instanceof K) {
            return new k0();
        }
        if (v3 instanceof d0) {
            g0((d0) v3);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + v3).toString());
    }

    public final Object V() {
        while (true) {
            Object obj = f4409h.get(this);
            if (!(obj instanceof O2.p)) {
                return obj;
            }
            ((O2.p) obj).a(this);
        }
    }

    public boolean W(Throwable th) {
        return false;
    }

    public void X(r rVar) {
        throw rVar;
    }

    public final void Y(Z z3) {
        m0 m0Var = m0.f4415h;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4410i;
        if (z3 == null) {
            atomicReferenceFieldUpdater.set(this, m0Var);
            return;
        }
        z3.j();
        InterfaceC0314k C3 = z3.C(this);
        atomicReferenceFieldUpdater.set(this, C3);
        if (!(V() instanceof V)) {
            C3.a();
            atomicReferenceFieldUpdater.set(this, m0Var);
        }
    }

    public boolean Z() {
        return this instanceof C0306c;
    }

    @Override // J2.Z
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new a0(M(), null, this);
        }
        K(cancellationException);
    }

    public final Object a0(Object obj) {
        Object j02;
        do {
            j02 = j0(V(), obj);
            if (j02 == B.f4345d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0319p c0319p = obj instanceof C0319p ? (C0319p) obj : null;
                throw new IllegalStateException(str, c0319p != null ? c0319p.f4422a : null);
            }
        } while (j02 == B.f4347f);
        return j02;
    }

    @Override // J2.Z
    public boolean b() {
        Object V2 = V();
        return (V2 instanceof V) && ((V) V2).b();
    }

    public String b0() {
        return getClass().getSimpleName();
    }

    public final void d0(k0 k0Var, Throwable th) {
        Object n3 = k0Var.n();
        z2.h.d(n3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        r rVar = null;
        for (O2.k kVar = (O2.k) n3; !z2.h.a(kVar, k0Var); kVar = kVar.o()) {
            if (kVar instanceof b0) {
                d0 d0Var = (d0) kVar;
                try {
                    d0Var.r(th);
                } catch (Throwable th2) {
                    if (rVar != null) {
                        B1.C.p(rVar, th2);
                    } else {
                        rVar = new r("Exception in completion handler " + d0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (rVar != null) {
            X(rVar);
        }
        L(th);
    }

    public void e0(Object obj) {
    }

    public void f0() {
    }

    @Override // J2.Z
    public final J g(y2.c cVar) {
        return o(false, true, cVar);
    }

    public final void g0(d0 d0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k0 k0Var = new k0();
        d0Var.getClass();
        O2.k.f5191i.lazySet(k0Var, d0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = O2.k.f5190h;
        atomicReferenceFieldUpdater2.lazySet(k0Var, d0Var);
        loop0: while (true) {
            if (d0Var.n() == d0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(d0Var, d0Var, k0Var)) {
                    if (atomicReferenceFieldUpdater2.get(d0Var) != d0Var) {
                        break;
                    }
                }
                k0Var.m(d0Var);
                break loop0;
            }
            break;
        }
        O2.k o3 = d0Var.o();
        do {
            atomicReferenceFieldUpdater = f4409h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, d0Var, o3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == d0Var);
    }

    @Override // q2.InterfaceC1076g
    public final InterfaceC1077h getKey() {
        return C0325w.f4437i;
    }

    @Override // J2.Z
    public final Z getParent() {
        InterfaceC0314k interfaceC0314k = (InterfaceC0314k) f4410i.get(this);
        if (interfaceC0314k != null) {
            return interfaceC0314k.getParent();
        }
        return null;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i h(InterfaceC1077h interfaceC1077h) {
        return AbstractC0948C.k(this, interfaceC1077h);
    }

    public final int h0(Object obj) {
        boolean z3 = obj instanceof K;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4409h;
        if (z3) {
            if (((K) obj).f4359h) {
                return 0;
            }
            K k3 = B.f4351j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            f0();
            return 1;
        }
        if (!(obj instanceof U)) {
            return 0;
        }
        k0 k0Var = ((U) obj).f4374h;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        f0();
        return 1;
    }

    @Override // J2.Z
    public final CancellationException i() {
        CancellationException cancellationException;
        Object V2 = V();
        if (!(V2 instanceof g0)) {
            if (V2 instanceof V) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(V2 instanceof C0319p)) {
                return new a0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0319p) V2).f4422a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new a0(M(), th, this) : cancellationException;
        }
        Throwable c3 = ((g0) V2).c();
        if (c3 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c3 instanceof CancellationException ? (CancellationException) c3 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = M();
        }
        return new a0(concat, c3, this);
    }

    @Override // J2.Z
    public final boolean j() {
        int h0;
        do {
            h0 = h0(V());
            if (h0 == 0) {
                return false;
            }
        } while (h0 != 1);
        return true;
    }

    public final Object j0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof V)) {
            return B.f4345d;
        }
        if (((obj instanceof K) || (obj instanceof d0)) && !(obj instanceof C0315l) && !(obj2 instanceof C0319p)) {
            V v3 = (V) obj;
            Object w2 = obj2 instanceof V ? new W((V) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f4409h;
                if (atomicReferenceFieldUpdater.compareAndSet(this, v3, w2)) {
                    e0(obj2);
                    O(v3, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == v3);
            return B.f4347f;
        }
        V v4 = (V) obj;
        k0 U3 = U(v4);
        if (U3 == null) {
            return B.f4347f;
        }
        C0315l c0315l = null;
        g0 g0Var = v4 instanceof g0 ? (g0) v4 : null;
        if (g0Var == null) {
            g0Var = new g0(U3, null);
        }
        synchronized (g0Var) {
            if (g0Var.e()) {
                return B.f4345d;
            }
            g0.f4395i.set(g0Var, 1);
            if (g0Var != v4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4409h;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, v4, g0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != v4) {
                        return B.f4347f;
                    }
                }
            }
            boolean d3 = g0Var.d();
            C0319p c0319p = obj2 instanceof C0319p ? (C0319p) obj2 : null;
            if (c0319p != null) {
                g0Var.a(c0319p.f4422a);
            }
            Throwable c3 = g0Var.c();
            if (!(!d3)) {
                c3 = null;
            }
            if (c3 != null) {
                d0(U3, c3);
            }
            C0315l c0315l2 = v4 instanceof C0315l ? (C0315l) v4 : null;
            if (c0315l2 == null) {
                k0 f3 = v4.f();
                if (f3 != null) {
                    c0315l = c0(f3);
                }
            } else {
                c0315l = c0315l2;
            }
            if (c0315l != null) {
                while (B.n(c0315l.f4413l, false, new f0(this, g0Var, c0315l, obj2), 1) == m0.f4415h) {
                    c0315l = c0(c0315l);
                    if (c0315l == null) {
                    }
                }
                return B.f4346e;
            }
            return Q(g0Var, obj2);
        }
    }

    @Override // J2.Z
    public final Object l(InterfaceC1073d interfaceC1073d) {
        Object V2;
        C0880v c0880v;
        do {
            V2 = V();
            boolean z3 = V2 instanceof V;
            c0880v = C0880v.f8657a;
            if (!z3) {
                B.g(interfaceC1073d.n());
                return c0880v;
            }
        } while (h0(V2) < 0);
        C0311h c0311h = new C0311h(1, AbstractC0948C.i(interfaceC1073d));
        c0311h.r();
        c0311h.u(new C0308e(1, o(false, true, new Y(2, c0311h))));
        Object q = c0311h.q();
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        if (q != enumC1145a) {
            q = c0880v;
        }
        return q == enumC1145a ? q : c0880v;
    }

    @Override // J2.Z
    public final J o(boolean z3, boolean z4, y2.c cVar) {
        d0 d0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z3) {
            d0Var = cVar instanceof b0 ? (b0) cVar : null;
            if (d0Var == null) {
                d0Var = new X(cVar);
            }
        } else {
            d0Var = cVar instanceof d0 ? (d0) cVar : null;
            if (d0Var == null) {
                d0Var = new Y(0, cVar);
            }
        }
        d0Var.f4387k = this;
        while (true) {
            Object V2 = V();
            if (V2 instanceof K) {
                K k3 = (K) V2;
                if (k3.f4359h) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4409h;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, V2, d0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != V2) {
                            break;
                        }
                    }
                    return d0Var;
                }
                k0 k0Var = new k0();
                V u3 = k3.f4359h ? k0Var : new U(k0Var);
                do {
                    atomicReferenceFieldUpdater = f4409h;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, k3, u3)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == k3);
            } else {
                if (!(V2 instanceof V)) {
                    if (z4) {
                        C0319p c0319p = V2 instanceof C0319p ? (C0319p) V2 : null;
                        cVar.l(c0319p != null ? c0319p.f4422a : null);
                    }
                    return m0.f4415h;
                }
                k0 f3 = ((V) V2).f();
                if (f3 == null) {
                    z2.h.d(V2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    g0((d0) V2);
                } else {
                    J j3 = m0.f4415h;
                    if (z3 && (V2 instanceof g0)) {
                        synchronized (V2) {
                            try {
                                th = ((g0) V2).c();
                                if (th != null) {
                                    if ((cVar instanceof C0315l) && !((g0) V2).e()) {
                                    }
                                }
                                if (F((V) V2, f3, d0Var)) {
                                    if (th == null) {
                                        return d0Var;
                                    }
                                    j3 = d0Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z4) {
                            cVar.l(th);
                        }
                        return j3;
                    }
                    if (F((V) V2, f3, d0Var)) {
                        return d0Var;
                    }
                }
            }
        }
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1076g s(InterfaceC1077h interfaceC1077h) {
        return AbstractC0948C.h(this, interfaceC1077h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b0() + '{' + i0(V()) + '}');
        sb.append('@');
        sb.append(B.j(this));
        return sb.toString();
    }

    @Override // q2.InterfaceC1078i
    public final Object y(Object obj, y2.e eVar) {
        return eVar.j(obj, this);
    }
}
