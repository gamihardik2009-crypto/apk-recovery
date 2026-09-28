package E2;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final d f1083k = new d(1, 0, 1);

    public final boolean a(int i2) {
        return this.f1076h <= i2 && i2 <= this.f1077i;
    }

    @Override // E2.b
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f1076h == dVar.f1076h) {
                    if (this.f1077i == dVar.f1077i) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // E2.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1076h * 31) + this.f1077i;
    }

    @Override // E2.b
    public final boolean isEmpty() {
        return this.f1076h > this.f1077i;
    }

    @Override // E2.b
    public final String toString() {
        return this.f1076h + ".." + this.f1077i;
    }
}
