package androidx.compose.ui.input.pointer;

import V.n;
import g2.C0690a;
import n0.C0922a;
import n0.C0933l;
import n0.InterfaceC0935n;
import t0.AbstractC1248f;
import t0.S;
import z.N;
import z2.h;
import z2.s;

/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0935n f6769b = N.f11525b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6770c;

    public PointerHoverIconModifierElement(boolean z3) {
        this.f6770c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return h.a(this.f6769b, pointerHoverIconModifierElement.f6769b) && this.f6770c == pointerHoverIconModifierElement.f6770c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6770c) + (((C0922a) this.f6769b).f8920b * 31);
    }

    @Override // t0.S
    public final n l() {
        InterfaceC0935n interfaceC0935n = this.f6769b;
        boolean z3 = this.f6770c;
        C0933l c0933l = new C0933l();
        c0933l.f8950u = interfaceC0935n;
        c0933l.f8951v = z3;
        return c0933l;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C0933l c0933l = (C0933l) nVar;
        InterfaceC0935n interfaceC0935n = c0933l.f8950u;
        InterfaceC0935n interfaceC0935n2 = this.f6769b;
        if (!h.a(interfaceC0935n, interfaceC0935n2)) {
            c0933l.f8950u = interfaceC0935n2;
            if (c0933l.f8952w) {
                c0933l.L0();
            }
        }
        boolean z3 = c0933l.f8951v;
        boolean z4 = this.f6770c;
        if (z3 != z4) {
            c0933l.f8951v = z4;
            if (z4) {
                if (c0933l.f8952w) {
                    c0933l.K0();
                    return;
                }
                return;
            }
            boolean z5 = c0933l.f8952w;
            if (z5 && z5) {
                if (!z4) {
                    s sVar = new s();
                    AbstractC1248f.z(c0933l, new C0690a(sVar, 2));
                    C0933l c0933l2 = (C0933l) sVar.f11909h;
                    if (c0933l2 != null) {
                        c0933l = c0933l2;
                    }
                }
                c0933l.K0();
            }
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f6769b + ", overrideDescendants=" + this.f6770c + ')';
    }
}
