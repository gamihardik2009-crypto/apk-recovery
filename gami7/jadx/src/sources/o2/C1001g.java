package o2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import n2.AbstractC0955g;

/* renamed from: o2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001g extends AbstractC0955g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9352h;

    /* renamed from: i, reason: collision with root package name */
    public final C1000f f9353i;

    public C1001g(C1000f c1000f, int i2) {
        this.f9352h = i2;
        switch (i2) {
            case 1:
                z2.h.f(c1000f, "backing");
                this.f9353i = c1000f;
                break;
            default:
                z2.h.f(c1000f, "backing");
                this.f9353i = c1000f;
                break;
        }
    }

    @Override // n2.AbstractC0955g
    public final int a() {
        switch (this.f9352h) {
        }
        return this.f9353i.f9348p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f9352h) {
            case 0:
                z2.h.f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f9352h) {
            case 0:
                z2.h.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                z2.h.f(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f9352h) {
            case 0:
                this.f9353i.clear();
                break;
            default:
                this.f9353i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f9352h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                z2.h.f(entry, "element");
                return this.f9353i.g(entry);
            default:
                return this.f9353i.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f9352h) {
            case 0:
                z2.h.f(collection, "elements");
                return this.f9353i.f(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f9352h) {
        }
        return this.f9353i.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9352h) {
            case 0:
                C1000f c1000f = this.f9353i;
                c1000f.getClass();
                return new C0998d(c1000f, 0);
            default:
                C1000f c1000f2 = this.f9353i;
                c1000f2.getClass();
                return new C0998d(c1000f2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f9352h) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    z2.h.f(entry, "element");
                    C1000f c1000f = this.f9353i;
                    c1000f.getClass();
                    c1000f.e();
                    int i2 = c1000f.i(entry.getKey());
                    if (i2 >= 0) {
                        Object[] objArr = c1000f.f9341i;
                        z2.h.c(objArr);
                        if (z2.h.a(objArr[i2], entry.getValue())) {
                            c1000f.m(i2);
                            break;
                        }
                    }
                }
                break;
            default:
                C1000f c1000f2 = this.f9353i;
                c1000f2.e();
                int i3 = c1000f2.i(obj);
                if (i3 >= 0) {
                    c1000f2.m(i3);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f9352h) {
            case 0:
                z2.h.f(collection, "elements");
                this.f9353i.e();
                break;
            default:
                z2.h.f(collection, "elements");
                this.f9353i.e();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f9352h) {
            case 0:
                z2.h.f(collection, "elements");
                this.f9353i.e();
                break;
            default:
                z2.h.f(collection, "elements");
                this.f9353i.e();
                break;
        }
        return super.retainAll(collection);
    }
}
