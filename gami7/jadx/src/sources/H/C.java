package H;

import J2.InterfaceC0328z;
import M2.InterfaceC0343g;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class C extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1355l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r.k f1356m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T.r f1357n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(r.k kVar, T.r rVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1356m = kVar;
        this.f1357n = rVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C(this.f1356m, this.f1357n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1355l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0343g a3 = this.f1356m.a();
            B b3 = new B(this.f1357n, 0);
            this.f1355l = 1;
            if (a3.b(b3, this) == enumC1145a) {
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
