package t0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import n2.AbstractC0963o;

/* loaded from: classes.dex */
public final class r implements List, A2.a {

    /* renamed from: k, reason: collision with root package name */
    public int f10620k;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f10617h = new Object[16];

    /* renamed from: i, reason: collision with root package name */
    public long[] f10618i = new long[16];

    /* renamed from: j, reason: collision with root package name */
    public int f10619j = -1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10621l = true;

    public final long a() {
        long a3 = AbstractC1248f.a(Float.POSITIVE_INFINITY, false);
        int i2 = this.f10619j + 1;
        int u3 = AbstractC0963o.u(this);
        if (i2 <= u3) {
            while (true) {
                long j3 = this.f10618i[i2];
                if (AbstractC1248f.h(j3, a3) < 0) {
                    a3 = j3;
                }
                if (Float.intBitsToFloat((int) (a3 >> 32)) < 0.0f && ((int) (4294967295L & a3)) != 0) {
                    return a3;
                }
                if (i2 == u3) {
                    break;
                }
                i2++;
            }
        }
        return a3;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(V.n nVar, float f3, boolean z3, y2.a aVar) {
        int i2 = this.f10619j;
        int i3 = i2 + 1;
        this.f10619j = i3;
        Object[] objArr = this.f10617h;
        if (i3 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f10617h = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f10618i, length);
            z2.h.e(copyOf2, "copyOf(this, newSize)");
            this.f10618i = copyOf2;
        }
        Object[] objArr2 = this.f10617h;
        int i4 = this.f10619j;
        objArr2[i4] = nVar;
        this.f10618i[i4] = AbstractC1248f.a(f3, z3);
        e();
        aVar.c();
        this.f10619j = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f10619j = -1;
        e();
        this.f10621l = true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof V.n) && indexOf((V.n) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((V.n) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e() {
        int i2 = this.f10619j + 1;
        int u3 = AbstractC0963o.u(this);
        if (i2 <= u3) {
            while (true) {
                this.f10617h[i2] = null;
                if (i2 == u3) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f10620k = this.f10619j + 1;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Object obj = this.f10617h[i2];
        z2.h.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (V.n) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof V.n)) {
            return -1;
        }
        V.n nVar = (V.n) obj;
        int u3 = AbstractC0963o.u(this);
        if (u3 < 0) {
            return -1;
        }
        int i2 = 0;
        while (!z2.h.a(this.f10617h[i2], nVar)) {
            if (i2 == u3) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f10620k == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new T.x(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof V.n)) {
            return -1;
        }
        V.n nVar = (V.n) obj;
        for (int u3 = AbstractC0963o.u(this); -1 < u3; u3--) {
            if (z2.h.a(this.f10617h[u3], nVar)) {
                return u3;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new T.x(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f10620k;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        return new C1259q(this, i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return z2.g.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new T.x(this, i2, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return z2.g.b(this, objArr);
    }
}
