package s;

/* renamed from: s.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183w {

    /* renamed from: a, reason: collision with root package name */
    public final V.e f10183a;

    public C1183w(V.e eVar) {
        this.f10183a = eVar;
    }

    public final int a(int i2, O0.k kVar) {
        return this.f10183a.a(0, i2, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1183w) && z2.h.a(this.f10183a, ((C1183w) obj).f10183a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10183a.f5848a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f10183a + ')';
    }
}
