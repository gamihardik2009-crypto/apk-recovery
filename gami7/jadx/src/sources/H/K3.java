package H;

import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class K3 extends AbstractC1204i implements y2.f {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ long f1671l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P3 f1672m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K3(P3 p3, InterfaceC1073d interfaceC1073d) {
        super(3, interfaceC1073d);
        this.f1672m = p3;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        long j3 = ((b0.c) obj2).f7058a;
        K3 k3 = new K3(this.f1672m, (InterfaceC1073d) obj3);
        k3.f1671l = j3;
        C0880v c0880v = C0880v.f8657a;
        k3.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        long j3 = this.f1671l;
        P3 p3 = this.f1672m;
        p3.f1911m.h((p3.f1906h ? p3.f1905g.g() - b0.c.d(j3) : b0.c.d(j3)) - p3.f1910l.g());
        return C0880v.f8657a;
    }
}
