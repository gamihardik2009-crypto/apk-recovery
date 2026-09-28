package androidx.compose.foundation.layout;

import B1.t;
import O0.e;
import V.n;
import r0.C1125n;
import s.C1163b;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final C1125n f6609b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6610c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6611d;

    public AlignmentLineOffsetDpElement(C1125n c1125n, float f3, float f4) {
        this.f6609b = c1125n;
        this.f6610c = f3;
        this.f6611d = f4;
        if ((f3 < 0.0f && !e.a(f3, Float.NaN)) || (f4 < 0.0f && !e.a(f4, Float.NaN))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return h.a(this.f6609b, alignmentLineOffsetDpElement.f6609b) && e.a(this.f6610c, alignmentLineOffsetDpElement.f6610c) && e.a(this.f6611d, alignmentLineOffsetDpElement.f6611d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6611d) + t.c(this.f6610c, this.f6609b.hashCode() * 31, 31);
    }

    @Override // t0.S
    public final n l() {
        C1163b c1163b = new C1163b();
        c1163b.f10119u = this.f6609b;
        c1163b.f10120v = this.f6610c;
        c1163b.f10121w = this.f6611d;
        return c1163b;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1163b c1163b = (C1163b) nVar;
        c1163b.f10119u = this.f6609b;
        c1163b.f10120v = this.f6610c;
        c1163b.f10121w = this.f6611d;
    }
}
