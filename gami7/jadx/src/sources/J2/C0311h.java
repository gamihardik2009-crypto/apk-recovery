package J2;

import O2.AbstractC0369a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.AbstractC0868j;
import m2.C0880v;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;
import s2.InterfaceC1199d;

/* renamed from: J2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0311h extends G implements InterfaceC0310g, InterfaceC1199d, w0 {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4399m = AtomicIntegerFieldUpdater.newUpdater(C0311h.class, "_decisionAndIndex");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4400n = AtomicReferenceFieldUpdater.newUpdater(C0311h.class, Object.class, "_state");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4401o = AtomicReferenceFieldUpdater.newUpdater(C0311h.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1073d f4402k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1078i f4403l;

    public C0311h(int i2, InterfaceC1073d interfaceC1073d) {
        super(i2);
        this.f4402k = interfaceC1073d;
        this.f4403l = interfaceC1073d.n();
        this._decisionAndIndex = 536870911;
        this._state = C0305b.f4383h;
    }

    public static Object F(n0 n0Var, Object obj, int i2, y2.c cVar) {
        if ((obj instanceof C0319p) || !B.q(i2)) {
            return obj;
        }
        if (cVar != null || (n0Var instanceof AbstractC0309f)) {
            return new C0318o(obj, n0Var instanceof AbstractC0309f ? (AbstractC0309f) n0Var : null, cVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        InterfaceC1073d interfaceC1073d = this.f4402k;
        Throwable th = null;
        O2.h hVar = interfaceC1073d instanceof O2.h ? (O2.h) interfaceC1073d : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = O2.h.f5178o;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                O2.v vVar = AbstractC0369a.f5168d;
                if (obj == vVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m();
            H(th);
        }
    }

    public final void B(Object obj, y2.c cVar) {
        C(this.f4355j, obj, cVar);
    }

    public final void C(int i2, Object obj, y2.c cVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4400n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof n0) {
                Object F = F((n0) obj2, obj, i2, cVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    m();
                }
                o(i2);
                return;
            }
            if (obj2 instanceof C0312i) {
                C0312i c0312i = (C0312i) obj2;
                c0312i.getClass();
                if (C0312i.f4408c.compareAndSet(c0312i, 0, 1)) {
                    if (cVar != null) {
                        j(cVar, c0312i.f4422a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // J2.InterfaceC0310g
    public final void D(AbstractC0324v abstractC0324v) {
        C0880v c0880v = C0880v.f8657a;
        InterfaceC1073d interfaceC1073d = this.f4402k;
        O2.h hVar = interfaceC1073d instanceof O2.h ? (O2.h) interfaceC1073d : null;
        C((hVar != null ? hVar.f5179k : null) == abstractC0324v ? 4 : this.f4355j, c0880v, null);
    }

    @Override // J2.InterfaceC0310g
    public final void E(Object obj) {
        o(this.f4355j);
    }

    @Override // J2.InterfaceC0310g
    public final boolean H(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4400n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof n0)) {
                return false;
            }
            C0312i c0312i = new C0312i(this, th, (obj instanceof AbstractC0309f) || (obj instanceof O2.t));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0312i)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            n0 n0Var = (n0) obj;
            if (n0Var instanceof AbstractC0309f) {
                i((AbstractC0309f) obj, th);
            } else if (n0Var instanceof O2.t) {
                l((O2.t) obj, th);
            }
            if (!w()) {
                m();
            }
            o(this.f4355j);
            return true;
        }
    }

    @Override // J2.w0
    public final void a(O2.t tVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f4399m;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        v(tVar);
    }

    @Override // J2.InterfaceC0310g
    public final boolean b() {
        return f4400n.get(this) instanceof n0;
    }

    @Override // J2.G
    public final void c(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4400n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof n0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C0319p) {
                return;
            }
            if (!(obj2 instanceof C0318o)) {
                C0318o c0318o = new C0318o(obj2, (AbstractC0309f) null, (y2.c) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0318o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0318o c0318o2 = (C0318o) obj2;
            if (!(!(c0318o2.f4420e != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            C0318o a3 = C0318o.a(c0318o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            AbstractC0309f abstractC0309f = c0318o2.f4417b;
            if (abstractC0309f != null) {
                i(abstractC0309f, cancellationException);
            }
            y2.c cVar = c0318o2.f4418c;
            if (cVar != null) {
                j(cVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // J2.G
    public final InterfaceC1073d d() {
        return this.f4402k;
    }

    @Override // J2.G
    public final Throwable e(Object obj) {
        Throwable e3 = super.e(obj);
        if (e3 != null) {
            return e3;
        }
        return null;
    }

    @Override // J2.G
    public final Object f(Object obj) {
        return obj instanceof C0318o ? ((C0318o) obj).f4416a : obj;
    }

    @Override // J2.G
    public final Object h() {
        return f4400n.get(this);
    }

    public final void i(AbstractC0309f abstractC0309f, Throwable th) {
        try {
            abstractC0309f.b(th);
        } catch (Throwable th2) {
            B.m(new r("Exception in invokeOnCancellation handler for " + this, th2), this.f4403l);
        }
    }

    public final void j(y2.c cVar, Throwable th) {
        try {
            cVar.l(th);
        } catch (Throwable th2) {
            B.m(new r("Exception in resume onCancellation handler for " + this, th2), this.f4403l);
        }
    }

    @Override // s2.InterfaceC1199d
    public final InterfaceC1199d k() {
        InterfaceC1073d interfaceC1073d = this.f4402k;
        if (interfaceC1073d instanceof InterfaceC1199d) {
            return (InterfaceC1199d) interfaceC1073d;
        }
        return null;
    }

    public final void l(O2.t tVar, Throwable th) {
        InterfaceC1078i interfaceC1078i = this.f4403l;
        int i2 = f4399m.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            tVar.g(i2, interfaceC1078i);
        } catch (Throwable th2) {
            B.m(new r("Exception in invokeOnCancellation handler for " + this, th2), interfaceC1078i);
        }
    }

    public final void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4401o;
        J j3 = (J) atomicReferenceFieldUpdater.get(this);
        if (j3 == null) {
            return;
        }
        j3.a();
        atomicReferenceFieldUpdater.set(this, m0.f4415h);
    }

    @Override // q2.InterfaceC1073d
    public final InterfaceC1078i n() {
        return this.f4403l;
    }

    public final void o(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f4399m;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z3 = i2 == 4;
                InterfaceC1073d interfaceC1073d = this.f4402k;
                if (z3 || !(interfaceC1073d instanceof O2.h) || B.q(i2) != B.q(this.f4355j)) {
                    B.t(this, interfaceC1073d, z3);
                    return;
                }
                AbstractC0324v abstractC0324v = ((O2.h) interfaceC1073d).f5179k;
                InterfaceC1078i n3 = ((O2.h) interfaceC1073d).f5180l.n();
                if (abstractC0324v.w()) {
                    abstractC0324v.r(n3, this);
                    return;
                }
                Q a3 = r0.a();
                if (a3.E()) {
                    a3.z(this);
                    return;
                }
                a3.D(true);
                try {
                    B.t(this, interfaceC1073d, true);
                    do {
                    } while (a3.G());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable p(i0 i0Var) {
        return i0Var.i();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean w2 = w();
        do {
            atomicIntegerFieldUpdater = f4399m;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (w2) {
                    A();
                }
                Object obj = f4400n.get(this);
                if (obj instanceof C0319p) {
                    throw ((C0319p) obj).f4422a;
                }
                if (B.q(this.f4355j)) {
                    Z z3 = (Z) this.f4403l.s(C0325w.f4437i);
                    if (z3 != null && !z3.b()) {
                        CancellationException i4 = z3.i();
                        c(obj, i4);
                        throw i4;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((J) f4401o.get(this)) == null) {
            s();
        }
        if (w2) {
            A();
        }
        return EnumC1145a.f10026h;
    }

    public final void r() {
        J s3 = s();
        if (s3 != null && (!(f4400n.get(this) instanceof n0))) {
            s3.a();
            f4401o.set(this, m0.f4415h);
        }
    }

    public final J s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Z z3 = (Z) this.f4403l.s(C0325w.f4437i);
        if (z3 == null) {
            return null;
        }
        J n3 = B.n(z3, true, new C0313j(this), 2);
        do {
            atomicReferenceFieldUpdater = f4401o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n3)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n3;
    }

    @Override // q2.InterfaceC1073d
    public final void t(Object obj) {
        Throwable a3 = AbstractC0868j.a(obj);
        if (a3 != null) {
            obj = new C0319p(a3, false);
        }
        C(this.f4355j, obj, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(B.v(this.f4402k));
        sb.append("){");
        Object obj = f4400n.get(this);
        sb.append(obj instanceof n0 ? "Active" : obj instanceof C0312i ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(B.j(this));
        return sb.toString();
    }

    public final void u(y2.c cVar) {
        v(cVar instanceof AbstractC0309f ? (AbstractC0309f) cVar : new C0308e(2, cVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ba, code lost:
    
        x(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bd, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = J2.C0311h.f4400n
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof J2.C0305b
            if (r1 == 0) goto L18
        La:
            boolean r1 = r0.compareAndSet(r9, r7, r10)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La
            goto L0
        L18:
            boolean r1 = r7 instanceof J2.AbstractC0309f
            r2 = 0
            if (r1 != 0) goto Lba
            boolean r1 = r7 instanceof O2.t
            if (r1 != 0) goto Lba
            boolean r1 = r7 instanceof J2.C0319p
            if (r1 == 0) goto L5c
            r0 = r7
            J2.p r0 = (J2.C0319p) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = J2.C0319p.f4421b
            r4 = 0
            boolean r1 = r3.compareAndSet(r0, r4, r1)
            if (r1 == 0) goto L58
            boolean r1 = r7 instanceof J2.C0312i
            if (r1 == 0) goto L57
            boolean r1 = r7 instanceof J2.C0319p
            if (r1 == 0) goto L3e
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L43
            java.lang.Throwable r2 = r0.f4422a
        L43:
            boolean r0 = r10 instanceof J2.AbstractC0309f
            if (r0 == 0) goto L4d
            J2.f r10 = (J2.AbstractC0309f) r10
            r9.i(r10, r2)
            goto L57
        L4d:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            z2.h.d(r10, r0)
            O2.t r10 = (O2.t) r10
            r9.l(r10, r2)
        L57:
            return
        L58:
            x(r10, r7)
            throw r2
        L5c:
            boolean r1 = r7 instanceof J2.C0318o
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L95
            r1 = r7
            J2.o r1 = (J2.C0318o) r1
            J2.f r4 = r1.f4417b
            if (r4 != 0) goto L91
            boolean r4 = r10 instanceof O2.t
            if (r4 == 0) goto L6e
            return
        L6e:
            z2.h.d(r10, r3)
            r3 = r10
            J2.f r3 = (J2.AbstractC0309f) r3
            java.lang.Throwable r4 = r1.f4420e
            if (r4 == 0) goto L7c
            r9.i(r3, r4)
            return
        L7c:
            r4 = 29
            J2.o r1 = J2.C0318o.a(r1, r3, r2, r4)
        L82:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L89
            return
        L89:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L82
            goto L0
        L91:
            x(r10, r7)
            throw r2
        L95:
            boolean r1 = r10 instanceof O2.t
            if (r1 == 0) goto L9a
            return
        L9a:
            z2.h.d(r10, r3)
            r3 = r10
            J2.f r3 = (J2.AbstractC0309f) r3
            J2.o r8 = new J2.o
            r4 = 0
            r5 = 0
            r6 = 28
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        Lab:
            boolean r1 = r0.compareAndSet(r9, r7, r8)
            if (r1 == 0) goto Lb2
            return
        Lb2:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto Lab
            goto L0
        Lba:
            x(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.C0311h.v(java.lang.Object):void");
    }

    public final boolean w() {
        if (this.f4355j == 2) {
            InterfaceC1073d interfaceC1073d = this.f4402k;
            z2.h.d(interfaceC1073d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (O2.h.f5178o.get((O2.h) interfaceC1073d) != null) {
                return true;
            }
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    @Override // J2.InterfaceC0310g
    public final O2.v z(Object obj, y2.c cVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4400n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj2 instanceof n0;
            O2.v vVar = B.f4342a;
            if (!z3) {
                boolean z4 = obj2 instanceof C0318o;
                return null;
            }
            Object F = F((n0) obj2, obj, this.f4355j, cVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (w()) {
                return vVar;
            }
            m();
            return vVar;
        }
    }
}
