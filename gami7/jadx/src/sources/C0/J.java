package C0;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final long f471b = B1.C.j(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f472c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f473a;

    public /* synthetic */ J(long j3) {
        this.f473a = j3;
    }

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final boolean b(long j3) {
        return ((int) (j3 >> 32)) == ((int) (j3 & 4294967295L));
    }

    public static final int c(long j3) {
        return d(j3) - e(j3);
    }

    public static final int d(long j3) {
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        return i2 > i3 ? i2 : i3;
    }

    public static final int e(long j3) {
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        return i2 > i3 ? i3 : i2;
    }

    public static final boolean f(long j3) {
        return ((int) (j3 >> 32)) > ((int) (j3 & 4294967295L));
    }

    public static String g(long j3) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return B1.t.j(sb, (int) (j3 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J) {
            return this.f473a == ((J) obj).f473a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f473a);
    }

    public final String toString() {
        return g(this.f473a);
    }
}
