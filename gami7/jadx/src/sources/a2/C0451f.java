package a2;

import C1.y;
import J.InterfaceC0258c0;
import J2.InterfaceC0328z;
import java.util.List;
import m2.C0880v;
import n2.AbstractC0961m;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: a2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451f extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f6509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6510m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0451f(List list, InterfaceC0258c0 interfaceC0258c0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6509l = list;
        this.f6510m = interfaceC0258c0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0451f c0451f = (C0451f) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        c0451f.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0451f(this.f6509l, this.f6510m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        y.J(obj);
        InterfaceC0258c0 interfaceC0258c0 = this.f6510m;
        String str = (String) interfaceC0258c0.getValue();
        List list = this.f6509l;
        if (str == null || !AbstractC0961m.E(list, (String) interfaceC0258c0.getValue())) {
            interfaceC0258c0.setValue((String) AbstractC0961m.H(list));
        }
        return C0880v.f8657a;
    }
}
