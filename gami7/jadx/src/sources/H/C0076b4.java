package H;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;

/* renamed from: H.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076b4 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2352i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2353j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2354k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2355l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2356m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2357n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2358o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2359p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0076b4(AbstractC1103Q abstractC1103Q, int i2, AbstractC1103Q abstractC1103Q2, int i3, int i4, AbstractC1103Q abstractC1103Q3, int i5, int i6) {
        super(1);
        this.f2352i = abstractC1103Q;
        this.f2353j = i2;
        this.f2354k = abstractC1103Q2;
        this.f2355l = i3;
        this.f2356m = i4;
        this.f2357n = abstractC1103Q3;
        this.f2358o = i5;
        this.f2359p = i6;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        AbstractC1102P.f(abstractC1102P, this.f2352i, 0, this.f2353j);
        AbstractC1103Q abstractC1103Q = this.f2354k;
        if (abstractC1103Q != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q, this.f2355l, this.f2356m);
        }
        AbstractC1103Q abstractC1103Q2 = this.f2357n;
        if (abstractC1103Q2 != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q2, this.f2358o, this.f2359p);
        }
        return C0880v.f8657a;
    }
}
