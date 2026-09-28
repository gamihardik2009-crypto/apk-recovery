package c2;

import J2.InterfaceC0328z;
import Y1.H;
import m2.C0880v;
import n1.y;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class f extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f7347l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f7348m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(H h2, y yVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f7347l = h2;
        this.f7348m = yVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        f fVar = (f) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        fVar.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new f(this.f7347l, this.f7348m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        this.f7347l.f6271i.k(Boolean.TRUE);
        String str = S1.h.f5613d.f5618a;
        y yVar = this.f7348m;
        yVar.getClass();
        z2.h.f(str, "route");
        if (yVar.o(str, false, false)) {
            yVar.b();
        }
        return C0880v.f8657a;
    }
}
