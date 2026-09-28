package o1;

import J.C0257c;
import J.C0274k0;
import J.W;
import M2.K;
import M2.d0;
import androidx.lifecycle.EnumC0466o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n1.C;
import n1.C0938A;
import n1.C0945f;
import n1.D;
import n2.AbstractC0948C;
import n2.AbstractC0961m;

@C("composable")
/* loaded from: classes.dex */
public final class i extends D {

    /* renamed from: c, reason: collision with root package name */
    public final C0274k0 f9243c = C0257c.N(Boolean.FALSE, W.f4109m);

    @Override // n1.D
    public final n1.s a() {
        return new h(this, c.f9235a);
    }

    @Override // n1.D
    public final void d(List list, C0938A c0938a) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0945f c0945f = (C0945f) it.next();
            n1.i b3 = b();
            z2.h.f(c0945f, "backStackEntry");
            d0 d0Var = b3.f9046c;
            Iterable iterable = (Iterable) d0Var.getValue();
            boolean z3 = iterable instanceof Collection;
            K k3 = b3.f9048e;
            if (!z3 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((C0945f) it2.next()) == c0945f) {
                        Iterable iterable2 = (Iterable) k3.f4811h.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((C0945f) it3.next()) == c0945f) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            C0945f c0945f2 = (C0945f) AbstractC0961m.N((List) k3.f4811h.getValue());
            if (c0945f2 != null) {
                d0Var.k(AbstractC0948C.m((Set) d0Var.getValue(), c0945f2));
            }
            d0Var.k(AbstractC0948C.m((Set) d0Var.getValue(), c0945f));
            b3.f(c0945f);
        }
        this.f9243c.setValue(Boolean.FALSE);
    }

    @Override // n1.D
    public final void e(C0945f c0945f, boolean z3) {
        b().e(c0945f, z3);
        this.f9243c.setValue(Boolean.TRUE);
    }

    public final void g(C0945f c0945f) {
        n1.i b3 = b();
        z2.h.f(c0945f, "entry");
        d0 d0Var = b3.f9046c;
        d0Var.k(AbstractC0948C.m((Set) d0Var.getValue(), c0945f));
        if (!b3.f9051h.f9122g.contains(c0945f)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        c0945f.h(EnumC0466o.f6901k);
    }
}
