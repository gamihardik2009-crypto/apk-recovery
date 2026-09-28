package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class O0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9478l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.f f9479m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1006a0 f9480n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0.r f9481o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(y2.f fVar, C1006a0 c1006a0, n0.r rVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9479m = fVar;
        this.f9480n = c1006a0;
        this.f9481o = rVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((O0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new O0(this.f9479m, this.f9480n, this.f9481o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9478l;
        if (i2 == 0) {
            C1.y.J(obj);
            b0.c cVar = new b0.c(this.f9481o.f8959c);
            this.f9478l = 1;
            if (this.f9479m.i(this.f9480n, cVar, this) == enumC1145a) {
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
