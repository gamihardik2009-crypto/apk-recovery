package o2;

import java.util.Map;

/* renamed from: o2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0999e implements Map.Entry, A2.d {

    /* renamed from: h, reason: collision with root package name */
    public final C1000f f9337h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9338i;

    public C0999e(C1000f c1000f, int i2) {
        z2.h.f(c1000f, "map");
        this.f9337h = c1000f;
        this.f9338i = i2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (z2.h.a(entry.getKey(), getKey()) && z2.h.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9337h.f9340h[this.f9338i];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f9337h.f9341i;
        z2.h.c(objArr);
        return objArr[this.f9338i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1000f c1000f = this.f9337h;
        c1000f.e();
        Object[] objArr = c1000f.f9341i;
        if (objArr == null) {
            int length = c1000f.f9340h.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            c1000f.f9341i = objArr;
        }
        int i2 = this.f9338i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
