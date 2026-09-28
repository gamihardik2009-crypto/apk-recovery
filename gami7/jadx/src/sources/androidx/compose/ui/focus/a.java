package androidx.compose.ui.focus;

import V.o;
import a0.C0438o;
import y2.c;

/* loaded from: classes.dex */
public abstract class a {
    public static final o a(C0438o c0438o) {
        return new FocusRequesterElement(c0438o);
    }

    public static final o b(o oVar, c cVar) {
        return oVar.k(new FocusChangedElement(cVar));
    }
}
