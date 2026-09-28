package s;

import H.C0171p1;
import java.util.List;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;

/* renamed from: s.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1180t implements InterfaceC1094H, O {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1171j f10178a;

    /* renamed from: b, reason: collision with root package name */
    public final V.e f10179b;

    public C1180t(InterfaceC1171j interfaceC1171j, V.e eVar) {
        this.f10178a = interfaceC1171j;
        this.f10179b = eVar;
    }

    @Override // r0.InterfaceC1094H
    public final int a(t0.Z z3, List list, int i2) {
        int l3 = z3.l(this.f10178a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f3 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            InterfaceC1093G interfaceC1093G = (InterfaceC1093G) list.get(i5);
            float c3 = AbstractC1166e.c(AbstractC1166e.b(interfaceC1093G));
            int b3 = interfaceC1093G.b(i2);
            if (c3 == 0.0f) {
                i4 += b3;
            } else if (c3 > 0.0f) {
                f3 += c3;
                i3 = Math.max(i3, Math.round(b3 / c3));
            }
        }
        return ((list.size() - 1) * l3) + Math.round(i3 * f3) + i4;
    }

    @Override // s.O
    public final int b(AbstractC1103Q abstractC1103Q) {
        return abstractC1103Q.f9835i;
    }

    @Override // r0.InterfaceC1094H
    public final int c(t0.Z z3, List list, int i2) {
        int l3 = z3.l(this.f10178a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * l3, i2);
        int size = list.size();
        int i3 = 0;
        float f3 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC1093G interfaceC1093G = (InterfaceC1093G) list.get(i4);
            float c3 = AbstractC1166e.c(AbstractC1166e.b(interfaceC1093G));
            if (c3 == 0.0f) {
                int min2 = Math.min(interfaceC1093G.b(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i3 = Math.max(i3, interfaceC1093G.L(min2));
            } else if (c3 > 0.0f) {
                f3 += c3;
            }
        }
        int round = f3 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - min, 0) / f3);
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) list.get(i5);
            float c4 = AbstractC1166e.c(AbstractC1166e.b(interfaceC1093G2));
            if (c4 > 0.0f) {
                i3 = Math.max(i3, interfaceC1093G2.L(round != Integer.MAX_VALUE ? Math.round(round * c4) : Integer.MAX_VALUE));
            }
        }
        return i3;
    }

    @Override // r0.InterfaceC1094H
    public final int d(t0.Z z3, List list, int i2) {
        int l3 = z3.l(this.f10178a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f3 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            InterfaceC1093G interfaceC1093G = (InterfaceC1093G) list.get(i5);
            float c3 = AbstractC1166e.c(AbstractC1166e.b(interfaceC1093G));
            int b02 = interfaceC1093G.b0(i2);
            if (c3 == 0.0f) {
                i4 += b02;
            } else if (c3 > 0.0f) {
                f3 += c3;
                i3 = Math.max(i3, Math.round(b02 / c3));
            }
        }
        return ((list.size() - 1) * l3) + Math.round(i3 * f3) + i4;
    }

    @Override // s.O
    public final void e(int i2, int[] iArr, int[] iArr2, InterfaceC1096J interfaceC1096J) {
        this.f10178a.b(interfaceC1096J, i2, iArr, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1180t)) {
            return false;
        }
        C1180t c1180t = (C1180t) obj;
        return z2.h.a(this.f10178a, c1180t.f10178a) && z2.h.a(this.f10179b, c1180t.f10179b);
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        return AbstractC1166e.d(this, O0.a.i(j3), O0.a.j(j3), O0.a.g(j3), O0.a.h(j3), interfaceC1096J.l(this.f10178a.a()), interfaceC1096J, list, new AbstractC1103Q[list.size()], list.size());
    }

    @Override // s.O
    public final int g(AbstractC1103Q abstractC1103Q) {
        return abstractC1103Q.f9834h;
    }

    @Override // r0.InterfaceC1094H
    public final int h(t0.Z z3, List list, int i2) {
        int l3 = z3.l(this.f10178a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * l3, i2);
        int size = list.size();
        int i3 = 0;
        float f3 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC1093G interfaceC1093G = (InterfaceC1093G) list.get(i4);
            float c3 = AbstractC1166e.c(AbstractC1166e.b(interfaceC1093G));
            if (c3 == 0.0f) {
                int min2 = Math.min(interfaceC1093G.b(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i3 = Math.max(i3, interfaceC1093G.a0(min2));
            } else if (c3 > 0.0f) {
                f3 += c3;
            }
        }
        int round = f3 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - min, 0) / f3);
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) list.get(i5);
            float c4 = AbstractC1166e.c(AbstractC1166e.b(interfaceC1093G2));
            if (c4 > 0.0f) {
                i3 = Math.max(i3, interfaceC1093G2.a0(round != Integer.MAX_VALUE ? Math.round(round * c4) : Integer.MAX_VALUE));
            }
        }
        return i3;
    }

    public final int hashCode() {
        return this.f10179b.hashCode() + (this.f10178a.hashCode() * 31);
    }

    @Override // s.O
    public final InterfaceC1095I i(AbstractC1103Q[] abstractC1103QArr, InterfaceC1096J interfaceC1096J, int[] iArr, int i2, int i3) {
        return interfaceC1096J.C(i3, i2, C0971w.f9166h, new C0171p1(abstractC1103QArr, this, i3, interfaceC1096J, iArr));
    }

    @Override // s.O
    public final long j(int i2, int i3, int i4, boolean z3) {
        if (!z3) {
            return B1.C.b(0, i4, i2, i3);
        }
        int min = Math.min(i2, 262142);
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int m3 = B1.C.m(min2 == Integer.MAX_VALUE ? min : min2);
        return B1.C.b(Math.min(m3, 0), i4 != Integer.MAX_VALUE ? Math.min(m3, i4) : Integer.MAX_VALUE, min, min2);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f10178a + ", horizontalAlignment=" + this.f10179b + ')';
    }
}
