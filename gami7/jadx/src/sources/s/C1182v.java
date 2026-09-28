package s;

import s0.InterfaceC1189c;
import s0.InterfaceC1193g;

/* renamed from: s.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1182v implements InterfaceC1189c {

    /* renamed from: b, reason: collision with root package name */
    public final y2.c f10181b;

    /* renamed from: c, reason: collision with root package name */
    public Y f10182c;

    public C1182v(y2.c cVar) {
        this.f10181b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1182v) && ((C1182v) obj).f10181b == this.f10181b;
    }

    public final int hashCode() {
        return this.f10181b.hashCode();
    }

    @Override // s0.InterfaceC1189c
    public final void i(InterfaceC1193g interfaceC1193g) {
        Y y3 = (Y) interfaceC1193g.i(b0.f10122a);
        if (z2.h.a(y3, this.f10182c)) {
            return;
        }
        this.f10182c = y3;
        this.f10181b.l(y3);
    }
}
