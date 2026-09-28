package androidx.compose.foundation;

import A0.h;
import V.o;
import c0.AbstractC0571K;
import c0.C0564D;
import c0.InterfaceC0576P;
import n.C0883B;
import n.C0912u;
import n.T;
import r.l;

/* loaded from: classes.dex */
public abstract class a {
    public static o a(o oVar, C0564D c0564d) {
        return oVar.k(new BackgroundElement(0L, c0564d, 1.0f, AbstractC0571K.f7193a, 1));
    }

    public static final o b(o oVar, long j3, InterfaceC0576P interfaceC0576P) {
        return oVar.k(new BackgroundElement(j3, null, 1.0f, interfaceC0576P, 2));
    }

    public static final o c(o oVar, l lVar, T t3, boolean z3, String str, h hVar, y2.a aVar) {
        o k3;
        if (t3 instanceof C0883B) {
            k3 = new ClickableElement(lVar, (C0883B) t3, z3, str, hVar, aVar);
        } else if (t3 == null) {
            k3 = new ClickableElement(lVar, null, z3, str, hVar, aVar);
        } else {
            V.l lVar2 = V.l.f5857b;
            k3 = lVar != null ? d.a(lVar2, lVar, t3).k(new ClickableElement(lVar, null, z3, str, hVar, aVar)) : V.a.b(lVar2, new b(t3, z3, str, hVar, aVar));
        }
        return oVar.k(k3);
    }

    public static /* synthetic */ o d(o oVar, l lVar, G.e eVar, boolean z3, h hVar, y2.a aVar, int i2) {
        if ((i2 & 16) != 0) {
            hVar = null;
        }
        return c(oVar, lVar, eVar, z3, null, hVar, aVar);
    }

    public static o e(o oVar, boolean z3, String str, y2.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            z3 = true;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return V.a.b(oVar, new C0912u(z3, str, null, aVar));
    }

    public static o f(o oVar, l lVar) {
        return oVar.k(new HoverableElement(lVar));
    }
}
