package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class T0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9503l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1006a0 f9504m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(C1006a0 c1006a0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9504m = c1006a0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((T0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new T0(this.f9504m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9503l;
        if (i2 == 0) {
            C1.y.J(obj);
            this.f9503l = 1;
            if (this.f9504m.a(this) == enumC1145a) {
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
