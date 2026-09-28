package b1;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: b1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507D {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0506C f7080a;

    public C0507D(int i2, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7080a = new C0505B(D0.i.k(i2, interpolator, j3));
        } else {
            this.f7080a = new C0549z(interpolator, j3);
        }
    }
}
