package W1;

import J.InterfaceC0258c0;
import m2.C0880v;

/* renamed from: W1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397s implements y2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6077h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6078i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6079j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6080k;

    public C0397s(R1.c cVar, a2.l lVar, InterfaceC0258c0 interfaceC0258c0) {
        this.f6077h = 1;
        this.f6079j = cVar;
        this.f6080k = lVar;
        this.f6078i = interfaceC0258c0;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f6077h) {
            case 0:
                this.f6078i.setValue((R1.b) this.f6079j);
                ((InterfaceC0258c0) this.f6080k).setValue(Boolean.TRUE);
                break;
            case 1:
                InterfaceC0258c0 interfaceC0258c0 = this.f6078i;
                R1.c cVar = (R1.c) this.f6079j;
                interfaceC0258c0.setValue(cVar);
                ((a2.l) this.f6080k).f6529e.k(cVar);
                break;
            default:
                this.f6078i.setValue((R1.e) this.f6079j);
                ((InterfaceC0258c0) this.f6080k).setValue(Boolean.TRUE);
                break;
        }
        return C0880v.f8657a;
    }

    public /* synthetic */ C0397s(Object obj, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, int i2) {
        this.f6077h = i2;
        this.f6079j = obj;
        this.f6078i = interfaceC0258c0;
        this.f6080k = interfaceC0258c02;
    }
}
