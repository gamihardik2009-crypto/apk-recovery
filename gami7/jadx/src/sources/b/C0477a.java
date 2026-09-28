package b;

import android.window.BackEvent;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0477a f6970a = new C0477a();

    public final BackEvent a(float f3, float f4, float f5, int i2) {
        return new BackEvent(f3, f4, f5, i2);
    }

    public final float b(BackEvent backEvent) {
        z2.h.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        z2.h.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        z2.h.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        z2.h.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
