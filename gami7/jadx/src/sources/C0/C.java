package C0;

import c0.AbstractC0598q;
import c0.C0575O;
import c0.C0603v;
import e0.AbstractC0655e;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final N0.m f427a;

    /* renamed from: b, reason: collision with root package name */
    public final long f428b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.k f429c;

    /* renamed from: d, reason: collision with root package name */
    public final H0.i f430d;

    /* renamed from: e, reason: collision with root package name */
    public final H0.j f431e;

    /* renamed from: f, reason: collision with root package name */
    public final H0.q f432f;

    /* renamed from: g, reason: collision with root package name */
    public final String f433g;

    /* renamed from: h, reason: collision with root package name */
    public final long f434h;

    /* renamed from: i, reason: collision with root package name */
    public final N0.a f435i;

    /* renamed from: j, reason: collision with root package name */
    public final N0.n f436j;

    /* renamed from: k, reason: collision with root package name */
    public final J0.b f437k;

    /* renamed from: l, reason: collision with root package name */
    public final long f438l;

    /* renamed from: m, reason: collision with root package name */
    public final N0.j f439m;

    /* renamed from: n, reason: collision with root package name */
    public final C0575O f440n;

    /* renamed from: o, reason: collision with root package name */
    public final w f441o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC0655e f442p;

    public C(long j3, long j4, H0.k kVar, H0.i iVar, H0.j jVar, H0.q qVar, String str, long j5, N0.a aVar, N0.n nVar, J0.b bVar, long j6, N0.j jVar2, C0575O c0575o, w wVar, AbstractC0655e abstractC0655e) {
        this(j3 != 16 ? new N0.c(j3) : N0.l.f4998a, j4, kVar, iVar, jVar, qVar, str, j5, aVar, nVar, bVar, j6, jVar2, c0575o, wVar, abstractC0655e);
    }

    public final boolean a(C c3) {
        if (this == c3) {
            return true;
        }
        return O0.m.a(this.f428b, c3.f428b) && z2.h.a(this.f429c, c3.f429c) && z2.h.a(this.f430d, c3.f430d) && z2.h.a(this.f431e, c3.f431e) && z2.h.a(this.f432f, c3.f432f) && z2.h.a(this.f433g, c3.f433g) && O0.m.a(this.f434h, c3.f434h) && z2.h.a(this.f435i, c3.f435i) && z2.h.a(this.f436j, c3.f436j) && z2.h.a(this.f437k, c3.f437k) && C0603v.c(this.f438l, c3.f438l) && z2.h.a(this.f441o, c3.f441o);
    }

    public final boolean b(C c3) {
        return z2.h.a(this.f427a, c3.f427a) && z2.h.a(this.f439m, c3.f439m) && z2.h.a(this.f440n, c3.f440n) && z2.h.a(this.f442p, c3.f442p);
    }

    public final C c(C c3) {
        if (c3 == null) {
            return this;
        }
        N0.m mVar = c3.f427a;
        return D.a(this, mVar.b(), mVar.c(), mVar.a(), c3.f428b, c3.f429c, c3.f430d, c3.f431e, c3.f432f, c3.f433g, c3.f434h, c3.f435i, c3.f436j, c3.f437k, c3.f438l, c3.f439m, c3.f440n, c3.f441o, c3.f442p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c3 = (C) obj;
        return a(c3) && b(c3);
    }

    public final int hashCode() {
        N0.m mVar = this.f427a;
        long b3 = mVar.b();
        int i2 = C0603v.f7278h;
        int hashCode = Long.hashCode(b3) * 31;
        AbstractC0598q c3 = mVar.c();
        int hashCode2 = (Float.hashCode(mVar.a()) + ((hashCode + (c3 != null ? c3.hashCode() : 0)) * 31)) * 31;
        O0.n[] nVarArr = O0.m.f5152b;
        int d3 = B1.t.d(hashCode2, 31, this.f428b);
        H0.k kVar = this.f429c;
        int i3 = (d3 + (kVar != null ? kVar.f3405h : 0)) * 31;
        H0.i iVar = this.f430d;
        int hashCode3 = (i3 + (iVar != null ? Integer.hashCode(iVar.f3398a) : 0)) * 31;
        H0.j jVar = this.f431e;
        int hashCode4 = (hashCode3 + (jVar != null ? Integer.hashCode(jVar.f3399a) : 0)) * 31;
        H0.q qVar = this.f432f;
        int hashCode5 = (hashCode4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        String str = this.f433g;
        int d4 = B1.t.d((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f434h);
        N0.a aVar = this.f435i;
        int hashCode6 = (d4 + (aVar != null ? Float.hashCode(aVar.f4976a) : 0)) * 31;
        N0.n nVar = this.f436j;
        int hashCode7 = (hashCode6 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        J0.b bVar = this.f437k;
        int d5 = B1.t.d((hashCode7 + (bVar != null ? bVar.f4323h.hashCode() : 0)) * 31, 31, this.f438l);
        N0.j jVar2 = this.f439m;
        int i4 = (d5 + (jVar2 != null ? jVar2.f4996a : 0)) * 31;
        C0575O c0575o = this.f440n;
        int hashCode8 = (i4 + (c0575o != null ? c0575o.hashCode() : 0)) * 31;
        w wVar = this.f441o;
        int hashCode9 = (hashCode8 + (wVar != null ? wVar.hashCode() : 0)) * 31;
        AbstractC0655e abstractC0655e = this.f442p;
        return hashCode9 + (abstractC0655e != null ? abstractC0655e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        N0.m mVar = this.f427a;
        sb.append((Object) C0603v.i(mVar.b()));
        sb.append(", brush=");
        sb.append(mVar.c());
        sb.append(", alpha=");
        sb.append(mVar.a());
        sb.append(", fontSize=");
        sb.append((Object) O0.m.d(this.f428b));
        sb.append(", fontWeight=");
        sb.append(this.f429c);
        sb.append(", fontStyle=");
        sb.append(this.f430d);
        sb.append(", fontSynthesis=");
        sb.append(this.f431e);
        sb.append(", fontFamily=");
        sb.append(this.f432f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f433g);
        sb.append(", letterSpacing=");
        sb.append((Object) O0.m.d(this.f434h));
        sb.append(", baselineShift=");
        sb.append(this.f435i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f436j);
        sb.append(", localeList=");
        sb.append(this.f437k);
        sb.append(", background=");
        B1.t.t(this.f438l, sb, ", textDecoration=");
        sb.append(this.f439m);
        sb.append(", shadow=");
        sb.append(this.f440n);
        sb.append(", platformStyle=");
        sb.append(this.f441o);
        sb.append(", drawStyle=");
        sb.append(this.f442p);
        sb.append(')');
        return sb.toString();
    }

    public C(N0.m mVar, long j3, H0.k kVar, H0.i iVar, H0.j jVar, H0.q qVar, String str, long j4, N0.a aVar, N0.n nVar, J0.b bVar, long j5, N0.j jVar2, C0575O c0575o, w wVar, AbstractC0655e abstractC0655e) {
        this.f427a = mVar;
        this.f428b = j3;
        this.f429c = kVar;
        this.f430d = iVar;
        this.f431e = jVar;
        this.f432f = qVar;
        this.f433g = str;
        this.f434h = j4;
        this.f435i = aVar;
        this.f436j = nVar;
        this.f437k = bVar;
        this.f438l = j5;
        this.f439m = jVar2;
        this.f440n = c0575o;
        this.f441o = wVar;
        this.f442p = abstractC0655e;
    }

    public C(long j3, long j4, H0.k kVar, H0.i iVar, H0.j jVar, H0.q qVar, String str, long j5, N0.a aVar, N0.n nVar, J0.b bVar, long j6, N0.j jVar2, C0575O c0575o, int i2) {
        this((i2 & 1) != 0 ? C0603v.f7277g : j3, (i2 & 2) != 0 ? O0.m.f5153c : j4, (i2 & 4) != 0 ? null : kVar, (i2 & 8) != 0 ? null : iVar, (i2 & 16) != 0 ? null : jVar, (i2 & 32) != 0 ? null : qVar, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? O0.m.f5153c : j5, (i2 & 256) != 0 ? null : aVar, (i2 & 512) != 0 ? null : nVar, (i2 & 1024) != 0 ? null : bVar, (i2 & 2048) != 0 ? C0603v.f7277g : j6, (i2 & 4096) != 0 ? null : jVar2, (i2 & 8192) != 0 ? null : c0575o, (w) null, (AbstractC0655e) null);
    }
}
