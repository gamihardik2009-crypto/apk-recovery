package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import n0.C0921D;
import n2.AbstractC0946A;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class Z0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9547l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9548m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0921D f9549n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.f f9550o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.c f9551p;
    public final /* synthetic */ y2.c q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y2.c f9552r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(C0921D c0921d, y2.f fVar, y2.c cVar, y2.c cVar2, y2.c cVar3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9549n = c0921d;
        this.f9550o = fVar;
        this.f9551p = cVar;
        this.q = cVar2;
        this.f9552r = cVar3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((Z0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        Z0 z02 = new Z0(this.f9549n, this.f9550o, this.f9551p, this.q, this.f9552r, interfaceC1073d);
        z02.f9548m = obj;
        return z02;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9547l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f9548m;
            C0921D c0921d = this.f9549n;
            C1006a0 c1006a0 = new C1006a0(c0921d);
            Y0 y02 = new Y0(interfaceC0328z, this.f9550o, this.f9551p, this.q, this.f9552r, c1006a0, null);
            this.f9547l = 1;
            if (AbstractC0946A.e(c0921d, y02, this) == enumC1145a) {
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
