package J2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class c0 extends i0 {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4386j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Z z3) {
        super(true);
        boolean z4 = true;
        Y(z3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0.f4410i;
        InterfaceC0314k interfaceC0314k = (InterfaceC0314k) atomicReferenceFieldUpdater.get(this);
        C0315l c0315l = interfaceC0314k instanceof C0315l ? (C0315l) interfaceC0314k : null;
        if (c0315l != null) {
            i0 q = c0315l.q();
            while (!q.S()) {
                InterfaceC0314k interfaceC0314k2 = (InterfaceC0314k) atomicReferenceFieldUpdater.get(q);
                C0315l c0315l2 = interfaceC0314k2 instanceof C0315l ? (C0315l) interfaceC0314k2 : null;
                if (c0315l2 != null) {
                    q = c0315l2.q();
                }
            }
            this.f4386j = z4;
        }
        z4 = false;
        this.f4386j = z4;
    }

    @Override // J2.i0
    public final boolean S() {
        return this.f4386j;
    }

    @Override // J2.i0
    public final boolean T() {
        return true;
    }
}
