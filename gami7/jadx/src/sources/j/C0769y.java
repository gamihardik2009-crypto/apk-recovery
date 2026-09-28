package j;

import k.AbstractC0779a;
import n2.AbstractC0959k;

/* renamed from: j.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8065a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8066b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8067c;

    /* renamed from: d, reason: collision with root package name */
    public int f8068d;

    /* renamed from: e, reason: collision with root package name */
    public int f8069e;

    /* renamed from: f, reason: collision with root package name */
    public int f8070f;

    public C0769y(int i2) {
        this.f8065a = AbstractC0739E.f7971a;
        Object[] objArr = AbstractC0779a.f8103c;
        this.f8066b = objArr;
        this.f8067c = objArr;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        f(AbstractC0739E.d(i2));
    }

    public final void a() {
        this.f8069e = 0;
        long[] jArr = this.f8065a;
        if (jArr != AbstractC0739E.f7971a) {
            AbstractC0959k.v(jArr);
            long[] jArr2 = this.f8065a;
            int i2 = this.f8068d;
            int i3 = i2 >> 3;
            long j3 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j3)) | j3;
        }
        AbstractC0959k.u(this.f8067c, null, 0, this.f8068d);
        AbstractC0959k.u(this.f8066b, null, 0, this.f8068d);
        this.f8070f = AbstractC0739E.a(this.f8068d) - this.f8069e;
    }

    public final boolean b(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f8068d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f8065a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j3 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j4 = (i3 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i5) & i4;
                if (z2.h.a(this.f8066b[numberOfTrailingZeros], obj)) {
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

    public final int c(int i2) {
        int i3 = this.f8068d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f8065a;
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

    public final int d(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f8068d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f8065a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j3 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j4 = i4;
            int i10 = i4;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j6) >> 3)) & i5;
                if (z2.h.a(this.f8066b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j3) << 6) & j3 & (-9187201950435737472L)) != 0) {
                int c3 = c(i3);
                if (this.f8070f == 0 && ((this.f8065a[c3 >> 3] >> ((c3 & 7) << 3)) & 255) != 254) {
                    int i11 = this.f8068d;
                    if (i11 <= 8 || Long.compareUnsigned(this.f8069e * 32, i11 * 25) > 0) {
                        i(AbstractC0739E.b(this.f8068d));
                    } else {
                        i(this.f8068d);
                    }
                    c3 = c(i3);
                }
                this.f8069e++;
                int i12 = this.f8070f;
                long[] jArr2 = this.f8065a;
                int i13 = c3 >> 3;
                long j7 = jArr2[i13];
                int i14 = (c3 & 7) << 3;
                this.f8070f = i12 - (((j7 >> i14) & 255) == 128 ? 1 : 0);
                jArr2[i13] = (j7 & (~(255 << i14))) | (j4 << i14);
                int i15 = this.f8068d;
                int i16 = ((c3 - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr2[i17] = ((~(255 << i18)) & jArr2[i17]) | (j4 << i18);
                return ~c3;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f8068d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f8065a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f8066b
            r11 = r11[r10]
            boolean r11 = z2.h.a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object[] r14 = r13.f8067c
            r14 = r14[r10]
            goto L74
        L73:
            r14 = 0
        L74:
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0769y.e(java.lang.Object):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0769y)) {
            return false;
        }
        C0769y c0769y = (C0769y) obj;
        if (c0769y.f8069e != this.f8069e) {
            return false;
        }
        Object[] objArr = this.f8066b;
        Object[] objArr2 = this.f8067c;
        long[] jArr = this.f8065a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            loop0: while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j3) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = objArr[i5];
                            Object obj3 = objArr2[i5];
                            if (obj3 == null) {
                                if (c0769y.e(obj2) != null || !c0769y.b(obj2)) {
                                    break loop0;
                                }
                            } else if (!z2.h.a(obj3, c0769y.e(obj2))) {
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
            return false;
        }
        return true;
    }

    public final void f(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0739E.c(i2)) : 0;
        this.f8068d = max;
        if (max == 0) {
            jArr = AbstractC0739E.f7971a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0959k.v(jArr);
        }
        this.f8065a = jArr;
        int i3 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j3)) | j3;
        this.f8070f = AbstractC0739E.a(this.f8068d) - this.f8069e;
        this.f8066b = new Object[max];
        this.f8067c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f8068d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f8065a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f8066b
            r11 = r11[r10]
            boolean r11 = z2.h.a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.h(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0769y.g(java.lang.Object):java.lang.Object");
    }

    public final Object h(int i2) {
        this.f8069e--;
        long[] jArr = this.f8065a;
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        jArr[i3] = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        int i5 = this.f8068d;
        int i6 = ((i2 - 7) & i5) + (i5 & 7);
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        this.f8066b[i2] = null;
        Object[] objArr = this.f8067c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final int hashCode() {
        Object[] objArr = this.f8066b;
        Object[] objArr2 = this.f8067c;
        long[] jArr = this.f8065a;
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
                            Object obj2 = objArr2[i7];
                            i4 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final void i(int i2) {
        int i3;
        long[] jArr = this.f8065a;
        Object[] objArr = this.f8066b;
        Object[] objArr2 = this.f8067c;
        int i4 = this.f8068d;
        f(i2);
        Object[] objArr3 = this.f8066b;
        Object[] objArr4 = this.f8067c;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i5];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i6 = hashCode ^ (hashCode << 16);
                int c3 = c(i6 >>> 7);
                long j3 = i6 & 127;
                long[] jArr2 = this.f8065a;
                int i7 = c3 >> 3;
                int i8 = (c3 & 7) << 3;
                i3 = i5;
                jArr2[i7] = (jArr2[i7] & (~(255 << i8))) | (j3 << i8);
                int i9 = this.f8068d;
                int i10 = ((c3 - 7) & i9) + (i9 & 7);
                int i11 = i10 >> 3;
                int i12 = (i10 & 7) << 3;
                jArr2[i11] = (jArr2[i11] & (~(255 << i12))) | (j3 << i12);
                objArr3[c3] = obj;
                objArr4[c3] = objArr2[i3];
            } else {
                i3 = i5;
            }
            i5 = i3 + 1;
        }
    }

    public final void j(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 < 0) {
            d3 = ~d3;
        }
        this.f8066b[d3] = obj;
        this.f8067c[d3] = obj2;
    }

    public final String toString() {
        if (this.f8069e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f8066b;
        Object[] objArr2 = this.f8067c;
        long[] jArr = this.f8065a;
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
                            Object obj2 = objArr2[i6];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i3++;
                            if (i3 < this.f8069e) {
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

    public /* synthetic */ C0769y() {
        this(6);
    }
}
