package u0;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class p1 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11122l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r1 f11123m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(r1 r1Var, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11123m = r1Var;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((p1) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new p1(this.f11123m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11122l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            C1314v c1314v = this.f11123m.f11138h;
            this.f11122l = 1;
            Object a3 = c1314v.f11216u.a(this);
            if (a3 != enumC1145a) {
                a3 = c0880v;
            }
            if (a3 == enumC1145a) {
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
