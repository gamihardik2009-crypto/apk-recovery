package Y1;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class r extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f6346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f6347m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(H h2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6347m = h2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((r) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new r(this.f6347m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f6346l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            int i3 = I2.a.f3959j;
            long G3 = B2.a.G(500, I2.c.MILLISECONDS);
            this.f6346l = 1;
            Object f3 = J2.B.f(J2.B.w(G3), this);
            if (f3 != enumC1145a) {
                f3 = c0880v;
            }
            if (f3 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C1.y.J(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        Q2.c cVar = J2.H.f4357b;
        q qVar = new q(this.f6347m, null);
        this.f6346l = 2;
        return J2.B.z(cVar, qVar, this) == enumC1145a ? enumC1145a : c0880v;
    }
}
