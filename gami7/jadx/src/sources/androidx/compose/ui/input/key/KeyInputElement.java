package androidx.compose.ui.input.key;

import V.n;
import l0.e;
import t0.S;
import y2.c;
import z2.h;

/* loaded from: classes.dex */
final class KeyInputElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final c f6767b;

    /* renamed from: c, reason: collision with root package name */
    public final c f6768c;

    public KeyInputElement(c cVar, c cVar2) {
        this.f6767b = cVar;
        this.f6768c = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return h.a(this.f6767b, keyInputElement.f6767b) && h.a(this.f6768c, keyInputElement.f6768c);
    }

    public final int hashCode() {
        c cVar = this.f6767b;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        c cVar2 = this.f6768c;
        return hashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @Override // t0.S
    public final n l() {
        e eVar = new e();
        eVar.f8282u = this.f6767b;
        eVar.f8283v = this.f6768c;
        return eVar;
    }

    @Override // t0.S
    public final void m(n nVar) {
        e eVar = (e) nVar;
        eVar.f8282u = this.f6767b;
        eVar.f8283v = this.f6768c;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f6767b + ", onPreKeyEvent=" + this.f6768c + ')';
    }
}
