package M1;

import a.AbstractC0423a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends AbstractC0423a {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4767g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4768h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4769i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4770j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4771k;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4767g = atomicReferenceFieldUpdater;
        this.f4768h = atomicReferenceFieldUpdater2;
        this.f4769i = atomicReferenceFieldUpdater3;
        this.f4770j = atomicReferenceFieldUpdater4;
        this.f4771k = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0423a
    public final boolean A(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4770j;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // a.AbstractC0423a
    public final boolean B(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4771k;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // a.AbstractC0423a
    public final boolean C(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4769i;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }

    @Override // a.AbstractC0423a
    public final void V(h hVar, h hVar2) {
        this.f4768h.lazySet(hVar, hVar2);
    }

    @Override // a.AbstractC0423a
    public final void W(h hVar, Thread thread) {
        this.f4767g.lazySet(hVar, thread);
    }
}
