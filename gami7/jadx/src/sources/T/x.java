package T;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import o2.C0995a;
import o2.C0996b;

/* loaded from: classes.dex */
public final class x implements ListIterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5756h;

    /* renamed from: i, reason: collision with root package name */
    public int f5757i;

    /* renamed from: j, reason: collision with root package name */
    public int f5758j;

    /* renamed from: k, reason: collision with root package name */
    public int f5759k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f5760l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(t0.r rVar, int i2, int i3) {
        this(rVar, (i3 & 1) != 0 ? 0 : i2, 0, rVar.f10620k);
        this.f5756h = 3;
    }

    public void a() {
        int i2;
        i2 = ((AbstractList) ((C0995a) this.f5760l).f9330l).modCount;
        if (i2 != this.f5759k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i2;
        int i3;
        switch (this.f5756h) {
            case 0:
                e();
                int i4 = this.f5757i + 1;
                r rVar = (r) this.f5760l;
                rVar.add(i4, obj);
                this.f5758j = -1;
                this.f5757i++;
                this.f5759k = rVar.g();
                return;
            case 1:
                a();
                int i5 = this.f5757i;
                this.f5757i = i5 + 1;
                C0995a c0995a = (C0995a) this.f5760l;
                c0995a.add(i5, obj);
                this.f5758j = -1;
                i2 = ((AbstractList) c0995a).modCount;
                this.f5759k = i2;
                return;
            case 2:
                b();
                int i6 = this.f5757i;
                this.f5757i = i6 + 1;
                C0996b c0996b = (C0996b) this.f5760l;
                c0996b.add(i6, obj);
                this.f5758j = -1;
                i3 = ((AbstractList) c0996b).modCount;
                this.f5759k = i3;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        int i2;
        i2 = ((AbstractList) ((C0996b) this.f5760l)).modCount;
        if (i2 != this.f5759k) {
            throw new ConcurrentModificationException();
        }
    }

    public void e() {
        if (((r) this.f5760l).g() != this.f5759k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5756h) {
            case 0:
                return this.f5757i < ((r) this.f5760l).size() - 1;
            case 1:
                return this.f5757i < ((C0995a) this.f5760l).f9328j;
            case 2:
                return this.f5757i < ((C0996b) this.f5760l).f9333i;
            default:
                return this.f5757i < this.f5759k;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f5756h) {
            case 0:
                if (this.f5757i >= 0) {
                }
                break;
            case 1:
                if (this.f5757i > 0) {
                }
                break;
            case 2:
                if (this.f5757i > 0) {
                }
                break;
            default:
                if (this.f5757i > this.f5758j) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5756h) {
            case 0:
                e();
                int i2 = this.f5757i + 1;
                this.f5758j = i2;
                r rVar = (r) this.f5760l;
                s.a(i2, rVar.size());
                Object obj = rVar.get(i2);
                this.f5757i = i2;
                return obj;
            case 1:
                a();
                int i3 = this.f5757i;
                C0995a c0995a = (C0995a) this.f5760l;
                if (i3 >= c0995a.f9328j) {
                    throw new NoSuchElementException();
                }
                this.f5757i = i3 + 1;
                this.f5758j = i3;
                return c0995a.f9326h[c0995a.f9327i + i3];
            case 2:
                b();
                int i4 = this.f5757i;
                C0996b c0996b = (C0996b) this.f5760l;
                if (i4 >= c0996b.f9333i) {
                    throw new NoSuchElementException();
                }
                this.f5757i = i4 + 1;
                this.f5758j = i4;
                return c0996b.f9332h[i4];
            default:
                Object[] objArr = ((t0.r) this.f5760l).f10617h;
                int i5 = this.f5757i;
                this.f5757i = i5 + 1;
                Object obj2 = objArr[i5];
                z2.h.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (V.n) obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f5756h) {
            case 0:
                return this.f5757i + 1;
            case 1:
                return this.f5757i;
            case 2:
                return this.f5757i;
            default:
                return this.f5757i - this.f5758j;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5756h) {
            case 0:
                e();
                int i2 = this.f5757i;
                r rVar = (r) this.f5760l;
                s.a(i2, rVar.size());
                int i3 = this.f5757i;
                this.f5758j = i3;
                this.f5757i--;
                return rVar.get(i3);
            case 1:
                a();
                int i4 = this.f5757i;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.f5757i = i5;
                this.f5758j = i5;
                C0995a c0995a = (C0995a) this.f5760l;
                return c0995a.f9326h[c0995a.f9327i + i5];
            case 2:
                b();
                int i6 = this.f5757i;
                if (i6 <= 0) {
                    throw new NoSuchElementException();
                }
                int i7 = i6 - 1;
                this.f5757i = i7;
                this.f5758j = i7;
                return ((C0996b) this.f5760l).f9332h[i7];
            default:
                Object[] objArr = ((t0.r) this.f5760l).f10617h;
                int i8 = this.f5757i - 1;
                this.f5757i = i8;
                Object obj = objArr[i8];
                z2.h.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (V.n) obj;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f5756h) {
            case 0:
                return this.f5757i;
            case 1:
                return this.f5757i - 1;
            case 2:
                return this.f5757i - 1;
            default:
                return (this.f5757i - this.f5758j) - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i2;
        int i3;
        switch (this.f5756h) {
            case 0:
                e();
                int i4 = this.f5757i;
                r rVar = (r) this.f5760l;
                rVar.remove(i4);
                this.f5757i--;
                this.f5758j = -1;
                this.f5759k = rVar.g();
                return;
            case 1:
                a();
                int i5 = this.f5758j;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                C0995a c0995a = (C0995a) this.f5760l;
                c0995a.b(i5);
                this.f5757i = this.f5758j;
                this.f5758j = -1;
                i2 = ((AbstractList) c0995a).modCount;
                this.f5759k = i2;
                return;
            case 2:
                b();
                int i6 = this.f5758j;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                C0996b c0996b = (C0996b) this.f5760l;
                c0996b.b(i6);
                this.f5757i = this.f5758j;
                this.f5758j = -1;
                i3 = ((AbstractList) c0996b).modCount;
                this.f5759k = i3;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f5756h) {
            case 0:
                e();
                int i2 = this.f5758j;
                if (i2 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
                }
                r rVar = (r) this.f5760l;
                rVar.set(i2, obj);
                this.f5759k = rVar.g();
                return;
            case 1:
                a();
                int i3 = this.f5758j;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                ((C0995a) this.f5760l).set(i3, obj);
                return;
            case 2:
                b();
                int i4 = this.f5758j;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                ((C0996b) this.f5760l).set(i4, obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x(t0.r rVar, int i2, int i3, int i4) {
        this.f5756h = 3;
        this.f5760l = rVar;
        this.f5757i = i2;
        this.f5758j = i3;
        this.f5759k = i4;
    }

    public x(C0996b c0996b, int i2) {
        int i3;
        this.f5756h = 2;
        z2.h.f(c0996b, "list");
        this.f5760l = c0996b;
        this.f5757i = i2;
        this.f5758j = -1;
        i3 = ((AbstractList) c0996b).modCount;
        this.f5759k = i3;
    }

    public x(r rVar, int i2) {
        this.f5756h = 0;
        this.f5760l = rVar;
        this.f5757i = i2 - 1;
        this.f5758j = -1;
        this.f5759k = rVar.g();
    }

    public x(C0995a c0995a, int i2) {
        int i3;
        this.f5756h = 1;
        z2.h.f(c0995a, "list");
        this.f5760l = c0995a;
        this.f5757i = i2;
        this.f5758j = -1;
        i3 = ((AbstractList) c0995a).modCount;
        this.f5759k = i3;
    }
}
