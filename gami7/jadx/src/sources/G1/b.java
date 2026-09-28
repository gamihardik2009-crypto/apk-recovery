package G1;

import B1.t;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1230a;

    public b(int i2) {
        this.f1230a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f1230a == ((b) obj).f1230a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1230a);
    }

    public final String toString() {
        return t.j(new StringBuilder("ConstraintsNotMet(reason="), this.f1230a, ')');
    }
}
