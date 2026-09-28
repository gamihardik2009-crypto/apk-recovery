package H;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class N3 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1788l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P3 f1789m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n.c0 f1790n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.e f1791o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(P3 p3, n.c0 c0Var, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1789m = p3;
        this.f1790n = c0Var;
        this.f1791o = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((N3) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new N3(this.f1789m, this.f1790n, this.f1791o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1788l;
        P3 p3 = this.f1789m;
        if (i2 == 0) {
            C1.y.J(obj);
            p3.f1908j.setValue(Boolean.TRUE);
            this.f1788l = 1;
            n.f0 f0Var = p3.f1913o;
            f0Var.getClass();
            if (J2.B.e(new n.e0(this.f1790n, f0Var, this.f1791o, p3.f1912n, null), this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        p3.f1908j.setValue(Boolean.FALSE);
        return C0880v.f8657a;
    }
}
