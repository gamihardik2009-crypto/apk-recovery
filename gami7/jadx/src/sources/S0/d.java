package S0;

import B1.C;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends C {

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5580f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5581g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5582h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5583i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5584j;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(18);
        this.f5580f = atomicReferenceFieldUpdater;
        this.f5581g = atomicReferenceFieldUpdater2;
        this.f5582h = atomicReferenceFieldUpdater3;
        this.f5583i = atomicReferenceFieldUpdater4;
        this.f5584j = atomicReferenceFieldUpdater5;
    }

    @Override // B1.C
    public final void h0(f fVar, f fVar2) {
        this.f5581g.lazySet(fVar, fVar2);
    }

    @Override // B1.C
    public final void i0(f fVar, Thread thread) {
        this.f5580f.lazySet(fVar, thread);
    }

    @Override // B1.C
    public final boolean r(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5583i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // B1.C
    public final boolean s(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5584j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // B1.C
    public final boolean t(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5582h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
