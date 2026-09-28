package o2;

import T.x;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import n2.AbstractC0949a;
import n2.AbstractC0954f;
import n2.AbstractC0959k;
import n2.AbstractC0962n;
import t0.AbstractC1265x;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996b extends AbstractC0954f implements RandomAccess, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final C0996b f9331k;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f9332h;

    /* renamed from: i, reason: collision with root package name */
    public int f9333i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9334j;

    static {
        C0996b c0996b = new C0996b(0);
        c0996b.f9334j = true;
        f9331k = c0996b;
    }

    public C0996b(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        this.f9332h = new Object[i2];
    }

    @Override // n2.AbstractC0954f
    public final int a() {
        return this.f9333i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i2 = this.f9333i;
        ((AbstractList) this).modCount++;
        i(i2, 1);
        this.f9332h[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        z2.h.f(collection, "elements");
        h();
        int size = collection.size();
        f(this.f9333i, collection, size);
        return size > 0;
    }

    @Override // n2.AbstractC0954f
    public final Object b(int i2) {
        h();
        int i3 = this.f9333i;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
        return j(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        k(0, this.f9333i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!AbstractC0962n.b(this.f9332h, 0, this.f9333i, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        i(i2, i3);
        Iterator it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.f9332h[i2 + i4] = it.next();
        }
    }

    public final void g(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        i(i2, 1);
        this.f9332h[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f9333i;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
        return this.f9332h[i2];
    }

    public final void h() {
        if (this.f9334j) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f9332h;
        int i2 = this.f9333i;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public final void i(int i2, int i3) {
        int i4 = this.f9333i + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f9332h;
        if (i4 > objArr.length) {
            int length = objArr.length;
            int i5 = length + (length >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            if (i5 - 2147483639 > 0) {
                i5 = i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i5);
            z2.h.e(copyOf, "copyOf(...)");
            this.f9332h = copyOf;
        }
        Object[] objArr2 = this.f9332h;
        AbstractC0959k.q(objArr2, objArr2, i2 + i3, i2, this.f9333i);
        this.f9333i += i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.f9333i; i2++) {
            if (z2.h.a(this.f9332h[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f9333i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f9332h;
        Object obj = objArr[i2];
        AbstractC0959k.q(objArr, objArr, i2, i2 + 1, this.f9333i);
        Object[] objArr2 = this.f9332h;
        int i3 = this.f9333i - 1;
        z2.h.f(objArr2, "<this>");
        objArr2[i3] = null;
        this.f9333i--;
        return obj;
    }

    public final void k(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f9332h;
        AbstractC0959k.q(objArr, objArr, i2, i2 + i3, this.f9333i);
        Object[] objArr2 = this.f9332h;
        int i4 = this.f9333i;
        AbstractC0962n.o(objArr2, i4 - i3, i4);
        this.f9333i -= i3;
    }

    public final int l(int i2, int i3, Collection collection, boolean z3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i2 + i4;
            if (collection.contains(this.f9332h[i6]) == z3) {
                Object[] objArr = this.f9332h;
                i4++;
                objArr[i5 + i2] = objArr[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        Object[] objArr2 = this.f9332h;
        AbstractC0959k.q(objArr2, objArr2, i2 + i5, i3 + i2, this.f9333i);
        Object[] objArr3 = this.f9332h;
        int i8 = this.f9333i;
        AbstractC0962n.o(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f9333i -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.f9333i - 1; i2 >= 0; i2--) {
            if (z2.h.a(this.f9332h[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        z2.h.f(collection, "elements");
        h();
        return l(0, this.f9333i, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        z2.h.f(collection, "elements");
        h();
        return l(0, this.f9333i, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        h();
        int i3 = this.f9333i;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
        Object[] objArr = this.f9332h;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        AbstractC0949a.g(i2, i3, this.f9333i);
        return new C0995a(this.f9332h, i2, i3 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        z2.h.f(objArr, "array");
        int length = objArr.length;
        int i2 = this.f9333i;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f9332h, 0, i2, objArr.getClass());
            z2.h.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC0959k.q(this.f9332h, objArr, 0, 0, i2);
        int i3 = this.f9333i;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0962n.c(this.f9332h, 0, this.f9333i, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        int i3 = this.f9333i;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
        return new x(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        z2.h.f(collection, "elements");
        h();
        int i3 = this.f9333i;
        if (i2 >= 0 && i2 <= i3) {
            int size = collection.size();
            f(i2, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        h();
        int i3 = this.f9333i;
        if (i2 >= 0 && i2 <= i3) {
            ((AbstractList) this).modCount++;
            i(i2, 1);
            this.f9332h[i2] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0959k.t(this.f9332h, 0, this.f9333i);
    }
}
