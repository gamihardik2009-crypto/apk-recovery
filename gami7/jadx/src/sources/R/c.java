package R;

import z2.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f5374a;

    public c(int i2) {
        this.f5374a = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f5374a);
        sb.append(")@");
        int hashCode = hashCode();
        B2.a.j(16);
        String num = Integer.toString(hashCode, 16);
        h.e(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }
}
