package H;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;
import s.AbstractC1173l;
import s.C1168g;
import s.InterfaceC1169h;
import s.InterfaceC1171j;

/* renamed from: H.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206v extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f3197i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3198j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f3199k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1169h f3200l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f3201m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f3202n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1096J f3203o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1171j f3204p;
    public final /* synthetic */ int q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3205r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0206v(AbstractC1103Q abstractC1103Q, int i2, AbstractC1103Q abstractC1103Q2, InterfaceC1169h interfaceC1169h, long j3, AbstractC1103Q abstractC1103Q3, InterfaceC1096J interfaceC1096J, InterfaceC1171j interfaceC1171j, int i3, int i4) {
        super(1);
        this.f3197i = abstractC1103Q;
        this.f3198j = i2;
        this.f3199k = abstractC1103Q2;
        this.f3200l = interfaceC1169h;
        this.f3201m = j3;
        this.f3202n = abstractC1103Q3;
        this.f3203o = interfaceC1096J;
        this.f3204p = interfaceC1171j;
        this.q = i3;
        this.f3205r = i4;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        int max;
        int h2;
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        AbstractC1103Q abstractC1103Q = this.f3197i;
        int i2 = abstractC1103Q.f9835i;
        int i3 = this.f3198j;
        int i4 = 0;
        AbstractC1102P.f(abstractC1102P, abstractC1103Q, 0, (i3 - i2) / 2);
        C1168g c1168g = AbstractC1173l.f10153e;
        InterfaceC1169h interfaceC1169h = this.f3200l;
        boolean a3 = z2.h.a(interfaceC1169h, c1168g);
        AbstractC1103Q abstractC1103Q2 = this.f3199k;
        AbstractC1103Q abstractC1103Q3 = this.f3202n;
        long j3 = this.f3201m;
        if (a3) {
            int h3 = O0.a.h(j3);
            int i5 = abstractC1103Q2.f9834h;
            max = (h3 - i5) / 2;
            int i6 = abstractC1103Q.f9834h;
            if (max < i6) {
                h2 = i6 - max;
            } else if (i5 + max > O0.a.h(j3) - abstractC1103Q3.f9834h) {
                h2 = (O0.a.h(j3) - abstractC1103Q3.f9834h) - (abstractC1103Q2.f9834h + max);
            }
            max += h2;
        } else if (z2.h.a(interfaceC1169h, AbstractC1173l.f10150b)) {
            max = (O0.a.h(j3) - abstractC1103Q2.f9834h) - abstractC1103Q3.f9834h;
        } else {
            max = Math.max(this.f3203o.l(AbstractC0224y.f3315b), abstractC1103Q.f9834h);
        }
        InterfaceC1171j interfaceC1171j = this.f3204p;
        if (z2.h.a(interfaceC1171j, c1168g)) {
            i4 = (i3 - abstractC1103Q2.f9835i) / 2;
        } else if (z2.h.a(interfaceC1171j, AbstractC1173l.f10152d)) {
            int i7 = this.q;
            if (i7 == 0) {
                i4 = i3 - abstractC1103Q2.f9835i;
            } else {
                int i8 = abstractC1103Q2.f9835i;
                i4 = (i3 - i8) - Math.max(0, (i7 - i8) + this.f3205r);
            }
        }
        AbstractC1102P.f(abstractC1102P, abstractC1103Q2, max, i4);
        AbstractC1102P.f(abstractC1102P, abstractC1103Q3, O0.a.h(j3) - abstractC1103Q3.f9834h, (i3 - abstractC1103Q3.f9835i) / 2);
        return C0880v.f8657a;
    }
}
