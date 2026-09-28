package o;

import J.C0257c;
import J.C0274k0;
import J.W;

/* renamed from: o.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0988n {

    /* renamed from: a, reason: collision with root package name */
    public final C0274k0 f9216a = C0257c.N(C0985k.f9214a, W.f4109m);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0988n) {
            return z2.h.a((AbstractC0987m) ((C0988n) obj).f9216a.getValue(), (AbstractC0987m) this.f9216a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC0987m) this.f9216a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((AbstractC0987m) this.f9216a.getValue()) + ')';
    }
}
