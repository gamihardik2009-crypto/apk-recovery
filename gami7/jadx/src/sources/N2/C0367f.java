package N2;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: N2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367f extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5040l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5041m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0368g f5042n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0367f(AbstractC0368g abstractC0368g, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5042n = abstractC0368g;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0367f) m((L2.u) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0367f c0367f = new C0367f(this.f5042n, interfaceC1073d);
        c0367f.f5041m = obj;
        return c0367f;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5040l;
        if (i2 == 0) {
            C1.y.J(obj);
            L2.u uVar = (L2.u) this.f5041m;
            this.f5040l = 1;
            if (this.f5042n.f(uVar, this) == enumC1145a) {
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
