package c0;

import android.os.Build;
import android.view.ViewGroup;
import com.example.bulksmsscheduler.R;
import e0.C0652b;
import f0.C0663b;
import f0.C0666e;
import f0.C0668g;
import f0.C0670i;
import f0.InterfaceC0665d;
import g0.AbstractC0677a;
import g0.C0678b;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587f implements InterfaceC0561A {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f7249d = true;

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f7250a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7251b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public C0678b f7252c;

    public C0587f(ViewGroup viewGroup) {
        this.f7250a = viewGroup;
    }

    @Override // c0.InterfaceC0561A
    public final void a(C0663b c0663b) {
        synchronized (this.f7251b) {
            if (!c0663b.q) {
                c0663b.q = true;
                c0663b.b();
            }
        }
    }

    @Override // c0.InterfaceC0561A
    public final C0663b b() {
        InterfaceC0665d c0670i;
        C0663b c0663b;
        synchronized (this.f7251b) {
            try {
                ViewGroup viewGroup = this.f7250a;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    AbstractC0586e.a(viewGroup);
                }
                if (i2 >= 29) {
                    c0670i = new C0668g();
                } else if (f7249d) {
                    try {
                        c0670i = new C0666e(this.f7250a, new C0601t(), new C0652b());
                    } catch (Throwable unused) {
                        f7249d = false;
                        c0670i = new C0670i(c(this.f7250a));
                    }
                } else {
                    c0670i = new C0670i(c(this.f7250a));
                }
                c0663b = new C0663b(c0670i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0663b;
    }

    public final AbstractC0677a c(ViewGroup viewGroup) {
        C0678b c0678b = this.f7252c;
        if (c0678b != null) {
            return c0678b;
        }
        C0678b c0678b2 = new C0678b(viewGroup.getContext());
        c0678b2.setClipChildren(false);
        c0678b2.setClipToPadding(false);
        c0678b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewGroup.addView(c0678b2);
        this.f7252c = c0678b2;
        return c0678b2;
    }
}
