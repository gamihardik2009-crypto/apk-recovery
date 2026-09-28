package s;

import java.util.List;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;

/* loaded from: classes.dex */
public final class r implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public final V.c f10175a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10176b;

    public r(V.g gVar, boolean z3) {
        this.f10175a = gVar;
        this.f10176b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return z2.h.a(this.f10175a, rVar.f10175a) && this.f10176b == rVar.f10176b;
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        int max;
        int max2;
        AbstractC1103Q abstractC1103Q;
        boolean isEmpty = list.isEmpty();
        C0971w c0971w = C0971w.f9166h;
        if (isEmpty) {
            return interfaceC1096J.C(O0.a.j(j3), O0.a.i(j3), c0971w, C1175n.f10159k);
        }
        long a3 = this.f10176b ? j3 : O0.a.a(j3, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            InterfaceC1093G interfaceC1093G = (InterfaceC1093G) list.get(0);
            Object p3 = interfaceC1093G.p();
            C1174m c1174m = p3 instanceof C1174m ? (C1174m) p3 : null;
            if (c1174m == null || !c1174m.f10157v) {
                AbstractC1103Q a4 = interfaceC1093G.a(a3);
                max = Math.max(O0.a.j(j3), a4.f9834h);
                max2 = Math.max(O0.a.i(j3), a4.f9835i);
                abstractC1103Q = a4;
            } else {
                int j4 = O0.a.j(j3);
                int i2 = O0.a.i(j3);
                int j5 = O0.a.j(j3);
                int i3 = O0.a.i(j3);
                if (j5 < 0 || i3 < 0) {
                    K1.f.R("width(" + j5 + ") and height(" + i3 + ") must be >= 0");
                    throw null;
                }
                max = j4;
                max2 = i2;
                abstractC1103Q = interfaceC1093G.a(B1.C.L(j5, j5, i3, i3));
            }
            return interfaceC1096J.C(max, max2, c0971w, new C1178q(abstractC1103Q, interfaceC1093G, interfaceC1096J, max, max2, this));
        }
        AbstractC1103Q[] abstractC1103QArr = new AbstractC1103Q[list.size()];
        z2.q qVar = new z2.q();
        qVar.f11907h = O0.a.j(j3);
        z2.q qVar2 = new z2.q();
        qVar2.f11907h = O0.a.i(j3);
        int size = list.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) list.get(i4);
            Object p4 = interfaceC1093G2.p();
            C1174m c1174m2 = p4 instanceof C1174m ? (C1174m) p4 : null;
            if (c1174m2 == null || !c1174m2.f10157v) {
                AbstractC1103Q a5 = interfaceC1093G2.a(a3);
                abstractC1103QArr[i4] = a5;
                qVar.f11907h = Math.max(qVar.f11907h, a5.f9834h);
                qVar2.f11907h = Math.max(qVar2.f11907h, a5.f9835i);
            } else {
                z3 = true;
            }
        }
        if (z3) {
            int i5 = qVar.f11907h;
            int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
            int i7 = qVar2.f11907h;
            long b3 = B1.C.b(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                InterfaceC1093G interfaceC1093G3 = (InterfaceC1093G) list.get(i8);
                Object p5 = interfaceC1093G3.p();
                C1174m c1174m3 = p5 instanceof C1174m ? (C1174m) p5 : null;
                if (c1174m3 != null && c1174m3.f10157v) {
                    abstractC1103QArr[i8] = interfaceC1093G3.a(b3);
                }
            }
        }
        return interfaceC1096J.C(qVar.f11907h, qVar2.f11907h, c0971w, new H.S(abstractC1103QArr, list, interfaceC1096J, qVar, qVar2, this, 1));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10176b) + (this.f10175a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f10175a + ", propagateMinConstraints=" + this.f10176b + ')';
    }
}
