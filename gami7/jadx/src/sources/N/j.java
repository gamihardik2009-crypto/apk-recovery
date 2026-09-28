package N;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import n2.AbstractC0959k;

/* loaded from: classes.dex */
public final class j extends c implements M.b {

    /* renamed from: j, reason: collision with root package name */
    public static final j f4971j = new j(new Object[0]);

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f4972i;

    public j(Object[] objArr) {
        this.f4972i = objArr;
    }

    @Override // m2.AbstractC0872n
    public final int a() {
        return this.f4972i.length;
    }

    @Override // N.c
    public final c b(int i2, Object obj) {
        Object[] objArr = this.f4972i;
        l0.c.s(i2, objArr.length);
        if (i2 == objArr.length) {
            return e(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC0959k.s(objArr, objArr2, 0, i2, 6);
            AbstractC0959k.q(objArr, objArr2, i2 + 1, i2, objArr.length);
            objArr2[i2] = obj;
            return new j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        z2.h.e(copyOf, "copyOf(this, size)");
        AbstractC0959k.q(objArr, copyOf, i2 + 1, i2, objArr.length - 1);
        copyOf[i2] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new f(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // N.c
    public final c e(Object obj) {
        Object[] objArr = this.f4972i;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new f(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        z2.h.e(copyOf, "copyOf(this, newSize)");
        copyOf[objArr.length] = obj;
        return new j(copyOf);
    }

    @Override // N.c
    public final c f(Collection collection) {
        Object[] objArr = this.f4972i;
        if (collection.size() + objArr.length > 32) {
            g g3 = g();
            g3.addAll(collection);
            return g3.e();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        z2.h.e(copyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new j(copyOf);
    }

    @Override // N.c
    public final g g() {
        return new g(this, null, this.f4972i, 0);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        l0.c.q(i2, a());
        return this.f4972i[i2];
    }

    @Override // N.c
    public final c h(b bVar) {
        Object[] objArr = this.f4972i;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z3 = false;
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj = objArr[i2];
            if (((Boolean) bVar.l(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z2.h.e(objArr2, "copyOf(this, size)");
                    z3 = true;
                    length = i2;
                }
            } else if (z3) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f4971j : new j(AbstractC0959k.t(objArr2, 0, length));
    }

    @Override // N.c
    public final c i(int i2) {
        Object[] objArr = this.f4972i;
        l0.c.q(i2, objArr.length);
        if (objArr.length == 1) {
            return f4971j;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        z2.h.e(copyOf, "copyOf(this, newSize)");
        AbstractC0959k.q(objArr, copyOf, i2, i2 + 1, objArr.length);
        return new j(copyOf);
    }

    @Override // n2.AbstractC0952d, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC0959k.x(this.f4972i, obj);
    }

    @Override // N.c
    public final c j(int i2, Object obj) {
        l0.c.q(i2, a());
        Object[] objArr = this.f4972i;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        z2.h.e(copyOf, "copyOf(this, size)");
        copyOf[i2] = obj;
        return new j(copyOf);
    }

    @Override // n2.AbstractC0952d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f4972i;
        z2.h.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i2 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i2 < 0) {
                    return -1;
                }
                length = i2;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i3 = length2 - 1;
                if (z2.h.a(obj, objArr[length2])) {
                    return length2;
                }
                if (i3 < 0) {
                    return -1;
                }
                length2 = i3;
            }
        }
    }

    @Override // n2.AbstractC0952d, java.util.List
    public final ListIterator listIterator(int i2) {
        l0.c.s(i2, a());
        return new d(this.f4972i, i2, a());
    }
}
