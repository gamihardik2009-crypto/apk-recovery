package L;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import n2.AbstractC0959k;
import n2.AbstractC0963o;
import z2.h;

/* loaded from: classes.dex */
public final class d implements RandomAccess {

    /* renamed from: h, reason: collision with root package name */
    public Object[] f4618h;

    /* renamed from: i, reason: collision with root package name */
    public a f4619i;

    /* renamed from: j, reason: collision with root package name */
    public int f4620j = 0;

    public d(Object[] objArr) {
        this.f4618h = objArr;
    }

    public final void a(int i2, Object obj) {
        i(this.f4620j + 1);
        Object[] objArr = this.f4618h;
        int i3 = this.f4620j;
        if (i2 != i3) {
            AbstractC0959k.q(objArr, objArr, i2 + 1, i2, i3);
        }
        objArr[i2] = obj;
        this.f4620j++;
    }

    public final void b(Object obj) {
        i(this.f4620j + 1);
        Object[] objArr = this.f4618h;
        int i2 = this.f4620j;
        objArr[i2] = obj;
        this.f4620j = i2 + 1;
    }

    public final void c(int i2, d dVar) {
        if (dVar.k()) {
            return;
        }
        i(this.f4620j + dVar.f4620j);
        Object[] objArr = this.f4618h;
        int i3 = this.f4620j;
        if (i2 != i3) {
            AbstractC0959k.q(objArr, objArr, dVar.f4620j + i2, i2, i3);
        }
        AbstractC0959k.q(dVar.f4618h, objArr, i2, 0, dVar.f4620j);
        this.f4620j += dVar.f4620j;
    }

    public final void d(int i2, List list) {
        if (list.isEmpty()) {
            return;
        }
        i(list.size() + this.f4620j);
        Object[] objArr = this.f4618h;
        if (i2 != this.f4620j) {
            AbstractC0959k.q(objArr, objArr, list.size() + i2, i2, this.f4620j);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = list.get(i3);
        }
        this.f4620j = list.size() + this.f4620j;
    }

    public final boolean e(int i2, Collection collection) {
        int i3 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        i(collection.size() + this.f4620j);
        Object[] objArr = this.f4618h;
        if (i2 != this.f4620j) {
            AbstractC0959k.q(objArr, objArr, collection.size() + i2, i2, this.f4620j);
        }
        for (Object obj : collection) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0963o.y();
                throw null;
            }
            objArr[i3 + i2] = obj;
            i3 = i4;
        }
        this.f4620j = collection.size() + this.f4620j;
        return true;
    }

    public final List f() {
        a aVar = this.f4619i;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f4619i = aVar2;
        return aVar2;
    }

    public final void g() {
        Object[] objArr = this.f4618h;
        int i2 = this.f4620j;
        while (true) {
            i2--;
            if (-1 >= i2) {
                this.f4620j = 0;
                return;
            }
            objArr[i2] = null;
        }
    }

    public final boolean h(Object obj) {
        int i2 = this.f4620j - 1;
        if (i2 >= 0) {
            for (int i3 = 0; !h.a(this.f4618h[i3], obj); i3++) {
                if (i3 != i2) {
                }
            }
            return true;
        }
        return false;
    }

    public final void i(int i2) {
        Object[] objArr = this.f4618h;
        if (objArr.length < i2) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i2, objArr.length * 2));
            h.e(copyOf, "copyOf(this, newSize)");
            this.f4618h = copyOf;
        }
    }

    public final int j(Object obj) {
        int i2 = this.f4620j;
        if (i2 <= 0) {
            return -1;
        }
        Object[] objArr = this.f4618h;
        int i3 = 0;
        while (!h.a(obj, objArr[i3])) {
            i3++;
            if (i3 >= i2) {
                return -1;
            }
        }
        return i3;
    }

    public final boolean k() {
        return this.f4620j == 0;
    }

    public final boolean l() {
        return this.f4620j != 0;
    }

    public final boolean m(Object obj) {
        int j3 = j(obj);
        if (j3 < 0) {
            return false;
        }
        n(j3);
        return true;
    }

    public final Object n(int i2) {
        Object[] objArr = this.f4618h;
        Object obj = objArr[i2];
        int i3 = this.f4620j;
        if (i2 != i3 - 1) {
            AbstractC0959k.q(objArr, objArr, i2, i2 + 1, i3);
        }
        int i4 = this.f4620j - 1;
        this.f4620j = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void o(int i2, int i3) {
        if (i3 > i2) {
            int i4 = this.f4620j;
            if (i3 < i4) {
                Object[] objArr = this.f4618h;
                AbstractC0959k.q(objArr, objArr, i2, i3, i4);
            }
            int i5 = this.f4620j;
            int i6 = i5 - (i3 - i2);
            int i7 = i5 - 1;
            if (i6 <= i7) {
                int i8 = i6;
                while (true) {
                    this.f4618h[i8] = null;
                    if (i8 == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f4620j = i6;
        }
    }

    public final void p(Comparator comparator) {
        Object[] objArr = this.f4618h;
        int i2 = this.f4620j;
        h.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i2, comparator);
    }
}
