package H0;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f3410a;

    /* renamed from: b, reason: collision with root package name */
    public final k f3411b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3412c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3413d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3414e;

    public r(q qVar, k kVar, int i2, int i3, Object obj) {
        this.f3410a = qVar;
        this.f3411b = kVar;
        this.f3412c = i2;
        this.f3413d = i3;
        this.f3414e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return z2.h.a(this.f3410a, rVar.f3410a) && z2.h.a(this.f3411b, rVar.f3411b) && i.a(this.f3412c, rVar.f3412c) && j.a(this.f3413d, rVar.f3413d) && z2.h.a(this.f3414e, rVar.f3414e);
    }

    public final int hashCode() {
        q qVar = this.f3410a;
        int b3 = AbstractC0837j.b(this.f3413d, AbstractC0837j.b(this.f3412c, (((qVar == null ? 0 : qVar.hashCode()) * 31) + this.f3411b.f3405h) * 31, 31), 31);
        Object obj = this.f3414e;
        return b3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f3410a);
        sb.append(", fontWeight=");
        sb.append(this.f3411b);
        sb.append(", fontStyle=");
        int i2 = this.f3412c;
        sb.append((Object) (i.a(i2, 0) ? "Normal" : i.a(i2, 1) ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        sb.append((Object) j.b(this.f3413d));
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f3414e);
        sb.append(')');
        return sb.toString();
    }
}
