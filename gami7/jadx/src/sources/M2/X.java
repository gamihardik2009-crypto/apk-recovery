package M2;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class X extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f4844l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4845m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b0 f4846n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(b0 b0Var, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f4846n = b0Var;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((X) m((InterfaceC0344h) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
        return EnumC1145a.f10026h;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        X x2 = new X(this.f4846n, interfaceC1073d);
        x2.f4845m = obj;
        return x2;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f4844l;
        if (i2 == 0) {
            C1.y.J(obj);
            D.J j3 = new D.J(new z2.o(), 5, (InterfaceC0344h) this.f4845m);
            this.f4844l = 1;
            if (this.f4846n.b(j3, this) == enumC1145a) {
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
