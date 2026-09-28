package p0;

import B1.t;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057b {

    /* renamed from: a, reason: collision with root package name */
    public final float f9727a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9728b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9729c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9730d;

    public C1057b(float f3, float f4, int i2, long j3) {
        this.f9727a = f3;
        this.f9728b = f4;
        this.f9729c = j3;
        this.f9730d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1057b) {
            C1057b c1057b = (C1057b) obj;
            if (c1057b.f9727a == this.f9727a && c1057b.f9728b == this.f9728b && c1057b.f9729c == this.f9729c && c1057b.f9730d == this.f9730d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9730d) + t.d(t.c(this.f9728b, Float.hashCode(this.f9727a) * 31, 31), 31, this.f9729c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.f9727a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.f9728b);
        sb.append(",uptimeMillis=");
        sb.append(this.f9729c);
        sb.append(",deviceId=");
        return t.j(sb, this.f9730d, ')');
    }
}
