package O;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public Object[] f5127h = n.f5122e.f5126d;

    /* renamed from: i, reason: collision with root package name */
    public int f5128i;

    /* renamed from: j, reason: collision with root package name */
    public int f5129j;

    public final void a(Object[] objArr, int i2, int i3) {
        this.f5127h = objArr;
        this.f5128i = i2;
        this.f5129j = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5129j < this.f5128i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
