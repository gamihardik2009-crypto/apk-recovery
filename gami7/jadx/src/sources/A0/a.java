package A0;

import m2.InterfaceC0861c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0861c f17b;

    public a(String str, InterfaceC0861c interfaceC0861c) {
        this.f16a = str;
        this.f17b = interfaceC0861c;
    }

    public final String a() {
        return this.f16a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return z2.h.a(this.f16a, aVar.f16a) && z2.h.a(this.f17b, aVar.f17b);
    }

    public final int hashCode() {
        String str = this.f16a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC0861c interfaceC0861c = this.f17b;
        return hashCode + (interfaceC0861c != null ? interfaceC0861c.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f16a + ", action=" + this.f17b + ')';
    }
}
