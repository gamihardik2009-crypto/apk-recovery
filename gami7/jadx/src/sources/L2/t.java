package L2;

import J2.AbstractC0304a;
import J2.B;
import J2.C0319p;
import J2.a0;
import J2.g0;
import java.util.concurrent.CancellationException;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class t extends AbstractC0304a implements u, k {

    /* renamed from: k, reason: collision with root package name */
    public final k f4746k;

    public t(InterfaceC1078i interfaceC1078i, g gVar) {
        super(interfaceC1078i, true);
        this.f4746k = gVar;
    }

    @Override // L2.w
    public final K1.i B() {
        return this.f4746k.B();
    }

    @Override // J2.i0
    public final void K(CancellationException cancellationException) {
        this.f4746k.a(cancellationException);
        J(cancellationException);
    }

    @Override // J2.i0, J2.Z
    public final void a(CancellationException cancellationException) {
        Object V2 = V();
        if (V2 instanceof C0319p) {
            return;
        }
        if ((V2 instanceof g0) && ((g0) V2).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new a0(M(), null, this);
        }
        K(cancellationException);
    }

    @Override // J2.AbstractC0304a, J2.i0, J2.Z
    public final boolean b() {
        return super.b();
    }

    @Override // L2.w
    public final Object c(InterfaceC1073d interfaceC1073d) {
        return this.f4746k.c(interfaceC1073d);
    }

    @Override // L2.x
    public final void e(A0.n nVar) {
        this.f4746k.e(nVar);
    }

    @Override // L2.w
    public final a iterator() {
        return this.f4746k.iterator();
    }

    @Override // J2.AbstractC0304a
    public final void k0(Throwable th, boolean z3) {
        if (this.f4746k.p(th) || z3) {
            return;
        }
        B.m(th, this.f4381j);
    }

    @Override // J2.AbstractC0304a
    public final void l0(Object obj) {
        this.f4746k.p(null);
    }

    @Override // L2.w
    public final Object m() {
        return this.f4746k.m();
    }

    @Override // L2.x
    public final boolean p(Throwable th) {
        return this.f4746k.p(th);
    }

    @Override // L2.x
    public final Object q(Object obj) {
        return this.f4746k.q(obj);
    }

    @Override // L2.x
    public final Object v(Object obj, InterfaceC1073d interfaceC1073d) {
        return this.f4746k.v(obj, interfaceC1073d);
    }

    @Override // L2.x
    public final boolean w() {
        return this.f4746k.w();
    }

    @Override // L2.w
    public final Object x(InterfaceC1073d interfaceC1073d) {
        return this.f4746k.x(interfaceC1073d);
    }
}
