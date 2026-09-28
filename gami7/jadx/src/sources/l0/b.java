package l0;

import android.view.KeyEvent;
import z2.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f8278a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return h.a(this.f8278a, ((b) obj).f8278a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8278a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f8278a + ')';
    }
}
