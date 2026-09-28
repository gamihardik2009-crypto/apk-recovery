package b1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.example.bulksmsscheduler.R;
import i1.InterpolatorC0734a;
import s.RunnableC1149B;
import s.Z;

/* renamed from: b1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549z extends AbstractC0506C {

    /* renamed from: d, reason: collision with root package name */
    public static final PathInterpolator f7143d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final InterpolatorC0734a f7144e = new InterpolatorC0734a(InterpolatorC0734a.f7959c);

    /* renamed from: f, reason: collision with root package name */
    public static final DecelerateInterpolator f7145f = new DecelerateInterpolator();

    public static void d(View view, C0507D c0507d) {
        RunnableC1149B i2 = i(view);
        if (i2 != null) {
            i2.b(c0507d);
            if (i2.f10038i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                d(viewGroup.getChildAt(i3), c0507d);
            }
        }
    }

    public static void e(View view, WindowInsets windowInsets, boolean z3) {
        RunnableC1149B i2 = i(view);
        if (i2 != null) {
            i2.f10037h = windowInsets;
            if (!z3) {
                z3 = true;
                i2.f10040k = true;
                i2.f10041l = true;
                if (i2.f10038i != 0) {
                    z3 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                e(viewGroup.getChildAt(i3), windowInsets, z3);
            }
        }
    }

    public static void f(View view, C0521S c0521s) {
        RunnableC1149B i2 = i(view);
        if (i2 != null) {
            Z z3 = i2.f10039j;
            Z.a(z3, c0521s);
            if (z3.f10108r) {
                c0521s = C0521S.f7110b;
            }
            if (i2.f10038i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                f(viewGroup.getChildAt(i3), c0521s);
            }
        }
    }

    public static void g(View view) {
        RunnableC1149B i2 = i(view);
        if (i2 != null) {
            i2.f10040k = false;
            if (i2.f10038i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                g(viewGroup.getChildAt(i3));
            }
        }
    }

    public static WindowInsets h(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static RunnableC1149B i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0548y) {
            return ((ViewOnApplyWindowInsetsListenerC0548y) tag).f7141a;
        }
        return null;
    }
}
