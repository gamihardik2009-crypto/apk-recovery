package I0;

import C0.C0024g;

/* loaded from: classes.dex */
public final class w implements InterfaceC0252i {

    /* renamed from: a, reason: collision with root package name */
    public final C0024g f3926a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3927b;

    public w(String str, int i2) {
        this.f3926a = new C0024g(str, null, 6);
        this.f3927b = i2;
    }

    @Override // I0.InterfaceC0252i
    public final void a(j jVar) {
        int i2 = jVar.f3901d;
        boolean z3 = i2 != -1;
        C0024g c0024g = this.f3926a;
        if (z3) {
            jVar.d(i2, jVar.f3902e, c0024g.f500a);
            String str = c0024g.f500a;
            if (str.length() > 0) {
                jVar.e(i2, str.length() + i2);
            }
        } else {
            int i3 = jVar.f3899b;
            jVar.d(i3, jVar.f3900c, c0024g.f500a);
            String str2 = c0024g.f500a;
            if (str2.length() > 0) {
                jVar.e(i3, str2.length() + i3);
            }
        }
        int i4 = jVar.f3899b;
        int i5 = jVar.f3900c;
        int i6 = i4 == i5 ? i5 : -1;
        int i7 = this.f3927b;
        int C3 = B1.C.C(i7 > 0 ? (i6 + i7) - 1 : (i6 + i7) - c0024g.f500a.length(), 0, jVar.f3898a.b());
        jVar.f(C3, C3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return z2.h.a(this.f3926a.f500a, wVar.f3926a.f500a) && this.f3927b == wVar.f3927b;
    }

    public final int hashCode() {
        return (this.f3926a.f500a.hashCode() * 31) + this.f3927b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f3926a.f500a);
        sb.append("', newCursorPosition=");
        return B1.t.j(sb, this.f3927b, ')');
    }
}
