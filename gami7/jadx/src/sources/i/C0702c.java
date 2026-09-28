package i;

import java.util.Map;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702c implements Map.Entry {

    /* renamed from: h, reason: collision with root package name */
    public final Object f7792h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7793i;

    /* renamed from: j, reason: collision with root package name */
    public C0702c f7794j;

    /* renamed from: k, reason: collision with root package name */
    public C0702c f7795k;

    public C0702c(Object obj, Object obj2) {
        this.f7792h = obj;
        this.f7793i = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0702c)) {
            return false;
        }
        C0702c c0702c = (C0702c) obj;
        return this.f7792h.equals(c0702c.f7792h) && this.f7793i.equals(c0702c.f7793i);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7792h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7793i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7792h.hashCode() ^ this.f7793i.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f7792h + "=" + this.f7793i;
    }
}
