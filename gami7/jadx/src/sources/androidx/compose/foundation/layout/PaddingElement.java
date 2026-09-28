package androidx.compose.foundation.layout;

import B1.t;
import O0.e;
import V.n;
import s.C1158K;
import t0.S;

/* loaded from: classes.dex */
final class PaddingElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final float f6622b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6623c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6624d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6625e;

    public PaddingElement(float f3, float f4, float f5, float f6) {
        this.f6622b = f3;
        this.f6623c = f4;
        this.f6624d = f5;
        this.f6625e = f6;
        if ((f3 < 0.0f && !e.a(f3, Float.NaN)) || ((f4 < 0.0f && !e.a(f4, Float.NaN)) || ((f5 < 0.0f && !e.a(f5, Float.NaN)) || (f6 < 0.0f && !e.a(f6, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && e.a(this.f6622b, paddingElement.f6622b) && e.a(this.f6623c, paddingElement.f6623c) && e.a(this.f6624d, paddingElement.f6624d) && e.a(this.f6625e, paddingElement.f6625e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + t.c(this.f6625e, t.c(this.f6624d, t.c(this.f6623c, Float.hashCode(this.f6622b) * 31, 31), 31), 31);
    }

    @Override // t0.S
    public final n l() {
        C1158K c1158k = new C1158K();
        c1158k.f10063u = this.f6622b;
        c1158k.f10064v = this.f6623c;
        c1158k.f10065w = this.f6624d;
        c1158k.f10066x = this.f6625e;
        c1158k.f10067y = true;
        return c1158k;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1158K c1158k = (C1158K) nVar;
        c1158k.f10063u = this.f6622b;
        c1158k.f10064v = this.f6623c;
        c1158k.f10065w = this.f6624d;
        c1158k.f10066x = this.f6625e;
        c1158k.f10067y = true;
    }
}
