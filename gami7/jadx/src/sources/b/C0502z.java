package b;

import android.view.View;
import com.example.bulksmsscheduler.R;

/* renamed from: b.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502z extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C0502z f7049j = new C0502z(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0502z f7050k = new C0502z(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7051i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0502z(int i2, int i3) {
        super(i2);
        this.f7051i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f7051i) {
            case 0:
                View view = (View) obj;
                z2.h.f(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                z2.h.f(view2, "it");
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof InterfaceC0501y) {
                    return (InterfaceC0501y) tag;
                }
                return null;
        }
    }
}
