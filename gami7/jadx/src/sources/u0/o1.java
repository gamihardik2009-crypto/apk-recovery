package u0;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class o1 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11118l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r1 f11119m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(r1 r1Var, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11119m = r1Var;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((o1) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new o1(this.f11119m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11118l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            C1314v c1314v = this.f11119m.f11138h;
            this.f11118l = 1;
            Object e3 = c1314v.f11214t.e(this);
            if (e3 != enumC1145a) {
                e3 = c0880v;
            }
            if (e3 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return c0880v;
    }
}
