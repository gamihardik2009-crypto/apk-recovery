package c0;

import android.graphics.ColorFilter;

/* renamed from: c0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f7264a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7265b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7266c;

    public C0594m(long j3, int i2, ColorFilter colorFilter) {
        this.f7264a = colorFilter;
        this.f7265b = j3;
        this.f7266c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0594m)) {
            return false;
        }
        C0594m c0594m = (C0594m) obj;
        return C0603v.c(this.f7265b, c0594m.f7265b) && AbstractC0571K.m(this.f7266c, c0594m.f7266c);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Integer.hashCode(this.f7266c) + (Long.hashCode(this.f7265b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        B1.t.t(this.f7265b, sb, ", blendMode=");
        int i2 = this.f7266c;
        sb.append((Object) (AbstractC0571K.m(i2, 0) ? "Clear" : AbstractC0571K.m(i2, 1) ? "Src" : AbstractC0571K.m(i2, 2) ? "Dst" : AbstractC0571K.m(i2, 3) ? "SrcOver" : AbstractC0571K.m(i2, 4) ? "DstOver" : AbstractC0571K.m(i2, 5) ? "SrcIn" : AbstractC0571K.m(i2, 6) ? "DstIn" : AbstractC0571K.m(i2, 7) ? "SrcOut" : AbstractC0571K.m(i2, 8) ? "DstOut" : AbstractC0571K.m(i2, 9) ? "SrcAtop" : AbstractC0571K.m(i2, 10) ? "DstAtop" : AbstractC0571K.m(i2, 11) ? "Xor" : AbstractC0571K.m(i2, 12) ? "Plus" : AbstractC0571K.m(i2, 13) ? "Modulate" : AbstractC0571K.m(i2, 14) ? "Screen" : AbstractC0571K.m(i2, 15) ? "Overlay" : AbstractC0571K.m(i2, 16) ? "Darken" : AbstractC0571K.m(i2, 17) ? "Lighten" : AbstractC0571K.m(i2, 18) ? "ColorDodge" : AbstractC0571K.m(i2, 19) ? "ColorBurn" : AbstractC0571K.m(i2, 20) ? "HardLight" : AbstractC0571K.m(i2, 21) ? "Softlight" : AbstractC0571K.m(i2, 22) ? "Difference" : AbstractC0571K.m(i2, 23) ? "Exclusion" : AbstractC0571K.m(i2, 24) ? "Multiply" : AbstractC0571K.m(i2, 25) ? "Hue" : AbstractC0571K.m(i2, 26) ? "Saturation" : AbstractC0571K.m(i2, 27) ? "Color" : AbstractC0571K.m(i2, 28) ? "Luminosity" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
