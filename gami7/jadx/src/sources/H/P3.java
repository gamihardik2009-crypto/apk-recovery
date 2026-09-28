package H;

import J.C0257c;
import J.C0266g0;
import J.C0268h0;
import J.C0274k0;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class P3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1899a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.a f1900b;

    /* renamed from: c, reason: collision with root package name */
    public final E2.a f1901c;

    /* renamed from: d, reason: collision with root package name */
    public final C0266g0 f1902d;

    /* renamed from: e, reason: collision with root package name */
    public y2.c f1903e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f1904f;

    /* renamed from: g, reason: collision with root package name */
    public final C0268h0 f1905g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1906h;

    /* renamed from: i, reason: collision with root package name */
    public final C0266g0 f1907i;

    /* renamed from: j, reason: collision with root package name */
    public final C0274k0 f1908j;

    /* renamed from: k, reason: collision with root package name */
    public final B.y f1909k;

    /* renamed from: l, reason: collision with root package name */
    public final C0266g0 f1910l;

    /* renamed from: m, reason: collision with root package name */
    public final C0266g0 f1911m;

    /* renamed from: n, reason: collision with root package name */
    public final O3 f1912n;

    /* renamed from: o, reason: collision with root package name */
    public final n.f0 f1913o;

    public P3(float f3, int i2, D.G g3, E2.a aVar) {
        float[] fArr;
        this.f1899a = i2;
        this.f1900b = g3;
        this.f1901c = aVar;
        this.f1902d = C0257c.L(f3);
        if (i2 == 0) {
            fArr = new float[0];
        } else {
            int i3 = i2 + 2;
            float[] fArr2 = new float[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                fArr2[i4] = i4 / (i2 + 1);
            }
            fArr = fArr2;
        }
        this.f1904f = fArr;
        this.f1905g = C0257c.M(0);
        this.f1907i = C0257c.L(0.0f);
        this.f1908j = C0257c.N(Boolean.FALSE, J.W.f4109m);
        this.f1909k = new B.y(10, this);
        E2.a aVar2 = this.f1901c;
        float f4 = aVar2.f1074a;
        float f5 = aVar2.f1075b - f4;
        this.f1910l = C0257c.L(B2.a.y(0.0f, 0.0f, B1.C.B(f5 == 0.0f ? 0.0f : (f3 - f4) / f5, 0.0f, 1.0f)));
        this.f1911m = C0257c.L(0.0f);
        this.f1912n = new O3(this);
        this.f1913o = new n.f0();
    }

    public final void a(float f3) {
        float g3 = this.f1905g.g();
        C0266g0 c0266g0 = this.f1907i;
        float f4 = 2;
        float max = Math.max(g3 - (c0266g0.g() / f4), 0.0f);
        float min = Math.min(c0266g0.g() / f4, max);
        C0266g0 c0266g02 = this.f1910l;
        float g4 = c0266g02.g() + f3;
        C0266g0 c0266g03 = this.f1911m;
        c0266g02.h(c0266g03.g() + g4);
        c0266g03.h(0.0f);
        float e3 = M3.e(c0266g02.g(), min, max, this.f1904f);
        E2.a aVar = this.f1901c;
        float f5 = max - min;
        float y3 = B2.a.y(aVar.f1074a, aVar.f1075b, B1.C.B(f5 == 0.0f ? 0.0f : (e3 - min) / f5, 0.0f, 1.0f));
        if (y3 == this.f1902d.g()) {
            return;
        }
        y2.c cVar = this.f1903e;
        if (cVar != null) {
            cVar.l(Float.valueOf(y3));
        } else {
            d(y3);
        }
    }

    public final Object b(p.P p3, InterfaceC1073d interfaceC1073d) {
        Object e3 = J2.B.e(new N3(this, n.c0.f8754i, p3, null), interfaceC1073d);
        return e3 == EnumC1145a.f10026h ? e3 : C0880v.f8657a;
    }

    public final float c() {
        E2.a aVar = this.f1901c;
        float f3 = aVar.f1074a;
        float g3 = this.f1902d.g();
        float f4 = aVar.f1074a;
        float f5 = aVar.f1075b;
        float B3 = B1.C.B(g3, f4, f5);
        float f6 = f5 - f3;
        return B1.C.B(f6 == 0.0f ? 0.0f : (B3 - f3) / f6, 0.0f, 1.0f);
    }

    public final void d(float f3) {
        E2.a aVar = this.f1901c;
        float f4 = aVar.f1074a;
        float f5 = aVar.f1075b;
        this.f1902d.h(M3.e(B1.C.B(f3, f4, f5), aVar.f1074a, f5, this.f1904f));
    }
}
