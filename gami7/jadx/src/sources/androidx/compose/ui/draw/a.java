package androidx.compose.ui.draw;

import V.b;
import V.o;
import c0.C0594m;
import i0.C0706A;
import r0.C1122k;
import y2.c;

/* loaded from: classes.dex */
public abstract class a {
    public static final o a(o oVar, c cVar) {
        return oVar.k(new DrawBehindElement(cVar));
    }

    public static final o b(o oVar, c cVar) {
        return oVar.k(new DrawWithCacheElement(cVar));
    }

    public static final o c(o oVar, c cVar) {
        return oVar.k(new DrawWithContentElement(cVar));
    }

    public static o d(o oVar, C0706A c0706a, C0594m c0594m) {
        return oVar.k(new PainterElement(c0706a, true, b.f5835l, C1122k.f9874a, 1.0f, c0594m));
    }
}
