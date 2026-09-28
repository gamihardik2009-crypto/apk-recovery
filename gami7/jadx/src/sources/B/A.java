package B;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import u0.G0;

/* loaded from: classes.dex */
public final class A extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f139l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f140m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f141n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b3, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f140m = b3;
        this.f141n = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((A) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
        return EnumC1145a.f10026h;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new A(this.f140m, this.f141n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f139l;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
            throw new J2.r();
        }
        C1.y.J(obj);
        this.f139l = 1;
        G0.a(this.f140m, this.f141n, this);
        return enumC1145a;
    }
}
