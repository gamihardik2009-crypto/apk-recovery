package H;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;
import s.InterfaceC1159L;

/* loaded from: classes.dex */
public final class S2 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1971i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1972j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1973k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1974l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1975m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1976n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1977o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1978p;
    public final /* synthetic */ AbstractC1103Q q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1979r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1980s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T2 f1981t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1096J f1982u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(int i2, int i3, AbstractC1103Q abstractC1103Q, AbstractC1103Q abstractC1103Q2, AbstractC1103Q abstractC1103Q3, AbstractC1103Q abstractC1103Q4, AbstractC1103Q abstractC1103Q5, AbstractC1103Q abstractC1103Q6, AbstractC1103Q abstractC1103Q7, AbstractC1103Q abstractC1103Q8, AbstractC1103Q abstractC1103Q9, T2 t22, InterfaceC1096J interfaceC1096J) {
        super(1);
        this.f1971i = i2;
        this.f1972j = i3;
        this.f1973k = abstractC1103Q;
        this.f1974l = abstractC1103Q2;
        this.f1975m = abstractC1103Q3;
        this.f1976n = abstractC1103Q4;
        this.f1977o = abstractC1103Q5;
        this.f1978p = abstractC1103Q6;
        this.q = abstractC1103Q7;
        this.f1979r = abstractC1103Q8;
        this.f1980s = abstractC1103Q9;
        this.f1981t = t22;
        this.f1982u = interfaceC1096J;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        float f3;
        int i2;
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        T2 t22 = this.f1981t;
        float f4 = t22.f2007c;
        InterfaceC1096J interfaceC1096J = this.f1982u;
        float c3 = interfaceC1096J.c();
        O0.k layoutDirection = interfaceC1096J.getLayoutDirection();
        float f5 = R2.f1949a;
        AbstractC1102P.e(abstractC1102P, this.f1979r, 0L);
        AbstractC1103Q abstractC1103Q = this.f1980s;
        int d3 = this.f1971i - AbstractC0140k5.d(abstractC1103Q);
        InterfaceC1159L interfaceC1159L = t22.f2008d;
        int D3 = B2.a.D(interfaceC1159L.d() * c3);
        int D4 = B2.a.D(androidx.compose.foundation.layout.a.e(interfaceC1159L, layoutDirection) * c3);
        float f6 = AbstractC0140k5.f2812c * c3;
        AbstractC1103Q abstractC1103Q2 = this.f1973k;
        if (abstractC1103Q2 != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q2, 0, Math.round((1 + 0.0f) * ((d3 - abstractC1103Q2.f9835i) / 2.0f)));
        }
        int i3 = this.f1972j;
        AbstractC1103Q abstractC1103Q3 = this.f1974l;
        if (abstractC1103Q3 != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q3, i3 - abstractC1103Q3.f9834h, Math.round((1 + 0.0f) * ((d3 - abstractC1103Q3.f9835i) / 2.0f)));
        }
        boolean z3 = t22.f2006b;
        AbstractC1103Q abstractC1103Q4 = this.f1978p;
        if (abstractC1103Q4 != null) {
            if (z3) {
                f3 = 0.0f;
                i2 = Math.round((1 + 0.0f) * ((d3 - abstractC1103Q4.f9835i) / 2.0f));
            } else {
                f3 = 0.0f;
                i2 = D3;
            }
            AbstractC1102P.f(abstractC1102P, abstractC1103Q4, B2.a.D(abstractC1103Q2 == null ? f3 : (AbstractC0140k5.e(abstractC1103Q2) - f6) * (1 - f4)) + D4, B2.a.z(f4, i2, -(abstractC1103Q4.f9835i / 2)));
        }
        AbstractC1103Q abstractC1103Q5 = this.f1975m;
        if (abstractC1103Q5 != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q5, AbstractC0140k5.e(abstractC1103Q2), R2.f(z3, d3, D3, abstractC1103Q4, abstractC1103Q5));
        }
        AbstractC1103Q abstractC1103Q6 = this.f1976n;
        if (abstractC1103Q6 != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q6, (i3 - AbstractC0140k5.e(abstractC1103Q3)) - abstractC1103Q6.f9834h, R2.f(z3, d3, D3, abstractC1103Q4, abstractC1103Q6));
        }
        int e3 = AbstractC0140k5.e(abstractC1103Q5) + AbstractC0140k5.e(abstractC1103Q2);
        AbstractC1103Q abstractC1103Q7 = this.f1977o;
        AbstractC1102P.f(abstractC1102P, abstractC1103Q7, e3, R2.f(z3, d3, D3, abstractC1103Q4, abstractC1103Q7));
        AbstractC1103Q abstractC1103Q8 = this.q;
        if (abstractC1103Q8 != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q8, e3, R2.f(z3, d3, D3, abstractC1103Q4, abstractC1103Q8));
        }
        if (abstractC1103Q != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q, 0, d3);
        }
        return C0880v.f8657a;
    }
}
