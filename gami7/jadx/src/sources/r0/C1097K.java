package r0;

import H.C0137k2;
import java.util.ArrayList;
import java.util.List;
import t0.AbstractC1248f;

/* renamed from: r0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097K implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public final C0137k2 f9826a;

    public C1097K(C0137k2 c0137k2) {
        this.f9826a = c0137k2;
    }

    @Override // r0.InterfaceC1094H
    public final int a(t0.Z z3, List list, int i2) {
        ArrayList l3 = AbstractC1248f.l(z3);
        C0137k2 c0137k2 = this.f9826a;
        c0137k2.getClass();
        ArrayList arrayList = new ArrayList(l3.size());
        int size = l3.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list2 = (List) l3.get(i3);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList2.add(new C1123l((InterfaceC1093G) list2.get(i4), 2, 2, 0));
            }
            arrayList.add(arrayList2);
        }
        return c0137k2.a(new C1128q(z3, z3.f10546s.f10403y), arrayList, B1.C.c(i2, 0, 13)).h();
    }

    @Override // r0.InterfaceC1094H
    public final int c(t0.Z z3, List list, int i2) {
        ArrayList l3 = AbstractC1248f.l(z3);
        C0137k2 c0137k2 = this.f9826a;
        c0137k2.getClass();
        ArrayList arrayList = new ArrayList(l3.size());
        int size = l3.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list2 = (List) l3.get(i3);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList2.add(new C1123l((InterfaceC1093G) list2.get(i4), 1, 1, 0));
            }
            arrayList.add(arrayList2);
        }
        return c0137k2.a(new C1128q(z3, z3.f10546s.f10403y), arrayList, B1.C.c(0, i2, 7)).f();
    }

    @Override // r0.InterfaceC1094H
    public final int d(t0.Z z3, List list, int i2) {
        ArrayList l3 = AbstractC1248f.l(z3);
        C0137k2 c0137k2 = this.f9826a;
        c0137k2.getClass();
        ArrayList arrayList = new ArrayList(l3.size());
        int size = l3.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list2 = (List) l3.get(i3);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList2.add(new C1123l((InterfaceC1093G) list2.get(i4), 1, 2, 0));
            }
            arrayList.add(arrayList2);
        }
        return c0137k2.a(new C1128q(z3, z3.f10546s.f10403y), arrayList, B1.C.c(i2, 0, 13)).h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1097K) && z2.h.a(this.f9826a, ((C1097K) obj).f9826a);
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        return this.f9826a.a(interfaceC1096J, AbstractC1248f.l(interfaceC1096J), j3);
    }

    @Override // r0.InterfaceC1094H
    public final int h(t0.Z z3, List list, int i2) {
        ArrayList l3 = AbstractC1248f.l(z3);
        C0137k2 c0137k2 = this.f9826a;
        c0137k2.getClass();
        ArrayList arrayList = new ArrayList(l3.size());
        int size = l3.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list2 = (List) l3.get(i3);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList2.add(new C1123l((InterfaceC1093G) list2.get(i4), 2, 1, 0));
            }
            arrayList.add(arrayList2);
        }
        return c0137k2.a(new C1128q(z3, z3.f10546s.f10403y), arrayList, B1.C.c(0, i2, 7)).f();
    }

    public final int hashCode() {
        return this.f9826a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f9826a + ')';
    }
}
