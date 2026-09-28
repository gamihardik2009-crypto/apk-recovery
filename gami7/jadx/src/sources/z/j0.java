package z;

import H.C0227y2;
import J.InterfaceC0258c0;
import J.W0;
import J2.InterfaceC0328z;
import m2.C0880v;
import n0.C0921D;
import p.C1006a0;
import p.L0;
import p.b1;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class j0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11714l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11715m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f11716n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f11717o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r.l f11718p;
    public final /* synthetic */ W0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(InterfaceC0328z interfaceC0328z, InterfaceC0258c0 interfaceC0258c0, r.l lVar, W0 w02, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11716n = interfaceC0328z;
        this.f11717o = interfaceC0258c0;
        this.f11718p = lVar;
        this.q = w02;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((j0) m((C0921D) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        j0 j0Var = new j0(this.f11716n, this.f11717o, this.f11718p, this.q, interfaceC1073d);
        j0Var.f11715m = obj;
        return j0Var;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11714l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            C0921D c0921d = (C0921D) this.f11715m;
            i0 i0Var = new i0(this.f11716n, this.f11717o, this.f11718p, null);
            C0227y2 c0227y2 = new C0227y2(this.q, 2);
            this.f11714l = 1;
            p.N n3 = b1.f9568a;
            Object e3 = J2.B.e(new L0(c0921d, i0Var, c0227y2, new C1006a0(c0921d), null), this);
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
