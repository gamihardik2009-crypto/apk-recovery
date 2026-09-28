package W1;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final String f6002a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6003b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6004c;

    public U(String str, String str2, boolean z3) {
        this.f6002a = str;
        this.f6003b = str2;
        this.f6004c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u3 = (U) obj;
        return z2.h.a(this.f6002a, u3.f6002a) && z2.h.a(this.f6003b, u3.f6003b) && this.f6004c == u3.f6004c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6004c) + B1.t.e(this.f6002a.hashCode() * 31, 31, this.f6003b);
    }

    public final String toString() {
        return "ContactPickerItem(name=" + this.f6002a + ", phone=" + this.f6003b + ", isAlreadyAdded=" + this.f6004c + ')';
    }
}
