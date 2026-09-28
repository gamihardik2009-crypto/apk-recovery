package z;

import J.C0257c;
import J.C0266g0;
import J.C0274k0;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final K1.e f11741f = K1.f.I(m0.f11732i, C1413d.f11640v);

    /* renamed from: a, reason: collision with root package name */
    public final C0266g0 f11742a;

    /* renamed from: b, reason: collision with root package name */
    public final C0266g0 f11743b = C0257c.L(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public b0.d f11744c = b0.d.f7059e;

    /* renamed from: d, reason: collision with root package name */
    public long f11745d = C0.J.f471b;

    /* renamed from: e, reason: collision with root package name */
    public final C0274k0 f11746e;

    public n0(p.X x2, float f3) {
        this.f11742a = C0257c.L(f3);
        this.f11746e = C0257c.N(x2, J.W.f4109m);
    }

    public final float a() {
        return this.f11742a.g();
    }

    public final void b(p.X x2, b0.d dVar, int i2, int i3) {
        float f3 = i3 - i2;
        this.f11743b.h(f3);
        b0.d dVar2 = this.f11744c;
        float f4 = dVar2.f7060a;
        float f5 = dVar.f7060a;
        C0266g0 c0266g0 = this.f11742a;
        float f6 = dVar.f7061b;
        if (f5 != f4 || f6 != dVar2.f7061b) {
            boolean z3 = x2 == p.X.f9518h;
            if (z3) {
                f5 = f6;
            }
            float f7 = z3 ? dVar.f7063d : dVar.f7062c;
            float g3 = c0266g0.g();
            float f8 = i2;
            float f9 = g3 + f8;
            c0266g0.h(c0266g0.g() + ((f7 <= f9 && (f5 >= g3 || f7 - f5 <= f8)) ? (f5 >= g3 || f7 - f5 > f8) ? 0.0f : f5 - g3 : f7 - f9));
            this.f11744c = dVar;
        }
        c0266g0.h(B1.C.B(c0266g0.g(), 0.0f, f3));
    }
}
