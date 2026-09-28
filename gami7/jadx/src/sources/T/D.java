package T;

import java.util.List;
import java.util.ListIterator;
import n2.AbstractC0963o;
import n2.C0947B;

/* loaded from: classes.dex */
public final class D implements ListIterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5649h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5650i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5651j;

    public D(C0947B c0947b, int i2) {
        this.f5651j = c0947b;
        List list = c0947b.f9153i;
        if (i2 >= 0 && i2 <= c0947b.size()) {
            this.f5650i = list.listIterator(c0947b.size() - i2);
            return;
        }
        StringBuilder l3 = B1.t.l("Position index ", i2, " must be in range [");
        l3.append(new E2.d(0, c0947b.size(), 1));
        l3.append("].");
        throw new IndexOutOfBoundsException(l3.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f5649h) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5649h) {
            case 0:
                return ((z2.q) this.f5650i).f11907h < ((E) this.f5651j).f5655k - 1;
            default:
                return ((ListIterator) this.f5650i).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f5649h) {
            case 0:
                return ((z2.q) this.f5650i).f11907h >= 0;
            default:
                return ((ListIterator) this.f5650i).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5649h) {
            case 0:
                z2.q qVar = (z2.q) this.f5650i;
                int i2 = qVar.f11907h + 1;
                E e3 = (E) this.f5651j;
                s.a(i2, e3.f5655k);
                qVar.f11907h = i2;
                return e3.get(i2);
            default:
                return ((ListIterator) this.f5650i).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f5649h) {
            case 0:
                return ((z2.q) this.f5650i).f11907h + 1;
            default:
                return AbstractC0963o.u((C0947B) this.f5651j) - ((ListIterator) this.f5650i).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5649h) {
            case 0:
                z2.q qVar = (z2.q) this.f5650i;
                int i2 = qVar.f11907h;
                E e3 = (E) this.f5651j;
                s.a(i2, e3.f5655k);
                qVar.f11907h = i2 - 1;
                return e3.get(i2);
            default:
                return ((ListIterator) this.f5650i).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f5649h) {
            case 0:
                return ((z2.q) this.f5650i).f11907h;
            default:
                return AbstractC0963o.u((C0947B) this.f5651j) - ((ListIterator) this.f5650i).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f5649h) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f5649h) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public D(z2.q qVar, E e3) {
        this.f5650i = qVar;
        this.f5651j = e3;
    }
}
