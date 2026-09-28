package C0;

import java.util.ArrayList;
import n2.AbstractC0963o;

/* loaded from: classes.dex */
public final class p extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f531i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q1.e f532j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Q1.e eVar, int i2) {
        super(0);
        this.f531i = i2;
        this.f532j = eVar;
    }

    @Override // y2.a
    public final Object c() {
        Object obj;
        s sVar;
        Object obj2;
        s sVar2;
        switch (this.f531i) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f532j.f5281e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float c3 = ((r) obj3).f540a.c();
                    int u3 = AbstractC0963o.u(arrayList);
                    int i2 = 1;
                    if (1 <= u3) {
                        while (true) {
                            Object obj4 = arrayList.get(i2);
                            float c4 = ((r) obj4).f540a.c();
                            if (Float.compare(c3, c4) < 0) {
                                obj3 = obj4;
                                c3 = c4;
                            }
                            if (i2 != u3) {
                                i2++;
                            }
                        }
                    }
                    obj = obj3;
                }
                r rVar = (r) obj;
                return Float.valueOf((rVar == null || (sVar = rVar.f540a) == null) ? 0.0f : sVar.c());
            default:
                ArrayList arrayList2 = (ArrayList) this.f532j.f5281e;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float a3 = ((r) obj5).f540a.a();
                    int u4 = AbstractC0963o.u(arrayList2);
                    int i3 = 1;
                    if (1 <= u4) {
                        while (true) {
                            Object obj6 = arrayList2.get(i3);
                            float a4 = ((r) obj6).f540a.a();
                            if (Float.compare(a3, a4) < 0) {
                                obj5 = obj6;
                                a3 = a4;
                            }
                            if (i3 != u4) {
                                i3++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                r rVar2 = (r) obj2;
                return Float.valueOf((rVar2 == null || (sVar2 = rVar2.f540a) == null) ? 0.0f : sVar2.a());
        }
    }
}
