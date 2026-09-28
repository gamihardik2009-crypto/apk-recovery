package m;

import H.C0091d5;
import J.C0257c;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class n0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public float f8539l;

    /* renamed from: m, reason: collision with root package name */
    public int f8540m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f8541n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p0 f8542o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8542o = p0Var;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((n0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        n0 n0Var = new n0(this.f8542o, interfaceC1073d);
        n0Var.f8541n = obj;
        return n0Var;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        float l3;
        InterfaceC0328z interfaceC0328z;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8540m;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z2 = (InterfaceC0328z) this.f8541n;
            l3 = AbstractC0831e.l(interfaceC0328z2.r());
            interfaceC0328z = interfaceC0328z2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l3 = this.f8539l;
            interfaceC0328z = (InterfaceC0328z) this.f8541n;
            C1.y.J(obj);
        }
        while (J2.B.o(interfaceC0328z)) {
            C0091d5 c0091d5 = new C0091d5(this.f8542o, l3);
            this.f8541n = interfaceC0328z;
            this.f8539l = l3;
            this.f8540m = 1;
            if (C0257c.H(n()).d(c0091d5, this) == enumC1145a) {
                return enumC1145a;
            }
        }
        return C0880v.f8657a;
    }
}
