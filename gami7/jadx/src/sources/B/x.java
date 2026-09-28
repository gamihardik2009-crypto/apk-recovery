package B;

import I0.InterfaceC0252i;

/* loaded from: classes.dex */
public final class x implements InterfaceC0252i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0252i[] f236a;

    public x(InterfaceC0252i[] interfaceC0252iArr) {
        this.f236a = interfaceC0252iArr;
    }

    @Override // I0.InterfaceC0252i
    public final void a(I0.j jVar) {
        for (InterfaceC0252i interfaceC0252i : this.f236a) {
            interfaceC0252i.a(jVar);
        }
    }
}
