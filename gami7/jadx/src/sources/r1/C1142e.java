package r1;

import J2.InterfaceC0328z;
import java.util.concurrent.Callable;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: r1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142e extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Callable f9930l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142e(Callable callable, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9930l = callable;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1142e) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1142e(this.f9930l, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        return this.f9930l.call();
    }
}
