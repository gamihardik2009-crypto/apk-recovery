package Y1;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class E extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f6254l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f6255m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f6256n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f6257o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(H h2, String str, boolean z3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6255m = h2;
        this.f6256n = str;
        this.f6257o = z3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((E) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new E(this.f6255m, this.f6256n, this.f6257o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f6254l;
        if (i2 == 0) {
            C1.y.J(obj);
            Q2.c cVar = J2.H.f4357b;
            D d3 = new D(this.f6255m, this.f6256n, this.f6257o, null);
            this.f6254l = 1;
            if (J2.B.z(cVar, d3, this) == enumC1145a) {
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
