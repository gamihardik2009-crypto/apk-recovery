package z;

import m.AbstractC0837j;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1131t;

/* loaded from: classes.dex */
public final class s0 implements InterfaceC1131t {

    /* renamed from: b, reason: collision with root package name */
    public final n0 f11814b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11815c;

    /* renamed from: d, reason: collision with root package name */
    public final I0.G f11816d;

    /* renamed from: e, reason: collision with root package name */
    public final y2.a f11817e;

    public s0(n0 n0Var, int i2, I0.G g3, y2.a aVar) {
        this.f11814b = n0Var;
        this.f11815c = i2;
        this.f11816d = g3;
        this.f11817e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return z2.h.a(this.f11814b, s0Var.f11814b) && this.f11815c == s0Var.f11815c && z2.h.a(this.f11816d, s0Var.f11816d) && z2.h.a(this.f11817e, s0Var.f11817e);
    }

    @Override // r0.InterfaceC1131t
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        AbstractC1103Q a3 = interfaceC1093G.a(O0.a.a(j3, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(a3.f9835i, O0.a.g(j3));
        return interfaceC1096J.C(a3.f9834h, min, C0971w.f9166h, new J.E(interfaceC1096J, this, a3, min, 5));
    }

    public final int hashCode() {
        return this.f11817e.hashCode() + ((this.f11816d.hashCode() + AbstractC0837j.b(this.f11815c, this.f11814b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f11814b + ", cursorOffset=" + this.f11815c + ", transformedText=" + this.f11816d + ", textLayoutResultProvider=" + this.f11817e + ')';
    }
}
