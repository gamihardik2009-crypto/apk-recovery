package Y1;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class p extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f6341l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6342m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H f6343n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(H h2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6343n = h2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((p) m((R1.a) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        p pVar = new p(this.f6343n, interfaceC1073d);
        pVar.f6342m = obj;
        return pVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f6341l;
        if (i2 == 0) {
            C1.y.J(obj);
            R1.a aVar = (R1.a) this.f6342m;
            if (aVar != null && aVar.f5472g) {
                this.f6341l = 1;
                if (H.f(this.f6343n, aVar, this) == enumC1145a) {
                    return enumC1145a;
                }
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
