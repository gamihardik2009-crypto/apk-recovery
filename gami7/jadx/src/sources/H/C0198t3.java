package H;

import y.C1396d;

/* renamed from: H.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198t3 {

    /* renamed from: a, reason: collision with root package name */
    public final C1396d f3134a;

    /* renamed from: b, reason: collision with root package name */
    public final C1396d f3135b;

    /* renamed from: c, reason: collision with root package name */
    public final C1396d f3136c;

    /* renamed from: d, reason: collision with root package name */
    public final C1396d f3137d;

    /* renamed from: e, reason: collision with root package name */
    public final C1396d f3138e;

    public C0198t3() {
        C1396d c1396d = AbstractC0192s3.f3084a;
        C1396d c1396d2 = AbstractC0192s3.f3085b;
        C1396d c1396d3 = AbstractC0192s3.f3086c;
        C1396d c1396d4 = AbstractC0192s3.f3087d;
        C1396d c1396d5 = AbstractC0192s3.f3088e;
        this.f3134a = c1396d;
        this.f3135b = c1396d2;
        this.f3136c = c1396d3;
        this.f3137d = c1396d4;
        this.f3138e = c1396d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0198t3)) {
            return false;
        }
        C0198t3 c0198t3 = (C0198t3) obj;
        return z2.h.a(this.f3134a, c0198t3.f3134a) && z2.h.a(this.f3135b, c0198t3.f3135b) && z2.h.a(this.f3136c, c0198t3.f3136c) && z2.h.a(this.f3137d, c0198t3.f3137d) && z2.h.a(this.f3138e, c0198t3.f3138e);
    }

    public final int hashCode() {
        return this.f3138e.hashCode() + ((this.f3137d.hashCode() + ((this.f3136c.hashCode() + ((this.f3135b.hashCode() + (this.f3134a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f3134a + ", small=" + this.f3135b + ", medium=" + this.f3136c + ", large=" + this.f3137d + ", extraLarge=" + this.f3138e + ')';
    }
}
