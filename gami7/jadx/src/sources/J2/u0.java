package J2;

import O2.AbstractC0369a;
import m2.C0865g;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class u0 extends O2.s {

    /* renamed from: l, reason: collision with root package name */
    public final ThreadLocal f4433l;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u0(q2.InterfaceC1073d r3, q2.InterfaceC1078i r4) {
        /*
            r2 = this;
            J2.v0 r0 = J2.v0.f4435h
            q2.g r1 = r4.s(r0)
            if (r1 != 0) goto Ld
            q2.i r0 = r4.A(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f4433l = r0
            q2.i r3 = r3.n()
            q2.e r0 = q2.C1074e.f9782h
            q2.g r3 = r3.s(r0)
            boolean r3 = r3 instanceof J2.AbstractC0324v
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = O2.AbstractC0369a.l(r4, r3)
            O2.AbstractC0369a.g(r4, r3)
            r2.o0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.u0.<init>(q2.d, q2.i):void");
    }

    @Override // O2.s, J2.i0
    public final void I(Object obj) {
        if (this.threadLocalIsSet) {
            C0865g c0865g = (C0865g) this.f4433l.get();
            if (c0865g != null) {
                AbstractC0369a.g((InterfaceC1078i) c0865g.f8646h, c0865g.f8647i);
            }
            this.f4433l.remove();
        }
        Object s3 = B.s(obj);
        InterfaceC1073d interfaceC1073d = this.f5204k;
        InterfaceC1078i n3 = interfaceC1073d.n();
        Object l3 = AbstractC0369a.l(n3, null);
        u0 y3 = l3 != AbstractC0369a.f5170f ? B.y(interfaceC1073d, n3, l3) : null;
        try {
            this.f5204k.t(s3);
        } finally {
            if (y3 == null || y3.n0()) {
                AbstractC0369a.g(n3, l3);
            }
        }
    }

    public final boolean n0() {
        boolean z3 = this.threadLocalIsSet && this.f4433l.get() == null;
        this.f4433l.remove();
        return !z3;
    }

    public final void o0(InterfaceC1078i interfaceC1078i, Object obj) {
        this.threadLocalIsSet = true;
        this.f4433l.set(new C0865g(interfaceC1078i, obj));
    }
}
