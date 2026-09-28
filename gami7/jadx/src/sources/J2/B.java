package J2;

import O2.AbstractC0369a;
import a.AbstractC0423a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m2.AbstractC0868j;
import m2.C0880v;
import n2.AbstractC0948C;
import q2.C1074e;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1075f;
import q2.InterfaceC1076g;
import q2.InterfaceC1077h;
import q2.InterfaceC1078i;
import r2.EnumC1145a;
import s2.InterfaceC1199d;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: b, reason: collision with root package name */
    public static final O2.v f4343b;

    /* renamed from: c, reason: collision with root package name */
    public static final O2.v f4344c;

    /* renamed from: d, reason: collision with root package name */
    public static final O2.v f4345d;

    /* renamed from: e, reason: collision with root package name */
    public static final O2.v f4346e;

    /* renamed from: f, reason: collision with root package name */
    public static final O2.v f4347f;

    /* renamed from: g, reason: collision with root package name */
    public static final O2.v f4348g;

    /* renamed from: h, reason: collision with root package name */
    public static final O2.v f4349h;

    /* renamed from: a, reason: collision with root package name */
    public static final O2.v f4342a = new O2.v("RESUME_TOKEN", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final K f4350i = new K(false);

    /* renamed from: j, reason: collision with root package name */
    public static final K f4351j = new K(true);

    static {
        int i2 = 0;
        f4343b = new O2.v("REMOVED_TASK", i2);
        f4344c = new O2.v("CLOSED_EMPTY", i2);
        int i3 = 0;
        f4345d = new O2.v("COMPLETING_ALREADY", i3);
        f4346e = new O2.v("COMPLETING_WAITING_CHILDREN", i3);
        f4347f = new O2.v("COMPLETING_RETRY", i3);
        f4348g = new O2.v("TOO_LATE_TO_CANCEL", i3);
        f4349h = new O2.v("SEALED", i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(s2.AbstractC1198c r8) {
        /*
            q2.i r0 = r8.n()
            g(r0)
            q2.d r8 = n2.AbstractC0948C.i(r8)
            boolean r1 = r8 instanceof O2.h
            r2 = 0
            if (r1 == 0) goto L13
            O2.h r8 = (O2.h) r8
            goto L14
        L13:
            r8 = r2
        L14:
            m2.v r1 = m2.C0880v.f8657a
            r2.a r3 = r2.EnumC1145a.f10026h
            if (r8 != 0) goto L1c
        L1a:
            r8 = r1
            goto L7b
        L1c:
            J2.v r4 = r8.f5179k
            boolean r5 = r4.w()
            r6 = 1
            if (r5 == 0) goto L2d
            r8.f5181m = r1
            r8.f4355j = r6
            r4.v(r0, r8)
            goto L5f
        L2d:
            J2.x0 r5 = new J2.x0
            J2.w r7 = J2.x0.f4438j
            r5.<init>(r7)
            q2.i r0 = r0.A(r5)
            r8.f5181m = r1
            r8.f4355j = r6
            r4.v(r0, r8)
            boolean r0 = r5.f4439i
            if (r0 == 0) goto L5f
            J2.Q r0 = J2.r0.a()
            n2.j r4 = r0.f4372l
            if (r4 == 0) goto L1a
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L52
            goto L1a
        L52:
            boolean r4 = r0.E()
            if (r4 == 0) goto L61
            r8.f5181m = r1
            r8.f4355j = r6
            r0.z(r8)
        L5f:
            r8 = r3
            goto L7b
        L61:
            r0.D(r6)
            r8.run()     // Catch: java.lang.Throwable -> L71
        L67:
            boolean r4 = r0.G()     // Catch: java.lang.Throwable -> L71
            if (r4 != 0) goto L67
        L6d:
            r0.x(r6)
            goto L1a
        L71:
            r4 = move-exception
            r8.g(r4, r2)     // Catch: java.lang.Throwable -> L76
            goto L6d
        L76:
            r8 = move-exception
            r0.x(r6)
            throw r8
        L7b:
            if (r8 != r3) goto L7e
            return r8
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.B.A(s2.c):java.lang.Object");
    }

    public static final O2.e a(InterfaceC1078i interfaceC1078i) {
        if (interfaceC1078i.s(C0325w.f4437i) == null) {
            interfaceC1078i = interfaceC1078i.A(b());
        }
        return new O2.e(interfaceC1078i);
    }

    public static c0 b() {
        return new c0(null);
    }

    public static final void c(InterfaceC0328z interfaceC0328z, CancellationException cancellationException) {
        Z z3 = (Z) interfaceC0328z.r().s(C0325w.f4437i);
        if (z3 != null) {
            z3.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0328z).toString());
        }
    }

    public static final Object d(Z z3, InterfaceC1073d interfaceC1073d) {
        z3.a(null);
        Object l3 = z3.l(interfaceC1073d);
        return l3 == EnumC1145a.f10026h ? l3 : C0880v.f8657a;
    }

    public static final Object e(y2.e eVar, InterfaceC1073d interfaceC1073d) {
        O2.s sVar = new O2.s(interfaceC1073d, interfaceC1073d.n());
        return AbstractC0423a.b0(sVar, sVar, eVar);
    }

    public static final Object f(long j3, InterfaceC1073d interfaceC1073d) {
        C0880v c0880v = C0880v.f8657a;
        if (j3 <= 0) {
            return c0880v;
        }
        C0311h c0311h = new C0311h(1, AbstractC0948C.i(interfaceC1073d));
        c0311h.r();
        if (j3 < Long.MAX_VALUE) {
            i(c0311h.f4403l).c(j3, c0311h);
        }
        Object q = c0311h.q();
        return q == EnumC1145a.f10026h ? q : c0880v;
    }

    public static final void g(InterfaceC1078i interfaceC1078i) {
        Z z3 = (Z) interfaceC1078i.s(C0325w.f4437i);
        if (z3 != null && !z3.b()) {
            throw z3.i();
        }
    }

    public static final InterfaceC1078i h(InterfaceC1078i interfaceC1078i, InterfaceC1078i interfaceC1078i2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        C0321s c0321s = C0321s.f4427k;
        boolean booleanValue = ((Boolean) interfaceC1078i.y(bool, c0321s)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC1078i2.y(bool, c0321s)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC1078i.A(interfaceC1078i2);
        }
        C1079j c1079j = C1079j.f9784h;
        InterfaceC1078i interfaceC1078i3 = (InterfaceC1078i) interfaceC1078i.y(c1079j, new C0321s(2, 2));
        Object obj = interfaceC1078i2;
        if (booleanValue2) {
            obj = interfaceC1078i2.y(c1079j, C0321s.f4426j);
        }
        return interfaceC1078i3.A((InterfaceC1078i) obj);
    }

    public static final E i(InterfaceC1078i interfaceC1078i) {
        InterfaceC1076g s3 = interfaceC1078i.s(C1074e.f9782h);
        E e3 = s3 instanceof E ? (E) s3 : null;
        return e3 == null ? D.f4353a : e3;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final Z k(InterfaceC1078i interfaceC1078i) {
        Z z3 = (Z) interfaceC1078i.s(C0325w.f4437i);
        if (z3 != null) {
            return z3;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC1078i).toString());
    }

    public static final C0311h l(InterfaceC1073d interfaceC1073d) {
        C0311h c0311h;
        C0311h c0311h2;
        if (!(interfaceC1073d instanceof O2.h)) {
            return new C0311h(1, interfaceC1073d);
        }
        O2.h hVar = (O2.h) interfaceC1073d;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = O2.h.f5178o;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            O2.v vVar = AbstractC0369a.f5168d;
            c0311h = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, vVar);
                c0311h2 = null;
                break;
            }
            if (obj instanceof C0311h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0311h2 = (C0311h) obj;
                break loop0;
            }
            if (obj != vVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0311h2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0311h.f4400n;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0311h2);
            if (!(obj2 instanceof C0318o) || ((C0318o) obj2).f4419d == null) {
                C0311h.f4399m.set(c0311h2, 536870911);
                atomicReferenceFieldUpdater2.set(c0311h2, C0305b.f4383h);
                c0311h = c0311h2;
            } else {
                c0311h2.m();
            }
            if (c0311h != null) {
                return c0311h;
            }
        }
        return new C0311h(2, interfaceC1073d);
    }

    public static final void m(Throwable th, InterfaceC1078i interfaceC1078i) {
        try {
            InterfaceC0326x interfaceC0326x = (InterfaceC0326x) interfaceC1078i.s(C0325w.f4436h);
            if (interfaceC0326x != null) {
                interfaceC0326x.f(th, interfaceC1078i);
            } else {
                AbstractC0369a.d(th, interfaceC1078i);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                B1.C.p(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0369a.d(th, interfaceC1078i);
        }
    }

    public static /* synthetic */ J n(Z z3, boolean z4, d0 d0Var, int i2) {
        if ((i2 & 1) != 0) {
            z4 = false;
        }
        return z3.o(z4, (i2 & 2) != 0, d0Var);
    }

    public static final boolean o(InterfaceC0328z interfaceC0328z) {
        Z z3 = (Z) interfaceC0328z.r().s(C0325w.f4437i);
        if (z3 != null) {
            return z3.b();
        }
        return true;
    }

    public static final boolean p(InterfaceC1078i interfaceC1078i) {
        Z z3 = (Z) interfaceC1078i.s(C0325w.f4437i);
        if (z3 != null) {
            return z3.b();
        }
        return true;
    }

    public static final boolean q(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static p0 r(InterfaceC0328z interfaceC0328z, InterfaceC1076g interfaceC1076g, int i2, y2.e eVar, int i3) {
        InterfaceC1078i interfaceC1078i = interfaceC1076g;
        if ((i3 & 1) != 0) {
            interfaceC1078i = C1079j.f9784h;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        InterfaceC1078i h2 = h(interfaceC0328z.r(), interfaceC1078i, true);
        Q2.d dVar = H.f4356a;
        if (h2 != dVar && h2.s(C1074e.f9782h) == null) {
            h2 = h2.A(dVar);
        }
        if (i2 == 0) {
            throw null;
        }
        p0 j0Var = i2 == 2 ? new j0(h2, eVar) : new p0(h2, true);
        j0Var.m0(i2, j0Var, eVar);
        return j0Var;
    }

    public static final Object s(Object obj) {
        return obj instanceof C0319p ? C1.y.n(((C0319p) obj).f4422a) : obj;
    }

    public static final void t(G g3, InterfaceC1073d interfaceC1073d, boolean z3) {
        Object h2 = g3.h();
        Throwable e3 = g3.e(h2);
        Object n3 = e3 != null ? C1.y.n(e3) : g3.f(h2);
        if (!z3) {
            interfaceC1073d.t(n3);
            return;
        }
        z2.h.d(interfaceC1073d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        O2.h hVar = (O2.h) interfaceC1073d;
        InterfaceC1073d interfaceC1073d2 = hVar.f5180l;
        InterfaceC1078i n4 = interfaceC1073d2.n();
        Object l3 = AbstractC0369a.l(n4, hVar.f5182n);
        u0 y3 = l3 != AbstractC0369a.f5170f ? y(interfaceC1073d2, n4, l3) : null;
        try {
            interfaceC1073d2.t(n3);
        } finally {
            if (y3 == null || y3.n0()) {
                AbstractC0369a.g(n4, l3);
            }
        }
    }

    public static final Object u(InterfaceC1078i interfaceC1078i, y2.e eVar) {
        Q q;
        InterfaceC1078i h2;
        Thread currentThread = Thread.currentThread();
        InterfaceC1077h interfaceC1077h = C1074e.f9782h;
        InterfaceC1075f interfaceC1075f = (InterfaceC1075f) interfaceC1078i.s(interfaceC1077h);
        C1079j c1079j = C1079j.f9784h;
        if (interfaceC1075f == null) {
            q = r0.a();
            h2 = h(c1079j, interfaceC1078i.A(q), true);
            Q2.d dVar = H.f4356a;
            if (h2 != dVar && h2.s(interfaceC1077h) == null) {
                h2 = h2.A(dVar);
            }
        } else {
            if (interfaceC1075f instanceof Q) {
            }
            q = (Q) r0.f4425a.get();
            h2 = h(c1079j, interfaceC1078i, true);
            Q2.d dVar2 = H.f4356a;
            if (h2 != dVar2 && h2.s(interfaceC1077h) == null) {
                h2 = h2.A(dVar2);
            }
        }
        C0306c c0306c = new C0306c(h2, currentThread, q);
        c0306c.m0(1, c0306c, eVar);
        Q q3 = c0306c.f4385l;
        if (q3 != null) {
            int i2 = Q.f4369m;
            q3.D(false);
        }
        while (!Thread.interrupted()) {
            try {
                long F = q3 != null ? q3.F() : Long.MAX_VALUE;
                if (!(c0306c.V() instanceof V)) {
                    if (q3 != null) {
                        int i3 = Q.f4369m;
                        q3.x(false);
                    }
                    Object x2 = x(c0306c.V());
                    C0319p c0319p = x2 instanceof C0319p ? (C0319p) x2 : null;
                    if (c0319p == null) {
                        return x2;
                    }
                    throw c0319p.f4422a;
                }
                LockSupport.parkNanos(c0306c, F);
            } catch (Throwable th) {
                if (q3 != null) {
                    int i4 = Q.f4369m;
                    q3.x(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0306c.J(interruptedException);
        throw interruptedException;
    }

    public static final String v(InterfaceC1073d interfaceC1073d) {
        Object n3;
        if (interfaceC1073d instanceof O2.h) {
            return interfaceC1073d.toString();
        }
        try {
            n3 = interfaceC1073d + '@' + j(interfaceC1073d);
        } catch (Throwable th) {
            n3 = C1.y.n(th);
        }
        if (AbstractC0868j.a(n3) != null) {
            n3 = interfaceC1073d.getClass().getName() + '@' + j(interfaceC1073d);
        }
        return (String) n3;
    }

    public static final long w(long j3) {
        long convert;
        int i2;
        int i3 = I2.a.f3959j;
        if (j3 >= 0 && (i2 = ((int) j3) & 1) != 0) {
            int i4 = i2 - (((int) 0) & 1);
            if (j3 < 0) {
                i4 = -i4;
            }
            if (i4 <= 0) {
                return 0L;
            }
        } else if (j3 < 0 || j3 == 0) {
            return 0L;
        }
        int i5 = ((int) j3) & 1;
        if (i5 == 1) {
            if (!(j3 == I2.a.f3957h || j3 == I2.a.f3958i)) {
                convert = j3 >> 1;
                return B1.C.y(convert, 1L);
            }
        }
        I2.c cVar = I2.c.MILLISECONDS;
        z2.h.f(cVar, "unit");
        if (j3 == I2.a.f3957h) {
            convert = Long.MAX_VALUE;
        } else if (j3 == I2.a.f3958i) {
            convert = Long.MIN_VALUE;
        } else {
            long j4 = j3 >> 1;
            I2.c cVar2 = i5 == 0 ? I2.c.NANOSECONDS : cVar;
            z2.h.f(cVar2, "sourceUnit");
            convert = cVar.f3965h.convert(j4, cVar2.f3965h);
        }
        return B1.C.y(convert, 1L);
    }

    public static final Object x(Object obj) {
        V v3;
        W w2 = obj instanceof W ? (W) obj : null;
        return (w2 == null || (v3 = w2.f4375a) == null) ? obj : v3;
    }

    public static final u0 y(InterfaceC1073d interfaceC1073d, InterfaceC1078i interfaceC1078i, Object obj) {
        u0 u0Var = null;
        if (!(interfaceC1073d instanceof InterfaceC1199d)) {
            return null;
        }
        if (interfaceC1078i.s(v0.f4435h) != null) {
            InterfaceC1199d interfaceC1199d = (InterfaceC1199d) interfaceC1073d;
            while (true) {
                if ((interfaceC1199d instanceof F) || (interfaceC1199d = interfaceC1199d.k()) == null) {
                    break;
                }
                if (interfaceC1199d instanceof u0) {
                    u0Var = (u0) interfaceC1199d;
                    break;
                }
            }
            if (u0Var != null) {
                u0Var.o0(interfaceC1078i, obj);
            }
        }
        return u0Var;
    }

    public static final Object z(InterfaceC1078i interfaceC1078i, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        InterfaceC1078i n3 = interfaceC1073d.n();
        InterfaceC1078i A3 = !((Boolean) interfaceC1078i.y(Boolean.FALSE, C0321s.f4427k)).booleanValue() ? n3.A(interfaceC1078i) : h(n3, interfaceC1078i, false);
        g(A3);
        if (A3 == n3) {
            O2.s sVar = new O2.s(interfaceC1073d, A3);
            return AbstractC0423a.b0(sVar, sVar, eVar);
        }
        C1074e c1074e = C1074e.f9782h;
        if (z2.h.a(A3.s(c1074e), n3.s(c1074e))) {
            u0 u0Var = new u0(interfaceC1073d, A3);
            InterfaceC1078i interfaceC1078i2 = u0Var.f4381j;
            Object l3 = AbstractC0369a.l(interfaceC1078i2, null);
            try {
                return AbstractC0423a.b0(u0Var, u0Var, eVar);
            } finally {
                AbstractC0369a.g(interfaceC1078i2, l3);
            }
        }
        F f3 = new F(interfaceC1073d, A3);
        K1.f.P(eVar, f3, f3);
        do {
            atomicIntegerFieldUpdater = F.f4354l;
            int i2 = atomicIntegerFieldUpdater.get(f3);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                Object x2 = x(f3.V());
                if (x2 instanceof C0319p) {
                    throw ((C0319p) x2).f4422a;
                }
                return x2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(f3, 0, 1));
        return EnumC1145a.f10026h;
    }
}
