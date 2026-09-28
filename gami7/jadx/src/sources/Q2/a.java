package Q2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z2.s;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5325p = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: h, reason: collision with root package name */
    public final m f5326h;

    /* renamed from: i, reason: collision with root package name */
    public final s f5327i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public int f5328j;

    /* renamed from: k, reason: collision with root package name */
    public long f5329k;

    /* renamed from: l, reason: collision with root package name */
    public long f5330l;

    /* renamed from: m, reason: collision with root package name */
    public int f5331m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5332n;
    private volatile Object nextParkedWorker;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f5333o;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f5333o = bVar;
        setDaemon(true);
        this.f5326h = new m();
        this.f5327i = new s();
        this.f5328j = 4;
        this.nextParkedWorker = b.f5336r;
        C2.e.f709h.getClass();
        this.f5331m = C2.e.f710i.a().nextInt();
        f(i2);
    }

    public final h a(boolean z3) {
        h e3;
        h e4;
        b bVar;
        long j3;
        int i2 = this.f5328j;
        h hVar = null;
        m mVar = this.f5326h;
        b bVar2 = this.f5333o;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f5335p;
            do {
                bVar = this.f5333o;
                j3 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f5362b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f5350i.f5351h == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.f5364d.get(mVar);
                    int i4 = m.f5363c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.f5365e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        h c3 = mVar.c(i4, true);
                        if (c3 != null) {
                            hVar = c3;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f5342m.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f5335p.compareAndSet(bVar, j3, j3 - 4398046511104L));
            this.f5328j = 1;
        }
        if (z3) {
            boolean z4 = d(bVar2.f5337h * 2) == 0;
            if (z4 && (e4 = e()) != null) {
                return e4;
            }
            mVar.getClass();
            h hVar4 = (h) m.f5362b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z4 && (e3 = e()) != null) {
                return e3;
            }
        } else {
            h e5 = e();
            if (e5 != null) {
                return e5;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f5331m;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f5331m = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d3 = d(2);
        b bVar = this.f5333o;
        if (d3 == 0) {
            h hVar = (h) bVar.f5341l.d();
            return hVar != null ? hVar : (h) bVar.f5342m.d();
        }
        h hVar2 = (h) bVar.f5342m.d();
        return hVar2 != null ? hVar2 : (h) bVar.f5341l.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5333o.f5340k);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f5328j;
        boolean z3 = i3 == 1;
        if (z3) {
            b.f5335p.addAndGet(this.f5333o, 4398046511104L);
        }
        if (i3 != i2) {
            this.f5328j = i2;
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Q2.h i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.a.i(int):Q2.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.a.run():void");
    }
}
