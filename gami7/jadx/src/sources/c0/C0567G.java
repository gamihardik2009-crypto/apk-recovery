package c0;

/* renamed from: c0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567G extends AbstractC0569I {

    /* renamed from: a, reason: collision with root package name */
    public final b0.d f7190a;

    public C0567G(b0.d dVar) {
        this.f7190a = dVar;
    }

    @Override // c0.AbstractC0569I
    public final b0.d a() {
        return this.f7190a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0567G) {
            return z2.h.a(this.f7190a, ((C0567G) obj).f7190a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7190a.hashCode();
    }
}
