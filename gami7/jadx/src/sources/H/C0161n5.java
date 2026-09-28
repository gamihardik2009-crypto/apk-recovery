package H;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;

/* renamed from: H.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161n5 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2945i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2946j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2947k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2948l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2949m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2950n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2951o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2952p;
    public final /* synthetic */ AbstractC1103Q q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2953r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2954s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0168o5 f2955t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2956u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1096J f2957v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161n5(AbstractC1103Q abstractC1103Q, int i2, int i3, AbstractC1103Q abstractC1103Q2, AbstractC1103Q abstractC1103Q3, AbstractC1103Q abstractC1103Q4, AbstractC1103Q abstractC1103Q5, AbstractC1103Q abstractC1103Q6, AbstractC1103Q abstractC1103Q7, AbstractC1103Q abstractC1103Q8, AbstractC1103Q abstractC1103Q9, C0168o5 c0168o5, int i4, InterfaceC1096J interfaceC1096J) {
        super(1);
        this.f2945i = abstractC1103Q;
        this.f2946j = i2;
        this.f2947k = i3;
        this.f2948l = abstractC1103Q2;
        this.f2949m = abstractC1103Q3;
        this.f2950n = abstractC1103Q4;
        this.f2951o = abstractC1103Q5;
        this.f2952p = abstractC1103Q6;
        this.q = abstractC1103Q7;
        this.f2953r = abstractC1103Q8;
        this.f2954s = abstractC1103Q9;
        this.f2955t = c0168o5;
        this.f2956u = i4;
        this.f2957v = interfaceC1096J;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        int D3;
        AbstractC1103Q abstractC1103Q;
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        AbstractC1103Q abstractC1103Q2 = this.f2948l;
        AbstractC1103Q abstractC1103Q3 = this.f2953r;
        InterfaceC1096J interfaceC1096J = this.f2957v;
        AbstractC1103Q abstractC1103Q4 = this.f2954s;
        AbstractC1103Q abstractC1103Q5 = this.q;
        AbstractC1103Q abstractC1103Q6 = this.f2952p;
        AbstractC1103Q abstractC1103Q7 = this.f2951o;
        AbstractC1103Q abstractC1103Q8 = this.f2950n;
        AbstractC1103Q abstractC1103Q9 = this.f2949m;
        int i2 = this.f2947k;
        int i3 = this.f2946j;
        C0168o5 c0168o5 = this.f2955t;
        AbstractC1103Q abstractC1103Q10 = this.f2945i;
        if (abstractC1103Q10 != null) {
            boolean z3 = c0168o5.f2985a;
            int i4 = abstractC1103Q10.f9835i + this.f2956u;
            float c3 = interfaceC1096J.c();
            float f3 = AbstractC0154m5.f2915a;
            AbstractC1102P.e(abstractC1102P, abstractC1103Q3, 0L);
            int d3 = i2 - AbstractC0140k5.d(abstractC1103Q4);
            if (abstractC1103Q8 != null) {
                AbstractC1102P.f(abstractC1102P, abstractC1103Q8, 0, Math.round((1 + 0.0f) * ((d3 - abstractC1103Q8.f9835i) / 2.0f)));
            }
            if (abstractC1103Q7 != null) {
                AbstractC1102P.f(abstractC1102P, abstractC1103Q7, i3 - abstractC1103Q7.f9834h, Math.round((1 + 0.0f) * ((d3 - abstractC1103Q7.f9835i) / 2.0f)));
            }
            if (z3) {
                D3 = Math.round((1 + 0.0f) * ((d3 - abstractC1103Q10.f9835i) / 2.0f));
            } else {
                D3 = B2.a.D(AbstractC0140k5.f2811b * c3);
            }
            AbstractC1102P.f(abstractC1102P, abstractC1103Q10, AbstractC0140k5.e(abstractC1103Q8), D3 - B2.a.D((D3 - r2) * c0168o5.f2986b));
            if (abstractC1103Q6 != null) {
                abstractC1103Q = abstractC1103Q6;
                AbstractC1102P.f(abstractC1102P, abstractC1103Q, AbstractC0140k5.e(abstractC1103Q8), i4);
            } else {
                abstractC1103Q = abstractC1103Q6;
            }
            if (abstractC1103Q5 != null) {
                AbstractC1102P.f(abstractC1102P, abstractC1103Q5, (i3 - AbstractC0140k5.e(abstractC1103Q7)) - abstractC1103Q5.f9834h, i4);
            }
            int e3 = AbstractC0140k5.e(abstractC1103Q) + AbstractC0140k5.e(abstractC1103Q8);
            AbstractC1102P.f(abstractC1102P, abstractC1103Q2, e3, i4);
            if (abstractC1103Q9 != null) {
                AbstractC1102P.f(abstractC1102P, abstractC1103Q9, e3, i4);
            }
            if (abstractC1103Q4 != null) {
                AbstractC1102P.f(abstractC1102P, abstractC1103Q4, 0, d3);
            }
        } else {
            boolean z4 = c0168o5.f2985a;
            float c4 = interfaceC1096J.c();
            float f4 = AbstractC0154m5.f2915a;
            AbstractC1102P.e(abstractC1102P, abstractC1103Q3, 0L);
            int d4 = i2 - AbstractC0140k5.d(abstractC1103Q4);
            int D4 = B2.a.D(c0168o5.f2987c.d() * c4);
            if (abstractC1103Q8 != null) {
                AbstractC1102P.f(abstractC1102P, abstractC1103Q8, 0, Math.round((1 + 0.0f) * ((d4 - abstractC1103Q8.f9835i) / 2.0f)));
            }
            if (abstractC1103Q7 != null) {
                AbstractC1102P.f(abstractC1102P, abstractC1103Q7, i3 - abstractC1103Q7.f9834h, Math.round((1 + 0.0f) * ((d4 - abstractC1103Q7.f9835i) / 2.0f)));
            }
            if (abstractC1103Q6 != null) {
                AbstractC1102P.f(abstractC1102P, abstractC1103Q6, AbstractC0140k5.e(abstractC1103Q8), AbstractC0154m5.d(z4, d4, D4, abstractC1103Q6));
            }
            if (abstractC1103Q5 != null) {
                AbstractC1102P.f(abstractC1102P, abstractC1103Q5, (i3 - AbstractC0140k5.e(abstractC1103Q7)) - abstractC1103Q5.f9834h, AbstractC0154m5.d(z4, d4, D4, abstractC1103Q5));
            }
            int e4 = AbstractC0140k5.e(abstractC1103Q6) + AbstractC0140k5.e(abstractC1103Q8);
            AbstractC1102P.f(abstractC1102P, abstractC1103Q2, e4, AbstractC0154m5.d(z4, d4, D4, abstractC1103Q2));
            if (abstractC1103Q9 != null) {
                AbstractC1102P.f(abstractC1102P, abstractC1103Q9, e4, AbstractC0154m5.d(z4, d4, D4, abstractC1103Q9));
            }
            if (abstractC1103Q4 != null) {
                AbstractC1102P.f(abstractC1102P, abstractC1103Q4, 0, d4);
            }
        }
        return C0880v.f8657a;
    }
}
