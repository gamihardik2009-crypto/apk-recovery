package androidx.compose.foundation.gestures;

import B1.t;
import H.P3;
import V.n;
import p.C1015f;
import p.T;
import p.X;
import r.l;
import t0.S;
import y2.f;
import z2.h;

/* loaded from: classes.dex */
public final class DraggableElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final P3 f6590b;

    /* renamed from: c, reason: collision with root package name */
    public final X f6591c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6592d;

    /* renamed from: e, reason: collision with root package name */
    public final l f6593e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6594f;

    /* renamed from: g, reason: collision with root package name */
    public final f f6595g;

    /* renamed from: h, reason: collision with root package name */
    public final f f6596h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6597i;

    public DraggableElement(P3 p3, X x2, boolean z3, l lVar, boolean z4, f fVar, f fVar2, boolean z5) {
        this.f6590b = p3;
        this.f6591c = x2;
        this.f6592d = z3;
        this.f6593e = lVar;
        this.f6594f = z4;
        this.f6595g = fVar;
        this.f6596h = fVar2;
        this.f6597i = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return h.a(this.f6590b, draggableElement.f6590b) && this.f6591c == draggableElement.f6591c && this.f6592d == draggableElement.f6592d && h.a(this.f6593e, draggableElement.f6593e) && this.f6594f == draggableElement.f6594f && h.a(this.f6595g, draggableElement.f6595g) && h.a(this.f6596h, draggableElement.f6596h) && this.f6597i == draggableElement.f6597i;
    }

    public final int hashCode() {
        int f3 = t.f((this.f6591c.hashCode() + (this.f6590b.hashCode() * 31)) * 31, 31, this.f6592d);
        l lVar = this.f6593e;
        return Boolean.hashCode(this.f6597i) + ((this.f6596h.hashCode() + ((this.f6595g.hashCode() + t.f((f3 + (lVar != null ? lVar.hashCode() : 0)) * 31, 31, this.f6594f)) * 31)) * 31);
    }

    @Override // t0.S
    public final n l() {
        C1015f c1015f = C1015f.f9595k;
        boolean z3 = this.f6592d;
        l lVar = this.f6593e;
        X x2 = this.f6591c;
        T t3 = new T(c1015f, z3, lVar, x2);
        t3.E = this.f6590b;
        t3.F = x2;
        t3.f9499G = this.f6594f;
        t3.f9500H = this.f6595g;
        t3.f9501I = this.f6596h;
        t3.f9502J = this.f6597i;
        return t3;
    }

    @Override // t0.S
    public final void m(n nVar) {
        boolean z3;
        boolean z4;
        T t3 = (T) nVar;
        C1015f c1015f = C1015f.f9595k;
        P3 p3 = t3.E;
        P3 p32 = this.f6590b;
        if (h.a(p3, p32)) {
            z3 = false;
        } else {
            t3.E = p32;
            z3 = true;
        }
        X x2 = t3.F;
        X x3 = this.f6591c;
        if (x2 != x3) {
            t3.F = x3;
            z3 = true;
        }
        boolean z5 = t3.f9502J;
        boolean z6 = this.f6597i;
        if (z5 != z6) {
            t3.f9502J = z6;
            z4 = true;
        } else {
            z4 = z3;
        }
        t3.f9500H = this.f6595g;
        t3.f9501I = this.f6596h;
        t3.f9499G = this.f6594f;
        t3.V0(c1015f, this.f6592d, this.f6593e, x3, z4);
    }
}
