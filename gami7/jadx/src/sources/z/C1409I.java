package z;

import m.AbstractC0837j;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1131t;

/* renamed from: z.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1409I implements InterfaceC1131t {

    /* renamed from: b, reason: collision with root package name */
    public final n0 f11518b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11519c;

    /* renamed from: d, reason: collision with root package name */
    public final I0.G f11520d;

    /* renamed from: e, reason: collision with root package name */
    public final y2.a f11521e;

    public C1409I(n0 n0Var, int i2, I0.G g3, y2.a aVar) {
        this.f11518b = n0Var;
        this.f11519c = i2;
        this.f11520d = g3;
        this.f11521e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409I)) {
            return false;
        }
        C1409I c1409i = (C1409I) obj;
        return z2.h.a(this.f11518b, c1409i.f11518b) && this.f11519c == c1409i.f11519c && z2.h.a(this.f11520d, c1409i.f11520d) && z2.h.a(this.f11521e, c1409i.f11521e);
    }

    @Override // r0.InterfaceC1131t
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        AbstractC1103Q a3 = interfaceC1093G.a(interfaceC1093G.a0(O0.a.g(j3)) < O0.a.h(j3) ? j3 : O0.a.a(j3, 0, Integer.MAX_VALUE, 0, 0, 13));
        int min = Math.min(a3.f9834h, O0.a.h(j3));
        return interfaceC1096J.C(min, a3.f9835i, C0971w.f9166h, new J.E(interfaceC1096J, this, a3, min, 4));
    }

    public final int hashCode() {
        return this.f11521e.hashCode() + ((this.f11520d.hashCode() + AbstractC0837j.b(this.f11519c, this.f11518b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f11518b + ", cursorOffset=" + this.f11519c + ", transformedText=" + this.f11520d + ", textLayoutResultProvider=" + this.f11521e + ')';
    }
}
