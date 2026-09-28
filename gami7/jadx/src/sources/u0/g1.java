package u0;

import J.C0303z0;
import android.view.View;

/* loaded from: classes.dex */
public final class g1 implements View.OnAttachStateChangeListener {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f11053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0303z0 f11054i;

    public g1(View view, C0303z0 c0303z0) {
        this.f11053h = view;
        this.f11054i = c0303z0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f11053h.removeOnAttachStateChangeListener(this);
        this.f11054i.t();
    }
}
