package p;

import J.C0283p;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1023j extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9607l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9608m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e1 f9609n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1027l f9610o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1013e f9611p;
    public final /* synthetic */ J2.Z q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023j(e1 e1Var, C1027l c1027l, InterfaceC1013e interfaceC1013e, J2.Z z3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9609n = e1Var;
        this.f9610o = c1027l;
        this.f9611p = interfaceC1013e;
        this.q = z3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1023j) m((C1055z0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1023j c1023j = new C1023j(this.f9609n, this.f9610o, this.f9611p, this.q, interfaceC1073d);
        c1023j.f9608m = obj;
        return c1023j;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9607l;
        if (i2 == 0) {
            C1.y.J(obj);
            C1055z0 c1055z0 = (C1055z0) this.f9608m;
            C1027l c1027l = this.f9610o;
            InterfaceC1013e interfaceC1013e = this.f9611p;
            float K02 = C1027l.K0(c1027l, interfaceC1013e);
            e1 e1Var = this.f9609n;
            e1Var.f9593e = K02;
            L2.d dVar = new L2.d(c1027l, this.q, c1055z0, 10);
            C0283p c0283p = new C0283p(c1027l, e1Var, interfaceC1013e, 2);
            this.f9607l = 1;
            if (e1Var.a(dVar, c0283p, this) == enumC1145a) {
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
