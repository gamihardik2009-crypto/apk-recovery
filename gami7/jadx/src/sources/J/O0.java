package J;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class O0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f4062l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4063m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f4064n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f4065o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(y2.e eVar, InterfaceC0258c0 interfaceC0258c0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f4064n = eVar;
        this.f4065o = interfaceC0258c0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((O0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        O0 o02 = new O0(this.f4064n, this.f4065o, interfaceC1073d);
        o02.f4063m = obj;
        return o02;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f4062l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0284p0 c0284p0 = new C0284p0(this.f4065o, ((InterfaceC0328z) this.f4063m).r());
            this.f4062l = 1;
            if (this.f4064n.j(c0284p0, this) == enumC1145a) {
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
