package m2;

import java.util.Collection;
import java.util.Iterator;
import n0.C0919B;
import n2.AbstractC0961m;

/* renamed from: m2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0872n implements Collection, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8655h = 1;

    public abstract int a();

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (z2.h.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        z2.h.f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return z2.g.a(this);
    }

    public String toString() {
        switch (this.f8655h) {
            case 1:
                return AbstractC0961m.L(this, ", ", "[", "]", new C0919B(3, this), 24);
            default:
                return super.toString();
        }
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        z2.h.f(objArr, "array");
        return z2.g.b(this, objArr);
    }
}
