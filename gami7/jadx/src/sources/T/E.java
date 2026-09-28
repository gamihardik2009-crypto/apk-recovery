package T;

import J.C0257c;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import n2.AbstractC0974z;

/* loaded from: classes.dex */
public final class E implements List, A2.c {

    /* renamed from: h, reason: collision with root package name */
    public final r f5652h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5653i;

    /* renamed from: j, reason: collision with root package name */
    public int f5654j;

    /* renamed from: k, reason: collision with root package name */
    public int f5655k;

    public E(r rVar, int i2, int i3) {
        this.f5652h = rVar;
        this.f5653i = i2;
        this.f5654j = rVar.g();
        this.f5655k = i3 - i2;
    }

    public final void a() {
        if (this.f5652h.g() != this.f5654j) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i2 = this.f5653i + this.f5655k;
        r rVar = this.f5652h;
        rVar.add(i2, obj);
        this.f5655k++;
        this.f5654j = rVar.g();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f5655k, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i2;
        N.c cVar;
        AbstractC0379g k3;
        boolean z3;
        if (this.f5655k > 0) {
            a();
            r rVar = this.f5652h;
            int i3 = this.f5653i;
            int i4 = this.f5655k + i3;
            rVar.getClass();
            do {
                Object obj = s.f5726a;
                synchronized (obj) {
                    q qVar = rVar.f5725h;
                    z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    q qVar2 = (q) n.i(qVar);
                    i2 = qVar2.f5723d;
                    cVar = qVar2.f5722c;
                }
                z2.h.c(cVar);
                N.g g3 = cVar.g();
                g3.subList(i3, i4).clear();
                N.c e3 = g3.e();
                if (z2.h.a(e3, cVar)) {
                    break;
                }
                q qVar3 = rVar.f5725h;
                z2.h.d(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (n.f5710b) {
                    k3 = n.k();
                    q qVar4 = (q) n.w(qVar3, rVar, k3);
                    synchronized (obj) {
                        int i5 = qVar4.f5723d;
                        if (i5 == i2) {
                            qVar4.f5722c = e3;
                            qVar4.f5723d = i5 + 1;
                            z3 = true;
                            qVar4.f5724e++;
                        } else {
                            z3 = false;
                        }
                    }
                }
                n.n(k3, rVar);
            } while (!z3);
            this.f5655k = 0;
            this.f5654j = this.f5652h.g();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
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

    @Override // java.util.List
    public final Object get(int i2) {
        a();
        s.a(i2, this.f5655k);
        return this.f5652h.get(this.f5653i + i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i2 = this.f5655k;
        int i3 = this.f5653i;
        Iterator it = B1.C.m0(i3, i2 + i3).iterator();
        while (it.hasNext()) {
            int a3 = ((AbstractC0974z) it).a();
            if (z2.h.a(obj, this.f5652h.get(a3))) {
                return a3 - i3;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5655k == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i2 = this.f5655k;
        int i3 = this.f5653i;
        for (int i4 = (i2 + i3) - 1; i4 >= i3; i4--) {
            if (z2.h.a(obj, this.f5652h.get(i4))) {
                return i4 - i3;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z3 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z3) {
                    z3 = true;
                }
            }
            return z3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i2;
        N.c cVar;
        AbstractC0379g k3;
        boolean z3;
        a();
        r rVar = this.f5652h;
        int i3 = this.f5653i;
        int i4 = this.f5655k + i3;
        int size = rVar.size();
        do {
            Object obj = s.f5726a;
            synchronized (obj) {
                q qVar = rVar.f5725h;
                z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) n.i(qVar);
                i2 = qVar2.f5723d;
                cVar = qVar2.f5722c;
            }
            z2.h.c(cVar);
            N.g g3 = cVar.g();
            g3.subList(i3, i4).retainAll(collection);
            N.c e3 = g3.e();
            if (z2.h.a(e3, cVar)) {
                break;
            }
            q qVar3 = rVar.f5725h;
            z2.h.d(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f5710b) {
                k3 = n.k();
                q qVar4 = (q) n.w(qVar3, rVar, k3);
                synchronized (obj) {
                    int i5 = qVar4.f5723d;
                    if (i5 == i2) {
                        qVar4.f5722c = e3;
                        qVar4.f5723d = i5 + 1;
                        qVar4.f5724e++;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            n.n(k3, rVar);
        } while (!z3);
        int size2 = size - rVar.size();
        if (size2 > 0) {
            this.f5654j = this.f5652h.g();
            this.f5655k -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        s.a(i2, this.f5655k);
        a();
        int i3 = i2 + this.f5653i;
        r rVar = this.f5652h;
        Object obj2 = rVar.set(i3, obj);
        this.f5654j = rVar.g();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5655k;
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        if (!(i2 >= 0 && i2 <= i3 && i3 <= this.f5655k)) {
            C0257c.W("fromIndex or toIndex are out of bounds");
            throw null;
        }
        a();
        int i4 = this.f5653i;
        return new E(this.f5652h, i2 + i4, i3 + i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return z2.g.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        a();
        z2.q qVar = new z2.q();
        qVar.f11907h = i2 - 1;
        return new D(qVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return z2.g.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        a();
        int i3 = i2 + this.f5653i;
        r rVar = this.f5652h;
        boolean addAll = rVar.addAll(i3, collection);
        if (addAll) {
            this.f5655k = collection.size() + this.f5655k;
            this.f5654j = rVar.g();
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        a();
        int i3 = this.f5653i + i2;
        r rVar = this.f5652h;
        Object remove = rVar.remove(i3);
        this.f5655k--;
        this.f5654j = rVar.g();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        a();
        int i3 = this.f5653i + i2;
        r rVar = this.f5652h;
        rVar.add(i3, obj);
        this.f5655k++;
        this.f5654j = rVar.g();
    }
}
