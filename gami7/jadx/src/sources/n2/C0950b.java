package n2;

import j.C0744J;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import t0.AbstractC1265x;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950b extends C0744J implements ListIterator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC0952d f9154k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950b(AbstractC0952d abstractC0952d, int i2) {
        super(1, abstractC0952d);
        this.f9154k = abstractC0952d;
        int a3 = abstractC0952d.a();
        if (i2 < 0 || i2 > a3) {
            throw new IndexOutOfBoundsException(AbstractC1265x.d(i2, a3, "index: ", ", size: "));
        }
        this.f7983i = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7983i > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7983i;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f7983i - 1;
        this.f7983i = i2;
        return this.f9154k.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7983i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
