package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import n0.C0921D;
import n2.AbstractC0946A;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class L0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9459l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9460m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0921D f9461n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.f f9462o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.c f9463p;
    public final /* synthetic */ C1006a0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(C0921D c0921d, y2.f fVar, y2.c cVar, C1006a0 c1006a0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9461n = c0921d;
        this.f9462o = fVar;
        this.f9463p = cVar;
        this.q = c1006a0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((L0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        L0 l02 = new L0(this.f9461n, this.f9462o, this.f9463p, this.q, interfaceC1073d);
        l02.f9460m = obj;
        return l02;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9459l;
        if (i2 == 0) {
            C1.y.J(obj);
            K0 k02 = new K0((InterfaceC0328z) this.f9460m, this.f9462o, this.f9463p, this.q, null);
            this.f9459l = 1;
            if (AbstractC0946A.e(this.f9461n, k02, this) == enumC1145a) {
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
