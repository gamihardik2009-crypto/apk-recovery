package J;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: J.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297w0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f4277l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4278m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.f f4279n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X f4280o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0297w0(y2.f fVar, X x2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f4279n = fVar;
        this.f4280o = x2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0297w0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0297w0 c0297w0 = new C0297w0(this.f4279n, this.f4280o, interfaceC1073d);
        c0297w0.f4278m = obj;
        return c0297w0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f4277l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f4278m;
            this.f4277l = 1;
            if (this.f4279n.i(interfaceC0328z, this.f4280o, this) == enumC1145a) {
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
