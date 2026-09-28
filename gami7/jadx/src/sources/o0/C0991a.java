package o0;

import B1.t;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991a {

    /* renamed from: a, reason: collision with root package name */
    public long f9226a;

    /* renamed from: b, reason: collision with root package name */
    public float f9227b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0991a)) {
            return false;
        }
        C0991a c0991a = (C0991a) obj;
        return this.f9226a == c0991a.f9226a && Float.compare(this.f9227b, c0991a.f9227b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9227b) + (Long.hashCode(this.f9226a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f9226a);
        sb.append(", dataPoint=");
        return t.i(sb, this.f9227b, ')');
    }
}
