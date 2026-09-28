package t0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: t0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259q implements List, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final int f10614h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10615i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f10616j;

    public C1259q(r rVar, int i2, int i3) {
        this.f10616j = rVar;
        this.f10614h = i2;
        this.f10615i = i3;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof V.n) && indexOf((V.n) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((V.n) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Object obj = this.f10616j.f10617h[i2 + this.f10614h];
        z2.h.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (V.n) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof V.n)) {
            return -1;
        }
        V.n nVar = (V.n) obj;
        int i2 = this.f10614h;
        int i3 = this.f10615i;
        if (i2 > i3) {
            return -1;
        }
        int i4 = i2;
        while (!z2.h.a(this.f10616j.f10617h[i4], nVar)) {
            if (i4 == i3) {
                return -1;
            }
            i4++;
        }
        return i4 - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i2 = this.f10614h;
        return new T.x(this.f10616j, i2, i2, this.f10615i);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof V.n)) {
            return -1;
        }
        V.n nVar = (V.n) obj;
        int i2 = this.f10615i;
        int i3 = this.f10614h;
        if (i3 > i2) {
            return -1;
        }
        while (!z2.h.a(this.f10616j.f10617h[i2], nVar)) {
            if (i2 == i3) {
                return -1;
            }
            i2--;
        }
        return i2 - i3;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i2 = this.f10614h;
        return new T.x(this.f10616j, i2, i2, this.f10615i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f10615i - this.f10614h;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        int i4 = this.f10614h;
        return new C1259q(this.f10616j, i2 + i4, i4 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return z2.g.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        int i3 = this.f10614h;
        int i4 = this.f10615i;
        return new T.x(this.f10616j, i2 + i3, i3, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return z2.g.b(this, objArr);
    }
}
