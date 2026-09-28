package T;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import n2.AbstractC0946A;
import n2.AbstractC0953e;
import n2.AbstractC0961m;
import n2.AbstractC0964p;

/* loaded from: classes.dex */
public final class o implements Set, A2.f {

    /* renamed from: h, reason: collision with root package name */
    public final u f5720h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5721i;

    public o(u uVar, int i2) {
        this.f5721i = i2;
        this.f5720h = uVar;
    }

    private final boolean a(Collection collection) {
        M.e eVar;
        int i2;
        boolean z3;
        AbstractC0379g k3;
        Collection<Map.Entry> collection2 = collection;
        int m3 = AbstractC0946A.m(AbstractC0964p.z(collection2, 10));
        if (m3 < 16) {
            m3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        u uVar = this.f5720h;
        boolean z4 = false;
        do {
            synchronized (s.f5727b) {
                t tVar = uVar.f5730h;
                z2.h.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                t tVar2 = (t) n.i(tVar);
                eVar = tVar2.f5728c;
                i2 = tVar2.f5729d;
            }
            z2.h.c(eVar);
            M.d d3 = eVar.d();
            Iterator it = uVar.f5731i.iterator();
            while (true) {
                z3 = true;
                if (!((z) it).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((z) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !z2.h.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    d3.remove(entry2.getKey());
                    z4 = true;
                }
            }
            M.e c3 = d3.c();
            if (z2.h.a(c3, eVar)) {
                break;
            }
            t tVar3 = uVar.f5730h;
            z2.h.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f5710b) {
                k3 = n.k();
                t tVar4 = (t) n.w(tVar3, uVar, k3);
                synchronized (s.f5727b) {
                    int i3 = tVar4.f5729d;
                    if (i3 == i2) {
                        tVar4.f5728c = c3;
                        tVar4.f5729d = i3 + 1;
                    } else {
                        z3 = false;
                    }
                }
            }
            n.n(k3, uVar);
        } while (!z3);
        return z4;
    }

    private final boolean b(Collection collection) {
        M.e eVar;
        int i2;
        boolean z3;
        AbstractC0379g k3;
        Set b02 = AbstractC0961m.b0(collection);
        u uVar = this.f5720h;
        boolean z4 = false;
        do {
            synchronized (s.f5727b) {
                t tVar = uVar.f5730h;
                z2.h.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                t tVar2 = (t) n.i(tVar);
                eVar = tVar2.f5728c;
                i2 = tVar2.f5729d;
            }
            z2.h.c(eVar);
            M.d d3 = eVar.d();
            Iterator it = uVar.f5731i.iterator();
            while (true) {
                z3 = true;
                if (!((z) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((z) it).next();
                if (!b02.contains(entry.getKey())) {
                    d3.remove(entry.getKey());
                    z4 = true;
                }
            }
            M.e c3 = d3.c();
            if (z2.h.a(c3, eVar)) {
                break;
            }
            t tVar3 = uVar.f5730h;
            z2.h.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f5710b) {
                k3 = n.k();
                t tVar4 = (t) n.w(tVar3, uVar, k3);
                synchronized (s.f5727b) {
                    int i3 = tVar4.f5729d;
                    if (i3 == i2) {
                        tVar4.f5728c = c3;
                        tVar4.f5729d = i3 + 1;
                    } else {
                        z3 = false;
                    }
                }
            }
            n.n(k3, uVar);
        } while (!z3);
        return z4;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5721i) {
            case 0:
                s.g();
                throw null;
            case 1:
                s.g();
                throw null;
            default:
                s.g();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5721i) {
            case 0:
                s.g();
                throw null;
            case 1:
                s.g();
                throw null;
            default:
                s.g();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f5720h.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5721i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof A2.a) && !(obj instanceof A2.d))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return z2.h.a(this.f5720h.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f5720h.containsKey(obj);
            default:
                return this.f5720h.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f5721i) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!this.f5720h.containsKey(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!this.f5720h.containsValue(it3.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5720h.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5721i) {
            case 0:
                u uVar = this.f5720h;
                return new z(uVar, ((M.c) ((AbstractC0953e) uVar.f().f5728c).entrySet()).iterator(), 0);
            case 1:
                u uVar2 = this.f5720h;
                return new z(uVar2, ((M.c) ((AbstractC0953e) uVar2.f().f5728c).entrySet()).iterator(), 1);
            default:
                u uVar3 = this.f5720h;
                return new z(uVar3, ((M.c) ((AbstractC0953e) uVar3.f().f5728c).entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        switch (this.f5721i) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof A2.a) || (obj instanceof A2.d))) {
                    if (this.f5720h.remove(((Map.Entry) obj).getKey()) != null) {
                        break;
                    }
                }
                break;
            case 1:
                if (this.f5720h.remove(obj) != null) {
                }
                break;
            default:
                u uVar = this.f5720h;
                Iterator it = uVar.f5731i.iterator();
                while (true) {
                    if (((z) it).hasNext()) {
                        obj2 = ((z) it).next();
                        if (z2.h.a(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry != null) {
                    uVar.remove(entry.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        M.e eVar;
        int i2;
        boolean z3;
        AbstractC0379g k3;
        switch (this.f5721i) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z4 = false;
                    while (it.hasNext()) {
                        if (this.f5720h.remove(((Map.Entry) it.next()).getKey()) != null || z4) {
                            z4 = true;
                        }
                    }
                    return z4;
                    break;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z5 = false;
                    while (it2.hasNext()) {
                        if (this.f5720h.remove(it2.next()) != null || z5) {
                            z5 = true;
                        }
                    }
                    return z5;
                    break;
                }
                break;
            default:
                Set b02 = AbstractC0961m.b0(collection);
                u uVar = this.f5720h;
                boolean z6 = false;
                do {
                    synchronized (s.f5727b) {
                        t tVar = uVar.f5730h;
                        z2.h.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        t tVar2 = (t) n.i(tVar);
                        eVar = tVar2.f5728c;
                        i2 = tVar2.f5729d;
                    }
                    z2.h.c(eVar);
                    M.d d3 = eVar.d();
                    Iterator it3 = uVar.f5731i.iterator();
                    while (true) {
                        z3 = true;
                        if (!((z) it3).hasNext()) {
                            M.e c3 = d3.c();
                            if (!z2.h.a(c3, eVar)) {
                                t tVar3 = uVar.f5730h;
                                z2.h.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                                synchronized (n.f5710b) {
                                    k3 = n.k();
                                    t tVar4 = (t) n.w(tVar3, uVar, k3);
                                    synchronized (s.f5727b) {
                                        int i3 = tVar4.f5729d;
                                        if (i3 == i2) {
                                            tVar4.f5728c = c3;
                                            tVar4.f5729d = i3 + 1;
                                        } else {
                                            z3 = false;
                                        }
                                    }
                                }
                                n.n(k3, uVar);
                            }
                            return z6;
                        }
                        Map.Entry entry = (Map.Entry) ((z) it3).next();
                        if (b02.contains(entry.getValue())) {
                            d3.remove(entry.getKey());
                            z6 = true;
                        }
                    }
                } while (!z3);
                return z6;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        M.e eVar;
        int i2;
        boolean z3;
        AbstractC0379g k3;
        switch (this.f5721i) {
            case 0:
                return a(collection);
            case 1:
                return b(collection);
            default:
                Set b02 = AbstractC0961m.b0(collection);
                u uVar = this.f5720h;
                boolean z4 = false;
                do {
                    synchronized (s.f5727b) {
                        t tVar = uVar.f5730h;
                        z2.h.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        t tVar2 = (t) n.i(tVar);
                        eVar = tVar2.f5728c;
                        i2 = tVar2.f5729d;
                    }
                    z2.h.c(eVar);
                    M.d d3 = eVar.d();
                    Iterator it = uVar.f5731i.iterator();
                    while (true) {
                        z3 = true;
                        if (!((z) it).hasNext()) {
                            M.e c3 = d3.c();
                            if (!z2.h.a(c3, eVar)) {
                                t tVar3 = uVar.f5730h;
                                z2.h.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                                synchronized (n.f5710b) {
                                    k3 = n.k();
                                    t tVar4 = (t) n.w(tVar3, uVar, k3);
                                    synchronized (s.f5727b) {
                                        int i3 = tVar4.f5729d;
                                        if (i3 == i2) {
                                            tVar4.f5728c = c3;
                                            tVar4.f5729d = i3 + 1;
                                        } else {
                                            z3 = false;
                                        }
                                    }
                                }
                                n.n(k3, uVar);
                            }
                            return z4;
                        }
                        Map.Entry entry = (Map.Entry) ((z) it).next();
                        if (!b02.contains(entry.getValue())) {
                            d3.remove(entry.getKey());
                            z4 = true;
                        }
                    }
                } while (!z3);
                return z4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5720h.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return z2.g.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return z2.g.b(this, objArr);
    }
}
