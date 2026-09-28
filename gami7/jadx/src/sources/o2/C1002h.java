package o2;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import n2.AbstractC0955g;

/* renamed from: o2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002h extends AbstractC0955g implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final C1002h f9354i;

    /* renamed from: h, reason: collision with root package name */
    public final C1000f f9355h;

    static {
        C1000f c1000f = C1000f.f9339u;
        f9354i = new C1002h(C1000f.f9339u);
    }

    public C1002h(C1000f c1000f) {
        z2.h.f(c1000f, "backing");
        this.f9355h = c1000f;
    }

    @Override // n2.AbstractC0955g
    public final int a() {
        return this.f9355h.f9348p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f9355h.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        z2.h.f(collection, "elements");
        this.f9355h.e();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f9355h.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9355h.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f9355h.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C1000f c1000f = this.f9355h;
        c1000f.getClass();
        return new C0998d(c1000f, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C1000f c1000f = this.f9355h;
        c1000f.e();
        int i2 = c1000f.i(obj);
        if (i2 < 0) {
            return false;
        }
        c1000f.m(i2);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        z2.h.f(collection, "elements");
        this.f9355h.e();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        z2.h.f(collection, "elements");
        this.f9355h.e();
        return super.retainAll(collection);
    }

    public C1002h() {
        this(new C1000f());
    }
}
