package c;

import C1.y;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558h extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0560j f7172l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f7173m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0558h(C0560j c0560j, boolean z3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f7172l = c0560j;
        this.f7173m = z3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0558h c0558h = (C0558h) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        c0558h.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0558h(this.f7172l, this.f7173m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        y.J(obj);
        C0560j c0560j = this.f7172l;
        c0560j.f7021a = this.f7173m;
        y2.a aVar = c0560j.f7023c;
        if (aVar != null) {
            aVar.c();
        }
        return C0880v.f8657a;
    }
}
