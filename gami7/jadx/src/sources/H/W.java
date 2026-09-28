package H;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;

/* loaded from: classes.dex */
public final class W extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2094i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2095j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2096k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2097l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2098m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2099n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2100o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(AbstractC1103Q abstractC1103Q, int i2, int i3, AbstractC1103Q abstractC1103Q2, int i4, AbstractC1103Q abstractC1103Q3, int i5) {
        super(1);
        this.f2094i = abstractC1103Q;
        this.f2095j = i2;
        this.f2096k = i3;
        this.f2097l = abstractC1103Q2;
        this.f2098m = i4;
        this.f2099n = abstractC1103Q3;
        this.f2100o = i5;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        int i2 = this.f2096k;
        AbstractC1103Q abstractC1103Q = this.f2094i;
        if (abstractC1103Q != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q, 0, Math.round((1 + 0.0f) * ((i2 - this.f2095j) / 2.0f)));
        }
        AbstractC1103Q abstractC1103Q2 = this.f2097l;
        int i3 = this.f2098m;
        AbstractC1102P.f(abstractC1102P, abstractC1103Q2, i3, 0);
        AbstractC1103Q abstractC1103Q3 = this.f2099n;
        if (abstractC1103Q3 != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q3, i3 + abstractC1103Q2.f9834h, Math.round((1 + 0.0f) * ((i2 - this.f2100o) / 2.0f)));
        }
        return C0880v.f8657a;
    }
}
