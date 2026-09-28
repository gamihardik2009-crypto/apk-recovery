package s;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import b1.C0507D;
import b1.C0518O;
import b1.C0521S;
import b1.InterfaceC0529f;

/* renamed from: s.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1149B implements Runnable, InterfaceC0529f, View.OnAttachStateChangeListener {

    /* renamed from: h, reason: collision with root package name */
    public WindowInsets f10037h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10038i;

    /* renamed from: j, reason: collision with root package name */
    public final Z f10039j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10040k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10041l;

    /* renamed from: m, reason: collision with root package name */
    public C0521S f10042m;

    public RunnableC1149B(Z z3) {
        this.f10038i = !z3.f10108r ? 1 : 0;
        this.f10039j = z3;
    }

    public final C0521S a(View view, C0521S c0521s) {
        this.f10042m = c0521s;
        Z z3 = this.f10039j;
        z3.getClass();
        C0518O c0518o = c0521s.f7111a;
        z3.f10107p.f(AbstractC1166e.e(c0518o.f(8)));
        if (this.f10040k) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f10041l) {
            z3.q.f(AbstractC1166e.e(c0518o.f(8)));
            Z.a(z3, c0521s);
        }
        return z3.f10108r ? C0521S.f7110b : c0521s;
    }

    public final void b(C0507D c0507d) {
        this.f10040k = false;
        this.f10041l = false;
        C0521S c0521s = this.f10042m;
        if (c0507d.f7080a.a() != 0 && c0521s != null) {
            Z z3 = this.f10039j;
            z3.getClass();
            C0518O c0518o = c0521s.f7111a;
            z3.q.f(AbstractC1166e.e(c0518o.f(8)));
            z3.f10107p.f(AbstractC1166e.e(c0518o.f(8)));
            Z.a(z3, c0521s);
        }
        this.f10042m = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10040k) {
            this.f10040k = false;
            this.f10041l = false;
            C0521S c0521s = this.f10042m;
            if (c0521s != null) {
                Z z3 = this.f10039j;
                z3.getClass();
                z3.q.f(AbstractC1166e.e(c0521s.f7111a.f(8)));
                Z.a(z3, c0521s);
                this.f10042m = null;
            }
        }
    }
}
