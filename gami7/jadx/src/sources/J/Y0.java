package J;

/* loaded from: classes.dex */
public final class Y0 implements Z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4114a;

    public Y0(Object obj) {
        this.f4114a = obj;
    }

    @Override // J.Z0
    public final Object a(InterfaceC0282o0 interfaceC0282o0) {
        return this.f4114a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y0) && z2.h.a(this.f4114a, ((Y0) obj).f4114a);
    }

    public final int hashCode() {
        Object obj = this.f4114a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f4114a + ')';
    }
}
