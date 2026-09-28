package l;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0793b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f8175a;

    static {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float[] fArr = new float[101];
        f8175a = fArr;
        float[] fArr2 = new float[101];
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i2 = 0; i2 < 100; i2++) {
            float f13 = i2 / 100;
            float f14 = 1.0f;
            while (true) {
                f3 = ((f14 - f11) / 2.0f) + f11;
                f4 = 1.0f - f3;
                f5 = f3 * 3.0f * f4;
                f6 = f3 * f3 * f3;
                float f15 = (((f3 * 0.35000002f) + (f4 * 0.175f)) * f5) + f6;
                if (Math.abs(f15 - f13) < 1.0E-5d) {
                    break;
                } else if (f15 > f13) {
                    f14 = f3;
                } else {
                    f11 = f3;
                }
            }
            float f16 = 0.5f;
            fArr[i2] = (((f4 * 0.5f) + f3) * f5) + f6;
            float f17 = 1.0f;
            while (true) {
                f7 = ((f17 - f12) / 2.0f) + f12;
                f8 = 1.0f - f7;
                f9 = f7 * 3.0f * f8;
                f10 = f7 * f7 * f7;
                float f18 = (((f8 * f16) + f7) * f9) + f10;
                if (Math.abs(f18 - f13) >= 1.0E-5d) {
                    if (f18 > f13) {
                        f17 = f7;
                    } else {
                        f12 = f7;
                    }
                    f16 = 0.5f;
                }
            }
            fArr2[i2] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public static C0792a a(float f3) {
        float f4 = 0.0f;
        float f5 = 1.0f;
        float B3 = B1.C.B(f3, 0.0f, 1.0f);
        float f6 = 100;
        int i2 = (int) (f6 * B3);
        if (i2 < 100) {
            float f7 = i2 / f6;
            int i3 = i2 + 1;
            float f8 = i3 / f6;
            float[] fArr = f8175a;
            float f9 = fArr[i2];
            float f10 = (fArr[i3] - f9) / (f8 - f7);
            float f11 = ((B3 - f7) * f10) + f9;
            f4 = f10;
            f5 = f11;
        }
        return new C0792a(f5, f4);
    }
}
