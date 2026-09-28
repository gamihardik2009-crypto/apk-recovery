package G1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1231a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1232b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1233c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1234d;

    public d(boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f1231a = z3;
        this.f1232b = z4;
        this.f1233c = z5;
        this.f1234d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1231a == dVar.f1231a && this.f1232b == dVar.f1232b && this.f1233c == dVar.f1233c && this.f1234d == dVar.f1234d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z3 = this.f1231a;
        int i2 = z3;
        if (z3 != 0) {
            i2 = 1;
        }
        int i3 = i2 * 31;
        boolean z4 = this.f1232b;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z5 = this.f1233c;
        int i6 = z5;
        if (z5 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z6 = this.f1234d;
        return i7 + (z6 ? 1 : z6 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f1231a + ", isValidated=" + this.f1232b + ", isMetered=" + this.f1233c + ", isNotRoaming=" + this.f1234d + ')';
    }
}
