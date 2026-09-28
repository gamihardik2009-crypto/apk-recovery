package I0;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final m f3904g = new m(false, 0, true, 1, 1, J0.b.f4322j);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3905a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3906b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3907c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3908d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3909e;

    /* renamed from: f, reason: collision with root package name */
    public final J0.b f3910f;

    public m(boolean z3, int i2, boolean z4, int i3, int i4, J0.b bVar) {
        this.f3905a = z3;
        this.f3906b = i2;
        this.f3907c = z4;
        this.f3908d = i3;
        this.f3909e = i4;
        this.f3910f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f3905a != mVar.f3905a || !n.a(this.f3906b, mVar.f3906b) || this.f3907c != mVar.f3907c || !o.a(this.f3908d, mVar.f3908d) || !l.a(this.f3909e, mVar.f3909e)) {
            return false;
        }
        mVar.getClass();
        return z2.h.a(null, null) && z2.h.a(this.f3910f, mVar.f3910f);
    }

    public final int hashCode() {
        return this.f3910f.f4323h.hashCode() + AbstractC0837j.b(this.f3909e, AbstractC0837j.b(this.f3908d, B1.t.f(AbstractC0837j.b(this.f3906b, Boolean.hashCode(this.f3905a) * 31, 31), 31, this.f3907c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f3905a + ", capitalization=" + ((Object) n.b(this.f3906b)) + ", autoCorrect=" + this.f3907c + ", keyboardType=" + ((Object) o.b(this.f3908d)) + ", imeAction=" + ((Object) l.b(this.f3909e)) + ", platformImeOptions=null, hintLocales=" + this.f3910f + ')';
    }
}
