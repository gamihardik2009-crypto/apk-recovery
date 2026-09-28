package c0;

import java.util.Arrays;

/* renamed from: c0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565E {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f7188a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j3, float[] fArr) {
        float d3 = b0.c.d(j3);
        float e3 = b0.c.e(j3);
        float f3 = 1 / (((fArr[7] * e3) + (fArr[3] * d3)) + fArr[15]);
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            f3 = 0.0f;
        }
        return K1.f.e(((fArr[4] * e3) + (fArr[0] * d3) + fArr[12]) * f3, ((fArr[5] * e3) + (fArr[1] * d3) + fArr[13]) * f3);
    }

    public static final void c(float[] fArr, b0.b bVar) {
        long b3 = b(K1.f.e(bVar.f7054a, bVar.f7055b), fArr);
        long b4 = b(K1.f.e(bVar.f7054a, bVar.f7057d), fArr);
        long b5 = b(K1.f.e(bVar.f7056c, bVar.f7055b), fArr);
        long b6 = b(K1.f.e(bVar.f7056c, bVar.f7057d), fArr);
        bVar.f7054a = Math.min(Math.min(b0.c.d(b3), b0.c.d(b4)), Math.min(b0.c.d(b5), b0.c.d(b6)));
        bVar.f7055b = Math.min(Math.min(b0.c.e(b3), b0.c.e(b4)), Math.min(b0.c.e(b5), b0.c.e(b6)));
        bVar.f7056c = Math.max(Math.max(b0.c.d(b3), b0.c.d(b4)), Math.max(b0.c.d(b5), b0.c.d(b6)));
        bVar.f7057d = Math.max(Math.max(b0.c.e(b3), b0.c.e(b4)), Math.max(b0.c.e(b5), b0.c.e(b6)));
    }

    public static final void d(float[] fArr) {
        int i2 = 0;
        while (i2 < 4) {
            int i3 = 0;
            while (i3 < 4) {
                fArr[(i3 * 4) + i2] = i2 == i3 ? 1.0f : 0.0f;
                i3++;
            }
            i2++;
        }
    }

    public static final void e(float[] fArr, float f3) {
        double d3 = (f3 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d3);
        float sin = (float) Math.sin(d3);
        float f4 = fArr[0];
        float f5 = fArr[4];
        float f6 = (sin * f5) + (cos * f4);
        float f7 = -sin;
        float f8 = fArr[1];
        float f9 = fArr[5];
        float f10 = (sin * f9) + (cos * f8);
        float f11 = fArr[2];
        float f12 = fArr[6];
        float f13 = (sin * f12) + (cos * f11);
        float f14 = fArr[3];
        float f15 = fArr[7];
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = f13;
        fArr[3] = (sin * f15) + (cos * f14);
        fArr[4] = (f5 * cos) + (f4 * f7);
        fArr[5] = (f9 * cos) + (f8 * f7);
        fArr[6] = (f12 * cos) + (f11 * f7);
        fArr[7] = (cos * f15) + (f7 * f14);
    }

    public static final void f(float f3, float f4, float f5, float[] fArr) {
        fArr[0] = fArr[0] * f3;
        fArr[1] = fArr[1] * f3;
        fArr[2] = fArr[2] * f3;
        fArr[3] = fArr[3] * f3;
        fArr[4] = fArr[4] * f4;
        fArr[5] = fArr[5] * f4;
        fArr[6] = fArr[6] * f4;
        fArr[7] = fArr[7] * f4;
        fArr[8] = fArr[8] * f5;
        fArr[9] = fArr[9] * f5;
        fArr[10] = fArr[10] * f5;
        fArr[11] = fArr[11] * f5;
    }

    public static final void g(float[] fArr, float[] fArr2) {
        float j3 = AbstractC0571K.j(fArr, 0, fArr2, 0);
        float j4 = AbstractC0571K.j(fArr, 0, fArr2, 1);
        float j5 = AbstractC0571K.j(fArr, 0, fArr2, 2);
        float j6 = AbstractC0571K.j(fArr, 0, fArr2, 3);
        float j7 = AbstractC0571K.j(fArr, 1, fArr2, 0);
        float j8 = AbstractC0571K.j(fArr, 1, fArr2, 1);
        float j9 = AbstractC0571K.j(fArr, 1, fArr2, 2);
        float j10 = AbstractC0571K.j(fArr, 1, fArr2, 3);
        float j11 = AbstractC0571K.j(fArr, 2, fArr2, 0);
        float j12 = AbstractC0571K.j(fArr, 2, fArr2, 1);
        float j13 = AbstractC0571K.j(fArr, 2, fArr2, 2);
        float j14 = AbstractC0571K.j(fArr, 2, fArr2, 3);
        float j15 = AbstractC0571K.j(fArr, 3, fArr2, 0);
        float j16 = AbstractC0571K.j(fArr, 3, fArr2, 1);
        float j17 = AbstractC0571K.j(fArr, 3, fArr2, 2);
        float j18 = AbstractC0571K.j(fArr, 3, fArr2, 3);
        fArr[0] = j3;
        fArr[1] = j4;
        fArr[2] = j5;
        fArr[3] = j6;
        fArr[4] = j7;
        fArr[5] = j8;
        fArr[6] = j9;
        fArr[7] = j10;
        fArr[8] = j11;
        fArr[9] = j12;
        fArr[10] = j13;
        fArr[11] = j14;
        fArr[12] = j15;
        fArr[13] = j16;
        fArr[14] = j17;
        fArr[15] = j18;
    }

    public static final void h(float f3, float f4, float f5, float[] fArr) {
        float f6 = (fArr[8] * f5) + (fArr[4] * f4) + (fArr[0] * f3) + fArr[12];
        float f7 = (fArr[9] * f5) + (fArr[5] * f4) + (fArr[1] * f3) + fArr[13];
        float f8 = (fArr[10] * f5) + (fArr[6] * f4) + (fArr[2] * f3) + fArr[14];
        float f9 = (fArr[11] * f5) + (fArr[7] * f4) + (fArr[3] * f3) + fArr[15];
        fArr[12] = f6;
        fArr[13] = f7;
        fArr[14] = f8;
        fArr[15] = f9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0565E) {
            return z2.h.a(this.f7188a, ((C0565E) obj).f7188a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7188a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f7188a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return H2.f.N(sb.toString());
    }
}
