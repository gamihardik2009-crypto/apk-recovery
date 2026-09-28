package j;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: j.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746b implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public int f7986h;

    /* renamed from: i, reason: collision with root package name */
    public int f7987i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7988j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7989k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f7990l;

    public C0746b(int i2) {
        this.f7986h = i2;
    }

    public final Object a(int i2) {
        switch (this.f7989k) {
            case 0:
                return ((C0750f) this.f7990l).g(i2);
            case 1:
                return ((C0750f) this.f7990l).j(i2);
            default:
                return ((C0751g) this.f7990l).f8001i[i2];
        }
    }

    public final void b(int i2) {
        switch (this.f7989k) {
            case 0:
                ((C0750f) this.f7990l).h(i2);
                break;
            case 1:
                ((C0750f) this.f7990l).h(i2);
                break;
            default:
                ((C0751g) this.f7990l).a(i2);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7987i < this.f7986h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a3 = a(this.f7987i);
        this.f7987i++;
        this.f7988j = true;
        return a3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7988j) {
            throw new IllegalStateException("Call next() before removing an element.".toString());
        }
        int i2 = this.f7987i - 1;
        this.f7987i = i2;
        b(i2);
        this.f7986h--;
        this.f7988j = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0746b(C0751g c0751g) {
        this(c0751g.f8002j);
        this.f7989k = 2;
        this.f7990l = c0751g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0746b(C0750f c0750f, int i2) {
        this(c0750f.f7975j);
        this.f7989k = i2;
        switch (i2) {
            case 1:
                this.f7990l = c0750f;
                this(c0750f.f7975j);
                break;
            default:
                this.f7990l = c0750f;
                break;
        }
    }
}
