package androidx.lifecycle;

import android.view.View;
import com.example.bulksmsscheduler.R;

/* loaded from: classes.dex */
public final class d0 extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final d0 f6888j = new d0(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final d0 f6889k = new d0(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final d0 f6890l = new d0(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final d0 f6891m = new d0(1, 3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6892i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i2, int i3) {
        super(i2);
        this.f6892i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f6892i) {
            case 0:
                View view = (View) obj;
                z2.h.f(view, "currentView");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 1:
                View view2 = (View) obj;
                z2.h.f(view2, "viewParent");
                Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof InterfaceC0470t) {
                    return (InterfaceC0470t) tag;
                }
                return null;
            case 2:
                View view3 = (View) obj;
                z2.h.f(view3, "view");
                Object parent2 = view3.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            default:
                View view4 = (View) obj;
                z2.h.f(view4, "view");
                Object tag2 = view4.getTag(R.id.view_tree_view_model_store_owner);
                if (tag2 instanceof c0) {
                    return (c0) tag2;
                }
                return null;
        }
    }
}
