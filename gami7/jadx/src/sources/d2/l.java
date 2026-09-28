package d2;

import C1.y;
import J2.InterfaceC0328z;
import Q1.p;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class l extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f7527l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f7528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ R1.e f7529n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, R1.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f7528m = nVar;
        this.f7529n = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((l) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new l(this.f7528m, this.f7529n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f7527l;
        n nVar = this.f7528m;
        if (i2 == 0) {
            y.J(obj);
            p pVar = nVar.f7533b;
            R1.e a3 = R1.e.a(this.f7529n, null, null, null, !r5.f5494e, 47);
            this.f7527l = 1;
            if (pVar.e(a3, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.J(obj);
                return C0880v.f8657a;
            }
            y.J(obj);
        }
        p pVar2 = nVar.f7533b;
        this.f7527l = 2;
        if (pVar2.f(this) == enumC1145a) {
            return enumC1145a;
        }
        return C0880v.f8657a;
    }
}
