package n;

import t0.AbstractC1248f;
import t0.InterfaceC1254l;
import v.C1333E;

/* renamed from: n.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891J extends V.n implements InterfaceC1254l, t0.b0 {

    /* renamed from: u, reason: collision with root package name */
    public C1333E f8692u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8693v;

    @Override // V.n
    public final void E0() {
        C1333E c1333e = this.f8692u;
        if (c1333e != null) {
            c1333e.c();
        }
        this.f8692u = null;
    }

    @Override // t0.b0
    public final void s0() {
        z2.s sVar = new z2.s();
        AbstractC1248f.s(this, new D.c0(sVar, 9, this));
        C1333E c1333e = (C1333E) sVar.f11909h;
        if (this.f8693v) {
            C1333E c1333e2 = this.f8692u;
            if (c1333e2 != null) {
                c1333e2.c();
            }
            if (c1333e != null) {
                c1333e.b();
            } else {
                c1333e = null;
            }
            this.f8692u = c1333e;
        }
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
