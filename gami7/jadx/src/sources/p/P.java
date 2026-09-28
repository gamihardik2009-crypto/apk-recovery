package p;

import H.O3;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class P extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9482l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9483m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f9484n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T f9485o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(y2.e eVar, T t3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9484n = eVar;
        this.f9485o = t3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((P) m((O3) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        P p3 = new P(this.f9484n, this.f9485o, interfaceC1073d);
        p3.f9483m = obj;
        return p3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9482l;
        if (i2 == 0) {
            C1.y.J(obj);
            C1007b c1007b = new C1007b((O3) this.f9483m, 2, this.f9485o);
            this.f9482l = 1;
            if (this.f9484n.j(c1007b, this) == enumC1145a) {
                return enumC1145a;
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
