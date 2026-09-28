package D;

import J.T0;
import J.W0;
import J2.InterfaceC0328z;
import m.C0829d;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class K extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f741l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f742m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W0 f743n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0829d f744o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(W0 w02, C0829d c0829d, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f743n = w02;
        this.f744o = c0829d;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((K) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        K k3 = new K(this.f743n, this.f744o, interfaceC1073d);
        k3.f742m = obj;
        return k3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f741l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f742m;
            G1.h hVar = new G1.h(2, new T0(new G(this.f743n, 1), null));
            J j3 = new J(this.f744o, 0, interfaceC0328z);
            this.f741l = 1;
            if (hVar.b(j3, this) == enumC1145a) {
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
