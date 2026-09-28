package b1;

import android.view.View;
import android.view.Window;

/* renamed from: b1.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522T extends K1.f {

    /* renamed from: e, reason: collision with root package name */
    public final Window f7112e;

    public C0522T(Window window) {
        this.f7112e = window;
    }

    @Override // K1.f
    public final void N(boolean z3) {
        Window window = this.f7112e;
        if (!z3) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
