package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import n0.C0918A;
import n0.EnumC0931j;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1203h;

/* loaded from: classes.dex */
public final class X0 extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public int f9521j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f9522k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f9523l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.c f9524m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.c f9525n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z2.s f9526o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1006a0 f9527p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(InterfaceC0328z interfaceC0328z, y2.c cVar, y2.c cVar2, z2.s sVar, C1006a0 c1006a0, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9523l = interfaceC0328z;
        this.f9524m = cVar;
        this.f9525n = cVar2;
        this.f9526o = sVar;
        this.f9527p = c1006a0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((X0) m((C0918A) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        X0 x02 = new X0(this.f9523l, this.f9524m, this.f9525n, this.f9526o, this.f9527p, interfaceC1073d);
        x02.f9522k = obj;
        return x02;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9521j;
        if (i2 == 0) {
            C1.y.J(obj);
            C0918A c0918a = (C0918A) this.f9522k;
            this.f9521j = 1;
            obj = b1.e(c0918a, EnumC0931j.f8947i, this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        n0.r rVar = (n0.r) obj;
        C0880v c0880v = C0880v.f8657a;
        InterfaceC0328z interfaceC0328z = this.f9523l;
        C1006a0 c1006a0 = this.f9527p;
        if (rVar != null) {
            rVar.a();
            J2.B.r(interfaceC0328z, null, 0, new V0(c1006a0, null), 3);
            this.f9524m.l(new b0.c(rVar.f8959c));
            return c0880v;
        }
        J2.B.r(interfaceC0328z, null, 0, new W0(c1006a0, null), 3);
        y2.c cVar = this.f9525n;
        if (cVar == null) {
            return null;
        }
        cVar.l(new b0.c(((n0.r) this.f9526o.f11909h).f8959c));
        return c0880v;
    }
}
