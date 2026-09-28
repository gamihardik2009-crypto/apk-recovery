package C;

import B1.t;
import C0.C0024g;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final C0024g f367a;

    /* renamed from: b, reason: collision with root package name */
    public C0024g f368b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f369c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f370d = null;

    public f(C0024g c0024g, C0024g c0024g2) {
        this.f367a = c0024g;
        this.f368b = c0024g2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return z2.h.a(this.f367a, fVar.f367a) && z2.h.a(this.f368b, fVar.f368b) && this.f369c == fVar.f369c && z2.h.a(this.f370d, fVar.f370d);
    }

    public final int hashCode() {
        int f3 = t.f((this.f368b.hashCode() + (this.f367a.hashCode() * 31)) * 31, 31, this.f369c);
        d dVar = this.f370d;
        return f3 + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f367a) + ", substitution=" + ((Object) this.f368b) + ", isShowingSubstitution=" + this.f369c + ", layoutCache=" + this.f370d + ')';
    }
}
