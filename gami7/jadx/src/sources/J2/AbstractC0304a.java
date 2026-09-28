package J2;

import O2.AbstractC0369a;
import m.AbstractC0837j;
import m2.AbstractC0868j;
import m2.C0880v;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;

/* renamed from: J2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0304a extends i0 implements InterfaceC1073d, InterfaceC0328z {

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC1078i f4381j;

    public AbstractC0304a(InterfaceC1078i interfaceC1078i, boolean z3) {
        super(z3);
        Y((Z) interfaceC1078i.s(C0325w.f4437i));
        this.f4381j = interfaceC1078i.A(this);
    }

    @Override // J2.i0
    public final String M() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // J2.i0
    public final void X(r rVar) {
        B.m(rVar, this.f4381j);
    }

    @Override // J2.i0, J2.Z
    public boolean b() {
        return super.b();
    }

    @Override // J2.i0
    public String b0() {
        return super.b0();
    }

    @Override // J2.i0
    public final void e0(Object obj) {
        if (!(obj instanceof C0319p)) {
            l0(obj);
            return;
        }
        C0319p c0319p = (C0319p) obj;
        Throwable th = c0319p.f4422a;
        c0319p.getClass();
        k0(th, C0319p.f4421b.get(c0319p) != 0);
    }

    public void k0(Throwable th, boolean z3) {
    }

    public void l0(Object obj) {
    }

    public final void m0(int i2, AbstractC0304a abstractC0304a, y2.e eVar) {
        int d3 = AbstractC0837j.d(i2);
        if (d3 == 0) {
            K1.f.P(eVar, abstractC0304a, this);
            return;
        }
        if (d3 != 1) {
            if (d3 == 2) {
                z2.h.f(eVar, "<this>");
                AbstractC0948C.i(AbstractC0948C.g(abstractC0304a, this, eVar)).t(C0880v.f8657a);
                return;
            }
            if (d3 != 3) {
                throw new r();
            }
            try {
                InterfaceC1078i interfaceC1078i = this.f4381j;
                Object l3 = AbstractC0369a.l(interfaceC1078i, null);
                try {
                    z2.v.d(2, eVar);
                    Object j3 = eVar.j(abstractC0304a, this);
                    if (j3 != EnumC1145a.f10026h) {
                        t(j3);
                    }
                } finally {
                    AbstractC0369a.g(interfaceC1078i, l3);
                }
            } catch (Throwable th) {
                t(C1.y.n(th));
            }
        }
    }

    @Override // q2.InterfaceC1073d
    public final InterfaceC1078i n() {
        return this.f4381j;
    }

    @Override // J2.InterfaceC0328z
    public final InterfaceC1078i r() {
        return this.f4381j;
    }

    @Override // q2.InterfaceC1073d
    public final void t(Object obj) {
        Throwable a3 = AbstractC0868j.a(obj);
        if (a3 != null) {
            obj = new C0319p(a3, false);
        }
        Object a02 = a0(obj);
        if (a02 == B.f4346e) {
            return;
        }
        I(a02);
    }
}
