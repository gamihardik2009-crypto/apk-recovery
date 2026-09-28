package M2;

import N2.AbstractC0363b;
import N2.AbstractC0364c;
import N2.AbstractC0365d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q2.InterfaceC1073d;

/* loaded from: classes.dex */
public final class e0 extends AbstractC0365d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4879a = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_state");
    private volatile Object _state;

    @Override // N2.AbstractC0365d
    public final boolean a(AbstractC0363b abstractC0363b) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4879a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, P.f4830b);
        return true;
    }

    @Override // N2.AbstractC0365d
    public final InterfaceC1073d[] b(AbstractC0363b abstractC0363b) {
        f4879a.set(this, null);
        return AbstractC0364c.f5032a;
    }
}
