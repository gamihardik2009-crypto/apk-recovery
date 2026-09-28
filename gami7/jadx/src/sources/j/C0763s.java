package j;

import n2.AbstractC0959k;

/* renamed from: j.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763s {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8034a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f8035b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8036c;

    /* renamed from: d, reason: collision with root package name */
    public int f8037d;

    /* renamed from: e, reason: collision with root package name */
    public int f8038e;

    /* renamed from: f, reason: collision with root package name */
    public int f8039f;

    public final boolean a(long j3) {
        int hashCode = Long.hashCode(j3) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f8037d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f8034a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j4 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j5 = (i3 * 72340172838076673L) ^ j4;
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i5) & i4;
                if (this.f8035b[numberOfTrailingZeros] == j3) {
                    return numberOfTrailingZeros >= 0;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int b(int i2) {
        int i3 = this.f8037d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f8034a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r16) {
        /*
            r15 = this;
            r0 = r15
            int r1 = java.lang.Long.hashCode(r16)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f8037d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
        L14:
            long[] r5 = r0.f8034a
            int r6 = r1 >> 3
            r7 = r1 & 7
            int r7 = r7 << 3
            r8 = r5[r6]
            long r8 = r8 >>> r7
            int r6 = r6 + 1
            r10 = r5[r6]
            int r5 = 64 - r7
            long r5 = r10 << r5
            long r10 = (long) r7
            long r10 = -r10
            r7 = 63
            long r10 = r10 >> r7
            long r5 = r5 & r10
            long r5 = r5 | r8
            long r7 = (long) r2
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r9 = r7 - r9
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L40:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L5d
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r1
            r11 = r11 & r3
            long[] r12 = r0.f8035b
            r13 = r12[r11]
            int r12 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r12 != 0) goto L57
            goto L67
        L57:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L40
        L5d:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L70
            r11 = -1
        L67:
            if (r11 < 0) goto L6e
            java.lang.Object[] r1 = r0.f8036c
            r1 = r1[r11]
            goto L6f
        L6e:
            r1 = 0
        L6f:
            return r1
        L70:
            int r4 = r4 + 8
            int r1 = r1 + r4
            r1 = r1 & r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0763s.c(long):java.lang.Object");
    }

    public final void d(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0739E.c(i2)) : 0;
        this.f8037d = max;
        if (max == 0) {
            jArr = AbstractC0739E.f7971a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0959k.v(jArr);
        }
        this.f8034a = jArr;
        int i3 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j3)) | j3;
        this.f8039f = AbstractC0739E.a(this.f8037d) - this.f8038e;
        this.f8035b = new long[max];
        this.f8036c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r1 = b(r3);
        r5 = 128;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (r32.f8039f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (((r32.f8034a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        r1 = r32.f8037d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (r1 <= 8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        if (java.lang.Long.compareUnsigned(r32.f8038e * 32, r1 * 25) > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r1 = r32.f8034a;
        r2 = r32.f8037d;
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
    
        if (r3 >= r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        r7 = r3 >> 3;
        r12 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        if (((r1[r7] >> r12) & 255) != 254) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        r14 = r32.f8034a;
        r14[r7] = (r14[r7] & (~(255 << r12))) | (r5 << r12);
        r7 = r32.f8037d;
        r12 = ((r3 - 7) & r7) + (r7 & 7);
        r7 = r12 >> 3;
        r12 = (r12 & 7) << 3;
        r14[r7] = ((~(255 << r12)) & r14[r7]) | (128 << r12);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f1, code lost:
    
        r3 = r3 + 1;
        r5 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f7, code lost:
    
        r32.f8039f += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fc, code lost:
    
        r30 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0195, code lost:
    
        r1 = b(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0199, code lost:
    
        r16 = r1;
        r2 = 1;
        r32.f8038e++;
        r1 = r32.f8039f;
        r3 = r32.f8034a;
        r4 = r16 >> 3;
        r5 = r3[r4];
        r7 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b6, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b9, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ba, code lost:
    
        r32.f8039f = r1 - r2;
        r3[r4] = ((~(255 << r7)) & r5) | (r30 << r7);
        r1 = r32.f8037d;
        r2 = ((r16 - 7) & r1) + (r1 & 7);
        r1 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r3[r1] = (r3[r1] & (~(255 << r2))) | (r30 << r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0104, code lost:
    
        r1 = j.AbstractC0739E.b(r32.f8037d);
        r2 = r32.f8034a;
        r3 = r32.f8035b;
        r4 = r32.f8036c;
        r5 = r32.f8037d;
        d(r1);
        r1 = r32.f8035b;
        r6 = r32.f8036c;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011a, code lost:
    
        if (r7 >= r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
    
        if (((r2[r7 >> 3] >> ((r7 & 7) << 3)) & r8) >= 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012d, code lost:
    
        r13 = r3[r7];
        r16 = java.lang.Long.hashCode(r13) * (-862048943);
        r16 = r16 ^ (r16 << 16);
        r12 = b(r16 >>> 7);
        r8 = r16 & 127;
        r15 = r32.f8034a;
        r16 = r12 >> 3;
        r25 = (r12 & 7) << 3;
        r28 = r2;
        r29 = r3;
        r15[r16] = (r15[r16] & (~(255 << r25))) | (r8 << r25);
        r2 = r32.f8037d;
        r3 = ((r12 - 7) & r2) + (r2 & 7);
        r2 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r30 = r10;
        r15[r2] = (r8 << r3) | (r15[r2] & (~(255 << r3)));
        r1[r12] = r13;
        r6[r12] = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018a, code lost:
    
        r7 = r7 + 1;
        r2 = r28;
        r3 = r29;
        r10 = r30;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0184, code lost:
    
        r28 = r2;
        r29 = r3;
        r30 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0090, code lost:
    
        r30 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r33, j.C0767w r35) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0763s.e(long, j.w):void");
    }

    public final boolean equals(Object obj) {
        int i2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0763s)) {
            return false;
        }
        C0763s c0763s = (C0763s) obj;
        if (c0763s.f8038e != this.f8038e) {
            return false;
        }
        long[] jArr = this.f8035b;
        Object[] objArr = this.f8036c;
        long[] jArr2 = this.f8034a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (true) {
                long j3 = jArr2[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j3) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i6;
                            long j4 = jArr[i7];
                            Object obj2 = objArr[i7];
                            if (obj2 == null) {
                                if (c0763s.c(j4) != null || !c0763s.a(j4)) {
                                    break loop0;
                                }
                            } else if (!z2.h.a(obj2, c0763s.c(j4))) {
                                return false;
                            }
                            i4 = 8;
                        } else {
                            i2 = i6;
                        }
                        j3 >>= i4;
                        i6 = i2 + 1;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.f8035b;
        Object[] objArr = this.f8036c;
        long[] jArr2 = this.f8034a;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j3 = jArr2[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            int i7 = (i3 << 3) + i6;
                            long j4 = jArr[i7];
                            Object obj = objArr[i7];
                            i4 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j4);
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
        int i2;
        int i3;
        if (this.f8038e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f8035b;
        Object[] objArr = this.f8036c;
        long[] jArr2 = this.f8034a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j3 = jArr2[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((255 & j3) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i3 = i4;
                            long j4 = jArr[i8];
                            Object obj = objArr[i8];
                            sb.append(j4);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i5++;
                            if (i5 < this.f8038e) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i4;
                        }
                        j3 >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i9 = i4;
                    if (i6 != 8) {
                        break;
                    }
                    i2 = i9;
                } else {
                    i2 = i4;
                }
                if (i2 == length) {
                    break;
                }
                i4 = i2 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        z2.h.e(sb2, "s.append('}').toString()");
        return sb2;
    }
}
