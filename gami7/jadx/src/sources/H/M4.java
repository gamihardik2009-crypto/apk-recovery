package H;

import java.util.List;
import java.util.NoSuchElementException;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.AbstractC1114c;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;

/* loaded from: classes.dex */
public final class M4 implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1752c;

    public /* synthetic */ M4(Object obj, int i2, Object obj2) {
        this.f1750a = i2;
        this.f1751b = obj;
        this.f1752c = obj2;
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        AbstractC1103Q abstractC1103Q;
        AbstractC1103Q abstractC1103Q2;
        switch (this.f1750a) {
            case 0:
                if (((y2.e) this.f1751b) != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        InterfaceC1093G interfaceC1093G = (InterfaceC1093G) list.get(i2);
                        if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G), "text")) {
                            abstractC1103Q = interfaceC1093G.a(O0.a.a(j3, 0, 0, 0, 0, 11));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                abstractC1103Q = null;
                if (((y2.e) this.f1752c) != null) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) list.get(i3);
                        if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G2), "icon")) {
                            abstractC1103Q2 = interfaceC1093G2.a(j3);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                abstractC1103Q2 = null;
                int max = Math.max(abstractC1103Q != null ? abstractC1103Q.f9834h : 0, abstractC1103Q2 != null ? abstractC1103Q2.f9834h : 0);
                int max2 = Math.max(interfaceC1096J.l((abstractC1103Q == null || abstractC1103Q2 == null) ? O4.f1848a : O4.f1849b), interfaceC1096J.m0(O4.f1853f) + (abstractC1103Q2 != null ? abstractC1103Q2.f9835i : 0) + (abstractC1103Q != null ? abstractC1103Q.f9835i : 0));
                return interfaceC1096J.C(max, max2, C0971w.f9166h, new L4(abstractC1103Q, abstractC1103Q2, interfaceC1096J, max, max2, abstractC1103Q != null ? Integer.valueOf(abstractC1103Q.d0(AbstractC1114c.f9858a)) : null, abstractC1103Q != null ? Integer.valueOf(abstractC1103Q.d0(AbstractC1114c.f9859b)) : null));
            default:
                ((R0.x) this.f1751b).setParentLayoutDirection((O0.k) this.f1752c);
                return interfaceC1096J.C(0, 0, C0971w.f9166h, R0.c.f5391l);
        }
    }
}
