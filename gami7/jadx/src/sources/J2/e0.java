package J2;

import q2.InterfaceC1073d;

/* loaded from: classes.dex */
public final class e0 extends C0311h {

    /* renamed from: p, reason: collision with root package name */
    public final i0 f4390p;

    public e0(InterfaceC1073d interfaceC1073d, C0317n c0317n) {
        super(1, interfaceC1073d);
        this.f4390p = c0317n;
    }

    @Override // J2.C0311h
    public final Throwable p(i0 i0Var) {
        Throwable c3;
        Object V2 = this.f4390p.V();
        return (!(V2 instanceof g0) || (c3 = ((g0) V2).c()) == null) ? V2 instanceof C0319p ? ((C0319p) V2).f4422a : i0Var.i() : c3;
    }

    @Override // J2.C0311h
    public final String y() {
        return "AwaitContinuation";
    }
}
