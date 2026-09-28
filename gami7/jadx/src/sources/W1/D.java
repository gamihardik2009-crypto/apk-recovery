package W1;

import J.C0266g0;
import J.W0;
import java.util.List;
import m2.C0880v;
import t.C1213h;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements y2.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5918h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5919i;

    public /* synthetic */ D(int i2, Object obj) {
        this.f5918h = i2;
        this.f5919i = obj;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f5918h) {
            case 0:
                ((Boolean) obj).booleanValue();
                y2.a aVar = (y2.a) this.f5919i;
                z2.h.f(aVar, "$onToggle");
                aVar.c();
                break;
            case 1:
                C1213h c1213h = (C1213h) obj;
                W0 w02 = (W0) this.f5919i;
                z2.h.f(w02, "$failedSchedules$delegate");
                z2.h.f(c1213h, "$this$LazyColumn");
                List list = (List) w02.getValue();
                c1213h.r(list.size(), new w(new P1.a(5), list, 4), new D.O(9, list), new R.a(-632812321, new Y1.m(2, list), true));
                break;
            default:
                float floatValue = ((Float) obj).floatValue();
                C0266g0 c0266g0 = (C0266g0) this.f5919i;
                z2.h.f(c0266g0, "$smsInterval$delegate");
                c0266g0.h(floatValue);
                break;
        }
        return C0880v.f8657a;
    }
}
