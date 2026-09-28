package B;

import android.view.inputmethod.CursorAnchorInfo;

/* loaded from: classes.dex */
public abstract class o {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C0.H h2, b0.d dVar) {
        if (!dVar.f()) {
            int c3 = h2.f462b.c(dVar.f7061b);
            float f3 = dVar.f7063d;
            C0.o oVar = h2.f462b;
            int c4 = oVar.c(f3);
            if (c3 <= c4) {
                while (true) {
                    builder.addVisibleLineBounds(h2.f(c3), oVar.d(c3), h2.g(c3), oVar.b(c3));
                    if (c3 == c4) {
                        break;
                    }
                    c3++;
                }
            }
        }
        return builder;
    }
}
