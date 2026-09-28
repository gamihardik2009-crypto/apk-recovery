package H;

import java.util.List;
import java.util.NoSuchElementException;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;

/* loaded from: classes.dex */
public final class D2 implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2.a f1402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2.e f1403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1404c;

    public D2(y2.a aVar, y2.e eVar, boolean z3) {
        this.f1402a = aVar;
        this.f1403b = eVar;
        this.f1404c = z3;
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        Object obj;
        AbstractC1103Q abstractC1103Q;
        AbstractC1103Q abstractC1103Q2;
        D2 d22 = this;
        float floatValue = ((Number) d22.f1402a.c()).floatValue();
        long a3 = O0.a.a(j3, 0, 0, 0, 0, 10);
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            InterfaceC1093G interfaceC1093G = (InterfaceC1093G) list.get(i2);
            if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G), "icon")) {
                AbstractC1103Q a4 = interfaceC1093G.a(a3);
                float f3 = 2;
                int l3 = interfaceC1096J.l(H2.f1566d * f3) + a4.f9834h;
                int D3 = B2.a.D(l3 * floatValue);
                int l4 = interfaceC1096J.l(H2.f1567e * f3) + a4.f9835i;
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) list.get(i3);
                    int i4 = size2;
                    if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G2), "indicatorRipple")) {
                        float f4 = floatValue;
                        if (!(l3 >= 0 && l4 >= 0)) {
                            K1.f.R("width(" + l3 + ") and height(" + l4 + ") must be >= 0");
                            throw null;
                        }
                        float f5 = f3;
                        AbstractC1103Q a5 = interfaceC1093G2.a(B1.C.L(l3, l3, l4, l4));
                        int size3 = list.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                obj = null;
                                break;
                            }
                            Object obj2 = list.get(i5);
                            int i6 = size3;
                            obj = obj2;
                            if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj2), "indicator")) {
                                break;
                            }
                            i5++;
                            size3 = i6;
                        }
                        InterfaceC1093G interfaceC1093G3 = (InterfaceC1093G) obj;
                        if (interfaceC1093G3 == null) {
                            abstractC1103Q = null;
                        } else {
                            if (D3 < 0 || l4 < 0) {
                                K1.f.R("width(" + D3 + ") and height(" + l4 + ") must be >= 0");
                                throw null;
                            }
                            abstractC1103Q = interfaceC1093G3.a(B1.C.L(D3, D3, l4, l4));
                        }
                        y2.e eVar = d22.f1403b;
                        if (eVar != null) {
                            int size4 = list.size();
                            for (int i7 = 0; i7 < size4; i7++) {
                                InterfaceC1093G interfaceC1093G4 = (InterfaceC1093G) list.get(i7);
                                if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G4), "label")) {
                                    abstractC1103Q2 = interfaceC1093G4.a(a3);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        abstractC1103Q2 = null;
                        C0971w c0971w = C0971w.f9166h;
                        if (eVar == null) {
                            int h2 = O0.a.h(j3);
                            int J3 = B1.C.J(j3, interfaceC1096J.l(H2.f1563a));
                            return interfaceC1096J.C(h2, J3, c0971w, new F2(abstractC1103Q, a4, (h2 - a4.f9834h) / 2, (J3 - a4.f9835i) / 2, a5, (h2 - a5.f9834h) / 2, (J3 - a5.f9835i) / 2, h2, J3));
                        }
                        z2.h.c(abstractC1103Q2);
                        float f6 = a4.f9835i;
                        float f7 = H2.f1567e;
                        float P2 = interfaceC1096J.P(f7) + f6;
                        float f8 = H2.f1565c;
                        float P3 = interfaceC1096J.P(f8) + P2 + abstractC1103Q2.f9835i;
                        float x2 = B1.C.x((O0.a.i(j3) - P3) / f5, interfaceC1096J.P(f7));
                        float f9 = (x2 * f5) + P3;
                        boolean z3 = d22.f1404c;
                        float f10 = (1 - f4) * ((z3 ? x2 : (f9 - a4.f9835i) / f5) - x2);
                        float P4 = interfaceC1096J.P(f8) + interfaceC1096J.P(f7) + a4.f9835i + x2;
                        int h3 = O0.a.h(j3);
                        return interfaceC1096J.C(h3, B2.a.D(f9), c0971w, new G2(abstractC1103Q, z3, f4, abstractC1103Q2, (h3 - abstractC1103Q2.f9834h) / 2, P4, f10, a4, (h3 - a4.f9834h) / 2, x2, a5, (h3 - a5.f9834h) / 2, x2 - interfaceC1096J.P(f7), h3, interfaceC1096J));
                    }
                    i3++;
                    d22 = this;
                    size2 = i4;
                    floatValue = floatValue;
                    f3 = f3;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i2++;
            d22 = this;
            floatValue = floatValue;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
