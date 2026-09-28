package H;

import J2.InterfaceC0328z;
import a0.C0438o;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class B5 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M5 f1352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0438o f1354n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5(M5 m5, int i2, C0438o c0438o, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1352l = m5;
        this.f1353m = i2;
        this.f1354n = c0438o;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        B5 b5 = (B5) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        b5.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new B5(this.f1352l, this.f1353m, this.f1354n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        if (C0186r3.a(this.f1352l.e(), this.f1353m)) {
            this.f1354n.b();
        }
        return C0880v.f8657a;
    }
}
