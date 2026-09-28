package N;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public int f4946h;

    /* renamed from: i, reason: collision with root package name */
    public int f4947i;

    public a(int i2, int i3) {
        this.f4946h = i2;
        this.f4947i = i3;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4946h < this.f4947i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4946h > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4946h;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4946h - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
