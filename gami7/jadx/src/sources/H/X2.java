package H;

import c0.AbstractC0571K;
import e0.InterfaceC0654d;
import m.C0848v;

/* loaded from: classes.dex */
public abstract class X2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2154a;

    /* renamed from: b, reason: collision with root package name */
    public static final V.o f2155b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2156c = 240;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2157d = I.o.f3721a;

    static {
        float f3 = 10;
        f2154a = f3;
        f2155b = androidx.compose.foundation.layout.a.k(A0.m.b(androidx.compose.ui.layout.a.b(V.l.f5857b, C0121i0.f2717n), true, C0200u.f3141B), 0.0f, f3, 1);
        new C0848v(0.2f, 0.0f, 0.8f, 1.0f);
        new C0848v(0.4f, 0.0f, 1.0f, 1.0f);
        new C0848v(0.0f, 0.0f, 0.65f, 1.0f);
        new C0848v(0.1f, 0.0f, 0.45f, 1.0f);
        new C0848v(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(y2.a r24, V.o r25, long r26, long r28, int r30, J.C0285q r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.X2.a(y2.a, V.o, long, long, int, J.q, int, int):void");
    }

    public static final void b(InterfaceC0654d interfaceC0654d, float f3, long j3, float f4, int i2) {
        float d3 = b0.f.d(interfaceC0654d.e());
        float b3 = b0.f.b(interfaceC0654d.e());
        float f5 = 2;
        float f6 = b3 / f5;
        boolean z3 = interfaceC0654d.getLayoutDirection() == O0.k.f5148h;
        float f7 = (z3 ? 0.0f : 1.0f - f3) * d3;
        float f8 = (z3 ? f3 : 1.0f) * d3;
        if (AbstractC0571K.o(i2, 0) || b3 > d3) {
            interfaceC0654d.v(j3, K1.f.e(f7, f6), K1.f.e(f8, f6), f4, (r22 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
            return;
        }
        float f9 = f4 / f5;
        E2.a aVar = new E2.a(f9, d3 - f9);
        float floatValue = ((Number) B1.C.E(Float.valueOf(f7), aVar)).floatValue();
        float floatValue2 = ((Number) B1.C.E(Float.valueOf(f8), aVar)).floatValue();
        if (Math.abs(f3 - 0.0f) > 0.0f) {
            interfaceC0654d.v(j3, K1.f.e(floatValue, f6), K1.f.e(floatValue2, f6), f4, (r22 & 16) != 0 ? 0 : i2, 1.0f, null, 3);
        }
    }
}
