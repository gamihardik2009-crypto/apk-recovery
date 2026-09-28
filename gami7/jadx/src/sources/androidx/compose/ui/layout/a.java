package androidx.compose.ui.layout;

import V.o;
import r0.C1130s;
import r0.InterfaceC1093G;
import y2.c;
import y2.f;

/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(InterfaceC1093G interfaceC1093G) {
        Object p3 = interfaceC1093G.p();
        C1130s c1130s = p3 instanceof C1130s ? (C1130s) p3 : null;
        if (c1130s != null) {
            return c1130s.f9887u;
        }
        return null;
    }

    public static final o b(o oVar, f fVar) {
        return oVar.k(new LayoutElement(fVar));
    }

    public static final o c(o oVar, Object obj) {
        return oVar.k(new LayoutIdElement(obj));
    }

    public static final o d(o oVar, c cVar) {
        return oVar.k(new OnGloballyPositionedElement(cVar));
    }

    public static final o e(o oVar, c cVar) {
        return oVar.k(new OnSizeChangedModifier(cVar));
    }
}
