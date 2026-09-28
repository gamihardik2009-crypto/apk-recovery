package J2;

import O2.AbstractC0369a;
import O2.AbstractC0370b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h0 extends AbstractC0370b {

    /* renamed from: b, reason: collision with root package name */
    public final O2.k f4404b;

    /* renamed from: c, reason: collision with root package name */
    public O2.k f4405c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f4406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4407e;

    public h0(O2.k kVar, i0 i0Var, V v3) {
        this.f4406d = i0Var;
        this.f4407e = v3;
        this.f4404b = kVar;
    }

    @Override // O2.AbstractC0370b
    public final void b(Object obj, Object obj2) {
        O2.k kVar = (O2.k) obj;
        boolean z3 = obj2 == null;
        O2.k kVar2 = this.f4404b;
        O2.k kVar3 = z3 ? kVar2 : this.f4405c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = O2.k.f5190h;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z3) {
                O2.k kVar4 = this.f4405c;
                z2.h.c(kVar4);
                kVar2.m(kVar4);
            }
        }
    }

    @Override // O2.AbstractC0370b
    public final O2.v c(Object obj) {
        if (this.f4406d.V() == this.f4407e) {
            return null;
        }
        return AbstractC0369a.f5169e;
    }
}
