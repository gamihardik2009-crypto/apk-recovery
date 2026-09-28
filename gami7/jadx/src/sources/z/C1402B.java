package z;

import J2.InterfaceC0328z;
import m2.C0880v;
import n0.C0921D;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: z.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1402B extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11497l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0921D f11498m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0 f11499n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D.X f11500o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402B(C0921D c0921d, a0 a0Var, D.X x2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11498m = c0921d;
        this.f11499n = a0Var;
        this.f11500o = x2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C1402B c1402b = (C1402B) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        c1402b.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1402B c1402b = new C1402B(this.f11498m, this.f11499n, this.f11500o, interfaceC1073d);
        c1402b.f11497l = obj;
        return c1402b;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f11497l;
        C0921D c0921d = this.f11498m;
        J2.B.r(interfaceC0328z, null, 4, new C1434z(c0921d, this.f11499n, null), 1);
        J2.B.r(interfaceC0328z, null, 4, new C1401A(c0921d, this.f11500o, null), 1);
        return C0880v.f8657a;
    }
}
