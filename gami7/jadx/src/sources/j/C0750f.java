package j;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750f extends C0741G implements Map {

    /* renamed from: k, reason: collision with root package name */
    public C0745a f7997k;

    /* renamed from: l, reason: collision with root package name */
    public C0747c f7998l;

    /* renamed from: m, reason: collision with root package name */
    public C0749e f7999m;

    @Override // j.C0741G, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // j.C0741G, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0745a c0745a = this.f7997k;
        if (c0745a != null) {
            return c0745a;
        }
        C0745a c0745a2 = new C0745a(this);
        this.f7997k = c0745a2;
        return c0745a2;
    }

    @Override // j.C0741G, java.util.Map
    public final Object get(Object obj) {
        return super.get(obj);
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0747c c0747c = this.f7998l;
        if (c0747c != null) {
            return c0747c;
        }
        C0747c c0747c2 = new C0747c(this);
        this.f7998l = c0747c2;
        return c0747c2;
    }

    public final boolean l(Collection collection) {
        int i2 = this.f7975j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i2 != this.f7975j;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f7975j;
        int i2 = this.f7975j;
        int[] iArr = this.f7973h;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f7973h = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7974i, size * 2);
            z2.h.e(copyOf2, "copyOf(this, newSize)");
            this.f7974i = copyOf2;
        }
        if (this.f7975j != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // j.C0741G, java.util.Map
    public final Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public final Collection values() {
        C0749e c0749e = this.f7999m;
        if (c0749e != null) {
            return c0749e;
        }
        C0749e c0749e2 = new C0749e(this);
        this.f7999m = c0749e2;
        return c0749e2;
    }
}
