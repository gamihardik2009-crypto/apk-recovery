package s;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public static final T f10079a = new T();

    public static V.o a(T t3, V.o oVar) {
        t3.getClass();
        if (1.0f > 0.0d) {
            return oVar.k(new LayoutWeightElement(B1.C.z(1.0f, Float.MAX_VALUE), true));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
