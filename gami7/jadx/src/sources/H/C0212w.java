package H;

import java.util.List;
import java.util.NoSuchElementException;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.AbstractC1114c;
import r0.C1125n;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import s.InterfaceC1169h;
import s.InterfaceC1171j;

/* renamed from: H.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212w implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f3239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1169h f3240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1171j f3241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3242d;

    public C0212w(float f3, InterfaceC1169h interfaceC1169h, InterfaceC1171j interfaceC1171j, int i2) {
        this.f3239a = f3;
        this.f3240b = interfaceC1169h;
        this.f3241c = interfaceC1171j;
        this.f3242d = i2;
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        int h2;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1093G interfaceC1093G = (InterfaceC1093G) list.get(i2);
            if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G), "navigationIcon")) {
                AbstractC1103Q a3 = interfaceC1093G.a(O0.a.a(j3, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) list.get(i3);
                    if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G2), "actionIcons")) {
                        AbstractC1103Q a4 = interfaceC1093G2.a(O0.a.a(j3, 0, 0, 0, 0, 14));
                        if (O0.a.h(j3) == Integer.MAX_VALUE) {
                            h2 = O0.a.h(j3);
                        } else {
                            h2 = (O0.a.h(j3) - a3.f9834h) - a4.f9834h;
                            if (h2 < 0) {
                                h2 = 0;
                            }
                        }
                        int i4 = h2;
                        int size3 = list.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            InterfaceC1093G interfaceC1093G3 = (InterfaceC1093G) list.get(i5);
                            if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G3), "title")) {
                                AbstractC1103Q a5 = interfaceC1093G3.a(O0.a.a(j3, 0, i4, 0, 0, 12));
                                C1125n c1125n = AbstractC1114c.f9859b;
                                int d02 = a5.d0(c1125n) != Integer.MIN_VALUE ? a5.d0(c1125n) : 0;
                                float f3 = this.f3239a;
                                int D3 = Float.isNaN(f3) ? 0 : B2.a.D(f3);
                                return interfaceC1096J.C(O0.a.h(j3), D3, C0971w.f9166h, new C0206v(a3, D3, a5, this.f3240b, j3, a4, interfaceC1096J, this.f3241c, this.f3242d, d02));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
