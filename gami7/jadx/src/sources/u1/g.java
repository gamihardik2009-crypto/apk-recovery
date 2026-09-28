package u1;

import android.view.View;
import com.example.bulksmsscheduler.R;
import z2.h;
import z2.i;

/* loaded from: classes.dex */
public final class g extends i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final g f11267j = new g(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f11268k = new g(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11269i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i2, int i3) {
        super(i2);
        this.f11269i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f11269i) {
            case 0:
                View view = (View) obj;
                h.f(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                h.f(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof f) {
                    return (f) tag;
                }
                return null;
        }
    }
}
