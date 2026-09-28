package H;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final int f1653a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1654b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1655c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1656d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1657e;

    public K(int i2, int i3, int i4, int i5, long j3) {
        this.f1653a = i2;
        this.f1654b = i3;
        this.f1655c = i4;
        this.f1656d = i5;
        this.f1657e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k3 = (K) obj;
        return this.f1653a == k3.f1653a && this.f1654b == k3.f1654b && this.f1655c == k3.f1655c && this.f1656d == k3.f1656d && this.f1657e == k3.f1657e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1657e) + AbstractC0837j.b(this.f1656d, AbstractC0837j.b(this.f1655c, AbstractC0837j.b(this.f1654b, Integer.hashCode(this.f1653a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CalendarMonth(year=" + this.f1653a + ", month=" + this.f1654b + ", numberOfDays=" + this.f1655c + ", daysFromStartOfWeekToFirstOfMonth=" + this.f1656d + ", startUtcTimeMillis=" + this.f1657e + ')';
    }
}
