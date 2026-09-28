package j;

import java.util.NoSuchElementException;
import n2.AbstractC0959k;

/* renamed from: j.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759o {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8015a = AbstractC0739E.f7971a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f8016b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f8017c;

    /* renamed from: d, reason: collision with root package name */
    public int f8018d;

    /* renamed from: e, reason: collision with root package name */
    public int f8019e;

    /* renamed from: f, reason: collision with root package name */
    public int f8020f;

    public C0759o() {
        int[] iArr = AbstractC0755k.f8006a;
        this.f8016b = iArr;
        this.f8017c = iArr;
        e(AbstractC0739E.d(6));
    }

    public final void a() {
        this.f8019e = 0;
        long[] jArr = this.f8015a;
        if (jArr != AbstractC0739E.f7971a) {
            AbstractC0959k.v(jArr);
            long[] jArr2 = this.f8015a;
            int i2 = this.f8018d;
            int i3 = i2 >> 3;
            long j3 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j3)) | j3;
        }
        this.f8020f = AbstractC0739E.a(this.f8018d) - this.f8019e;
    }

    public final int b(int i2) {
        int i3 = this.f8018d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f8015a;
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

    public final int c(int i2) {
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.f8018d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f8015a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j3 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j4 = (i4 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i6) & i5;
                if (this.f8016b[numberOfTrailingZeros] == i2) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final int d(int i2) {
        int c3 = c(i2);
        if (c3 >= 0) {
            return this.f8017c[c3];
        }
        throw new NoSuchElementException(B1.t.h("Cannot find value for key ", i2));
    }

    public final void e(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0739E.c(i2)) : 0;
        this.f8018d = max;
        if (max == 0) {
            jArr = AbstractC0739E.f7971a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0959k.v(jArr);
        }
        this.f8015a = jArr;
        int i3 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j3)) | j3;
        this.f8020f = AbstractC0739E.a(this.f8018d) - this.f8019e;
        this.f8016b = new int[max];
        this.f8017c = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0759o)) {
            return false;
        }
        C0759o c0759o = (C0759o) obj;
        if (c0759o.f8019e != this.f8019e) {
            return false;
        }
        int[] iArr = this.f8016b;
        int[] iArr2 = this.f8017c;
        long[] jArr = this.f8015a;
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
                            if (iArr2[i5] != c0759o.d(iArr[i5])) {
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        r2 = b(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r30.f8020f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (((r30.f8015a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        r2 = r30.f8018d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r2 <= 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (java.lang.Long.compareUnsigned(r30.f8019e * 32, r2 * 25) > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        r2 = r30.f8015a;
        r3 = r30.f8018d;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r4 >= r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        r8 = r4 >> 3;
        r17 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        if (((r2[r8] >> r17) & 255) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        r13 = r30.f8015a;
        r13[r8] = (r13[r8] & (~(255 << r17))) | (128 << r17);
        r6 = r30.f8018d;
        r7 = ((r4 - 7) & r6) + (r6 & 7);
        r6 = r7 >> 3;
        r7 = (r7 & 7) << 3;
        r8 = r2;
        r14 = r3;
        r13[r6] = (r13[r6] & (~(255 << r7))) | (128 << r7);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f8, code lost:
    
        r4 = r4 + 1;
        r2 = r8;
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        r8 = r2;
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
    
        r30.f8020f += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
    
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0199, code lost:
    
        r2 = b(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x019d, code lost:
    
        r30.f8019e++;
        r3 = r30.f8020f;
        r5 = r30.f8015a;
        r6 = r2 >> 3;
        r7 = r5[r6];
        r9 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b8, code lost:
    
        if (((r7 >> r9) & 255) != 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ba, code lost:
    
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01bf, code lost:
    
        r30.f8020f = r3 - r19;
        r5[r6] = ((~(255 << r9)) & r7) | (r28 << r9);
        r3 = r30.f8018d;
        r4 = ((r2 - 7) & r3) + (r3 & 7);
        r3 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r5[r3] = (r5[r3] & (~(255 << r4))) | (r28 << r4);
        r2 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01bd, code lost:
    
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
    
        r2 = j.AbstractC0739E.b(r30.f8018d);
        r3 = r30.f8015a;
        r4 = r30.f8016b;
        r5 = r30.f8017c;
        r6 = r30.f8018d;
        e(r2);
        r2 = r30.f8016b;
        r7 = r30.f8017c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0120, code lost:
    
        if (r8 >= r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        if (((r3[r8 >> 3] >> ((r8 & 7) << 3)) & r11) >= 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0132, code lost:
    
        r13 = r4[r8];
        r14 = java.lang.Integer.hashCode(r13) * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r15 = b(r14 >>> 7);
        r11 = r14 & 127;
        r14 = r30.f8015a;
        r16 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r26 = r3;
        r27 = r4;
        r14[r16] = (r14[r16] & (~(255 << r23))) | (r11 << r23);
        r3 = r30.f8018d;
        r4 = ((r15 - 7) & r3) + (r3 & 7);
        r3 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r28 = r9;
        r14[r3] = (r14[r3] & (~(255 << r4))) | (r11 << r4);
        r2[r15] = r13;
        r7[r15] = r5[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018e, code lost:
    
        r8 = r8 + 1;
        r3 = r26;
        r4 = r27;
        r9 = r28;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0188, code lost:
    
        r26 = r3;
        r27 = r4;
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0090, code lost:
    
        r28 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0759o.f(int, int):void");
    }

    public final int hashCode() {
        int[] iArr = this.f8016b;
        int[] iArr2 = this.f8017c;
        long[] jArr = this.f8015a;
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
                            int i8 = iArr[i7];
                            i4 += Integer.hashCode(iArr2[i7]) ^ Integer.hashCode(i8);
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
        if (this.f8019e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f8016b;
        int[] iArr2 = this.f8017c;
        long[] jArr = this.f8015a;
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
                            int i7 = iArr[i6];
                            int i8 = iArr2[i6];
                            sb.append(i7);
                            sb.append("=");
                            sb.append(i8);
                            i3++;
                            if (i3 < this.f8019e) {
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
