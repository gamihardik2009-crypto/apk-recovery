package J;

import J2.InterfaceC0328z;
import q2.InterfaceC1078i;

/* renamed from: J.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0284p0 implements InterfaceC0258c0, InterfaceC0328z {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1078i f4179h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f4180i;

    public C0284p0(InterfaceC0258c0 interfaceC0258c0, InterfaceC1078i interfaceC1078i) {
        this.f4179h = interfaceC1078i;
        this.f4180i = interfaceC0258c0;
    }

    @Override // J.W0
    public final Object getValue() {
        return this.f4180i.getValue();
    }

    @Override // J2.InterfaceC0328z
    public final InterfaceC1078i r() {
        return this.f4179h;
    }

    @Override // J.InterfaceC0258c0
    public final void setValue(Object obj) {
        this.f4180i.setValue(obj);
    }
}
