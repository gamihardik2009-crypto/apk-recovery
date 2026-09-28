package S;

import B.y;
import a.AbstractC0423a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n2.AbstractC0963o;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f5568a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5569b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5570c;

    public k(Map map, y2.c cVar) {
        this.f5568a = cVar;
        this.f5569b = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
        this.f5570c = new LinkedHashMap();
    }

    @Override // S.j
    public final boolean c(Object obj) {
        return ((Boolean) this.f5568a.l(obj)).booleanValue();
    }

    @Override // S.j
    public final Map d() {
        LinkedHashMap linkedHashMap = this.f5569b;
        z2.h.f(linkedHashMap, "<this>");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : this.f5570c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object c3 = ((y2.a) list.get(0)).c();
                if (c3 == null) {
                    continue;
                } else {
                    if (!c(c3)) {
                        throw new IllegalStateException(AbstractC0423a.K(c3).toString());
                    }
                    linkedHashMap2.put(str, AbstractC0963o.t(c3));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Object c4 = ((y2.a) list.get(i2)).c();
                    if (c4 != null && !c(c4)) {
                        throw new IllegalStateException(AbstractC0423a.K(c4).toString());
                    }
                    arrayList.add(c4);
                }
                linkedHashMap2.put(str, arrayList);
            }
        }
        return linkedHashMap2;
    }

    @Override // S.j
    public final Object e(String str) {
        LinkedHashMap linkedHashMap = this.f5569b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // S.j
    public final K1.m f(String str, y yVar) {
        int length = str.length();
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z3 = true;
                break;
            }
            if (!B2.a.w(str.charAt(i2))) {
                break;
            }
            i2++;
        }
        if (!(!z3)) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        LinkedHashMap linkedHashMap = this.f5570c;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(str, obj);
        }
        ((List) obj).add(yVar);
        return new K1.m(this, str, yVar);
    }
}
