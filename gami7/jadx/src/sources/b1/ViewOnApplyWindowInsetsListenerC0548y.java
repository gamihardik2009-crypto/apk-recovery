package b1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import s.RunnableC1149B;

/* renamed from: b1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0548y implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC1149B f7141a;

    /* renamed from: b, reason: collision with root package name */
    public C0521S f7142b;

    public ViewOnApplyWindowInsetsListenerC0548y(View view, RunnableC1149B runnableC1149B) {
        C0521S c0521s;
        this.f7141a = runnableC1149B;
        int i2 = AbstractC0542s.f7132a;
        C0521S a3 = AbstractC0536m.a(view);
        if (a3 != null) {
            int i3 = Build.VERSION.SDK_INT;
            c0521s = (i3 >= 30 ? new C0511H(a3) : i3 >= 29 ? new C0510G(a3) : new C0509F(a3)).b();
        } else {
            c0521s = null;
        }
        this.f7142b = c0521s;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0518O c0518o;
        if (!view.isLaidOut()) {
            this.f7142b = C0521S.b(view, windowInsets);
            return C0549z.h(view, windowInsets);
        }
        C0521S b3 = C0521S.b(view, windowInsets);
        if (this.f7142b == null) {
            int i2 = AbstractC0542s.f7132a;
            this.f7142b = AbstractC0536m.a(view);
        }
        if (this.f7142b == null) {
            this.f7142b = b3;
            return C0549z.h(view, windowInsets);
        }
        RunnableC1149B i3 = C0549z.i(view);
        if (i3 != null && Objects.equals(i3.f10037h, windowInsets)) {
            return C0549z.h(view, windowInsets);
        }
        C0521S c0521s = this.f7142b;
        int i4 = 1;
        int i5 = 0;
        while (true) {
            c0518o = b3.f7111a;
            if (i4 > 256) {
                break;
            }
            if (!c0518o.f(i4).equals(c0521s.f7111a.f(i4))) {
                i5 |= i4;
            }
            i4 <<= 1;
        }
        if (i5 == 0) {
            return C0549z.h(view, windowInsets);
        }
        C0521S c0521s2 = this.f7142b;
        C0507D c0507d = new C0507D(i5, (i5 & 8) != 0 ? c0518o.f(8).f5894d > c0521s2.f7111a.f(8).f5894d ? C0549z.f7143d : C0549z.f7144e : C0549z.f7145f, 160L);
        c0507d.f7080a.c(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0507d.f7080a.a());
        W0.b f3 = c0518o.f(i5);
        W0.b f4 = c0521s2.f7111a.f(i5);
        int min = Math.min(f3.f5891a, f4.f5891a);
        int i6 = f3.f5892b;
        int i7 = f4.f5892b;
        int min2 = Math.min(i6, i7);
        int i8 = f3.f5893c;
        int i9 = f4.f5893c;
        int min3 = Math.min(i8, i9);
        int i10 = f3.f5894d;
        int i11 = i5;
        int i12 = f4.f5894d;
        K1.l lVar = new K1.l(W0.b.b(min, min2, min3, Math.min(i10, i12)), 2, W0.b.b(Math.max(f3.f5891a, f4.f5891a), Math.max(i6, i7), Math.max(i8, i9), Math.max(i10, i12)));
        C0549z.e(view, windowInsets, false);
        duration.addUpdateListener(new C0546w(c0507d, b3, c0521s2, i11, view));
        duration.addListener(new C0547x(view, c0507d));
        ViewTreeObserverOnPreDrawListenerC0530g viewTreeObserverOnPreDrawListenerC0530g = new ViewTreeObserverOnPreDrawListenerC0530g(view, new B1.F(view, c0507d, lVar, duration));
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0530g);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0530g);
        this.f7142b = b3;
        return C0549z.h(view, windowInsets);
    }
}
