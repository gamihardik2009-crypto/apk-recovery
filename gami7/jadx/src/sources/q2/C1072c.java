package q2;

import B1.t;
import java.io.Serializable;

/* renamed from: q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072c implements InterfaceC1078i, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1078i f9780h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1076g f9781i;

    public C1072c(InterfaceC1076g interfaceC1076g, InterfaceC1078i interfaceC1078i) {
        z2.h.f(interfaceC1078i, "left");
        z2.h.f(interfaceC1076g, "element");
        this.f9780h = interfaceC1078i;
        this.f9781i = interfaceC1076g;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i A(InterfaceC1078i interfaceC1078i) {
        z2.h.f(interfaceC1078i, "context");
        return interfaceC1078i == C1079j.f9784h ? this : (InterfaceC1078i) interfaceC1078i.y(this, C1071b.f9778k);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1072c) {
                C1072c c1072c = (C1072c) obj;
                c1072c.getClass();
                int i2 = 2;
                C1072c c1072c2 = c1072c;
                int i3 = 2;
                while (true) {
                    InterfaceC1078i interfaceC1078i = c1072c2.f9780h;
                    c1072c2 = interfaceC1078i instanceof C1072c ? (C1072c) interfaceC1078i : null;
                    if (c1072c2 == null) {
                        break;
                    }
                    i3++;
                }
                C1072c c1072c3 = this;
                while (true) {
                    InterfaceC1078i interfaceC1078i2 = c1072c3.f9780h;
                    c1072c3 = interfaceC1078i2 instanceof C1072c ? (C1072c) interfaceC1078i2 : null;
                    if (c1072c3 == null) {
                        break;
                    }
                    i2++;
                }
                if (i3 == i2) {
                    C1072c c1072c4 = this;
                    while (true) {
                        InterfaceC1076g interfaceC1076g = c1072c4.f9781i;
                        if (!z2.h.a(c1072c.s(interfaceC1076g.getKey()), interfaceC1076g)) {
                            break;
                        }
                        InterfaceC1078i interfaceC1078i3 = c1072c4.f9780h;
                        if (interfaceC1078i3 instanceof C1072c) {
                            c1072c4 = (C1072c) interfaceC1078i3;
                        } else {
                            z2.h.d(interfaceC1078i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            InterfaceC1076g interfaceC1076g2 = (InterfaceC1076g) interfaceC1078i3;
                            if (z2.h.a(c1072c.s(interfaceC1076g2.getKey()), interfaceC1076g2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i h(InterfaceC1077h interfaceC1077h) {
        z2.h.f(interfaceC1077h, "key");
        InterfaceC1076g interfaceC1076g = this.f9781i;
        InterfaceC1076g s3 = interfaceC1076g.s(interfaceC1077h);
        InterfaceC1078i interfaceC1078i = this.f9780h;
        if (s3 != null) {
            return interfaceC1078i;
        }
        InterfaceC1078i h2 = interfaceC1078i.h(interfaceC1077h);
        return h2 == interfaceC1078i ? this : h2 == C1079j.f9784h ? interfaceC1076g : new C1072c(interfaceC1076g, h2);
    }

    public final int hashCode() {
        return this.f9781i.hashCode() + this.f9780h.hashCode();
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1076g s(InterfaceC1077h interfaceC1077h) {
        z2.h.f(interfaceC1077h, "key");
        C1072c c1072c = this;
        while (true) {
            InterfaceC1076g s3 = c1072c.f9781i.s(interfaceC1077h);
            if (s3 != null) {
                return s3;
            }
            InterfaceC1078i interfaceC1078i = c1072c.f9780h;
            if (!(interfaceC1078i instanceof C1072c)) {
                return interfaceC1078i.s(interfaceC1077h);
            }
            c1072c = (C1072c) interfaceC1078i;
        }
    }

    public final String toString() {
        return t.k(new StringBuilder("["), (String) y("", C1071b.f9777j), ']');
    }

    @Override // q2.InterfaceC1078i
    public final Object y(Object obj, y2.e eVar) {
        return eVar.j(this.f9780h.y(obj, eVar), this.f9781i);
    }
}
