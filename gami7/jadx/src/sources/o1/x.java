package o1;

import J.W0;
import J2.InterfaceC0328z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m.p0;
import m2.C0880v;
import n1.C0945f;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class x extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p0 f9306l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map f9307m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W0 f9308n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f9309o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p0 p0Var, Map map, W0 w02, i iVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9306l = p0Var;
        this.f9307m = map;
        this.f9308n = w02;
        this.f9309o = iVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        x xVar = (x) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        xVar.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new x(this.f9306l, this.f9307m, this.f9308n, this.f9309o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        p0 p0Var = this.f9306l;
        if (z2.h.a(p0Var.f8547a.g(), p0Var.f8550d.getValue())) {
            Iterator it = ((List) this.f9308n.getValue()).iterator();
            while (it.hasNext()) {
                this.f9309o.b().b((C0945f) it.next());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f9307m;
            for (Map.Entry entry : map.entrySet()) {
                if (!z2.h.a(entry.getKey(), ((C0945f) r7.getValue()).f9032m)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                map.remove(((Map.Entry) it2.next()).getKey());
            }
        }
        return C0880v.f8657a;
    }
}
