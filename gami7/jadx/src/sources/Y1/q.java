package Y1;

import J2.InterfaceC0328z;
import M2.InterfaceC0343g;
import M2.K;
import M2.P;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class q extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f6344l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f6345m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(H h2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6345m = h2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((q) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new q(this.f6345m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f6344l;
        H h2 = this.f6345m;
        if (i2 == 0) {
            C1.y.J(obj);
            this.f6344l = 1;
            if (H.e(h2, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
                return C0880v.f8657a;
            }
            C1.y.J(obj);
        }
        K k3 = h2.f6270h;
        int i3 = I2.a.f3959j;
        InterfaceC0343g f3 = P.f(k3, J2.B.w(B2.a.G(1, I2.c.SECONDS)));
        p pVar = new p(h2, null);
        this.f6344l = 2;
        if (P.e(f3, pVar, this) == enumC1145a) {
            return enumC1145a;
        }
        return C0880v.f8657a;
    }
}
