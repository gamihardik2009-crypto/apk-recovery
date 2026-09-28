package Y1;

import D.O;
import H.Z3;
import J.InterfaceC0258c0;
import J.W0;
import J2.InterfaceC0328z;
import androidx.lifecycle.Q;
import java.util.List;
import m2.C0880v;
import t.C1213h;

/* renamed from: Y1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0422h implements y2.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6305h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W0 f6306i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6307j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6308k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W0 f6309l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6310m;

    public /* synthetic */ C0422h(W0 w02, d2.n nVar, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, InterfaceC0258c0 interfaceC0258c03) {
        this.f6306i = w02;
        this.f6307j = nVar;
        this.f6308k = interfaceC0258c0;
        this.f6309l = interfaceC0258c02;
        this.f6310m = interfaceC0258c03;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f6305h) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f6307j;
                z2.h.f(interfaceC0328z, "$scope");
                H h2 = (H) this.f6308k;
                z2.h.f(h2, "$viewModel");
                W0 w02 = this.f6306i;
                z2.h.f(w02, "$clientCount$delegate");
                Z3 z3 = (Z3) this.f6310m;
                z2.h.f(z3, "$snackbarHostState");
                W0 w03 = this.f6309l;
                z2.h.f(w03, "$templateCount$delegate");
                if (!booleanValue) {
                    J2.B.r(Q.j(h2), null, 0, new F(h2, false, null), 3);
                } else if (((Number) w02.getValue()).intValue() == 0) {
                    J2.B.r(interfaceC0328z, null, 0, new i(z3, null), 3);
                } else if (((Number) w03.getValue()).intValue() == 0) {
                    J2.B.r(interfaceC0328z, null, 0, new j(z3, null), 3);
                } else {
                    h2.f6271i.k(Boolean.TRUE);
                }
                break;
            default:
                C1213h c1213h = (C1213h) obj;
                W0 w04 = this.f6306i;
                z2.h.f(w04, "$templates$delegate");
                d2.n nVar = (d2.n) this.f6307j;
                z2.h.f(nVar, "$viewModel");
                InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) this.f6308k;
                z2.h.f(interfaceC0258c0, "$templateToEdit$delegate");
                InterfaceC0258c0 interfaceC0258c02 = (InterfaceC0258c0) this.f6309l;
                z2.h.f(interfaceC0258c02, "$showAddDialog$delegate");
                InterfaceC0258c0 interfaceC0258c03 = (InterfaceC0258c0) this.f6310m;
                z2.h.f(interfaceC0258c03, "$templateToDelete$delegate");
                z2.h.f(c1213h, "$this$LazyColumn");
                List list = (List) w04.getValue();
                c1213h.r(list.size(), new W1.w(new P1.a(8), list, 5), new O(10, list), new R.a(-632812321, new d2.h(list, nVar, interfaceC0258c0, interfaceC0258c02, interfaceC0258c03), true));
                break;
        }
        return C0880v.f8657a;
    }

    public /* synthetic */ C0422h(InterfaceC0328z interfaceC0328z, H h2, W0 w02, Z3 z3, W0 w03) {
        this.f6307j = interfaceC0328z;
        this.f6308k = h2;
        this.f6306i = w02;
        this.f6310m = z3;
        this.f6309l = w03;
    }
}
