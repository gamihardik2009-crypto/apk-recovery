package J;

import j.C0769y;

/* renamed from: J.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0769y f4118a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0256b0) {
            return z2.h.a(this.f4118a, ((C0256b0) obj).f4118a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4118a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f4118a + ')';
    }
}
