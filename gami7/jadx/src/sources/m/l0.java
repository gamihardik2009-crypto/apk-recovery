package m;

/* loaded from: classes.dex */
public final class l0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8517a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8518b;

    public l0(Object obj, Object obj2) {
        this.f8517a = obj;
        this.f8518b = obj2;
    }

    @Override // m.k0
    public final Object b() {
        return this.f8517a;
    }

    @Override // m.k0
    public final Object c() {
        return this.f8518b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (z2.h.a(this.f8517a, k0Var.b())) {
                if (z2.h.a(this.f8518b, k0Var.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f8517a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f8518b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
