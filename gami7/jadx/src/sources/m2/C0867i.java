package m2;

import java.io.Serializable;

/* renamed from: m2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0867i implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final Throwable f8648h;

    public C0867i(Throwable th) {
        z2.h.f(th, "exception");
        this.f8648h = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0867i) {
            if (z2.h.a(this.f8648h, ((C0867i) obj).f8648h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8648h.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f8648h + ')';
    }
}
