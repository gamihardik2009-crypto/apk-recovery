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
public final class H3 implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P3 f1569a;

    public H3(P3 p3) {
        this.f1569a = p3;
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1093G interfaceC1093G = (InterfaceC1093G) list.get(i2);
            if (androidx.compose.ui.layout.a.a(interfaceC1093G) == EnumC0216w3.f3255h) {
                AbstractC1103Q a3 = interfaceC1093G.a(j3);
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) list.get(i3);
                    if (androidx.compose.ui.layout.a.a(interfaceC1093G2) == EnumC0216w3.f3256i) {
                        AbstractC1103Q a4 = interfaceC1093G2.a(O0.a.a(B1.C.e0(-a3.f9834h, 0, 2, j3), 0, 0, 0, 0, 11));
                        int i4 = a3.f9834h + a4.f9834h;
                        int max = Math.max(a4.f9835i, a3.f9835i);
                        float f3 = a3.f9834h;
                        P3 p3 = this.f1569a;
                        p3.f1907i.h(f3);
                        p3.f1905g.h(i4);
                        return interfaceC1096J.C(i4, max, C0971w.f9166h, new G3(a4, a3.f9834h / 2, (max - a4.f9835i) / 2, a3, B2.a.D(p3.c() * a4.f9834h), (max - a3.f9835i) / 2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
