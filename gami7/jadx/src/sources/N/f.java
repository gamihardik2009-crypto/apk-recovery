package N;

import J.C0257c;
import java.util.Arrays;
import java.util.ListIterator;
import n2.AbstractC0959k;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f4953i;

    /* renamed from: j, reason: collision with root package name */
    public final Object[] f4954j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4955k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4956l;

    public f(Object[] objArr, Object[] objArr2, int i2, int i3) {
        this.f4953i = objArr;
        this.f4954j = objArr2;
        this.f4955k = i2;
        this.f4956l = i3;
        if (a() > 32) {
            int length = objArr2.length;
            return;
        }
        C0257c.W("Trie-based persistent vector should have at least 33 elements, got " + a());
        throw null;
    }

    public static Object[] l(Object[] objArr, int i2, int i3, Object obj, e eVar) {
        Object[] copyOf;
        int E = l0.c.E(i3, i2);
        if (i2 == 0) {
            if (E == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                z2.h.e(copyOf, "copyOf(this, newSize)");
            }
            AbstractC0959k.q(objArr, copyOf, E + 1, E, 31);
            eVar.f4952a = objArr[31];
            copyOf[E] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        z2.h.e(copyOf2, "copyOf(this, newSize)");
        int i4 = i2 - 5;
        Object obj2 = objArr[E];
        z2.h.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[E] = l((Object[]) obj2, i4, i3, obj, eVar);
        while (true) {
            E++;
            if (E >= 32 || copyOf2[E] == null) {
                break;
            }
            Object obj3 = objArr[E];
            z2.h.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[E] = l((Object[]) obj3, i4, 0, eVar.f4952a, eVar);
        }
        return copyOf2;
    }

    public static Object[] n(Object[] objArr, int i2, int i3, e eVar) {
        Object[] n3;
        int E = l0.c.E(i3, i2);
        if (i2 == 5) {
            eVar.f4952a = objArr[E];
            n3 = null;
        } else {
            Object obj = objArr[E];
            z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            n3 = n((Object[]) obj, i2 - 5, i3, eVar);
        }
        if (n3 == null && E == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        z2.h.e(copyOf, "copyOf(this, newSize)");
        copyOf[E] = n3;
        return copyOf;
    }

    public static Object[] t(Object[] objArr, int i2, int i3, Object obj) {
        int E = l0.c.E(i3, i2);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        z2.h.e(copyOf, "copyOf(this, newSize)");
        if (i2 == 0) {
            copyOf[E] = obj;
        } else {
            Object obj2 = copyOf[E];
            z2.h.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[E] = t((Object[]) obj2, i2 - 5, i3, obj);
        }
        return copyOf;
    }

    @Override // m2.AbstractC0872n
    public final int a() {
        return this.f4955k;
    }

    @Override // N.c
    public final c b(int i2, Object obj) {
        int i3 = this.f4955k;
        l0.c.s(i2, i3);
        if (i2 == i3) {
            return e(obj);
        }
        int s3 = s();
        Object[] objArr = this.f4953i;
        if (i2 >= s3) {
            return m(objArr, i2 - s3, obj);
        }
        e eVar = new e(null);
        return m(l(objArr, this.f4956l, i2, obj, eVar), 0, eVar.f4952a);
    }

    @Override // N.c
    public final c e(Object obj) {
        int s3 = s();
        int i2 = this.f4955k;
        int i3 = i2 - s3;
        Object[] objArr = this.f4953i;
        Object[] objArr2 = this.f4954j;
        if (i3 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return o(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        z2.h.e(copyOf, "copyOf(this, newSize)");
        copyOf[i3] = obj;
        return new f(objArr, copyOf, i2 + 1, this.f4956l);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Object[] objArr;
        l0.c.q(i2, a());
        if (s() <= i2) {
            objArr = this.f4954j;
        } else {
            objArr = this.f4953i;
            for (int i3 = this.f4956l; i3 > 0; i3 -= 5) {
                Object obj = objArr[l0.c.E(i2, i3)];
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i2 & 31];
    }

    @Override // N.c
    public final c h(b bVar) {
        g g3 = g();
        g3.A(bVar);
        return g3.e();
    }

    @Override // N.c
    public final c i(int i2) {
        l0.c.q(i2, this.f4955k);
        int s3 = s();
        Object[] objArr = this.f4953i;
        int i3 = this.f4956l;
        return i2 >= s3 ? r(objArr, s3, i3, i2 - s3) : r(q(objArr, i3, i2, new e(this.f4954j[0])), s3, i3, 0);
    }

    @Override // N.c
    public final c j(int i2, Object obj) {
        int i3 = this.f4955k;
        l0.c.q(i2, i3);
        int s3 = s();
        Object[] objArr = this.f4953i;
        Object[] objArr2 = this.f4954j;
        int i4 = this.f4956l;
        if (s3 > i2) {
            return new f(t(objArr, i4, i2, obj), objArr2, i3, i4);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        z2.h.e(copyOf, "copyOf(this, newSize)");
        copyOf[i2 & 31] = obj;
        return new f(objArr, copyOf, i3, i4);
    }

    @Override // N.c
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final g g() {
        return new g(this, this.f4953i, this.f4954j, this.f4956l);
    }

    @Override // n2.AbstractC0952d, java.util.List
    public final ListIterator listIterator(int i2) {
        l0.c.s(i2, a());
        return new h(this.f4953i, this.f4954j, i2, a(), (this.f4956l / 5) + 1);
    }

    public final f m(Object[] objArr, int i2, Object obj) {
        int s3 = s();
        int i3 = this.f4955k;
        int i4 = i3 - s3;
        Object[] objArr2 = this.f4954j;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        z2.h.e(copyOf, "copyOf(this, newSize)");
        if (i4 < 32) {
            AbstractC0959k.q(objArr2, copyOf, i2 + 1, i2, i4);
            copyOf[i2] = obj;
            return new f(objArr, copyOf, i3 + 1, this.f4956l);
        }
        Object obj2 = objArr2[31];
        AbstractC0959k.q(objArr2, copyOf, i2 + 1, i2, i4 - 1);
        copyOf[i2] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return o(objArr, copyOf, objArr3);
    }

    public final f o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i2 = this.f4955k;
        int i3 = i2 >> 5;
        int i4 = this.f4956l;
        if (i3 <= (1 << i4)) {
            return new f(p(i4, objArr, objArr2), objArr3, i2 + 1, i4);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i5 = i4 + 5;
        return new f(p(i5, objArr4, objArr2), objArr3, i2 + 1, i5);
    }

    public final Object[] p(int i2, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int E = l0.c.E(a() - 1, i2);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            z2.h.e(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new Object[32];
        }
        if (i2 == 5) {
            objArr3[E] = objArr2;
        } else {
            objArr3[E] = p(i2 - 5, (Object[]) objArr3[E], objArr2);
        }
        return objArr3;
    }

    public final Object[] q(Object[] objArr, int i2, int i3, e eVar) {
        Object[] copyOf;
        int E = l0.c.E(i3, i2);
        if (i2 == 0) {
            if (E == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                z2.h.e(copyOf, "copyOf(this, newSize)");
            }
            AbstractC0959k.q(objArr, copyOf, E, E + 1, 32);
            copyOf[31] = eVar.f4952a;
            eVar.f4952a = objArr[E];
            return copyOf;
        }
        int E3 = objArr[31] == null ? l0.c.E(s() - 1, i2) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        z2.h.e(copyOf2, "copyOf(this, newSize)");
        int i4 = i2 - 5;
        int i5 = E + 1;
        if (i5 <= E3) {
            while (true) {
                Object obj = copyOf2[E3];
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[E3] = q((Object[]) obj, i4, 0, eVar);
                if (E3 == i5) {
                    break;
                }
                E3--;
            }
        }
        Object obj2 = copyOf2[E];
        z2.h.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[E] = q((Object[]) obj2, i4, i3, eVar);
        return copyOf2;
    }

    public final c r(Object[] objArr, int i2, int i3, int i4) {
        f fVar;
        int i5 = this.f4955k - i2;
        if (i5 != 1) {
            Object[] objArr2 = this.f4954j;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            int i6 = i5 - 1;
            if (i4 < i6) {
                AbstractC0959k.q(objArr2, copyOf, i4, i4 + 1, i5);
            }
            copyOf[i6] = null;
            return new f(objArr, copyOf, (i2 + i5) - 1, i3);
        }
        if (i3 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                z2.h.e(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        e eVar = new e(null);
        Object[] n3 = n(objArr, i3, i2 - 1, eVar);
        z2.h.c(n3);
        Object obj = eVar.f4952a;
        z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (n3[1] == null) {
            Object obj2 = n3[0];
            z2.h.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            fVar = new f((Object[]) obj2, objArr3, i2, i3 - 5);
        } else {
            fVar = new f(n3, objArr3, i2, i3);
        }
        return fVar;
    }

    public final int s() {
        return (this.f4955k - 1) & (-32);
    }
}
