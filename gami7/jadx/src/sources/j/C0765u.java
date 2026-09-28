package j;

import java.util.NoSuchElementException;
import k.AbstractC0779a;
import n2.AbstractC0959k;

/* renamed from: j.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765u {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8045a = AbstractC0739E.f7971a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8046b = AbstractC0779a.f8103c;

    /* renamed from: c, reason: collision with root package name */
    public float[] f8047c = AbstractC0752h.f8003a;

    /* renamed from: d, reason: collision with root package name */
    public int f8048d;

    /* renamed from: e, reason: collision with root package name */
    public int f8049e;

    /* renamed from: f, reason: collision with root package name */
    public int f8050f;

    public C0765u() {
        d(AbstractC0739E.d(6));
    }

    public final void a() {
        this.f8049e = 0;
        long[] jArr = this.f8045a;
        if (jArr != AbstractC0739E.f7971a) {
            AbstractC0959k.v(jArr);
            long[] jArr2 = this.f8045a;
            int i2 = this.f8048d;
            int i3 = i2 >> 3;
            long j3 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j3)) | j3;
        }
        AbstractC0959k.u(this.f8046b, null, 0, this.f8048d);
        this.f8050f = AbstractC0739E.a(this.f8048d) - this.f8049e;
    }

    public final int b(int i2) {
        int i3 = this.f8048d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f8045a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j3 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j4 = j3 & ((~j3) << 7) & (-9187201950435737472L);
            if (j4 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j4) >> 3)) & i3;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final int c(Object obj) {
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.f8048d;
        int i6 = i3 >>> 7;
        while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.f8045a;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j3 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j4 = (i4 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i7) & i5;
                if (z2.h.a(this.f8046b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
    }

    public final void d(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0739E.c(i2)) : 0;
        this.f8048d = max;
        if (max == 0) {
            jArr = AbstractC0739E.f7971a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0959k.v(jArr);
        }
        this.f8045a = jArr;
        int i3 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j3)) | j3;
        this.f8050f = AbstractC0739E.a(this.f8048d) - this.f8049e;
        this.f8046b = new Object[max];
        this.f8047c = new float[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0765u)) {
            return false;
        }
        C0765u c0765u = (C0765u) obj;
        if (c0765u.f8049e != this.f8049e) {
            return false;
        }
        Object[] objArr = this.f8046b;
        float[] fArr = this.f8047c;
        long[] jArr = this.f8045a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j3) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = objArr[i5];
                            float f3 = fArr[i5];
                            int c3 = c0765u.c(obj2);
                            if (c3 < 0) {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                            }
                            if (f3 != c0765u.f8047c[c3]) {
                                return false;
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f8046b;
        float[] fArr = this.f8047c;
        long[] jArr = this.f8045a;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = objArr[i7];
                            i4 += Float.hashCode(fArr[i7]) ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        return i4;
                    }
                }
                if (i3 == length) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public final String toString() {
        if (this.f8049e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f8046b;
        float[] fArr = this.f8047c;
        long[] jArr = this.f8045a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            int i6 = (i2 << 3) + i5;
                            Object obj = objArr[i6];
                            float f3 = fArr[i6];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f3);
                            i3++;
                            if (i3 < this.f8049e) {
                                sb.append(", ");
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        z2.h.e(sb2, "s.append('}').toString()");
        return sb2;
    }
}
