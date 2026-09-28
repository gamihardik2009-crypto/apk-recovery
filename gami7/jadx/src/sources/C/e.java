package C;

import B1.C;
import C0.C0019b;
import C0.K;
import C0.s;
import C1.y;
import n2.C0970v;
import z.N;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f350a;

    /* renamed from: b, reason: collision with root package name */
    public K f351b;

    /* renamed from: c, reason: collision with root package name */
    public H0.d f352c;

    /* renamed from: d, reason: collision with root package name */
    public int f353d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f354e;

    /* renamed from: f, reason: collision with root package name */
    public int f355f;

    /* renamed from: g, reason: collision with root package name */
    public int f356g;

    /* renamed from: i, reason: collision with root package name */
    public O0.b f358i;

    /* renamed from: j, reason: collision with root package name */
    public C0019b f359j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f360k;

    /* renamed from: m, reason: collision with root package name */
    public b f362m;

    /* renamed from: n, reason: collision with root package name */
    public s f363n;

    /* renamed from: o, reason: collision with root package name */
    public O0.k f364o;

    /* renamed from: h, reason: collision with root package name */
    public long f357h = a.f322a;

    /* renamed from: l, reason: collision with root package name */
    public long f361l = l0.c.e(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public long f365p = C.L(0, 0, 0, 0);
    public int q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f366r = -1;

    public e(String str, K k3, H0.d dVar, int i2, boolean z3, int i3, int i4) {
        this.f350a = str;
        this.f351b = k3;
        this.f352c = dVar;
        this.f353d = i2;
        this.f354e = z3;
        this.f355f = i3;
        this.f356g = i4;
    }

    public final int a(int i2, O0.k kVar) {
        int i3 = this.q;
        int i4 = this.f366r;
        if (i2 == i3 && i3 != -1) {
            return i4;
        }
        int l3 = N.l(b(C.b(0, i2, 0, Integer.MAX_VALUE), kVar).b());
        this.q = i2;
        this.f366r = l3;
        return l3;
    }

    public final C0019b b(long j3, O0.k kVar) {
        int i2;
        s d3 = d(kVar);
        long s3 = y.s(j3, this.f354e, this.f353d, d3.c());
        boolean z3 = this.f354e;
        int i3 = this.f353d;
        int i4 = this.f355f;
        if (z3 || !K1.f.t(i3, 2)) {
            if (i4 < 1) {
                i4 = 1;
            }
            i2 = i4;
        } else {
            i2 = 1;
        }
        return new C0019b((K0.d) d3, i2, K1.f.t(this.f353d, 2), s3);
    }

    public final void c(O0.b bVar) {
        long j3;
        O0.b bVar2 = this.f358i;
        if (bVar != null) {
            int i2 = a.f323b;
            j3 = a.a(bVar.c(), bVar.s());
        } else {
            j3 = a.f322a;
        }
        if (bVar2 == null) {
            this.f358i = bVar;
            this.f357h = j3;
            return;
        }
        if (bVar == null || this.f357h != j3) {
            this.f358i = bVar;
            this.f357h = j3;
            this.f359j = null;
            this.f363n = null;
            this.f364o = null;
            this.q = -1;
            this.f366r = -1;
            this.f365p = C.L(0, 0, 0, 0);
            this.f361l = l0.c.e(0, 0);
            this.f360k = false;
        }
    }

    public final s d(O0.k kVar) {
        s sVar = this.f363n;
        if (sVar == null || kVar != this.f364o || sVar.b()) {
            this.f364o = kVar;
            String str = this.f350a;
            K C3 = B2.a.C(this.f351b, kVar);
            O0.b bVar = this.f358i;
            z2.h.c(bVar);
            H0.d dVar = this.f352c;
            C0970v c0970v = C0970v.f9165h;
            sVar = new K0.d(str, C3, c0970v, c0970v, dVar, bVar);
        }
        this.f363n = sVar;
        return sVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f359j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j3 = this.f357h;
        int i2 = a.f323b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j3 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j3 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
