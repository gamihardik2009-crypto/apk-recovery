package androidx.compose.ui.graphics;

import V.o;
import c0.AbstractC0562B;
import c0.AbstractC0571K;
import c0.C0580U;
import c0.InterfaceC0576P;
import y2.c;

/* loaded from: classes.dex */
public abstract class a {
    public static final o a(o oVar, c cVar) {
        return oVar.k(new BlockGraphicsLayerElement(cVar));
    }

    public static o b(o oVar, float f3, float f4, float f5, float f6, float f7, InterfaceC0576P interfaceC0576P, boolean z3, int i2) {
        float f8 = (i2 & 1) != 0 ? 1.0f : f3;
        float f9 = (i2 & 2) != 0 ? 1.0f : f4;
        float f10 = (i2 & 4) != 0 ? 1.0f : f5;
        float f11 = (i2 & 32) != 0 ? 0.0f : f6;
        float f12 = (i2 & 256) != 0 ? 0.0f : f7;
        long j3 = C0580U.f7240b;
        InterfaceC0576P interfaceC0576P2 = (i2 & 2048) != 0 ? AbstractC0571K.f7193a : interfaceC0576P;
        boolean z4 = (i2 & 4096) != 0 ? false : z3;
        long j4 = AbstractC0562B.f7181a;
        return oVar.k(new GraphicsLayerElement(f8, f9, f10, 0.0f, 0.0f, f11, 0.0f, 0.0f, f12, 8.0f, j3, interfaceC0576P2, z4, j4, j4, 0));
    }
}
