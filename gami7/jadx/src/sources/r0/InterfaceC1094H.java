package r0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: r0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1094H {
    default int a(t0.Z z3, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = 2;
            arrayList.add(new C1123l((InterfaceC1093G) list.get(i3), i4, i4, 0));
        }
        return f(new C1128q(z3, z3.f10546s.f10403y), arrayList, B1.C.c(i2, 0, 13)).h();
    }

    default int c(t0.Z z3, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = 1;
            arrayList.add(new C1123l((InterfaceC1093G) list.get(i3), i4, i4, 0));
        }
        return f(new C1128q(z3, z3.f10546s.f10403y), arrayList, B1.C.c(0, i2, 7)).f();
    }

    default int d(t0.Z z3, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C1123l((InterfaceC1093G) list.get(i3), 1, 2, 0));
        }
        return f(new C1128q(z3, z3.f10546s.f10403y), arrayList, B1.C.c(i2, 0, 13)).h();
    }

    InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3);

    default int h(t0.Z z3, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C1123l((InterfaceC1093G) list.get(i3), 2, 1, 0));
        }
        return f(new C1128q(z3, z3.f10546s.f10403y), arrayList, B1.C.c(0, i2, 7)).f();
    }
}
