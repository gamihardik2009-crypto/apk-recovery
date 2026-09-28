package G1;

import B1.s;
import I1.l;
import J.C0257c;
import K1.o;
import java.util.ArrayList;
import java.util.List;
import n2.AbstractC0961m;
import n2.AbstractC0963o;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f1241a;

    public i(l lVar) {
        z2.h.f(lVar, "trackers");
        H1.a aVar = new H1.a(lVar.f3953a, 0);
        H1.a aVar2 = new H1.a(lVar.f3954b);
        H1.a aVar3 = new H1.a(lVar.f3956d, 4);
        I1.f fVar = lVar.f3955c;
        this.f1241a = AbstractC0963o.v(aVar, aVar2, aVar3, new H1.a(fVar, 2), new H1.a(fVar, 3), new H1.f(fVar), new H1.e(fVar));
    }

    public void a(int i2) {
        List list = this.f1241a;
        if ((!list.isEmpty()) && (((Number) list.get(0)).intValue() == i2 || ((Number) list.get(list.size() - 1)).intValue() == i2)) {
            return;
        }
        int size = list.size();
        list.add(Integer.valueOf(i2));
        while (size > 0) {
            int i3 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) list.get(i3)).intValue();
            if (i2 <= intValue) {
                break;
            }
            list.set(size, Integer.valueOf(intValue));
            size = i3;
        }
        list.set(size, Integer.valueOf(i2));
    }

    public boolean b(o oVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f1241a) {
            H1.d dVar = (H1.d) obj;
            dVar.getClass();
            if (dVar.b(oVar) && dVar.c(dVar.f3424a.a())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            s.d().a(k.f1246a, "Work " + oVar.f4564a + " constrained by " + AbstractC0961m.L(arrayList, null, null, null, f.f1235i, 31));
        }
        return arrayList.isEmpty();
    }

    public int c() {
        int intValue;
        List list = this.f1241a;
        if (!(list.size() > 0)) {
            C0257c.y("Set is empty");
            throw null;
        }
        int intValue2 = ((Number) list.get(0)).intValue();
        while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == intValue2) {
            list.set(0, AbstractC0961m.M(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i2 = 0;
            while (i2 < size2) {
                int intValue3 = ((Number) list.get(i2)).intValue();
                int i3 = (i2 + 1) * 2;
                int i4 = i3 - 1;
                int intValue4 = ((Number) list.get(i4)).intValue();
                if (i3 >= size || (intValue = ((Number) list.get(i3)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        list.set(i2, Integer.valueOf(intValue4));
                        list.set(i4, Integer.valueOf(intValue3));
                        i2 = i4;
                    }
                } else if (intValue > intValue3) {
                    list.set(i2, Integer.valueOf(intValue));
                    list.set(i3, Integer.valueOf(intValue3));
                    i2 = i3;
                }
            }
        }
        return intValue2;
    }

    public i() {
        this.f1241a = new ArrayList();
    }
}
