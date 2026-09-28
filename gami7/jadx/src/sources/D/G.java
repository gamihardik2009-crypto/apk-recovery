package D;

import J.W0;
import java.util.ArrayList;
import java.util.List;
import m.C0843p;
import m2.C0880v;
import n1.C0945f;
import s.AbstractC1166e;
import t.C1213h;

/* loaded from: classes.dex */
public final class G extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f730i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W0 f731j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(W0 w02, int i2) {
        super(0);
        this.f730i = i2;
        this.f731j = w02;
    }

    @Override // y2.a
    public final Object c() {
        W0 w02 = this.f731j;
        switch (this.f730i) {
            case 0:
                return new b0.c(((b0.c) w02.getValue()).f7058a);
            case 1:
                C0843p c0843p = L.f745a;
                return new b0.c(((b0.c) w02.getValue()).f7058a);
            case 2:
                return (Float) w02.getValue();
            case 3:
                y2.a aVar = (y2.a) w02.getValue();
                if (aVar != null) {
                    aVar.c();
                }
                return C0880v.f8657a;
            case 4:
                List list = (List) w02.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (z2.h.a(((C0945f) obj).f9028i.f9087h, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case AbstractC1166e.f10138f /* 5 */:
                return new C1213h((y2.c) w02.getValue());
            case AbstractC1166e.f10136d /* 6 */:
                return new u.h((y2.c) w02.getValue());
            case 7:
                return (v.x) ((y2.a) w02.getValue()).c();
            default:
                Boolean bool = (Boolean) w02.getValue();
                bool.booleanValue();
                return bool;
        }
    }
}
