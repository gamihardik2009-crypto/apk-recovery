package u;

import m2.C0880v;
import p.InterfaceC1012d0;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;
import t.C1221p;
import t0.C1236E;

/* loaded from: classes.dex */
public final class w extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f10791l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10792m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f10793n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, int i2, int i3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f10791l = xVar;
        this.f10792m = i2;
        this.f10793n = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        w wVar = (w) m((InterfaceC1012d0) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        wVar.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new w(this.f10791l, this.f10792m, this.f10793n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        x xVar = this.f10791l;
        C1221p c1221p = xVar.f10796b;
        int g3 = c1221p.f10321b.g();
        int i2 = this.f10793n;
        int i3 = this.f10792m;
        if (g3 != i3 || c1221p.f10322c.g() != i2) {
            xVar.f10805k.e();
        }
        c1221p.c(i3, i2);
        c1221p.f10324e = null;
        C1236E c1236e = xVar.f10802h;
        if (c1236e != null) {
            c1236e.k();
        }
        return C0880v.f8657a;
    }
}
