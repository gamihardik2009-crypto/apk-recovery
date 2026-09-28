package p;

import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class N extends AbstractC1204i implements y2.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9473l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(int i2, InterfaceC1073d interfaceC1073d, int i3) {
        super(i2, interfaceC1073d);
        this.f9473l = i3;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f9473l) {
            case 0:
                long j3 = ((b0.c) obj2).f7058a;
                N n3 = new N(3, (InterfaceC1073d) obj3, 0);
                C0880v c0880v = C0880v.f8657a;
                n3.p(c0880v);
                return c0880v;
            case 1:
                ((Number) obj2).floatValue();
                N n4 = new N(3, (InterfaceC1073d) obj3, 1);
                C0880v c0880v2 = C0880v.f8657a;
                n4.p(c0880v2);
                return c0880v2;
            default:
                long j4 = ((b0.c) obj2).f7058a;
                N n5 = new N(3, (InterfaceC1073d) obj3, 2);
                C0880v c0880v3 = C0880v.f8657a;
                n5.p(c0880v3);
                return c0880v3;
        }
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C0880v c0880v = C0880v.f8657a;
        switch (this.f9473l) {
            case 0:
                C1.y.J(obj);
                break;
            case 1:
                C1.y.J(obj);
                break;
            default:
                C1.y.J(obj);
                break;
        }
        return c0880v;
    }
}
