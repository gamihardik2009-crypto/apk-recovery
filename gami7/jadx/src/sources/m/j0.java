package m;

import J.C0257c;
import J.C0274k0;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f8503a;

    /* renamed from: b, reason: collision with root package name */
    public final C0274k0 f8504b = C0257c.N(null, J.W.f4109m);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f8505c;

    public j0(p0 p0Var, x0 x0Var, String str) {
        this.f8505c = p0Var;
        this.f8503a = x0Var;
    }

    public final i0 a(y2.c cVar, y2.c cVar2) {
        C0274k0 c0274k0 = this.f8504b;
        i0 i0Var = (i0) c0274k0.getValue();
        p0 p0Var = this.f8505c;
        if (i0Var == null) {
            Object l3 = cVar2.l(p0Var.f8547a.g());
            Object l4 = cVar2.l(p0Var.f8547a.g());
            x0 x0Var = this.f8503a;
            AbstractC0845s abstractC0845s = (AbstractC0845s) x0Var.f8600a.l(l4);
            abstractC0845s.d();
            m0 m0Var = new m0(p0Var, l3, abstractC0845s, x0Var);
            i0Var = new i0(this, m0Var, cVar, cVar2);
            c0274k0.setValue(i0Var);
            p0Var.f8555i.add(m0Var);
        }
        i0Var.f8500j = cVar2;
        i0Var.f8499i = cVar;
        i0Var.a(p0Var.f());
        return i0Var;
    }
}
