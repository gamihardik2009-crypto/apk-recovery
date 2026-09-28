package C;

import B1.C;
import C0.C0024g;
import C0.G;
import C0.H;
import C0.K;
import C0.o;
import C1.y;
import java.util.List;
import n2.C0970v;
import z.N;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public C0024g f334a;

    /* renamed from: b, reason: collision with root package name */
    public K f335b;

    /* renamed from: c, reason: collision with root package name */
    public H0.d f336c;

    /* renamed from: d, reason: collision with root package name */
    public int f337d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f338e;

    /* renamed from: f, reason: collision with root package name */
    public int f339f;

    /* renamed from: g, reason: collision with root package name */
    public int f340g;

    /* renamed from: h, reason: collision with root package name */
    public List f341h;

    /* renamed from: i, reason: collision with root package name */
    public b f342i;

    /* renamed from: k, reason: collision with root package name */
    public O0.b f344k;

    /* renamed from: l, reason: collision with root package name */
    public Q1.e f345l;

    /* renamed from: m, reason: collision with root package name */
    public O0.k f346m;

    /* renamed from: n, reason: collision with root package name */
    public H f347n;

    /* renamed from: j, reason: collision with root package name */
    public long f343j = a.f322a;

    /* renamed from: o, reason: collision with root package name */
    public int f348o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f349p = -1;

    public d(C0024g c0024g, K k3, H0.d dVar, int i2, boolean z3, int i3, int i4, List list) {
        this.f334a = c0024g;
        this.f335b = k3;
        this.f336c = dVar;
        this.f337d = i2;
        this.f338e = z3;
        this.f339f = i3;
        this.f340g = i4;
        this.f341h = list;
    }

    public final int a(int i2, O0.k kVar) {
        int i3 = this.f348o;
        int i4 = this.f349p;
        if (i2 == i3 && i3 != -1) {
            return i4;
        }
        int l3 = N.l(b(C.b(0, i2, 0, Integer.MAX_VALUE), kVar).f527e);
        this.f348o = i2;
        this.f349p = l3;
        return l3;
    }

    public final o b(long j3, O0.k kVar) {
        Q1.e d3 = d(kVar);
        long s3 = y.s(j3, this.f338e, this.f337d, d3.c());
        boolean z3 = this.f338e;
        int i2 = this.f337d;
        int i3 = this.f339f;
        int i4 = 1;
        if (z3 || !K1.f.t(i2, 2)) {
            if (i3 < 1) {
                i3 = 1;
            }
            i4 = i3;
        }
        return new o(d3, s3, i4, K1.f.t(this.f337d, 2));
    }

    public final void c(O0.b bVar) {
        long j3;
        O0.b bVar2 = this.f344k;
        if (bVar != null) {
            int i2 = a.f323b;
            j3 = a.a(bVar.c(), bVar.s());
        } else {
            j3 = a.f322a;
        }
        if (bVar2 == null) {
            this.f344k = bVar;
            this.f343j = j3;
        } else if (bVar == null || this.f343j != j3) {
            this.f344k = bVar;
            this.f343j = j3;
            this.f345l = null;
            this.f347n = null;
            this.f349p = -1;
            this.f348o = -1;
        }
    }

    public final Q1.e d(O0.k kVar) {
        Q1.e eVar = this.f345l;
        if (eVar == null || kVar != this.f346m || eVar.b()) {
            this.f346m = kVar;
            C0024g c0024g = this.f334a;
            K C3 = B2.a.C(this.f335b, kVar);
            O0.b bVar = this.f344k;
            z2.h.c(bVar);
            H0.d dVar = this.f336c;
            List list = this.f341h;
            if (list == null) {
                list = C0970v.f9165h;
            }
            eVar = new Q1.e(c0024g, C3, list, bVar, dVar);
        }
        this.f345l = eVar;
        return eVar;
    }

    public final H e(O0.k kVar, long j3, o oVar) {
        float min = Math.min(oVar.f523a.c(), oVar.f526d);
        C0024g c0024g = this.f334a;
        K k3 = this.f335b;
        List list = this.f341h;
        if (list == null) {
            list = C0970v.f9165h;
        }
        int i2 = this.f339f;
        boolean z3 = this.f338e;
        int i3 = this.f337d;
        O0.b bVar = this.f344k;
        z2.h.c(bVar);
        return new H(new G(c0024g, k3, list, i2, z3, i3, bVar, kVar, this.f336c, j3), oVar, C.H(j3, l0.c.e(N.l(min), N.l(oVar.f527e))));
    }
}
