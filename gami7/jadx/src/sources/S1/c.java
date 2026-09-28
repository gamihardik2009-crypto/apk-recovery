package S1;

import J.InterfaceC0258c0;
import J2.B;
import W1.K;
import W1.P;
import Y1.H;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Q;
import m2.C0880v;
import n1.E;
import n1.w;
import n1.y;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements y2.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5600h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5601i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5602j;

    public /* synthetic */ c(Object obj, int i2, Object obj2) {
        this.f5600h = i2;
        this.f5601i = obj;
        this.f5602j = obj2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f5600h) {
            case 0:
                w wVar = (w) obj;
                y yVar = (y) this.f5601i;
                z2.h.f(yVar, "$navController");
                H h2 = (H) this.f5602j;
                z2.h.f(h2, "$homeViewModel");
                z2.h.f(wVar, "$this$NavHost");
                E.f(wVar, h.f5613d.f5618a, new R.a(-1653666210, new e(yVar, h2, 0), true));
                E.f(wVar, g.f5612d.f5618a, new R.a(-253636921, new f(yVar, 0), true));
                E.f(wVar, l.f5617d.f5618a, new R.a(-1005186074, new f(yVar, 1), true));
                E.f(wVar, i.f5614d.f5618a, b.f5598a);
                E.f(wVar, k.f5616d.f5618a, new R.a(1786682916, new e(yVar, h2, 1), true));
                E.f(wVar, j.f5615d.f5618a, b.f5599b);
                break;
            case 1:
                Uri uri = (Uri) obj;
                P p3 = (P) this.f5601i;
                z2.h.f(p3, "$viewModel");
                Context context = (Context) this.f5602j;
                z2.h.f(context, "$context");
                if (uri != null) {
                    B.r(Q.j(p3), null, 0, new K(context, uri, p3, null), 3);
                }
                break;
            case 2:
                String str = (String) obj;
                InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) this.f5601i;
                z2.h.f(interfaceC0258c0, "$phone$delegate");
                InterfaceC0258c0 interfaceC0258c02 = (InterfaceC0258c0) this.f5602j;
                z2.h.f(interfaceC0258c02, "$error$delegate");
                z2.h.f(str, "it");
                interfaceC0258c0.setValue(str);
                interfaceC0258c02.setValue(null);
                break;
            case 3:
                String str2 = (String) obj;
                P p4 = (P) this.f5601i;
                z2.h.f(p4, "$viewModel");
                InterfaceC0258c0 interfaceC0258c03 = (InterfaceC0258c0) this.f5602j;
                z2.h.f(interfaceC0258c03, "$searchQuery$delegate");
                z2.h.f(str2, "it");
                interfaceC0258c03.setValue(str2);
                p4.f5960c.k(str2);
                break;
            case 4:
                String str3 = (String) obj;
                a2.l lVar = (a2.l) this.f5601i;
                z2.h.f(lVar, "$viewModel");
                InterfaceC0258c0 interfaceC0258c04 = (InterfaceC0258c0) this.f5602j;
                z2.h.f(interfaceC0258c04, "$searchQuery$delegate");
                z2.h.f(str3, "it");
                interfaceC0258c04.setValue(str3);
                lVar.f6528d.k(str3);
                break;
            default:
                ((Boolean) obj).getClass();
                d2.n nVar = (d2.n) this.f5601i;
                z2.h.f(nVar, "$viewModel");
                R1.e eVar = (R1.e) this.f5602j;
                z2.h.f(eVar, "$template");
                B.r(Q.j(nVar), null, 0, new d2.l(nVar, eVar, null), 3);
                break;
        }
        return C0880v.f8657a;
    }
}
