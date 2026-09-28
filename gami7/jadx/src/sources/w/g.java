package w;

import C1.y;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import t0.AbstractC1248f;
import t0.Z;

/* loaded from: classes.dex */
public final class g extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11420l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f11421m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.a f11422n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, y2.a aVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11421m = iVar;
        this.f11422n = aVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((g) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new g(this.f11421m, this.f11422n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        InterfaceC1371a interfaceC1371a;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11420l;
        if (i2 == 0) {
            y.J(obj);
            i iVar = this.f11421m;
            if (iVar.f5869t) {
                if (iVar.f5858h.f5869t) {
                    interfaceC1371a = (InterfaceC1371a) AbstractC1248f.j(iVar, i.f11428w);
                    if (interfaceC1371a == null) {
                        interfaceC1371a = new j(iVar);
                    }
                } else {
                    interfaceC1371a = null;
                }
                if (interfaceC1371a != null) {
                    Z u3 = AbstractC1248f.u(iVar);
                    this.f11420l = 1;
                    if (interfaceC1371a.n0(u3, this.f11422n, this) == enumC1145a) {
                        return enumC1145a;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.J(obj);
        }
        return C0880v.f8657a;
    }
}
