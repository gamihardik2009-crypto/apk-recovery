package c0;

import d0.AbstractC0632c;
import d0.AbstractC0637h;
import d0.AbstractC0639j;
import d0.C0633d;
import d0.C0636g;
import j.C0761q;

/* renamed from: c0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603v {

    /* renamed from: b, reason: collision with root package name */
    public static final long f7272b = AbstractC0571K.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f7273c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f7274d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f7275e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f7276f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f7277g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f7278h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f7279a;

    static {
        AbstractC0571K.d(4282664004L);
        AbstractC0571K.d(4287137928L);
        AbstractC0571K.d(4291611852L);
        f7273c = AbstractC0571K.d(4294967295L);
        f7274d = AbstractC0571K.d(4294901760L);
        AbstractC0571K.d(4278255360L);
        f7275e = AbstractC0571K.d(4278190335L);
        AbstractC0571K.d(4294967040L);
        AbstractC0571K.d(4278255615L);
        AbstractC0571K.d(4294902015L);
        f7276f = AbstractC0571K.c(0);
        f7277g = AbstractC0571K.b(0.0f, 0.0f, 0.0f, 0.0f, C0633d.f7416s);
    }

    public /* synthetic */ C0603v(long j3) {
        this.f7279a = j3;
    }

    public static final long a(long j3, AbstractC0632c abstractC0632c) {
        C0636g c0636g;
        AbstractC0632c f3 = f(j3);
        int i2 = f3.f7398c;
        int i3 = abstractC0632c.f7398c;
        if ((i2 | i3) < 0) {
            c0636g = AbstractC0639j.e(f3, abstractC0632c, 0);
        } else {
            C0761q c0761q = AbstractC0637h.f7426a;
            int i4 = i2 | (i3 << 6);
            Object e3 = c0761q.e(i4);
            if (e3 == null) {
                e3 = AbstractC0639j.e(f3, abstractC0632c, 0);
                c0761q.g(i4, e3);
            }
            c0636g = (C0636g) e3;
        }
        return c0636g.a(j3);
    }

    public static long b(float f3, long j3) {
        return AbstractC0571K.b(h(j3), g(j3), e(j3), f3, f(j3));
    }

    public static final boolean c(long j3, long j4) {
        return j3 == j4;
    }

    public static final float d(long j3) {
        float T3;
        float f3;
        if ((63 & j3) == 0) {
            T3 = (float) K1.f.T((j3 >>> 56) & 255);
            f3 = 255.0f;
        } else {
            T3 = (float) K1.f.T((j3 >>> 6) & 1023);
            f3 = 1023.0f;
        }
        return T3 / f3;
    }

    public static final float e(long j3) {
        int i2;
        int i3;
        int i4;
        if ((63 & j3) == 0) {
            return ((float) K1.f.T((j3 >>> 32) & 255)) / 255.0f;
        }
        short s3 = (short) ((j3 >>> 16) & 65535);
        int i5 = 32768 & s3;
        int i6 = ((65535 & s3) >>> 10) & 31;
        int i7 = s3 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - AbstractC0607z.f7284a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final AbstractC0632c f(long j3) {
        float[] fArr = C0633d.f7399a;
        return C0633d.f7418u[(int) (j3 & 63)];
    }

    public static final float g(long j3) {
        int i2;
        int i3;
        int i4;
        if ((63 & j3) == 0) {
            return ((float) K1.f.T((j3 >>> 40) & 255)) / 255.0f;
        }
        short s3 = (short) ((j3 >>> 32) & 65535);
        int i5 = 32768 & s3;
        int i6 = ((65535 & s3) >>> 10) & 31;
        int i7 = s3 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - AbstractC0607z.f7284a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j3) {
        int i2;
        int i3;
        int i4;
        if ((63 & j3) == 0) {
            return ((float) K1.f.T((j3 >>> 48) & 255)) / 255.0f;
        }
        short s3 = (short) ((j3 >>> 48) & 65535);
        int i5 = 32768 & s3;
        int i6 = ((65535 & s3) >>> 10) & 31;
        int i7 = s3 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - AbstractC0607z.f7284a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j3) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j3));
        sb.append(", ");
        sb.append(g(j3));
        sb.append(", ");
        sb.append(e(j3));
        sb.append(", ");
        sb.append(d(j3));
        sb.append(", ");
        return B1.t.k(sb, f(j3).f7396a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0603v) {
            return this.f7279a == ((C0603v) obj).f7279a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7279a);
    }

    public final String toString() {
        return i(this.f7279a);
    }
}
