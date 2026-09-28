package b1;

import android.graphics.Insets;
import android.view.WindowInsets;

/* renamed from: b1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0516M extends C0515L {

    /* renamed from: n, reason: collision with root package name */
    public W0.b f7105n;

    /* renamed from: o, reason: collision with root package name */
    public W0.b f7106o;

    /* renamed from: p, reason: collision with root package name */
    public W0.b f7107p;

    public C0516M(C0521S c0521s, WindowInsets windowInsets) {
        super(c0521s, windowInsets);
        this.f7105n = null;
        this.f7106o = null;
        this.f7107p = null;
    }

    @Override // b1.C0518O
    public W0.b h() {
        Insets mandatorySystemGestureInsets;
        if (this.f7106o == null) {
            mandatorySystemGestureInsets = this.f7099c.getMandatorySystemGestureInsets();
            this.f7106o = W0.b.c(mandatorySystemGestureInsets);
        }
        return this.f7106o;
    }

    @Override // b1.C0518O
    public W0.b j() {
        Insets systemGestureInsets;
        if (this.f7105n == null) {
            systemGestureInsets = this.f7099c.getSystemGestureInsets();
            this.f7105n = W0.b.c(systemGestureInsets);
        }
        return this.f7105n;
    }

    @Override // b1.C0518O
    public W0.b l() {
        Insets tappableElementInsets;
        if (this.f7107p == null) {
            tappableElementInsets = this.f7099c.getTappableElementInsets();
            this.f7107p = W0.b.c(tappableElementInsets);
        }
        return this.f7107p;
    }

    @Override // b1.C0514K, b1.C0518O
    public void r(W0.b bVar) {
    }
}
