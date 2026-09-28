package J;

import M2.InterfaceC0343g;
import m2.C0880v;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class S0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f4085l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4086m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1078i f4087n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g f4088o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(InterfaceC1078i interfaceC1078i, InterfaceC0343g interfaceC0343g, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f4087n = interfaceC1078i;
        this.f4088o = interfaceC0343g;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((S0) m((C0284p0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        S0 s02 = new S0(this.f4087n, this.f4088o, interfaceC1073d);
        s02.f4086m = obj;
        return s02;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f4085l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0284p0 c0284p0 = (C0284p0) this.f4086m;
            C1079j c1079j = C1079j.f9784h;
            InterfaceC1078i interfaceC1078i = this.f4087n;
            boolean a3 = z2.h.a(interfaceC1078i, c1079j);
            InterfaceC0343g interfaceC0343g = this.f4088o;
            if (a3) {
                Q0 q0 = new Q0(c0284p0, 0);
                this.f4085l = 1;
                if (interfaceC0343g.b(q0, this) == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                R0 r02 = new R0(interfaceC0343g, c0284p0, null);
                this.f4085l = 2;
                if (J2.B.z(interfaceC1078i, r02, this) == enumC1145a) {
                    return enumC1145a;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return C0880v.f8657a;
    }
}
