package S;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends z2.i implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final d f5548j = new d(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f5549k = new d(2, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5550i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i3) {
        super(i2);
        this.f5550i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f5550i) {
            case 0:
                h hVar = (h) obj2;
                Map map = hVar.f5562a;
                z2.h.f(map, "<this>");
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                for (f fVar : hVar.f5563b.values()) {
                    if (fVar.f5555b) {
                        Map d3 = fVar.f5556c.d();
                        boolean isEmpty = d3.isEmpty();
                        Object obj3 = fVar.f5554a;
                        if (isEmpty) {
                            linkedHashMap.remove(obj3);
                        } else {
                            linkedHashMap.put(obj3, d3);
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return null;
                }
                return linkedHashMap;
            default:
                return obj2;
        }
    }
}
