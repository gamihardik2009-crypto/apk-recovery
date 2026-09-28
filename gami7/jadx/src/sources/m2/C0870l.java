package m2;

import java.io.Serializable;

/* renamed from: m2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0870l implements InterfaceC0862d, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public y2.a f8652h;

    /* renamed from: i, reason: collision with root package name */
    public volatile Object f8653i = C0877s.f8656a;

    /* renamed from: j, reason: collision with root package name */
    public final Object f8654j = this;

    public C0870l(y2.a aVar) {
        this.f8652h = aVar;
    }

    @Override // m2.InterfaceC0862d
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f8653i;
        C0877s c0877s = C0877s.f8656a;
        if (obj2 != c0877s) {
            return obj2;
        }
        synchronized (this.f8654j) {
            obj = this.f8653i;
            if (obj == c0877s) {
                y2.a aVar = this.f8652h;
                z2.h.c(aVar);
                obj = aVar.c();
                this.f8653i = obj;
                this.f8652h = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f8653i != C0877s.f8656a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
