package m;

import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827c extends AbstractC1204i implements y2.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0829d f8414l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8415m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0827c(C0829d c0829d, Object obj, InterfaceC1073d interfaceC1073d) {
        super(1, interfaceC1073d);
        this.f8414l = c0829d;
        this.f8415m = obj;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C0827c c0827c = new C0827c(this.f8414l, this.f8415m, (InterfaceC1073d) obj);
        C0880v c0880v = C0880v.f8657a;
        c0827c.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        C0829d c0829d = this.f8414l;
        C0829d.a(c0829d);
        Object c3 = c0829d.c(this.f8415m);
        c0829d.f8424c.f8534i.setValue(c3);
        c0829d.f8426e.setValue(c3);
        return C0880v.f8657a;
    }
}
