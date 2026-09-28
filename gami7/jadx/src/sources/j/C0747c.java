package j;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747c implements Set {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0750f f7991h;

    public C0747c(C0750f c0750f) {
        this.f7991h = c0750f;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f7991h.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7991h.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f7991h.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0750f c0750f = this.f7991h;
        int i2 = 0;
        for (int i3 = c0750f.f7975j - 1; i3 >= 0; i3--) {
            Object g3 = c0750f.g(i3);
            i2 += g3 == null ? 0 : g3.hashCode();
        }
        return i2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f7991h.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0746b(this.f7991h, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0750f c0750f = this.f7991h;
        int e3 = c0750f.e(obj);
        if (e3 < 0) {
            return false;
        }
        c0750f.h(e3);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f7991h.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0750f c0750f = this.f7991h;
        int i2 = c0750f.f7975j;
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (!collection.contains(c0750f.g(i3))) {
                c0750f.h(i3);
            }
        }
        return i2 != c0750f.f7975j;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f7991h.f7975j;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0750f c0750f = this.f7991h;
        int i2 = c0750f.f7975j;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = c0750f.g(i3);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0750f c0750f = this.f7991h;
        int i2 = c0750f.f7975j;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = c0750f.g(i3);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
