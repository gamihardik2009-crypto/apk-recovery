package n2;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import t0.AbstractC1265x;

/* renamed from: n2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958j extends AbstractC0954f {

    /* renamed from: k, reason: collision with root package name */
    public static final Object[] f9160k = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    public int f9161h;

    /* renamed from: i, reason: collision with root package name */
    public Object[] f9162i = f9160k;

    /* renamed from: j, reason: collision with root package name */
    public int f9163j;

    @Override // n2.AbstractC0954f
    public final int a() {
        return this.f9163j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int i4 = this.f9163j;
        if (i2 < 0 || i2 > i4) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i4, "index: ", ", size: "));
        }
        if (i2 == i4) {
            f(obj);
            return;
        }
        if (i2 == 0) {
            e(obj);
            return;
        }
        n();
        h(this.f9163j + 1);
        int m3 = m(this.f9161h + i2);
        int i5 = this.f9163j;
        if (i2 < ((i5 + 1) >> 1)) {
            if (m3 == 0) {
                Object[] objArr = this.f9162i;
                z2.h.f(objArr, "<this>");
                m3 = objArr.length;
            }
            int i6 = m3 - 1;
            int i7 = this.f9161h;
            if (i7 == 0) {
                Object[] objArr2 = this.f9162i;
                z2.h.f(objArr2, "<this>");
                i3 = objArr2.length - 1;
            } else {
                i3 = i7 - 1;
            }
            int i8 = this.f9161h;
            if (i6 >= i8) {
                Object[] objArr3 = this.f9162i;
                objArr3[i3] = objArr3[i8];
                AbstractC0959k.q(objArr3, objArr3, i8, i8 + 1, i6 + 1);
            } else {
                Object[] objArr4 = this.f9162i;
                AbstractC0959k.q(objArr4, objArr4, i8 - 1, i8, objArr4.length);
                Object[] objArr5 = this.f9162i;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0959k.q(objArr5, objArr5, 0, 1, i6 + 1);
            }
            this.f9162i[i6] = obj;
            this.f9161h = i3;
        } else {
            int m4 = m(i5 + this.f9161h);
            if (m3 < m4) {
                Object[] objArr6 = this.f9162i;
                AbstractC0959k.q(objArr6, objArr6, m3 + 1, m3, m4);
            } else {
                Object[] objArr7 = this.f9162i;
                AbstractC0959k.q(objArr7, objArr7, 1, 0, m4);
                Object[] objArr8 = this.f9162i;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC0959k.q(objArr8, objArr8, m3 + 1, m3, objArr8.length - 1);
            }
            this.f9162i[m3] = obj;
        }
        this.f9163j++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        z2.h.f(collection, "elements");
        int i3 = this.f9163j;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == this.f9163j) {
            return addAll(collection);
        }
        n();
        h(collection.size() + this.f9163j);
        int m3 = m(this.f9163j + this.f9161h);
        int m4 = m(this.f9161h + i2);
        int size = collection.size();
        if (i2 < ((this.f9163j + 1) >> 1)) {
            int i4 = this.f9161h;
            int i5 = i4 - size;
            if (m4 < i4) {
                Object[] objArr = this.f9162i;
                AbstractC0959k.q(objArr, objArr, i5, i4, objArr.length);
                if (size >= m4) {
                    Object[] objArr2 = this.f9162i;
                    AbstractC0959k.q(objArr2, objArr2, objArr2.length - size, 0, m4);
                } else {
                    Object[] objArr3 = this.f9162i;
                    AbstractC0959k.q(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f9162i;
                    AbstractC0959k.q(objArr4, objArr4, 0, size, m4);
                }
            } else if (i5 >= 0) {
                Object[] objArr5 = this.f9162i;
                AbstractC0959k.q(objArr5, objArr5, i5, i4, m4);
            } else {
                Object[] objArr6 = this.f9162i;
                i5 += objArr6.length;
                int i6 = m4 - i4;
                int length = objArr6.length - i5;
                if (length >= i6) {
                    AbstractC0959k.q(objArr6, objArr6, i5, i4, m4);
                } else {
                    AbstractC0959k.q(objArr6, objArr6, i5, i4, i4 + length);
                    Object[] objArr7 = this.f9162i;
                    AbstractC0959k.q(objArr7, objArr7, 0, this.f9161h + length, m4);
                }
            }
            this.f9161h = i5;
            g(k(m4 - size), collection);
        } else {
            int i7 = m4 + size;
            if (m4 < m3) {
                int i8 = size + m3;
                Object[] objArr8 = this.f9162i;
                if (i8 <= objArr8.length) {
                    AbstractC0959k.q(objArr8, objArr8, i7, m4, m3);
                } else if (i7 >= objArr8.length) {
                    AbstractC0959k.q(objArr8, objArr8, i7 - objArr8.length, m4, m3);
                } else {
                    int length2 = m3 - (i8 - objArr8.length);
                    AbstractC0959k.q(objArr8, objArr8, 0, length2, m3);
                    Object[] objArr9 = this.f9162i;
                    AbstractC0959k.q(objArr9, objArr9, i7, m4, length2);
                }
            } else {
                Object[] objArr10 = this.f9162i;
                AbstractC0959k.q(objArr10, objArr10, size, 0, m3);
                Object[] objArr11 = this.f9162i;
                if (i7 >= objArr11.length) {
                    AbstractC0959k.q(objArr11, objArr11, i7 - objArr11.length, m4, objArr11.length);
                } else {
                    AbstractC0959k.q(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f9162i;
                    AbstractC0959k.q(objArr12, objArr12, i7, m4, objArr12.length - size);
                }
            }
            g(m4, collection);
        }
        return true;
    }

    @Override // n2.AbstractC0954f
    public final Object b(int i2) {
        int i3 = this.f9163j;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
        if (i2 == AbstractC0963o.u(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            n();
            int m3 = m(AbstractC0963o.u(this) + this.f9161h);
            Object[] objArr = this.f9162i;
            Object obj = objArr[m3];
            objArr[m3] = null;
            this.f9163j--;
            return obj;
        }
        if (i2 == 0) {
            return o();
        }
        n();
        int m4 = m(this.f9161h + i2);
        Object[] objArr2 = this.f9162i;
        Object obj2 = objArr2[m4];
        if (i2 < (this.f9163j >> 1)) {
            int i4 = this.f9161h;
            if (m4 >= i4) {
                AbstractC0959k.q(objArr2, objArr2, i4 + 1, i4, m4);
            } else {
                AbstractC0959k.q(objArr2, objArr2, 1, 0, m4);
                Object[] objArr3 = this.f9162i;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i5 = this.f9161h;
                AbstractC0959k.q(objArr3, objArr3, i5 + 1, i5, objArr3.length - 1);
            }
            Object[] objArr4 = this.f9162i;
            int i6 = this.f9161h;
            objArr4[i6] = null;
            this.f9161h = i(i6);
        } else {
            int m5 = m(AbstractC0963o.u(this) + this.f9161h);
            if (m4 <= m5) {
                Object[] objArr5 = this.f9162i;
                AbstractC0959k.q(objArr5, objArr5, m4, m4 + 1, m5 + 1);
            } else {
                Object[] objArr6 = this.f9162i;
                AbstractC0959k.q(objArr6, objArr6, m4, m4 + 1, objArr6.length);
                Object[] objArr7 = this.f9162i;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC0959k.q(objArr7, objArr7, 0, 1, m5 + 1);
            }
            this.f9162i[m5] = null;
        }
        this.f9163j--;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            l(this.f9161h, m(a() + this.f9161h));
        }
        this.f9161h = 0;
        this.f9163j = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(Object obj) {
        n();
        h(this.f9163j + 1);
        int i2 = this.f9161h;
        if (i2 == 0) {
            Object[] objArr = this.f9162i;
            z2.h.f(objArr, "<this>");
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f9161h = i3;
        this.f9162i[i3] = obj;
        this.f9163j++;
    }

    public final void f(Object obj) {
        n();
        h(a() + 1);
        this.f9162i[m(a() + this.f9161h)] = obj;
        this.f9163j = a() + 1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f9162i[this.f9161h];
    }

    public final void g(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f9162i.length;
        while (i2 < length && it.hasNext()) {
            this.f9162i[i2] = it.next();
            i2++;
        }
        int i3 = this.f9161h;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f9162i[i4] = it.next();
        }
        this.f9163j = collection.size() + a();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int a3 = a();
        if (i2 < 0 || i2 >= a3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, a3, "index: ", ", size: "));
        }
        return this.f9162i[m(this.f9161h + i2)];
    }

    public final void h(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f9162i;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f9160k) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f9162i = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        AbstractC0959k.q(objArr, objArr2, 0, this.f9161h, objArr.length);
        Object[] objArr3 = this.f9162i;
        int length2 = objArr3.length;
        int i4 = this.f9161h;
        AbstractC0959k.q(objArr3, objArr2, length2 - i4, 0, i4);
        this.f9161h = 0;
        this.f9162i = objArr2;
    }

    public final int i(int i2) {
        z2.h.f(this.f9162i, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int m3 = m(a() + this.f9161h);
        int i3 = this.f9161h;
        if (i3 < m3) {
            while (i3 < m3) {
                if (z2.h.a(obj, this.f9162i[i3])) {
                    i2 = this.f9161h;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < m3) {
            return -1;
        }
        int length = this.f9162i.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < m3; i4++) {
                    if (z2.h.a(obj, this.f9162i[i4])) {
                        i3 = i4 + this.f9162i.length;
                        i2 = this.f9161h;
                    }
                }
                return -1;
            }
            if (z2.h.a(obj, this.f9162i[i3])) {
                i2 = this.f9161h;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.f9162i[m(AbstractC0963o.u(this) + this.f9161h)];
    }

    public final int k(int i2) {
        return i2 < 0 ? i2 + this.f9162i.length : i2;
    }

    public final void l(int i2, int i3) {
        if (i2 < i3) {
            AbstractC0959k.u(this.f9162i, null, i2, i3);
            return;
        }
        Object[] objArr = this.f9162i;
        Arrays.fill(objArr, i2, objArr.length, (Object) null);
        AbstractC0959k.u(this.f9162i, null, 0, i3);
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f9162i[m(AbstractC0963o.u(this) + this.f9161h)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int m3 = m(this.f9163j + this.f9161h);
        int i3 = this.f9161h;
        if (i3 < m3) {
            length = m3 - 1;
            if (i3 <= length) {
                while (!z2.h.a(obj, this.f9162i[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f9161h;
                return length - i2;
            }
            return -1;
        }
        if (i3 > m3) {
            int i4 = m3 - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f9162i;
                    z2.h.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f9161h;
                    if (i5 <= length) {
                        while (!z2.h.a(obj, this.f9162i[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f9161h;
                    }
                } else {
                    if (z2.h.a(obj, this.f9162i[i4])) {
                        length = i4 + this.f9162i.length;
                        i2 = this.f9161h;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    public final int m(int i2) {
        Object[] objArr = this.f9162i;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    public final Object o() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        Object[] objArr = this.f9162i;
        int i2 = this.f9161h;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f9161h = i(i2);
        this.f9163j = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int m3;
        z2.h.f(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f9162i.length != 0) {
            int m4 = m(this.f9163j + this.f9161h);
            int i2 = this.f9161h;
            if (i2 < m4) {
                m3 = i2;
                while (i2 < m4) {
                    Object obj = this.f9162i[i2];
                    if (!collection.contains(obj)) {
                        this.f9162i[m3] = obj;
                        m3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                AbstractC0959k.u(this.f9162i, null, m3, m4);
            } else {
                int length = this.f9162i.length;
                boolean z4 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f9162i;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (!collection.contains(obj2)) {
                        this.f9162i[i3] = obj2;
                        i3++;
                    } else {
                        z4 = true;
                    }
                    i2++;
                }
                m3 = m(i3);
                for (int i4 = 0; i4 < m4; i4++) {
                    Object[] objArr2 = this.f9162i;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (!collection.contains(obj3)) {
                        this.f9162i[m3] = obj3;
                        m3 = i(m3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                n();
                this.f9163j = k(m3 - this.f9161h);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        AbstractC0949a.g(i2, i3, this.f9163j);
        int i4 = i3 - i2;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.f9163j) {
            clear();
            return;
        }
        if (i4 == 1) {
            b(i2);
            return;
        }
        n();
        if (i2 < this.f9163j - i3) {
            int m3 = m((i2 - 1) + this.f9161h);
            int m4 = m((i3 - 1) + this.f9161h);
            while (i2 > 0) {
                int i5 = m3 + 1;
                int min = Math.min(i2, Math.min(i5, m4 + 1));
                Object[] objArr = this.f9162i;
                int i6 = m4 - min;
                int i7 = m3 - min;
                AbstractC0959k.q(objArr, objArr, i6 + 1, i7 + 1, i5);
                m3 = k(i7);
                m4 = k(i6);
                i2 -= min;
            }
            int m5 = m(this.f9161h + i4);
            l(this.f9161h, m5);
            this.f9161h = m5;
        } else {
            int m6 = m(this.f9161h + i3);
            int m7 = m(this.f9161h + i2);
            int i8 = this.f9163j;
            while (true) {
                i8 -= i3;
                if (i8 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f9162i;
                i3 = Math.min(i8, Math.min(objArr2.length - m6, objArr2.length - m7));
                Object[] objArr3 = this.f9162i;
                int i9 = m6 + i3;
                AbstractC0959k.q(objArr3, objArr3, m7, m6, i9);
                m6 = m(i9);
                m7 = m(m7 + i3);
            }
            int m8 = m(this.f9163j + this.f9161h);
            l(k(m8 - i4), m8);
        }
        this.f9163j -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int m3;
        z2.h.f(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f9162i.length != 0) {
            int m4 = m(this.f9163j + this.f9161h);
            int i2 = this.f9161h;
            if (i2 < m4) {
                m3 = i2;
                while (i2 < m4) {
                    Object obj = this.f9162i[i2];
                    if (collection.contains(obj)) {
                        this.f9162i[m3] = obj;
                        m3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                AbstractC0959k.u(this.f9162i, null, m3, m4);
            } else {
                int length = this.f9162i.length;
                boolean z4 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f9162i;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f9162i[i3] = obj2;
                        i3++;
                    } else {
                        z4 = true;
                    }
                    i2++;
                }
                m3 = m(i3);
                for (int i4 = 0; i4 < m4; i4++) {
                    Object[] objArr2 = this.f9162i;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f9162i[m3] = obj3;
                        m3 = i(m3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                n();
                this.f9163j = k(m3 - this.f9161h);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int a3 = a();
        if (i2 < 0 || i2 >= a3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, a3, "index: ", ", size: "));
        }
        int m3 = m(this.f9161h + i2);
        Object[] objArr = this.f9162i;
        Object obj2 = objArr[m3];
        objArr[m3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        z2.h.f(objArr, "array");
        int length = objArr.length;
        int i2 = this.f9163j;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            z2.h.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int m3 = m(this.f9163j + this.f9161h);
        int i3 = this.f9161h;
        if (i3 < m3) {
            AbstractC0959k.s(this.f9162i, objArr, i3, m3, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f9162i;
            AbstractC0959k.q(objArr2, objArr, 0, this.f9161h, objArr2.length);
            Object[] objArr3 = this.f9162i;
            AbstractC0959k.q(objArr3, objArr, objArr3.length - this.f9161h, 0, m3);
        }
        int i4 = this.f9163j;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        z2.h.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        n();
        h(collection.size() + a());
        g(m(a() + this.f9161h), collection);
        return true;
    }
}
