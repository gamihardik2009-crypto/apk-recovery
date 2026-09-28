package y;

import b0.f;

/* renamed from: y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1395c implements InterfaceC1393a {

    /* renamed from: a, reason: collision with root package name */
    public final float f11481a;

    public C1395c(float f3) {
        this.f11481a = f3;
        if (f3 < 0.0f || f3 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // y.InterfaceC1393a
    public final float a(long j3, O0.b bVar) {
        return (this.f11481a / 100.0f) * f.c(j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1395c) && Float.compare(this.f11481a, ((C1395c) obj).f11481a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11481a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f11481a + "%)";
    }
}
