package m;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class N extends AbstractC1204i implements y2.c {

    /* renamed from: l, reason: collision with root package name */
    public int f8334l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p0 f8335m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W f8336n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f8337o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0817A f8338p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Object obj, InterfaceC0817A interfaceC0817A, W w2, p0 p0Var, InterfaceC1073d interfaceC1073d) {
        super(1, interfaceC1073d);
        this.f8335m = p0Var;
        this.f8336n = w2;
        this.f8337o = obj;
        this.f8338p = interfaceC0817A;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        Object obj2 = this.f8337o;
        InterfaceC0817A interfaceC0817A = this.f8338p;
        p0 p0Var = this.f8335m;
        return new N(obj2, interfaceC0817A, this.f8336n, p0Var, (InterfaceC1073d) obj).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8334l;
        if (i2 == 0) {
            C1.y.J(obj);
            M m3 = new M(this.f8337o, this.f8338p, this.f8336n, this.f8335m, null);
            this.f8334l = 1;
            if (J2.B.e(m3, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        this.f8335m.i();
        return C0880v.f8657a;
    }
}
