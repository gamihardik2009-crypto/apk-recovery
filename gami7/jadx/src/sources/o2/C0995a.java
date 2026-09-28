package o2;

import T.x;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import n2.AbstractC0949a;
import n2.AbstractC0954f;
import n2.AbstractC0959k;
import n2.AbstractC0962n;
import t0.AbstractC1265x;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995a extends AbstractC0954f implements RandomAccess, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public Object[] f9326h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9327i;

    /* renamed from: j, reason: collision with root package name */
    public int f9328j;

    /* renamed from: k, reason: collision with root package name */
    public final C0995a f9329k;

    /* renamed from: l, reason: collision with root package name */
    public final C0996b f9330l;

    public C0995a(Object[] objArr, int i2, int i3, C0995a c0995a, C0996b c0996b) {
        int i4;
        z2.h.f(objArr, "backing");
        z2.h.f(c0996b, "root");
        this.f9326h = objArr;
        this.f9327i = i2;
        this.f9328j = i3;
        this.f9329k = c0995a;
        this.f9330l = c0996b;
        i4 = ((AbstractList) c0996b).modCount;
        ((AbstractList) this).modCount = i4;
    }

    @Override // n2.AbstractC0954f
    public final int a() {
        h();
        return this.f9328j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.f9327i + this.f9328j, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        z2.h.f(collection, "elements");
        i();
        h();
        int size = collection.size();
        f(this.f9327i + this.f9328j, collection, size);
        return size > 0;
    }

    @Override // n2.AbstractC0954f
    public final Object b(int i2) {
        i();
        h();
        int i3 = this.f9328j;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
        return j(this.f9327i + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.f9327i, this.f9328j);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj != this) {
            if (obj instanceof List) {
                if (AbstractC0962n.b(this.f9326h, this.f9327i, this.f9328j, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        C0996b c0996b = this.f9330l;
        C0995a c0995a = this.f9329k;
        if (c0995a != null) {
            c0995a.f(i2, collection, i3);
        } else {
            C0996b c0996b2 = C0996b.f9331k;
            c0996b.f(i2, collection, i3);
        }
        this.f9326h = c0996b.f9332h;
        this.f9328j += i3;
    }

    public final void g(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        C0996b c0996b = this.f9330l;
        C0995a c0995a = this.f9329k;
        if (c0995a != null) {
            c0995a.g(i2, obj);
        } else {
            C0996b c0996b2 = C0996b.f9331k;
            c0996b.g(i2, obj);
        }
        this.f9326h = c0996b.f9332h;
        this.f9328j++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        h();
        int i3 = this.f9328j;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
        return this.f9326h[this.f9327i + i2];
    }

    public final void h() {
        int i2;
        i2 = ((AbstractList) this.f9330l).modCount;
        if (i2 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        Object[] objArr = this.f9326h;
        int i2 = this.f9328j;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[this.f9327i + i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public final void i() {
        if (this.f9330l.f9334j) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i2 = 0; i2 < this.f9328j; i2++) {
            if (z2.h.a(this.f9326h[this.f9327i + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.f9328j == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i2) {
        Object j3;
        ((AbstractList) this).modCount++;
        C0995a c0995a = this.f9329k;
        if (c0995a != null) {
            j3 = c0995a.j(i2);
        } else {
            C0996b c0996b = C0996b.f9331k;
            j3 = this.f9330l.j(i2);
        }
        this.f9328j--;
        return j3;
    }

    public final void k(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0995a c0995a = this.f9329k;
        if (c0995a != null) {
            c0995a.k(i2, i3);
        } else {
            C0996b c0996b = C0996b.f9331k;
            this.f9330l.k(i2, i3);
        }
        this.f9328j -= i3;
    }

    public final int l(int i2, int i3, Collection collection, boolean z3) {
        int l3;
        C0995a c0995a = this.f9329k;
        if (c0995a != null) {
            l3 = c0995a.l(i2, i3, collection, z3);
        } else {
            C0996b c0996b = C0996b.f9331k;
            l3 = this.f9330l.l(i2, i3, collection, z3);
        }
        if (l3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f9328j -= l3;
        return l3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i2 = this.f9328j - 1; i2 >= 0; i2--) {
            if (z2.h.a(this.f9326h[this.f9327i + i2], obj)) {
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
        i();
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
        i();
        h();
        return l(this.f9327i, this.f9328j, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        z2.h.f(collection, "elements");
        i();
        h();
        return l(this.f9327i, this.f9328j, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        i();
        h();
        int i3 = this.f9328j;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
        Object[] objArr = this.f9326h;
        int i4 = this.f9327i;
        Object obj2 = objArr[i4 + i2];
        objArr[i4 + i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        AbstractC0949a.g(i2, i3, this.f9328j);
        return new C0995a(this.f9326h, this.f9327i + i2, i3 - i2, this, this.f9330l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        z2.h.f(objArr, "array");
        h();
        int length = objArr.length;
        int i2 = this.f9328j;
        int i3 = this.f9327i;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f9326h, i3, i2 + i3, objArr.getClass());
            z2.h.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC0959k.q(this.f9326h, objArr, 0, i3, i2 + i3);
        int i4 = this.f9328j;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return AbstractC0962n.c(this.f9326h, this.f9327i, this.f9328j, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        h();
        int i3 = this.f9328j;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
        }
        return new x(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        i();
        h();
        int i3 = this.f9328j;
        if (i2 >= 0 && i2 <= i3) {
            g(this.f9327i + i2, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        z2.h.f(collection, "elements");
        i();
        h();
        int i3 = this.f9328j;
        if (i2 >= 0 && i2 <= i3) {
            int size = collection.size();
            f(this.f9327i + i2, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, i3, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.f9326h;
        int i2 = this.f9328j;
        int i3 = this.f9327i;
        return AbstractC0959k.t(objArr, i3, i2 + i3);
    }
}
