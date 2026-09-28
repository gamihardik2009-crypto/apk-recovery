package m;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820D implements InterfaceC0818B {

    /* renamed from: a, reason: collision with root package name */
    public final float f8291a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f8292b;

    public C0820D(float f3, float f4, float f5) {
        this.f8291a = f5;
        Y y3 = new Y();
        y3.f8388a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        y3.f8389b = sqrt;
        y3.f8394g = 1.0f;
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        y3.f8394g = f3;
        y3.f8390c = false;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        y3.f8389b = Math.sqrt(f4);
        y3.f8390c = false;
        this.f8292b = y3;
    }

    @Override // m.InterfaceC0818B
    public final float b(long j3, float f3, float f4, float f5) {
        Y y3 = this.f8292b;
        y3.f8388a = f4;
        return Float.intBitsToFloat((int) (y3.a(f3, f5, j3 / 1000000) >> 32));
    }

    @Override // m.InterfaceC0818B
    public final float c(long j3, float f3, float f4, float f5) {
        Y y3 = this.f8292b;
        y3.f8388a = f4;
        return Float.intBitsToFloat((int) (y3.a(f3, f5, j3 / 1000000) & 4294967295L));
    }

    @Override // m.InterfaceC0818B
    public final long d(float f3, float f4, float f5) {
        double d3;
        C0847u c0847u;
        C0847u c0847u2;
        C0847u c0847u3;
        boolean z3;
        boolean z4;
        double d4;
        double d5;
        long j3;
        double d6;
        double d7;
        double d8;
        long j4;
        Y y3 = this.f8292b;
        double d9 = y3.f8389b;
        float f6 = (float) (d9 * d9);
        float f7 = y3.f8394g;
        float f8 = this.f8291a;
        float f9 = (f3 - f4) / f8;
        float f10 = f5 / f8;
        if (f7 == 0.0f) {
            j4 = 9223372036854L;
        } else {
            double d10 = f6;
            double d11 = f7;
            double d12 = f10;
            double d13 = f9;
            double d14 = 1.0f;
            double sqrt = d11 * 2.0d * Math.sqrt(d10);
            double d15 = (sqrt * sqrt) - (d10 * 4.0d);
            double d16 = -sqrt;
            if (d15 < 0.0d) {
                d3 = d14;
                c0847u = new C0847u(0.0d, Math.sqrt(Math.abs(d15)));
            } else {
                d3 = d14;
                c0847u = new C0847u(Math.sqrt(d15), 0.0d);
            }
            c0847u.f8577a = (c0847u.f8577a + d16) * 0.5d;
            c0847u.f8578b *= 0.5d;
            if (d15 < 0.0d) {
                c0847u2 = c0847u;
                c0847u3 = new C0847u(0.0d, Math.sqrt(Math.abs(d15)));
            } else {
                c0847u2 = c0847u;
                c0847u3 = new C0847u(Math.sqrt(d15), 0.0d);
            }
            double d17 = -1;
            double d18 = c0847u3.f8577a * d17;
            double d19 = c0847u3.f8578b * d17;
            c0847u3.f8577a = (d18 + d16) * 0.5d;
            c0847u3.f8578b = d19 * 0.5d;
            if (d13 == 0.0d && d12 == 0.0d) {
                j3 = 0;
            } else {
                if (d13 < 0.0d) {
                    d12 = -d12;
                }
                double abs = Math.abs(d13);
                int i2 = 0;
                if (d11 > 1.0d) {
                    double d20 = c0847u2.f8577a;
                    double d21 = c0847u3.f8577a;
                    double d22 = (d20 * abs) - d12;
                    double d23 = d20 - d21;
                    double d24 = d22 / d23;
                    double d25 = abs - d24;
                    d5 = Math.log(Math.abs(d3 / d25)) / d20;
                    double log = Math.log(Math.abs(d3 / d24)) / d21;
                    if (!((Double.isInfinite(d5) || Double.isNaN(d5)) ? false : true)) {
                        d5 = log;
                    } else if (!(!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true))) {
                        d5 = Math.max(d5, log);
                    }
                    double d26 = d25 * d20;
                    double log2 = Math.log(d26 / ((-d24) * d21)) / (d21 - d20);
                    if (Double.isNaN(log2) || log2 <= 0.0d) {
                        d6 = -d3;
                    } else {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d21) * d24) + (Math.exp(d20 * log2) * d25))) < d3) {
                                if (d24 <= 0.0d || d25 >= 0.0d) {
                                    d7 = d5;
                                    d8 = d3;
                                } else {
                                    d8 = d3;
                                    d7 = 0.0d;
                                }
                                d6 = -d8;
                                d5 = d7;
                            }
                        }
                        d6 = d3;
                        d5 = Math.log((-((d24 * d21) * d21)) / (d26 * d20)) / d23;
                    }
                    double d27 = d24 * d21;
                    if (Math.abs((Math.exp(d21 * d5) * d27) + (Math.exp(d20 * d5) * d26)) >= 1.0E-4d) {
                        double d28 = Double.MAX_VALUE;
                        for (double d29 = 0.001d; d28 > d29 && i2 < 100; d29 = 0.001d) {
                            i2++;
                            double d30 = d20 * d5;
                            double d31 = d21 * d5;
                            double exp = d5 - ((((Math.exp(d31) * d24) + (Math.exp(d30) * d25)) + d6) / ((Math.exp(d31) * d27) + (Math.exp(d30) * d26)));
                            d28 = Math.abs(d5 - exp);
                            d5 = exp;
                        }
                    }
                } else {
                    C0847u c0847u4 = c0847u2;
                    double d32 = d3;
                    if (d11 < 1.0d) {
                        double d33 = c0847u4.f8577a;
                        double d34 = (d12 - (d33 * abs)) / c0847u4.f8578b;
                        d5 = Math.log(d32 / Math.sqrt((d34 * d34) + (abs * abs))) / d33;
                    } else {
                        double d35 = c0847u4.f8577a;
                        double d36 = d35 * abs;
                        double d37 = d12 - d36;
                        double log3 = Math.log(Math.abs(d32 / abs)) / d35;
                        double log4 = Math.log(Math.abs(d32 / d37));
                        double d38 = log4;
                        for (int i3 = 0; i3 < 6; i3++) {
                            d38 = log4 - Math.log(Math.abs(d38 / d35));
                        }
                        double d39 = d38 / d35;
                        if (Double.isInfinite(log3) || Double.isNaN(log3)) {
                            z3 = false;
                            z4 = true;
                        } else {
                            z4 = true;
                            z3 = true;
                        }
                        if (!z3) {
                            log3 = d39;
                        } else if (!(!((Double.isInfinite(d39) || Double.isNaN(d39)) ? false : z4))) {
                            log3 = Math.max(log3, d39);
                        }
                        double d40 = (-(d36 + d37)) / (d35 * d37);
                        double d41 = d35 * d40;
                        double d42 = log3;
                        double exp2 = (Math.exp(d41) * d37 * d40) + (Math.exp(d41) * abs);
                        if (Double.isNaN(d40) || d40 <= 0.0d) {
                            d32 = -d32;
                            d4 = d42;
                        } else if (d40 <= 0.0d || (-exp2) >= d32) {
                            d4 = (-(2.0d / d35)) - (abs / d37);
                        } else {
                            d4 = (d37 >= 0.0d || abs <= 0.0d) ? d42 : 0.0d;
                            d32 = -d32;
                        }
                        double d43 = Double.MAX_VALUE;
                        for (double d44 = 0.001d; d43 > d44 && i2 < 100; d44 = 0.001d) {
                            i2++;
                            double d45 = d35 * d4;
                            double exp3 = d4 - (((Math.exp(d45) * ((d37 * d4) + abs)) + d32) / (Math.exp(d45) * (((d45 + 1) * d37) + d36)));
                            d43 = Math.abs(d4 - exp3);
                            d4 = exp3;
                        }
                        d5 = d4;
                    }
                }
                j3 = (long) (d5 * 1000.0d);
            }
            j4 = j3;
        }
        return j4 * 1000000;
    }

    @Override // m.InterfaceC0818B
    public final float f(float f3, float f4, float f5) {
        return 0.0f;
    }
}
