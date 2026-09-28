package T;

import H.U2;
import J.C0257c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class r implements A, List, RandomAccess, A2.c {

    /* renamed from: h, reason: collision with root package name */
    public q f5725h;

    public r() {
        N.j jVar = N.j.f4971j;
        q qVar = new q(jVar);
        if (n.f5709a.d() != null) {
            q qVar2 = new q(jVar);
            qVar2.f5647a = 1;
            qVar.f5648b = qVar2;
        }
        this.f5725h = qVar;
    }

    @Override // T.A
    public final C a() {
        return this.f5725h;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i2;
        N.c cVar;
        boolean z3;
        AbstractC0379g k3;
        do {
            Object obj2 = s.f5726a;
            synchronized (obj2) {
                q qVar = this.f5725h;
                z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) n.i(qVar);
                i2 = qVar2.f5723d;
                cVar = qVar2.f5722c;
            }
            z2.h.c(cVar);
            N.c e3 = cVar.e(obj);
            z3 = false;
            if (z2.h.a(e3, cVar)) {
                return false;
            }
            q qVar3 = this.f5725h;
            z2.h.d(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f5710b) {
                k3 = n.k();
                q qVar4 = (q) n.w(qVar3, this, k3);
                synchronized (obj2) {
                    int i3 = qVar4.f5723d;
                    if (i3 == i2) {
                        qVar4.f5722c = e3;
                        qVar4.f5724e++;
                        qVar4.f5723d = i3 + 1;
                        z3 = true;
                    }
                }
            }
            n.n(k3, this);
        } while (!z3);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        return h(new U2(i2, collection));
    }

    @Override // T.A
    public final void b(C c3) {
        c3.f5648b = this.f5725h;
        this.f5725h = (q) c3;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC0379g k3;
        q qVar = this.f5725h;
        z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (n.f5710b) {
            k3 = n.k();
            q qVar2 = (q) n.w(qVar, this, k3);
            synchronized (s.f5726a) {
                qVar2.f5722c = N.j.f4971j;
                qVar2.f5723d++;
                qVar2.f5724e++;
            }
        }
        n.n(k3, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return f().f5722c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return f().f5722c.containsAll(collection);
    }

    public final q f() {
        q qVar = this.f5725h;
        z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (q) n.t(qVar, this);
    }

    public final int g() {
        q qVar = this.f5725h;
        z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((q) n.i(qVar)).f5724e;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return f().f5722c.get(i2);
    }

    public final boolean h(y2.c cVar) {
        int i2;
        N.c cVar2;
        Object l3;
        AbstractC0379g k3;
        boolean z3;
        do {
            Object obj = s.f5726a;
            synchronized (obj) {
                q qVar = this.f5725h;
                z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) n.i(qVar);
                i2 = qVar2.f5723d;
                cVar2 = qVar2.f5722c;
            }
            z2.h.c(cVar2);
            N.g g3 = cVar2.g();
            l3 = cVar.l(g3);
            N.c e3 = g3.e();
            if (z2.h.a(e3, cVar2)) {
                break;
            }
            q qVar3 = this.f5725h;
            z2.h.d(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f5710b) {
                k3 = n.k();
                q qVar4 = (q) n.w(qVar3, this, k3);
                synchronized (obj) {
                    int i3 = qVar4.f5723d;
                    if (i3 == i2) {
                        qVar4.f5722c = e3;
                        qVar4.f5723d = i3 + 1;
                        z3 = true;
                        qVar4.f5724e++;
                    } else {
                        z3 = false;
                    }
                }
            }
            n.n(k3, this);
        } while (!z3);
        return ((Boolean) l3).booleanValue();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return f().f5722c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return f().f5722c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return f().f5722c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new x(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        int i3;
        N.c cVar;
        AbstractC0379g k3;
        boolean z3;
        Object obj = get(i2);
        do {
            Object obj2 = s.f5726a;
            synchronized (obj2) {
                q qVar = this.f5725h;
                z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) n.i(qVar);
                i3 = qVar2.f5723d;
                cVar = qVar2.f5722c;
            }
            z2.h.c(cVar);
            N.c i4 = cVar.i(i2);
            if (z2.h.a(i4, cVar)) {
                break;
            }
            q qVar3 = this.f5725h;
            z2.h.d(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f5710b) {
                k3 = n.k();
                q qVar4 = (q) n.w(qVar3, this, k3);
                synchronized (obj2) {
                    int i5 = qVar4.f5723d;
                    if (i5 == i3) {
                        qVar4.f5722c = i4;
                        z3 = true;
                        qVar4.f5724e++;
                        qVar4.f5723d = i5 + 1;
                    } else {
                        z3 = false;
                    }
                }
            }
            n.n(k3, this);
        } while (!z3);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i2;
        N.c cVar;
        boolean z3;
        AbstractC0379g k3;
        do {
            Object obj = s.f5726a;
            synchronized (obj) {
                q qVar = this.f5725h;
                z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) n.i(qVar);
                i2 = qVar2.f5723d;
                cVar = qVar2.f5722c;
            }
            z2.h.c(cVar);
            N.c h2 = cVar.h(new N.b(0, collection));
            z3 = false;
            if (z2.h.a(h2, cVar)) {
                return false;
            }
            q qVar3 = this.f5725h;
            z2.h.d(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f5710b) {
                k3 = n.k();
                q qVar4 = (q) n.w(qVar3, this, k3);
                synchronized (obj) {
                    int i3 = qVar4.f5723d;
                    if (i3 == i2) {
                        qVar4.f5722c = h2;
                        qVar4.f5724e++;
                        qVar4.f5723d = i3 + 1;
                        z3 = true;
                    }
                }
            }
            n.n(k3, this);
        } while (!z3);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return h(new N.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        int i3;
        N.c cVar;
        AbstractC0379g k3;
        boolean z3;
        Object obj2 = get(i2);
        do {
            Object obj3 = s.f5726a;
            synchronized (obj3) {
                q qVar = this.f5725h;
                z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) n.i(qVar);
                i3 = qVar2.f5723d;
                cVar = qVar2.f5722c;
            }
            z2.h.c(cVar);
            N.c j3 = cVar.j(i2, obj);
            if (z2.h.a(j3, cVar)) {
                break;
            }
            q qVar3 = this.f5725h;
            z2.h.d(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f5710b) {
                k3 = n.k();
                q qVar4 = (q) n.w(qVar3, this, k3);
                synchronized (obj3) {
                    int i4 = qVar4.f5723d;
                    if (i4 == i3) {
                        qVar4.f5722c = j3;
                        qVar4.f5723d = i4 + 1;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            n.n(k3, this);
        } while (!z3);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return f().f5722c.a();
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        if (i2 >= 0 && i2 <= i3 && i3 <= size()) {
            return new E(this, i2, i3);
        }
        C0257c.W("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return z2.g.a(this);
    }

    public final String toString() {
        q qVar = this.f5725h;
        z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((q) n.i(qVar)).f5722c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i2;
        N.c cVar;
        boolean z3;
        AbstractC0379g k3;
        do {
            Object obj = s.f5726a;
            synchronized (obj) {
                q qVar = this.f5725h;
                z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) n.i(qVar);
                i2 = qVar2.f5723d;
                cVar = qVar2.f5722c;
            }
            z2.h.c(cVar);
            N.c f3 = cVar.f(collection);
            z3 = false;
            if (z2.h.a(f3, cVar)) {
                return false;
            }
            q qVar3 = this.f5725h;
            z2.h.d(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f5710b) {
                k3 = n.k();
                q qVar4 = (q) n.w(qVar3, this, k3);
                synchronized (obj) {
                    int i3 = qVar4.f5723d;
                    if (i3 == i2) {
                        qVar4.f5722c = f3;
                        qVar4.f5724e++;
                        qVar4.f5723d = i3 + 1;
                        z3 = true;
                    }
                }
            }
            n.n(k3, this);
        } while (!z3);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new x(this, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return z2.g.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        N.c cVar;
        AbstractC0379g k3;
        boolean z3;
        do {
            Object obj2 = s.f5726a;
            synchronized (obj2) {
                q qVar = this.f5725h;
                z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) n.i(qVar);
                i3 = qVar2.f5723d;
                cVar = qVar2.f5722c;
            }
            z2.h.c(cVar);
            N.c b3 = cVar.b(i2, obj);
            if (z2.h.a(b3, cVar)) {
                return;
            }
            q qVar3 = this.f5725h;
            z2.h.d(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f5710b) {
                k3 = n.k();
                q qVar4 = (q) n.w(qVar3, this, k3);
                synchronized (obj2) {
                    int i4 = qVar4.f5723d;
                    if (i4 == i3) {
                        qVar4.f5722c = b3;
                        z3 = true;
                        qVar4.f5724e++;
                        qVar4.f5723d = i4 + 1;
                    } else {
                        z3 = false;
                    }
                }
            }
            n.n(k3, this);
        } while (!z3);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i2;
        N.c cVar;
        boolean z3;
        AbstractC0379g k3;
        do {
            Object obj2 = s.f5726a;
            synchronized (obj2) {
                q qVar = this.f5725h;
                z2.h.d(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                q qVar2 = (q) n.i(qVar);
                i2 = qVar2.f5723d;
                cVar = qVar2.f5722c;
            }
            z2.h.c(cVar);
            int indexOf = cVar.indexOf(obj);
            N.c i3 = indexOf != -1 ? cVar.i(indexOf) : cVar;
            z3 = false;
            if (z2.h.a(i3, cVar)) {
                return false;
            }
            q qVar3 = this.f5725h;
            z2.h.d(qVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f5710b) {
                k3 = n.k();
                q qVar4 = (q) n.w(qVar3, this, k3);
                synchronized (obj2) {
                    int i4 = qVar4.f5723d;
                    if (i4 == i2) {
                        qVar4.f5722c = i3;
                        qVar4.f5724e++;
                        qVar4.f5723d = i4 + 1;
                        z3 = true;
                    }
                }
            }
            n.n(k3, this);
        } while (!z3);
        return true;
    }
}
