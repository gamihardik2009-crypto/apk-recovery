package C;

import B1.C;
import C0.K;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static b f324h;

    /* renamed from: a, reason: collision with root package name */
    public final O0.k f325a;

    /* renamed from: b, reason: collision with root package name */
    public final K f326b;

    /* renamed from: c, reason: collision with root package name */
    public final O0.b f327c;

    /* renamed from: d, reason: collision with root package name */
    public final H0.d f328d;

    /* renamed from: e, reason: collision with root package name */
    public final K f329e;

    /* renamed from: f, reason: collision with root package name */
    public float f330f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f331g = Float.NaN;

    public b(O0.k kVar, K k3, O0.b bVar, H0.d dVar) {
        this.f325a = kVar;
        this.f326b = k3;
        this.f327c = bVar;
        this.f328d = dVar;
        this.f329e = B2.a.C(k3, kVar);
    }

    public final long a(long j3, int i2) {
        int i3;
        float f3 = this.f331g;
        float f4 = this.f330f;
        if (Float.isNaN(f3) || Float.isNaN(f4)) {
            float b3 = l0.c.f(c.f332a, this.f329e, C.c(0, 0, 15), this.f327c, this.f328d, null, 1, 96).b();
            float b4 = l0.c.f(c.f333b, this.f329e, C.c(0, 0, 15), this.f327c, this.f328d, null, 2, 96).b() - b3;
            this.f331g = b3;
            this.f330f = b4;
            f4 = b4;
            f3 = b3;
        }
        if (i2 != 1) {
            int round = Math.round((f4 * (i2 - 1)) + f3);
            i3 = round >= 0 ? round : 0;
            int g3 = O0.a.g(j3);
            if (i3 > g3) {
                i3 = g3;
            }
        } else {
            i3 = O0.a.i(j3);
        }
        return C.b(O0.a.j(j3), O0.a.h(j3), i3, O0.a.g(j3));
    }
}
