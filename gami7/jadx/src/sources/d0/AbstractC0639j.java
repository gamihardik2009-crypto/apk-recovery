package d0;

/* renamed from: d0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0639j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0648s f7427a = new C0648s(0.31006f, 0.31616f);

    /* renamed from: b, reason: collision with root package name */
    public static final C0648s f7428b = new C0648s(0.34567f, 0.3585f);

    /* renamed from: c, reason: collision with root package name */
    public static final C0648s f7429c = new C0648s(0.32168f, 0.33767f);

    /* renamed from: d, reason: collision with root package name */
    public static final C0648s f7430d = new C0648s(0.31271f, 0.32902f);

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f7431e = {0.964212f, 1.0f, 0.825188f};

    public static AbstractC0632c a(AbstractC0632c abstractC0632c) {
        C0648s c0648s = f7428b;
        C0630a c0630a = C0630a.f7389b;
        if (!AbstractC0631b.a(abstractC0632c.f7397b, AbstractC0631b.f7391a)) {
            return abstractC0632c;
        }
        C0646q c0646q = (C0646q) abstractC0632c;
        C0648s c0648s2 = c0646q.f7446d;
        if (d(c0648s2, c0648s)) {
            return abstractC0632c;
        }
        float[] a3 = c0648s.a();
        return new C0646q(c0646q.f7396a, c0646q.f7450h, c0648s, h(c(c0630a.f7390a, c0648s2.a(), a3), c0646q.f7451i), c0646q.f7453k, c0646q.f7456n, c0646q.f7447e, c0646q.f7448f, c0646q.f7449g, -1);
    }

    public static float b(float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = (((((f5 * f8) + ((f4 * f7) + (f3 * f6))) - (f6 * f7)) - (f4 * f5)) - (f3 * f8)) * 0.5f;
        return f9 < 0.0f ? -f9 : f9;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        j(fArr, fArr2);
        j(fArr, fArr3);
        return h(g(fArr), i(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final boolean d(C0648s c0648s, C0648s c0648s2) {
        if (c0648s == c0648s2) {
            return true;
        }
        return Math.abs(c0648s.f7466a - c0648s2.f7466a) < 0.001f && Math.abs(c0648s.f7467b - c0648s2.f7467b) < 0.001f;
    }

    public static final C0636g e(AbstractC0632c abstractC0632c, AbstractC0632c abstractC0632c2, int i2) {
        if (abstractC0632c == abstractC0632c2) {
            return new C0634e(abstractC0632c, abstractC0632c, 1);
        }
        long j3 = AbstractC0631b.f7391a;
        return (AbstractC0631b.a(abstractC0632c.f7397b, j3) && AbstractC0631b.a(abstractC0632c2.f7397b, j3)) ? new C0635f((C0646q) abstractC0632c, (C0646q) abstractC0632c2, i2) : new C0636g(abstractC0632c, abstractC0632c2, i2);
    }

    public static float f(float f3, float f4, float f5, float f6) {
        return (f3 * f6) - (f4 * f5);
    }

    public static final float[] g(float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[3];
        float f5 = fArr[6];
        float f6 = fArr[1];
        float f7 = fArr[4];
        float f8 = fArr[7];
        float f9 = fArr[2];
        float f10 = fArr[5];
        float f11 = fArr[8];
        float f12 = (f7 * f11) - (f8 * f10);
        float f13 = (f8 * f9) - (f6 * f11);
        float f14 = (f6 * f10) - (f7 * f9);
        float f15 = (f5 * f14) + (f4 * f13) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f12 / f15;
        fArr2[1] = f13 / f15;
        fArr2[2] = f14 / f15;
        fArr2[3] = ((f5 * f10) - (f4 * f11)) / f15;
        fArr2[4] = ((f11 * f3) - (f5 * f9)) / f15;
        fArr2[5] = ((f9 * f4) - (f10 * f3)) / f15;
        fArr2[6] = ((f4 * f8) - (f5 * f7)) / f15;
        fArr2[7] = ((f5 * f6) - (f8 * f3)) / f15;
        fArr2[8] = ((f3 * f7) - (f4 * f6)) / f15;
        return fArr2;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        float f3 = fArr[0];
        float f4 = fArr2[0];
        float f5 = fArr[3];
        float f6 = fArr2[1];
        float f7 = fArr[6];
        float f8 = fArr2[2];
        float f9 = (f7 * f8) + (f5 * f6) + (f3 * f4);
        float f10 = fArr[1];
        float f11 = fArr[4];
        float f12 = fArr[7];
        float f13 = (f12 * f8) + (f11 * f6) + (f10 * f4);
        float f14 = fArr[2];
        float f15 = fArr[5];
        float f16 = fArr[8];
        float f17 = (f8 * f16) + (f6 * f15) + (f4 * f14);
        float f18 = fArr2[3];
        float f19 = fArr2[4];
        float f20 = fArr2[5];
        float f21 = (f7 * f20) + (f5 * f19) + (f3 * f18);
        float f22 = (f12 * f20) + (f11 * f19) + (f10 * f18);
        float f23 = (f20 * f16) + (f19 * f15) + (f18 * f14);
        float f24 = fArr2[6];
        float f25 = fArr2[7];
        float f26 = (f5 * f25) + (f3 * f24);
        float f27 = fArr2[8];
        return new float[]{f9, f13, f17, f21, f22, f23, (f7 * f27) + f26, (f12 * f27) + (f11 * f25) + (f10 * f24), (f16 * f27) + (f15 * f25) + (f14 * f24)};
    }

    public static final float[] i(float[] fArr, float[] fArr2) {
        float f3 = fArr[0];
        float f4 = fArr2[0] * f3;
        float f5 = fArr[1];
        float f6 = fArr2[1] * f5;
        float f7 = fArr[2];
        return new float[]{f4, f6, fArr2[2] * f7, fArr2[3] * f3, fArr2[4] * f5, fArr2[5] * f7, f3 * fArr2[6], f5 * fArr2[7], f7 * fArr2[8]};
    }

    public static final void j(float[] fArr, float[] fArr2) {
        float f3 = fArr2[0];
        float f4 = fArr2[1];
        float f5 = fArr2[2];
        fArr2[0] = (fArr[6] * f5) + (fArr[3] * f4) + (fArr[0] * f3);
        fArr2[1] = (fArr[7] * f5) + (fArr[4] * f4) + (fArr[1] * f3);
        fArr2[2] = (fArr[8] * f5) + (fArr[5] * f4) + (fArr[2] * f3);
    }
}
