package r0;

import java.util.ArrayList;
import java.util.List;
import n2.C0971w;
import t0.AbstractC1234C;

/* renamed from: r0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106U extends AbstractC1234C {

    /* renamed from: b, reason: collision with root package name */
    public static final C1106U f9844b = new C1106U("Undefined intrinsics block and it is required");

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        boolean isEmpty = list.isEmpty();
        C0971w c0971w = C0971w.f9166h;
        if (isEmpty) {
            return interfaceC1096J.C(O0.a.j(j3), O0.a.i(j3), c0971w, C1104S.f9840k);
        }
        if (list.size() == 1) {
            AbstractC1103Q a3 = ((InterfaceC1093G) list.get(0)).a(j3);
            return interfaceC1096J.C(B1.C.K(j3, a3.f9834h), B1.C.J(j3, a3.f9835i), c0971w, new C.h(a3, 8));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((InterfaceC1093G) list.get(i2)).a(j3));
        }
        int size2 = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            AbstractC1103Q abstractC1103Q = (AbstractC1103Q) arrayList.get(i5);
            i3 = Math.max(abstractC1103Q.f9834h, i3);
            i4 = Math.max(abstractC1103Q.f9835i, i4);
        }
        return interfaceC1096J.C(B1.C.K(j3, i3), B1.C.J(j3, i4), c0971w, new D.O(12, arrayList));
    }
}
