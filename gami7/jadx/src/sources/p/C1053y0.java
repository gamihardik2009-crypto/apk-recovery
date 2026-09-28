package p;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1053y0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public C0 f9711l;

    /* renamed from: m, reason: collision with root package name */
    public z2.r f9712m;

    /* renamed from: n, reason: collision with root package name */
    public long f9713n;

    /* renamed from: o, reason: collision with root package name */
    public int f9714o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f9715p;
    public final /* synthetic */ C0 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z2.r f9716r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f9717s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053y0(C0 c02, z2.r rVar, long j3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.q = c02;
        this.f9716r = rVar;
        this.f9717s = j3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1053y0) m((C1055z0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1053y0 c1053y0 = new C1053y0(this.q, this.f9716r, this.f9717s, interfaceC1073d);
        c1053y0.f9715p = obj;
        return c1053y0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C0 c02;
        z2.r rVar;
        long j3;
        C0 c03;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9714o;
        X x2 = X.f9519i;
        if (i2 == 0) {
            C1.y.J(obj);
            C1055z0 c1055z0 = (C1055z0) this.f9715p;
            c02 = this.q;
            C1051x0 c1051x0 = new C1051x0(c02, c1055z0);
            U u3 = c02.f9386c;
            rVar = this.f9716r;
            long j4 = rVar.f11908h;
            X x3 = c02.f9387d;
            long j5 = this.f9717s;
            float c3 = c02.c(x3 == x2 ? O0.o.b(j5) : O0.o.c(j5));
            this.f9715p = c02;
            this.f9711l = c02;
            this.f9712m = rVar;
            this.f9713n = j4;
            this.f9714o = 1;
            obj = u3.a(c1051x0, c3, this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
            j3 = j4;
            c03 = c02;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = this.f9713n;
            rVar = this.f9712m;
            c02 = this.f9711l;
            c03 = (C0) this.f9715p;
            C1.y.J(obj);
        }
        float c4 = c03.c(((Number) obj).floatValue());
        rVar.f11908h = c02.f9387d == x2 ? O0.o.a(c4, 0.0f, 2, j3) : O0.o.a(0.0f, c4, 1, j3);
        return C0880v.f8657a;
    }
}
