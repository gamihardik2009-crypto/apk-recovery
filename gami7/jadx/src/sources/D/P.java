package D;

import java.util.ArrayList;
import java.util.List;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;

/* loaded from: classes.dex */
public final class P implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public static final P f755a = new P();

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((InterfaceC1093G) list.get(i2)).a(j3));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i3 = 0; i3 < size2; i3++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((AbstractC1103Q) arrayList.get(i3)).f9834h));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((AbstractC1103Q) arrayList.get(i4)).f9835i));
        }
        return interfaceC1096J.C(intValue, num.intValue(), C0971w.f9166h, new O(0, arrayList));
    }
}
