package H;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class P1 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1881l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V1 f1882m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r.j f1883n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1(V1 v12, r.j jVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1882m = v12;
        this.f1883n = jVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((P1) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new P1(this.f1882m, this.f1883n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1881l;
        if (i2 == 0) {
            C1.y.J(obj);
            this.f1881l = 1;
            if (this.f1882m.a(this.f1883n, this) == enumC1145a) {
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
