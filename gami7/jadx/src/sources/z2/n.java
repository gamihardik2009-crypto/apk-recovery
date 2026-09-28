package z2;

/* loaded from: classes.dex */
public abstract class n extends b implements F2.d {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f11904n;

    public n(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f11904n = false;
    }

    public final F2.a d() {
        if (this.f11904n) {
            return this;
        }
        F2.a aVar = this.f11889h;
        if (aVar != null) {
            return aVar;
        }
        F2.a a3 = a();
        this.f11889h = a3;
        return a3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return b().equals(nVar.b()) && this.f11892k.equals(nVar.f11892k) && this.f11893l.equals(nVar.f11893l) && h.a(this.f11890i, nVar.f11890i);
        }
        if (obj instanceof F2.d) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f11893l.hashCode() + B1.t.e(b().hashCode() * 31, 31, this.f11892k);
    }

    public final String toString() {
        F2.a d3 = d();
        if (d3 != this) {
            return d3.toString();
        }
        return "property " + this.f11892k + " (Kotlin reflection is not available)";
    }
}
