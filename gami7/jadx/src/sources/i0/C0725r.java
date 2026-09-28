package i0;

/* renamed from: i0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0725r extends AbstractC0727t {

    /* renamed from: b, reason: collision with root package name */
    public final float f7931b;

    public C0725r(float f3) {
        super(3, false);
        this.f7931b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0725r) && Float.compare(this.f7931b, ((C0725r) obj).f7931b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7931b);
    }

    public final String toString() {
        return B1.t.i(new StringBuilder("RelativeVerticalTo(dy="), this.f7931b, ')');
    }
}
