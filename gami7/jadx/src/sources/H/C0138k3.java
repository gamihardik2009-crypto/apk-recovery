package H;

import J2.InterfaceC0328z;
import m2.C0880v;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: H.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138k3 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f2802l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0145l3 f2803m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2804n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138k3(C0145l3 c0145l3, int i2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f2803m = c0145l3;
        this.f2804n = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0138k3) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0138k3(this.f2803m, this.f2804n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f2802l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            n.w0 w0Var = this.f2803m.f2853a;
            m.w0 w0Var2 = X4.f2163b;
            this.f2802l = 1;
            Object d3 = AbstractC0948C.d(w0Var, this.f2804n - w0Var.f8883a.g(), w0Var2, this);
            if (d3 != enumC1145a) {
                d3 = c0880v;
            }
            if (d3 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return c0880v;
    }
}
