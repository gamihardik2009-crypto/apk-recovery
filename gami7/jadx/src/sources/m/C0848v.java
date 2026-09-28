package m;

import c0.AbstractC0571K;

/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848v implements InterfaceC0851y {

    /* renamed from: a, reason: collision with root package name */
    public final float f8581a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8582b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8583c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8584d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8585e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8586f;

    public C0848v(float f3, float f4, float f5, float f6) {
        int E;
        this.f8581a = f3;
        this.f8582b = f4;
        this.f8583c = f5;
        this.f8584d = f6;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f3 + ", " + f4 + ", " + f5 + ", " + f6 + '.');
        }
        float[] fArr = new float[5];
        float f7 = (f4 - 0.0f) * 3.0f;
        float f8 = (f6 - f4) * 3.0f;
        float f9 = (1.0f - f6) * 3.0f;
        double d3 = f7;
        double d4 = f8;
        double d5 = f9;
        double d6 = d4 * 2.0d;
        double d7 = (d3 - d6) + d5;
        if (d7 == 0.0d) {
            E = d4 == d5 ? 0 : AbstractC0571K.E((float) ((d6 - d5) / (d6 - (d5 * 2.0d))), fArr, 0);
        } else {
            double d8 = -Math.sqrt((d4 * d4) - (d5 * d3));
            double d9 = (-d3) + d4;
            int E3 = AbstractC0571K.E((float) ((-(d8 + d9)) / d7), fArr, 0);
            E = AbstractC0571K.E((float) ((d8 - d9) / d7), fArr, E3) + E3;
            if (E > 1) {
                float f10 = fArr[0];
                float f11 = fArr[1];
                if (f10 > f11) {
                    fArr[0] = f11;
                    fArr[1] = f10;
                } else if (f10 == f11) {
                    E--;
                }
            }
        }
        float f12 = (f8 - f7) * 2.0f;
        int E4 = AbstractC0571K.E((-f12) / (((f9 - f8) * 2.0f) - f12), fArr, E) + E;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i2 = 0; i2 < E4; i2++) {
            float f13 = fArr[i2];
            float f14 = (((((((((f4 - f6) * 3.0f) + 1.0f) - 0.0f) * f13) + (((f6 - (f4 * 2.0f)) + 0.0f) * 3.0f)) * f13) + f7) * f13) + 0.0f;
            min = Math.min(min, f14);
            max = Math.max(max, f14);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f8585e = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f8586f = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e7, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f3, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0213, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0215, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0220, code lost:
    
        if (r2 <= 1.0000008f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r2 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        r2 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019f, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ab, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    @Override // m.InterfaceC0851y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r26) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0848v.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0848v) {
            C0848v c0848v = (C0848v) obj;
            if (this.f8581a == c0848v.f8581a && this.f8582b == c0848v.f8582b && this.f8583c == c0848v.f8583c && this.f8584d == c0848v.f8584d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8584d) + B1.t.c(this.f8583c, B1.t.c(this.f8582b, Float.hashCode(this.f8581a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f8581a);
        sb.append(", b=");
        sb.append(this.f8582b);
        sb.append(", c=");
        sb.append(this.f8583c);
        sb.append(", d=");
        return B1.t.i(sb, this.f8584d, ')');
    }
}
