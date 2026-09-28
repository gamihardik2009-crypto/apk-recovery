package m;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class S extends AbstractC1204i implements y2.c {

    /* renamed from: l, reason: collision with root package name */
    public int f8351l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8352m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f8353n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W f8354o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p0 f8355p;
    public final /* synthetic */ float q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Object obj, Object obj2, W w2, p0 p0Var, float f3, InterfaceC1073d interfaceC1073d) {
        super(1, interfaceC1073d);
        this.f8352m = obj;
        this.f8353n = obj2;
        this.f8354o = w2;
        this.f8355p = p0Var;
        this.q = f3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        p0 p0Var = this.f8355p;
        float f3 = this.q;
        return new S(this.f8352m, this.f8353n, this.f8354o, p0Var, f3, (InterfaceC1073d) obj).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8351l;
        if (i2 == 0) {
            C1.y.J(obj);
            Q q = new Q(this.f8352m, this.f8353n, this.f8354o, this.f8355p, this.q, null);
            this.f8351l = 1;
            if (J2.B.e(q, this) == enumC1145a) {
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
