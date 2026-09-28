package L;

import a.AbstractC0423a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import z2.g;
import z2.h;

/* loaded from: classes.dex */
public final class b implements List, A2.c {

    /* renamed from: h, reason: collision with root package name */
    public final List f4613h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4614i;

    /* renamed from: j, reason: collision with root package name */
    public int f4615j;

    public b(List list, int i2, int i3) {
        this.f4613h = list;
        this.f4614i = i2;
        this.f4615j = i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i2 = this.f4615j;
        this.f4615j = i2 + 1;
        this.f4613h.add(i2, obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        this.f4613h.addAll(i2 + this.f4614i, collection);
        this.f4615j = collection.size() + this.f4615j;
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i2 = this.f4615j - 1;
        int i3 = this.f4614i;
        if (i3 <= i2) {
            while (true) {
                this.f4613h.remove(i2);
                if (i2 == i3) {
                    break;
                } else {
                    i2--;
                }
            }
        }
        this.f4615j = i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i2 = this.f4615j;
        for (int i3 = this.f4614i; i3 < i2; i3++) {
            if (h.a(this.f4613h.get(i3), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0423a.u(i2, this);
        return this.f4613h.get(i2 + this.f4614i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i2 = this.f4615j;
        int i3 = this.f4614i;
        for (int i4 = i3; i4 < i2; i4++) {
            if (h.a(this.f4613h.get(i4), obj)) {
                return i4 - i3;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f4615j == this.f4614i;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i2 = this.f4615j - 1;
        int i3 = this.f4614i;
        if (i3 > i2) {
            return -1;
        }
        while (!h.a(this.f4613h.get(i2), obj)) {
            if (i2 == i3) {
                return -1;
            }
            i2--;
        }
        return i2 - i3;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i2 = this.f4615j;
        for (int i3 = this.f4614i; i3 < i2; i3++) {
            List list = this.f4613h;
            if (h.a(list.get(i3), obj)) {
                list.remove(i3);
                this.f4615j--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i2 = this.f4615j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i2 != this.f4615j;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i2 = this.f4615j;
        int i3 = i2 - 1;
        int i4 = this.f4614i;
        if (i4 <= i3) {
            while (true) {
                List list = this.f4613h;
                if (!collection.contains(list.get(i3))) {
                    list.remove(i3);
                    this.f4615j--;
                }
                if (i3 == i4) {
                    break;
                }
                i3--;
            }
        }
        return i2 != this.f4615j;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        AbstractC0423a.u(i2, this);
        return this.f4613h.set(i2 + this.f4614i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f4615j - this.f4614i;
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
        this.f4613h.add(i2 + this.f4614i, obj);
        this.f4615j++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new c(i2, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return g.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f4613h.addAll(this.f4615j, collection);
        this.f4615j = collection.size() + this.f4615j;
        return collection.size() > 0;
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        AbstractC0423a.u(i2, this);
        this.f4615j--;
        return this.f4613h.remove(i2 + this.f4614i);
    }
}
