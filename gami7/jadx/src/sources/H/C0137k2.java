package H;

import java.util.ArrayList;
import java.util.List;
import n2.AbstractC0961m;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.AbstractC1114c;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import s.C1160M;

/* renamed from: H.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O0.k f2801a;

    public C0137k2(O0.k kVar) {
        this.f2801a = kVar;
    }

    public final InterfaceC1095I a(InterfaceC1096J interfaceC1096J, ArrayList arrayList, long j3) {
        AbstractC1103Q abstractC1103Q;
        AbstractC1103Q abstractC1103Q2;
        char c3;
        char c4;
        int e3;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        long a3 = O0.a.a(j3, 0, 0, 0, 0, 10);
        float f3 = AbstractC0165o2.f2971c;
        float f4 = AbstractC0165o2.f2972d;
        int i2 = -interfaceC1096J.l(f3 + f4);
        float f5 = AbstractC0165o2.f2969a;
        long d02 = B1.C.d0(i2, -interfaceC1096J.l(2 * f5), a3);
        InterfaceC1093G interfaceC1093G = (InterfaceC1093G) AbstractC0961m.H(list4);
        AbstractC1103Q a4 = interfaceC1093G != null ? interfaceC1093G.a(d02) : null;
        int e4 = AbstractC0140k5.e(a4);
        InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) AbstractC0961m.H(list5);
        AbstractC1103Q a5 = interfaceC1093G2 != null ? interfaceC1093G2.a(B1.C.e0(-e4, 0, 2, d02)) : null;
        int e5 = AbstractC0140k5.e(a5) + e4;
        InterfaceC1093G interfaceC1093G3 = (InterfaceC1093G) AbstractC0961m.H(list);
        if (interfaceC1093G3 != null) {
            abstractC1103Q = a5;
            abstractC1103Q2 = interfaceC1093G3.a(B1.C.e0(-e5, 0, 2, d02));
        } else {
            abstractC1103Q = a5;
            abstractC1103Q2 = null;
        }
        int d3 = AbstractC0140k5.d(abstractC1103Q2);
        InterfaceC1093G interfaceC1093G4 = (InterfaceC1093G) AbstractC0961m.H(list3);
        AbstractC1103Q a6 = interfaceC1093G4 != null ? interfaceC1093G4.a(B1.C.d0(-e5, -d3, d02)) : null;
        int d4 = AbstractC0140k5.d(a6) + d3;
        boolean z3 = (a6 == null || a6.d0(AbstractC1114c.f9858a) == a6.d0(AbstractC1114c.f9859b)) ? false : true;
        InterfaceC1093G interfaceC1093G5 = (InterfaceC1093G) AbstractC0961m.H(list2);
        AbstractC1103Q a7 = interfaceC1093G5 != null ? interfaceC1093G5.a(B1.C.d0(-e5, -d4, d02)) : null;
        boolean z4 = a7 != null;
        boolean z5 = a6 != null;
        if ((z4 && z5) || z3) {
            c3 = 3;
            c4 = 3;
        } else if (z4 || z5) {
            c3 = 3;
            c4 = 2;
        } else {
            c3 = 3;
            c4 = 1;
        }
        boolean z6 = c4 == c3;
        float f6 = z6 ? AbstractC0165o2.f2970b : f5;
        if (z6) {
            f5 = AbstractC0165o2.f2970b;
        }
        float f7 = f5;
        C1160M c1160m = new C1160M(f3, f6, f4, f7);
        if (O0.a.d(j3)) {
            e3 = O0.a.h(j3);
        } else {
            O0.k kVar = this.f2801a;
            e3 = AbstractC0140k5.e(abstractC1103Q) + AbstractC0140k5.e(a4) + interfaceC1096J.l(c1160m.a(kVar) + c1160m.b(kVar)) + Math.max(AbstractC0140k5.e(abstractC1103Q2), Math.max(AbstractC0140k5.e(a7), AbstractC0140k5.e(a6)));
        }
        int i3 = e3;
        int max = Math.max(Math.max(O0.a.i(j3), interfaceC1096J.l(c4 == 1 ? I.p.f3727f : c4 == 2 ? I.p.f3732k : I.p.f3730i)), Math.max(AbstractC0140k5.d(a4), Math.max(AbstractC0140k5.d(a6) + AbstractC0140k5.d(a7) + AbstractC0140k5.d(abstractC1103Q2), AbstractC0140k5.d(abstractC1103Q))) + interfaceC1096J.l(f7 + f6));
        int g3 = O0.a.g(j3);
        int i4 = max > g3 ? g3 : max;
        return interfaceC1096J.C(i3, i4, C0971w.f9166h, new C0158n2(interfaceC1096J, c1160m, this.f2801a, a4, abstractC1103Q, z6, abstractC1103Q2, a7, a6, i4, i3));
    }
}
