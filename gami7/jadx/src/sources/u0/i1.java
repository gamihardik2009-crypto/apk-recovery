package u0;

import B.C0002c;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class i1 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11062l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M2.b0 f11063m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ B0 f11064n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(M2.b0 b0Var, B0 b02, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11063m = b0Var;
        this.f11064n = b02;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((i1) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
        return EnumC1145a.f10026h;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new i1(this.f11063m, this.f11064n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11062l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0002c c0002c = new C0002c(2, this.f11064n);
            this.f11062l = 1;
            if (this.f11063m.b(c0002c, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        throw new J2.r();
    }
}
