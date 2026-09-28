package L;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c implements ListIterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final List f4616h;

    /* renamed from: i, reason: collision with root package name */
    public int f4617i;

    public c(int i2, List list) {
        this.f4616h = list;
        this.f4617i = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f4616h.add(this.f4617i, obj);
        this.f4617i++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4617i < this.f4616h.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4617i > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i2 = this.f4617i;
        this.f4617i = i2 + 1;
        return this.f4616h.get(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4617i;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i2 = this.f4617i - 1;
        this.f4617i = i2;
        return this.f4616h.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4617i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i2 = this.f4617i - 1;
        this.f4617i = i2;
        this.f4616h.remove(i2);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f4616h.set(this.f4617i, obj);
    }
}
