package C0;

import c0.C0575O;
import c0.C0603v;
import e0.AbstractC0655e;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: d, reason: collision with root package name */
    public static final K f474d = new K(0, 0, null, 0, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final C f475a;

    /* renamed from: b, reason: collision with root package name */
    public final t f476b;

    /* renamed from: c, reason: collision with root package name */
    public final x f477c;

    public K(C c3, t tVar, x xVar) {
        this.f475a = c3;
        this.f476b = tVar;
        this.f477c = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [H0.q] */
    public static K a(K k3, long j3, long j4, H0.k kVar, H0.m mVar, long j5, int i2, long j6, x xVar, N0.g gVar, int i3) {
        J0.b bVar;
        int i4;
        long j7;
        long j8;
        N0.m cVar;
        long b3 = (i3 & 1) != 0 ? k3.f475a.f427a.b() : j3;
        long j9 = (i3 & 2) != 0 ? k3.f475a.f428b : j4;
        H0.k kVar2 = (i3 & 4) != 0 ? k3.f475a.f429c : kVar;
        C c3 = k3.f475a;
        H0.i iVar = c3.f430d;
        H0.j jVar = c3.f431e;
        H0.m mVar2 = (i3 & 32) != 0 ? c3.f432f : mVar;
        String str = c3.f433g;
        long j10 = (i3 & 128) != 0 ? c3.f434h : j5;
        N0.a aVar = c3.f435i;
        N0.n nVar = c3.f436j;
        J0.b bVar2 = c3.f437k;
        long j11 = j10;
        long j12 = c3.f438l;
        N0.j jVar2 = c3.f439m;
        C0575O c0575o = c3.f440n;
        AbstractC0655e abstractC0655e = c3.f442p;
        if ((i3 & 32768) != 0) {
            bVar = bVar2;
            i4 = k3.f476b.f543a;
        } else {
            bVar = bVar2;
            i4 = i2;
        }
        t tVar = k3.f476b;
        int i5 = tVar.f544b;
        if ((i3 & 131072) != 0) {
            j7 = j12;
            j8 = tVar.f545c;
        } else {
            j7 = j12;
            j8 = j6;
        }
        N0.o oVar = tVar.f546d;
        x xVar2 = (524288 & i3) != 0 ? k3.f477c : xVar;
        N0.g gVar2 = (i3 & 1048576) != 0 ? tVar.f548f : gVar;
        int i6 = tVar.f549g;
        N0.g gVar3 = gVar2;
        int i7 = tVar.f550h;
        N0.p pVar = tVar.f551i;
        if (C0603v.c(b3, c3.f427a.b())) {
            cVar = c3.f427a;
        } else {
            cVar = b3 != 16 ? new N0.c(b3) : N0.l.f4998a;
        }
        return new K(new C(cVar, j9, kVar2, iVar, jVar, mVar2, str, j11, aVar, nVar, bVar, j7, jVar2, c0575o, xVar2 != null ? xVar2.f558a : null, abstractC0655e), new t(i4, i5, j8, oVar, xVar2 != null ? xVar2.f559b : null, gVar3, i6, i7, pVar), xVar2);
    }

    public static K e(K k3, long j3, long j4, H0.k kVar, H0.i iVar, H0.q qVar, long j5, N0.j jVar, int i2, long j6, int i3) {
        long j7 = (i3 & 2) != 0 ? O0.m.f5153c : j4;
        H0.k kVar2 = (i3 & 4) != 0 ? null : kVar;
        H0.i iVar2 = (i3 & 8) != 0 ? null : iVar;
        H0.q qVar2 = (i3 & 32) != 0 ? null : qVar;
        long j8 = (i3 & 128) != 0 ? O0.m.f5153c : j5;
        long j9 = C0603v.f7277g;
        N0.j jVar2 = (i3 & 4096) != 0 ? null : jVar;
        int i4 = (32768 & i3) != 0 ? Integer.MIN_VALUE : i2;
        long j10 = (i3 & 131072) != 0 ? O0.m.f5153c : j6;
        C a3 = D.a(k3.f475a, j3, null, Float.NaN, j7, kVar2, iVar2, null, qVar2, null, j8, null, null, null, j9, jVar2, null, null, null);
        t a4 = u.a(k3.f476b, i4, Integer.MIN_VALUE, j10, null, null, null, 0, Integer.MIN_VALUE, null);
        return (k3.f475a == a3 && k3.f476b == a4) ? k3 : new K(a3, a4);
    }

    public final long b() {
        return this.f475a.f427a.b();
    }

    public final boolean c(K k3) {
        if (this != k3) {
            if (!z2.h.a(this.f476b, k3.f476b) || !this.f475a.a(k3.f475a)) {
                return false;
            }
        }
        return true;
    }

    public final K d(K k3) {
        return (k3 == null || z2.h.a(k3, f474d)) ? this : new K(this.f475a.c(k3.f475a), this.f476b.a(k3.f476b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k3 = (K) obj;
        return z2.h.a(this.f475a, k3.f475a) && z2.h.a(this.f476b, k3.f476b) && z2.h.a(this.f477c, k3.f477c);
    }

    public final int hashCode() {
        int hashCode = (this.f476b.hashCode() + (this.f475a.hashCode() * 31)) * 31;
        x xVar = this.f477c;
        return hashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C0603v.i(b()));
        sb.append(", brush=");
        C c3 = this.f475a;
        sb.append(c3.f427a.c());
        sb.append(", alpha=");
        sb.append(c3.f427a.a());
        sb.append(", fontSize=");
        sb.append((Object) O0.m.d(c3.f428b));
        sb.append(", fontWeight=");
        sb.append(c3.f429c);
        sb.append(", fontStyle=");
        sb.append(c3.f430d);
        sb.append(", fontSynthesis=");
        sb.append(c3.f431e);
        sb.append(", fontFamily=");
        sb.append(c3.f432f);
        sb.append(", fontFeatureSettings=");
        sb.append(c3.f433g);
        sb.append(", letterSpacing=");
        sb.append((Object) O0.m.d(c3.f434h));
        sb.append(", baselineShift=");
        sb.append(c3.f435i);
        sb.append(", textGeometricTransform=");
        sb.append(c3.f436j);
        sb.append(", localeList=");
        sb.append(c3.f437k);
        sb.append(", background=");
        B1.t.t(c3.f438l, sb, ", textDecoration=");
        sb.append(c3.f439m);
        sb.append(", shadow=");
        sb.append(c3.f440n);
        sb.append(", drawStyle=");
        sb.append(c3.f442p);
        sb.append(", textAlign=");
        t tVar = this.f476b;
        sb.append((Object) N0.i.b(tVar.f543a));
        sb.append(", textDirection=");
        sb.append((Object) N0.k.b(tVar.f544b));
        sb.append(", lineHeight=");
        sb.append((Object) O0.m.d(tVar.f545c));
        sb.append(", textIndent=");
        sb.append(tVar.f546d);
        sb.append(", platformStyle=");
        sb.append(this.f477c);
        sb.append(", lineHeightStyle=");
        sb.append(tVar.f548f);
        sb.append(", lineBreak=");
        sb.append((Object) N0.e.a(tVar.f549g));
        sb.append(", hyphens=");
        sb.append((Object) N0.d.b(tVar.f550h));
        sb.append(", textMotion=");
        sb.append(tVar.f551i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K(C0.C r4, C0.t r5) {
        /*
            r3 = this;
            C0.w r0 = r4.f441o
            C0.v r1 = r5.f547e
            if (r0 != 0) goto La
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            C0.x r2 = new C0.x
            r2.<init>(r0, r1)
            r0 = r2
        L10:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.K.<init>(C0.C, C0.t):void");
    }

    public K(long j3, long j4, H0.k kVar, long j5, int i2, long j6, int i3) {
        this(new C((i3 & 1) != 0 ? C0603v.f7277g : j3, (i3 & 2) != 0 ? O0.m.f5153c : j4, (i3 & 4) != 0 ? null : kVar, (H0.i) null, (H0.j) null, (H0.q) null, (String) null, (i3 & 128) != 0 ? O0.m.f5153c : j5, (N0.a) null, (N0.n) null, (J0.b) null, C0603v.f7277g, (N0.j) null, (C0575O) null, (w) null, (AbstractC0655e) null), new t((32768 & i3) != 0 ? Integer.MIN_VALUE : i2, Integer.MIN_VALUE, (i3 & 131072) != 0 ? O0.m.f5153c : j6, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
