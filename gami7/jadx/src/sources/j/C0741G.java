package j;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import k.AbstractC0779a;
import n2.AbstractC0959k;

/* renamed from: j.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0741G {

    /* renamed from: h, reason: collision with root package name */
    public int[] f7973h;

    /* renamed from: i, reason: collision with root package name */
    public Object[] f7974i;

    /* renamed from: j, reason: collision with root package name */
    public int f7975j;

    public C0741G(int i2) {
        this.f7973h = i2 == 0 ? AbstractC0779a.f8101a : new int[i2];
        this.f7974i = i2 == 0 ? AbstractC0779a.f8103c : new Object[i2 << 1];
    }

    public final int a(Object obj) {
        int i2 = this.f7975j * 2;
        Object[] objArr = this.f7974i;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (z2.h.a(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i2, Object obj) {
        int i3 = this.f7975j;
        if (i3 == 0) {
            return -1;
        }
        int a3 = AbstractC0779a.a(this.f7973h, i3, i2);
        if (a3 < 0 || z2.h.a(obj, this.f7974i[a3 << 1])) {
            return a3;
        }
        int i4 = a3 + 1;
        while (i4 < i3 && this.f7973h[i4] == i2) {
            if (z2.h.a(obj, this.f7974i[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a3 - 1; i5 >= 0 && this.f7973h[i5] == i2; i5--) {
            if (z2.h.a(obj, this.f7974i[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final void clear() {
        if (this.f7975j > 0) {
            this.f7973h = AbstractC0779a.f8101a;
            this.f7974i = AbstractC0779a.f8103c;
            this.f7975j = 0;
        }
        if (this.f7975j > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int e(Object obj) {
        return obj == null ? f() : b(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C0741G) {
                int i2 = this.f7975j;
                if (i2 != ((C0741G) obj).f7975j) {
                    return false;
                }
                C0741G c0741g = (C0741G) obj;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object g3 = g(i3);
                    Object j3 = j(i3);
                    Object obj2 = c0741g.get(g3);
                    if (j3 == null) {
                        if (obj2 != null || !c0741g.containsKey(g3)) {
                            return false;
                        }
                    } else if (!z2.h.a(j3, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f7975j != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.f7975j;
            for (int i5 = 0; i5 < i4; i5++) {
                Object g4 = g(i5);
                Object j4 = j(i5);
                Object obj3 = ((Map) obj).get(g4);
                if (j4 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(g4)) {
                        return false;
                    }
                } else if (!z2.h.a(j4, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i2 = this.f7975j;
        if (i2 == 0) {
            return -1;
        }
        int a3 = AbstractC0779a.a(this.f7973h, i2, 0);
        if (a3 < 0 || this.f7974i[a3 << 1] == null) {
            return a3;
        }
        int i3 = a3 + 1;
        while (i3 < i2 && this.f7973h[i3] == 0) {
            if (this.f7974i[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a3 - 1; i4 >= 0 && this.f7973h[i4] == 0; i4--) {
            if (this.f7974i[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final Object g(int i2) {
        if (i2 < 0 || i2 >= this.f7975j) {
            throw new IllegalArgumentException(B1.t.h("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        return this.f7974i[i2 << 1];
    }

    public Object get(Object obj) {
        int e3 = e(obj);
        if (e3 >= 0) {
            return this.f7974i[(e3 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e3 = e(obj);
        return e3 >= 0 ? this.f7974i[(e3 << 1) + 1] : obj2;
    }

    public final Object h(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f7975j)) {
            throw new IllegalArgumentException(B1.t.h("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        Object[] objArr = this.f7974i;
        int i4 = i2 << 1;
        Object obj = objArr[i4 + 1];
        if (i3 <= 1) {
            clear();
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f7973h;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    AbstractC0959k.p(iArr, iArr, i2, i6, i3);
                    Object[] objArr2 = this.f7974i;
                    AbstractC0959k.q(objArr2, objArr2, i4, i6 << 1, i3 << 1);
                }
                Object[] objArr3 = this.f7974i;
                int i7 = i5 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                int i8 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i8);
                z2.h.e(copyOf, "copyOf(this, newSize)");
                this.f7973h = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f7974i, i8 << 1);
                z2.h.e(copyOf2, "copyOf(this, newSize)");
                this.f7974i = copyOf2;
                if (i3 != this.f7975j) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    AbstractC0959k.p(iArr, this.f7973h, 0, 0, i2);
                    AbstractC0959k.q(objArr, this.f7974i, 0, 0, i4);
                }
                if (i2 < i5) {
                    int i9 = i2 + 1;
                    AbstractC0959k.p(iArr, this.f7973h, i2, i9, i3);
                    AbstractC0959k.q(objArr, this.f7974i, i4, i9 << 1, i3 << 1);
                }
            }
            if (i3 != this.f7975j) {
                throw new ConcurrentModificationException();
            }
            this.f7975j = i5;
        }
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f7973h;
        Object[] objArr = this.f7974i;
        int i2 = this.f7975j;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final Object i(int i2, Object obj) {
        if (i2 < 0 || i2 >= this.f7975j) {
            throw new IllegalArgumentException(B1.t.h("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f7974i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f7975j <= 0;
    }

    public final Object j(int i2) {
        if (i2 < 0 || i2 >= this.f7975j) {
            throw new IllegalArgumentException(B1.t.h("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        return this.f7974i[(i2 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i2 = this.f7975j;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b3 = obj != null ? b(hashCode, obj) : f();
        if (b3 >= 0) {
            int i3 = (b3 << 1) + 1;
            Object[] objArr = this.f7974i;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~b3;
        int[] iArr = this.f7973h;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f7973h = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7974i, i5 << 1);
            z2.h.e(copyOf2, "copyOf(this, newSize)");
            this.f7974i = copyOf2;
            if (i2 != this.f7975j) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.f7973h;
            int i6 = i4 + 1;
            AbstractC0959k.p(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.f7974i;
            AbstractC0959k.q(objArr2, objArr2, i6 << 1, i4 << 1, this.f7975j << 1);
        }
        int i7 = this.f7975j;
        if (i2 == i7) {
            int[] iArr3 = this.f7973h;
            if (i4 < iArr3.length) {
                iArr3[i4] = hashCode;
                Object[] objArr3 = this.f7974i;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.f7975j = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int e3 = e(obj);
        if (e3 >= 0) {
            return h(e3);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e3 = e(obj);
        if (e3 >= 0) {
            return i(e3, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f7975j;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7975j * 28);
        sb.append('{');
        int i2 = this.f7975j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object g3 = g(i3);
            if (g3 != sb) {
                sb.append(g3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j3 = j(i3);
            if (j3 != sb) {
                sb.append(j3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        z2.h.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e3 = e(obj);
        if (e3 < 0 || !z2.h.a(obj2, j(e3))) {
            return false;
        }
        h(e3);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e3 = e(obj);
        if (e3 < 0 || !z2.h.a(obj2, j(e3))) {
            return false;
        }
        i(e3, obj3);
        return true;
    }
}
