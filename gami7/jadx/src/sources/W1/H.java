package W1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m2.C0865g;
import m2.C0880v;
import n2.AbstractC0961m;
import n2.C0970v;
import n2.C0971w;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class H extends AbstractC1204i implements y2.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5929l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5930m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f5931n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(int i2, InterfaceC1073d interfaceC1073d, int i3) {
        super(i2, interfaceC1073d);
        this.f5929l = i3;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f5929l) {
            case 0:
                H h2 = new H(3, (InterfaceC1073d) obj3, 0);
                h2.f5931n = (List) obj;
                h2.f5930m = (String) obj2;
                return h2.p(C0880v.f8657a);
            case 1:
                H h3 = new H(3, (InterfaceC1073d) obj3, 1);
                h3.f5930m = (String) obj;
                h3.f5931n = (R1.c) obj2;
                return h3.p(C0880v.f8657a);
            default:
                H h4 = new H(3, (InterfaceC1073d) obj3, 2);
                h4.f5931n = (List) obj;
                h4.f5930m = (List) obj2;
                return h4.p(C0880v.f8657a);
        }
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        switch (this.f5929l) {
            case 0:
                C1.y.J(obj);
                List list = (List) this.f5931n;
                String str = (String) this.f5930m;
                if (str.length() == 0) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    U u3 = (U) obj2;
                    if (H2.l.O(u3.f6002a, str, true) || H2.l.O(u3.f6003b, str, false)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 1:
                C1.y.J(obj);
                return new C0865g((String) this.f5930m, (R1.c) this.f5931n);
            default:
                C1.y.J(obj);
                List<R1.g> list2 = (List) this.f5931n;
                List list3 = (List) this.f5930m;
                if (list3.isEmpty()) {
                    return C0971w.f9166h;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = list3.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C0970v c0970v = C0970v.f9165h;
                    if (!hasNext) {
                        for (R1.g gVar : list2) {
                            String str2 = gVar.f5506a.f5504i;
                            List list4 = (List) linkedHashMap.get(str2);
                            if (list4 == null) {
                                list4 = c0970v;
                            }
                            linkedHashMap.put(str2, AbstractC0961m.Q(list4, gVar));
                        }
                        return linkedHashMap;
                    }
                    linkedHashMap.put((String) it.next(), c0970v);
                }
        }
    }
}
