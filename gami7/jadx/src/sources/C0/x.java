package C0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final w f558a;

    /* renamed from: b, reason: collision with root package name */
    public final v f559b;

    public x(w wVar, v vVar) {
        this.f558a = wVar;
        this.f559b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return z2.h.a(this.f559b, xVar.f559b) && z2.h.a(this.f558a, xVar.f558a);
    }

    public final int hashCode() {
        w wVar = this.f558a;
        int hashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        v vVar = this.f559b;
        return hashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f558a + ", paragraphSyle=" + this.f559b + ')';
    }
}
