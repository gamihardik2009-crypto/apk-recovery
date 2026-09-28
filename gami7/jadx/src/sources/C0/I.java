package C0;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final C f467a;

    /* renamed from: b, reason: collision with root package name */
    public final C f468b;

    /* renamed from: c, reason: collision with root package name */
    public final C f469c;

    /* renamed from: d, reason: collision with root package name */
    public final C f470d;

    public I(C c3, C c4, C c5, C c6) {
        this.f467a = c3;
        this.f468b = c4;
        this.f469c = c5;
        this.f470d = c6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof I)) {
            return false;
        }
        I i2 = (I) obj;
        return z2.h.a(this.f467a, i2.f467a) && z2.h.a(this.f468b, i2.f468b) && z2.h.a(this.f469c, i2.f469c) && z2.h.a(this.f470d, i2.f470d);
    }

    public final int hashCode() {
        C c3 = this.f467a;
        int hashCode = (c3 != null ? c3.hashCode() : 0) * 31;
        C c4 = this.f468b;
        int hashCode2 = (hashCode + (c4 != null ? c4.hashCode() : 0)) * 31;
        C c5 = this.f469c;
        int hashCode3 = (hashCode2 + (c5 != null ? c5.hashCode() : 0)) * 31;
        C c6 = this.f470d;
        return hashCode3 + (c6 != null ? c6.hashCode() : 0);
    }
}
