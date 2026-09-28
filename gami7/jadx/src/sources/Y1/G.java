package Y1;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class G extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f6261l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f6262m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ R1.a f6263n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h2, R1.a aVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6262m = h2;
        this.f6263n = aVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((G) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new G(this.f6262m, this.f6263n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f6261l;
        if (i2 == 0) {
            C1.y.J(obj);
            Q1.p pVar = this.f6262m.f6264b;
            this.f6261l = 1;
            if (pVar.h(this.f6263n, this) == enumC1145a) {
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
