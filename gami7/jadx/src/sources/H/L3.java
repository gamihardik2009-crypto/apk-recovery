package H;

import m2.C0880v;
import n0.C0921D;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class L3 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1707l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1708m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P3 f1709n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L3(P3 p3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1709n = p3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((L3) m((C0921D) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        L3 l3 = new L3(this.f1709n, interfaceC1073d);
        l3.f1708m = obj;
        return l3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1707l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0921D c0921d = (C0921D) this.f1708m;
            P3 p3 = this.f1709n;
            K3 k3 = new K3(p3, null);
            J3 j3 = new J3(p3, 1);
            this.f1707l = 1;
            if (p.b1.d(c0921d, k3, j3, this, 3) == enumC1145a) {
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
