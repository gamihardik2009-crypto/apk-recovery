package d0;

import c0.AbstractC0571K;

/* renamed from: d0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641l extends AbstractC0632c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f7433d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f7434e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f7435f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f7436g;

    static {
        float[] h2 = AbstractC0639j.h(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC0639j.c(C0630a.f7389b.f7390a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f7433d = h2;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f7434e = fArr;
        f7435f = AbstractC0639j.g(h2);
        f7436g = AbstractC0639j.g(fArr);
    }

    @Override // d0.AbstractC0632c
    public final float a(int i2) {
        return i2 == 0 ? 1.0f : 0.5f;
    }

    @Override // d0.AbstractC0632c
    public final float b(int i2) {
        return i2 == 0 ? 0.0f : -0.5f;
    }

    @Override // d0.AbstractC0632c
    public final long d(float f3, float f4, float f5) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 > 0.5f) {
            f4 = 0.5f;
        }
        if (f5 < -0.5f) {
            f5 = -0.5f;
        }
        float f6 = f5 <= 0.5f ? f5 : 0.5f;
        float[] fArr = f7436g;
        float f7 = (fArr[6] * f6) + (fArr[3] * f4) + (fArr[0] * f3);
        float f8 = (fArr[7] * f6) + (fArr[4] * f4) + (fArr[1] * f3);
        float f9 = (fArr[8] * f6) + (fArr[5] * f4) + (fArr[2] * f3);
        float f10 = f8 * f8 * f8;
        float f11 = f9 * f9 * f9;
        float[] fArr2 = f7435f;
        float f12 = (fArr2[6] * f11) + (fArr2[3] * f10) + (fArr2[0] * f7 * f7 * f7);
        return (Float.floatToRawIntBits((fArr2[7] * f11) + (fArr2[4] * f10) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    @Override // d0.AbstractC0632c
    public final float e(float f3, float f4, float f5) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 > 0.5f) {
            f4 = 0.5f;
        }
        if (f5 < -0.5f) {
            f5 = -0.5f;
        }
        float f6 = f5 <= 0.5f ? f5 : 0.5f;
        float[] fArr = f7436g;
        float f7 = (fArr[6] * f6) + (fArr[3] * f4) + (fArr[0] * f3);
        float f8 = (fArr[7] * f6) + (fArr[4] * f4) + (fArr[1] * f3);
        float f9 = (fArr[8] * f6) + (fArr[5] * f4) + (fArr[2] * f3);
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float f12 = f9 * f9 * f9;
        float[] fArr2 = f7435f;
        return (fArr2[8] * f12) + (fArr2[5] * f11) + (fArr2[2] * f10);
    }

    @Override // d0.AbstractC0632c
    public final long f(float f3, float f4, float f5, float f6, AbstractC0632c abstractC0632c) {
        float[] fArr = f7433d;
        float f7 = (fArr[6] * f5) + (fArr[3] * f4) + (fArr[0] * f3);
        float f8 = (fArr[7] * f5) + (fArr[4] * f4) + (fArr[1] * f3);
        float f9 = (fArr[8] * f5) + (fArr[5] * f4) + (fArr[2] * f3);
        float q = B2.a.q(f7);
        float q3 = B2.a.q(f8);
        float q4 = B2.a.q(f9);
        float[] fArr2 = f7434e;
        return AbstractC0571K.b((fArr2[6] * q4) + (fArr2[3] * q3) + (fArr2[0] * q), (fArr2[7] * q4) + (fArr2[4] * q3) + (fArr2[1] * q), (fArr2[8] * q4) + (fArr2[5] * q3) + (fArr2[2] * q), f6, abstractC0632c);
    }
}
