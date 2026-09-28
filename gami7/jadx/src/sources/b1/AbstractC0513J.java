package b1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: b1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0513J extends C0518O {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f7094h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f7095i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f7096j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f7097k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f7098l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f7099c;

    /* renamed from: d, reason: collision with root package name */
    public W0.b[] f7100d;

    /* renamed from: e, reason: collision with root package name */
    public W0.b f7101e;

    /* renamed from: f, reason: collision with root package name */
    public C0521S f7102f;

    /* renamed from: g, reason: collision with root package name */
    public W0.b f7103g;

    public AbstractC0513J(C0521S c0521s, WindowInsets windowInsets) {
        super(c0521s);
        this.f7101e = null;
        this.f7099c = windowInsets;
    }

    private W0.b s(int i2, boolean z3) {
        W0.b bVar = W0.b.f5890e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                bVar = W0.b.a(bVar, t(i3, z3));
            }
        }
        return bVar;
    }

    private W0.b u() {
        C0521S c0521s = this.f7102f;
        return c0521s != null ? c0521s.f7111a.i() : W0.b.f5890e;
    }

    private W0.b v(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f7094h) {
            x();
        }
        Method method = f7095i;
        if (method != null && f7096j != null && f7097k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f7097k.get(f7098l.get(invoke));
                if (rect != null) {
                    return W0.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    private static void x() {
        try {
            f7095i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f7096j = cls;
            f7097k = cls.getDeclaredField("mVisibleInsets");
            f7098l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f7097k.setAccessible(true);
            f7098l.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f7094h = true;
    }

    @Override // b1.C0518O
    public void d(View view) {
        W0.b v3 = v(view);
        if (v3 == null) {
            v3 = W0.b.f5890e;
        }
        y(v3);
    }

    @Override // b1.C0518O
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f7103g, ((AbstractC0513J) obj).f7103g);
        }
        return false;
    }

    @Override // b1.C0518O
    public W0.b f(int i2) {
        return s(i2, false);
    }

    @Override // b1.C0518O
    public W0.b g(int i2) {
        return s(i2, true);
    }

    @Override // b1.C0518O
    public final W0.b k() {
        if (this.f7101e == null) {
            WindowInsets windowInsets = this.f7099c;
            this.f7101e = W0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f7101e;
    }

    @Override // b1.C0518O
    public boolean n() {
        return this.f7099c.isRound();
    }

    @Override // b1.C0518O
    public boolean o(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !w(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // b1.C0518O
    public void p(W0.b[] bVarArr) {
        this.f7100d = bVarArr;
    }

    @Override // b1.C0518O
    public void q(C0521S c0521s) {
        this.f7102f = c0521s;
    }

    public W0.b t(int i2, boolean z3) {
        W0.b i3;
        int i4;
        if (i2 == 1) {
            return z3 ? W0.b.b(0, Math.max(u().f5892b, k().f5892b), 0, 0) : W0.b.b(0, k().f5892b, 0, 0);
        }
        if (i2 == 2) {
            if (z3) {
                W0.b u3 = u();
                W0.b i5 = i();
                return W0.b.b(Math.max(u3.f5891a, i5.f5891a), 0, Math.max(u3.f5893c, i5.f5893c), Math.max(u3.f5894d, i5.f5894d));
            }
            W0.b k3 = k();
            C0521S c0521s = this.f7102f;
            i3 = c0521s != null ? c0521s.f7111a.i() : null;
            int i6 = k3.f5894d;
            if (i3 != null) {
                i6 = Math.min(i6, i3.f5894d);
            }
            return W0.b.b(k3.f5891a, 0, k3.f5893c, i6);
        }
        W0.b bVar = W0.b.f5890e;
        if (i2 == 8) {
            W0.b[] bVarArr = this.f7100d;
            i3 = bVarArr != null ? bVarArr[C1.y.C(8)] : null;
            if (i3 != null) {
                return i3;
            }
            W0.b k4 = k();
            W0.b u4 = u();
            int i7 = k4.f5894d;
            if (i7 > u4.f5894d) {
                return W0.b.b(0, 0, 0, i7);
            }
            W0.b bVar2 = this.f7103g;
            return (bVar2 == null || bVar2.equals(bVar) || (i4 = this.f7103g.f5894d) <= u4.f5894d) ? bVar : W0.b.b(0, 0, 0, i4);
        }
        if (i2 == 16) {
            return j();
        }
        if (i2 == 32) {
            return h();
        }
        if (i2 == 64) {
            return l();
        }
        if (i2 != 128) {
            return bVar;
        }
        C0521S c0521s2 = this.f7102f;
        C0528e e3 = c0521s2 != null ? c0521s2.f7111a.e() : e();
        if (e3 == null) {
            return bVar;
        }
        int i8 = Build.VERSION.SDK_INT;
        return W0.b.b(i8 >= 28 ? AbstractC0526c.d(e3.f7119a) : 0, i8 >= 28 ? AbstractC0526c.f(e3.f7119a) : 0, i8 >= 28 ? AbstractC0526c.e(e3.f7119a) : 0, i8 >= 28 ? AbstractC0526c.c(e3.f7119a) : 0);
    }

    public boolean w(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !t(i2, false).equals(W0.b.f5890e);
    }

    public void y(W0.b bVar) {
        this.f7103g = bVar;
    }
}
