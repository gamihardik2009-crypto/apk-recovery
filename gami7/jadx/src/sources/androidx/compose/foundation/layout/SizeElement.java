package androidx.compose.foundation.layout;

import B1.t;
import O0.e;
import V.n;
import s.U;
import t0.S;

/* loaded from: classes.dex */
final class SizeElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final float f6627b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6628c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6629d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6630e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6631f;

    public SizeElement(float f3, float f4, float f5, float f6, boolean z3) {
        this.f6627b = f3;
        this.f6628c = f4;
        this.f6629d = f5;
        this.f6630e = f6;
        this.f6631f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return e.a(this.f6627b, sizeElement.f6627b) && e.a(this.f6628c, sizeElement.f6628c) && e.a(this.f6629d, sizeElement.f6629d) && e.a(this.f6630e, sizeElement.f6630e) && this.f6631f == sizeElement.f6631f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6631f) + t.c(this.f6630e, t.c(this.f6629d, t.c(this.f6628c, Float.hashCode(this.f6627b) * 31, 31), 31), 31);
    }

    @Override // t0.S
    public final n l() {
        U u3 = new U();
        u3.f10080u = this.f6627b;
        u3.f10081v = this.f6628c;
        u3.f10082w = this.f6629d;
        u3.f10083x = this.f6630e;
        u3.f10084y = this.f6631f;
        return u3;
    }

    @Override // t0.S
    public final void m(n nVar) {
        U u3 = (U) nVar;
        u3.f10080u = this.f6627b;
        u3.f10081v = this.f6628c;
        u3.f10082w = this.f6629d;
        u3.f10083x = this.f6630e;
        u3.f10084y = this.f6631f;
    }

    public /* synthetic */ SizeElement(float f3, float f4, float f5, float f6, boolean z3, int i2) {
        this((i2 & 1) != 0 ? Float.NaN : f3, (i2 & 2) != 0 ? Float.NaN : f4, (i2 & 4) != 0 ? Float.NaN : f5, (i2 & 8) != 0 ? Float.NaN : f6, z3);
    }
}
