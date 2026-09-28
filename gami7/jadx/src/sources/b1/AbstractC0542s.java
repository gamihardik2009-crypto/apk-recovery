package b1;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.example.bulksmsscheduler.R;
import java.util.WeakHashMap;
import s.RunnableC1149B;

/* renamed from: b1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0542s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7132a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(View view, RunnableC1149B runnableC1149B) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(runnableC1149B != null ? new C0504A(runnableC1149B) : null);
            return;
        }
        PathInterpolator pathInterpolator = C0549z.f7143d;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (runnableC1149B == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0548y = new ViewOnApplyWindowInsetsListenerC0548y(view, runnableC1149B);
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0548y);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0548y);
        }
    }
}
