package z;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import w.C1373c;

/* loaded from: classes.dex */
public final class r extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11799l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1373c f11800m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I0.z f11801n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ S f11802o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p0 f11803p;
    public final /* synthetic */ I0.s q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1373c c1373c, I0.z zVar, S s3, p0 p0Var, I0.s sVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11800m = c1373c;
        this.f11801n = zVar;
        this.f11802o = s3;
        this.f11803p = p0Var;
        this.q = sVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((r) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new r(this.f11800m, this.f11801n, this.f11802o, this.f11803p, this.q, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        long a3;
        b0.d dVar;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11799l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            Z z3 = this.f11802o.f11543a;
            C0.H h2 = this.f11803p.f11788a;
            this.f11799l = 1;
            int l3 = this.q.l(C0.J.d(this.f11801n.f3933b));
            if (l3 < h2.f461a.f451a.f500a.length()) {
                dVar = h2.b(l3);
            } else if (l3 != 0) {
                dVar = h2.b(l3 - 1);
            } else {
                a3 = d0.a(z3.f11606b, z3.f11611g, z3.f11612h, d0.f11642a, 1);
                dVar = new b0.d(0.0f, 0.0f, 1.0f, (int) (a3 & 4294967295L));
            }
            Object a4 = this.f11800m.a(dVar, this);
            if (a4 != enumC1145a) {
                a4 = c0880v;
            }
            if (a4 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return c0880v;
    }
}
