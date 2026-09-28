package O2;

import q2.InterfaceC1077h;

/* loaded from: classes.dex */
public final class z implements InterfaceC1077h {

    /* renamed from: h, reason: collision with root package name */
    public final ThreadLocal f5218h;

    public z(ThreadLocal threadLocal) {
        this.f5218h = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && z2.h.a(this.f5218h, ((z) obj).f5218h);
    }

    public final int hashCode() {
        return this.f5218h.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f5218h + ')';
    }
}
