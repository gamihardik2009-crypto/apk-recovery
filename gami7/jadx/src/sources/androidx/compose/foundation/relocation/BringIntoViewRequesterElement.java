package androidx.compose.foundation.relocation;

import V.n;
import t0.S;
import w.C1373c;
import w.C1374d;
import z2.h;

/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final C1373c f6668b;

    public BringIntoViewRequesterElement(C1373c c1373c) {
        this.f6668b = c1373c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (h.a(this.f6668b, ((BringIntoViewRequesterElement) obj).f6668b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6668b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        C1374d c1374d = new C1374d();
        c1374d.f11413u = this.f6668b;
        return c1374d;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1374d c1374d = (C1374d) nVar;
        C1373c c1373c = c1374d.f11413u;
        if (c1373c instanceof C1373c) {
            h.d(c1373c, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            c1373c.f11412a.m(c1374d);
        }
        C1373c c1373c2 = this.f6668b;
        if (c1373c2 instanceof C1373c) {
            c1373c2.f11412a.b(c1374d);
        }
        c1374d.f11413u = c1373c2;
    }
}
