package j;

import java.util.NoSuchElementException;
import k.AbstractC0779a;
import n2.AbstractC0959k;

/* renamed from: j.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766v {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8051a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8052b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f8053c;

    /* renamed from: d, reason: collision with root package name */
    public int f8054d;

    /* renamed from: e, reason: collision with root package name */
    public int f8055e;

    /* renamed from: f, reason: collision with root package name */
    public int f8056f;

    public C0766v(int i2) {
        this.f8051a = AbstractC0739E.f7971a;
        this.f8052b = AbstractC0779a.f8103c;
        this.f8053c = AbstractC0755k.f8006a;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        f(AbstractC0739E.d(i2));
    }

    public final boolean a(String str) {
        return d(str) >= 0;
    }

    public final int b(int i2) {
        int i3 = this.f8054d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f8051a;
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
        long j3;
        long[] jArr;
        Object[] objArr;
        long j4;
        long[] jArr2;
        int i2;
        int i3 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f8054d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.f8051a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j5 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j6 = i6;
            int i12 = i6;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int numberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j8) >> 3)) & i7;
                if (z2.h.a(this.f8052b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int b3 = b(i5);
                long j9 = 255;
                if (this.f8056f != 0 || ((this.f8051a[b3 >> 3] >> ((b3 & 7) << 3)) & 255) == 254) {
                    j3 = j6;
                } else {
                    int i13 = this.f8054d;
                    if (i13 <= 8 || Long.compareUnsigned(this.f8055e * 32, i13 * 25) > 0) {
                        int b4 = AbstractC0739E.b(this.f8054d);
                        long[] jArr4 = this.f8051a;
                        Object[] objArr2 = this.f8052b;
                        int[] iArr = this.f8053c;
                        int i14 = this.f8054d;
                        f(b4);
                        Object[] objArr3 = this.f8052b;
                        int[] iArr2 = this.f8053c;
                        int i15 = 0;
                        while (i15 < i14) {
                            if (((jArr4[i15 >> 3] >> ((i15 & 7) << 3)) & j9) < 128) {
                                Object obj2 = objArr2[i15];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i3;
                                int i16 = hashCode2 ^ (hashCode2 << 16);
                                int b5 = b(i16 >>> 7);
                                long j10 = i16 & 127;
                                long[] jArr5 = this.f8051a;
                                int i17 = b5 >> 3;
                                int i18 = (b5 & 7) << 3;
                                jArr = jArr4;
                                objArr = objArr2;
                                jArr5[i17] = (jArr5[i17] & (~(255 << i18))) | (j10 << i18);
                                int i19 = this.f8054d;
                                int i20 = ((b5 - 7) & i19) + (i19 & 7);
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                j4 = j6;
                                jArr5[i21] = (j10 << i22) | (jArr5[i21] & (~(255 << i22)));
                                objArr3[b5] = obj2;
                                iArr2[b5] = iArr[i15];
                            } else {
                                jArr = jArr4;
                                objArr = objArr2;
                                j4 = j6;
                            }
                            i15++;
                            jArr4 = jArr;
                            j6 = j4;
                            objArr2 = objArr;
                            i3 = -862048943;
                            j9 = 255;
                        }
                    } else {
                        long[] jArr6 = this.f8051a;
                        int i23 = this.f8054d;
                        int i24 = 0;
                        int i25 = 0;
                        while (i24 < i23) {
                            int i26 = i24 >> 3;
                            int i27 = (i24 & 7) << 3;
                            if (((jArr6[i26] >> i27) & 255) == 254) {
                                long[] jArr7 = this.f8051a;
                                jArr7[i26] = (jArr7[i26] & (~(255 << i27))) | (128 << i27);
                                int i28 = this.f8054d;
                                int i29 = ((i24 - 7) & i28) + (i28 & 7);
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                jArr2 = jArr6;
                                i2 = i23;
                                jArr7[i30] = ((~(255 << i31)) & jArr7[i30]) | (128 << i31);
                                i25++;
                            } else {
                                jArr2 = jArr6;
                                i2 = i23;
                            }
                            i24++;
                            jArr6 = jArr2;
                            i23 = i2;
                        }
                        this.f8056f += i25;
                    }
                    j3 = j6;
                    b3 = b(i5);
                }
                this.f8055e++;
                int i32 = this.f8056f;
                long[] jArr8 = this.f8051a;
                int i33 = b3 >> 3;
                long j11 = jArr8[i33];
                int i34 = (b3 & 7) << 3;
                this.f8056f = i32 - (((j11 >> i34) & 255) != 128 ? 0 : 1);
                jArr8[i33] = ((~(255 << i34)) & j11) | (j3 << i34);
                int i35 = this.f8054d;
                int i36 = ((b3 - 7) & i35) + (i35 & 7);
                int i37 = i36 >> 3;
                int i38 = (i36 & 7) << 3;
                jArr8[i37] = (jArr8[i37] & (~(255 << i38))) | (j3 << i38);
                return ~b3;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = -862048943;
        }
    }

    public final int d(Object obj) {
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.f8054d;
        int i6 = i3 >>> 7;
        while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.f8051a;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j3 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j4 = (i4 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i7) & i5;
                if (z2.h.a(this.f8052b[numberOfTrailingZeros], obj)) {
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

    public final int e(Object obj) {
        int d3 = d(obj);
        if (d3 >= 0) {
            return this.f8053c[d3];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0766v)) {
            return false;
        }
        C0766v c0766v = (C0766v) obj;
        if (c0766v.f8055e != this.f8055e) {
            return false;
        }
        Object[] objArr = this.f8052b;
        int[] iArr = this.f8053c;
        long[] jArr = this.f8051a;
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
                            if (iArr[i5] != c0766v.e(objArr[i5])) {
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

    public final void f(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0739E.c(i2)) : 0;
        this.f8054d = max;
        if (max == 0) {
            jArr = AbstractC0739E.f7971a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0959k.v(jArr);
        }
        this.f8051a = jArr;
        int i3 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j3)) | j3;
        this.f8056f = AbstractC0739E.a(this.f8054d) - this.f8055e;
        this.f8052b = new Object[max];
        this.f8053c = new int[max];
    }

    public final void g(int i2) {
        this.f8055e--;
        long[] jArr = this.f8051a;
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        jArr[i3] = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        int i5 = this.f8054d;
        int i6 = ((i2 - 7) & i5) + (i5 & 7);
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        this.f8052b[i2] = null;
    }

    public final void h(int i2, Object obj) {
        int c3 = c(obj);
        if (c3 < 0) {
            c3 = ~c3;
        }
        this.f8052b[c3] = obj;
        this.f8053c[c3] = i2;
    }

    public final int hashCode() {
        Object[] objArr = this.f8052b;
        int[] iArr = this.f8053c;
        long[] jArr = this.f8051a;
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
                            i4 += Integer.hashCode(iArr[i7]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f8055e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f8052b;
        int[] iArr = this.f8053c;
        long[] jArr = this.f8051a;
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
                            int i7 = iArr[i6];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i7);
                            i3++;
                            if (i3 < this.f8055e) {
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

    public /* synthetic */ C0766v() {
        this(6);
    }
}
