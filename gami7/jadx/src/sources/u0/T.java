package u0;

import J2.C0311h;
import m2.C0880v;
import n2.AbstractC0948C;
import p.C1007b;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class T extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f10973l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f10974m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U f10975n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f10975n = u3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((T) m((C1319x0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
        return EnumC1145a.f10026h;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        T t3 = new T(this.f10975n, interfaceC1073d);
        t3.f10974m = obj;
        return t3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f10973l;
        if (i2 == 0) {
            C1.y.J(obj);
            C1319x0 c1319x0 = (C1319x0) this.f10974m;
            this.f10974m = c1319x0;
            U u3 = this.f10975n;
            this.f10973l = 1;
            C0311h c0311h = new C0311h(1, AbstractC0948C.i(this));
            c0311h.r();
            I0.A a3 = u3.f10978i;
            I0.t tVar = a3.f3838a;
            tVar.g();
            a3.f3839b.set(new I0.F(a3, tVar));
            c0311h.u(new C1007b(c1319x0, 12, u3));
            if (c0311h.q() == enumC1145a) {
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
