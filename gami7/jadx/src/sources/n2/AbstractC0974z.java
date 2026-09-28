package n2;

import java.util.Iterator;

/* renamed from: n2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0974z implements Iterator, A2.a {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
