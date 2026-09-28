package J0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import n2.C0970v;
import z2.g;
import z2.h;

/* loaded from: classes.dex */
public final class b implements Collection, A2.a {

    /* renamed from: j, reason: collision with root package name */
    public static final b f4322j = new b(C0970v.f9165h);

    /* renamed from: h, reason: collision with root package name */
    public final List f4323h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4324i;

    public b(List list) {
        this.f4323h = list;
        this.f4324i = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f4323h.contains((a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f4323h.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return h.a(this.f4323h, ((b) obj).f4323h);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f4323h.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4323h.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f4323h.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4324i;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return g.a(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f4323h + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return g.b(this, objArr);
    }
}
