package G2;

import B.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.AbstractC0962n;
import n2.C0970v;

/* loaded from: classes.dex */
public abstract class i extends j {
    public static g g0(Iterator it) {
        z2.h.f(it, "<this>");
        k kVar = new k(0, it);
        return kVar instanceof a ? kVar : new a(kVar);
    }

    public static Object h0(d dVar) {
        c cVar = new c(dVar);
        if (cVar.hasNext()) {
            return cVar.next();
        }
        return null;
    }

    public static g i0(Object obj, y2.c cVar) {
        return obj == null ? b.f1248a : new f(new y(6, obj), cVar, 0);
    }

    public static d j0(g gVar, y2.c cVar) {
        return new d(new d(gVar, cVar, 2));
    }

    public static List k0(g gVar) {
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return C0970v.f9165h;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0962n.l(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
