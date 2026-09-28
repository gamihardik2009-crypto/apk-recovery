package m;

import J.W0;

/* loaded from: classes.dex */
public final class i0 implements W0 {

    /* renamed from: h, reason: collision with root package name */
    public final m0 f8498h;

    /* renamed from: i, reason: collision with root package name */
    public y2.c f8499i;

    /* renamed from: j, reason: collision with root package name */
    public y2.c f8500j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j0 f8501k;

    public i0(j0 j0Var, m0 m0Var, y2.c cVar, y2.c cVar2) {
        this.f8501k = j0Var;
        this.f8498h = m0Var;
        this.f8499i = cVar;
        this.f8500j = cVar2;
    }

    public final void a(k0 k0Var) {
        Object l3 = this.f8500j.l(k0Var.c());
        boolean g3 = this.f8501k.f8505c.g();
        m0 m0Var = this.f8498h;
        if (g3) {
            m0Var.g(this.f8500j.l(k0Var.b()), l3, (InterfaceC0817A) this.f8499i.l(k0Var));
        } else {
            m0Var.h(l3, (InterfaceC0817A) this.f8499i.l(k0Var));
        }
    }

    @Override // J.W0
    public final Object getValue() {
        a(this.f8501k.f8505c.f());
        return this.f8498h.q.getValue();
    }
}
