package m;

/* renamed from: m.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822F {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8302a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0851y f8303b;

    /* renamed from: c, reason: collision with root package name */
    public int f8304c;

    public C0822F(Float f3, InterfaceC0851y interfaceC0851y) {
        this.f8302a = f3;
        this.f8303b = interfaceC0851y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0822F)) {
            return false;
        }
        C0822F c0822f = (C0822F) obj;
        return z2.h.a(c0822f.f8302a, this.f8302a) && z2.h.a(c0822f.f8303b, this.f8303b) && c0822f.f8304c == this.f8304c;
    }

    public final int hashCode() {
        Object obj = this.f8302a;
        return this.f8303b.hashCode() + AbstractC0837j.b(this.f8304c, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
