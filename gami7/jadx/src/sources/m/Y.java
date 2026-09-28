package m;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public float f8388a;

    /* renamed from: b, reason: collision with root package name */
    public double f8389b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8390c;

    /* renamed from: d, reason: collision with root package name */
    public double f8391d;

    /* renamed from: e, reason: collision with root package name */
    public double f8392e;

    /* renamed from: f, reason: collision with root package name */
    public double f8393f;

    /* renamed from: g, reason: collision with root package name */
    public float f8394g;

    public final long a(float f3, float f4, long j3) {
        double cos;
        double d3;
        if (!this.f8390c) {
            if (this.f8388a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f5 = this.f8394g;
            double d4 = f5;
            double d5 = d4 * d4;
            if (f5 > 1.0f) {
                double d6 = this.f8389b;
                double d7 = d5 - 1;
                this.f8391d = (Math.sqrt(d7) * d6) + ((-f5) * d6);
                double d8 = -this.f8394g;
                double d9 = this.f8389b;
                this.f8392e = (d8 * d9) - (Math.sqrt(d7) * d9);
            } else if (f5 >= 0.0f && f5 < 1.0f) {
                this.f8393f = Math.sqrt(1 - d5) * this.f8389b;
            }
            this.f8390c = true;
        }
        float f6 = f3 - this.f8388a;
        double d10 = j3 / 1000.0d;
        float f7 = this.f8394g;
        if (f7 > 1.0f) {
            double d11 = f6;
            double d12 = this.f8392e;
            double d13 = f4;
            double d14 = this.f8391d;
            double d15 = d11 - (((d12 * d11) - d13) / (d12 - d14));
            double d16 = ((d11 * d12) - d13) / (d12 - d14);
            d3 = (Math.exp(this.f8391d * d10) * d16) + (Math.exp(d12 * d10) * d15);
            double d17 = this.f8392e;
            double exp = Math.exp(d17 * d10) * d15 * d17;
            double d18 = this.f8391d;
            cos = (Math.exp(d18 * d10) * d16 * d18) + exp;
        } else if (f7 == 1.0f) {
            double d19 = this.f8389b;
            double d20 = f6;
            double d21 = (d19 * d20) + f4;
            double d22 = (d21 * d10) + d20;
            d3 = Math.exp((-d19) * d10) * d22;
            double exp2 = Math.exp((-this.f8389b) * d10) * d22;
            double d23 = this.f8389b;
            cos = (Math.exp((-d23) * d10) * d21) + (exp2 * (-d23));
        } else {
            double d24 = 1 / this.f8393f;
            double d25 = this.f8389b;
            double d26 = f6;
            double d27 = ((f7 * d25 * d26) + f4) * d24;
            double exp3 = Math.exp((-f7) * d25 * d10) * ((Math.sin(this.f8393f * d10) * d27) + (Math.cos(this.f8393f * d10) * d26));
            double d28 = this.f8389b;
            double d29 = (-d28) * exp3 * this.f8394g;
            double exp4 = Math.exp((-r7) * d28 * d10);
            double d30 = this.f8393f;
            double sin = Math.sin(d30 * d10) * (-d30) * d26;
            double d31 = this.f8393f;
            cos = (((Math.cos(d31 * d10) * d27 * d31) + sin) * exp4) + d29;
            d3 = exp3;
        }
        return (Float.floatToRawIntBits((float) cos) & 4294967295L) | (Float.floatToRawIntBits((float) (d3 + this.f8388a)) << 32);
    }
}
