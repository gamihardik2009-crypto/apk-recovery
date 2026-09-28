package j;

import n2.AbstractC0959k;

/* renamed from: j.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762r {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8029a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f8030b;

    /* renamed from: c, reason: collision with root package name */
    public int f8031c;

    /* renamed from: d, reason: collision with root package name */
    public int f8032d;

    /* renamed from: e, reason: collision with root package name */
    public int f8033e;

    public C0762r(int i2) {
        this.f8029a = AbstractC0739E.f7971a;
        this.f8030b = AbstractC0755k.f8006a;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        e(AbstractC0739E.d(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r3 = d(r20);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r29.f8033e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (((r29.f8029a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        r3 = r29.f8031c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r3 <= 8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        if (java.lang.Long.compareUnsigned(r29.f8032d * 32, r3 * 25) > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        r3 = r29.f8029a;
        r5 = r29.f8031c;
        r6 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
    
        if (r6 >= r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        if (((r3[r8] >> r9) & 255) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        r14 = r29.f8029a;
        r23 = r2;
        r24 = r3;
        r14[r8] = (r14[r8] & (~(255 << r9))) | (128 << r9);
        r2 = r29.f8031c;
        r3 = ((r6 - 7) & r2) + (r2 & 7);
        r2 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r25 = r10;
        r14[r2] = (r14[r2] & (~(255 << r3))) | (128 << r3);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        r6 = r6 + 1;
        r2 = r23;
        r3 = r24;
        r10 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0102, code lost:
    
        r23 = r2;
        r24 = r3;
        r25 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
    
        r23 = r2;
        r25 = r10;
        r29.f8033e += r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a0, code lost:
    
        r2 = d(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a6, code lost:
    
        r29.f8032d++;
        r3 = r29.f8033e;
        r4 = r29.f8029a;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c0, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c2, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c5, code lost:
    
        r29.f8033e = r3 - r9;
        r4[r5] = (r6 & (~(255 << r8))) | (r25 << r8);
        r3 = r29.f8031c;
        r5 = ((r2 - 7) & r3) + (r3 & 7);
        r3 = r5 >> 3;
        r5 = (r5 & 7) << 3;
        r4[r3] = (r4[r3] & (~(255 << r5))) | (r25 << r5);
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c4, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011c, code lost:
    
        r23 = r2;
        r25 = r10;
        r2 = j.AbstractC0739E.b(r29.f8031c);
        r3 = r29.f8029a;
        r5 = r29.f8030b;
        r6 = r29.f8031c;
        e(r2);
        r2 = r29.f8030b;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0132, code lost:
    
        if (r7 >= r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0142, code lost:
    
        if (((r3[r7 >> 3] >> ((r7 & 7) << 3)) & r12) >= 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        r8 = r5[r7];
        r9 = java.lang.Integer.hashCode(r8) * (-862048943);
        r9 = r9 ^ (r9 << 16);
        r11 = d(r9 >>> 7);
        r12 = r9 & 127;
        r9 = r29.f8029a;
        r14 = r11 >> 3;
        r21 = (r11 & 7) << 3;
        r9[r14] = (r9[r14] & (~(255 << r21))) | (r12 << r21);
        r10 = r29.f8031c;
        r11 = ((r11 - 7) & r10) + (r10 & 7);
        r10 = r11 >> 3;
        r11 = (r11 & 7) << 3;
        r14 = r5;
        r21 = r6;
        r9[r10] = (r9[r10] & (~(255 << r11))) | (r12 << r11);
        r2[r11] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0198, code lost:
    
        r7 = r7 + 1;
        r5 = r14;
        r6 = r21;
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0195, code lost:
    
        r14 = r5;
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0098, code lost:
    
        r23 = r2;
        r25 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a5, code lost:
    
        r2 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r30) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0762r.a(int):boolean");
    }

    public final void b() {
        this.f8032d = 0;
        long[] jArr = this.f8029a;
        if (jArr != AbstractC0739E.f7971a) {
            AbstractC0959k.v(jArr);
            long[] jArr2 = this.f8029a;
            int i2 = this.f8031c;
            int i3 = i2 >> 3;
            long j3 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j3)) | j3;
        }
        this.f8033e = AbstractC0739E.a(this.f8031c) - this.f8032d;
    }

    public final boolean c(int i2) {
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.f8031c;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f8029a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j3 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j4 = (i4 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i6) & i5;
                if (this.f8030b[numberOfTrailingZeros] == i2) {
                    return numberOfTrailingZeros >= 0;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final int d(int i2) {
        int i3 = this.f8031c;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f8029a;
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

    public final void e(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0739E.c(i2)) : 0;
        this.f8031c = max;
        if (max == 0) {
            jArr = AbstractC0739E.f7971a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0959k.v(jArr);
        }
        this.f8029a = jArr;
        int i3 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j3)) | j3;
        this.f8033e = AbstractC0739E.a(this.f8031c) - this.f8032d;
        this.f8030b = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0762r)) {
            return false;
        }
        C0762r c0762r = (C0762r) obj;
        if (c0762r.f8032d != this.f8032d) {
            return false;
        }
        int[] iArr = this.f8030b;
        long[] jArr = this.f8029a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j3) < 128 && !c0762r.c(iArr[(i2 << 3) + i4])) {
                            return false;
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
        this.f8032d--;
        long[] jArr = this.f8029a;
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        jArr[i3] = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        int i5 = this.f8031c;
        int i6 = ((i2 - 7) & i5) + (i5 & 7);
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (254 << i8);
    }

    public final int hashCode() {
        int[] iArr = this.f8030b;
        long[] jArr = this.f8029a;
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
                            i4 = Integer.hashCode(iArr[(i3 << 3) + i6]) + i4;
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f8030b;
        long[] jArr = this.f8029a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            int i6 = iArr[(i2 << 3) + i5];
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i6);
                            i3++;
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
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        z2.h.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C0762r() {
        this(6);
    }
}
