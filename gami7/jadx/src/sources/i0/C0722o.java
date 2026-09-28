package i0;

/* renamed from: i0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722o extends AbstractC0727t {

    /* renamed from: b, reason: collision with root package name */
    public final float f7924b;

    public C0722o(float f3) {
        super(3, false);
        this.f7924b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0722o) && Float.compare(this.f7924b, ((C0722o) obj).f7924b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7924b);
    }

    public final String toString() {
        return B1.t.i(new StringBuilder("RelativeHorizontalTo(dx="), this.f7924b, ')');
    }
}
