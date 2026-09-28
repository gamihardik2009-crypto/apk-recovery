package I0;

import C0.C0024g;

/* renamed from: I0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244a implements InterfaceC0252i {

    /* renamed from: a, reason: collision with root package name */
    public final C0024g f3867a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3868b;

    public C0244a(C0024g c0024g, int i2) {
        this.f3867a = c0024g;
        this.f3868b = i2;
    }

    @Override // I0.InterfaceC0252i
    public final void a(j jVar) {
        int i2 = jVar.f3901d;
        boolean z3 = i2 != -1;
        C0024g c0024g = this.f3867a;
        if (z3) {
            jVar.d(i2, jVar.f3902e, c0024g.f500a);
        } else {
            jVar.d(jVar.f3899b, jVar.f3900c, c0024g.f500a);
        }
        int i3 = jVar.f3899b;
        int i4 = jVar.f3900c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.f3868b;
        int C3 = B1.C.C(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - c0024g.f500a.length(), 0, jVar.f3898a.b());
        jVar.f(C3, C3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0244a)) {
            return false;
        }
        C0244a c0244a = (C0244a) obj;
        return z2.h.a(this.f3867a.f500a, c0244a.f3867a.f500a) && this.f3868b == c0244a.f3868b;
    }

    public final int hashCode() {
        return (this.f3867a.f500a.hashCode() * 31) + this.f3868b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f3867a.f500a);
        sb.append("', newCursorPosition=");
        return B1.t.j(sb, this.f3868b, ')');
    }

    public C0244a(String str, int i2) {
        this(new C0024g(str, null, 6), i2);
    }
}
