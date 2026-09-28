package S2;

import A0.n;
import J2.C0311h;
import J2.InterfaceC0310g;
import O2.AbstractC0369a;
import O2.t;
import O2.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.C0880v;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5632c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5633d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5634e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5635f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5636g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final int f5637a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final n f5638b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i2) {
        if (i2 < 0 || i2 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i2;
        this.f5638b = new n(15, this);
    }

    public final void a(c cVar) {
        Object b3;
        C0880v c0880v;
        C0311h c0311h;
        f fVar;
        long j3;
        while (true) {
            int andDecrement = f5636g.getAndDecrement(this);
            if (andDecrement <= this.f5637a) {
                C0880v c0880v2 = C0880v.f8657a;
                C0311h c0311h2 = cVar.f5625h;
                d dVar = cVar.f5627j;
                Object obj = cVar.f5626i;
                if (andDecrement > 0) {
                    d.f5628h.set(dVar, obj);
                    c0311h2.B(c0880v2, new b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5634e;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f5635f.getAndIncrement(this);
                f fVar2 = f.f5630p;
                long j4 = andIncrement / i.f5644f;
                while (true) {
                    b3 = AbstractC0369a.b(jVar, j4, fVar2);
                    if (!AbstractC0369a.e(b3)) {
                        t c3 = AbstractC0369a.c(b3);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j3 = j4;
                            c0880v = c0880v2;
                            c0311h = c0311h2;
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
                                    c0880v2 = c0880v;
                                    fVar2 = fVar;
                                    j4 = j3;
                                    c0311h2 = c0311h;
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        c0880v = c0880v2;
                        c0311h = c0311h2;
                        break;
                    }
                    c0880v2 = c0880v;
                    fVar2 = fVar;
                    j4 = j3;
                    c0311h2 = c0311h;
                }
                j jVar2 = (j) AbstractC0369a.c(b3);
                int i2 = (int) (andIncrement % i.f5644f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f5645l;
                while (!atomicReferenceArray.compareAndSet(i2, null, cVar)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        v vVar = i.f5640b;
                        v vVar2 = i.f5641c;
                        while (!atomicReferenceArray.compareAndSet(i2, vVar, vVar2)) {
                            C0311h c0311h3 = c0311h;
                            if (atomicReferenceArray.get(i2) != vVar) {
                                break;
                            } else {
                                c0311h = c0311h3;
                            }
                        }
                        d.f5628h.set(dVar, obj);
                        c0311h.B(c0880v, new b(dVar, cVar, 0));
                        return;
                    }
                }
                cVar.a(jVar2, i2);
                return;
            }
        }
    }

    public final void b() {
        int i2;
        Object b3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5636g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.f5637a;
            if (andIncrement >= i3) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i3).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5632c;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f5633d.getAndIncrement(this);
            long j3 = andIncrement2 / i.f5644f;
            g gVar = g.f5631p;
            while (true) {
                b3 = AbstractC0369a.b(jVar, j3, gVar);
                if (AbstractC0369a.e(b3)) {
                    break;
                }
                t c3 = AbstractC0369a.c(b3);
                while (true) {
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
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
            }
            j jVar2 = (j) AbstractC0369a.c(b3);
            jVar2.a();
            if (jVar2.f5206j <= j3) {
                int i4 = (int) (andIncrement2 % i.f5644f);
                v vVar = i.f5640b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f5645l;
                Object andSet = atomicReferenceArray.getAndSet(i4, vVar);
                if (andSet == null) {
                    int i5 = i.f5639a;
                    boolean z3 = false;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (atomicReferenceArray.get(i4) == i.f5641c) {
                            return;
                        }
                    }
                    v vVar2 = i.f5640b;
                    v vVar3 = i.f5642d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i4, vVar2, vVar3)) {
                            if (atomicReferenceArray.get(i4) != vVar2) {
                                break;
                            }
                        } else {
                            z3 = true;
                            break;
                        }
                    }
                    if (!z3) {
                        return;
                    }
                } else if (andSet == i.f5643e) {
                    continue;
                } else {
                    boolean z4 = andSet instanceof InterfaceC0310g;
                    C0880v c0880v = C0880v.f8657a;
                    if (z4) {
                        InterfaceC0310g interfaceC0310g = (InterfaceC0310g) andSet;
                        v z5 = interfaceC0310g.z(c0880v, this.f5638b);
                        if (z5 != null) {
                            interfaceC0310g.E(z5);
                            return;
                        }
                    } else {
                        if (!(andSet instanceof R2.f)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((R2.e) ((R2.f) andSet)).n(this, c0880v) == 0) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
