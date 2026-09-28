package androidx.compose.foundation.layout;

import O0.k;
import V.o;
import r0.C1125n;
import s.C1160M;
import s.InterfaceC1159L;

/* loaded from: classes.dex */
public abstract class a {
    public static C1160M a(float f3, int i2) {
        if ((i2 & 1) != 0) {
            f3 = 0;
        }
        float f4 = 0;
        return new C1160M(f3, f4, f3, f4);
    }

    public static final C1160M b(float f3, float f4, float f5, float f6) {
        return new C1160M(f3, f4, f5, f6);
    }

    public static C1160M c(float f3, float f4, float f5, float f6, int i2) {
        if ((i2 & 1) != 0) {
            f3 = 0;
        }
        if ((i2 & 2) != 0) {
            f4 = 0;
        }
        if ((i2 & 4) != 0) {
            f5 = 0;
        }
        if ((i2 & 8) != 0) {
            f6 = 0;
        }
        return new C1160M(f3, f4, f5, f6);
    }

    public static final float d(InterfaceC1159L interfaceC1159L, k kVar) {
        return kVar == k.f5148h ? interfaceC1159L.a(kVar) : interfaceC1159L.b(kVar);
    }

    public static final float e(InterfaceC1159L interfaceC1159L, k kVar) {
        return kVar == k.f5148h ? interfaceC1159L.b(kVar) : interfaceC1159L.a(kVar);
    }

    public static final o f(o oVar, y2.c cVar) {
        return oVar.k(new OffsetPxElement(cVar));
    }

    public static o g(o oVar, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f3 = 0;
        }
        if ((i2 & 2) != 0) {
            f4 = 0;
        }
        return oVar.k(new OffsetElement(f3, f4));
    }

    public static final o h(o oVar, InterfaceC1159L interfaceC1159L) {
        return oVar.k(new PaddingValuesElement(interfaceC1159L));
    }

    public static final o i(o oVar, float f3) {
        return oVar.k(new PaddingElement(f3, f3, f3, f3));
    }

    public static final o j(o oVar, float f3, float f4) {
        return oVar.k(new PaddingElement(f3, f4, f3, f4));
    }

    public static o k(o oVar, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f3 = 0;
        }
        if ((i2 & 2) != 0) {
            f4 = 0;
        }
        return j(oVar, f3, f4);
    }

    public static o l(o oVar, float f3, float f4, float f5, float f6, int i2) {
        if ((i2 & 1) != 0) {
            f3 = 0;
        }
        if ((i2 & 2) != 0) {
            f4 = 0;
        }
        if ((i2 & 4) != 0) {
            f5 = 0;
        }
        if ((i2 & 8) != 0) {
            f6 = 0;
        }
        return oVar.k(new PaddingElement(f3, f4, f5, f6));
    }

    public static o m(C1125n c1125n, float f3, float f4, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        return new AlignmentLineOffsetDpElement(c1125n, f3, f4);
    }

    public static final o n(o oVar) {
        return oVar.k(new IntrinsicWidthElement());
    }
}
