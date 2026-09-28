package G0;

import java.util.Map;
import z2.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1226a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1227b;

    /* renamed from: c, reason: collision with root package name */
    public int f1228c;

    public final int a(int i2, Object obj) {
        int i3 = this.f1228c;
        if (i3 == 0) {
            return -1;
        }
        int a3 = a.a(this.f1226a, i3, i2);
        if (a3 < 0 || h.a(obj, this.f1227b[a3 << 1])) {
            return a3;
        }
        int i4 = a3 + 1;
        while (i4 < i3 && this.f1226a[i4] == i2) {
            if (h.a(obj, this.f1227b[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a3 - 1; i5 >= 0 && this.f1226a[i5] == i2; i5--) {
            if (h.a(obj, this.f1227b[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final int b() {
        int i2 = this.f1228c;
        if (i2 == 0) {
            return -1;
        }
        int a3 = a.a(this.f1226a, i2, 0);
        if (a3 < 0 || this.f1227b[a3 << 1] == null) {
            return a3;
        }
        int i3 = a3 + 1;
        while (i3 < i2 && this.f1226a[i3] == 0) {
            if (this.f1227b[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a3 - 1; i4 >= 0 && this.f1226a[i4] == 0; i4--) {
            if (this.f1227b[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof c)) {
                if (!(obj instanceof Map) || this.f1228c != ((Map) obj).size()) {
                    return false;
                }
                int i2 = this.f1228c;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object[] objArr = this.f1227b;
                    int i4 = i3 << 1;
                    Object obj2 = objArr[i4];
                    Object obj3 = objArr[i4 + 1];
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj3 == null) {
                        if (obj4 != null || !((Map) obj).containsKey(obj2)) {
                            return false;
                        }
                    } else if (!h.a(obj3, obj4)) {
                        return false;
                    }
                }
                return true;
            }
            c cVar = (c) obj;
            int i5 = this.f1228c;
            if (i5 != cVar.f1228c) {
                return false;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                Object[] objArr2 = this.f1227b;
                int i7 = i6 << 1;
                Object obj5 = objArr2[i7];
                Object obj6 = objArr2[i7 + 1];
                int b3 = obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5);
                Object obj7 = b3 >= 0 ? cVar.f1227b[(b3 << 1) + 1] : null;
                if (obj6 == null) {
                    if (obj7 == null) {
                        if ((obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5)) >= 0) {
                        }
                    }
                    return false;
                }
                if (!h.a(obj6, obj7)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f1226a;
        Object[] objArr = this.f1227b;
        int i2 = this.f1228c;
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

    public final String toString() {
        int i2 = this.f1228c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        int i3 = this.f1228c;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            int i5 = i4 << 1;
            Object obj = this.f1227b[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f1227b[i5 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
