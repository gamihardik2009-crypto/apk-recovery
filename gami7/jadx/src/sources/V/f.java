package V;

import B1.t;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f5849a;

    public f(float f3) {
        this.f5849a = f3;
    }

    public final int a(int i2, int i3) {
        return Math.round((1 + this.f5849a) * ((i3 - i2) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f5849a, ((f) obj).f5849a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5849a);
    }

    public final String toString() {
        return t.i(new StringBuilder("Vertical(bias="), this.f5849a, ')');
    }
}
