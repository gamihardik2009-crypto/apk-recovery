package H;

import java.util.ArrayList;
import java.util.List;
import m2.C0880v;
import n2.AbstractC0961m;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;

/* loaded from: classes.dex */
public final class U4 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2049i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f2050j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r0.a0 f2051k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.e f2052l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0145l3 f2053m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2054n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f2055o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f2056p;
    public final /* synthetic */ int q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2057r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.f f2058s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(int i2, ArrayList arrayList, r0.a0 a0Var, y2.e eVar, C0145l3 c0145l3, int i3, ArrayList arrayList2, long j3, int i4, int i5, y2.f fVar) {
        super(1);
        this.f2049i = i2;
        this.f2050j = arrayList;
        this.f2051k = a0Var;
        this.f2052l = eVar;
        this.f2053m = c0145l3;
        this.f2054n = i3;
        this.f2055o = arrayList2;
        this.f2056p = j3;
        this.q = i4;
        this.f2057r = i5;
        this.f2058s = fVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        r0.a0 a0Var;
        int i2;
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        ArrayList arrayList = new ArrayList();
        List list = this.f2050j;
        int size = list.size();
        int i3 = this.f2049i;
        int i4 = 0;
        int i5 = i3;
        while (true) {
            a0Var = this.f2051k;
            if (i4 >= size) {
                break;
            }
            AbstractC1103Q abstractC1103Q = (AbstractC1103Q) list.get(i4);
            AbstractC1102P.f(abstractC1102P, abstractC1103Q, i5, 0);
            arrayList.add(new P4(a0Var.o0(i5), a0Var.o0(abstractC1103Q.f9834h), ((O0.e) this.f2055o.get(i4)).f5138h));
            i5 += abstractC1103Q.f9834h;
            i4++;
        }
        List f02 = a0Var.f0(Y4.f2188i, this.f2052l);
        int size2 = f02.size();
        int i6 = 0;
        while (true) {
            i2 = this.f2057r;
            if (i6 >= size2) {
                break;
            }
            InterfaceC1093G interfaceC1093G = (InterfaceC1093G) f02.get(i6);
            int i7 = this.q;
            AbstractC1103Q a3 = interfaceC1093G.a(O0.a.a(this.f2056p, i7, i7, 0, 0, 8));
            AbstractC1102P.f(abstractC1102P, a3, 0, i2 - a3.f9835i);
            i6++;
        }
        List f03 = a0Var.f0(Y4.f2189j, new R.a(358596038, new C0148m(this.f2058s, 8, arrayList), true));
        int size3 = f03.size();
        for (int i8 = 0; i8 < size3; i8++) {
            InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) f03.get(i8);
            int i9 = this.q;
            if (i9 < 0 || i2 < 0) {
                K1.f.R("width(" + i9 + ") and height(" + i2 + ") must be >= 0");
                throw null;
            }
            AbstractC1102P.f(abstractC1102P, interfaceC1093G2.a(B1.C.L(i9, i9, i2, i2)), 0, 0);
        }
        C0145l3 c0145l3 = this.f2053m;
        Integer num = c0145l3.f2855c;
        int i10 = this.f2054n;
        if (num == null || num.intValue() != i10) {
            c0145l3.f2855c = Integer.valueOf(i10);
            P4 p4 = (P4) ((i10 < 0 || i10 >= arrayList.size()) ? null : arrayList.get(i10));
            if (p4 != null) {
                P4 p42 = (P4) AbstractC0961m.M(arrayList);
                int l3 = a0Var.l(p42.f1914a + p42.f1915b) + i3;
                n.w0 w0Var = c0145l3.f2853a;
                int g3 = l3 - w0Var.f8886d.g();
                int l4 = a0Var.l(p4.f1914a) - ((g3 / 2) - (a0Var.l(p4.f1915b) / 2));
                int i11 = l3 - g3;
                if (i11 < 0) {
                    i11 = 0;
                }
                int C3 = B1.C.C(l4, 0, i11);
                if (w0Var.f8883a.g() != C3) {
                    J2.B.r(c0145l3.f2854b, null, 0, new C0138k3(c0145l3, C3, null), 3);
                }
            }
        }
        return C0880v.f8657a;
    }
}
