package l;

import m.InterfaceC0817A;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final float f8132a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0817A f8133b;

    public G(float f3, InterfaceC0817A interfaceC0817A) {
        this.f8132a = f3;
        this.f8133b = interfaceC0817A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return Float.compare(this.f8132a, g3.f8132a) == 0 && z2.h.a(this.f8133b, g3.f8133b);
    }

    public final int hashCode() {
        return this.f8133b.hashCode() + (Float.hashCode(this.f8132a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f8132a + ", animationSpec=" + this.f8133b + ')';
    }
}
