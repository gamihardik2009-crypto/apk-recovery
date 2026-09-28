package D;

import m2.C0880v;
import n0.C0921D;
import n2.AbstractC0946A;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import t0.AbstractC1248f;
import u0.V0;

/* renamed from: D.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055y extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f912l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f913m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ B.F f914n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z.a0 f915o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055y(B.F f3, z.a0 a0Var, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f914n = f3;
        this.f915o = a0Var;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0055y) m((C0921D) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0055y c0055y = new C0055y(this.f914n, this.f915o, interfaceC1073d);
        c0055y.f913m = obj;
        return c0055y;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f912l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0921D c0921d = (C0921D) this.f913m;
            c0921d.getClass();
            V0 v0 = AbstractC1248f.v(c0921d).f10404z;
            C0043l c0043l = new C0043l();
            c0043l.f866b = v0;
            C0054x c0054x = new C0054x(this.f914n, c0043l, this.f915o, null);
            this.f912l = 1;
            if (AbstractC0946A.e(c0921d, c0054x, this) == enumC1145a) {
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
