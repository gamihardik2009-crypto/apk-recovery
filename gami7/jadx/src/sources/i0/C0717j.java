package i0;

/* renamed from: i0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717j extends AbstractC0727t {

    /* renamed from: b, reason: collision with root package name */
    public final float f7909b;

    public C0717j(float f3) {
        super(3, false);
        this.f7909b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0717j) && Float.compare(this.f7909b, ((C0717j) obj).f7909b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7909b);
    }

    public final String toString() {
        return B1.t.i(new StringBuilder("HorizontalTo(x="), this.f7909b, ')');
    }
}
