package s;

import J.C0257c;
import J.C0274k0;
import b1.C0521S;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1164c implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final int f10123a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10124b;

    /* renamed from: c, reason: collision with root package name */
    public final C0274k0 f10125c;

    /* renamed from: d, reason: collision with root package name */
    public final C0274k0 f10126d;

    public C1164c(String str, int i2) {
        this.f10123a = i2;
        this.f10124b = str;
        W0.b bVar = W0.b.f5890e;
        J.W w2 = J.W.f4109m;
        this.f10125c = C0257c.N(bVar, w2);
        this.f10126d = C0257c.N(Boolean.TRUE, w2);
    }

    @Override // s.Y
    public final int a(O0.b bVar, O0.k kVar) {
        return e().f5891a;
    }

    @Override // s.Y
    public final int b(O0.b bVar) {
        return e().f5892b;
    }

    @Override // s.Y
    public final int c(O0.b bVar, O0.k kVar) {
        return e().f5893c;
    }

    @Override // s.Y
    public final int d(O0.b bVar) {
        return e().f5894d;
    }

    public final W0.b e() {
        return (W0.b) this.f10125c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1164c) {
            return this.f10123a == ((C1164c) obj).f10123a;
        }
        return false;
    }

    public final void f(C0521S c0521s, int i2) {
        int i3 = this.f10123a;
        if (i2 == 0 || (i2 & i3) != 0) {
            this.f10125c.setValue(c0521s.f7111a.f(i3));
            this.f10126d.setValue(Boolean.valueOf(c0521s.f7111a.o(i3)));
        }
    }

    public final int hashCode() {
        return this.f10123a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10124b);
        sb.append('(');
        sb.append(e().f5891a);
        sb.append(", ");
        sb.append(e().f5892b);
        sb.append(", ");
        sb.append(e().f5893c);
        sb.append(", ");
        return B1.t.j(sb, e().f5894d, ')');
    }
}
