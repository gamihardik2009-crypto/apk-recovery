package C;

import B1.t;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f388a;

    /* renamed from: b, reason: collision with root package name */
    public String f389b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f390c = false;

    /* renamed from: d, reason: collision with root package name */
    public e f391d = null;

    public j(String str, String str2) {
        this.f388a = str;
        this.f389b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return z2.h.a(this.f388a, jVar.f388a) && z2.h.a(this.f389b, jVar.f389b) && this.f390c == jVar.f390c && z2.h.a(this.f391d, jVar.f391d);
    }

    public final int hashCode() {
        int f3 = t.f(t.e(this.f388a.hashCode() * 31, 31, this.f389b), 31, this.f390c);
        e eVar = this.f391d;
        return f3 + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f391d + ", isShowingSubstitution=" + this.f390c + ')';
    }
}
