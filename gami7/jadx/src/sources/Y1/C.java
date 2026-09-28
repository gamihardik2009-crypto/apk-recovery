package Y1;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class C extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f6243l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(H h2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6243l = h2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C c3 = (C) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        c3.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C(this.f6243l, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        this.f6243l.f6265c.c();
        return C0880v.f8657a;
    }
}
