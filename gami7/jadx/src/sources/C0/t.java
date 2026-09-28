package C0;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f543a;

    /* renamed from: b, reason: collision with root package name */
    public final int f544b;

    /* renamed from: c, reason: collision with root package name */
    public final long f545c;

    /* renamed from: d, reason: collision with root package name */
    public final N0.o f546d;

    /* renamed from: e, reason: collision with root package name */
    public final v f547e;

    /* renamed from: f, reason: collision with root package name */
    public final N0.g f548f;

    /* renamed from: g, reason: collision with root package name */
    public final int f549g;

    /* renamed from: h, reason: collision with root package name */
    public final int f550h;

    /* renamed from: i, reason: collision with root package name */
    public final N0.p f551i;

    public t(int i2, int i3, long j3, N0.o oVar, v vVar, N0.g gVar, int i4, int i5, N0.p pVar) {
        this.f543a = i2;
        this.f544b = i3;
        this.f545c = j3;
        this.f546d = oVar;
        this.f547e = vVar;
        this.f548f = gVar;
        this.f549g = i4;
        this.f550h = i5;
        this.f551i = pVar;
        if (O0.m.a(j3, O0.m.f5153c) || O0.m.c(j3) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + O0.m.c(j3) + ')').toString());
    }

    public final t a(t tVar) {
        if (tVar == null) {
            return this;
        }
        return u.a(this, tVar.f543a, tVar.f544b, tVar.f545c, tVar.f546d, tVar.f547e, tVar.f548f, tVar.f549g, tVar.f550h, tVar.f551i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return N0.i.a(this.f543a, tVar.f543a) && N0.k.a(this.f544b, tVar.f544b) && O0.m.a(this.f545c, tVar.f545c) && z2.h.a(this.f546d, tVar.f546d) && z2.h.a(this.f547e, tVar.f547e) && z2.h.a(this.f548f, tVar.f548f) && this.f549g == tVar.f549g && N0.d.a(this.f550h, tVar.f550h) && z2.h.a(this.f551i, tVar.f551i);
    }

    public final int hashCode() {
        int b3 = AbstractC0837j.b(this.f544b, Integer.hashCode(this.f543a) * 31, 31);
        O0.n[] nVarArr = O0.m.f5152b;
        int d3 = B1.t.d(b3, 31, this.f545c);
        N0.o oVar = this.f546d;
        int hashCode = (d3 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        v vVar = this.f547e;
        int hashCode2 = (hashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
        N0.g gVar = this.f548f;
        int b4 = AbstractC0837j.b(this.f550h, AbstractC0837j.b(this.f549g, (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31), 31);
        N0.p pVar = this.f551i;
        return b4 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) N0.i.b(this.f543a)) + ", textDirection=" + ((Object) N0.k.b(this.f544b)) + ", lineHeight=" + ((Object) O0.m.d(this.f545c)) + ", textIndent=" + this.f546d + ", platformStyle=" + this.f547e + ", lineHeightStyle=" + this.f548f + ", lineBreak=" + ((Object) N0.e.a(this.f549g)) + ", hyphens=" + ((Object) N0.d.b(this.f550h)) + ", textMotion=" + this.f551i + ')';
    }
}
