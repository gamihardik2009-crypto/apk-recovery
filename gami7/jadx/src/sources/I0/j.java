package I0;

import C0.C0024g;
import C0.J;
import D.C0046o;
import a.AbstractC0423a;
import t0.AbstractC1265x;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final E0.f f3898a;

    /* renamed from: b, reason: collision with root package name */
    public int f3899b;

    /* renamed from: c, reason: collision with root package name */
    public int f3900c;

    /* renamed from: d, reason: collision with root package name */
    public int f3901d;

    /* renamed from: e, reason: collision with root package name */
    public int f3902e;

    public j(C0024g c0024g, long j3) {
        String str = c0024g.f500a;
        E0.f fVar = new E0.f();
        fVar.f1023d = str;
        fVar.f1021b = -1;
        fVar.f1022c = -1;
        this.f3898a = fVar;
        this.f3899b = J.e(j3);
        this.f3900c = J.d(j3);
        this.f3901d = -1;
        this.f3902e = -1;
        int e3 = J.e(j3);
        int d3 = J.d(j3);
        String str2 = c0024g.f500a;
        if (e3 < 0 || e3 > str2.length()) {
            StringBuilder l3 = B1.t.l("start (", e3, ") offset is outside of text region ");
            l3.append(str2.length());
            throw new IndexOutOfBoundsException(l3.toString());
        }
        if (d3 < 0 || d3 > str2.length()) {
            StringBuilder l4 = B1.t.l("end (", d3, ") offset is outside of text region ");
            l4.append(str2.length());
            throw new IndexOutOfBoundsException(l4.toString());
        }
        if (e3 > d3) {
            throw new IllegalArgumentException(AbstractC1265x.d(e3, d3, "Do not set reversed range: ", " > "));
        }
    }

    public final void a(int i2, int i3) {
        long j3 = B1.C.j(i2, i3);
        this.f3898a.g(i2, i3, "");
        long e02 = AbstractC0423a.e0(B1.C.j(this.f3899b, this.f3900c), j3);
        h(J.e(e02));
        g(J.d(e02));
        int i4 = this.f3901d;
        if (i4 != -1) {
            long e03 = AbstractC0423a.e0(B1.C.j(i4, this.f3902e), j3);
            if (J.b(e03)) {
                this.f3901d = -1;
                this.f3902e = -1;
            } else {
                this.f3901d = J.e(e03);
                this.f3902e = J.d(e03);
            }
        }
    }

    public final char b(int i2) {
        E0.f fVar = this.f3898a;
        C0046o c0046o = (C0046o) fVar.f1024e;
        if (c0046o != null && i2 >= fVar.f1021b) {
            int b3 = c0046o.f872b - c0046o.b();
            int i3 = fVar.f1021b;
            if (i2 >= b3 + i3) {
                return ((String) fVar.f1023d).charAt(i2 - ((b3 - fVar.f1022c) + i3));
            }
            int i4 = i2 - i3;
            int i5 = c0046o.f873c;
            return i4 < i5 ? ((char[]) c0046o.f875e)[i4] : ((char[]) c0046o.f875e)[(i4 - i5) + c0046o.f874d];
        }
        return ((String) fVar.f1023d).charAt(i2);
    }

    public final J c() {
        int i2 = this.f3901d;
        if (i2 != -1) {
            return new J(B1.C.j(i2, this.f3902e));
        }
        return null;
    }

    public final void d(int i2, int i3, String str) {
        E0.f fVar = this.f3898a;
        if (i2 < 0 || i2 > fVar.b()) {
            StringBuilder l3 = B1.t.l("start (", i2, ") offset is outside of text region ");
            l3.append(fVar.b());
            throw new IndexOutOfBoundsException(l3.toString());
        }
        if (i3 < 0 || i3 > fVar.b()) {
            StringBuilder l4 = B1.t.l("end (", i3, ") offset is outside of text region ");
            l4.append(fVar.b());
            throw new IndexOutOfBoundsException(l4.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(AbstractC1265x.d(i2, i3, "Do not set reversed range: ", " > "));
        }
        fVar.g(i2, i3, str);
        h(str.length() + i2);
        g(str.length() + i2);
        this.f3901d = -1;
        this.f3902e = -1;
    }

    public final void e(int i2, int i3) {
        E0.f fVar = this.f3898a;
        if (i2 < 0 || i2 > fVar.b()) {
            StringBuilder l3 = B1.t.l("start (", i2, ") offset is outside of text region ");
            l3.append(fVar.b());
            throw new IndexOutOfBoundsException(l3.toString());
        }
        if (i3 < 0 || i3 > fVar.b()) {
            StringBuilder l4 = B1.t.l("end (", i3, ") offset is outside of text region ");
            l4.append(fVar.b());
            throw new IndexOutOfBoundsException(l4.toString());
        }
        if (i2 >= i3) {
            throw new IllegalArgumentException(AbstractC1265x.d(i2, i3, "Do not set reversed or empty range: ", " > "));
        }
        this.f3901d = i2;
        this.f3902e = i3;
    }

    public final void f(int i2, int i3) {
        E0.f fVar = this.f3898a;
        if (i2 < 0 || i2 > fVar.b()) {
            StringBuilder l3 = B1.t.l("start (", i2, ") offset is outside of text region ");
            l3.append(fVar.b());
            throw new IndexOutOfBoundsException(l3.toString());
        }
        if (i3 < 0 || i3 > fVar.b()) {
            StringBuilder l4 = B1.t.l("end (", i3, ") offset is outside of text region ");
            l4.append(fVar.b());
            throw new IndexOutOfBoundsException(l4.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(AbstractC1265x.d(i2, i3, "Do not set reversed range: ", " > "));
        }
        h(i2);
        g(i3);
    }

    public final void g(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(B1.t.h("Cannot set selectionEnd to a negative value: ", i2).toString());
        }
        this.f3900c = i2;
    }

    public final void h(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(B1.t.h("Cannot set selectionStart to a negative value: ", i2).toString());
        }
        this.f3899b = i2;
    }

    public final String toString() {
        return this.f3898a.toString();
    }
}
