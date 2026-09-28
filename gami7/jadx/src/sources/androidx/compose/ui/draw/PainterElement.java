package androidx.compose.ui.draw;

import B1.t;
import V.c;
import V.n;
import Z.i;
import b0.f;
import c0.C0594m;
import i0.C0706A;
import r0.C1098L;
import t0.AbstractC1248f;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class PainterElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final C0706A f6726b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6727c;

    /* renamed from: d, reason: collision with root package name */
    public final c f6728d;

    /* renamed from: e, reason: collision with root package name */
    public final C1098L f6729e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6730f;

    /* renamed from: g, reason: collision with root package name */
    public final C0594m f6731g;

    public PainterElement(C0706A c0706a, boolean z3, c cVar, C1098L c1098l, float f3, C0594m c0594m) {
        this.f6726b = c0706a;
        this.f6727c = z3;
        this.f6728d = cVar;
        this.f6729e = c1098l;
        this.f6730f = f3;
        this.f6731g = c0594m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return h.a(this.f6726b, painterElement.f6726b) && this.f6727c == painterElement.f6727c && h.a(this.f6728d, painterElement.f6728d) && h.a(this.f6729e, painterElement.f6729e) && Float.compare(this.f6730f, painterElement.f6730f) == 0 && h.a(this.f6731g, painterElement.f6731g);
    }

    public final int hashCode() {
        int c3 = t.c(this.f6730f, (this.f6729e.hashCode() + ((this.f6728d.hashCode() + t.f(this.f6726b.hashCode() * 31, 31, this.f6727c)) * 31)) * 31, 31);
        C0594m c0594m = this.f6731g;
        return c3 + (c0594m == null ? 0 : c0594m.hashCode());
    }

    @Override // t0.S
    public final n l() {
        i iVar = new i();
        iVar.f6386u = this.f6726b;
        iVar.f6387v = this.f6727c;
        iVar.f6388w = this.f6728d;
        iVar.f6389x = this.f6729e;
        iVar.f6390y = this.f6730f;
        iVar.f6391z = this.f6731g;
        return iVar;
    }

    @Override // t0.S
    public final void m(n nVar) {
        i iVar = (i) nVar;
        boolean z3 = iVar.f6387v;
        C0706A c0706a = this.f6726b;
        boolean z4 = this.f6727c;
        boolean z5 = z3 != z4 || (z4 && !f.a(iVar.f6386u.b(), c0706a.b()));
        iVar.f6386u = c0706a;
        iVar.f6387v = z4;
        iVar.f6388w = this.f6728d;
        iVar.f6389x = this.f6729e;
        iVar.f6390y = this.f6730f;
        iVar.f6391z = this.f6731g;
        if (z5) {
            AbstractC1248f.o(iVar);
        }
        AbstractC1248f.n(iVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f6726b + ", sizeToIntrinsics=" + this.f6727c + ", alignment=" + this.f6728d + ", contentScale=" + this.f6729e + ", alpha=" + this.f6730f + ", colorFilter=" + this.f6731g + ')';
    }
}
