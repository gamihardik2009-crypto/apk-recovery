package b;

import a0.C0428e;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0466o;
import androidx.lifecycle.InterfaceC0470t;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import n2.C0958j;

/* renamed from: b.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499w {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f7040a;

    /* renamed from: b, reason: collision with root package name */
    public final C0958j f7041b = new C0958j();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0491o f7042c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f7043d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f7044e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7045f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7046g;

    public C0499w(Runnable runnable) {
        this.f7040a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f7043d = i2 >= 34 ? C0496t.f7033a.a(new C0492p(this, 0), new C0492p(this, 1), new C0493q(this, 0), new C0493q(this, 1)) : C0494r.f7028a.a(new C0493q(this, 2));
        }
    }

    public final void a(InterfaceC0470t interfaceC0470t, AbstractC0491o abstractC0491o) {
        z2.h.f(interfaceC0470t, "owner");
        z2.h.f(abstractC0491o, "onBackPressedCallback");
        C0472v e3 = interfaceC0470t.e();
        if (e3.f6909c == EnumC0466o.f6898h) {
            return;
        }
        abstractC0491o.f7022b.add(new C0497u(this, e3, abstractC0491o));
        e();
        abstractC0491o.f7023c = new C0428e(0, this, C0499w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        AbstractC0491o abstractC0491o;
        AbstractC0491o abstractC0491o2 = this.f7042c;
        if (abstractC0491o2 == null) {
            C0958j c0958j = this.f7041b;
            ListIterator listIterator = c0958j.listIterator(c0958j.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0491o = 0;
                    break;
                } else {
                    abstractC0491o = listIterator.previous();
                    if (((AbstractC0491o) abstractC0491o).f7021a) {
                        break;
                    }
                }
            }
            abstractC0491o2 = abstractC0491o;
        }
        this.f7042c = null;
        if (abstractC0491o2 != null) {
            abstractC0491o2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        AbstractC0491o abstractC0491o;
        AbstractC0491o abstractC0491o2 = this.f7042c;
        if (abstractC0491o2 == null) {
            C0958j c0958j = this.f7041b;
            ListIterator listIterator = c0958j.listIterator(c0958j.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0491o = 0;
                    break;
                } else {
                    abstractC0491o = listIterator.previous();
                    if (((AbstractC0491o) abstractC0491o).f7021a) {
                        break;
                    }
                }
            }
            abstractC0491o2 = abstractC0491o;
        }
        this.f7042c = null;
        if (abstractC0491o2 != null) {
            abstractC0491o2.b();
            return;
        }
        Runnable runnable = this.f7040a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f7044e;
        OnBackInvokedCallback onBackInvokedCallback = this.f7043d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0494r c0494r = C0494r.f7028a;
        if (z3 && !this.f7045f) {
            c0494r.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f7045f = true;
        } else {
            if (z3 || !this.f7045f) {
                return;
            }
            c0494r.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f7045f = false;
        }
    }

    public final void e() {
        boolean z3 = this.f7046g;
        C0958j c0958j = this.f7041b;
        boolean z4 = false;
        if (!(c0958j instanceof Collection) || !c0958j.isEmpty()) {
            Iterator it = c0958j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC0491o) it.next()).f7021a) {
                    z4 = true;
                    break;
                }
            }
        }
        this.f7046g = z4;
        if (z4 == z3 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z4);
    }
}
