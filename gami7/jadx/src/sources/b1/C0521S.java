package b1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: b1.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521S {

    /* renamed from: b, reason: collision with root package name */
    public static final C0521S f7110b;

    /* renamed from: a, reason: collision with root package name */
    public final C0518O f7111a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f7110b = C0517N.q;
        } else {
            f7110b = C0518O.f7108b;
        }
    }

    public C0521S(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f7111a = new C0517N(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f7111a = new C0516M(this, windowInsets);
        } else if (i2 >= 28) {
            this.f7111a = new C0515L(this, windowInsets);
        } else {
            this.f7111a = new C0514K(this, windowInsets);
        }
    }

    public static C0521S b(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0521S c0521s = new C0521S(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i2 = AbstractC0542s.f7132a;
            C0521S a3 = AbstractC0536m.a(view);
            C0518O c0518o = c0521s.f7111a;
            c0518o.q(a3);
            c0518o.d(view.getRootView());
        }
        return c0521s;
    }

    public final WindowInsets a() {
        C0518O c0518o = this.f7111a;
        if (c0518o instanceof AbstractC0513J) {
            return ((AbstractC0513J) c0518o).f7099c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0521S)) {
            return false;
        }
        return Objects.equals(this.f7111a, ((C0521S) obj).f7111a);
    }

    public final int hashCode() {
        C0518O c0518o = this.f7111a;
        if (c0518o == null) {
            return 0;
        }
        return c0518o.hashCode();
    }

    public C0521S() {
        this.f7111a = new C0518O(this);
    }
}
