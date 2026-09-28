package b1;

import android.view.WindowInsetsAnimation;

/* renamed from: b1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505B extends AbstractC0506C {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsAnimation f7076d;

    public C0505B(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f7076d = windowInsetsAnimation;
    }

    @Override // b1.AbstractC0506C
    public final long a() {
        long durationMillis;
        durationMillis = this.f7076d.getDurationMillis();
        return durationMillis;
    }

    @Override // b1.AbstractC0506C
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f7076d.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // b1.AbstractC0506C
    public final void c(float f3) {
        this.f7076d.setFraction(f3);
    }
}
