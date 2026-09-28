package T;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import n2.AbstractC0953e;

/* loaded from: classes.dex */
public final class u implements A, Map, A2.e {

    /* renamed from: h, reason: collision with root package name */
    public t f5730h;

    /* renamed from: i, reason: collision with root package name */
    public final o f5731i;

    /* renamed from: j, reason: collision with root package name */
    public final o f5732j;

    /* renamed from: k, reason: collision with root package name */
    public final o f5733k;

    public u() {
        O.c cVar = O.c.f5096j;
        t tVar = new t(cVar);
        if (n.f5709a.d() != null) {
            t tVar2 = new t(cVar);
            tVar2.f5647a = 1;
            tVar.f5648b = tVar2;
        }
        this.f5730h = tVar;
        this.f5731i = new o(this, 0);
        this.f5732j = new o(this, 1);
        this.f5733k = new o(this, 2);
    }

    @Override // T.A
    public final C a() {
        return this.f5730h;
    }

    @Override // T.A
    public final void b(C c3) {
        this.f5730h = (t) c3;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC0379g k3;
        t tVar = this.f5730h;
        z2.h.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        t tVar2 = (t) n.i(tVar);
        O.c cVar = O.c.f5096j;
        if (cVar != tVar2.f5728c) {
            t tVar3 = this.f5730h;
            z2.h.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f5710b) {
                k3 = n.k();
                t tVar4 = (t) n.w(tVar3, this, k3);
                synchronized (s.f5727b) {
                    tVar4.f5728c = cVar;
                    tVar4.f5729d++;
                }
            }
            n.n(k3, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f().f5728c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return f().f5728c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f5731i;
    }

    public final t f() {
        t tVar = this.f5730h;
        z2.h.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (t) n.t(tVar, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return f().f5728c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((AbstractC0953e) f().f5728c).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f5732j;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        M.e eVar;
        int i2;
        Object put;
        AbstractC0379g k3;
        boolean z3;
        do {
            Object obj3 = s.f5727b;
            synchronized (obj3) {
                t tVar = this.f5730h;
                z2.h.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                t tVar2 = (t) n.i(tVar);
                eVar = tVar2.f5728c;
                i2 = tVar2.f5729d;
            }
            z2.h.c(eVar);
            O.e eVar2 = (O.e) eVar.d();
            put = eVar2.put(obj, obj2);
            M.e c3 = eVar2.c();
            if (z2.h.a(c3, eVar)) {
                break;
            }
            t tVar3 = this.f5730h;
            z2.h.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f5710b) {
                k3 = n.k();
                t tVar4 = (t) n.w(tVar3, this, k3);
                synchronized (obj3) {
                    int i3 = tVar4.f5729d;
                    if (i3 == i2) {
                        tVar4.f5728c = c3;
                        tVar4.f5729d = i3 + 1;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            n.n(k3, this);
        } while (!z3);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        M.e eVar;
        int i2;
        AbstractC0379g k3;
        boolean z3;
        do {
            Object obj = s.f5727b;
            synchronized (obj) {
                t tVar = this.f5730h;
                z2.h.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                t tVar2 = (t) n.i(tVar);
                eVar = tVar2.f5728c;
                i2 = tVar2.f5729d;
            }
            z2.h.c(eVar);
            O.e eVar2 = (O.e) eVar.d();
            eVar2.putAll(map);
            M.e c3 = eVar2.c();
            if (z2.h.a(c3, eVar)) {
                return;
            }
            t tVar3 = this.f5730h;
            z2.h.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f5710b) {
                k3 = n.k();
                t tVar4 = (t) n.w(tVar3, this, k3);
                synchronized (obj) {
                    int i3 = tVar4.f5729d;
                    if (i3 == i2) {
                        tVar4.f5728c = c3;
                        tVar4.f5729d = i3 + 1;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            n.n(k3, this);
        } while (!z3);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        M.e eVar;
        int i2;
        Object remove;
        AbstractC0379g k3;
        boolean z3;
        do {
            Object obj2 = s.f5727b;
            synchronized (obj2) {
                t tVar = this.f5730h;
                z2.h.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                t tVar2 = (t) n.i(tVar);
                eVar = tVar2.f5728c;
                i2 = tVar2.f5729d;
            }
            z2.h.c(eVar);
            M.d d3 = eVar.d();
            remove = d3.remove(obj);
            M.e c3 = d3.c();
            if (z2.h.a(c3, eVar)) {
                break;
            }
            t tVar3 = this.f5730h;
            z2.h.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f5710b) {
                k3 = n.k();
                t tVar4 = (t) n.w(tVar3, this, k3);
                synchronized (obj2) {
                    int i3 = tVar4.f5729d;
                    if (i3 == i2) {
                        tVar4.f5728c = c3;
                        tVar4.f5729d = i3 + 1;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            n.n(k3, this);
        } while (!z3);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        AbstractC0953e abstractC0953e = (AbstractC0953e) f().f5728c;
        abstractC0953e.getClass();
        return ((O.c) abstractC0953e).f5098i;
    }

    public final String toString() {
        t tVar = this.f5730h;
        z2.h.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((t) n.i(tVar)).f5728c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f5733k;
    }
}
