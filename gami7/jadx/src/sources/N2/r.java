package N2;

import J2.InterfaceC0328z;
import M2.InterfaceC0343g;
import java.util.concurrent.atomic.AtomicInteger;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class r extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5069l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g[] f5070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5071n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f5072o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L2.k f5073p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC0343g[] interfaceC0343gArr, int i2, AtomicInteger atomicInteger, L2.k kVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5070m = interfaceC0343gArr;
        this.f5071n = i2;
        this.f5072o = atomicInteger;
        this.f5073p = kVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((r) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new r(this.f5070m, this.f5071n, this.f5072o, this.f5073p, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5069l;
        AtomicInteger atomicInteger = this.f5072o;
        L2.k kVar = this.f5073p;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                InterfaceC0343g[] interfaceC0343gArr = this.f5070m;
                int i3 = this.f5071n;
                InterfaceC0343g interfaceC0343g = interfaceC0343gArr[i3];
                q qVar = new q(kVar, i3);
                this.f5069l = 1;
                if (interfaceC0343g.b(qVar, this) == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                kVar.p(null);
            }
            return C0880v.f8657a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                kVar.p(null);
            }
        }
    }
}
