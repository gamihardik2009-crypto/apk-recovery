package Q2;

import J2.B;
import O2.r;
import O2.v;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m.AbstractC0837j;
import t0.AbstractC1265x;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5334o = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5335p = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");
    public static final AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: r, reason: collision with root package name */
    public static final v f5336r = new v("NOT_IN_STACK", 0);
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: h, reason: collision with root package name */
    public final int f5337h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5338i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5339j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5340k;

    /* renamed from: l, reason: collision with root package name */
    public final e f5341l;

    /* renamed from: m, reason: collision with root package name */
    public final e f5342m;

    /* renamed from: n, reason: collision with root package name */
    public final r f5343n;
    private volatile long parkedWorkersStack;

    public b(int i2, int i3, long j3, String str) {
        this.f5337h = i2;
        this.f5338i = i3;
        this.f5339j = j3;
        this.f5340k = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(AbstractC1265x.d(i3, i2, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f5341l = new e();
        this.f5342m = new e();
        this.f5343n = new r((i2 + 1) * 2);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void c(b bVar, Runnable runnable, boolean z3, int i2) {
        i iVar = k.f5359g;
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        bVar.b(runnable, iVar, z3);
    }

    public final int a() {
        synchronized (this.f5343n) {
            try {
                if (q.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f5335p;
                long j3 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j3 & 2097151);
                int i3 = i2 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f5337h) {
                    return 0;
                }
                if (i2 >= this.f5338i) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f5343n.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                a aVar = new a(this, i4);
                this.f5343n.c(i4, aVar);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i5 = i3 + 1;
                aVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, i iVar, boolean z3) {
        h jVar;
        int i2;
        k.f5358f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f5349h = nanoTime;
            jVar.f5350i = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z4 = false;
        boolean z5 = jVar.f5350i.f5351h == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5335p;
        long addAndGet = z5 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !z2.h.a(aVar.f5333o, this)) {
            aVar = null;
        }
        if (aVar != null && (i2 = aVar.f5328j) != 5 && (jVar.f5350i.f5351h != 0 || i2 != 2)) {
            aVar.f5332n = true;
            m mVar = aVar.f5326h;
            if (z3) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f5362b.getAndSet(mVar, jVar);
                jVar = hVar == null ? null : mVar.a(hVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f5350i.f5351h == 1 ? this.f5342m.a(jVar) : this.f5341l.a(jVar))) {
                throw new RejectedExecutionException(this.f5340k + " was terminated");
            }
        }
        if (z3 && aVar != null) {
            z4 = true;
        }
        if (z5) {
            if (z4 || f() || e(addAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z4 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Q2.b.q
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof Q2.a
            r3 = 0
            if (r1 == 0) goto L18
            Q2.a r0 = (Q2.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            Q2.b r1 = r0.f5333o
            boolean r1 = z2.h.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            O2.r r1 = r8.f5343n
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = Q2.b.f5335p     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L77
            r1 = r2
        L37:
            O2.r r5 = r8.f5343n
            java.lang.Object r5 = r5.b(r1)
            z2.h.c(r5)
            Q2.a r5 = (Q2.a) r5
            if (r5 == r0) goto L72
        L44:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L53:
            Q2.m r5 = r5.f5326h
            Q2.e r6 = r8.f5342m
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = Q2.m.f5362b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            Q2.h r7 = (Q2.h) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            Q2.h r7 = r5.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r4) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            Q2.e r1 = r8.f5342m
            r1.b()
            Q2.e r1 = r8.f5341l
            r1.b()
        L81:
            if (r0 == 0) goto L89
            Q2.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L89:
            Q2.e r1 = r8.f5341l
            java.lang.Object r1 = r1.d()
            Q2.h r1 = (Q2.h) r1
            if (r1 != 0) goto Lb0
            Q2.e r1 = r8.f5342m
            java.lang.Object r1 = r1.d()
            Q2.h r1 = (Q2.h) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Q2.b.f5334o
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Q2.b.f5335p
            r0.set(r8, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.b.close():void");
    }

    public final void d(a aVar, int i2, int i3) {
        while (true) {
            long j3 = f5334o.get(this);
            int i4 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == f5336r) {
                            i4 = -1;
                            break;
                        }
                        if (c3 == null) {
                            i4 = 0;
                            break;
                        }
                        a aVar2 = (a) c3;
                        int b3 = aVar2.b();
                        if (b3 != 0) {
                            i4 = b3;
                            break;
                        }
                        c3 = aVar2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (f5334o.compareAndSet(this, j3, i4 | j4)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j3) {
        int i2 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f5337h;
        if (i2 < i3) {
            int a3 = a();
            if (a3 == 1 && i3 > 1) {
                a();
            }
            if (a3 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, false, 6);
    }

    public final boolean f() {
        v vVar;
        int i2;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5334o;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f5343n.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object c3 = aVar.c();
                while (true) {
                    vVar = f5336r;
                    if (c3 == vVar) {
                        i2 = -1;
                        break;
                    }
                    if (c3 == null) {
                        i2 = 0;
                        break;
                    }
                    a aVar2 = (a) c3;
                    i2 = aVar2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c3 = aVar2.c();
                }
                if (i2 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j3, j4 | i2)) {
                    aVar.g(vVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f5325p.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f5343n;
        int a3 = rVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a3; i7++) {
            a aVar = (a) rVar.b(i7);
            if (aVar != null) {
                m mVar = aVar.f5326h;
                mVar.getClass();
                int i8 = m.f5362b.get(mVar) != null ? (m.f5363c.get(mVar) - m.f5364d.get(mVar)) + 1 : m.f5363c.get(mVar) - m.f5364d.get(mVar);
                int d3 = AbstractC0837j.d(aVar.f5328j);
                if (d3 == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (d3 == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (d3 == 2) {
                    i4++;
                } else if (d3 == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (d3 == 4) {
                    i6++;
                }
            }
        }
        long j3 = f5335p.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f5340k);
        sb4.append('@');
        sb4.append(B.j(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f5337h;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f5338i);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f5341l.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f5342m.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
