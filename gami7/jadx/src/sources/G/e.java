package G;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.W0;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.C0603v;
import n.T;
import n.U;

/* loaded from: classes.dex */
public final class e implements T {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1148a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1149b;

    /* renamed from: c, reason: collision with root package name */
    public final W0 f1150c;

    public e(boolean z3, float f3, InterfaceC0258c0 interfaceC0258c0) {
        this.f1148a = z3;
        this.f1149b = f3;
        this.f1150c = interfaceC0258c0;
    }

    @Override // n.T
    public final U a(r.k kVar, C0285q c0285q) {
        s sVar;
        c0285q.V(988743187);
        u uVar = (u) c0285q.l(w.f1203a);
        c0285q.V(-1524341038);
        W0 w02 = this.f1150c;
        long b3 = ((C0603v) w02.getValue()).f7279a != C0603v.f7277g ? ((C0603v) w02.getValue()).f7279a : uVar.b(c0285q);
        c0285q.r(false);
        InterfaceC0258c0 R3 = C0257c.R(new C0603v(b3), c0285q);
        InterfaceC0258c0 R4 = C0257c.R(uVar.a(c0285q), c0285q);
        c0285q.V(331259447);
        c0285q.V(-1737891121);
        Object l3 = c0285q.l(AndroidCompositionLocals_androidKt.f6785f);
        while (!(l3 instanceof ViewGroup)) {
            Object parent = ((View) l3).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + l3 + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            l3 = parent;
        }
        ViewGroup viewGroup = (ViewGroup) l3;
        c0285q.r(false);
        c0285q.V(1643267293);
        boolean isInEditMode = viewGroup.isInEditMode();
        Object obj = C0275l.f4150a;
        boolean z3 = this.f1148a;
        float f3 = this.f1149b;
        if (isInEditMode) {
            c0285q.V(511388516);
            boolean g3 = c0285q.g(kVar) | c0285q.g(this);
            Object K3 = c0285q.K();
            if (g3 || K3 == obj) {
                K3 = new c(z3, f3, R3, R4);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            sVar = (c) K3;
            c0285q.r(false);
            c0285q.r(false);
        } else {
            c0285q.r(false);
            c0285q.V(1618982084);
            boolean g4 = c0285q.g(kVar) | c0285q.g(this) | c0285q.g(viewGroup);
            Object K4 = c0285q.K();
            if (g4 || K4 == obj) {
                K4 = new C0062a(z3, f3, R3, R4, viewGroup);
                c0285q.e0(K4);
            }
            c0285q.r(false);
            sVar = (C0062a) K4;
            c0285q.r(false);
        }
        C0257c.f(sVar, kVar, new f(kVar, sVar, null), c0285q);
        c0285q.r(false);
        return sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1148a == eVar.f1148a && O0.e.a(this.f1149b, eVar.f1149b) && z2.h.a(this.f1150c, eVar.f1150c);
    }

    public final int hashCode() {
        return this.f1150c.hashCode() + B1.t.c(this.f1149b, Boolean.hashCode(this.f1148a) * 31, 31);
    }
}
