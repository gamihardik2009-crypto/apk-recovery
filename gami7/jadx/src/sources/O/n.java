package O;

import B1.C;
import J.C0257c;
import a.AbstractC0423a;
import java.util.Arrays;
import n2.AbstractC0959k;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final n f5122e = new n(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f5123a;

    /* renamed from: b, reason: collision with root package name */
    public int f5124b;

    /* renamed from: c, reason: collision with root package name */
    public final Q.b f5125c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f5126d;

    public n(int i2, int i3, Object[] objArr, Q.b bVar) {
        this.f5123a = i2;
        this.f5124b = i3;
        this.f5125c = bVar;
        this.f5126d = objArr;
    }

    public static n j(int i2, Object obj, Object obj2, int i3, Object obj3, Object obj4, int i4, Q.b bVar) {
        if (i4 > 30) {
            return new n(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int O3 = AbstractC0423a.O(i2, i4);
        int O4 = AbstractC0423a.O(i3, i4);
        if (O3 != O4) {
            return new n((1 << O3) | (1 << O4), 0, O3 < O4 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new n(0, 1 << O3, new Object[]{j(i2, obj, obj2, i3, obj3, obj4, i4 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i2, int i3, int i4, Object obj, Object obj2, int i5, Q.b bVar) {
        Object obj3 = this.f5126d[i2];
        n j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i2), i4, obj, obj2, i5 + 5, bVar);
        int t3 = t(i3);
        int i6 = t3 + 1;
        Object[] objArr = this.f5126d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0959k.s(objArr, objArr2, 0, i2, 6);
        AbstractC0959k.q(objArr, objArr2, i2, i2 + 2, i6);
        objArr2[t3 - 1] = j3;
        AbstractC0959k.q(objArr, objArr2, t3, i6, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f5124b == 0) {
            return this.f5126d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f5123a);
        int length = this.f5126d.length;
        for (int i2 = bitCount * 2; i2 < length; i2++) {
            bitCount += s(i2).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        E2.b l02 = C.l0(C.m0(0, this.f5126d.length));
        int i2 = l02.f1076h;
        int i3 = l02.f1077i;
        int i4 = l02.f1078j;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (!z2.h.a(obj, this.f5126d[i2])) {
                if (i2 != i3) {
                    i2 += i4;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i2, int i3, Object obj) {
        int O3 = 1 << AbstractC0423a.O(i2, i3);
        if (h(O3)) {
            return z2.h.a(obj, this.f5126d[f(O3)]);
        }
        if (!i(O3)) {
            return false;
        }
        n s3 = s(t(O3));
        return i3 == 30 ? s3.c(obj) : s3.d(i2, i3 + 5, obj);
    }

    public final boolean e(n nVar) {
        if (this == nVar) {
            return true;
        }
        if (this.f5124b != nVar.f5124b || this.f5123a != nVar.f5123a) {
            return false;
        }
        int length = this.f5126d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f5126d[i2] != nVar.f5126d[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i2) {
        return Integer.bitCount((i2 - 1) & this.f5123a) * 2;
    }

    public final Object g(int i2, int i3, Object obj) {
        int O3 = 1 << AbstractC0423a.O(i2, i3);
        if (h(O3)) {
            int f3 = f(O3);
            if (z2.h.a(obj, this.f5126d[f3])) {
                return x(f3);
            }
            return null;
        }
        if (!i(O3)) {
            return null;
        }
        n s3 = s(t(O3));
        if (i3 != 30) {
            return s3.g(i2, i3 + 5, obj);
        }
        E2.b l02 = C.l0(C.m0(0, s3.f5126d.length));
        int i4 = l02.f1076h;
        int i5 = l02.f1077i;
        int i6 = l02.f1078j;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return null;
        }
        while (!z2.h.a(obj, s3.f5126d[i4])) {
            if (i4 == i5) {
                return null;
            }
            i4 += i6;
        }
        return s3.x(i4);
    }

    public final boolean h(int i2) {
        return (i2 & this.f5123a) != 0;
    }

    public final boolean i(int i2) {
        return (i2 & this.f5124b) != 0;
    }

    public final n k(int i2, e eVar) {
        eVar.getClass();
        eVar.b(eVar.f5107m - 1);
        eVar.f5105k = x(i2);
        Object[] objArr = this.f5126d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f5125c != eVar.f5103i) {
            return new n(0, 0, AbstractC0423a.x(objArr, i2), eVar.f5103i);
        }
        this.f5126d = AbstractC0423a.x(objArr, i2);
        return this;
    }

    public final n l(int i2, Object obj, Object obj2, int i3, e eVar) {
        n l3;
        int O3 = 1 << AbstractC0423a.O(i2, i3);
        boolean h2 = h(O3);
        Q.b bVar = this.f5125c;
        if (h2) {
            int f3 = f(O3);
            if (!z2.h.a(obj, this.f5126d[f3])) {
                eVar.getClass();
                eVar.b(eVar.f5107m + 1);
                Q.b bVar2 = eVar.f5103i;
                if (bVar != bVar2) {
                    return new n(this.f5123a ^ O3, this.f5124b | O3, a(f3, O3, i2, obj, obj2, i3, bVar2), bVar2);
                }
                this.f5126d = a(f3, O3, i2, obj, obj2, i3, bVar2);
                this.f5123a ^= O3;
                this.f5124b |= O3;
                return this;
            }
            eVar.f5105k = x(f3);
            if (x(f3) == obj2) {
                return this;
            }
            if (bVar == eVar.f5103i) {
                this.f5126d[f3 + 1] = obj2;
                return this;
            }
            eVar.f5106l++;
            Object[] objArr = this.f5126d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            z2.h.e(copyOf, "copyOf(this, size)");
            copyOf[f3 + 1] = obj2;
            return new n(this.f5123a, this.f5124b, copyOf, eVar.f5103i);
        }
        if (!i(O3)) {
            eVar.getClass();
            eVar.b(eVar.f5107m + 1);
            Q.b bVar3 = eVar.f5103i;
            int f4 = f(O3);
            if (bVar != bVar3) {
                return new n(this.f5123a | O3, this.f5124b, AbstractC0423a.w(this.f5126d, f4, obj, obj2), bVar3);
            }
            this.f5126d = AbstractC0423a.w(this.f5126d, f4, obj, obj2);
            this.f5123a |= O3;
            return this;
        }
        int t3 = t(O3);
        n s3 = s(t3);
        if (i3 == 30) {
            E2.b l02 = C.l0(C.m0(0, s3.f5126d.length));
            int i4 = l02.f1076h;
            int i5 = l02.f1077i;
            int i6 = l02.f1078j;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (!z2.h.a(obj, s3.f5126d[i4])) {
                    if (i4 != i5) {
                        i4 += i6;
                    }
                }
                eVar.f5105k = s3.x(i4);
                if (s3.f5125c == eVar.f5103i) {
                    s3.f5126d[i4 + 1] = obj2;
                    l3 = s3;
                } else {
                    eVar.f5106l++;
                    Object[] objArr2 = s3.f5126d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    z2.h.e(copyOf2, "copyOf(this, size)");
                    copyOf2[i4 + 1] = obj2;
                    l3 = new n(0, 0, copyOf2, eVar.f5103i);
                }
            }
            eVar.getClass();
            eVar.b(eVar.f5107m + 1);
            l3 = new n(0, 0, AbstractC0423a.w(s3.f5126d, 0, obj, obj2), eVar.f5103i);
            break;
        }
        l3 = s3.l(i2, obj, obj2, i3 + 5, eVar);
        return s3 == l3 ? this : r(t3, l3, eVar.f5103i);
    }

    public final n m(n nVar, int i2, Q.a aVar, e eVar) {
        Object[] objArr;
        int i3;
        n j3;
        if (this == nVar) {
            aVar.f5263a += b();
            return this;
        }
        int i4 = 0;
        if (i2 > 30) {
            Q.b bVar = eVar.f5103i;
            Object[] objArr2 = this.f5126d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + nVar.f5126d.length);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            int length = this.f5126d.length;
            E2.b l02 = C.l0(C.m0(0, nVar.f5126d.length));
            int i5 = l02.f1076h;
            int i6 = l02.f1077i;
            int i7 = l02.f1078j;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (c(nVar.f5126d[i5])) {
                        aVar.f5263a++;
                    } else {
                        Object[] objArr3 = nVar.f5126d;
                        copyOf[length] = objArr3[i5];
                        copyOf[length + 1] = objArr3[i5 + 1];
                        length += 2;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
            if (length == this.f5126d.length) {
                return this;
            }
            if (length == nVar.f5126d.length) {
                return nVar;
            }
            if (length == copyOf.length) {
                return new n(0, 0, copyOf, bVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            z2.h.e(copyOf2, "copyOf(this, newSize)");
            return new n(0, 0, copyOf2, bVar);
        }
        int i8 = this.f5124b | nVar.f5124b;
        int i9 = this.f5123a;
        int i10 = nVar.f5123a;
        int i11 = (i9 ^ i10) & (~i8);
        int i12 = i9 & i10;
        int i13 = i11;
        while (i12 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i12);
            if (z2.h.a(this.f5126d[f(lowestOneBit)], nVar.f5126d[nVar.f(lowestOneBit)])) {
                i13 |= lowestOneBit;
            } else {
                i8 |= lowestOneBit;
            }
            i12 ^= lowestOneBit;
        }
        if (!((i8 & i13) == 0)) {
            C0257c.X("Check failed.");
            throw null;
        }
        n nVar2 = (z2.h.a(this.f5125c, eVar.f5103i) && this.f5123a == i13 && this.f5124b == i8) ? this : new n(i13, i8, new Object[Integer.bitCount(i8) + (Integer.bitCount(i13) * 2)], null);
        int i14 = i8;
        int i15 = 0;
        while (i14 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i14);
            Object[] objArr4 = nVar2.f5126d;
            int length2 = (objArr4.length - 1) - i15;
            if (i(lowestOneBit2)) {
                j3 = s(t(lowestOneBit2));
                if (nVar.i(lowestOneBit2)) {
                    j3 = j3.m(nVar.s(nVar.t(lowestOneBit2)), i2 + 5, aVar, eVar);
                } else if (nVar.h(lowestOneBit2)) {
                    int f3 = nVar.f(lowestOneBit2);
                    Object obj = nVar.f5126d[f3];
                    Object x2 = nVar.x(f3);
                    int i16 = eVar.f5107m;
                    objArr = objArr4;
                    j3 = j3.l(obj != null ? obj.hashCode() : i4, obj, x2, i2 + 5, eVar);
                    if (eVar.f5107m == i16) {
                        aVar.f5263a++;
                    }
                    i3 = lowestOneBit2;
                }
                objArr = objArr4;
                i3 = lowestOneBit2;
            } else {
                objArr = objArr4;
                i3 = lowestOneBit2;
                if (nVar.i(i3)) {
                    j3 = nVar.s(nVar.t(i3));
                    if (h(i3)) {
                        int f4 = f(i3);
                        Object obj2 = this.f5126d[f4];
                        int i17 = i2 + 5;
                        if (j3.d(obj2 != null ? obj2.hashCode() : 0, i17, obj2)) {
                            aVar.f5263a++;
                        } else {
                            j3 = j3.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f4), i17, eVar);
                        }
                    }
                } else {
                    int f5 = f(i3);
                    Object obj3 = this.f5126d[f5];
                    Object x3 = x(f5);
                    int f6 = nVar.f(i3);
                    Object obj4 = nVar.f5126d[f6];
                    j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x3, obj4 != null ? obj4.hashCode() : 0, obj4, nVar.x(f6), i2 + 5, eVar.f5103i);
                }
            }
            objArr[length2] = j3;
            i15++;
            i14 ^= i3;
            i4 = 0;
        }
        int i18 = 0;
        while (i13 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i13);
            int i19 = i18 * 2;
            if (nVar.h(lowestOneBit3)) {
                int f7 = nVar.f(lowestOneBit3);
                Object[] objArr5 = nVar2.f5126d;
                objArr5[i19] = nVar.f5126d[f7];
                objArr5[i19 + 1] = nVar.x(f7);
                if (h(lowestOneBit3)) {
                    aVar.f5263a++;
                }
            } else {
                int f8 = f(lowestOneBit3);
                Object[] objArr6 = nVar2.f5126d;
                objArr6[i19] = this.f5126d[f8];
                objArr6[i19 + 1] = x(f8);
            }
            i18++;
            i13 ^= lowestOneBit3;
        }
        return e(nVar2) ? this : nVar.e(nVar2) ? nVar : nVar2;
    }

    public final n n(int i2, Object obj, int i3, e eVar) {
        n n3;
        int O3 = 1 << AbstractC0423a.O(i2, i3);
        if (h(O3)) {
            int f3 = f(O3);
            return z2.h.a(obj, this.f5126d[f3]) ? p(f3, O3, eVar) : this;
        }
        if (!i(O3)) {
            return this;
        }
        int t3 = t(O3);
        n s3 = s(t3);
        if (i3 == 30) {
            E2.b l02 = C.l0(C.m0(0, s3.f5126d.length));
            int i4 = l02.f1076h;
            int i5 = l02.f1077i;
            int i6 = l02.f1078j;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (!z2.h.a(obj, s3.f5126d[i4])) {
                    if (i4 != i5) {
                        i4 += i6;
                    }
                }
                n3 = s3.k(i4, eVar);
            }
            n3 = s3;
            break;
        }
        n3 = s3.n(i2, obj, i3 + 5, eVar);
        return q(s3, n3, t3, O3, eVar.f5103i);
    }

    public final n o(int i2, Object obj, Object obj2, int i3, e eVar) {
        n o3;
        int O3 = 1 << AbstractC0423a.O(i2, i3);
        if (h(O3)) {
            int f3 = f(O3);
            return (z2.h.a(obj, this.f5126d[f3]) && z2.h.a(obj2, x(f3))) ? p(f3, O3, eVar) : this;
        }
        if (!i(O3)) {
            return this;
        }
        int t3 = t(O3);
        n s3 = s(t3);
        if (i3 == 30) {
            E2.b l02 = C.l0(C.m0(0, s3.f5126d.length));
            int i4 = l02.f1076h;
            int i5 = l02.f1077i;
            int i6 = l02.f1078j;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!z2.h.a(obj, s3.f5126d[i4]) || !z2.h.a(obj2, s3.x(i4))) {
                        if (i4 == i5) {
                            break;
                        }
                        i4 += i6;
                    } else {
                        o3 = s3.k(i4, eVar);
                        break;
                    }
                }
            }
            o3 = s3;
        } else {
            o3 = s3.o(i2, obj, obj2, i3 + 5, eVar);
        }
        return q(s3, o3, t3, O3, eVar.f5103i);
    }

    public final n p(int i2, int i3, e eVar) {
        eVar.getClass();
        eVar.b(eVar.f5107m - 1);
        eVar.f5105k = x(i2);
        Object[] objArr = this.f5126d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f5125c != eVar.f5103i) {
            return new n(i3 ^ this.f5123a, this.f5124b, AbstractC0423a.x(objArr, i2), eVar.f5103i);
        }
        this.f5126d = AbstractC0423a.x(objArr, i2);
        this.f5123a ^= i3;
        return this;
    }

    public final n q(n nVar, n nVar2, int i2, int i3, Q.b bVar) {
        Q.b bVar2 = this.f5125c;
        if (nVar2 == null) {
            Object[] objArr = this.f5126d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 != bVar) {
                return new n(this.f5123a, i3 ^ this.f5124b, AbstractC0423a.y(objArr, i2), bVar);
            }
            this.f5126d = AbstractC0423a.y(objArr, i2);
            this.f5124b ^= i3;
        } else if (bVar2 == bVar || nVar != nVar2) {
            return r(i2, nVar2, bVar);
        }
        return this;
    }

    public final n r(int i2, n nVar, Q.b bVar) {
        Object[] objArr = this.f5126d;
        if (objArr.length == 1 && nVar.f5126d.length == 2 && nVar.f5124b == 0) {
            nVar.f5123a = this.f5124b;
            return nVar;
        }
        if (this.f5125c == bVar) {
            objArr[i2] = nVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        z2.h.e(copyOf, "copyOf(this, size)");
        copyOf[i2] = nVar;
        return new n(this.f5123a, this.f5124b, copyOf, bVar);
    }

    public final n s(int i2) {
        Object obj = this.f5126d[i2];
        z2.h.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (n) obj;
    }

    public final int t(int i2) {
        return (this.f5126d.length - 1) - Integer.bitCount((i2 - 1) & this.f5124b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O.m u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.n.u(int, int, java.lang.Object, java.lang.Object):O.m");
    }

    public final n v(int i2, int i3, Object obj) {
        n v3;
        int O3 = 1 << AbstractC0423a.O(i2, i3);
        if (h(O3)) {
            int f3 = f(O3);
            if (!z2.h.a(obj, this.f5126d[f3])) {
                return this;
            }
            Object[] objArr = this.f5126d;
            if (objArr.length == 2) {
                return null;
            }
            return new n(this.f5123a ^ O3, this.f5124b, AbstractC0423a.x(objArr, f3), null);
        }
        if (!i(O3)) {
            return this;
        }
        int t3 = t(O3);
        n s3 = s(t3);
        if (i3 == 30) {
            E2.b l02 = C.l0(C.m0(0, s3.f5126d.length));
            int i4 = l02.f1076h;
            int i5 = l02.f1077i;
            int i6 = l02.f1078j;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (!z2.h.a(obj, s3.f5126d[i4])) {
                    if (i4 != i5) {
                        i4 += i6;
                    }
                }
                Object[] objArr2 = s3.f5126d;
                v3 = objArr2.length == 2 ? null : new n(0, 0, AbstractC0423a.x(objArr2, i4), null);
            }
            v3 = s3;
            break;
        }
        v3 = s3.v(i2, i3 + 5, obj);
        if (v3 != null) {
            return s3 != v3 ? w(t3, O3, v3) : this;
        }
        Object[] objArr3 = this.f5126d;
        if (objArr3.length == 1) {
            return null;
        }
        return new n(this.f5123a, O3 ^ this.f5124b, AbstractC0423a.y(objArr3, t3), null);
    }

    public final n w(int i2, int i3, n nVar) {
        Object[] objArr = nVar.f5126d;
        if (objArr.length != 2 || nVar.f5124b != 0) {
            Object[] objArr2 = this.f5126d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            copyOf[i2] = nVar;
            return new n(this.f5123a, this.f5124b, copyOf, null);
        }
        if (this.f5126d.length == 1) {
            nVar.f5123a = this.f5124b;
            return nVar;
        }
        int f3 = f(i3);
        Object[] objArr3 = this.f5126d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        z2.h.e(copyOf2, "copyOf(this, newSize)");
        AbstractC0959k.q(copyOf2, copyOf2, i2 + 2, i2 + 1, objArr3.length);
        AbstractC0959k.q(copyOf2, copyOf2, f3 + 2, f3, i2);
        copyOf2[f3] = obj;
        copyOf2[f3 + 1] = obj2;
        return new n(this.f5123a ^ i3, i3 ^ this.f5124b, copyOf2, null);
    }

    public final Object x(int i2) {
        return this.f5126d[i2 + 1];
    }
}
