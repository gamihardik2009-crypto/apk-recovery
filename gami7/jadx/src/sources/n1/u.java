package n1;

import j.AbstractC0758n;
import j.C0742H;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class u implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public int f9101h = -1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9102i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f9103j;

    public u(v vVar) {
        this.f9103j = vVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9101h + 1 < this.f9103j.q.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9102i = true;
        C0742H c0742h = this.f9103j.q;
        int i2 = this.f9101h + 1;
        this.f9101h = i2;
        return (s) c0742h.g(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9102i) {
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
        C0742H c0742h = this.f9103j.q;
        ((s) c0742h.g(this.f9101h)).f9088i = null;
        int i2 = this.f9101h;
        Object[] objArr = c0742h.f7978j;
        Object obj = objArr[i2];
        Object obj2 = AbstractC0758n.f8014c;
        if (obj != obj2) {
            objArr[i2] = obj2;
            c0742h.f7976h = true;
        }
        this.f9101h = i2 - 1;
        this.f9102i = false;
    }
}
