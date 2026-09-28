package H;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;

/* loaded from: classes.dex */
public final class L4 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1710i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1711j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1096J f1712k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1713l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1714m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f1715n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Integer f1716o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L4(AbstractC1103Q abstractC1103Q, AbstractC1103Q abstractC1103Q2, InterfaceC1096J interfaceC1096J, int i2, int i3, Integer num, Integer num2) {
        super(1);
        this.f1710i = abstractC1103Q;
        this.f1711j = abstractC1103Q2;
        this.f1712k = interfaceC1096J;
        this.f1713l = i2;
        this.f1714m = i3;
        this.f1715n = num;
        this.f1716o = num2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        AbstractC1103Q abstractC1103Q = this.f1711j;
        int i2 = this.f1714m;
        AbstractC1103Q abstractC1103Q2 = this.f1710i;
        if (abstractC1103Q2 != null && abstractC1103Q != null) {
            Integer num = this.f1715n;
            z2.h.c(num);
            int intValue = num.intValue();
            Integer num2 = this.f1716o;
            z2.h.c(num2);
            int intValue2 = num2.intValue();
            float f3 = intValue == intValue2 ? O4.f1851d : O4.f1852e;
            InterfaceC1096J interfaceC1096J = this.f1712k;
            int l3 = interfaceC1096J.l(I.u.f3800a) + interfaceC1096J.l(f3);
            int m02 = (interfaceC1096J.m0(O4.f1853f) + abstractC1103Q.f9835i) - intValue;
            int i3 = abstractC1103Q2.f9834h;
            int i4 = this.f1713l;
            int i5 = (i2 - intValue2) - l3;
            AbstractC1102P.f(abstractC1102P, abstractC1103Q2, (i4 - i3) / 2, i5);
            AbstractC1102P.f(abstractC1102P, abstractC1103Q, (i4 - abstractC1103Q.f9834h) / 2, i5 - m02);
        } else if (abstractC1103Q2 != null) {
            float f4 = O4.f1848a;
            AbstractC1102P.f(abstractC1102P, abstractC1103Q2, 0, (i2 - abstractC1103Q2.f9835i) / 2);
        } else if (abstractC1103Q != null) {
            float f5 = O4.f1848a;
            AbstractC1102P.f(abstractC1102P, abstractC1103Q, 0, (i2 - abstractC1103Q.f9835i) / 2);
        }
        return C0880v.f8657a;
    }
}
