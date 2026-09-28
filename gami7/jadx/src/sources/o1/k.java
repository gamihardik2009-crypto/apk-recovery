package o1;

import J.W0;
import J2.InterfaceC0328z;
import java.util.List;
import java.util.Set;
import m2.C0880v;
import n1.C0945f;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class k extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W0 f9251l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f9252m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T.r f9253n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(W0 w02, o oVar, T.r rVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9251l = w02;
        this.f9252m = oVar;
        this.f9253n = rVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        k kVar = (k) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        kVar.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new k(this.f9251l, this.f9252m, this.f9253n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        for (C0945f c0945f : (Set) this.f9251l.getValue()) {
            o oVar = this.f9252m;
            if (!((List) oVar.b().f9048e.f4811h.getValue()).contains(c0945f) && !this.f9253n.contains(c0945f)) {
                oVar.b().b(c0945f);
            }
        }
        return C0880v.f8657a;
    }
}
