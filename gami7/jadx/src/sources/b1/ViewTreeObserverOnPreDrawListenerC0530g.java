package b1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: b1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0530g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: h, reason: collision with root package name */
    public final View f7120h;

    /* renamed from: i, reason: collision with root package name */
    public ViewTreeObserver f7121i;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f7122j;

    public ViewTreeObserverOnPreDrawListenerC0530g(View view, B1.F f3) {
        this.f7120h = view;
        this.f7121i = view.getViewTreeObserver();
        this.f7122j = f3;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f7121i.isAlive();
        View view = this.f7120h;
        if (isAlive) {
            this.f7121i.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f7122j.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f7121i = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f7121i.isAlive();
        View view2 = this.f7120h;
        if (isAlive) {
            this.f7121i.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
