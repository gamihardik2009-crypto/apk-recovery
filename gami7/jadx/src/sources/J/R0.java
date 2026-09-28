package J;

import J2.InterfaceC0328z;
import M2.InterfaceC0343g;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class R0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f4078l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g f4079m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0284p0 f4080n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(InterfaceC0343g interfaceC0343g, C0284p0 c0284p0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f4079m = interfaceC0343g;
        this.f4080n = c0284p0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((R0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new R0(this.f4079m, this.f4080n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f4078l;
        if (i2 == 0) {
            C1.y.J(obj);
            Q0 q0 = new Q0(this.f4080n, 1);
            this.f4078l = 1;
            if (this.f4079m.b(q0, this) == enumC1145a) {
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
