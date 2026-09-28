package u0;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import b1.C0544u;
import com.example.bulksmsscheduler.R;
import java.util.Iterator;

/* renamed from: u0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1320y implements View.OnAttachStateChangeListener {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11255h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f11256i;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1320y(int i2, Object obj) {
        this.f11255h = i2;
        this.f11256i = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f11255h) {
            case 0:
                G g3 = (G) this.f11256i;
                AccessibilityManager accessibilityManager = g3.f10877g;
                accessibilityManager.addAccessibilityStateChangeListener(g3.f10879i);
                accessibilityManager.addTouchExplorationStateChangeListener(g3.f10880j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f11255h) {
            case 0:
                G g3 = (G) this.f11256i;
                g3.f10882l.removeCallbacks(g3.f10871K);
                AccessibilityManager accessibilityManager = g3.f10877g;
                accessibilityManager.removeAccessibilityStateChangeListener(g3.f10879i);
                accessibilityManager.removeTouchExplorationStateChangeListener(g3.f10880j);
                break;
            case 1:
                AbstractC1273a abstractC1273a = (AbstractC1273a) this.f11256i;
                z2.h.f(abstractC1273a, "<this>");
                Iterator it = G2.i.i0(abstractC1273a.getParent(), C0544u.f7133p).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r1 r1Var = abstractC1273a.f11021j;
                        if (r1Var != null) {
                            r1Var.a();
                        }
                        abstractC1273a.f11021j = null;
                        abstractC1273a.requestLayout();
                        break;
                    } else {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            z2.h.f(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null && bool.booleanValue()) {
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((J2.Z) this.f11256i).a(null);
                break;
        }
    }
}
