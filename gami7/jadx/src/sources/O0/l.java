package O0;

import B1.t;

/* loaded from: classes.dex */
public final class l implements P0.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f5151a;

    public l(float f3) {
        this.f5151a = f3;
    }

    @Override // P0.a
    public final float a(float f3) {
        return f3 / this.f5151a;
    }

    @Override // P0.a
    public final float b(float f3) {
        return f3 * this.f5151a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f5151a, ((l) obj).f5151a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5151a);
    }

    public final String toString() {
        return t.i(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f5151a, ')');
    }
}
