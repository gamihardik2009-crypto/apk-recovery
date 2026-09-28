package K1;

import B1.C;
import B1.C0014d;
import B1.t;
import m.AbstractC0837j;
import t0.AbstractC1265x;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: x, reason: collision with root package name */
    public static final String f4563x;

    /* renamed from: a, reason: collision with root package name */
    public final String f4564a;

    /* renamed from: b, reason: collision with root package name */
    public int f4565b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4566c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4567d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.h f4568e;

    /* renamed from: f, reason: collision with root package name */
    public final B1.h f4569f;

    /* renamed from: g, reason: collision with root package name */
    public long f4570g;

    /* renamed from: h, reason: collision with root package name */
    public long f4571h;

    /* renamed from: i, reason: collision with root package name */
    public long f4572i;

    /* renamed from: j, reason: collision with root package name */
    public final C0014d f4573j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4574k;

    /* renamed from: l, reason: collision with root package name */
    public int f4575l;

    /* renamed from: m, reason: collision with root package name */
    public long f4576m;

    /* renamed from: n, reason: collision with root package name */
    public long f4577n;

    /* renamed from: o, reason: collision with root package name */
    public final long f4578o;

    /* renamed from: p, reason: collision with root package name */
    public final long f4579p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4580r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4581s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4582t;

    /* renamed from: u, reason: collision with root package name */
    public final long f4583u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4584v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4585w;

    static {
        String f3 = B1.s.f("WorkSpec");
        z2.h.e(f3, "tagWithPrefix(\"WorkSpec\")");
        f4563x = f3;
    }

    public o(String str, int i2, String str2, String str3, B1.h hVar, B1.h hVar2, long j3, long j4, long j5, C0014d c0014d, int i3, int i4, long j6, long j7, long j8, long j9, boolean z3, int i5, int i6, int i7, long j10, int i8, int i9) {
        z2.h.f(str, "id");
        AbstractC1265x.f("state", i2);
        z2.h.f(str2, "workerClassName");
        z2.h.f(str3, "inputMergerClassName");
        z2.h.f(hVar, "input");
        z2.h.f(hVar2, "output");
        z2.h.f(c0014d, "constraints");
        AbstractC1265x.f("backoffPolicy", i4);
        AbstractC1265x.f("outOfQuotaPolicy", i5);
        this.f4564a = str;
        this.f4565b = i2;
        this.f4566c = str2;
        this.f4567d = str3;
        this.f4568e = hVar;
        this.f4569f = hVar2;
        this.f4570g = j3;
        this.f4571h = j4;
        this.f4572i = j5;
        this.f4573j = c0014d;
        this.f4574k = i3;
        this.f4575l = i4;
        this.f4576m = j6;
        this.f4577n = j7;
        this.f4578o = j8;
        this.f4579p = j9;
        this.q = z3;
        this.f4580r = i5;
        this.f4581s = i6;
        this.f4582t = i7;
        this.f4583u = j10;
        this.f4584v = i8;
        this.f4585w = i9;
    }

    public final long a() {
        long j3;
        boolean z3 = this.f4565b == 1 && this.f4574k > 0;
        int i2 = this.f4575l;
        long j4 = this.f4576m;
        long j5 = this.f4577n;
        boolean c3 = c();
        long j6 = this.f4570g;
        long j7 = this.f4572i;
        long j8 = this.f4571h;
        long j9 = this.f4583u;
        AbstractC1265x.f("backoffPolicy", i2);
        int i3 = this.f4581s;
        if (j9 != Long.MAX_VALUE && c3) {
            return i3 == 0 ? j9 : C.y(j9, j5 + 900000);
        }
        if (z3) {
            int i4 = this.f4574k;
            long scalb = i2 == 2 ? j4 * i4 : (long) Math.scalb(j4, i4 - 1);
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            j3 = scalb + j5;
        } else if (c3) {
            long j10 = i3 == 0 ? j5 + j6 : j5 + j8;
            j3 = (j7 == j8 || i3 != 0) ? j10 : (j8 - j7) + j10;
        } else {
            j3 = j5 == -1 ? Long.MAX_VALUE : j5 + j6;
        }
        return j3;
    }

    public final boolean b() {
        return !z2.h.a(C0014d.f274i, this.f4573j);
    }

    public final boolean c() {
        return this.f4571h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return z2.h.a(this.f4564a, oVar.f4564a) && this.f4565b == oVar.f4565b && z2.h.a(this.f4566c, oVar.f4566c) && z2.h.a(this.f4567d, oVar.f4567d) && z2.h.a(this.f4568e, oVar.f4568e) && z2.h.a(this.f4569f, oVar.f4569f) && this.f4570g == oVar.f4570g && this.f4571h == oVar.f4571h && this.f4572i == oVar.f4572i && z2.h.a(this.f4573j, oVar.f4573j) && this.f4574k == oVar.f4574k && this.f4575l == oVar.f4575l && this.f4576m == oVar.f4576m && this.f4577n == oVar.f4577n && this.f4578o == oVar.f4578o && this.f4579p == oVar.f4579p && this.q == oVar.q && this.f4580r == oVar.f4580r && this.f4581s == oVar.f4581s && this.f4582t == oVar.f4582t && this.f4583u == oVar.f4583u && this.f4584v == oVar.f4584v && this.f4585w == oVar.f4585w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int d3 = t.d(t.d(t.d(t.d((AbstractC0837j.d(this.f4575l) + AbstractC0837j.b(this.f4574k, (this.f4573j.hashCode() + t.d(t.d(t.d((this.f4569f.hashCode() + ((this.f4568e.hashCode() + t.e(t.e((AbstractC0837j.d(this.f4565b) + (this.f4564a.hashCode() * 31)) * 31, 31, this.f4566c), 31, this.f4567d)) * 31)) * 31, 31, this.f4570g), 31, this.f4571h), 31, this.f4572i)) * 31, 31)) * 31, 31, this.f4576m), 31, this.f4577n), 31, this.f4578o), 31, this.f4579p);
        boolean z3 = this.q;
        int i2 = z3;
        if (z3 != 0) {
            i2 = 1;
        }
        return Integer.hashCode(this.f4585w) + AbstractC0837j.b(this.f4584v, t.d(AbstractC0837j.b(this.f4582t, AbstractC0837j.b(this.f4581s, (AbstractC0837j.d(this.f4580r) + ((d3 + i2) * 31)) * 31, 31), 31), 31, this.f4583u), 31);
    }

    public final String toString() {
        return t.k(new StringBuilder("{WorkSpec: "), this.f4564a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ o(java.lang.String r36, int r37, java.lang.String r38, java.lang.String r39, B1.h r40, B1.h r41, long r42, long r44, long r46, B1.C0014d r48, int r49, int r50, long r51, long r53, long r55, long r57, boolean r59, int r60, int r61, long r62, int r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.o.<init>(java.lang.String, int, java.lang.String, java.lang.String, B1.h, B1.h, long, long, long, B1.d, int, int, long, long, long, long, boolean, int, int, long, int, int, int):void");
    }
}
