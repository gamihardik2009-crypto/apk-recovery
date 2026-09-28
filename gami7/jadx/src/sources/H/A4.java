package H;

import J2.InterfaceC0328z;
import m.C0829d;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class A4 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1307l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0829d f1308m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f1309n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(C0829d c0829d, float f3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1308m = c0829d;
        this.f1309n = f3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((A4) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new A4(this.f1308m, this.f1309n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1307l;
        if (i2 == 0) {
            C1.y.J(obj);
            Float f3 = new Float(this.f1309n);
            m.w0 w0Var = H4.f1575f;
            this.f1307l = 1;
            if (C0829d.b(this.f1308m, f3, w0Var, null, this, 12) == enumC1145a) {
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
