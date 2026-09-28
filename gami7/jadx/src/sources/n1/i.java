package n1;

import M2.K;
import M2.P;
import M2.d0;
import android.util.Log;
import androidx.lifecycle.EnumC0466o;
import androidx.lifecycle.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import n2.AbstractC0946A;
import n2.AbstractC0948C;
import n2.AbstractC0961m;
import n2.C0958j;
import n2.C0970v;
import n2.C0972x;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f9044a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f9045b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f9046c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9047d;

    /* renamed from: e, reason: collision with root package name */
    public final K f9048e;

    /* renamed from: f, reason: collision with root package name */
    public final K f9049f;

    /* renamed from: g, reason: collision with root package name */
    public final D f9050g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f9051h;

    public i(y yVar, D d3) {
        z2.h.f(d3, "navigator");
        this.f9051h = yVar;
        this.f9044a = new ReentrantLock(true);
        d0 b3 = P.b(C0970v.f9165h);
        this.f9045b = b3;
        d0 b4 = P.b(C0972x.f9167h);
        this.f9046c = b4;
        this.f9048e = new K(b3);
        this.f9049f = new K(b4);
        this.f9050g = d3;
    }

    public final void a(C0945f c0945f) {
        z2.h.f(c0945f, "backStackEntry");
        ReentrantLock reentrantLock = this.f9044a;
        reentrantLock.lock();
        try {
            d0 d0Var = this.f9045b;
            d0Var.k(AbstractC0961m.Q((Collection) d0Var.getValue(), c0945f));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C0945f c0945f) {
        m mVar;
        z2.h.f(c0945f, "entry");
        y yVar = this.f9051h;
        boolean a3 = z2.h.a(yVar.f9140z.get(c0945f), Boolean.TRUE);
        d0 d0Var = this.f9046c;
        Set set = (Set) d0Var.getValue();
        z2.h.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0946A.m(set.size()));
        boolean z3 = false;
        for (Object obj : set) {
            boolean z4 = true;
            if (!z3 && z2.h.a(obj, c0945f)) {
                z3 = true;
                z4 = false;
            }
            if (z4) {
                linkedHashSet.add(obj);
            }
        }
        d0Var.k(linkedHashSet);
        yVar.f9140z.remove(c0945f);
        C0958j c0958j = yVar.f9122g;
        boolean contains = c0958j.contains(c0945f);
        d0 d0Var2 = yVar.f9124i;
        if (contains) {
            if (this.f9047d) {
                return;
            }
            yVar.u();
            yVar.f9123h.k(AbstractC0961m.Y(c0958j));
            d0Var2.k(yVar.r());
            return;
        }
        yVar.t(c0945f);
        if (c0945f.f9034o.f6909c.compareTo(EnumC0466o.f6900j) >= 0) {
            c0945f.h(EnumC0466o.f6898h);
        }
        boolean z5 = c0958j instanceof Collection;
        String str = c0945f.f9032m;
        if (!z5 || !c0958j.isEmpty()) {
            Iterator it = c0958j.iterator();
            while (it.hasNext()) {
                if (z2.h.a(((C0945f) it.next()).f9032m, str)) {
                    break;
                }
            }
        }
        if (!a3 && (mVar = yVar.f9131p) != null) {
            z2.h.f(str, "backStackEntryId");
            b0 b0Var = (b0) mVar.f9060b.remove(str);
            if (b0Var != null) {
                b0Var.a();
            }
        }
        yVar.u();
        d0Var2.k(yVar.r());
    }

    public final void c(C0945f c0945f, boolean z3) {
        z2.h.f(c0945f, "popUpTo");
        y yVar = this.f9051h;
        D b3 = yVar.f9136v.b(c0945f.f9028i.f9087h);
        yVar.f9140z.put(c0945f, Boolean.valueOf(z3));
        if (!z2.h.a(b3, this.f9050g)) {
            Object obj = yVar.f9137w.get(b3);
            z2.h.c(obj);
            ((i) obj).c(c0945f, z3);
            return;
        }
        y2.c cVar = yVar.f9139y;
        if (cVar != null) {
            cVar.l(c0945f);
            d(c0945f);
            return;
        }
        C0958j c0958j = yVar.f9122g;
        int indexOf = c0958j.indexOf(c0945f);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + c0945f + " as it was not found on the current back stack");
            return;
        }
        int i2 = indexOf + 1;
        if (i2 != c0958j.f9163j) {
            yVar.n(((C0945f) c0958j.get(i2)).f9028i.f9093n, true, false);
        }
        y.q(yVar, c0945f);
        d(c0945f);
        yVar.v();
        yVar.b();
    }

    public final void d(C0945f c0945f) {
        z2.h.f(c0945f, "popUpTo");
        ReentrantLock reentrantLock = this.f9044a;
        reentrantLock.lock();
        try {
            d0 d0Var = this.f9045b;
            Iterable iterable = (Iterable) d0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!z2.h.a((C0945f) obj, c0945f))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            d0Var.k(arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(C0945f c0945f, boolean z3) {
        Object obj;
        z2.h.f(c0945f, "popUpTo");
        d0 d0Var = this.f9046c;
        Iterable iterable = (Iterable) d0Var.getValue();
        boolean z4 = iterable instanceof Collection;
        K k3 = this.f9048e;
        if (!z4 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C0945f) it.next()) == c0945f) {
                    Iterable iterable2 = (Iterable) k3.f4811h.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C0945f) it2.next()) == c0945f) {
                        }
                    }
                    return;
                }
            }
        }
        d0Var.k(AbstractC0948C.m((Set) d0Var.getValue(), c0945f));
        List list = (List) k3.f4811h.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C0945f c0945f2 = (C0945f) obj;
            if (!z2.h.a(c0945f2, c0945f)) {
                M2.b0 b0Var = k3.f4811h;
                if (((List) b0Var.getValue()).lastIndexOf(c0945f2) < ((List) b0Var.getValue()).lastIndexOf(c0945f)) {
                    break;
                }
            }
        }
        C0945f c0945f3 = (C0945f) obj;
        if (c0945f3 != null) {
            d0Var.k(AbstractC0948C.m((Set) d0Var.getValue(), c0945f3));
        }
        c(c0945f, z3);
    }

    public final void f(C0945f c0945f) {
        z2.h.f(c0945f, "backStackEntry");
        y yVar = this.f9051h;
        D b3 = yVar.f9136v.b(c0945f.f9028i.f9087h);
        if (!z2.h.a(b3, this.f9050g)) {
            Object obj = yVar.f9137w.get(b3);
            if (obj != null) {
                ((i) obj).f(c0945f);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + c0945f.f9028i.f9087h + " should already be created").toString());
        }
        y2.c cVar = yVar.f9138x;
        if (cVar != null) {
            cVar.l(c0945f);
            a(c0945f);
        } else {
            Log.i("NavController", "Ignoring add of destination " + c0945f.f9028i + " outside of the call to navigate(). ");
        }
    }
}
