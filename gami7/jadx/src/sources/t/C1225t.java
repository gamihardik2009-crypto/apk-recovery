package t;

import m2.C0880v;
import p.InterfaceC1012d0;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: t.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225t extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1228w f10335l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10336m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f10337n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225t(C1228w c1228w, int i2, int i3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f10335l = c1228w;
        this.f10336m = i2;
        this.f10337n = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C1225t c1225t = (C1225t) m((InterfaceC1012d0) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        c1225t.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1225t(this.f10335l, this.f10336m, this.f10337n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        this.f10335l.k(this.f10336m, this.f10337n);
        return C0880v.f8657a;
    }
}
