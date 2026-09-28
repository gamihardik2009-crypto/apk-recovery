package G;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class n extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1173l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f1174m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1174m = oVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((n) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        n nVar = new n(this.f1174m, interfaceC1073d);
        nVar.f1173l = obj;
        return nVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        return J2.B.r((InterfaceC0328z) this.f1173l, null, 0, new m(this.f1174m, null), 3);
    }
}
