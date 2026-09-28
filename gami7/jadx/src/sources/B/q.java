package B;

import J2.InterfaceC0328z;
import J2.Z;
import J2.p0;
import java.util.concurrent.atomic.AtomicReference;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class q extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f228l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f229m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f229m = rVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((q) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        q qVar = new q(this.f229m, interfaceC1073d);
        qVar.f228l = obj;
        return qVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f228l;
        r rVar = this.f229m;
        Z z3 = (Z) rVar.f230a.getAndSet(null);
        AtomicReference atomicReference = rVar.f230a;
        p pVar = new p(z3, rVar, null);
        boolean z4 = false;
        p0 r3 = J2.B.r(interfaceC0328z, null, 0, pVar, 3);
        while (true) {
            if (atomicReference.compareAndSet(null, r3)) {
                z4 = true;
                break;
            }
            if (atomicReference.get() != null) {
                break;
            }
        }
        return Boolean.valueOf(z4);
    }
}
