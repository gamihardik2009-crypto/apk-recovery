package s;

/* renamed from: s.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1186z implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final int f10188a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f10189b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f10190c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f10191d = 0;

    @Override // s.Y
    public final int a(O0.b bVar, O0.k kVar) {
        return this.f10188a;
    }

    @Override // s.Y
    public final int b(O0.b bVar) {
        return this.f10189b;
    }

    @Override // s.Y
    public final int c(O0.b bVar, O0.k kVar) {
        return this.f10190c;
    }

    @Override // s.Y
    public final int d(O0.b bVar) {
        return this.f10191d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186z)) {
            return false;
        }
        C1186z c1186z = (C1186z) obj;
        return this.f10188a == c1186z.f10188a && this.f10189b == c1186z.f10189b && this.f10190c == c1186z.f10190c && this.f10191d == c1186z.f10191d;
    }

    public final int hashCode() {
        return (((((this.f10188a * 31) + this.f10189b) * 31) + this.f10190c) * 31) + this.f10191d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.f10188a);
        sb.append(", top=");
        sb.append(this.f10189b);
        sb.append(", right=");
        sb.append(this.f10190c);
        sb.append(", bottom=");
        return B1.t.j(sb, this.f10191d, ')');
    }
}
