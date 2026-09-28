package N2;

import C0.C0018a;
import M2.InterfaceC0344h;
import m2.AbstractC0868j;
import m2.C0880v;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;
import s2.AbstractC1198c;
import s2.InterfaceC1199d;

/* loaded from: classes.dex */
public final class A extends AbstractC1198c implements InterfaceC0344h {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0344h f5014k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1078i f5015l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5016m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC1078i f5017n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1073d f5018o;

    public A(InterfaceC0344h interfaceC0344h, InterfaceC1078i interfaceC1078i) {
        super(x.f5089h, C1079j.f9784h);
        this.f5014k = interfaceC0344h;
        this.f5015l = interfaceC1078i;
        this.f5016m = ((Number) interfaceC1078i.y(0, z.f5091i)).intValue();
    }

    @Override // M2.InterfaceC0344h
    public final Object f(Object obj, InterfaceC1073d interfaceC1073d) {
        try {
            Object r3 = r(interfaceC1073d, obj);
            return r3 == EnumC1145a.f10026h ? r3 : C0880v.f8657a;
        } catch (Throwable th) {
            this.f5017n = new t(th, interfaceC1073d.n());
            throw th;
        }
    }

    @Override // s2.AbstractC1196a, s2.InterfaceC1199d
    public final InterfaceC1199d k() {
        InterfaceC1073d interfaceC1073d = this.f5018o;
        if (interfaceC1073d instanceof InterfaceC1199d) {
            return (InterfaceC1199d) interfaceC1073d;
        }
        return null;
    }

    @Override // s2.AbstractC1198c, q2.InterfaceC1073d
    public final InterfaceC1078i n() {
        InterfaceC1078i interfaceC1078i = this.f5017n;
        return interfaceC1078i == null ? C1079j.f9784h : interfaceC1078i;
    }

    @Override // s2.AbstractC1196a
    public final StackTraceElement o() {
        return null;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        Throwable a3 = AbstractC0868j.a(obj);
        if (a3 != null) {
            this.f5017n = new t(a3, n());
        }
        InterfaceC1073d interfaceC1073d = this.f5018o;
        if (interfaceC1073d != null) {
            interfaceC1073d.t(obj);
        }
        return EnumC1145a.f10026h;
    }

    @Override // s2.AbstractC1198c, s2.AbstractC1196a
    public final void q() {
        super.q();
    }

    public final Object r(InterfaceC1073d interfaceC1073d, Object obj) {
        InterfaceC1078i n3 = interfaceC1073d.n();
        J2.B.g(n3);
        InterfaceC1078i interfaceC1078i = this.f5017n;
        if (interfaceC1078i != n3) {
            if (interfaceC1078i instanceof t) {
                throw new IllegalStateException(H2.f.N("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((t) interfaceC1078i).f5083h + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) n3.y(0, new C0018a(6, this))).intValue() != this.f5016m) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f5015l + ",\n\t\tbut emission happened in " + n3 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f5017n = n3;
        }
        this.f5018o = interfaceC1073d;
        y2.f fVar = C.f5020a;
        InterfaceC0344h interfaceC0344h = this.f5014k;
        z2.h.d(interfaceC0344h, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object i2 = fVar.i(interfaceC0344h, obj, this);
        if (!z2.h.a(i2, EnumC1145a.f10026h)) {
            this.f5018o = null;
        }
        return i2;
    }
}
