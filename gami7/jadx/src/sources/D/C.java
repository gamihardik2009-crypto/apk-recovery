package D;

import m2.C0880v;
import n0.C0921D;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class C extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f716l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f717m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.c f718n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(y2.c cVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f718n = cVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C) m((C0921D) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C c3 = new C(this.f718n, interfaceC1073d);
        c3.f717m = obj;
        return c3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f716l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0921D c0921d = (C0921D) this.f717m;
            B b3 = new B(this.f718n, null);
            this.f716l = 1;
            if (c0921d.K0(b3, this) == enumC1145a) {
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
