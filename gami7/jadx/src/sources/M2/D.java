package M2;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class D extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f4796l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4797m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g f4798n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H f4799o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f4800p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(InterfaceC0343g interfaceC0343g, H h2, Object obj, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f4798n = interfaceC0343g;
        this.f4799o = h2;
        this.f4800p = obj;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((D) m((S) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        D d3 = new D(this.f4798n, this.f4799o, this.f4800p, interfaceC1073d);
        d3.f4797m = obj;
        return d3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f4796l;
        if (i2 == 0) {
            C1.y.J(obj);
            int ordinal = ((S) this.f4797m).ordinal();
            H h2 = this.f4799o;
            if (ordinal == 0) {
                this.f4796l = 1;
                if (this.f4798n.b(h2, this) == enumC1145a) {
                    return enumC1145a;
                }
            } else if (ordinal == 2) {
                O2.v vVar = P.f4829a;
                Object obj2 = this.f4800p;
                if (obj2 == vVar) {
                    h2.a();
                } else {
                    h2.d(obj2);
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return C0880v.f8657a;
    }
}
