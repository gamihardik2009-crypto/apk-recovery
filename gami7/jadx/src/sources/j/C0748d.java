package j;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748d implements Iterator, Map.Entry {

    /* renamed from: h, reason: collision with root package name */
    public int f7992h;

    /* renamed from: i, reason: collision with root package name */
    public int f7993i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7994j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0750f f7995k;

    public C0748d(C0750f c0750f) {
        this.f7995k = c0750f;
        this.f7992h = c0750f.f7975j - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f7994j) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f7993i;
        C0750f c0750f = this.f7995k;
        return z2.h.a(key, c0750f.g(i2)) && z2.h.a(entry.getValue(), c0750f.j(this.f7993i));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f7994j) {
            return this.f7995k.g(this.f7993i);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f7994j) {
            return this.f7995k.j(this.f7993i);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7993i < this.f7992h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f7994j) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f7993i;
        C0750f c0750f = this.f7995k;
        Object g3 = c0750f.g(i2);
        Object j3 = c0750f.j(this.f7993i);
        return (g3 == null ? 0 : g3.hashCode()) ^ (j3 != null ? j3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7993i++;
        this.f7994j = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7994j) {
            throw new IllegalStateException();
        }
        this.f7995k.h(this.f7993i);
        this.f7993i--;
        this.f7992h--;
        this.f7994j = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f7994j) {
            return this.f7995k.i(this.f7993i, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
