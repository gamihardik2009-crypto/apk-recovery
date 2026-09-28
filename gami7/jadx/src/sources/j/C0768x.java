package j;

import java.util.NoSuchElementException;
import k.AbstractC0779a;
import n2.AbstractC0959k;

/* renamed from: j.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768x {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8059a = AbstractC0739E.f7971a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8060b = AbstractC0779a.f8103c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f8061c = AbstractC0756l.f8007a;

    /* renamed from: d, reason: collision with root package name */
    public int f8062d;

    /* renamed from: e, reason: collision with root package name */
    public int f8063e;

    /* renamed from: f, reason: collision with root package name */
    public int f8064f;

    public C0768x(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        d(AbstractC0739E.d(i2));
    }

    public final int a(int i2) {
        int i3 = this.f8062d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f8059a;
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

    public final int b(Object obj) {
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.f8062d;
        int i6 = i3 >>> 7;
        while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.f8059a;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j3 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j4 = (i4 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i7) & i5;
                if (z2.h.a(this.f8060b[numberOfTrailingZeros], obj)) {
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

    public final long c(Object obj) {
        int b3 = b(obj);
        if (b3 >= 0) {
            return this.f8061c[b3];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final void d(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0739E.c(i2)) : 0;
        this.f8062d = max;
        if (max == 0) {
            jArr = AbstractC0739E.f7971a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0959k.v(jArr);
        }
        this.f8059a = jArr;
        int i3 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j3)) | j3;
        this.f8064f = AbstractC0739E.a(this.f8062d) - this.f8063e;
        this.f8060b = new Object[max];
        this.f8061c = new long[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        r2 = a(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r30.f8064f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (((r30.f8059a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        r2 = r30.f8062d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r2 <= 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (java.lang.Long.compareUnsigned(r30.f8063e * 32, r2 * 25) > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        r2 = r30.f8059a;
        r3 = r30.f8062d;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (r4 >= r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        r8 = r4 >> 3;
        r17 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (((r2[r8] >> r17) & 255) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        r13 = r30.f8059a;
        r13[r8] = (r13[r8] & (~(255 << r17))) | (128 << r17);
        r6 = r30.f8062d;
        r7 = ((r4 - 7) & r6) + (r6 & 7);
        r6 = r7 >> 3;
        r7 = (r7 & 7) << 3;
        r8 = r2;
        r14 = r3;
        r13[r6] = (r13[r6] & (~(255 << r7))) | (128 << r7);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
    
        r4 = r4 + 1;
        r2 = r8;
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        r8 = r2;
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        r30.f8064f += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
    
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a2, code lost:
    
        r2 = a(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a6, code lost:
    
        r30.f8063e++;
        r3 = r30.f8064f;
        r5 = r30.f8059a;
        r6 = r2 >> 3;
        r7 = r5[r6];
        r9 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c1, code lost:
    
        if (((r7 >> r9) & 255) != 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c3, code lost:
    
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c8, code lost:
    
        r30.f8064f = r3 - r19;
        r5[r6] = ((~(255 << r9)) & r7) | (r28 << r9);
        r3 = r30.f8062d;
        r4 = ((r2 - 7) & r3) + (r3 & 7);
        r3 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r5[r3] = (r5[r3] & (~(255 << r4))) | (r28 << r4);
        r2 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c6, code lost:
    
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
    
        r2 = j.AbstractC0739E.b(r30.f8062d);
        r3 = r30.f8059a;
        r4 = r30.f8060b;
        r5 = r30.f8061c;
        r6 = r30.f8062d;
        d(r2);
        r2 = r30.f8060b;
        r7 = r30.f8061c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0124, code lost:
    
        if (r8 >= r6) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        if (((r3[r8 >> 3] >> ((r8 & 7) << 3)) & r11) >= 128) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0136, code lost:
    
        r13 = r4[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0138, code lost:
    
        if (r13 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013a, code lost:
    
        r14 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        r14 = r14 * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r15 = a(r14 >>> 7);
        r11 = r14 & 127;
        r14 = r30.f8059a;
        r16 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r26 = r3;
        r27 = r4;
        r14[r16] = (r14[r16] & (~(255 << r23))) | (r11 << r23);
        r3 = r30.f8062d;
        r4 = ((r15 - 7) & r3) + (r3 & 7);
        r3 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r28 = r9;
        r14[r3] = (r14[r3] & (~(255 << r4))) | (r11 << r4);
        r2[r15] = r13;
        r7[r15] = r5[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0197, code lost:
    
        r8 = r8 + 1;
        r3 = r26;
        r4 = r27;
        r9 = r28;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0142, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0191, code lost:
    
        r26 = r3;
        r27 = r4;
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010c, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0094, code lost:
    
        r28 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r31, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0768x.e(long, java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0768x)) {
            return false;
        }
        C0768x c0768x = (C0768x) obj;
        if (c0768x.f8063e != this.f8063e) {
            return false;
        }
        Object[] objArr = this.f8060b;
        long[] jArr = this.f8061c;
        long[] jArr2 = this.f8059a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr2[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j3) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (jArr[i5] != c0768x.c(objArr[i5])) {
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
        Object[] objArr = this.f8060b;
        long[] jArr = this.f8061c;
        long[] jArr2 = this.f8059a;
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
                            Object obj = objArr[i7];
                            i4 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i7]);
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
        if (this.f8063e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f8060b;
        long[] jArr = this.f8061c;
        long[] jArr2 = this.f8059a;
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
                            Object obj = objArr[i8];
                            i3 = i4;
                            long j4 = jArr[i8];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j4);
                            i5++;
                            if (i5 < this.f8063e) {
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
