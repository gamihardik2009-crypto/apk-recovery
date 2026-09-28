package n1;

import java.util.List;
import java.util.ListIterator;
import n0.C0919B;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public i f9012a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9013b;

    public abstract s a();

    public final i b() {
        i iVar = this.f9012a;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public s c(s sVar) {
        return sVar;
    }

    public void d(List list, C0938A c0938a) {
        G2.c cVar = new G2.c(new G2.d(new G2.d(new G2.k(1, list), new C0919B(this, c0938a), 2)));
        while (cVar.hasNext()) {
            b().f((C0945f) cVar.next());
        }
    }

    public void e(C0945f c0945f, boolean z3) {
        z2.h.f(c0945f, "popUpTo");
        List list = (List) b().f9048e.f4811h.getValue();
        if (!list.contains(c0945f)) {
            throw new IllegalStateException(("popBackStack was called with " + c0945f + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C0945f c0945f2 = null;
        while (f()) {
            c0945f2 = (C0945f) listIterator.previous();
            if (z2.h.a(c0945f2, c0945f)) {
                break;
            }
        }
        if (c0945f2 != null) {
            b().c(c0945f2, z3);
        }
    }

    public boolean f() {
        return true;
    }
}
