package W1;

import J.InterfaceC0258c0;
import m2.C0880v;

/* renamed from: W1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0399u implements y2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6084h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6085i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f6086j;

    public /* synthetic */ C0399u(InterfaceC0258c0 interfaceC0258c0, P p3, int i2) {
        this.f6084h = i2;
        this.f6085i = interfaceC0258c0;
        this.f6086j = p3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f6084h) {
            case 0:
                P p3 = this.f6086j;
                z2.h.f(p3, "$viewModel");
                InterfaceC0258c0 interfaceC0258c0 = this.f6085i;
                z2.h.f(interfaceC0258c0, "$showContactPicker$delegate");
                J2.B.r(androidx.lifecycle.Q.j(p3), null, 0, new L(p3, null), 3);
                interfaceC0258c0.setValue(Boolean.FALSE);
                break;
            case 1:
                InterfaceC0258c0 interfaceC0258c02 = this.f6085i;
                z2.h.f(interfaceC0258c02, "$clientToDelete$delegate");
                P p4 = this.f6086j;
                z2.h.f(p4, "$viewModel");
                R1.b bVar = (R1.b) interfaceC0258c02.getValue();
                if (bVar != null) {
                    J2.B.r(androidx.lifecycle.Q.j(p4), null, 0, new I(p4, bVar, null), 3);
                }
                interfaceC0258c02.setValue(null);
                break;
            default:
                InterfaceC0258c0 interfaceC0258c03 = this.f6085i;
                z2.h.f(interfaceC0258c03, "$sourceToDelete$delegate");
                P p5 = this.f6086j;
                z2.h.f(p5, "$viewModel");
                String str = (String) interfaceC0258c03.getValue();
                if (str != null) {
                    J2.B.r(androidx.lifecycle.Q.j(p5), null, 0, new J(p5, str, null), 3);
                }
                interfaceC0258c03.setValue(null);
                break;
        }
        return C0880v.f8657a;
    }

    public /* synthetic */ C0399u(P p3, InterfaceC0258c0 interfaceC0258c0) {
        this.f6084h = 0;
        this.f6086j = p3;
        this.f6085i = interfaceC0258c0;
    }
}
