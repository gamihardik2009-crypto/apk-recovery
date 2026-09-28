package H;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;
import s.C1160M;
import s.InterfaceC1159L;

/* renamed from: H.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158n2 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1096J f2928i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1159L f2929j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O0.k f2930k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2931l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2932m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2933n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2934o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f2935p;
    public final /* synthetic */ AbstractC1103Q q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2936r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2937s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158n2(InterfaceC1096J interfaceC1096J, C1160M c1160m, O0.k kVar, AbstractC1103Q abstractC1103Q, AbstractC1103Q abstractC1103Q2, boolean z3, AbstractC1103Q abstractC1103Q3, AbstractC1103Q abstractC1103Q4, AbstractC1103Q abstractC1103Q5, int i2, int i3) {
        super(1);
        this.f2928i = interfaceC1096J;
        this.f2929j = c1160m;
        this.f2930k = kVar;
        this.f2931l = abstractC1103Q;
        this.f2932m = abstractC1103Q2;
        this.f2933n = z3;
        this.f2934o = abstractC1103Q3;
        this.f2935p = abstractC1103Q4;
        this.q = abstractC1103Q5;
        this.f2936r = i2;
        this.f2937s = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        int round;
        int round2;
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        InterfaceC1159L interfaceC1159L = this.f2929j;
        O0.k kVar = this.f2930k;
        float e3 = androidx.compose.foundation.layout.a.e(interfaceC1159L, kVar);
        InterfaceC1096J interfaceC1096J = this.f2928i;
        int l3 = interfaceC1096J.l(e3);
        int l4 = interfaceC1096J.l(androidx.compose.foundation.layout.a.d(interfaceC1159L, kVar));
        int l5 = interfaceC1096J.l(interfaceC1159L.d());
        int i2 = this.f2936r;
        boolean z3 = this.f2933n;
        AbstractC1103Q abstractC1103Q = this.f2931l;
        if (abstractC1103Q != null) {
            if (z3) {
                round2 = l5;
            } else {
                round2 = Math.round((1 + 0.0f) * ((i2 - abstractC1103Q.f9835i) / 2.0f));
            }
            AbstractC1102P.f(abstractC1102P, abstractC1103Q, l3, round2);
        }
        AbstractC1103Q abstractC1103Q2 = this.f2932m;
        if (abstractC1103Q2 != null) {
            int i3 = (this.f2937s - l4) - abstractC1103Q2.f9834h;
            if (z3) {
                round = l5;
            } else {
                round = Math.round((1 + 0.0f) * ((i2 - abstractC1103Q2.f9835i) / 2.0f));
            }
            AbstractC1102P.f(abstractC1102P, abstractC1103Q2, i3, round);
        }
        int e4 = AbstractC0140k5.e(abstractC1103Q) + l3;
        AbstractC1103Q abstractC1103Q3 = this.q;
        AbstractC1103Q abstractC1103Q4 = this.f2935p;
        AbstractC1103Q abstractC1103Q5 = this.f2934o;
        if (!z3) {
            l5 = Math.round((1 + 0.0f) * ((i2 - (AbstractC0140k5.d(abstractC1103Q3) + (AbstractC0140k5.d(abstractC1103Q4) + AbstractC0140k5.d(abstractC1103Q5)))) / 2.0f));
        }
        if (abstractC1103Q4 != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q4, e4, l5);
        }
        int d3 = AbstractC0140k5.d(abstractC1103Q4) + l5;
        if (abstractC1103Q5 != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q5, e4, d3);
        }
        int d4 = AbstractC0140k5.d(abstractC1103Q5) + d3;
        if (abstractC1103Q3 != null) {
            AbstractC1102P.f(abstractC1102P, abstractC1103Q3, e4, d4);
        }
        return C0880v.f8657a;
    }
}
