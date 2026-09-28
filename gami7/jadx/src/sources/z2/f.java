package z2;

import m2.InterfaceC0861c;

/* loaded from: classes.dex */
public abstract class f extends b implements e, F2.a, InterfaceC0861c {

    /* renamed from: n, reason: collision with root package name */
    public final int f11899n;

    /* renamed from: o, reason: collision with root package name */
    public final int f11900o;

    public f(int i2, Class cls, String str, String str2, int i3) {
        this(i2, i3, cls, a.f11888h, str, str2);
    }

    @Override // z2.b
    public final F2.a a() {
        t.f11910a.getClass();
        return this;
    }

    @Override // z2.e
    public final int e() {
        return this.f11899n;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f11892k.equals(fVar.f11892k) && this.f11893l.equals(fVar.f11893l) && this.f11900o == fVar.f11900o && this.f11899n == fVar.f11899n && h.a(this.f11890i, fVar.f11890i) && h.a(b(), fVar.b());
        }
        if (!(obj instanceof f)) {
            return false;
        }
        F2.a aVar = this.f11889h;
        if (aVar == null) {
            a();
            this.f11889h = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        return this.f11893l.hashCode() + B1.t.e(b() == null ? 0 : b().hashCode() * 31, 31, this.f11892k);
    }

    public final String toString() {
        F2.a aVar = this.f11889h;
        if (aVar == null) {
            a();
            this.f11889h = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f11892k;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public f(int i2, int i3, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f11899n = i2;
        this.f11900o = 0;
    }
}
