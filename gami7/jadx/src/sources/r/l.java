package r;

import M2.InterfaceC0343g;
import M2.O;
import M2.P;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final O f9797a = P.a(0, 16, 2, 1);

    @Override // r.k
    public final InterfaceC0343g a() {
        return this.f9797a;
    }

    public final Object b(j jVar, InterfaceC1073d interfaceC1073d) {
        Object f3 = this.f9797a.f(jVar, interfaceC1073d);
        return f3 == EnumC1145a.f10026h ? f3 : C0880v.f8657a;
    }

    public final void c(j jVar) {
        this.f9797a.d(jVar);
    }
}
