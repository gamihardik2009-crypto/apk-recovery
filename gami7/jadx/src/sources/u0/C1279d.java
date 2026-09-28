package u0;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1279d extends AbstractC1275b {

    /* renamed from: e, reason: collision with root package name */
    public static C1279d f11039e;

    /* renamed from: c, reason: collision with root package name */
    public C0.H f11040c;

    /* renamed from: d, reason: collision with root package name */
    public A0.q f11041d;

    @Override // u0.AbstractC1275b
    public final int[] a(int i2) {
        int i3;
        if (c().length() <= 0 || i2 >= c().length()) {
            return null;
        }
        try {
            A0.q qVar = this.f11041d;
            if (qVar == null) {
                z2.h.j("node");
                throw null;
            }
            int round = Math.round(qVar.e().c());
            if (i2 <= 0) {
                i2 = 0;
            }
            C0.H h2 = this.f11040c;
            if (h2 == null) {
                z2.h.j("layoutResult");
                throw null;
            }
            int e3 = h2.e(i2);
            C0.H h3 = this.f11040c;
            if (h3 == null) {
                z2.h.j("layoutResult");
                throw null;
            }
            float d3 = h3.f462b.d(e3) + round;
            C0.H h4 = this.f11040c;
            if (h4 == null) {
                z2.h.j("layoutResult");
                throw null;
            }
            if (d3 < h4.f462b.d(r0.f528f - 1)) {
                C0.H h5 = this.f11040c;
                if (h5 == null) {
                    z2.h.j("layoutResult");
                    throw null;
                }
                i3 = h5.f462b.c(d3);
            } else {
                C0.H h6 = this.f11040c;
                if (h6 == null) {
                    z2.h.j("layoutResult");
                    throw null;
                }
                i3 = h6.f462b.f528f;
            }
            return b(i2, e(i3 - 1, N0.h.f4989h) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // u0.AbstractC1275b
    public final int[] d(int i2) {
        int i3;
        if (c().length() <= 0 || i2 <= 0) {
            return null;
        }
        try {
            A0.q qVar = this.f11041d;
            if (qVar == null) {
                z2.h.j("node");
                throw null;
            }
            int round = Math.round(qVar.e().c());
            int length = c().length();
            if (length <= i2) {
                i2 = length;
            }
            C0.H h2 = this.f11040c;
            if (h2 == null) {
                z2.h.j("layoutResult");
                throw null;
            }
            int e3 = h2.e(i2);
            C0.H h3 = this.f11040c;
            if (h3 == null) {
                z2.h.j("layoutResult");
                throw null;
            }
            float d3 = h3.f462b.d(e3) - round;
            if (d3 > 0.0f) {
                C0.H h4 = this.f11040c;
                if (h4 == null) {
                    z2.h.j("layoutResult");
                    throw null;
                }
                i3 = h4.f462b.c(d3);
            } else {
                i3 = 0;
            }
            if (i2 == c().length() && i3 < e3) {
                i3++;
            }
            return b(e(i3, N0.h.f4990i), i2);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i2, N0.h hVar) {
        C0.H h2 = this.f11040c;
        if (h2 == null) {
            z2.h.j("layoutResult");
            throw null;
        }
        int h3 = h2.h(i2);
        C0.H h4 = this.f11040c;
        if (h4 == null) {
            z2.h.j("layoutResult");
            throw null;
        }
        if (hVar != h4.i(h3)) {
            C0.H h5 = this.f11040c;
            if (h5 != null) {
                return h5.h(i2);
            }
            z2.h.j("layoutResult");
            throw null;
        }
        if (this.f11040c != null) {
            return r6.d(i2, false) - 1;
        }
        z2.h.j("layoutResult");
        throw null;
    }
}
