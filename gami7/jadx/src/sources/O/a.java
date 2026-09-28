package O;

import java.util.Map;

/* loaded from: classes.dex */
public class a implements Map.Entry, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final Object f5092h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5093i;

    public a(Object obj, Object obj2) {
        this.f5092h = obj;
        this.f5093i = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && z2.h.a(entry.getKey(), this.f5092h) && z2.h.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5092h;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f5093i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f5092h;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5092h);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
