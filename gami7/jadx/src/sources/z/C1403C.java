package z;

import m2.C0880v;
import n0.C0921D;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: z.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1403C extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11501l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11502m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0 f11503n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D.X f11504o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1403C(a0 a0Var, D.X x2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11503n = a0Var;
        this.f11504o = x2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1403C) m((C0921D) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1403C c1403c = new C1403C(this.f11503n, this.f11504o, interfaceC1073d);
        c1403c.f11502m = obj;
        return c1403c;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11501l;
        if (i2 == 0) {
            C1.y.J(obj);
            C1402B c1402b = new C1402B((C0921D) this.f11502m, this.f11503n, this.f11504o, null);
            this.f11501l = 1;
            if (J2.B.e(c1402b, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return C0880v.f8657a;
    }
}
