package r1;

import J2.InterfaceC0310g;
import J2.InterfaceC0328z;
import java.util.concurrent.Callable;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: r1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1143f extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Callable f9931l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0310g f9932m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1143f(Callable callable, InterfaceC0310g interfaceC0310g, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9931l = callable;
        this.f9932m = interfaceC0310g;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C1143f c1143f = (C1143f) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        c1143f.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1143f(this.f9931l, this.f9932m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        InterfaceC0310g interfaceC0310g = this.f9932m;
        C1.y.J(obj);
        try {
            interfaceC0310g.t(this.f9931l.call());
        } catch (Throwable th) {
            interfaceC0310g.t(C1.y.n(th));
        }
        return C0880v.f8657a;
    }
}
