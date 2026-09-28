package m2;

import java.io.Serializable;

/* renamed from: m2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881w implements InterfaceC0862d, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public y2.a f8658h;

    /* renamed from: i, reason: collision with root package name */
    public Object f8659i;

    @Override // m2.InterfaceC0862d
    public final Object getValue() {
        if (this.f8659i == C0877s.f8656a) {
            y2.a aVar = this.f8658h;
            z2.h.c(aVar);
            this.f8659i = aVar.c();
            this.f8658h = null;
        }
        return this.f8659i;
    }

    public final String toString() {
        return this.f8659i != C0877s.f8656a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
