package J;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final E0 f3979a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3980b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3981c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f3982d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3983e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3984f;

    /* renamed from: g, reason: collision with root package name */
    public int f3985g;

    /* renamed from: h, reason: collision with root package name */
    public int f3986h;

    /* renamed from: i, reason: collision with root package name */
    public int f3987i;

    /* renamed from: j, reason: collision with root package name */
    public final N f3988j;

    /* renamed from: k, reason: collision with root package name */
    public int f3989k;

    /* renamed from: l, reason: collision with root package name */
    public int f3990l;

    /* renamed from: m, reason: collision with root package name */
    public int f3991m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3992n;

    public D0(E0 e02) {
        this.f3979a = e02;
        this.f3980b = e02.f3998h;
        int i2 = e02.f3999i;
        this.f3981c = i2;
        this.f3982d = e02.f4000j;
        this.f3983e = e02.f4001k;
        this.f3986h = i2;
        this.f3987i = -1;
        this.f3988j = new N();
    }

    public final C0255b a(int i2) {
        ArrayList arrayList = this.f3979a.f4005o;
        int U3 = C0257c.U(arrayList, i2, this.f3981c);
        if (U3 >= 0) {
            return (C0255b) arrayList.get(U3);
        }
        C0255b c0255b = new C0255b(i2);
        arrayList.add(-(U3 + 1), c0255b);
        return c0255b;
    }

    public final Object b(int[] iArr, int i2) {
        int A3;
        if (!C0257c.k(iArr, i2)) {
            return C0275l.f4150a;
        }
        int i3 = i2 * 5;
        if (i3 >= iArr.length) {
            A3 = iArr.length;
        } else {
            A3 = C0257c.A(iArr[i3 + 1] >> 29) + iArr[i3 + 4];
        }
        return this.f3982d[A3];
    }

    public final void c() {
        int i2;
        this.f3984f = true;
        E0 e02 = this.f3979a;
        e02.getClass();
        if (this.f3979a != e02 || (i2 = e02.f4002l) <= 0) {
            C0257c.y("Unexpected reader close()");
            throw null;
        }
        e02.f4002l = i2 - 1;
    }

    public final void d() {
        if (this.f3989k == 0) {
            if (!(this.f3985g == this.f3986h)) {
                C0257c.y("endGroup() not called at the end of a group");
                throw null;
            }
            int i2 = this.f3987i;
            int[] iArr = this.f3980b;
            int p3 = C0257c.p(iArr, i2);
            this.f3987i = p3;
            int i3 = this.f3981c;
            this.f3986h = p3 < 0 ? i3 : C0257c.j(iArr, p3) + p3;
            int a3 = this.f3988j.a();
            if (a3 < 0) {
                this.f3990l = 0;
                this.f3991m = 0;
            } else {
                this.f3990l = a3;
                this.f3991m = p3 >= i3 - 1 ? this.f3983e : C0257c.i(iArr, p3 + 1);
            }
        }
    }

    public final Object e() {
        int i2 = this.f3985g;
        if (i2 < this.f3986h) {
            return b(this.f3980b, i2);
        }
        return 0;
    }

    public final int f() {
        int i2 = this.f3985g;
        if (i2 >= this.f3986h) {
            return 0;
        }
        return this.f3980b[i2 * 5];
    }

    public final Object g(int i2, int i3) {
        int[] iArr = this.f3980b;
        int r3 = C0257c.r(iArr, i2);
        int i4 = i2 + 1;
        int i5 = r3 + i3;
        return i5 < (i4 < this.f3981c ? iArr[(i4 * 5) + 4] : this.f3983e) ? this.f3982d[i5] : C0275l.f4150a;
    }

    public final Object h() {
        int i2;
        if (this.f3989k > 0 || (i2 = this.f3990l) >= this.f3991m) {
            this.f3992n = false;
            return C0275l.f4150a;
        }
        this.f3992n = true;
        this.f3990l = i2 + 1;
        return this.f3982d[i2];
    }

    public final Object i(int i2) {
        int[] iArr = this.f3980b;
        if (!C0257c.m(iArr, i2)) {
            return null;
        }
        if (!C0257c.m(iArr, i2)) {
            return C0275l.f4150a;
        }
        return this.f3982d[iArr[(i2 * 5) + 4]];
    }

    public final Object j(int[] iArr, int i2) {
        if (!C0257c.l(iArr, i2)) {
            return null;
        }
        int i3 = i2 * 5;
        return this.f3982d[C0257c.A(iArr[i3 + 1] >> 30) + iArr[i3 + 4]];
    }

    public final void k(int i2) {
        if (!(this.f3989k == 0)) {
            C0257c.y("Cannot reposition while in an empty region");
            throw null;
        }
        this.f3985g = i2;
        int[] iArr = this.f3980b;
        int i3 = this.f3981c;
        int p3 = i2 < i3 ? C0257c.p(iArr, i2) : -1;
        this.f3987i = p3;
        if (p3 < 0) {
            this.f3986h = i3;
        } else {
            this.f3986h = C0257c.j(iArr, p3) + p3;
        }
        this.f3990l = 0;
        this.f3991m = 0;
    }

    public final int l() {
        if (!(this.f3989k == 0)) {
            C0257c.y("Cannot skip while in an empty region");
            throw null;
        }
        int i2 = this.f3985g;
        int[] iArr = this.f3980b;
        int o3 = C0257c.m(iArr, i2) ? 1 : C0257c.o(iArr, this.f3985g);
        int i3 = this.f3985g;
        this.f3985g = C0257c.j(iArr, i3) + i3;
        return o3;
    }

    public final void m() {
        if (!(this.f3989k == 0)) {
            C0257c.y("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f3985g = this.f3986h;
        this.f3990l = 0;
        this.f3991m = 0;
    }

    public final void n() {
        if (this.f3989k <= 0) {
            int i2 = this.f3987i;
            int i3 = this.f3985g;
            int[] iArr = this.f3980b;
            if (!(C0257c.p(iArr, i3) == i2)) {
                C0257c.W("Invalid slot table detected");
                throw null;
            }
            int i4 = this.f3990l;
            int i5 = this.f3991m;
            N n3 = this.f3988j;
            if (i4 == 0 && i5 == 0) {
                n3.b(-1);
            } else {
                n3.b(i4);
            }
            this.f3987i = i3;
            this.f3986h = C0257c.j(iArr, i3) + i3;
            int i6 = i3 + 1;
            this.f3985g = i6;
            this.f3990l = C0257c.r(iArr, i3);
            this.f3991m = i3 >= this.f3981c - 1 ? this.f3983e : C0257c.i(iArr, i6);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f3985g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.f3987i);
        sb.append(", end=");
        return B1.t.j(sb, this.f3986h, ')');
    }
}
