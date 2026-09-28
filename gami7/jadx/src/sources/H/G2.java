package H;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;

/* loaded from: classes.dex */
public final class G2 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1506i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1507j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f1508k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1510m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f1511n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f1512o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1513p;
    public final /* synthetic */ int q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f1514r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1515s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1516t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f1517u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1518v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1096J f1519w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G2(AbstractC1103Q abstractC1103Q, boolean z3, float f3, AbstractC1103Q abstractC1103Q2, int i2, float f4, float f5, AbstractC1103Q abstractC1103Q3, int i3, float f6, AbstractC1103Q abstractC1103Q4, int i4, float f7, int i5, InterfaceC1096J interfaceC1096J) {
        super(1);
        this.f1506i = abstractC1103Q;
        this.f1507j = z3;
        this.f1508k = f3;
        this.f1509l = abstractC1103Q2;
        this.f1510m = i2;
        this.f1511n = f4;
        this.f1512o = f5;
        this.f1513p = abstractC1103Q3;
        this.q = i3;
        this.f1514r = f6;
        this.f1515s = abstractC1103Q4;
        this.f1516t = i4;
        this.f1517u = f7;
        this.f1518v = i5;
        this.f1519w = interfaceC1096J;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        float f3 = this.f1514r;
        float f4 = this.f1512o;
        AbstractC1103Q abstractC1103Q = this.f1506i;
        if (abstractC1103Q != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q, (this.f1518v - abstractC1103Q.f9834h) / 2, B2.a.D((f3 - this.f1519w.l(H2.f1567e)) + f4));
        }
        if (this.f1507j || this.f1508k != 0.0f) {
            AbstractC1102P.f(abstractC1102P, this.f1509l, this.f1510m, B2.a.D(this.f1511n + f4));
        }
        AbstractC1102P.f(abstractC1102P, this.f1513p, this.q, B2.a.D(f3 + f4));
        AbstractC1102P.f(abstractC1102P, this.f1515s, this.f1516t, B2.a.D(this.f1517u + f4));
        return C0880v.f8657a;
    }
}
