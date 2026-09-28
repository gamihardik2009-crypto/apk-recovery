package H;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class H implements Comparable {

    /* renamed from: h, reason: collision with root package name */
    public final int f1544h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1545i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1546j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1547k;

    public H(int i2, int i3, int i4, long j3) {
        this.f1544h = i2;
        this.f1545i = i3;
        this.f1546j = i4;
        this.f1547k = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = ((H) obj).f1547k;
        long j4 = this.f1547k;
        if (j4 < j3) {
            return -1;
        }
        return j4 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h2 = (H) obj;
        return this.f1544h == h2.f1544h && this.f1545i == h2.f1545i && this.f1546j == h2.f1546j && this.f1547k == h2.f1547k;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1547k) + AbstractC0837j.b(this.f1546j, AbstractC0837j.b(this.f1545i, Integer.hashCode(this.f1544h) * 31, 31), 31);
    }

    public final String toString() {
        return "CalendarDate(year=" + this.f1544h + ", month=" + this.f1545i + ", dayOfMonth=" + this.f1546j + ", utcTimeMillis=" + this.f1547k + ')';
    }
}
