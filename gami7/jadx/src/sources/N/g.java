package N;

import J.C0257c;
import j.C0744J;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import n2.AbstractC0954f;
import n2.AbstractC0959k;

/* loaded from: classes.dex */
public final class g extends AbstractC0954f implements Collection, A2.b {

    /* renamed from: h, reason: collision with root package name */
    public c f4957h;

    /* renamed from: i, reason: collision with root package name */
    public Object[] f4958i;

    /* renamed from: j, reason: collision with root package name */
    public Object[] f4959j;

    /* renamed from: k, reason: collision with root package name */
    public int f4960k;

    /* renamed from: l, reason: collision with root package name */
    public Q.b f4961l = new Q.b();

    /* renamed from: m, reason: collision with root package name */
    public Object[] f4962m;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f4963n;

    /* renamed from: o, reason: collision with root package name */
    public int f4964o;

    public g(c cVar, Object[] objArr, Object[] objArr2, int i2) {
        this.f4957h = cVar;
        this.f4958i = objArr;
        this.f4959j = objArr2;
        this.f4960k = i2;
        this.f4962m = objArr;
        this.f4963n = objArr2;
        this.f4964o = cVar.size();
    }

    public static void f(Object[] objArr, int i2, Iterator it) {
        while (i2 < 32 && it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (z(r19, r10, r11) != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r14 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(y2.c r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.g.A(y2.c):boolean");
    }

    public final Object[] B(Object[] objArr, int i2, int i3, e eVar) {
        int E = l0.c.E(i3, i2);
        if (i2 == 0) {
            Object obj = objArr[E];
            Object[] m3 = m(objArr);
            AbstractC0959k.q(objArr, m3, E, E + 1, 32);
            m3[31] = eVar.f4952a;
            eVar.f4952a = obj;
            return m3;
        }
        int E3 = objArr[31] == null ? l0.c.E(D() - 1, i2) : 31;
        Object[] m4 = m(objArr);
        int i4 = i2 - 5;
        int i5 = E + 1;
        if (i5 <= E3) {
            while (true) {
                Object obj2 = m4[E3];
                z2.h.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                m4[E3] = B((Object[]) obj2, i4, 0, eVar);
                if (E3 == i5) {
                    break;
                }
                E3--;
            }
        }
        Object obj3 = m4[E];
        z2.h.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m4[E] = B((Object[]) obj3, i4, i3, eVar);
        return m4;
    }

    public final Object C(Object[] objArr, int i2, int i3, int i4) {
        int i5 = this.f4964o - i2;
        if (i5 == 1) {
            Object obj = this.f4963n[0];
            s(objArr, i2, i3);
            return obj;
        }
        Object[] objArr2 = this.f4963n;
        Object obj2 = objArr2[i4];
        Object[] m3 = m(objArr2);
        AbstractC0959k.q(objArr2, m3, i4, i4 + 1, i5);
        m3[i5 - 1] = null;
        this.f4962m = objArr;
        this.f4963n = m3;
        this.f4964o = (i2 + i5) - 1;
        this.f4960k = i3;
        return obj2;
    }

    public final int D() {
        int i2 = this.f4964o;
        if (i2 <= 32) {
            return 0;
        }
        return (i2 - 1) & (-32);
    }

    public final Object[] E(Object[] objArr, int i2, int i3, Object obj, e eVar) {
        int E = l0.c.E(i3, i2);
        Object[] m3 = m(objArr);
        if (i2 != 0) {
            Object obj2 = m3[E];
            z2.h.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            m3[E] = E((Object[]) obj2, i2 - 5, i3, obj, eVar);
            return m3;
        }
        if (m3 != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.f4952a = m3[E];
        m3[E] = obj;
        return m3;
    }

    public final void F(Collection collection, int i2, Object[] objArr, int i3, Object[][] objArr2, int i4, Object[] objArr3) {
        Object[] o3;
        if (i4 < 1) {
            C0257c.W("requires at least one nullBuffer");
            throw null;
        }
        Object[] m3 = m(objArr);
        objArr2[0] = m3;
        int i5 = i2 & 31;
        int size = ((collection.size() + i2) - 1) & 31;
        int i6 = (i3 - i5) + size;
        if (i6 < 32) {
            AbstractC0959k.q(m3, objArr3, size + 1, i5, i3);
        } else {
            int i7 = i6 - 31;
            if (i4 == 1) {
                o3 = m3;
            } else {
                o3 = o();
                i4--;
                objArr2[i4] = o3;
            }
            int i8 = i3 - i7;
            AbstractC0959k.q(m3, objArr3, 0, i8, i3);
            AbstractC0959k.q(m3, o3, size + 1, i5, i8);
            objArr3 = o3;
        }
        Iterator it = collection.iterator();
        f(m3, i5, it);
        for (int i9 = 1; i9 < i4; i9++) {
            Object[] o4 = o();
            f(o4, 0, it);
            objArr2[i9] = o4;
        }
        f(objArr3, 0, it);
    }

    public final int G() {
        int i2 = this.f4964o;
        return i2 <= 32 ? i2 : i2 - ((i2 - 1) & (-32));
    }

    @Override // n2.AbstractC0954f
    public final int a() {
        return this.f4964o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        l0.c.s(i2, a());
        if (i2 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int D3 = D();
        if (i2 >= D3) {
            j(this.f4962m, i2 - D3, obj);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.f4962m;
        z2.h.c(objArr);
        j(i(objArr, this.f4960k, i2, obj, eVar), 0, eVar.f4952a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        Object[] o3;
        l0.c.s(i2, this.f4964o);
        if (i2 == this.f4964o) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i3 = (i2 >> 5) << 5;
        int size = ((collection.size() + (this.f4964o - i3)) - 1) / 32;
        if (size == 0) {
            int i4 = i2 & 31;
            int size2 = ((collection.size() + i2) - 1) & 31;
            Object[] objArr = this.f4963n;
            Object[] m3 = m(objArr);
            AbstractC0959k.q(objArr, m3, size2 + 1, i4, G());
            f(m3, i4, collection.iterator());
            this.f4963n = m3;
            this.f4964o = collection.size() + this.f4964o;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int G3 = G();
        int size3 = collection.size() + this.f4964o;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i2 >= D()) {
            o3 = o();
            F(collection, i2, this.f4963n, G3, objArr2, size, o3);
        } else if (size3 > G3) {
            int i5 = size3 - G3;
            o3 = n(this.f4963n, i5);
            h(collection, i2, i5, objArr2, size, o3);
        } else {
            Object[] objArr3 = this.f4963n;
            o3 = o();
            int i6 = G3 - size3;
            AbstractC0959k.q(objArr3, o3, 0, i6, G3);
            int i7 = 32 - i6;
            Object[] n3 = n(this.f4963n, i7);
            int i8 = size - 1;
            objArr2[i8] = n3;
            h(collection, i2, i7, objArr2, i8, n3);
        }
        this.f4962m = u(this.f4962m, i3, objArr2);
        this.f4963n = o3;
        this.f4964o = collection.size() + this.f4964o;
        return true;
    }

    @Override // n2.AbstractC0954f
    public final Object b(int i2) {
        l0.c.q(i2, a());
        ((AbstractList) this).modCount++;
        int D3 = D();
        if (i2 >= D3) {
            return C(this.f4962m, D3, this.f4960k, i2 - D3);
        }
        e eVar = new e(this.f4963n[0]);
        Object[] objArr = this.f4962m;
        z2.h.c(objArr);
        C(B(objArr, this.f4960k, i2, eVar), D3, this.f4960k, 0);
        return eVar.f4952a;
    }

    public final c e() {
        c fVar;
        Object[] objArr = this.f4962m;
        if (objArr == this.f4958i && this.f4963n == this.f4959j) {
            fVar = this.f4957h;
        } else {
            this.f4961l = new Q.b();
            this.f4958i = objArr;
            Object[] objArr2 = this.f4963n;
            this.f4959j = objArr2;
            if (objArr != null) {
                z2.h.c(objArr);
                fVar = new f(objArr, this.f4963n, a(), this.f4960k);
            } else if (objArr2.length == 0) {
                fVar = j.f4971j;
            } else {
                Object[] copyOf = Arrays.copyOf(this.f4963n, a());
                z2.h.e(copyOf, "copyOf(this, newSize)");
                fVar = new j(copyOf);
            }
        }
        this.f4957h = fVar;
        return fVar;
    }

    public final int g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        Object[] objArr;
        l0.c.q(i2, a());
        if (D() <= i2) {
            objArr = this.f4963n;
        } else {
            objArr = this.f4962m;
            z2.h.c(objArr);
            for (int i3 = this.f4960k; i3 > 0; i3 -= 5) {
                Object obj = objArr[l0.c.E(i2, i3)];
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i2 & 31];
    }

    public final void h(Collection collection, int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        if (this.f4962m == null) {
            throw new IllegalStateException("root is null".toString());
        }
        int i5 = i2 >> 5;
        a l3 = l(D() >> 5);
        int i6 = i4;
        Object[] objArr3 = objArr2;
        while (l3.f4946h - 1 != i5) {
            Object[] objArr4 = (Object[]) l3.previous();
            AbstractC0959k.q(objArr4, objArr3, 0, 32 - i3, 32);
            objArr3 = n(objArr4, i3);
            i6--;
            objArr[i6] = objArr3;
        }
        Object[] objArr5 = (Object[]) l3.previous();
        int D3 = i4 - (((D() >> 5) - 1) - i5);
        if (D3 < i4) {
            objArr2 = objArr[D3];
            z2.h.c(objArr2);
        }
        F(collection, i2, objArr5, 32, objArr, D3, objArr2);
    }

    public final Object[] i(Object[] objArr, int i2, int i3, Object obj, e eVar) {
        Object obj2;
        int E = l0.c.E(i3, i2);
        if (i2 == 0) {
            eVar.f4952a = objArr[31];
            Object[] m3 = m(objArr);
            AbstractC0959k.q(objArr, m3, E + 1, E, 31);
            m3[E] = obj;
            return m3;
        }
        Object[] m4 = m(objArr);
        int i4 = i2 - 5;
        Object obj3 = m4[E];
        z2.h.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m4[E] = i((Object[]) obj3, i4, i3, obj, eVar);
        while (true) {
            E++;
            if (E >= 32 || (obj2 = m4[E]) == null) {
                break;
            }
            m4[E] = i((Object[]) obj2, i4, 0, eVar.f4952a, eVar);
        }
        return m4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(Object[] objArr, int i2, Object obj) {
        int G3 = G();
        Object[] m3 = m(this.f4963n);
        if (G3 < 32) {
            AbstractC0959k.q(this.f4963n, m3, i2 + 1, i2, G3);
            m3[i2] = obj;
            this.f4962m = objArr;
            this.f4963n = m3;
            this.f4964o++;
            return;
        }
        Object[] objArr2 = this.f4963n;
        Object obj2 = objArr2[31];
        AbstractC0959k.q(objArr2, m3, i2 + 1, i2, 31);
        m3[i2] = obj;
        v(objArr, m3, p(obj2));
    }

    public final boolean k(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f4961l;
    }

    public final a l(int i2) {
        Object[] objArr = this.f4962m;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root".toString());
        }
        int D3 = D() >> 5;
        l0.c.s(i2, D3);
        int i3 = this.f4960k;
        return i3 == 0 ? new d(i2, objArr) : new k(objArr, i2, D3, i3 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        l0.c.s(i2, a());
        return new i(this, i2);
    }

    public final Object[] m(Object[] objArr) {
        if (objArr == null) {
            return o();
        }
        if (k(objArr)) {
            return objArr;
        }
        Object[] o3 = o();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC0959k.s(objArr, o3, 0, length, 6);
        return o3;
    }

    public final Object[] n(Object[] objArr, int i2) {
        if (k(objArr)) {
            AbstractC0959k.q(objArr, objArr, i2, 0, 32 - i2);
            return objArr;
        }
        Object[] o3 = o();
        AbstractC0959k.q(objArr, o3, i2, 0, 32 - i2);
        return o3;
    }

    public final Object[] o() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f4961l;
        return objArr;
    }

    public final Object[] p(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f4961l;
        return objArr;
    }

    public final Object[] q(Object[] objArr, int i2, int i3) {
        if (!(i3 >= 0)) {
            C0257c.W("shift should be positive");
            throw null;
        }
        if (i3 == 0) {
            return objArr;
        }
        int E = l0.c.E(i2, i3);
        Object obj = objArr[E];
        z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object q = q((Object[]) obj, i2, i3 - 5);
        if (E < 31) {
            int i4 = E + 1;
            if (objArr[i4] != null) {
                if (k(objArr)) {
                    Arrays.fill(objArr, i4, 32, (Object) null);
                }
                Object[] o3 = o();
                AbstractC0959k.q(objArr, o3, 0, 0, i4);
                objArr = o3;
            }
        }
        if (q == objArr[E]) {
            return objArr;
        }
        Object[] m3 = m(objArr);
        m3[E] = q;
        return m3;
    }

    public final Object[] r(Object[] objArr, int i2, int i3, e eVar) {
        Object[] r3;
        int E = l0.c.E(i3 - 1, i2);
        if (i2 == 5) {
            eVar.f4952a = objArr[E];
            r3 = null;
        } else {
            Object obj = objArr[E];
            z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            r3 = r((Object[]) obj, i2 - 5, i3, eVar);
        }
        if (r3 == null && E == 0) {
            return null;
        }
        Object[] m3 = m(objArr);
        m3[E] = r3;
        return m3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return A(new b(1, collection));
    }

    public final void s(Object[] objArr, int i2, int i3) {
        if (i3 == 0) {
            this.f4962m = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f4963n = objArr;
            this.f4964o = i2;
            this.f4960k = i3;
            return;
        }
        e eVar = new e(null);
        z2.h.c(objArr);
        Object[] r3 = r(objArr, i3, i2, eVar);
        z2.h.c(r3);
        Object obj = eVar.f4952a;
        z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f4963n = (Object[]) obj;
        this.f4964o = i2;
        if (r3[1] == null) {
            this.f4962m = (Object[]) r3[0];
            this.f4960k = i3 - 5;
        } else {
            this.f4962m = r3;
            this.f4960k = i3;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        l0.c.q(i2, a());
        if (D() > i2) {
            e eVar = new e(null);
            Object[] objArr = this.f4962m;
            z2.h.c(objArr);
            this.f4962m = E(objArr, this.f4960k, i2, obj, eVar);
            return eVar.f4952a;
        }
        Object[] m3 = m(this.f4963n);
        if (m3 != this.f4963n) {
            ((AbstractList) this).modCount++;
        }
        int i3 = i2 & 31;
        Object obj2 = m3[i3];
        m3[i3] = obj;
        this.f4963n = m3;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i2, int i3, Iterator it) {
        if (!it.hasNext()) {
            C0257c.W("invalid buffersIterator");
            throw null;
        }
        if (!(i3 >= 0)) {
            C0257c.W("negative shift");
            throw null;
        }
        if (i3 == 0) {
            return (Object[]) it.next();
        }
        Object[] m3 = m(objArr);
        int E = l0.c.E(i2, i3);
        int i4 = i3 - 5;
        m3[E] = t((Object[]) m3[E], i2, i4, it);
        while (true) {
            E++;
            if (E >= 32 || !it.hasNext()) {
                break;
            }
            m3[E] = t((Object[]) m3[E], 0, i4, it);
        }
        return m3;
    }

    public final Object[] u(Object[] objArr, int i2, Object[][] objArr2) {
        C0744J h2 = z2.h.h(objArr2);
        int i3 = i2 >> 5;
        int i4 = this.f4960k;
        Object[] t3 = i3 < (1 << i4) ? t(objArr, i2, i4, h2) : m(objArr);
        while (h2.hasNext()) {
            this.f4960k += 5;
            t3 = p(t3);
            int i5 = this.f4960k;
            t(t3, 1 << i5, i5, h2);
        }
        return t3;
    }

    public final void v(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i2 = this.f4964o;
        int i3 = i2 >> 5;
        int i4 = this.f4960k;
        if (i3 > (1 << i4)) {
            this.f4962m = w(this.f4960k + 5, p(objArr), objArr2);
            this.f4963n = objArr3;
            this.f4960k += 5;
            this.f4964o++;
            return;
        }
        if (objArr == null) {
            this.f4962m = objArr2;
            this.f4963n = objArr3;
            this.f4964o = i2 + 1;
        } else {
            this.f4962m = w(i4, objArr, objArr2);
            this.f4963n = objArr3;
            this.f4964o++;
        }
    }

    public final Object[] w(int i2, Object[] objArr, Object[] objArr2) {
        int E = l0.c.E(a() - 1, i2);
        Object[] m3 = m(objArr);
        if (i2 == 5) {
            m3[E] = objArr2;
        } else {
            m3[E] = w(i2 - 5, (Object[]) m3[E], objArr2);
        }
        return m3;
    }

    public final int x(y2.c cVar, Object[] objArr, int i2, int i3, e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (k(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.f4952a;
        z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj2 = objArr[i4];
            if (!((Boolean) cVar.l(obj2)).booleanValue()) {
                if (i3 == 32) {
                    objArr3 = arrayList.isEmpty() ^ true ? (Object[]) arrayList.remove(arrayList.size() - 1) : o();
                    i3 = 0;
                }
                objArr3[i3] = obj2;
                i3++;
            }
        }
        eVar.f4952a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i3;
    }

    public final int y(y2.c cVar, Object[] objArr, int i2, e eVar) {
        Object[] objArr2 = objArr;
        int i3 = i2;
        boolean z3 = false;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (((Boolean) cVar.l(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = m(objArr);
                    z3 = true;
                    i3 = i4;
                }
            } else if (z3) {
                objArr2[i3] = obj;
                i3++;
            }
        }
        eVar.f4952a = objArr2;
        return i3;
    }

    public final int z(y2.c cVar, int i2, e eVar) {
        int y3 = y(cVar, this.f4963n, i2, eVar);
        if (y3 == i2) {
            return i2;
        }
        Object obj = eVar.f4952a;
        z2.h.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, y3, i2, (Object) null);
        this.f4963n = objArr;
        this.f4964o -= i2 - y3;
        return y3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int G3 = G();
        if (G3 < 32) {
            Object[] m3 = m(this.f4963n);
            m3[G3] = obj;
            this.f4963n = m3;
            this.f4964o = a() + 1;
        } else {
            v(this.f4962m, this.f4963n, p(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int G3 = G();
        Iterator it = collection.iterator();
        if (32 - G3 >= collection.size()) {
            Object[] m3 = m(this.f4963n);
            f(m3, G3, it);
            this.f4963n = m3;
            this.f4964o = collection.size() + this.f4964o;
        } else {
            int size = ((collection.size() + G3) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] m4 = m(this.f4963n);
            f(m4, G3, it);
            objArr[0] = m4;
            for (int i2 = 1; i2 < size; i2++) {
                Object[] o3 = o();
                f(o3, 0, it);
                objArr[i2] = o3;
            }
            this.f4962m = u(this.f4962m, D(), objArr);
            Object[] o4 = o();
            f(o4, 0, it);
            this.f4963n = o4;
            this.f4964o = collection.size() + this.f4964o;
        }
        return true;
    }
}
