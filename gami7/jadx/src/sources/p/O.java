package p;

import H.P3;
import androidx.compose.foundation.gestures.DraggableElement;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final N f9476a = new N(3, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final N f9477b = new N(3, null, 1);

    public static V.o a(P3 p3, X x2, boolean z3, r.l lVar, boolean z4, y2.f fVar, boolean z5, int i2) {
        return new DraggableElement(p3, x2, (i2 & 4) != 0 ? true : z3, (i2 & 8) != 0 ? null : lVar, (i2 & 16) != 0 ? false : z4, f9476a, fVar, (i2 & 128) != 0 ? false : z5);
    }
}
