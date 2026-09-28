package androidx.compose.ui.input.rotary;

import V.n;
import p0.C1056a;
import t0.S;
import u0.C1297m;
import y2.c;
import z2.h;

/* loaded from: classes.dex */
final class RotaryInputElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final c f6775b = C1297m.f11110l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RotaryInputElement) {
            return h.a(this.f6775b, ((RotaryInputElement) obj).f6775b) && h.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        c cVar = this.f6775b;
        return (cVar == null ? 0 : cVar.hashCode()) * 31;
    }

    @Override // t0.S
    public final n l() {
        C1056a c1056a = new C1056a();
        c1056a.f9725u = this.f6775b;
        c1056a.f9726v = null;
        return c1056a;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1056a c1056a = (C1056a) nVar;
        c1056a.f9725u = this.f6775b;
        c1056a.f9726v = null;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f6775b + ", onPreRotaryScrollEvent=null)";
    }
}
