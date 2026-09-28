package H;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: H.x3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222x3 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f3307l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r.l f3308m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T.r f3309n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0222x3(r.l lVar, T.r rVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f3308m = lVar;
        this.f3309n = rVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0222x3) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0222x3(this.f3308m, this.f3309n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f3307l;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
            return C0880v.f8657a;
        }
        C1.y.J(obj);
        M2.O o3 = this.f3308m.f9797a;
        B b3 = new B(this.f3309n, 2);
        this.f3307l = 1;
        o3.getClass();
        M2.O.m(o3, b3, this);
        return enumC1145a;
    }
}
