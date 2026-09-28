package M2;

import q2.InterfaceC1073d;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class K implements b0, InterfaceC0343g, N2.w {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0 f4811h;

    public K(d0 d0Var) {
        this.f4811h = d0Var;
    }

    @Override // M2.InterfaceC0343g
    public final Object b(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        return this.f4811h.b(interfaceC0344h, interfaceC1073d);
    }

    @Override // N2.w
    public final InterfaceC0343g c(InterfaceC1078i interfaceC1078i, int i2, int i3) {
        return (((i2 < 0 || i2 >= 2) && i2 != -2) || i3 != 2) ? P.m(this, interfaceC1078i, i2, i3) : this;
    }

    @Override // M2.b0
    public final Object getValue() {
        return this.f4811h.getValue();
    }
}
