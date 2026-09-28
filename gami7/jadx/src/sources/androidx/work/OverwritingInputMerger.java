package androidx.work;

import B.F;
import B1.h;
import B1.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends k {
    @Override // B1.k
    public final h a(ArrayList arrayList) {
        F f3 = new F(1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((h) it.next()).f293a);
            z2.h.e(unmodifiableMap, "input.keyValueMap");
            linkedHashMap.putAll(unmodifiableMap);
        }
        f3.C(linkedHashMap);
        h hVar = new h((HashMap) f3.f165i);
        h.b(hVar);
        return hVar;
    }
}
