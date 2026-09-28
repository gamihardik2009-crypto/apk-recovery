package androidx.compose.foundation.selection;

import A0.h;
import G.e;
import V.o;
import androidx.compose.foundation.d;
import n.C0883B;
import n.T;
import r.l;

/* loaded from: classes.dex */
public abstract class b {
    public static final o a(o oVar, boolean z3, l lVar, T t3, boolean z4, h hVar, y2.a aVar) {
        o k3;
        if (t3 instanceof C0883B) {
            k3 = new SelectableElement(z3, lVar, (C0883B) t3, z4, hVar, aVar);
        } else if (t3 == null) {
            k3 = new SelectableElement(z3, lVar, null, z4, hVar, aVar);
        } else {
            V.l lVar2 = V.l.f5857b;
            k3 = lVar != null ? d.a(lVar2, lVar, t3).k(new SelectableElement(z3, lVar, null, z4, hVar, aVar)) : V.a.b(lVar2, new a(t3, z3, z4, hVar, aVar));
        }
        return oVar.k(k3);
    }

    public static final o b(boolean z3, l lVar, boolean z4, h hVar, y2.c cVar) {
        return new ToggleableElement(z3, lVar, z4, hVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o c(B0.a aVar, l lVar, e eVar, boolean z3, h hVar, y2.a aVar2) {
        if (eVar instanceof C0883B) {
            return new TriStateToggleableElement(aVar, lVar, (C0883B) eVar, z3, hVar, aVar2);
        }
        if (eVar == 0) {
            return new TriStateToggleableElement(aVar, lVar, null, z3, hVar, aVar2);
        }
        V.l lVar2 = V.l.f5857b;
        return lVar != null ? d.a(lVar2, lVar, eVar).k(new TriStateToggleableElement(aVar, lVar, null, z3, hVar, aVar2)) : V.a.b(lVar2, new c(eVar, aVar, z3, hVar, aVar2));
    }
}
