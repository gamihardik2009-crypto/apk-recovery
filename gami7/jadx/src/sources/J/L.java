package J;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class L implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4045h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final E0 f4046i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4047j;

    /* renamed from: k, reason: collision with root package name */
    public int f4048k;

    /* renamed from: l, reason: collision with root package name */
    public int f4049l;

    public L(E0 e02, int i2, int i3) {
        this.f4046i = e02;
        this.f4047j = i3;
        this.f4048k = i2;
        this.f4049l = e02.f4004n;
        if (e02.f4003m) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4045h) {
            case 0:
                return this.f4048k < this.f4047j;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4045h) {
            case 0:
                E0 e02 = this.f4046i;
                int i2 = e02.f4004n;
                int i3 = this.f4049l;
                if (i2 != i3) {
                    throw new ConcurrentModificationException();
                }
                int i4 = this.f4048k;
                this.f4048k = C0257c.j(e02.f3998h, i4) + i4;
                return new F0(e02, i4, i3);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4045h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public L(E0 e02, int i2, M m3, C0257c c0257c) {
        this.f4046i = e02;
        this.f4047j = i2;
        this.f4048k = e02.f4004n;
    }
}
