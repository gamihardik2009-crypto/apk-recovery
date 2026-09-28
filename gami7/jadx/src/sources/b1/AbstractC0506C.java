package b1;

import android.view.animation.Interpolator;

/* renamed from: b1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0506C {

    /* renamed from: a, reason: collision with root package name */
    public float f7077a;

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f7078b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7079c;

    public AbstractC0506C(Interpolator interpolator, long j3) {
        this.f7078b = interpolator;
        this.f7079c = j3;
    }

    public long a() {
        return this.f7079c;
    }

    public float b() {
        Interpolator interpolator = this.f7078b;
        return interpolator != null ? interpolator.getInterpolation(this.f7077a) : this.f7077a;
    }

    public void c(float f3) {
        this.f7077a = f3;
    }
}
