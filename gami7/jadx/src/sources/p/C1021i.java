package p;

import J2.AbstractC0327y;
import J2.C0311h;
import J2.InterfaceC0310g;
import m.AbstractC0837j;
import w.C1375e;

/* renamed from: p.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021i {

    /* renamed from: a, reason: collision with root package name */
    public final y2.a f9601a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0310g f9602b;

    public C1021i(C1375e c1375e, C0311h c0311h) {
        this.f9601a = c1375e;
        this.f9602b = c0311h;
    }

    public final String toString() {
        InterfaceC0310g interfaceC0310g = this.f9602b;
        AbstractC0837j.c(interfaceC0310g.n().s(AbstractC0327y.f4440i));
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        B2.a.j(16);
        String num = Integer.toString(hashCode, 16);
        z2.h.e(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        sb.append("(currentBounds()=");
        sb.append(this.f9601a.c());
        sb.append(", continuation=");
        sb.append(interfaceC0310g);
        sb.append(')');
        return sb.toString();
    }
}
