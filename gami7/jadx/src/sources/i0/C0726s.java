package i0;

/* renamed from: i0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726s extends AbstractC0727t {

    /* renamed from: b, reason: collision with root package name */
    public final float f7932b;

    public C0726s(float f3) {
        super(3, false);
        this.f7932b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0726s) && Float.compare(this.f7932b, ((C0726s) obj).f7932b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7932b);
    }

    public final String toString() {
        return B1.t.i(new StringBuilder("VerticalTo(y="), this.f7932b, ')');
    }
}
