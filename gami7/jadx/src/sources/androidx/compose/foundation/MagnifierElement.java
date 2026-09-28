package androidx.compose.foundation;

import A0.v;
import A0.x;
import B1.t;
import V.n;
import android.view.View;
import n.a0;
import n.b0;
import n.l0;
import t0.AbstractC1248f;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
public final class MagnifierElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final y2.c f6561b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.c f6562c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.c f6563d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6564e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6565f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6566g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6567h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6568i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6569j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f6570k;

    public MagnifierElement(v vVar, y2.c cVar, y2.c cVar2, float f3, boolean z3, long j3, float f4, float f5, boolean z4, l0 l0Var) {
        this.f6561b = vVar;
        this.f6562c = cVar;
        this.f6563d = cVar2;
        this.f6564e = f3;
        this.f6565f = z3;
        this.f6566g = j3;
        this.f6567h = f4;
        this.f6568i = f5;
        this.f6569j = z4;
        this.f6570k = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.f6561b == magnifierElement.f6561b && this.f6562c == magnifierElement.f6562c && this.f6564e == magnifierElement.f6564e && this.f6565f == magnifierElement.f6565f && this.f6566g == magnifierElement.f6566g && O0.e.a(this.f6567h, magnifierElement.f6567h) && O0.e.a(this.f6568i, magnifierElement.f6568i) && this.f6569j == magnifierElement.f6569j && this.f6563d == magnifierElement.f6563d && h.a(this.f6570k, magnifierElement.f6570k);
    }

    public final int hashCode() {
        int hashCode = this.f6561b.hashCode() * 31;
        y2.c cVar = this.f6562c;
        int f3 = t.f(t.c(this.f6568i, t.c(this.f6567h, t.d(t.f(t.c(this.f6564e, (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), 31, this.f6565f), 31, this.f6566g), 31), 31), 31, this.f6569j);
        y2.c cVar2 = this.f6563d;
        return this.f6570k.hashCode() + ((f3 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31);
    }

    @Override // t0.S
    public final n l() {
        return new a0(this.f6561b, this.f6562c, this.f6563d, this.f6564e, this.f6565f, this.f6566g, this.f6567h, this.f6568i, this.f6569j, this.f6570k);
    }

    @Override // t0.S
    public final void m(n nVar) {
        a0 a0Var = (a0) nVar;
        float f3 = a0Var.f8741x;
        long j3 = a0Var.f8743z;
        float f4 = a0Var.f8728A;
        boolean z3 = a0Var.f8742y;
        float f5 = a0Var.f8729B;
        boolean z4 = a0Var.f8730C;
        l0 l0Var = a0Var.f8731D;
        View view = a0Var.E;
        O0.b bVar = a0Var.F;
        a0Var.f8738u = this.f6561b;
        a0Var.f8739v = this.f6562c;
        float f6 = this.f6564e;
        a0Var.f8741x = f6;
        boolean z5 = this.f6565f;
        a0Var.f8742y = z5;
        long j4 = this.f6566g;
        a0Var.f8743z = j4;
        float f7 = this.f6567h;
        a0Var.f8728A = f7;
        float f8 = this.f6568i;
        a0Var.f8729B = f8;
        boolean z6 = this.f6569j;
        a0Var.f8730C = z6;
        a0Var.f8740w = this.f6563d;
        l0 l0Var2 = this.f6570k;
        a0Var.f8731D = l0Var2;
        View x2 = AbstractC1248f.x(a0Var);
        O0.b bVar2 = AbstractC1248f.v(a0Var).f10402x;
        if (a0Var.f8732G != null) {
            x xVar = b0.f8747a;
            if (((!Float.isNaN(f6) || !Float.isNaN(f3)) && f6 != f3 && !l0Var2.b()) || j4 != j3 || !O0.e.a(f7, f4) || !O0.e.a(f8, f5) || z5 != z3 || z6 != z4 || !h.a(l0Var2, l0Var) || !h.a(x2, view) || !h.a(bVar2, bVar)) {
                a0Var.L0();
            }
        }
        a0Var.M0();
    }
}
