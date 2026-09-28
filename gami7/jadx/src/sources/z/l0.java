package z;

import J.C0257c;
import p.InterfaceC1047v0;
import q2.InterfaceC1073d;

/* loaded from: classes.dex */
public final class l0 implements InterfaceC1047v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1047v0 f11723a;

    /* renamed from: b, reason: collision with root package name */
    public final J.F f11724b;

    /* renamed from: c, reason: collision with root package name */
    public final J.F f11725c;

    public l0(InterfaceC1047v0 interfaceC1047v0, n0 n0Var) {
        this.f11723a = interfaceC1047v0;
        this.f11724b = C0257c.F(new k0(n0Var, 1));
        this.f11725c = C0257c.F(new k0(n0Var, 0));
    }

    @Override // p.InterfaceC1047v0
    public final boolean a() {
        return ((Boolean) this.f11724b.getValue()).booleanValue();
    }

    @Override // p.InterfaceC1047v0
    public final float b(float f3) {
        return this.f11723a.b(f3);
    }

    @Override // p.InterfaceC1047v0
    public final boolean c() {
        return ((Boolean) this.f11725c.getValue()).booleanValue();
    }

    @Override // p.InterfaceC1047v0
    public final boolean d() {
        return this.f11723a.d();
    }

    @Override // p.InterfaceC1047v0
    public final Object e(n.c0 c0Var, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        return this.f11723a.e(c0Var, eVar, interfaceC1073d);
    }
}
