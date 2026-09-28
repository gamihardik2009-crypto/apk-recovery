package H;

import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class I3 extends AbstractC1204i implements y2.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1593l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1594m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I3(Object obj, InterfaceC1073d interfaceC1073d, int i2) {
        super(3, interfaceC1073d);
        this.f1593l = i2;
        this.f1594m = obj;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f1593l) {
            case 0:
                ((Number) obj2).floatValue();
                I3 i3 = new I3((P3) this.f1594m, (InterfaceC1073d) obj3, 0);
                C0880v c0880v = C0880v.f8657a;
                i3.p(c0880v);
                return c0880v;
            default:
                I3 i32 = new I3((z2.o) this.f1594m, (InterfaceC1073d) obj3, 1);
                C0880v c0880v2 = C0880v.f8657a;
                i32.p(c0880v2);
                return c0880v2;
        }
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C0880v c0880v = C0880v.f8657a;
        Object obj2 = this.f1594m;
        switch (this.f1593l) {
            case 0:
                C1.y.J(obj);
                ((P3) obj2).f1909k.c();
                break;
            default:
                C1.y.J(obj);
                ((z2.o) obj2).f11905h = true;
                break;
        }
        return c0880v;
    }
}
