package z;

import J2.InterfaceC0328z;
import m2.C0880v;
import n0.C0921D;
import p.b1;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: z.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1401A extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11494l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0921D f11495m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D.X f11496n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401A(C0921D c0921d, D.X x2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11495m = c0921d;
        this.f11496n = x2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1401A) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1401A(this.f11495m, this.f11496n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11494l;
        if (i2 == 0) {
            C1.y.J(obj);
            C1420k c1420k = new C1420k(this.f11496n, 1);
            this.f11494l = 1;
            if (b1.d(this.f11495m, null, c1420k, this, 7) == enumC1145a) {
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
