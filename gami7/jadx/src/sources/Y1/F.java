package Y1;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class F extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f6258l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f6259m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f6260n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(H h2, boolean z3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6259m = h2;
        this.f6260n = z3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((F) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new F(this.f6259m, this.f6260n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f6258l;
        H h2 = this.f6259m;
        if (i2 == 0) {
            C1.y.J(obj);
            R1.a aVar = (R1.a) h2.f6270h.f4811h.getValue();
            if (aVar == null) {
                aVar = new R1.a();
            }
            R1.a a3 = R1.a.a(aVar, null, null, false, 0, this.f6260n, false, null, 447);
            this.f6258l = 1;
            if (h2.f6264b.h(a3, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        if (this.f6260n) {
            h2.f6265c.c();
        }
        return C0880v.f8657a;
    }
}
