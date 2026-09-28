package u0;

import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: u0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1276b0 implements V0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f11030a;

    public C1276b0(ViewConfiguration viewConfiguration) {
        this.f11030a = viewConfiguration;
    }

    @Override // u0.V0
    public final float a() {
        return this.f11030a.getScaledTouchSlop();
    }

    @Override // u0.V0
    public final float b() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1278c0.f11036a.b(this.f11030a);
        }
        return 2.0f;
    }

    @Override // u0.V0
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1278c0.f11036a.a(this.f11030a);
        }
        return 16.0f;
    }

    @Override // u0.V0
    public final float d() {
        return this.f11030a.getScaledMaximumFlingVelocity();
    }

    @Override // u0.V0
    public final long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // u0.V0
    public final long f() {
        return ViewConfiguration.getLongPressTimeout();
    }
}
