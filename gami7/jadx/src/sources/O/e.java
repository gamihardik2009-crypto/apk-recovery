package O;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class e extends AbstractMap implements M.d, Map, A2.e {

    /* renamed from: h, reason: collision with root package name */
    public c f5102h;

    /* renamed from: i, reason: collision with root package name */
    public Q.b f5103i = new Q.b();

    /* renamed from: j, reason: collision with root package name */
    public n f5104j;

    /* renamed from: k, reason: collision with root package name */
    public Object f5105k;

    /* renamed from: l, reason: collision with root package name */
    public int f5106l;

    /* renamed from: m, reason: collision with root package name */
    public int f5107m;

    public e(c cVar) {
        this.f5102h = cVar;
        this.f5104j = cVar.f5097h;
        cVar.getClass();
        this.f5107m = cVar.f5098i;
    }

    @Override // M.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c c() {
        n nVar = this.f5104j;
        c cVar = this.f5102h;
        if (nVar != cVar.f5097h) {
            this.f5103i = new Q.b();
            cVar = new c(this.f5104j, this.f5107m);
        }
        this.f5102h = cVar;
        return cVar;
    }

    public final void b(int i2) {
        this.f5107m = i2;
        this.f5106l++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f5104j = n.f5122e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f5104j.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f5104j.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f5105k = null;
        this.f5104j = this.f5104j.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f5105k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c cVar = null;
        c cVar2 = map instanceof c ? (c) map : null;
        if (cVar2 == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVar = eVar.c();
            }
        } else {
            cVar = cVar2;
        }
        if (cVar == null) {
            super.putAll(map);
            return;
        }
        Q.a aVar = new Q.a();
        aVar.f5263a = 0;
        int i2 = this.f5107m;
        n nVar = this.f5104j;
        n nVar2 = cVar.f5097h;
        z2.h.d(nVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f5104j = nVar.m(nVar2, 0, aVar, this);
        int i3 = (cVar.f5098i + i2) - aVar.f5263a;
        if (i2 != i3) {
            b(i3);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i2 = this.f5107m;
        n o3 = this.f5104j.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o3 == null) {
            o3 = n.f5122e;
        }
        this.f5104j = o3;
        return i2 != this.f5107m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5107m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f5105k = null;
        n n3 = this.f5104j.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n3 == null) {
            n3 = n.f5122e;
        }
        this.f5104j = n3;
        return this.f5105k;
    }
}
