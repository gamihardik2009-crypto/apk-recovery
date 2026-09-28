package n;

import J.C0268h0;
import J.C0289s0;
import T.AbstractC0379g;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1126o;
import t0.InterfaceC1264w;

/* loaded from: classes.dex */
public final class x0 extends V.n implements InterfaceC1264w {

    /* renamed from: u, reason: collision with root package name */
    public w0 f8893u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8894v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8895w;

    @Override // t0.InterfaceC1264w
    public final int a(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return this.f8895w ? interfaceC1093G.b0(i2) : interfaceC1093G.b0(Integer.MAX_VALUE);
    }

    @Override // t0.InterfaceC1264w
    public final int b(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return this.f8895w ? interfaceC1093G.b(i2) : interfaceC1093G.b(Integer.MAX_VALUE);
    }

    @Override // t0.InterfaceC1264w
    public final int d(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return this.f8895w ? interfaceC1093G.a0(Integer.MAX_VALUE) : interfaceC1093G.a0(i2);
    }

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        B2.a.k(j3, this.f8895w ? p.X.f9518h : p.X.f9519i);
        AbstractC1103Q a3 = interfaceC1093G.a(O0.a.a(j3, 0, this.f8895w ? O0.a.h(j3) : Integer.MAX_VALUE, 0, this.f8895w ? Integer.MAX_VALUE : O0.a.g(j3), 5));
        int i2 = a3.f9834h;
        int h2 = O0.a.h(j3);
        if (i2 > h2) {
            i2 = h2;
        }
        int i3 = a3.f9835i;
        int g3 = O0.a.g(j3);
        if (i3 > g3) {
            i3 = g3;
        }
        int i4 = a3.f9835i - i3;
        int i5 = a3.f9834h - i2;
        if (!this.f8895w) {
            i4 = i5;
        }
        w0 w0Var = this.f8893u;
        C0268h0 c0268h0 = w0Var.f8886d;
        C0268h0 c0268h02 = w0Var.f8883a;
        c0268h0.h(i4);
        AbstractC0379g c3 = T.s.c();
        y2.c f3 = c3 != null ? c3.f() : null;
        AbstractC0379g d3 = T.s.d(c3);
        try {
            if (c0268h02.g() > i4) {
                c0268h02.h(i4);
            }
            T.s.f(c3, d3, f3);
            this.f8893u.f8884b.h(this.f8895w ? i3 : i2);
            return interfaceC1096J.C(i2, i3, C0971w.f9166h, new C0289s0(i4, 1, this, a3));
        } catch (Throwable th) {
            T.s.f(c3, d3, f3);
            throw th;
        }
    }

    @Override // t0.InterfaceC1264w
    public final int h(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return this.f8895w ? interfaceC1093G.L(Integer.MAX_VALUE) : interfaceC1093G.L(i2);
    }
}
