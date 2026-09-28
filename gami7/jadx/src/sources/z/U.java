package z;

import C0.C0018a;
import J2.InterfaceC0328z;
import m2.C0880v;
import n0.C0921D;
import n2.AbstractC0946A;
import p.C1003A;
import p.C1004B;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class U extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11570l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0921D f11571m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0 f11572n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C0921D c0921d, a0 a0Var, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11571m = c0921d;
        this.f11572n = a0Var;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((U) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new U(this.f11571m, this.f11572n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11570l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            this.f11570l = 1;
            a0 a0Var = this.f11572n;
            D.A a3 = new D.A(a0Var, 1);
            W w2 = new W(a0Var, 0);
            W w3 = new W(a0Var, 1);
            C0018a c0018a = new C0018a(19, a0Var);
            float f3 = p.D.f9394a;
            Object e3 = AbstractC0946A.e(this.f11571m, new C1004B(C1003A.f9356i, null, new C0018a(11, a3), c0018a, w3, new A0.v(w2, 4), null), this);
            if (e3 != enumC1145a) {
                e3 = c0880v;
            }
            if (e3 != enumC1145a) {
                e3 = c0880v;
            }
            if (e3 != enumC1145a) {
                e3 = c0880v;
            }
            if (e3 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return c0880v;
    }
}
