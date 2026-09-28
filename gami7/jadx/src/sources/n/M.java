package n;

import android.content.Context;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class M extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f8699a;

    /* renamed from: b, reason: collision with root package name */
    public float f8700b;

    public M(Context context) {
        super(context);
        this.f8699a = l0.c.d(context).f5135h * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i2) {
        this.f8700b = 0.0f;
        super.onAbsorb(i2);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f3, float f4) {
        this.f8700b = 0.0f;
        super.onPull(f3, f4);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f8700b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f3) {
        this.f8700b = 0.0f;
        super.onPull(f3);
    }
}
