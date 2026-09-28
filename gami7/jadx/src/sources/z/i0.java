package z;

import J.InterfaceC0258c0;
import J2.InterfaceC0328z;
import m2.C0880v;
import p.C1006a0;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class i0 extends AbstractC1204i implements y2.f {

    /* renamed from: l, reason: collision with root package name */
    public int f11704l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ C1006a0 f11705m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ long f11706n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f11707o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f11708p;
    public final /* synthetic */ r.l q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(InterfaceC0328z interfaceC0328z, InterfaceC0258c0 interfaceC0258c0, r.l lVar, InterfaceC1073d interfaceC1073d) {
        super(3, interfaceC1073d);
        this.f11707o = interfaceC0328z;
        this.f11708p = interfaceC0258c0;
        this.q = lVar;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        long j3 = ((b0.c) obj2).f7058a;
        i0 i0Var = new i0(this.f11707o, this.f11708p, this.q, (InterfaceC1073d) obj3);
        i0Var.f11705m = (C1006a0) obj;
        i0Var.f11706n = j3;
        return i0Var.p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11704l;
        InterfaceC0328z interfaceC0328z = this.f11707o;
        if (i2 == 0) {
            C1.y.J(obj);
            C1006a0 c1006a0 = this.f11705m;
            J2.B.r(interfaceC0328z, null, 0, new g0(this.f11708p, this.f11706n, this.q, null), 3);
            this.f11704l = 1;
            obj = c1006a0.b(this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        J2.B.r(interfaceC0328z, null, 0, new h0(this.f11708p, ((Boolean) obj).booleanValue(), this.q, null), 3);
        return C0880v.f8657a;
    }
}
