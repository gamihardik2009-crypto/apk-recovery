package J;

/* loaded from: classes.dex */
public final class J implements Z0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0258c0 f4039a;

    public J(C0274k0 c0274k0) {
        this.f4039a = c0274k0;
    }

    @Override // J.Z0
    public final Object a(InterfaceC0282o0 interfaceC0282o0) {
        return this.f4039a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && z2.h.a(this.f4039a, ((J) obj).f4039a);
    }

    public final int hashCode() {
        return this.f4039a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f4039a + ')';
    }
}
