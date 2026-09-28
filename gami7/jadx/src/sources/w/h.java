package w;

import C1.y;
import J2.B;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r0.InterfaceC1129r;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class h extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11423l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f11424m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1129r f11425n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.a f11426o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.a f11427p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC1129r interfaceC1129r, y2.a aVar, y2.a aVar2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11424m = iVar;
        this.f11425n = interfaceC1129r;
        this.f11426o = aVar;
        this.f11427p = aVar2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((h) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        h hVar = new h(this.f11424m, this.f11425n, this.f11426o, this.f11427p, interfaceC1073d);
        hVar.f11423l = obj;
        return hVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        y.J(obj);
        InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f11423l;
        i iVar = this.f11424m;
        B.r(interfaceC0328z, null, 0, new C1376f(iVar, this.f11425n, this.f11426o, null), 3);
        return B.r(interfaceC0328z, null, 0, new g(iVar, this.f11427p, null), 3);
    }
}
