package androidx.compose.foundation.gestures;

import B1.t;
import V.n;
import n.j0;
import p.C0;
import p.C1015f;
import p.C1018g0;
import p.C1027l;
import p.C1045u0;
import p.InterfaceC1013e;
import p.InterfaceC1047v0;
import p.U;
import p.X;
import r.l;
import t0.AbstractC1248f;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class ScrollableElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1047v0 f6598b;

    /* renamed from: c, reason: collision with root package name */
    public final X f6599c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f6600d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6601e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6602f;

    /* renamed from: g, reason: collision with root package name */
    public final U f6603g;

    /* renamed from: h, reason: collision with root package name */
    public final l f6604h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1013e f6605i;

    public ScrollableElement(j0 j0Var, InterfaceC1013e interfaceC1013e, U u3, X x2, InterfaceC1047v0 interfaceC1047v0, l lVar, boolean z3, boolean z4) {
        this.f6598b = interfaceC1047v0;
        this.f6599c = x2;
        this.f6600d = j0Var;
        this.f6601e = z3;
        this.f6602f = z4;
        this.f6603g = u3;
        this.f6604h = lVar;
        this.f6605i = interfaceC1013e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return h.a(this.f6598b, scrollableElement.f6598b) && this.f6599c == scrollableElement.f6599c && h.a(this.f6600d, scrollableElement.f6600d) && this.f6601e == scrollableElement.f6601e && this.f6602f == scrollableElement.f6602f && h.a(this.f6603g, scrollableElement.f6603g) && h.a(this.f6604h, scrollableElement.f6604h) && h.a(this.f6605i, scrollableElement.f6605i);
    }

    public final int hashCode() {
        int hashCode = (this.f6599c.hashCode() + (this.f6598b.hashCode() * 31)) * 31;
        j0 j0Var = this.f6600d;
        int f3 = t.f(t.f((hashCode + (j0Var != null ? j0Var.hashCode() : 0)) * 31, 31, this.f6601e), 31, this.f6602f);
        U u3 = this.f6603g;
        int hashCode2 = (f3 + (u3 != null ? u3.hashCode() : 0)) * 31;
        l lVar = this.f6604h;
        int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        InterfaceC1013e interfaceC1013e = this.f6605i;
        return hashCode3 + (interfaceC1013e != null ? interfaceC1013e.hashCode() : 0);
    }

    @Override // t0.S
    public final n l() {
        boolean z3 = this.f6601e;
        boolean z4 = this.f6602f;
        InterfaceC1047v0 interfaceC1047v0 = this.f6598b;
        return new C1045u0(this.f6600d, this.f6605i, this.f6603g, this.f6599c, interfaceC1047v0, this.f6604h, z3, z4);
    }

    @Override // t0.S
    public final void m(n nVar) {
        boolean z3;
        boolean z4;
        C1045u0 c1045u0 = (C1045u0) nVar;
        boolean z5 = c1045u0.f9470y;
        boolean z6 = this.f6601e;
        boolean z7 = false;
        if (z5 != z6) {
            c1045u0.f9691K.f9636h = z6;
            c1045u0.f9688H.f9587u = z6;
            z3 = true;
        } else {
            z3 = false;
        }
        U u3 = this.f6603g;
        U u4 = u3 == null ? c1045u0.f9689I : u3;
        C0 c02 = c1045u0.f9690J;
        InterfaceC1047v0 interfaceC1047v0 = c02.f9384a;
        InterfaceC1047v0 interfaceC1047v02 = this.f6598b;
        if (!h.a(interfaceC1047v0, interfaceC1047v02)) {
            c02.f9384a = interfaceC1047v02;
            z7 = true;
        }
        j0 j0Var = this.f6600d;
        c02.f9385b = j0Var;
        X x2 = c02.f9387d;
        X x3 = this.f6599c;
        if (x2 != x3) {
            c02.f9387d = x3;
            z7 = true;
        }
        boolean z8 = c02.f9388e;
        boolean z9 = this.f6602f;
        if (z8 != z9) {
            c02.f9388e = z9;
            z4 = true;
        } else {
            z4 = z7;
        }
        c02.f9386c = u4;
        c02.f9389f = c1045u0.f9687G;
        C1027l c1027l = c1045u0.f9692L;
        c1027l.f9630u = x3;
        c1027l.f9632w = z9;
        c1027l.f9633x = this.f6605i;
        c1045u0.E = j0Var;
        c1045u0.F = u3;
        C1018g0 c1018g0 = a.f6606a;
        C1015f c1015f = C1015f.f9596l;
        X x4 = c02.f9387d;
        X x5 = X.f9518h;
        c1045u0.V0(c1015f, z6, this.f6604h, x4 == x5 ? x5 : X.f9519i, z4);
        if (z3) {
            c1045u0.f9694N = null;
            c1045u0.f9695O = null;
            AbstractC1248f.p(c1045u0);
        }
    }
}
