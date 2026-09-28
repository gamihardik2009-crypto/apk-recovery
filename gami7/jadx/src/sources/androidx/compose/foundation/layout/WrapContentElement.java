package androidx.compose.foundation.layout;

import B1.t;
import V.n;
import m.AbstractC0837j;
import s.e0;
import t0.S;
import y2.e;
import z2.h;

/* loaded from: classes.dex */
final class WrapContentElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final int f6634b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6635c;

    /* renamed from: d, reason: collision with root package name */
    public final e f6636d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6637e;

    public WrapContentElement(int i2, boolean z3, e eVar, Object obj) {
        this.f6634b = i2;
        this.f6635c = z3;
        this.f6636d = eVar;
        this.f6637e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f6634b == wrapContentElement.f6634b && this.f6635c == wrapContentElement.f6635c && h.a(this.f6637e, wrapContentElement.f6637e);
    }

    public final int hashCode() {
        return this.f6637e.hashCode() + t.f(AbstractC0837j.d(this.f6634b) * 31, 31, this.f6635c);
    }

    @Override // t0.S
    public final n l() {
        e0 e0Var = new e0();
        e0Var.f10140u = this.f6634b;
        e0Var.f10141v = this.f6635c;
        e0Var.f10142w = this.f6636d;
        return e0Var;
    }

    @Override // t0.S
    public final void m(n nVar) {
        e0 e0Var = (e0) nVar;
        e0Var.f10140u = this.f6634b;
        e0Var.f10141v = this.f6635c;
        e0Var.f10142w = this.f6636d;
    }
}
