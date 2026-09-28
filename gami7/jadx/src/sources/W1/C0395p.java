package W1;

import J.InterfaceC0258c0;
import m2.C0880v;

/* renamed from: W1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0395p implements y2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6066h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6067i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6068j;

    public /* synthetic */ C0395p(InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, int i2) {
        this.f6066h = i2;
        this.f6067i = interfaceC0258c0;
        this.f6068j = interfaceC0258c02;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f6066h) {
            case 0:
                InterfaceC0258c0 interfaceC0258c0 = this.f6067i;
                z2.h.f(interfaceC0258c0, "$showAddEditDialog$delegate");
                InterfaceC0258c0 interfaceC0258c02 = this.f6068j;
                z2.h.f(interfaceC0258c02, "$clientToEdit$delegate");
                interfaceC0258c0.setValue(Boolean.FALSE);
                interfaceC0258c02.setValue(null);
                break;
            default:
                InterfaceC0258c0 interfaceC0258c03 = this.f6067i;
                z2.h.f(interfaceC0258c03, "$showAddDialog$delegate");
                InterfaceC0258c0 interfaceC0258c04 = this.f6068j;
                z2.h.f(interfaceC0258c04, "$templateToEdit$delegate");
                interfaceC0258c03.setValue(Boolean.FALSE);
                interfaceC0258c04.setValue(null);
                break;
        }
        return C0880v.f8657a;
    }
}
