package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: b1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547x extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0507D f7139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7140b;

    public C0547x(View view, C0507D c0507d) {
        this.f7139a = c0507d;
        this.f7140b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0507D c0507d = this.f7139a;
        c0507d.f7080a.c(1.0f);
        C0549z.d(this.f7140b, c0507d);
    }
}
