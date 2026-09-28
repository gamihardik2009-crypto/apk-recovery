package androidx.compose.animation;

import V.n;
import l.C0789D;
import l.C0790E;
import l.C0791F;
import l.w;
import m.j0;
import m.p0;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class EnterExitTransitionElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final p0 f6533b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f6534c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f6535d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f6536e;

    /* renamed from: f, reason: collision with root package name */
    public final C0790E f6537f;

    /* renamed from: g, reason: collision with root package name */
    public final C0791F f6538g;

    /* renamed from: h, reason: collision with root package name */
    public final y2.a f6539h;

    /* renamed from: i, reason: collision with root package name */
    public final w f6540i;

    public EnterExitTransitionElement(p0 p0Var, j0 j0Var, j0 j0Var2, j0 j0Var3, C0790E c0790e, C0791F c0791f, y2.a aVar, w wVar) {
        this.f6533b = p0Var;
        this.f6534c = j0Var;
        this.f6535d = j0Var2;
        this.f6536e = j0Var3;
        this.f6537f = c0790e;
        this.f6538g = c0791f;
        this.f6539h = aVar;
        this.f6540i = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return h.a(this.f6533b, enterExitTransitionElement.f6533b) && h.a(this.f6534c, enterExitTransitionElement.f6534c) && h.a(this.f6535d, enterExitTransitionElement.f6535d) && h.a(this.f6536e, enterExitTransitionElement.f6536e) && h.a(this.f6537f, enterExitTransitionElement.f6537f) && h.a(this.f6538g, enterExitTransitionElement.f6538g) && h.a(this.f6539h, enterExitTransitionElement.f6539h) && h.a(this.f6540i, enterExitTransitionElement.f6540i);
    }

    public final int hashCode() {
        int hashCode = this.f6533b.hashCode() * 31;
        j0 j0Var = this.f6534c;
        int hashCode2 = (hashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        j0 j0Var2 = this.f6535d;
        int hashCode3 = (hashCode2 + (j0Var2 == null ? 0 : j0Var2.hashCode())) * 31;
        j0 j0Var3 = this.f6536e;
        return this.f6540i.hashCode() + ((this.f6539h.hashCode() + ((this.f6538g.f8131a.hashCode() + ((this.f6537f.f8128a.hashCode() + ((hashCode3 + (j0Var3 != null ? j0Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // t0.S
    public final n l() {
        return new C0789D(this.f6533b, this.f6534c, this.f6535d, this.f6536e, this.f6537f, this.f6538g, this.f6539h, this.f6540i);
    }

    @Override // t0.S
    public final void m(n nVar) {
        C0789D c0789d = (C0789D) nVar;
        c0789d.f8121u = this.f6533b;
        c0789d.f8122v = this.f6534c;
        c0789d.f8123w = this.f6535d;
        c0789d.f8124x = this.f6536e;
        c0789d.f8125y = this.f6537f;
        c0789d.f8126z = this.f6538g;
        c0789d.f8117A = this.f6539h;
        c0789d.f8118B = this.f6540i;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f6533b + ", sizeAnimation=" + this.f6534c + ", offsetAnimation=" + this.f6535d + ", slideAnimation=" + this.f6536e + ", enter=" + this.f6537f + ", exit=" + this.f6538g + ", isEnabled=" + this.f6539h + ", graphicsLayerBlock=" + this.f6540i + ')';
    }
}
