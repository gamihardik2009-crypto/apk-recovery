package W1;

import J.InterfaceC0258c0;
import androidx.lifecycle.X;
import java.util.regex.Pattern;
import m2.C0880v;

/* renamed from: W1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0396q implements y2.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6069h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6070i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6071j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X f6072k;

    public /* synthetic */ C0396q(X x2, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, int i2) {
        this.f6069h = i2;
        this.f6072k = x2;
        this.f6070i = interfaceC0258c0;
        this.f6071j = interfaceC0258c02;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f6069h) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                P p3 = (P) this.f6072k;
                z2.h.f(p3, "$viewModel");
                InterfaceC0258c0 interfaceC0258c0 = this.f6070i;
                z2.h.f(interfaceC0258c0, "$clientToEdit$delegate");
                InterfaceC0258c0 interfaceC0258c02 = this.f6071j;
                z2.h.f(interfaceC0258c02, "$showAddEditDialog$delegate");
                z2.h.f(str, "name");
                z2.h.f(str2, "phone");
                if (((R1.b) interfaceC0258c0.getValue()) != null) {
                    R1.b bVar = (R1.b) interfaceC0258c0.getValue();
                    z2.h.c(bVar);
                    R1.b a3 = R1.b.a(bVar, str, str2, booleanValue, 185);
                    String str3 = a3.f5477c;
                    if (!H2.l.V(str3)) {
                        Pattern compile = Pattern.compile("[^0-9+]");
                        z2.h.e(compile, "compile(...)");
                        String replaceAll = compile.matcher(str3).replaceAll("");
                        z2.h.e(replaceAll, "replaceAll(...)");
                        J2.B.r(androidx.lifecycle.Q.j(p3), null, 0, new O(p3, a3, replaceAll, null), 3);
                    }
                } else if (!H2.l.V(str2)) {
                    Pattern compile2 = Pattern.compile("[^0-9+]");
                    z2.h.e(compile2, "compile(...)");
                    String replaceAll2 = compile2.matcher(str2).replaceAll("");
                    z2.h.e(replaceAll2, "replaceAll(...)");
                    J2.B.r(androidx.lifecycle.Q.j(p3), null, 0, new G(p3, str, replaceAll2, "", booleanValue, null), 3);
                }
                interfaceC0258c02.setValue(Boolean.FALSE);
                interfaceC0258c0.setValue(null);
                break;
            default:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                d2.n nVar = (d2.n) this.f6072k;
                z2.h.f(nVar, "$viewModel");
                InterfaceC0258c0 interfaceC0258c03 = this.f6070i;
                z2.h.f(interfaceC0258c03, "$templateToEdit$delegate");
                InterfaceC0258c0 interfaceC0258c04 = this.f6071j;
                z2.h.f(interfaceC0258c04, "$showAddDialog$delegate");
                z2.h.f(str4, "title");
                z2.h.f(str5, "greeting");
                z2.h.f(str6, "message");
                if (((R1.e) interfaceC0258c03.getValue()) == null) {
                    J2.B.r(androidx.lifecycle.Q.j(nVar), null, 0, new d2.j(nVar, str4, str5, str6, null), 3);
                } else {
                    R1.e eVar = (R1.e) interfaceC0258c03.getValue();
                    z2.h.c(eVar);
                    J2.B.r(androidx.lifecycle.Q.j(nVar), null, 0, new d2.m(nVar, R1.e.a(eVar, str4, str5, str6, false, 49), null), 3);
                }
                interfaceC0258c04.setValue(Boolean.FALSE);
                interfaceC0258c03.setValue(null);
                break;
        }
        return C0880v.f8657a;
    }
}
