package androidx.compose.foundation.text.input.internal;

import B.B;
import B.C0007h;
import D.X;
import V.n;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends S {

    /* renamed from: b, reason: collision with root package name */
    public final C0007h f6700b;

    /* renamed from: c, reason: collision with root package name */
    public final z.S f6701c;

    /* renamed from: d, reason: collision with root package name */
    public final X f6702d;

    public LegacyAdaptingPlatformTextInputModifier(C0007h c0007h, z.S s3, X x2) {
        this.f6700b = c0007h;
        this.f6701c = s3;
        this.f6702d = x2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return h.a(this.f6700b, legacyAdaptingPlatformTextInputModifier.f6700b) && h.a(this.f6701c, legacyAdaptingPlatformTextInputModifier.f6701c) && h.a(this.f6702d, legacyAdaptingPlatformTextInputModifier.f6702d);
    }

    public final int hashCode() {
        return this.f6702d.hashCode() + ((this.f6701c.hashCode() + (this.f6700b.hashCode() * 31)) * 31);
    }

    @Override // t0.S
    public final n l() {
        return new B(this.f6700b, this.f6701c, this.f6702d);
    }

    @Override // t0.S
    public final void m(n nVar) {
        B b3 = (B) nVar;
        if (b3.f5869t) {
            b3.f142u.d();
            b3.f142u.k(b3);
        }
        C0007h c0007h = this.f6700b;
        b3.f142u = c0007h;
        if (b3.f5869t) {
            if (c0007h.f217a != null) {
                throw new IllegalStateException("Expected textInputModifierNode to be null".toString());
            }
            c0007h.f217a = b3;
        }
        b3.f143v = this.f6701c;
        b3.f144w = this.f6702d;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f6700b + ", legacyTextFieldState=" + this.f6701c + ", textFieldSelectionManager=" + this.f6702d + ')';
    }
}
