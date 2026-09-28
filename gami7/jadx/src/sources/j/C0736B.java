package j;

import k.AbstractC0779a;
import n2.AbstractC0959k;

/* renamed from: j.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736B {

    /* renamed from: a, reason: collision with root package name */
    public long[] f7964a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f7965b;

    /* renamed from: c, reason: collision with root package name */
    public int f7966c;

    /* renamed from: d, reason: collision with root package name */
    public int f7967d;

    /* renamed from: e, reason: collision with root package name */
    public int f7968e;

    public C0736B(int i2) {
        this.f7964a = AbstractC0739E.f7971a;
        this.f7965b = AbstractC0779a.f8103c;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        f(AbstractC0739E.d(i2));
    }

    public final boolean a(Object obj) {
        int i2 = this.f7967d;
        this.f7965b[d(obj)] = obj;
        return this.f7967d != i2;
    }

    public final void b() {
        this.f7967d = 0;
        long[] jArr = this.f7964a;
        if (jArr != AbstractC0739E.f7971a) {
            AbstractC0959k.v(jArr);
            long[] jArr2 = this.f7964a;
            int i2 = this.f7966c;
            int i3 = i2 >> 3;
            long j3 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j3)) | j3;
        }
        AbstractC0959k.u(this.f7965b, null, 0, this.f7966c);
        this.f7968e = AbstractC0739E.a(this.f7966c) - this.f7967d;
    }

    public final boolean c(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f7966c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f7964a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j3 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j4 = (i3 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i5) & i4;
                if (z2.h.a(this.f7965b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros >= 0;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int d(Object obj) {
        long j3;
        int i2;
        long[] jArr;
        Object[] objArr;
        int i3;
        long j4;
        long[] jArr2;
        int i4;
        int i5 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.f7966c;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr3 = this.f7964a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j5 = ((jArr3[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr3[i12] >>> i13);
            long j6 = i8;
            int i14 = i8;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j8) >> 3)) & i9;
                if (z2.h.a(this.f7965b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int e3 = e(i7);
                if (this.f7968e != 0 || ((this.f7964a[e3 >> 3] >> ((e3 & 7) << 3)) & 255) == 254) {
                    j3 = j6;
                } else {
                    int i15 = this.f7966c;
                    if (i15 <= 8 || Long.compareUnsigned(this.f7967d * 32, i15 * 25) > 0) {
                        int b3 = AbstractC0739E.b(this.f7966c);
                        long[] jArr4 = this.f7964a;
                        Object[] objArr2 = this.f7965b;
                        int i16 = this.f7966c;
                        f(b3);
                        Object[] objArr3 = this.f7965b;
                        int i17 = 0;
                        while (i17 < i16) {
                            if (((jArr4[i17 >> 3] >> ((i17 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i17];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i5;
                                int i18 = hashCode2 ^ (hashCode2 << 16);
                                int e4 = e(i18 >>> 7);
                                i3 = i7;
                                long j9 = i18 & 127;
                                long[] jArr5 = this.f7964a;
                                int i19 = e4 >> 3;
                                int i20 = (e4 & 7) << 3;
                                jArr = jArr4;
                                objArr = objArr2;
                                jArr5[i19] = (jArr5[i19] & (~(255 << i20))) | (j9 << i20);
                                int i21 = this.f7966c;
                                int i22 = ((e4 - 7) & i21) + (i21 & 7);
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                j4 = j6;
                                jArr5[i23] = (j9 << i24) | (jArr5[i23] & (~(255 << i24)));
                                objArr3[e4] = obj2;
                            } else {
                                jArr = jArr4;
                                objArr = objArr2;
                                i3 = i7;
                                j4 = j6;
                            }
                            i17++;
                            jArr4 = jArr;
                            i7 = i3;
                            j6 = j4;
                            objArr2 = objArr;
                            i5 = -862048943;
                        }
                        j3 = j6;
                        i2 = i7;
                    } else {
                        long[] jArr6 = this.f7964a;
                        int i25 = this.f7966c;
                        int i26 = 0;
                        int i27 = 0;
                        while (i26 < i25) {
                            int i28 = i26 >> 3;
                            int i29 = (i26 & 7) << 3;
                            if (((jArr6[i28] >> i29) & 255) == 254) {
                                long[] jArr7 = this.f7964a;
                                jArr7[i28] = (jArr7[i28] & (~(255 << i29))) | (128 << i29);
                                int i30 = this.f7966c;
                                int i31 = ((i26 - 7) & i30) + (i30 & 7);
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                jArr2 = jArr6;
                                i4 = i25;
                                jArr7[i32] = ((~(255 << i33)) & jArr7[i32]) | (128 << i33);
                                i27++;
                            } else {
                                jArr2 = jArr6;
                                i4 = i25;
                            }
                            i26++;
                            jArr6 = jArr2;
                            i25 = i4;
                        }
                        this.f7968e += i27;
                        i2 = i7;
                        j3 = j6;
                    }
                    e3 = e(i2);
                }
                this.f7967d++;
                int i34 = this.f7968e;
                long[] jArr8 = this.f7964a;
                int i35 = e3 >> 3;
                long j10 = jArr8[i35];
                int i36 = (e3 & 7) << 3;
                this.f7968e = i34 - (((j10 >> i36) & 255) != 128 ? 0 : 1);
                jArr8[i35] = ((~(255 << i36)) & j10) | (j3 << i36);
                int i37 = this.f7966c;
                int i38 = ((e3 - 7) & i37) + (i37 & 7);
                int i39 = i38 >> 3;
                int i40 = (i38 & 7) << 3;
                jArr8[i39] = (jArr8[i39] & (~(255 << i40))) | (j3 << i40);
                return e3;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            i8 = i14;
            i5 = -862048943;
        }
    }

    public final int e(int i2) {
        int i3 = this.f7966c;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f7964a;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0736B)) {
            return false;
        }
        C0736B c0736b = (C0736B) obj;
        if (c0736b.f7967d != this.f7967d) {
            return false;
        }
        Object[] objArr = this.f7965b;
        long[] jArr = this.f7964a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j3) < 128 && !c0736b.c(objArr[(i2 << 3) + i4])) {
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
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0739E.c(i2)) : 0;
        this.f7966c = max;
        if (max == 0) {
            jArr = AbstractC0739E.f7971a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0959k.v(jArr);
        }
        this.f7964a = jArr;
        int i3 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j3)) | j3;
        this.f7968e = AbstractC0739E.a(this.f7966c) - this.f7967d;
        this.f7965b = new Object[max];
    }

    public final boolean g() {
        return this.f7967d == 0;
    }

    public final boolean h() {
        return this.f7967d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f7965b;
        long[] jArr = this.f7964a;
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
                            Object obj = objArr[(i3 << 3) + i6];
                            i4 += obj != null ? obj.hashCode() : 0;
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

    public final void i(C0736B c0736b) {
        Object[] objArr = c0736b.f7965b;
        long[] jArr = c0736b.f7964a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr[i2];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j3) < 128) {
                        Object obj = objArr[(i2 << 3) + i4];
                        this.f7965b[d(obj)] = obj;
                    }
                    j3 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f7966c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f7964a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f7965b
            r15 = r15[r11]
            boolean r15 = z2.h.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.k(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0736B.j(java.lang.Object):boolean");
    }

    public final void k(int i2) {
        this.f7967d--;
        long[] jArr = this.f7964a;
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        jArr[i3] = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        int i5 = this.f7966c;
        int i6 = ((i2 - 7) & i5) + (i5 & 7);
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        this.f7965b[i2] = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f7965b;
        long[] jArr = this.f7964a;
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
                            Object obj = objArr[(i2 << 3) + i5];
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
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

    public /* synthetic */ C0736B() {
        this(6);
    }
}
