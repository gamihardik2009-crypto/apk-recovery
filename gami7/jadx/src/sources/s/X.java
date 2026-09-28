package s;

import J.C0257c;
import J.C0274k0;

/* loaded from: classes.dex */
public final class X implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final String f10089a;

    /* renamed from: b, reason: collision with root package name */
    public final C0274k0 f10090b;

    public X(C1152E c1152e, String str) {
        this.f10089a = str;
        this.f10090b = C0257c.N(c1152e, J.W.f4109m);
    }

    @Override // s.Y
    public final int a(O0.b bVar, O0.k kVar) {
        return e().f10048a;
    }

    @Override // s.Y
    public final int b(O0.b bVar) {
        return e().f10049b;
    }

    @Override // s.Y
    public final int c(O0.b bVar, O0.k kVar) {
        return e().f10050c;
    }

    @Override // s.Y
    public final int d(O0.b bVar) {
        return e().f10051d;
    }

    public final C1152E e() {
        return (C1152E) this.f10090b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X) {
            return z2.h.a(e(), ((X) obj).e());
        }
        return false;
    }

    public final void f(C1152E c1152e) {
        this.f10090b.setValue(c1152e);
    }

    public final int hashCode() {
        return this.f10089a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10089a);
        sb.append("(left=");
        sb.append(e().f10048a);
        sb.append(", top=");
        sb.append(e().f10049b);
        sb.append(", right=");
        sb.append(e().f10050c);
        sb.append(", bottom=");
        return B1.t.j(sb, e().f10051d, ')');
    }
}
