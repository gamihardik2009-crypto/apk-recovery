package H;

import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1131t;

/* loaded from: classes.dex */
public final class Q5 extends u0.N implements InterfaceC1131t {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1941f;

    public Q5(boolean z3) {
        this.f1941f = z3;
    }

    public final boolean equals(Object obj) {
        Q5 q5 = obj instanceof Q5 ? (Q5) obj : null;
        return q5 != null && this.f1941f == q5.f1941f;
    }

    @Override // r0.InterfaceC1131t
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        AbstractC1103Q a3 = interfaceC1093G.a(j3);
        boolean z3 = this.f1941f;
        C0971w c0971w = C0971w.f9166h;
        return !z3 ? interfaceC1096J.C(0, 0, c0971w, C0200u.f3144G) : interfaceC1096J.C(a3.f9834h, a3.f9835i, c0971w, new C.h(a3, 2));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1941f);
    }
}
