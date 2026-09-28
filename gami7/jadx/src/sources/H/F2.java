package H;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;

/* loaded from: classes.dex */
public final class F2 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1460i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1461j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1462k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1463l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1464m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1465n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1466o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1467p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(AbstractC1103Q abstractC1103Q, AbstractC1103Q abstractC1103Q2, int i2, int i3, AbstractC1103Q abstractC1103Q3, int i4, int i5, int i6, int i7) {
        super(1);
        this.f1460i = abstractC1103Q;
        this.f1461j = abstractC1103Q2;
        this.f1462k = i2;
        this.f1463l = i3;
        this.f1464m = abstractC1103Q3;
        this.f1465n = i4;
        this.f1466o = i5;
        this.f1467p = i6;
        this.q = i7;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        AbstractC1103Q abstractC1103Q = this.f1460i;
        if (abstractC1103Q != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q, (this.f1467p - abstractC1103Q.f9834h) / 2, (this.q - abstractC1103Q.f9835i) / 2);
        }
        AbstractC1102P.f(abstractC1102P, this.f1461j, this.f1462k, this.f1463l);
        AbstractC1102P.f(abstractC1102P, this.f1464m, this.f1465n, this.f1466o);
        return C0880v.f8657a;
    }
}
