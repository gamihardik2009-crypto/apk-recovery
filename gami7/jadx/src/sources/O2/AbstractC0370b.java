package O2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: O2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0370b extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5171a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0370b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0369a.f5165a;

    @Override // O2.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5171a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        v vVar = AbstractC0369a.f5165a;
        if (obj2 == vVar) {
            v c3 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == vVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, c3)) {
                        obj2 = c3;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != vVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract v c(Object obj);
}
