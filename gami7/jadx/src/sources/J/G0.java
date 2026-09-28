package J;

import j.C0761q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n2.AbstractC0959k;
import n2.AbstractC0961m;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final E0 f4015a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4016b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4017c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4018d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f4019e;

    /* renamed from: f, reason: collision with root package name */
    public C0761q f4020f;

    /* renamed from: g, reason: collision with root package name */
    public int f4021g;

    /* renamed from: h, reason: collision with root package name */
    public int f4022h;

    /* renamed from: i, reason: collision with root package name */
    public int f4023i;

    /* renamed from: j, reason: collision with root package name */
    public int f4024j;

    /* renamed from: k, reason: collision with root package name */
    public int f4025k;

    /* renamed from: l, reason: collision with root package name */
    public int f4026l;

    /* renamed from: m, reason: collision with root package name */
    public int f4027m;

    /* renamed from: n, reason: collision with root package name */
    public int f4028n;

    /* renamed from: o, reason: collision with root package name */
    public int f4029o;

    /* renamed from: p, reason: collision with root package name */
    public final N f4030p;
    public final N q;

    /* renamed from: r, reason: collision with root package name */
    public final N f4031r;

    /* renamed from: s, reason: collision with root package name */
    public int f4032s;

    /* renamed from: t, reason: collision with root package name */
    public int f4033t;

    /* renamed from: u, reason: collision with root package name */
    public int f4034u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4035v;

    /* renamed from: w, reason: collision with root package name */
    public G1.i f4036w;

    public G0(E0 e02) {
        this.f4015a = e02;
        int[] iArr = e02.f3998h;
        this.f4016b = iArr;
        Object[] objArr = e02.f4000j;
        this.f4017c = objArr;
        this.f4018d = e02.f4005o;
        this.f4019e = e02.f4006p;
        this.f4020f = e02.q;
        int i2 = e02.f3999i;
        this.f4021g = i2;
        this.f4022h = (iArr.length / 5) - i2;
        int i3 = e02.f4001k;
        this.f4025k = i3;
        this.f4026l = objArr.length - i3;
        this.f4027m = i2;
        this.f4030p = new N();
        this.q = new N();
        this.f4031r = new N();
        this.f4033t = i2;
        this.f4034u = -1;
    }

    public static int h(int i2, int i3, int i4, int i5) {
        return i2 > i3 ? -(((i5 - i4) - i2) + 1) : i2;
    }

    public static void u(G0 g02) {
        int i2 = g02.f4034u;
        int p3 = g02.p(i2);
        int[] iArr = g02.f4016b;
        int i3 = (p3 * 5) + 1;
        int i4 = iArr[i3];
        if ((i4 & 134217728) != 0) {
            return;
        }
        iArr[i3] = i4 | 134217728;
        if (C0257c.h(iArr, p3)) {
            return;
        }
        g02.O(g02.z(g02.f4016b, i2));
    }

    public final void A() {
        boolean z3;
        G1.i iVar = this.f4036w;
        if (iVar != null) {
            while (!iVar.f1241a.isEmpty()) {
                int c3 = iVar.c();
                int p3 = p(c3);
                int i2 = c3 + 1;
                int q = q(c3) + c3;
                while (true) {
                    if (i2 >= q) {
                        z3 = false;
                        break;
                    } else {
                        if ((this.f4016b[(p(i2) * 5) + 1] & 201326592) != 0) {
                            z3 = true;
                            break;
                        }
                        i2 += q(i2);
                    }
                }
                if (C0257c.h(this.f4016b, p3) != z3) {
                    int[] iArr = this.f4016b;
                    int i3 = (p3 * 5) + 1;
                    if (z3) {
                        iArr[i3] = iArr[i3] | 67108864;
                    } else {
                        iArr[i3] = iArr[i3] & (-67108865);
                    }
                    int z4 = z(iArr, c3);
                    if (z4 >= 0) {
                        iVar.a(z4);
                    }
                }
            }
        }
    }

    public final boolean B() {
        if (this.f4028n != 0) {
            C0257c.y("Cannot remove group while inserting");
            throw null;
        }
        int i2 = this.f4032s;
        int i3 = this.f4023i;
        int f3 = f(this.f4016b, p(i2));
        int E = E();
        I(this.f4034u);
        G1.i iVar = this.f4036w;
        if (iVar != null) {
            while (true) {
                List list = iVar.f1241a;
                if (!(!list.isEmpty()) || ((Number) AbstractC0961m.G(list)).intValue() < i2) {
                    break;
                }
                iVar.c();
            }
        }
        boolean C3 = C(i2, this.f4032s - i2);
        D(f3, this.f4023i - f3, i2 - 1);
        this.f4032s = i2;
        this.f4023i = i3;
        this.f4029o -= E;
        return C3;
    }

    public final boolean C(int i2, int i3) {
        if (i3 > 0) {
            ArrayList arrayList = this.f4018d;
            w(i2);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f4019e;
                int i4 = i2 + i3;
                int n3 = C0257c.n(this.f4018d, i4, m() - this.f4022h);
                if (n3 >= this.f4018d.size()) {
                    n3--;
                }
                int i5 = n3 + 1;
                int i6 = 0;
                while (n3 >= 0) {
                    C0255b c0255b = (C0255b) this.f4018d.get(n3);
                    int c3 = c(c0255b);
                    if (c3 < i2) {
                        break;
                    }
                    if (c3 < i4) {
                        c0255b.f4117a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i6 == 0) {
                            i6 = n3 + 1;
                        }
                        i5 = n3;
                    }
                    n3--;
                }
                r0 = i5 < i6;
                if (r0) {
                    this.f4018d.subList(i5, i6).clear();
                }
            }
            this.f4021g = i2;
            this.f4022h += i3;
            int i7 = this.f4027m;
            if (i7 > i2) {
                this.f4027m = Math.max(i2, i7 - i3);
            }
            int i8 = this.f4033t;
            if (i8 >= this.f4021g) {
                this.f4033t = i8 - i3;
            }
            int i9 = this.f4034u;
            if (i9 >= 0 && C0257c.h(this.f4016b, p(i9))) {
                O(i9);
            }
        }
        return r0;
    }

    public final void D(int i2, int i3, int i4) {
        if (i3 > 0) {
            int i5 = this.f4026l;
            int i6 = i2 + i3;
            x(i6, i4);
            this.f4025k = i2;
            this.f4026l = i5 + i3;
            AbstractC0959k.u(this.f4017c, null, i2, i6);
            int i7 = this.f4024j;
            if (i7 >= i2) {
                this.f4024j = i7 - i3;
            }
        }
    }

    public final int E() {
        int p3 = p(this.f4032s);
        int j3 = C0257c.j(this.f4016b, p3) + this.f4032s;
        this.f4032s = j3;
        this.f4023i = f(this.f4016b, p(j3));
        if (C0257c.m(this.f4016b, p3)) {
            return 1;
        }
        return C0257c.o(this.f4016b, p3);
    }

    public final void F() {
        int i2 = this.f4033t;
        this.f4032s = i2;
        this.f4023i = f(this.f4016b, p(i2));
    }

    public final int G(int[] iArr, int i2) {
        if (i2 >= m()) {
            return this.f4017c.length - this.f4026l;
        }
        int r3 = C0257c.r(iArr, i2);
        return r3 < 0 ? (this.f4017c.length - this.f4026l) + r3 + 1 : r3;
    }

    public final int H(int i2, int i3) {
        int G3 = G(this.f4016b, p(i2));
        int i4 = G3 + i3;
        if (i4 >= G3 && i4 < f(this.f4016b, p(i2 + 1))) {
            return i4;
        }
        C0257c.y("Write to an invalid slot index " + i3 + " for group " + i2);
        throw null;
    }

    public final M I(int i2) {
        C0255b L3;
        HashMap hashMap = this.f4019e;
        if (hashMap == null || (L3 = L(i2)) == null) {
            return null;
        }
        return (M) hashMap.get(L3);
    }

    public final void J() {
        if (this.f4028n != 0) {
            C0257c.y("Key must be supplied when inserting");
            throw null;
        }
        W w2 = C0275l.f4150a;
        K(0, w2, w2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(int i2, Object obj, Object obj2, boolean z3) {
        int j3;
        int i3 = this.f4034u;
        Object[] objArr = this.f4028n > 0;
        this.f4031r.b(this.f4029o);
        W w2 = C0275l.f4150a;
        if (objArr == true) {
            int i4 = this.f4032s;
            int f3 = f(this.f4016b, p(i4));
            s(1);
            this.f4023i = f3;
            this.f4024j = f3;
            int p3 = p(i4);
            int i5 = obj != w2 ? 1 : 0;
            int i6 = (z3 || obj2 == w2) ? 0 : 1;
            int h2 = h(f3, this.f4025k, this.f4026l, this.f4017c.length);
            if (h2 >= 0 && this.f4027m < i4) {
                h2 = -(((this.f4017c.length - this.f4026l) - h2) + 1);
            }
            int[] iArr = this.f4016b;
            int i7 = this.f4034u;
            int i8 = z3 ? 1073741824 : 0;
            int i9 = i5 != 0 ? 536870912 : 0;
            int i10 = i6 != 0 ? 268435456 : 0;
            int i11 = p3 * 5;
            iArr[i11] = i2;
            iArr[i11 + 1] = i8 | i9 | i10;
            iArr[i11 + 2] = i7;
            iArr[i11 + 3] = 0;
            iArr[i11 + 4] = h2;
            int i12 = (z3 ? 1 : 0) + i5 + i6;
            if (i12 > 0) {
                t(i12, i4);
                Object[] objArr2 = this.f4017c;
                int i13 = this.f4023i;
                if (z3) {
                    objArr2[i13] = obj2;
                    i13++;
                }
                if (i5 != 0) {
                    objArr2[i13] = obj;
                    i13++;
                }
                if (i6 != 0) {
                    objArr2[i13] = obj2;
                    i13++;
                }
                this.f4023i = i13;
            }
            this.f4029o = 0;
            j3 = i4 + 1;
            this.f4034u = i4;
            this.f4032s = j3;
            if (i3 >= 0) {
                I(i3);
            }
        } else {
            this.f4030p.b(i3);
            this.q.b((m() - this.f4022h) - this.f4033t);
            int i14 = this.f4032s;
            int p4 = p(i14);
            if (!z2.h.a(obj2, w2)) {
                if (z3) {
                    P(this.f4032s, obj2);
                } else {
                    N(obj2);
                }
            }
            this.f4023i = G(this.f4016b, p4);
            this.f4024j = f(this.f4016b, p(this.f4032s + 1));
            this.f4029o = C0257c.o(this.f4016b, p4);
            this.f4034u = i14;
            this.f4032s = i14 + 1;
            j3 = i14 + C0257c.j(this.f4016b, p4);
        }
        this.f4033t = j3;
    }

    public final C0255b L(int i2) {
        ArrayList arrayList;
        int U3;
        if (i2 < 0 || i2 >= n() || (U3 = C0257c.U((arrayList = this.f4018d), i2, n())) < 0) {
            return null;
        }
        return (C0255b) arrayList.get(U3);
    }

    public final void M(Object obj) {
        if (this.f4028n > 0) {
            t(1, this.f4034u);
        }
        Object[] objArr = this.f4017c;
        int i2 = this.f4023i;
        this.f4023i = i2 + 1;
        Object obj2 = objArr[g(i2)];
        int i3 = this.f4023i;
        if (i3 <= this.f4024j) {
            this.f4017c[g(i3 - 1)] = obj;
        } else {
            C0257c.y("Writing to an invalid slot");
            throw null;
        }
    }

    public final void N(Object obj) {
        int p3 = p(this.f4032s);
        if (!C0257c.k(this.f4016b, p3)) {
            C0257c.y("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f4017c;
        int[] iArr = this.f4016b;
        objArr[g(C0257c.A(iArr[(p3 * 5) + 1] >> 29) + f(iArr, p3))] = obj;
    }

    public final void O(int i2) {
        if (i2 >= 0) {
            G1.i iVar = this.f4036w;
            if (iVar == null) {
                iVar = new G1.i();
                this.f4036w = iVar;
            }
            iVar.a(i2);
        }
    }

    public final void P(int i2, Object obj) {
        int p3 = p(i2);
        int[] iArr = this.f4016b;
        if (p3 < iArr.length && C0257c.m(iArr, p3)) {
            this.f4017c[g(f(this.f4016b, p3))] = obj;
            return;
        }
        C0257c.y("Updating the node of a group at " + i2 + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i2) {
        boolean z3 = false;
        if (!(i2 >= 0)) {
            C0257c.y("Cannot seek backwards");
            throw null;
        }
        if (!(this.f4028n <= 0)) {
            C0257c.X("Cannot call seek() while inserting");
            throw null;
        }
        if (i2 == 0) {
            return;
        }
        int i3 = this.f4032s + i2;
        if (i3 >= this.f4034u && i3 <= this.f4033t) {
            z3 = true;
        }
        if (z3) {
            this.f4032s = i3;
            int f3 = f(this.f4016b, p(i3));
            this.f4023i = f3;
            this.f4024j = f3;
            return;
        }
        C0257c.y("Cannot seek outside the current group (" + this.f4034u + '-' + this.f4033t + ')');
        throw null;
    }

    public final C0255b b(int i2) {
        ArrayList arrayList = this.f4018d;
        int U3 = C0257c.U(arrayList, i2, n());
        if (U3 >= 0) {
            return (C0255b) arrayList.get(U3);
        }
        if (i2 > this.f4021g) {
            i2 = -(n() - i2);
        }
        C0255b c0255b = new C0255b(i2);
        arrayList.add(-(U3 + 1), c0255b);
        return c0255b;
    }

    public final int c(C0255b c0255b) {
        int i2 = c0255b.f4117a;
        return i2 < 0 ? i2 + n() : i2;
    }

    public final void d() {
        int i2 = this.f4028n;
        this.f4028n = i2 + 1;
        if (i2 == 0) {
            this.q.b((m() - this.f4022h) - this.f4033t);
        }
    }

    public final void e(boolean z3) {
        this.f4035v = true;
        if (z3 && this.f4030p.f4054b == 0) {
            w(n());
            x(this.f4017c.length - this.f4026l, this.f4021g);
            int i2 = this.f4025k;
            AbstractC0959k.u(this.f4017c, null, i2, this.f4026l + i2);
            A();
        }
        int[] iArr = this.f4016b;
        int i3 = this.f4021g;
        Object[] objArr = this.f4017c;
        int i4 = this.f4025k;
        ArrayList arrayList = this.f4018d;
        HashMap hashMap = this.f4019e;
        C0761q c0761q = this.f4020f;
        E0 e02 = this.f4015a;
        e02.getClass();
        if (!e02.f4003m) {
            C0257c.W("Unexpected writer close()");
            throw null;
        }
        e02.f4003m = false;
        e02.f3998h = iArr;
        e02.f3999i = i3;
        e02.f4000j = objArr;
        e02.f4001k = i4;
        e02.f4005o = arrayList;
        e02.f4006p = hashMap;
        e02.q = c0761q;
    }

    public final int f(int[] iArr, int i2) {
        if (i2 >= m()) {
            return this.f4017c.length - this.f4026l;
        }
        int i3 = C0257c.i(iArr, i2);
        return i3 < 0 ? (this.f4017c.length - this.f4026l) + i3 + 1 : i3;
    }

    public final int g(int i2) {
        return i2 < this.f4025k ? i2 : i2 + this.f4026l;
    }

    public final void i() {
        boolean z3 = this.f4028n > 0;
        int i2 = this.f4032s;
        int i3 = this.f4033t;
        int i4 = this.f4034u;
        int p3 = p(i4);
        int i5 = this.f4029o;
        int i6 = i2 - i4;
        boolean m3 = C0257c.m(this.f4016b, p3);
        N n3 = this.f4031r;
        if (z3) {
            C0257c.s(this.f4016b, p3, i6);
            C0257c.t(this.f4016b, p3, i5);
            int a3 = n3.a();
            if (m3) {
                i5 = 1;
            }
            this.f4029o = a3 + i5;
            int z4 = z(this.f4016b, i4);
            this.f4034u = z4;
            int n4 = z4 < 0 ? n() : p(z4 + 1);
            int f3 = n4 >= 0 ? f(this.f4016b, n4) : 0;
            this.f4023i = f3;
            this.f4024j = f3;
            return;
        }
        if (i2 != i3) {
            C0257c.y("Expected to be at the end of a group");
            throw null;
        }
        int j3 = C0257c.j(this.f4016b, p3);
        int o3 = C0257c.o(this.f4016b, p3);
        C0257c.s(this.f4016b, p3, i6);
        C0257c.t(this.f4016b, p3, i5);
        int a4 = this.f4030p.a();
        this.f4033t = (m() - this.f4022h) - this.q.a();
        this.f4034u = a4;
        int z5 = z(this.f4016b, i4);
        int a5 = n3.a();
        this.f4029o = a5;
        if (z5 == a4) {
            this.f4029o = a5 + (m3 ? 0 : i5 - o3);
            return;
        }
        int i7 = i6 - j3;
        int i8 = m3 ? 0 : i5 - o3;
        if (i7 != 0 || i8 != 0) {
            while (z5 != 0 && z5 != a4 && (i8 != 0 || i7 != 0)) {
                int p4 = p(z5);
                if (i7 != 0) {
                    C0257c.s(this.f4016b, p4, C0257c.j(this.f4016b, p4) + i7);
                }
                if (i8 != 0) {
                    int[] iArr = this.f4016b;
                    C0257c.t(iArr, p4, C0257c.o(iArr, p4) + i8);
                }
                if (C0257c.m(this.f4016b, p4)) {
                    i8 = 0;
                }
                z5 = z(this.f4016b, z5);
            }
        }
        this.f4029o += i8;
    }

    public final void j() {
        int i2 = this.f4028n;
        if (!(i2 > 0)) {
            C0257c.X("Unbalanced begin/end insert");
            throw null;
        }
        int i3 = i2 - 1;
        this.f4028n = i3;
        if (i3 == 0) {
            if (this.f4031r.f4054b == this.f4030p.f4054b) {
                this.f4033t = (m() - this.f4022h) - this.q.a();
            } else {
                C0257c.y("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i2) {
        boolean z3 = false;
        if (!(this.f4028n <= 0)) {
            C0257c.y("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i3 = this.f4034u;
        if (i3 != i2) {
            if (i2 >= i3 && i2 < this.f4033t) {
                z3 = true;
            }
            if (!z3) {
                C0257c.y("Started group at " + i2 + " must be a subgroup of the group at " + i3);
                throw null;
            }
            int i4 = this.f4032s;
            int i5 = this.f4023i;
            int i6 = this.f4024j;
            this.f4032s = i2;
            J();
            this.f4032s = i4;
            this.f4023i = i5;
            this.f4024j = i6;
        }
    }

    public final void l(int i2, int i3, int i4) {
        if (i2 >= this.f4021g) {
            i2 = -((n() - i2) + 2);
        }
        while (i4 < i3) {
            this.f4016b[(p(i4) * 5) + 2] = i2;
            int j3 = C0257c.j(this.f4016b, p(i4)) + i4;
            l(i4, j3, i4 + 1);
            i4 = j3;
        }
    }

    public final int m() {
        return this.f4016b.length / 5;
    }

    public final int n() {
        return m() - this.f4022h;
    }

    public final int o() {
        return this.f4017c.length - this.f4026l;
    }

    public final int p(int i2) {
        return i2 < this.f4021g ? i2 : i2 + this.f4022h;
    }

    public final int q(int i2) {
        return C0257c.j(this.f4016b, p(i2));
    }

    public final boolean r(int i2, int i3) {
        int m3;
        int q;
        if (i3 == this.f4034u) {
            m3 = this.f4033t;
        } else {
            N n3 = this.f4030p;
            int i4 = n3.f4054b;
            if (i3 > (i4 > 0 ? n3.f4053a[i4 - 1] : 0)) {
                q = q(i3);
            } else {
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        i5 = -1;
                        break;
                    }
                    if (n3.f4053a[i5] == i3) {
                        break;
                    }
                    i5++;
                }
                if (i5 < 0) {
                    q = q(i3);
                } else {
                    m3 = (m() - this.f4022h) - this.q.f4053a[i5];
                }
            }
            m3 = q + i3;
        }
        return i2 > i3 && i2 < m3;
    }

    public final void s(int i2) {
        if (i2 > 0) {
            int i3 = this.f4032s;
            w(i3);
            int i4 = this.f4021g;
            int i5 = this.f4022h;
            int[] iArr = this.f4016b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            if (i5 < i2) {
                int max = Math.max(Math.max(length * 2, i6 + i2), 32);
                int[] iArr2 = new int[max * 5];
                int i7 = max - i6;
                AbstractC0959k.p(iArr, iArr2, 0, 0, i4 * 5);
                AbstractC0959k.p(iArr, iArr2, (i4 + i7) * 5, (i5 + i4) * 5, length * 5);
                this.f4016b = iArr2;
                i5 = i7;
            }
            int i8 = this.f4033t;
            if (i8 >= i4) {
                this.f4033t = i8 + i2;
            }
            int i9 = i4 + i2;
            this.f4021g = i9;
            this.f4022h = i5 - i2;
            int h2 = h(i6 > 0 ? f(this.f4016b, p(i3 + i2)) : 0, this.f4027m >= i4 ? this.f4025k : 0, this.f4026l, this.f4017c.length);
            for (int i10 = i4; i10 < i9; i10++) {
                this.f4016b[(i10 * 5) + 4] = h2;
            }
            int i11 = this.f4027m;
            if (i11 >= i4) {
                this.f4027m = i11 + i2;
            }
        }
    }

    public final void t(int i2, int i3) {
        if (i2 > 0) {
            x(this.f4023i, i3);
            int i4 = this.f4025k;
            int i5 = this.f4026l;
            if (i5 < i2) {
                Object[] objArr = this.f4017c;
                int length = objArr.length;
                int i6 = length - i5;
                int max = Math.max(Math.max(length * 2, i6 + i2), 32);
                Object[] objArr2 = new Object[max];
                for (int i7 = 0; i7 < max; i7++) {
                    objArr2[i7] = null;
                }
                int i8 = max - i6;
                AbstractC0959k.q(objArr, objArr2, 0, 0, i4);
                AbstractC0959k.q(objArr, objArr2, i4 + i8, i5 + i4, length);
                this.f4017c = objArr2;
                i5 = i8;
            }
            int i9 = this.f4024j;
            if (i9 >= i4) {
                this.f4024j = i9 + i2;
            }
            this.f4025k = i4 + i2;
            this.f4026l = i5 - i2;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f4032s + " end=" + this.f4033t + " size = " + n() + " gap=" + this.f4021g + '-' + (this.f4021g + this.f4022h) + ')';
    }

    public final void v(E0 e02, int i2) {
        C0257c.T(this.f4028n > 0);
        if (i2 == 0 && this.f4032s == 0 && this.f4015a.f3999i == 0) {
            int j3 = C0257c.j(e02.f3998h, i2);
            int i3 = e02.f3999i;
            if (j3 == i3) {
                int[] iArr = this.f4016b;
                Object[] objArr = this.f4017c;
                ArrayList arrayList = this.f4018d;
                HashMap hashMap = this.f4019e;
                C0761q c0761q = this.f4020f;
                int[] iArr2 = e02.f3998h;
                Object[] objArr2 = e02.f4000j;
                int i4 = e02.f4001k;
                HashMap hashMap2 = e02.f4006p;
                C0761q c0761q2 = e02.q;
                this.f4016b = iArr2;
                this.f4017c = objArr2;
                this.f4018d = e02.f4005o;
                this.f4021g = i3;
                this.f4022h = (iArr2.length / 5) - i3;
                this.f4025k = i4;
                this.f4026l = objArr2.length - i4;
                this.f4027m = i3;
                this.f4019e = hashMap2;
                this.f4020f = c0761q2;
                e02.f3998h = iArr;
                e02.f3999i = 0;
                e02.f4000j = objArr;
                e02.f4001k = 0;
                e02.f4005o = arrayList;
                e02.f4006p = hashMap;
                e02.q = c0761q;
                return;
            }
        }
        G0 f3 = e02.f();
        try {
            C0257c.K(f3, i2, this, true, true, false);
            f3.e(true);
        } catch (Throwable th) {
            f3.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r2 = r8.f4016b;
        r4 = r9 * 5;
        r5 = r0 * 5;
        r6 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        n2.AbstractC0959k.p(r2, r2, r5 + r4, r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        n2.AbstractC0959k.p(r2, r2, r6, r6 + r5, r4 + r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(int r9) {
        /*
            r8 = this;
            int r0 = r8.f4022h
            int r1 = r8.f4021g
            if (r1 == r9) goto Lb0
            java.util.ArrayList r2 = r8.f4018d
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L5d
            int r2 = r8.f4022h
            int r4 = r8.m()
            int r4 = r4 - r2
            if (r1 >= r9) goto L3b
            java.util.ArrayList r2 = r8.f4018d
            int r2 = J.C0257c.n(r2, r1, r4)
        L1f:
            java.util.ArrayList r5 = r8.f4018d
            int r5 = r5.size()
            if (r2 >= r5) goto L5d
            java.util.ArrayList r5 = r8.f4018d
            java.lang.Object r5 = r5.get(r2)
            J.b r5 = (J.C0255b) r5
            int r6 = r5.f4117a
            if (r6 >= 0) goto L5d
            int r6 = r6 + r4
            if (r6 >= r9) goto L5d
            r5.f4117a = r6
            int r2 = r2 + 1
            goto L1f
        L3b:
            java.util.ArrayList r2 = r8.f4018d
            int r2 = J.C0257c.n(r2, r9, r4)
        L41:
            java.util.ArrayList r5 = r8.f4018d
            int r5 = r5.size()
            if (r2 >= r5) goto L5d
            java.util.ArrayList r5 = r8.f4018d
            java.lang.Object r5 = r5.get(r2)
            J.b r5 = (J.C0255b) r5
            int r6 = r5.f4117a
            if (r6 < 0) goto L5d
            int r6 = r4 - r6
            int r6 = -r6
            r5.f4117a = r6
            int r2 = r2 + 1
            goto L41
        L5d:
            if (r0 <= 0) goto L74
            int[] r2 = r8.f4016b
            int r4 = r9 * 5
            int r5 = r0 * 5
            int r6 = r1 * 5
            if (r9 >= r1) goto L6e
            int r5 = r5 + r4
            n2.AbstractC0959k.p(r2, r2, r5, r4, r6)
            goto L74
        L6e:
            int r7 = r6 + r5
            int r4 = r4 + r5
            n2.AbstractC0959k.p(r2, r2, r6, r7, r4)
        L74:
            if (r9 >= r1) goto L78
            int r1 = r9 + r0
        L78:
            int r2 = r8.m()
            if (r1 >= r2) goto L7f
            goto L80
        L7f:
            r3 = 0
        L80:
            J.C0257c.T(r3)
        L83:
            if (r1 >= r2) goto Lb0
            int[] r3 = r8.f4016b
            int r3 = J.C0257c.p(r3, r1)
            r4 = -2
            if (r3 <= r4) goto L90
            r5 = r3
            goto L96
        L90:
            int r5 = r8.n()
            int r5 = r5 + r3
            int r5 = r5 - r4
        L96:
            if (r5 >= r9) goto L99
            goto La0
        L99:
            int r6 = r8.n()
            int r6 = r6 - r5
            int r6 = r6 - r4
            int r5 = -r6
        La0:
            if (r5 == r3) goto Laa
            int[] r3 = r8.f4016b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3[r4] = r5
        Laa:
            int r1 = r1 + 1
            if (r1 != r9) goto L83
            int r1 = r1 + r0
            goto L83
        Lb0:
            r8.f4021g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.G0.w(int):void");
    }

    public final void x(int i2, int i3) {
        int i4 = this.f4026l;
        int i5 = this.f4025k;
        int i6 = this.f4027m;
        if (i5 != i2) {
            Object[] objArr = this.f4017c;
            if (i2 < i5) {
                AbstractC0959k.q(objArr, objArr, i2 + i4, i2, i5);
            } else {
                AbstractC0959k.q(objArr, objArr, i5, i5 + i4, i2 + i4);
            }
        }
        int min = Math.min(i3 + 1, n());
        if (i6 != min) {
            int length = this.f4017c.length - i4;
            if (min < i6) {
                int p3 = p(min);
                int p4 = p(i6);
                int i7 = this.f4021g;
                while (p3 < p4) {
                    int i8 = C0257c.i(this.f4016b, p3);
                    if (i8 < 0) {
                        C0257c.y("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    this.f4016b[(p3 * 5) + 4] = -((length - i8) + 1);
                    p3++;
                    if (p3 == i7) {
                        p3 += this.f4022h;
                    }
                }
            } else {
                int p5 = p(i6);
                int p6 = p(min);
                while (p5 < p6) {
                    int i9 = C0257c.i(this.f4016b, p5);
                    if (i9 >= 0) {
                        C0257c.y("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    this.f4016b[(p5 * 5) + 4] = i9 + length + 1;
                    p5++;
                    if (p5 == this.f4021g) {
                        p5 += this.f4022h;
                    }
                }
            }
            this.f4027m = min;
        }
        this.f4025k = i2;
    }

    public final Object y(int i2) {
        int p3 = p(i2);
        if (C0257c.m(this.f4016b, p3)) {
            return this.f4017c[g(f(this.f4016b, p3))];
        }
        return null;
    }

    public final int z(int[] iArr, int i2) {
        int p3 = C0257c.p(iArr, p(i2));
        return p3 > -2 ? p3 : n() + p3 + 2;
    }
}
