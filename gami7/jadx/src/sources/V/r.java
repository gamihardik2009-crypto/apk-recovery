package V;

import C1.y;
import J2.B;
import J2.InterfaceC0328z;
import J2.Z;
import java.util.concurrent.atomic.AtomicReference;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class r extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5873l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5874m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.c f5875n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5876o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f5877p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y2.c cVar, AtomicReference atomicReference, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5875n = cVar;
        this.f5876o = atomicReference;
        this.f5877p = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((r) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        r rVar = new r(this.f5875n, this.f5876o, this.f5877p, interfaceC1073d);
        rVar.f5874m = obj;
        return rVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        q qVar;
        Z z3;
        q qVar2;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5873l;
        AtomicReference atomicReference = this.f5876o;
        try {
            if (i2 == 0) {
                y.J(obj);
                InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f5874m;
                qVar = new q(B.k(interfaceC0328z.r()), this.f5875n.l(interfaceC0328z));
                q qVar3 = (q) atomicReference.getAndSet(qVar);
                if (qVar3 != null && (z3 = qVar3.f5871a) != null) {
                    this.f5874m = qVar;
                    this.f5873l = 1;
                    if (B.d(z3, this) == enumC1145a) {
                        return enumC1145a;
                    }
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar2 = (q) this.f5874m;
                    try {
                        y.J(obj);
                        while (!atomicReference.compareAndSet(qVar2, null) && atomicReference.get() == qVar2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        while (!atomicReference.compareAndSet(qVar2, null) && atomicReference.get() == qVar2) {
                        }
                        throw th;
                    }
                }
                qVar = (q) this.f5874m;
                y.J(obj);
            }
            y2.e eVar = this.f5877p;
            Object obj2 = qVar.f5872b;
            this.f5874m = qVar;
            this.f5873l = 2;
            obj = eVar.j(obj2, this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
            qVar2 = qVar;
            while (!atomicReference.compareAndSet(qVar2, null)) {
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            qVar2 = qVar;
            while (!atomicReference.compareAndSet(qVar2, null)) {
            }
            throw th;
        }
    }
}
