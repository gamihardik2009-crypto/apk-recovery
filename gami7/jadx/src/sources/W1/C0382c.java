package W1;

import J.InterfaceC0258c0;
import J.W0;
import android.content.Context;
import java.util.List;
import m2.C0880v;
import t.C1213h;

/* renamed from: W1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0382c implements y2.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6015h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6016i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6017j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ W0 f6018k;

    public /* synthetic */ C0382c(W0 w02, W0 w03, P p3) {
        this.f6017j = w02;
        this.f6018k = w03;
        this.f6016i = p3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f6015h) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                P p3 = (P) this.f6016i;
                z2.h.f(p3, "$viewModel");
                Context context = (Context) this.f6017j;
                z2.h.f(context, "$context");
                InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) this.f6018k;
                z2.h.f(interfaceC0258c0, "$showContactPicker$delegate");
                if (booleanValue) {
                    J2.B.r(androidx.lifecycle.Q.j(p3), null, 0, new M(p3, context, null), 3);
                    interfaceC0258c0.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                C1213h c1213h = (C1213h) obj;
                W0 w02 = (W0) this.f6017j;
                z2.h.f(w02, "$contacts$delegate");
                W0 w03 = this.f6018k;
                z2.h.f(w03, "$selectedPhones$delegate");
                P p4 = (P) this.f6016i;
                z2.h.f(p4, "$viewModel");
                z2.h.f(c1213h, "$this$LazyColumn");
                List list = (List) w02.getValue();
                c1213h.r(list.size(), new w(new P1.a(2), list, 1), new D.O(5, list), new R.a(-632812321, new B(list, w03, p4, 0), true));
                break;
            default:
                C1213h c1213h2 = (C1213h) obj;
                List list2 = (List) this.f6016i;
                z2.h.f(list2, "$statuses");
                InterfaceC0258c0 interfaceC0258c02 = (InterfaceC0258c0) this.f6018k;
                z2.h.f(interfaceC0258c02, "$selectedStatus$delegate");
                a2.l lVar = (a2.l) this.f6017j;
                z2.h.f(lVar, "$viewModel");
                z2.h.f(c1213h2, "$this$LazyRow");
                c1213h2.r(list2.size(), null, new D.O(7, list2), new R.a(-632812321, new B(list2, interfaceC0258c02, lVar, 1), true));
                break;
        }
        return C0880v.f8657a;
    }

    public /* synthetic */ C0382c(P p3, Context context, InterfaceC0258c0 interfaceC0258c0) {
        this.f6016i = p3;
        this.f6017j = context;
        this.f6018k = interfaceC0258c0;
    }

    public /* synthetic */ C0382c(List list, InterfaceC0258c0 interfaceC0258c0, a2.l lVar) {
        this.f6016i = list;
        this.f6018k = interfaceC0258c0;
        this.f6017j = lVar;
    }
}
