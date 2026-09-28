package H;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class O1 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1819l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V1 f1820m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S1 f1821n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(V1 v12, S1 s12, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1820m = v12;
        this.f1821n = s12;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((O1) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new O1(this.f1820m, this.f1821n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1819l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            S1 s12 = this.f1821n;
            float f3 = s12.f1967a;
            float f4 = s12.f1968b;
            float f5 = s12.f1970d;
            float f6 = s12.f1969c;
            this.f1819l = 1;
            V1 v12 = this.f1820m;
            v12.f2072a = f3;
            v12.f2073b = f4;
            v12.f2074c = f5;
            v12.f2075d = f6;
            Object b3 = v12.b(this);
            if (b3 != enumC1145a) {
                b3 = c0880v;
            }
            if (b3 == enumC1145a) {
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
