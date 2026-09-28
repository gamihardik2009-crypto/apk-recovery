package N2;

import M2.InterfaceC0344h;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class G extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5024l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5025m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0344h f5026n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5026n = interfaceC0344h;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((G) m(obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        G g3 = new G(this.f5026n, interfaceC1073d);
        g3.f5025m = obj;
        return g3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5024l;
        if (i2 == 0) {
            C1.y.J(obj);
            Object obj2 = this.f5025m;
            this.f5024l = 1;
            if (this.f5026n.f(obj2, this) == enumC1145a) {
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
