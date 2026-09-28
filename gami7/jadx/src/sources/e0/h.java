package e0;

import B1.t;
import c0.AbstractC0571K;
import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class h extends AbstractC0655e {

    /* renamed from: a, reason: collision with root package name */
    public final float f7557a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7558b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7559c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7560d;

    public h(float f3, float f4, int i2, int i3, int i4) {
        f4 = (i4 & 2) != 0 ? 4.0f : f4;
        i2 = (i4 & 4) != 0 ? 0 : i2;
        i3 = (i4 & 8) != 0 ? 0 : i3;
        this.f7557a = f3;
        this.f7558b = f4;
        this.f7559c = i2;
        this.f7560d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f7557a != hVar.f7557a || this.f7558b != hVar.f7558b || !AbstractC0571K.o(this.f7559c, hVar.f7559c) || !AbstractC0571K.p(this.f7560d, hVar.f7560d)) {
            return false;
        }
        hVar.getClass();
        return z2.h.a(null, null);
    }

    public final int hashCode() {
        return AbstractC0837j.b(this.f7560d, AbstractC0837j.b(this.f7559c, t.c(this.f7558b, Float.hashCode(this.f7557a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f7557a);
        sb.append(", miter=");
        sb.append(this.f7558b);
        sb.append(", cap=");
        int i2 = this.f7559c;
        String str = "Unknown";
        sb.append((Object) (AbstractC0571K.o(i2, 0) ? "Butt" : AbstractC0571K.o(i2, 1) ? "Round" : AbstractC0571K.o(i2, 2) ? "Square" : "Unknown"));
        sb.append(", join=");
        int i3 = this.f7560d;
        if (AbstractC0571K.p(i3, 0)) {
            str = "Miter";
        } else if (AbstractC0571K.p(i3, 1)) {
            str = "Round";
        } else if (AbstractC0571K.p(i3, 2)) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
