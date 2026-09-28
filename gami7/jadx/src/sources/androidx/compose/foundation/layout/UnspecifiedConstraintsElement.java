package androidx.compose.foundation.layout;

import O0.e;
import V.n;
import s.W;
import t0.S;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final float f6632b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6633c;

    public UnspecifiedConstraintsElement(float f3, float f4) {
        this.f6632b = f3;
        this.f6633c = f4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return e.a(this.f6632b, unspecifiedConstraintsElement.f6632b) && e.a(this.f6633c, unspecifiedConstraintsElement.f6633c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6633c) + (Float.hashCode(this.f6632b) * 31);
    }

    @Override // t0.S
    public final n l() {
        W w2 = new W();
        w2.f10087u = this.f6632b;
        w2.f10088v = this.f6633c;
        return w2;
    }

    @Override // t0.S
    public final void m(n nVar) {
        W w2 = (W) nVar;
        w2.f10087u = this.f6632b;
        w2.f10088v = this.f6633c;
    }
}
