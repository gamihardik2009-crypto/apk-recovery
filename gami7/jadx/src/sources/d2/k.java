package d2;

import C1.y;
import J2.InterfaceC0328z;
import Q1.p;
import Q1.q;
import Q1.r;
import m2.C0880v;
import n2.AbstractC0949a;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class k extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f7524l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f7525m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ R1.e f7526n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, R1.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f7525m = nVar;
        this.f7526n = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((k) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new k(this.f7525m, this.f7526n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f7524l;
        C0880v c0880v = C0880v.f8657a;
        n nVar = this.f7525m;
        if (i2 == 0) {
            y.J(obj);
            p pVar = nVar.f7533b;
            this.f7524l = 1;
            r t3 = pVar.f5312a.t();
            t3.getClass();
            Object k3 = AbstractC0949a.k((r1.r) t3.f5322b, new q(t3, this.f7526n, 1), this);
            if (k3 != enumC1145a) {
                k3 = c0880v;
            }
            if (k3 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    y.J(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.J(obj);
        }
        p pVar2 = nVar.f7533b;
        this.f7524l = 2;
        return pVar2.f(this) == enumC1145a ? enumC1145a : c0880v;
    }
}
