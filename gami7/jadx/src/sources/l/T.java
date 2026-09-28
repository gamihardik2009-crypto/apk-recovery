package l;

import m.InterfaceC0817A;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f8164a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0817A f8165b;

    public T(InterfaceC0817A interfaceC0817A, y2.c cVar) {
        this.f8164a = cVar;
        this.f8165b = interfaceC0817A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t3 = (T) obj;
        return z2.h.a(this.f8164a, t3.f8164a) && z2.h.a(this.f8165b, t3.f8165b);
    }

    public final int hashCode() {
        return this.f8165b.hashCode() + (this.f8164a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f8164a + ", animationSpec=" + this.f8165b + ')';
    }
}
