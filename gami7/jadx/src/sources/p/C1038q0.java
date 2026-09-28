package p;

import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: p.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038q0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9666l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f9667m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1038q0(long j3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9667m = j3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C1038q0 c1038q0 = (C1038q0) m((C1055z0) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        c1038q0.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1038q0 c1038q0 = new C1038q0(this.f9667m, interfaceC1073d);
        c1038q0.f9666l = obj;
        return c1038q0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        C0 c02 = ((C1055z0) this.f9666l).f9724a;
        C0.a(c02, c02.f9391h, this.f9667m, 1);
        return C0880v.f8657a;
    }
}
