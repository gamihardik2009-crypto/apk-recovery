package L2;

import B1.C;
import D.e0;
import J2.B;
import J2.C0311h;
import J2.InterfaceC0310g;
import J2.w0;
import O2.AbstractC0369a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.C0880v;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public class g implements k {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4704k = AtomicLongFieldUpdater.newUpdater(g.class, "sendersAndCloseStatus");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4705l = AtomicLongFieldUpdater.newUpdater(g.class, "receivers");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4706m = AtomicLongFieldUpdater.newUpdater(g.class, "bufferEnd");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4707n = AtomicLongFieldUpdater.newUpdater(g.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4708o = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "sendSegment");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4709p = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "receiveSegment");
    public static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "bufferEndSegment");

    /* renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4710r = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_closeCause");

    /* renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4711s = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: h, reason: collision with root package name */
    public final int f4712h;

    /* renamed from: i, reason: collision with root package name */
    public final y2.c f4713i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f4714j;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public g(int i2, y2.c cVar) {
        this.f4712h = i2;
        this.f4713i = cVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        o oVar = i.f4716a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f4706m.get(this);
        o oVar2 = new o(0L, null, this, 3);
        this.sendSegment = oVar2;
        this.receiveSegment = oVar2;
        if (A()) {
            oVar2 = i.f4716a;
            z2.h.d(oVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = oVar2;
        this.f4714j = cVar != null ? new e0(4, this) : null;
        this._closeCause = i.f4733s;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object E(L2.g r13, q2.InterfaceC1073d r14) {
        /*
            boolean r0 = r14 instanceof L2.e
            if (r0 == 0) goto L14
            r0 = r14
            L2.e r0 = (L2.e) r0
            int r1 = r0.f4700m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f4700m = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            L2.e r0 = new L2.e
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f4698k
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r6.f4700m
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            C1.y.J(r14)
            L2.n r14 = (L2.n) r14
            java.lang.Object r13 = r14.f4739a
            goto L9a
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            C1.y.J(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = L2.g.f4709p
            java.lang.Object r14 = r14.get(r13)
            L2.o r14 = (L2.o) r14
        L41:
            boolean r1 = r13.y()
            if (r1 == 0) goto L51
            java.lang.Throwable r13 = r13.n()
            L2.l r14 = new L2.l
            r14.<init>(r13)
            goto La0
        L51:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = L2.g.f4705l
            long r4 = r1.getAndIncrement(r13)
            int r1 = L2.i.f4717b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f5206j
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L6e
            L2.o r1 = r13.l(r7, r14)
            if (r1 != 0) goto L6d
            goto L41
        L6d:
            r14 = r1
        L6e:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.J(r8, r9, r10, r12)
            O2.v r7 = L2.i.f4728m
            if (r1 == r7) goto La1
            O2.v r7 = L2.i.f4730o
            if (r1 != r7) goto L8b
            long r7 = r13.s()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L41
            r14.a()
            goto L41
        L8b:
            O2.v r7 = L2.i.f4729n
            if (r1 != r7) goto L9c
            r6.f4700m = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.F(r2, r3, r4, r6)
            if (r13 != r0) goto L9a
            return r0
        L9a:
            r14 = r13
            goto La0
        L9c:
            r14.a()
            r14 = r1
        La0:
            return r14
        La1:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.g.E(L2.g, q2.d):java.lang.Object");
    }

    public static final o b(g gVar, long j3, o oVar) {
        Object b3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        gVar.getClass();
        o oVar2 = i.f4716a;
        h hVar = h.f4715p;
        loop0: while (true) {
            b3 = AbstractC0369a.b(oVar, j3, hVar);
            if (!AbstractC0369a.e(b3)) {
                O2.t c3 = AbstractC0369a.c(b3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4708o;
                    O2.t tVar = (O2.t) atomicReferenceFieldUpdater.get(gVar);
                    if (tVar.f5206j >= c3.f5206j) {
                        break loop0;
                    }
                    if (!c3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, tVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != tVar) {
                            if (c3.e()) {
                                c3.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e3 = AbstractC0369a.e(b3);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4705l;
        if (e3) {
            gVar.w();
            if (oVar.f5206j * i.f4717b >= atomicLongFieldUpdater2.get(gVar)) {
                return null;
            }
            oVar.a();
            return null;
        }
        o oVar3 = (o) AbstractC0369a.c(b3);
        long j6 = oVar3.f5206j;
        if (j6 <= j3) {
            return oVar3;
        }
        long j7 = i.f4717b * j6;
        do {
            atomicLongFieldUpdater = f4704k;
            j4 = atomicLongFieldUpdater.get(gVar);
            j5 = 1152921504606846975L & j4;
            if (j5 >= j7) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(gVar, j4, j5 + (((int) (j4 >> 60)) << 60)));
        if (j6 * i.f4717b >= atomicLongFieldUpdater2.get(gVar)) {
            return null;
        }
        oVar3.a();
        return null;
    }

    public static final void d(g gVar, Object obj, C0311h c0311h) {
        J2.r a3;
        y2.c cVar = gVar.f4713i;
        if (cVar != null && (a3 = AbstractC0369a.a(cVar, obj, null)) != null) {
            B.m(a3, c0311h.f4403l);
        }
        c0311h.t(C1.y.n(gVar.r()));
    }

    public static final int f(g gVar, o oVar, int i2, Object obj, long j3, Object obj2, boolean z3) {
        gVar.getClass();
        oVar.m(i2, obj);
        if (z3) {
            return gVar.K(oVar, i2, obj, j3, obj2, z3);
        }
        Object k3 = oVar.k(i2);
        if (k3 == null) {
            if (gVar.g(j3)) {
                if (oVar.j(null, i2, i.f4719d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (oVar.j(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof w0) {
            oVar.m(i2, null);
            if (gVar.H(k3, obj)) {
                oVar.n(i2, i.f4724i);
                return 0;
            }
            O2.v vVar = i.f4726k;
            if (oVar.f4741m.getAndSet((i2 * 2) + 1, vVar) != vVar) {
                oVar.l(i2, true);
            }
            return 5;
        }
        return gVar.K(oVar, i2, obj, j3, obj2, z3);
    }

    public static void t(g gVar) {
        gVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4707n;
        if ((atomicLongFieldUpdater.addAndGet(gVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(gVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        long j3 = f4706m.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    @Override // L2.w
    public final K1.i B() {
        b bVar = b.f4692p;
        z2.v.d(3, bVar);
        c cVar = c.f4693p;
        z2.v.d(3, cVar);
        return new K1.i(this, bVar, cVar, this.f4714j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(long r5, L2.o r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f5206j
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            O2.d r0 = r7.b()
            L2.o r0 = (L2.o) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            O2.d r5 = r7.b()
            L2.o r5 = (L2.o) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = L2.g.q
            java.lang.Object r6 = r5.get(r4)
            O2.t r6 = (O2.t) r6
            long r0 = r6.f5206j
            long r2 = r7.f5206j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.g.C(long, L2.o):void");
    }

    public final Object D(Object obj, InterfaceC1073d interfaceC1073d) {
        J2.r a3;
        C0311h c0311h = new C0311h(1, AbstractC0948C.i(interfaceC1073d));
        c0311h.r();
        y2.c cVar = this.f4713i;
        if (cVar == null || (a3 = AbstractC0369a.a(cVar, obj, null)) == null) {
            c0311h.t(C1.y.n(r()));
        } else {
            C.p(a3, r());
            c0311h.t(C1.y.n(a3));
        }
        Object q3 = c0311h.q();
        return q3 == EnumC1145a.f10026h ? q3 : C0880v.f8657a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(L2.o r18, int r19, long r20, q2.InterfaceC1073d r22) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.g.F(L2.o, int, long, q2.d):java.lang.Object");
    }

    public final void G(w0 w0Var, boolean z3) {
        if (w0Var instanceof InterfaceC0310g) {
            ((InterfaceC1073d) w0Var).t(C1.y.n(z3 ? o() : r()));
            return;
        }
        if (w0Var instanceof v) {
            ((v) w0Var).f4747h.t(new n(new l(n())));
            return;
        }
        if (!(w0Var instanceof a)) {
            if (w0Var instanceof R2.f) {
                ((R2.e) ((R2.f) w0Var)).n(this, i.f4727l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + w0Var).toString());
            }
        }
        a aVar = (a) w0Var;
        C0311h c0311h = aVar.f4690i;
        z2.h.c(c0311h);
        aVar.f4690i = null;
        aVar.f4689h = i.f4727l;
        Throwable n3 = aVar.f4691j.n();
        if (n3 == null) {
            c0311h.t(Boolean.FALSE);
        } else {
            c0311h.t(C1.y.n(n3));
        }
    }

    public final boolean H(Object obj, Object obj2) {
        if (obj instanceof R2.f) {
            return ((R2.e) ((R2.f) obj)).n(this, obj2) == 0;
        }
        boolean z3 = obj instanceof v;
        y2.c cVar = this.f4713i;
        if (z3) {
            z2.h.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C0311h c0311h = ((v) obj).f4747h;
            return i.a(c0311h, new n(obj2), cVar != null ? new d(cVar, obj2, c0311h.f4403l, 1, false) : null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof InterfaceC0310g) {
                z2.h.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                InterfaceC0310g interfaceC0310g = (InterfaceC0310g) obj;
                return i.a(interfaceC0310g, obj2, cVar != null ? new d(cVar, obj2, interfaceC0310g.n(), 1, false) : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        z2.h.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0311h c0311h2 = aVar.f4690i;
        z2.h.c(c0311h2);
        aVar.f4690i = null;
        aVar.f4689h = obj2;
        Boolean bool = Boolean.TRUE;
        y2.c cVar2 = aVar.f4691j.f4713i;
        return i.a(c0311h2, bool, cVar2 != null ? new d(cVar2, obj2, c0311h2.f4403l, 1, false) : null);
    }

    public final boolean I(Object obj, o oVar, int i2) {
        char c3;
        boolean z3 = obj instanceof InterfaceC0310g;
        C0880v c0880v = C0880v.f8657a;
        if (z3) {
            z2.h.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return i.a((InterfaceC0310g) obj, c0880v, null);
        }
        if (!(obj instanceof R2.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        z2.h.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int n3 = ((R2.e) obj).n(this, c0880v);
        if (n3 == 0) {
            c3 = 1;
        } else if (n3 != 1) {
            c3 = 3;
            if (n3 != 2) {
                if (n3 != 3) {
                    throw new IllegalStateException(("Unexpected internal result: " + n3).toString());
                }
                c3 = 4;
            }
        } else {
            c3 = 2;
        }
        if (c3 == 2) {
            oVar.m(i2, null);
        }
        return c3 == 1;
    }

    public final Object J(o oVar, int i2, long j3, Object obj) {
        Object k3 = oVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = oVar.f4741m;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4704k;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return i.f4729n;
                }
                if (oVar.j(k3, i2, obj)) {
                    k();
                    return i.f4728m;
                }
            }
        } else if (k3 == i.f4719d && oVar.j(k3, i2, i.f4724i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            oVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k4 = oVar.k(i2);
            if (k4 == null || k4 == i.f4720e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (oVar.j(k4, i2, i.f4723h)) {
                        k();
                        return i.f4730o;
                    }
                } else {
                    if (obj == null) {
                        return i.f4729n;
                    }
                    if (oVar.j(k4, i2, obj)) {
                        k();
                        return i.f4728m;
                    }
                }
            } else {
                if (k4 != i.f4719d) {
                    O2.v vVar = i.f4725j;
                    if (k4 != vVar && k4 != i.f4723h) {
                        if (k4 == i.f4727l) {
                            k();
                            return i.f4730o;
                        }
                        if (k4 != i.f4722g && oVar.j(k4, i2, i.f4721f)) {
                            boolean z3 = k4 instanceof y;
                            if (z3) {
                                k4 = ((y) k4).f4748a;
                            }
                            if (I(k4, oVar, i2)) {
                                oVar.n(i2, i.f4724i);
                                k();
                                Object obj3 = atomicReferenceArray.get(i2 * 2);
                                oVar.m(i2, null);
                                return obj3;
                            }
                            oVar.n(i2, vVar);
                            oVar.l(i2, false);
                            if (z3) {
                                k();
                            }
                            return i.f4730o;
                        }
                    }
                    return i.f4730o;
                }
                if (oVar.j(k4, i2, i.f4724i)) {
                    k();
                    Object obj4 = atomicReferenceArray.get(i2 * 2);
                    oVar.m(i2, null);
                    return obj4;
                }
            }
        }
    }

    public final int K(o oVar, int i2, Object obj, long j3, Object obj2, boolean z3) {
        while (true) {
            Object k3 = oVar.k(i2);
            if (k3 == null) {
                if (!g(j3) || z3) {
                    if (z3) {
                        if (oVar.j(null, i2, i.f4725j)) {
                            oVar.l(i2, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (oVar.j(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (oVar.j(null, i2, i.f4719d)) {
                    return 1;
                }
            } else {
                if (k3 != i.f4720e) {
                    O2.v vVar = i.f4726k;
                    if (k3 == vVar) {
                        oVar.m(i2, null);
                        return 5;
                    }
                    if (k3 == i.f4723h) {
                        oVar.m(i2, null);
                        return 5;
                    }
                    if (k3 == i.f4727l) {
                        oVar.m(i2, null);
                        w();
                        return 4;
                    }
                    oVar.m(i2, null);
                    if (k3 instanceof y) {
                        k3 = ((y) k3).f4748a;
                    }
                    if (H(k3, obj)) {
                        oVar.n(i2, i.f4724i);
                        return 0;
                    }
                    if (oVar.f4741m.getAndSet((i2 * 2) + 1, vVar) != vVar) {
                        oVar.l(i2, true);
                    }
                    return 5;
                }
                if (oVar.j(k3, i2, i.f4719d)) {
                    return 1;
                }
            }
        }
    }

    public final void L(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        if (A()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f4706m;
        } while (atomicLongFieldUpdater.get(this) <= j3);
        int i2 = i.f4718c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4707n;
            if (i3 >= i2) {
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, 4611686018427387904L + (j4 & 4611686018427387903L)));
                while (true) {
                    long j6 = atomicLongFieldUpdater.get(this);
                    long j7 = atomicLongFieldUpdater2.get(this);
                    long j8 = j7 & 4611686018427387903L;
                    boolean z3 = (j7 & 4611686018427387904L) != 0;
                    if (j6 == j8 && j6 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z3) {
                        atomicLongFieldUpdater2.compareAndSet(this, j7, j8 + 4611686018427387904L);
                    }
                }
                do {
                    j5 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j5, j5 & 4611686018427387903L));
                return;
            }
            long j9 = atomicLongFieldUpdater.get(this);
            if (j9 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j9 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // L2.w
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [J2.h] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r22v0, types: [L2.g, java.lang.Object] */
    @Override // L2.w
    public final Object c(InterfaceC1073d interfaceC1073d) {
        o oVar;
        ?? r13;
        C0311h c0311h;
        d dVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4709p;
        o oVar2 = (o) atomicReferenceFieldUpdater.get(this);
        while (!y()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4705l;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = i.f4717b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (oVar2.f5206j != j4) {
                o l3 = l(j4, oVar2);
                if (l3 == null) {
                    continue;
                } else {
                    oVar = l3;
                }
            } else {
                oVar = oVar2;
            }
            Object J3 = J(oVar, i2, andIncrement, null);
            O2.v vVar = i.f4728m;
            if (J3 == vVar) {
                throw new IllegalStateException("unexpected".toString());
            }
            O2.v vVar2 = i.f4730o;
            if (J3 == vVar2) {
                if (andIncrement < s()) {
                    oVar.a();
                }
                oVar2 = oVar;
            } else {
                if (J3 != i.f4729n) {
                    oVar.a();
                    return J3;
                }
                C0311h l4 = B.l(AbstractC0948C.i(interfaceC1073d));
                try {
                    Object J4 = J(oVar, i2, andIncrement, l4);
                    try {
                        if (J4 == vVar) {
                            c0311h = l4;
                            c0311h.a(oVar, i2);
                        } else {
                            c0311h = l4;
                            y2.c cVar = this.f4713i;
                            InterfaceC1078i interfaceC1078i = c0311h.f4403l;
                            if (J4 == vVar2) {
                                if (andIncrement < s()) {
                                    oVar.a();
                                }
                                o oVar3 = (o) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (y()) {
                                        c0311h.t(C1.y.n(o()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j5 = i.f4717b;
                                    long j6 = andIncrement2 / j5;
                                    int i3 = (int) (andIncrement2 % j5);
                                    if (oVar3.f5206j != j6) {
                                        o l5 = l(j6, oVar3);
                                        if (l5 != null) {
                                            oVar3 = l5;
                                        }
                                    }
                                    InterfaceC1078i interfaceC1078i2 = interfaceC1078i;
                                    y2.c cVar2 = cVar;
                                    J4 = J(oVar3, i3, andIncrement2, c0311h);
                                    if (J4 == i.f4728m) {
                                        c0311h.a(oVar3, i3);
                                        break;
                                    }
                                    if (J4 == i.f4730o) {
                                        if (andIncrement2 < s()) {
                                            oVar3.a();
                                        }
                                        interfaceC1078i = interfaceC1078i2;
                                        cVar = cVar2;
                                    } else {
                                        if (J4 == i.f4729n) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        oVar3.a();
                                        dVar = cVar2 != null ? new d(cVar2, J4, interfaceC1078i2, 1, false) : null;
                                    }
                                }
                            } else {
                                oVar.a();
                                dVar = cVar != null ? new d(cVar, J4, interfaceC1078i, 1, false) : null;
                            }
                            c0311h.B(J4, dVar);
                        }
                        return c0311h.q();
                    } catch (Throwable th) {
                        th = th;
                        r13 = vVar;
                        r13.A();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r13 = l4;
                }
            }
        }
        Throwable o3 = o();
        int i4 = O2.u.f5207a;
        throw o3;
    }

    @Override // L2.x
    public final void e(A0.n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f4711s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, nVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            O2.v vVar = i.q;
            if (obj != vVar) {
                if (obj == i.f4732r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            O2.v vVar2 = i.f4732r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, vVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                    break;
                }
            }
            nVar.l(n());
            return;
        }
    }

    public final boolean g(long j3) {
        return j3 < f4706m.get(this) || j3 < f4705l.get(this) + ((long) this.f4712h);
    }

    public final boolean h(Throwable th, boolean z3) {
        boolean z4;
        long j3;
        long j4;
        long j5;
        Object obj;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4704k;
        if (z3) {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                if (((int) (j7 >> 60)) != 0) {
                    break;
                }
                o oVar = i.f4716a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, (1 << 60) + (j7 & 1152921504606846975L)));
        }
        O2.v vVar = i.f4733s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4710r;
            if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, th)) {
                z4 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != vVar) {
                z4 = false;
                break;
            }
        }
        if (z3) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (3 << 60) + (j6 & 1152921504606846975L)));
        } else {
            do {
                j3 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j3 >> 60);
                if (i2 == 0) {
                    j4 = j3 & 1152921504606846975L;
                    j5 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j4 = j3 & 1152921504606846975L;
                    j5 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, (j5 << 60) + j4));
        }
        w();
        if (z4) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4711s;
                obj = atomicReferenceFieldUpdater2.get(this);
                O2.v vVar2 = obj == null ? i.q : i.f4732r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, vVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                z2.v.d(1, obj);
                ((y2.c) obj).l(n());
            }
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (L2.o) ((O2.d) O2.d.f5174i.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final L2.o i(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.g.i(long):L2.o");
    }

    @Override // L2.w
    public final a iterator() {
        return new a(this);
    }

    public final void j(long j3) {
        J2.r a3;
        o oVar = (o) f4709p.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4705l;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f4712h + j4, f4706m.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j4 + 1)) {
                long j5 = i.f4717b;
                long j6 = j4 / j5;
                int i2 = (int) (j4 % j5);
                if (oVar.f5206j != j6) {
                    o l3 = l(j6, oVar);
                    if (l3 == null) {
                        continue;
                    } else {
                        oVar = l3;
                    }
                }
                Object J3 = J(oVar, i2, j4, null);
                if (J3 != i.f4730o) {
                    oVar.a();
                    y2.c cVar = this.f4713i;
                    if (cVar != null && (a3 = AbstractC0369a.a(cVar, J3, null)) != null) {
                        throw a3;
                    }
                } else if (j4 < s()) {
                    oVar.a();
                }
            }
        }
    }

    public final void k() {
        Object b3;
        if (A()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f4706m.getAndIncrement(this);
            long j3 = andIncrement / i.f4717b;
            if (s() <= andIncrement) {
                if (oVar.f5206j < j3 && oVar.b() != null) {
                    C(j3, oVar);
                }
                t(this);
                return;
            }
            if (oVar.f5206j != j3) {
                h hVar = h.f4715p;
                while (true) {
                    b3 = AbstractC0369a.b(oVar, j3, hVar);
                    if (!AbstractC0369a.e(b3)) {
                        O2.t c3 = AbstractC0369a.c(b3);
                        while (true) {
                            O2.t tVar = (O2.t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f5206j >= c3.f5206j) {
                                break;
                            }
                            if (!c3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c3)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (c3.e()) {
                                        c3.d();
                                    }
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                o oVar2 = null;
                if (AbstractC0369a.e(b3)) {
                    w();
                    C(j3, oVar);
                    t(this);
                } else {
                    o oVar3 = (o) AbstractC0369a.c(b3);
                    long j4 = oVar3.f5206j;
                    if (j4 > j3) {
                        long j5 = j4 * i.f4717b;
                        if (f4706m.compareAndSet(this, andIncrement + 1, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f4707n;
                            if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            t(this);
                        }
                    } else {
                        oVar2 = oVar3;
                    }
                }
                if (oVar2 == null) {
                    continue;
                } else {
                    oVar = oVar2;
                }
            }
            int i2 = (int) (andIncrement % i.f4717b);
            Object k3 = oVar.k(i2);
            boolean z3 = k3 instanceof w0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4705l;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !oVar.j(k3, i2, i.f4722g)) {
                while (true) {
                    Object k4 = oVar.k(i2);
                    if (!(k4 instanceof w0)) {
                        if (k4 != i.f4725j) {
                            if (k4 != null) {
                                if (k4 == i.f4719d || k4 == i.f4723h || k4 == i.f4724i || k4 == i.f4726k || k4 == i.f4727l) {
                                    break loop0;
                                }
                                if (k4 != i.f4721f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k4).toString());
                                }
                            } else if (oVar.j(k4, i2, i.f4720e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (oVar.j(k4, i2, new y((w0) k4))) {
                            break loop0;
                        }
                    } else if (oVar.j(k4, i2, i.f4722g)) {
                        if (I(k4, oVar, i2)) {
                            oVar.n(i2, i.f4719d);
                            break;
                        } else {
                            oVar.n(i2, i.f4725j);
                            oVar.l(i2, false);
                        }
                    }
                }
            } else if (I(k3, oVar, i2)) {
                oVar.n(i2, i.f4719d);
                break;
            } else {
                oVar.n(i2, i.f4725j);
                oVar.l(i2, false);
                t(this);
            }
        }
        t(this);
    }

    public final o l(long j3, o oVar) {
        Object b3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        o oVar2 = i.f4716a;
        h hVar = h.f4715p;
        loop0: while (true) {
            b3 = AbstractC0369a.b(oVar, j3, hVar);
            if (!AbstractC0369a.e(b3)) {
                O2.t c3 = AbstractC0369a.c(b3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4709p;
                    O2.t tVar = (O2.t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f5206j >= c3.f5206j) {
                        break loop0;
                    }
                    if (!c3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (c3.e()) {
                                c3.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC0369a.e(b3)) {
            w();
            if (oVar.f5206j * i.f4717b >= s()) {
                return null;
            }
            oVar.a();
            return null;
        }
        o oVar3 = (o) AbstractC0369a.c(b3);
        boolean A3 = A();
        long j5 = oVar3.f5206j;
        if (!A3 && j3 <= f4706m.get(this) / i.f4717b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = q;
                O2.t tVar2 = (O2.t) atomicReferenceFieldUpdater2.get(this);
                if (tVar2.f5206j >= j5 || !oVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, oVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                        if (oVar3.e()) {
                            oVar3.d();
                        }
                    }
                }
                if (tVar2.e()) {
                    tVar2.d();
                }
            }
        }
        if (j5 <= j3) {
            return oVar3;
        }
        long j6 = i.f4717b * j5;
        do {
            atomicLongFieldUpdater = f4705l;
            j4 = atomicLongFieldUpdater.get(this);
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j6));
        if (j5 * i.f4717b >= s()) {
            return null;
        }
        oVar3.a();
        return null;
    }

    @Override // L2.w
    public final Object m() {
        o oVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4705l;
        long j3 = atomicLongFieldUpdater.get(this);
        long j4 = f4704k.get(this);
        if (u(j4, true)) {
            return new l(n());
        }
        long j5 = j4 & 1152921504606846975L;
        Object obj = n.f4738b;
        if (j3 >= j5) {
            return obj;
        }
        Object obj2 = i.f4726k;
        o oVar2 = (o) f4709p.get(this);
        while (!y()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = i.f4717b;
            long j7 = andIncrement / j6;
            int i2 = (int) (andIncrement % j6);
            if (oVar2.f5206j != j7) {
                o l3 = l(j7, oVar2);
                if (l3 == null) {
                    continue;
                } else {
                    oVar = l3;
                }
            } else {
                oVar = oVar2;
            }
            Object J3 = J(oVar, i2, andIncrement, obj2);
            if (J3 == i.f4728m) {
                w0 w0Var = obj2 instanceof w0 ? (w0) obj2 : null;
                if (w0Var != null) {
                    w0Var.a(oVar, i2);
                }
                L(andIncrement);
                oVar.h();
            } else if (J3 == i.f4730o) {
                if (andIncrement < s()) {
                    oVar.a();
                }
                oVar2 = oVar;
            } else {
                if (J3 == i.f4729n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                oVar.a();
                obj = J3;
            }
            return obj;
        }
        return new l(n());
    }

    public final Throwable n() {
        return (Throwable) f4710r.get(this);
    }

    public final Throwable o() {
        Throwable n3 = n();
        return n3 == null ? new p("Channel was closed") : n3;
    }

    @Override // L2.x
    public final boolean p(Throwable th) {
        return h(th, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r1;
     */
    @Override // L2.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.g.q(java.lang.Object):java.lang.Object");
    }

    public final Throwable r() {
        Throwable n3 = n();
        return n3 == null ? new q("Channel was closed") : n3;
    }

    public final long s() {
        return f4704k.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b6, code lost:
    
        r3 = (L2.o) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bd, code lost:
    
        if (r3 != null) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.g.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (L2.o) ((O2.d) O2.d.f5174i.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.g.u(long, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        d(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d1, code lost:
    
        r2.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014e, code lost:
    
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0151, code lost:
    
        r1 = r27;
        r2 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [J2.h] */
    @Override // L2.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(java.lang.Object r27, q2.InterfaceC1073d r28) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.g.v(java.lang.Object, q2.d):java.lang.Object");
    }

    @Override // L2.x
    public final boolean w() {
        return u(f4704k.get(this), false);
    }

    @Override // L2.w
    public final Object x(InterfaceC1073d interfaceC1073d) {
        return E(this, interfaceC1073d);
    }

    public final boolean y() {
        return u(f4704k.get(this), true);
    }

    public boolean z() {
        return false;
    }
}
