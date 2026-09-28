package a0;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424a extends V.n implements InterfaceC0426c {

    /* renamed from: u, reason: collision with root package name */
    public y2.c f6451u;

    /* renamed from: v, reason: collision with root package name */
    public EnumC0441r f6452v;

    @Override // a0.InterfaceC0426c
    public final void D(EnumC0441r enumC0441r) {
        if (z2.h.a(this.f6452v, enumC0441r)) {
            return;
        }
        this.f6452v = enumC0441r;
        this.f6451u.l(enumC0441r);
    }
}
