package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1035p extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9658l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f9659m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n.c0 f9660n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.e f9661o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1035p(r rVar, n.c0 c0Var, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9659m = rVar;
        this.f9660n = c0Var;
        this.f9661o = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1035p) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1035p(this.f9659m, this.f9660n, this.f9661o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9658l;
        if (i2 == 0) {
            C1.y.J(obj);
            r rVar = this.f9659m;
            n.f0 f0Var = rVar.f9670c;
            C1033o c1033o = new C1033o(rVar, this.f9661o, null);
            this.f9658l = 1;
            f0Var.getClass();
            if (J2.B.e(new n.e0(this.f9660n, f0Var, c1033o, rVar.f9669b, null), this) == enumC1145a) {
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
