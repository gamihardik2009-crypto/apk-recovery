package P1;

import J.InterfaceC0258c0;
import J2.B;
import W1.U;
import androidx.lifecycle.Q;
import c.C0556f;
import m2.C0880v;
import n1.y;
import n2.AbstractC0948C;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements y2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5239h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5240i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5241j;

    public /* synthetic */ f(Object obj, int i2, Object obj2) {
        this.f5239h = i2;
        this.f5240i = obj;
        this.f5241j = obj2;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f5239h) {
            case 0:
                y yVar = (y) this.f5240i;
                z2.h.f(yVar, "$navController");
                S1.m mVar = (S1.m) this.f5241j;
                z2.h.f(mVar, "$screen");
                g gVar = new g(yVar, 0);
                String str = mVar.f5618a;
                z2.h.f(str, "route");
                y.l(yVar, str, AbstractC0948C.l(gVar), 4);
                break;
            case 1:
                U u3 = (U) this.f5240i;
                z2.h.f(u3, "$contact");
                y2.a aVar = (y2.a) this.f5241j;
                z2.h.f(aVar, "$onToggle");
                if (!u3.f6004c) {
                    aVar.c();
                }
                break;
            case 2:
                C0556f c0556f = (C0556f) this.f5240i;
                z2.h.f(c0556f, "$csvPickerLauncher");
                InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) this.f5241j;
                z2.h.f(interfaceC0258c0, "$showFabMenu$delegate");
                interfaceC0258c0.setValue(Boolean.FALSE);
                c0556f.R("text/comma-separated-values");
                break;
            case 3:
                String str2 = (String) this.f5240i;
                z2.h.f(str2, "$week");
                InterfaceC0258c0 interfaceC0258c02 = (InterfaceC0258c0) this.f5241j;
                z2.h.f(interfaceC0258c02, "$selectedWeek$delegate");
                interfaceC0258c02.setValue(str2);
                break;
            default:
                InterfaceC0258c0 interfaceC0258c03 = (InterfaceC0258c0) this.f5240i;
                z2.h.f(interfaceC0258c03, "$templateToDelete$delegate");
                d2.n nVar = (d2.n) this.f5241j;
                z2.h.f(nVar, "$viewModel");
                R1.e eVar = (R1.e) interfaceC0258c03.getValue();
                if (eVar != null) {
                    B.r(Q.j(nVar), null, 0, new d2.k(nVar, eVar, null), 3);
                }
                interfaceC0258c03.setValue(null);
                break;
        }
        return C0880v.f8657a;
    }
}
