package Q;

import B1.t;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f5263a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f5263a == ((a) obj).f5263a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5263a);
    }

    public final String toString() {
        return t.j(new StringBuilder("DeltaCounter(count="), this.f5263a, ')');
    }
}
