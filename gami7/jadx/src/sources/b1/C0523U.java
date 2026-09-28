package b1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: b1.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523U extends K1.f {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f7113e;

    /* renamed from: f, reason: collision with root package name */
    public final Window f7114f;

    public C0523U(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f7113e = insetsController;
        this.f7114f = window;
    }

    @Override // K1.f
    public final void N(boolean z3) {
        Window window = this.f7114f;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f7113e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f7113e.setSystemBarsAppearance(0, 8);
    }
}
