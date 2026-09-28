package t0;

import J.C0292u;
import j.C0766v;
import n2.AbstractC0946A;

/* renamed from: t0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1256n extends V.n {

    /* renamed from: u, reason: collision with root package name */
    public final int f10607u = a0.f(this);

    /* renamed from: v, reason: collision with root package name */
    public V.n f10608v;

    @Override // V.n
    public final void A0() {
        super.A0();
        for (V.n nVar = this.f10608v; nVar != null; nVar = nVar.f5863m) {
            nVar.J0(this.f5865o);
            if (!nVar.f5869t) {
                nVar.A0();
            }
        }
    }

    @Override // V.n
    public final void B0() {
        for (V.n nVar = this.f10608v; nVar != null; nVar = nVar.f5863m) {
            nVar.B0();
        }
        super.B0();
    }

    @Override // V.n
    public final void F0() {
        super.F0();
        for (V.n nVar = this.f10608v; nVar != null; nVar = nVar.f5863m) {
            nVar.F0();
        }
    }

    @Override // V.n
    public final void G0() {
        for (V.n nVar = this.f10608v; nVar != null; nVar = nVar.f5863m) {
            nVar.G0();
        }
        super.G0();
    }

    @Override // V.n
    public final void H0() {
        super.H0();
        for (V.n nVar = this.f10608v; nVar != null; nVar = nVar.f5863m) {
            nVar.H0();
        }
    }

    @Override // V.n
    public final void I0(V.n nVar) {
        this.f5858h = nVar;
        for (V.n nVar2 = this.f10608v; nVar2 != null; nVar2 = nVar2.f5863m) {
            nVar2.I0(nVar);
        }
    }

    @Override // V.n
    public final void J0(Z z3) {
        this.f5865o = z3;
        for (V.n nVar = this.f10608v; nVar != null; nVar = nVar.f5863m) {
            nVar.J0(z3);
        }
    }

    public final void K0(V.n nVar) {
        V.n nVar2 = nVar.f5858h;
        if (nVar2 != nVar) {
            if (!(nVar instanceof V.n)) {
                nVar = null;
            }
            V.n nVar3 = nVar != null ? nVar.f5862l : null;
            if (nVar2 != this.f5858h || !z2.h.a(nVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
            }
            return;
        }
        if (!(!nVar2.f5869t)) {
            AbstractC0946A.r("Cannot delegate to an already attached node");
            throw null;
        }
        nVar2.I0(this.f5858h);
        int i2 = this.f5860j;
        int g3 = a0.g(nVar2);
        nVar2.f5860j = g3;
        int i3 = this.f5860j;
        int i4 = g3 & 2;
        if (i4 != 0 && (i3 & 2) != 0 && !(this instanceof InterfaceC1264w)) {
            AbstractC0946A.r("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + nVar2);
            throw null;
        }
        nVar2.f5863m = this.f10608v;
        this.f10608v = nVar2;
        nVar2.f5862l = this;
        M0(g3 | i3, false);
        if (this.f5869t) {
            if (i4 == 0 || (i2 & 2) != 0) {
                J0(this.f5865o);
            } else {
                C0292u c0292u = AbstractC1248f.v(this).f10378C;
                this.f5858h.J0(null);
                c0292u.k();
            }
            nVar2.A0();
            nVar2.G0();
            a0.a(nVar2);
        }
    }

    public final void L0(InterfaceC1255m interfaceC1255m) {
        V.n nVar = null;
        for (V.n nVar2 = this.f10608v; nVar2 != null; nVar2 = nVar2.f5863m) {
            if (nVar2 == interfaceC1255m) {
                boolean z3 = nVar2.f5869t;
                if (z3) {
                    C0766v c0766v = a0.f10554a;
                    if (!z3) {
                        AbstractC0946A.r("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    a0.b(nVar2, -1, 2);
                    nVar2.H0();
                    nVar2.B0();
                }
                nVar2.I0(nVar2);
                nVar2.f5861k = 0;
                if (nVar == null) {
                    this.f10608v = nVar2.f5863m;
                } else {
                    nVar.f5863m = nVar2.f5863m;
                }
                nVar2.f5863m = null;
                nVar2.f5862l = null;
                int i2 = this.f5860j;
                int g3 = a0.g(this);
                M0(g3, true);
                if (this.f5869t && (i2 & 2) != 0 && (g3 & 2) == 0) {
                    C0292u c0292u = AbstractC1248f.v(this).f10378C;
                    this.f5858h.J0(null);
                    c0292u.k();
                    return;
                }
                return;
            }
            nVar = nVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC1255m).toString());
    }

    public final void M0(int i2, boolean z3) {
        V.n nVar;
        int i3 = this.f5860j;
        this.f5860j = i2;
        if (i3 != i2) {
            V.n nVar2 = this.f5858h;
            if (nVar2 == this) {
                this.f5861k = i2;
            }
            if (this.f5869t) {
                V.n nVar3 = this;
                while (nVar3 != null) {
                    i2 |= nVar3.f5860j;
                    nVar3.f5860j = i2;
                    if (nVar3 == nVar2) {
                        break;
                    } else {
                        nVar3 = nVar3.f5862l;
                    }
                }
                if (z3 && nVar3 == nVar2) {
                    i2 = a0.g(nVar2);
                    nVar2.f5860j = i2;
                }
                int i4 = i2 | ((nVar3 == null || (nVar = nVar3.f5863m) == null) ? 0 : nVar.f5861k);
                while (nVar3 != null) {
                    i4 |= nVar3.f5860j;
                    nVar3.f5861k = i4;
                    nVar3 = nVar3.f5862l;
                }
            }
        }
    }
}
