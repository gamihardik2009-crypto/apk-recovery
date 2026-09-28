package z2;

import A0.w;
import J2.A;

/* loaded from: classes.dex */
public final class j extends k implements F2.d, y2.c {
    public j(String str, String str2) {
        super(a.f11888h, w.class, str, str2, 1);
    }

    @Override // z2.b
    public final F2.a a() {
        t.f11910a.getClass();
        return this;
    }

    public final void f() {
        if (this.f11904n) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        F2.a d3 = d();
        if (d3 == this) {
            throw new A("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((j) ((F2.d) d3)).f();
    }

    @Override // y2.c
    public final Object l(Object obj) {
        f();
        throw null;
    }
}
