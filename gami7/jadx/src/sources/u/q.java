package u;

import a.AbstractC0423a;
import java.util.List;
import r0.AbstractC1103Q;
import v.InterfaceC1330B;

/* loaded from: classes.dex */
public final class q implements InterfaceC1330B {

    /* renamed from: a, reason: collision with root package name */
    public final int f10755a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10756b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10757c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10758d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10759e;

    /* renamed from: f, reason: collision with root package name */
    public final O0.k f10760f;

    /* renamed from: g, reason: collision with root package name */
    public final List f10761g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10762h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f10763i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f10764j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10765k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10766l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10767m;

    /* renamed from: n, reason: collision with root package name */
    public final int f10768n;

    /* renamed from: o, reason: collision with root package name */
    public int f10769o = Integer.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public final long f10770p;
    public long q;

    /* renamed from: r, reason: collision with root package name */
    public int f10771r;

    /* renamed from: s, reason: collision with root package name */
    public int f10772s;

    public q(int i2, Object obj, boolean z3, int i3, int i4, boolean z4, O0.k kVar, int i5, int i6, List list, long j3, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j4, int i7, int i8) {
        this.f10755a = i2;
        this.f10756b = obj;
        this.f10757c = z3;
        this.f10758d = i3;
        this.f10759e = z4;
        this.f10760f = kVar;
        this.f10761g = list;
        this.f10762h = j3;
        this.f10763i = obj2;
        this.f10764j = aVar;
        this.f10765k = i7;
        this.f10766l = i8;
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1103Q abstractC1103Q = (AbstractC1103Q) list.get(i10);
            i9 = Math.max(i9, this.f10757c ? abstractC1103Q.f9835i : abstractC1103Q.f9834h);
        }
        this.f10767m = i9;
        int i11 = i9 + i4;
        this.f10768n = i11 >= 0 ? i11 : 0;
        this.f10770p = this.f10757c ? l0.c.e(this.f10758d, i9) : l0.c.e(i9, this.f10758d);
        this.q = 0L;
        this.f10771r = -1;
        this.f10772s = -1;
    }

    @Override // v.InterfaceC1330B
    public final int a() {
        return this.f10768n;
    }

    @Override // v.InterfaceC1330B
    public final int b() {
        return this.f10761g.size();
    }

    @Override // v.InterfaceC1330B
    public final long c(int i2) {
        return this.q;
    }

    @Override // v.InterfaceC1330B
    public final int d() {
        return this.f10766l;
    }

    @Override // v.InterfaceC1330B
    public final Object e(int i2) {
        return ((AbstractC1103Q) this.f10761g.get(i2)).p();
    }

    @Override // v.InterfaceC1330B
    public final int f() {
        return this.f10765k;
    }

    public final void g(int i2, int i3, int i4, int i5) {
        h(i2, i3, i4, i5, -1, -1);
    }

    @Override // v.InterfaceC1330B
    public final int getIndex() {
        return this.f10755a;
    }

    @Override // v.InterfaceC1330B
    public final Object getKey() {
        return this.f10756b;
    }

    public final void h(int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z3 = this.f10757c;
        this.f10769o = z3 ? i5 : i4;
        if (!z3) {
            i4 = i5;
        }
        if (z3) {
            if (this.f10760f == O0.k.f5149i) {
                i3 = (i4 - i3) - this.f10758d;
            }
        }
        this.q = z3 ? AbstractC0423a.m(i3, i2) : AbstractC0423a.m(i2, i3);
        this.f10771r = i6;
        this.f10772s = i7;
    }
}
