package L;

import a.AbstractC0423a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import z2.g;
import z2.h;

/* loaded from: classes.dex */
public final class a implements List, A2.c {

    /* renamed from: h, reason: collision with root package name */
    public final d f4612h;

    public a(d dVar) {
        this.f4612h = dVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f4612h.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        d dVar = this.f4612h;
        return dVar.e(dVar.f4620j, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f4612h.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4612h.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        d dVar = this.f4612h;
        dVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!dVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0423a.u(i2, this);
        return this.f4612h.f4618h[i2];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f4612h.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f4612h.k();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d dVar = this.f4612h;
        int i2 = dVar.f4620j;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = dVar.f4618h;
            while (!h.a(obj, objArr[i3])) {
                i3--;
                if (i3 < 0) {
                }
            }
            return i3;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f4612h.m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        d dVar = this.f4612h;
        dVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = dVar.f4620j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dVar.m(it.next());
        }
        return i2 != dVar.f4620j;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        d dVar = this.f4612h;
        int i2 = dVar.f4620j;
        for (int i3 = i2 - 1; -1 < i3; i3--) {
            if (!collection.contains(dVar.f4618h[i3])) {
                dVar.n(i3);
            }
        }
        return i2 != dVar.f4620j;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        AbstractC0423a.u(i2, this);
        Object[] objArr = this.f4612h.f4618h;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f4612h.f4620j;
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        AbstractC0423a.v(this, i2, i3);
        return new b(this, i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return g.a(this);
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        this.f4612h.a(i2, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new c(i2, this);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        AbstractC0423a.u(i2, this);
        return this.f4612h.n(i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return g.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        return this.f4612h.e(i2, collection);
    }
}
