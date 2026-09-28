package G2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final Iterator f1272h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f1273i;

    public n(d dVar) {
        this.f1273i = dVar;
        this.f1272h = dVar.f1255b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1272h.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1273i.f1256c.l(this.f1272h.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
