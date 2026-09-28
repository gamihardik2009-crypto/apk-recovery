package H;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import t.C1228w;

/* loaded from: classes.dex */
public final class Q0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1926l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1228w f1927m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(C1228w c1228w, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1927m = c1228w;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((Q0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new Q0(this.f1927m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1926l;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                C1228w c1228w = this.f1927m;
                int g3 = c1228w.f10346d.f10321b.g() + 1;
                this.f1926l = 1;
                if (C1228w.f(c1228w, g3, this) == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
            }
        } catch (IllegalArgumentException unused) {
        }
        return C0880v.f8657a;
    }
}
