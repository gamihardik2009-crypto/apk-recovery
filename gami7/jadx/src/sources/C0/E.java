package C0;

import D.C0046o;
import D.C0047p;
import D.C0048q;
import D.S;
import d0.InterfaceC0638i;
import m.InterfaceC0851y;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements I0.I, InterfaceC0638i, InterfaceC0851y {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f447b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f448a;

    public /* synthetic */ E(int i2) {
        this.f448a = i2;
    }

    @Override // m.InterfaceC0851y
    public float a(float f3) {
        return f3;
    }

    @Override // I0.I
    public I0.G b(C0024g c0024g) {
        return new I0.G(c0024g, I0.r.f3915a);
    }

    @Override // d0.InterfaceC0638i
    public double c(double d3) {
        double d4;
        switch (this.f448a) {
            case 7:
                double d5 = d3 < 0.0d ? -d3 : d3;
                if (d5 >= 0.0031308049535603718d) {
                    d5 = Math.pow(d5, 0.4166666666666667d) - 0.05213270142180095d;
                    d4 = 0.9478672985781991d;
                } else {
                    d4 = 0.07739938080495357d;
                }
                return Math.copySign(d5 / d4, d3);
            case 8:
                double d6 = d3 < 0.0d ? -d3 : d3;
                return Math.copySign(d6 >= 0.04045d ? Math.pow((0.9478672985781991d * d6) + 0.05213270142180095d, 2.4d) : d6 * 0.07739938080495357d, d3);
            default:
                return d3;
        }
    }

    public C0048q d(S s3) {
        C0047p l3;
        C0047p c0047p;
        switch (this.f448a) {
            case 2:
                C0046o c0046o = (C0046o) s3.f764d;
                return new C0048q(c0046o.a(c0046o.f872b), c0046o.a(c0046o.f873c), s3.f() == 1);
            case 3:
                return l0.c.j(s3, D.r.f883c);
            case 4:
                return l0.c.j(s3, D.r.f882b);
            default:
                C0048q c0048q = (C0048q) s3.f763c;
                if (c0048q == null) {
                    return l0.c.j(s3, D.r.f883c);
                }
                C0046o c0046o2 = (C0046o) s3.f764d;
                boolean z3 = s3.f762b;
                C0047p c0047p2 = c0048q.f880b;
                C0047p c0047p3 = c0048q.f879a;
                if (z3) {
                    l3 = l0.c.l(s3, c0046o2, c0047p3);
                    c0047p = c0047p2;
                    c0047p2 = c0047p3;
                    c0047p3 = l3;
                } else {
                    l3 = l0.c.l(s3, c0046o2, c0047p2);
                    c0047p = l3;
                }
                if (!z2.h.a(l3, c0047p2)) {
                    boolean z4 = true;
                    if (s3.f() != 1 && (s3.f() != 3 || c0047p3.f877b <= c0047p.f877b)) {
                        z4 = false;
                    }
                    c0048q = l0.c.x(new C0048q(c0047p3, c0047p, z4), s3);
                }
                return c0048q;
        }
    }

    public boolean e(b0.d dVar, b0.d dVar2) {
        switch (this.f448a) {
            case 0:
                return dVar.g(dVar2);
            default:
                return dVar2.a(dVar.b());
        }
    }
}
