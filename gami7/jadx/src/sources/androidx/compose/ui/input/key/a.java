package androidx.compose.ui.input.key;

import V.o;
import y2.c;

/* loaded from: classes.dex */
public abstract class a {
    public static final o a(c cVar) {
        return new KeyInputElement(cVar, null);
    }

    public static final o b(o oVar, c cVar) {
        return oVar.k(new KeyInputElement(null, cVar));
    }
}
