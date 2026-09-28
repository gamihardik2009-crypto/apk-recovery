package n0;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922a implements InterfaceC0935n {

    /* renamed from: b, reason: collision with root package name */
    public final int f8920b;

    public C0922a(int i2) {
        this.f8920b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!z2.h.a(C0922a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        z2.h.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f8920b == ((C0922a) obj).f8920b;
    }

    public final int hashCode() {
        return this.f8920b;
    }

    public final String toString() {
        return B1.t.j(new StringBuilder("AndroidPointerIcon(type="), this.f8920b, ')');
    }
}
