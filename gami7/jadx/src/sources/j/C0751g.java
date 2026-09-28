package j;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import k.AbstractC0779a;
import n2.AbstractC0959k;
import n2.AbstractC0961m;

/* renamed from: j.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751g implements Collection, Set, A2.b, A2.f {

    /* renamed from: h, reason: collision with root package name */
    public int[] f8000h = AbstractC0779a.f8101a;

    /* renamed from: i, reason: collision with root package name */
    public Object[] f8001i = AbstractC0779a.f8103c;

    /* renamed from: j, reason: collision with root package name */
    public int f8002j;

    public C0751g(int i2) {
        if (i2 > 0) {
            AbstractC0758n.b(this, i2);
        }
    }

    public final Object a(int i2) {
        int i3 = this.f8002j;
        Object[] objArr = this.f8001i;
        Object obj = objArr[i2];
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f8000h;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    AbstractC0959k.p(iArr, iArr, i2, i5, i3);
                    Object[] objArr2 = this.f8001i;
                    AbstractC0959k.q(objArr2, objArr2, i2, i5, i3);
                }
                this.f8001i[i4] = null;
            } else {
                AbstractC0758n.b(this, i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i2 > 0) {
                    AbstractC0959k.r(iArr, this.f8000h, 0, i2, 6);
                    AbstractC0959k.s(objArr, this.f8001i, 0, i2, 6);
                }
                if (i2 < i4) {
                    int i6 = i2 + 1;
                    AbstractC0959k.p(iArr, this.f8000h, i2, i6, i3);
                    AbstractC0959k.q(objArr, this.f8001i, i2, i6, i3);
                }
            }
            if (i3 != this.f8002j) {
                throw new ConcurrentModificationException();
            }
            this.f8002j = i4;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int c3;
        int i3 = this.f8002j;
        if (obj == null) {
            c3 = AbstractC0758n.c(this, null, 0);
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            c3 = AbstractC0758n.c(this, obj, hashCode);
        }
        if (c3 >= 0) {
            return false;
        }
        int i4 = ~c3;
        int[] iArr = this.f8000h;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f8001i;
            AbstractC0758n.b(this, i5);
            if (i3 != this.f8002j) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f8000h;
            if (!(iArr2.length == 0)) {
                AbstractC0959k.r(iArr, iArr2, 0, iArr.length, 6);
                AbstractC0959k.s(objArr, this.f8001i, 0, objArr.length, 6);
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.f8000h;
            int i6 = i4 + 1;
            AbstractC0959k.p(iArr3, iArr3, i6, i4, i3);
            Object[] objArr2 = this.f8001i;
            AbstractC0959k.q(objArr2, objArr2, i6, i4, i3);
        }
        int i7 = this.f8002j;
        if (i3 == i7) {
            int[] iArr4 = this.f8000h;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.f8001i[i4] = obj;
                this.f8002j = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        z2.h.f(collection, "elements");
        int size = collection.size() + this.f8002j;
        int i2 = this.f8002j;
        int[] iArr = this.f8000h;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f8001i;
            AbstractC0758n.b(this, size);
            int i3 = this.f8002j;
            if (i3 > 0) {
                AbstractC0959k.r(iArr, this.f8000h, 0, i3, 6);
                AbstractC0959k.s(objArr, this.f8001i, 0, this.f8002j, 6);
            }
        }
        if (this.f8002j != i2) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f8002j != 0) {
            this.f8000h = AbstractC0779a.f8101a;
            this.f8001i = AbstractC0779a.f8103c;
            this.f8002j = 0;
        }
        if (this.f8002j != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC0758n.c(this, null, 0) : AbstractC0758n.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        z2.h.f(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f8002j == ((Set) obj).size()) {
            try {
                int i2 = this.f8002j;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Set) obj).contains(this.f8001i[i3])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f8000h;
        int i2 = this.f8002j;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8002j <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0746b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c3 = obj == null ? AbstractC0758n.c(this, null, 0) : AbstractC0758n.c(this, obj, obj.hashCode());
        if (c3 < 0) {
            return false;
        }
        a(c3);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        z2.h.f(collection, "elements");
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        z2.h.f(collection, "elements");
        boolean z3 = false;
        for (int i2 = this.f8002j - 1; -1 < i2; i2--) {
            if (!AbstractC0961m.E(collection, this.f8001i[i2])) {
                a(i2);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f8002j;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0959k.t(this.f8001i, 0, this.f8002j);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8002j * 14);
        sb.append('{');
        int i2 = this.f8002j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f8001i[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        z2.h.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        z2.h.f(objArr, "array");
        int i2 = this.f8002j;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        } else if (objArr.length > i2) {
            objArr[i2] = null;
        }
        AbstractC0959k.q(this.f8001i, objArr, 0, 0, this.f8002j);
        return objArr;
    }
}
