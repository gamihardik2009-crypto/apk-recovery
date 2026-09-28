package n0;

import android.view.MotionEvent;

/* renamed from: n0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0927f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0927f f8933a = new C0927f();

    public final long a(MotionEvent motionEvent, int i2) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i2);
        rawY = motionEvent.getRawY(i2);
        return K1.f.e(rawX, rawY);
    }
}
