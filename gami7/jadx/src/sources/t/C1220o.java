package t;

import a.AbstractC0423a;
import java.util.List;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import v.InterfaceC1330B;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1220o implements InterfaceC1330B {

    /* renamed from: a, reason: collision with root package name */
    public final int f10303a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10304b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10305c;

    /* renamed from: d, reason: collision with root package name */
    public final V.e f10306d;

    /* renamed from: e, reason: collision with root package name */
    public final V.f f10307e;

    /* renamed from: f, reason: collision with root package name */
    public final O0.k f10308f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10309g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10310h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10311i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f10312j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f10313k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f10314l;

    /* renamed from: m, reason: collision with root package name */
    public int f10315m;

    /* renamed from: n, reason: collision with root package name */
    public final int f10316n;

    /* renamed from: o, reason: collision with root package name */
    public final int f10317o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10318p;
    public int q = Integer.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f10319r;

    public C1220o(int i2, List list, boolean z3, V.e eVar, V.f fVar, O0.k kVar, boolean z4, int i3, int i4, int i5, long j3, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j4) {
        this.f10303a = i2;
        this.f10304b = list;
        this.f10305c = z3;
        this.f10306d = eVar;
        this.f10307e = fVar;
        this.f10308f = kVar;
        this.f10309g = z4;
        this.f10310h = i5;
        this.f10311i = j3;
        this.f10312j = obj;
        this.f10313k = obj2;
        this.f10314l = aVar;
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC1103Q abstractC1103Q = (AbstractC1103Q) list.get(i8);
            boolean z5 = this.f10305c;
            i6 += z5 ? abstractC1103Q.f9835i : abstractC1103Q.f9834h;
            i7 = Math.max(i7, !z5 ? abstractC1103Q.f9835i : abstractC1103Q.f9834h);
        }
        this.f10316n = i6;
        int i9 = i6 + this.f10310h;
        this.f10317o = i9 >= 0 ? i9 : 0;
        this.f10318p = i7;
        this.f10319r = new int[this.f10304b.size() * 2];
    }

    @Override // v.InterfaceC1330B
    public final int a() {
        return this.f10317o;
    }

    @Override // v.InterfaceC1330B
    public final int b() {
        return this.f10304b.size();
    }

    @Override // v.InterfaceC1330B
    public final long c(int i2) {
        int i3 = i2 * 2;
        int[] iArr = this.f10319r;
        return AbstractC0423a.m(iArr[i3], iArr[i3 + 1]);
    }

    @Override // v.InterfaceC1330B
    public final int d() {
        return 1;
    }

    @Override // v.InterfaceC1330B
    public final Object e(int i2) {
        return ((AbstractC1103Q) this.f10304b.get(i2)).p();
    }

    @Override // v.InterfaceC1330B
    public final int f() {
        return 0;
    }

    public final void g(AbstractC1102P abstractC1102P) {
        if (this.q == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        List list = this.f10304b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1103Q abstractC1103Q = (AbstractC1103Q) list.get(i2);
            boolean z3 = this.f10305c;
            if (z3) {
                int i3 = abstractC1103Q.f9835i;
            } else {
                int i4 = abstractC1103Q.f9834h;
            }
            long c3 = c(i2);
            this.f10314l.a(i2, this.f10312j);
            if (this.f10309g) {
                c3 = AbstractC0423a.m(z3 ? (int) (c3 >> 32) : (this.q - ((int) (c3 >> 32))) - (z3 ? abstractC1103Q.f9835i : abstractC1103Q.f9834h), z3 ? (this.q - ((int) (c3 & 4294967295L))) - (z3 ? abstractC1103Q.f9835i : abstractC1103Q.f9834h) : (int) (c3 & 4294967295L));
            }
            long c4 = O0.h.c(c3, this.f10311i);
            if (z3) {
                AbstractC1102P.k(abstractC1102P, abstractC1103Q, c4);
            } else {
                AbstractC1102P.i(abstractC1102P, abstractC1103Q, c4);
            }
        }
    }

    @Override // v.InterfaceC1330B
    public final int getIndex() {
        return this.f10303a;
    }

    @Override // v.InterfaceC1330B
    public final Object getKey() {
        return this.f10312j;
    }

    public final void h(int i2, int i3, int i4) {
        int i5;
        this.f10315m = i2;
        boolean z3 = this.f10305c;
        this.q = z3 ? i4 : i3;
        List list = this.f10304b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC1103Q abstractC1103Q = (AbstractC1103Q) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.f10319r;
            if (z3) {
                V.e eVar = this.f10306d;
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
                iArr[i7] = eVar.a(abstractC1103Q.f9834h, i3, this.f10308f);
                iArr[i7 + 1] = i2;
                i5 = abstractC1103Q.f9835i;
            } else {
                iArr[i7] = i2;
                int i8 = i7 + 1;
                V.f fVar = this.f10307e;
                if (fVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
                iArr[i8] = fVar.a(abstractC1103Q.f9835i, i4);
                i5 = abstractC1103Q.f9834h;
            }
            i2 += i5;
        }
    }
}
