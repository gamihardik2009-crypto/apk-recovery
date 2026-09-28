package u;

import D.C0043l;
import H.Z0;
import J.C0285q;
import J.C0291t0;
import n1.E;

/* loaded from: classes.dex */
public final class i implements v.x {

    /* renamed from: a, reason: collision with root package name */
    public final x f10693a;

    /* renamed from: b, reason: collision with root package name */
    public final h f10694b;

    /* renamed from: c, reason: collision with root package name */
    public final v.z f10695c;

    public i(x xVar, h hVar, C0043l c0043l) {
        this.f10693a = xVar;
        this.f10694b = hVar;
        this.f10695c = c0043l;
    }

    @Override // v.x
    public final int a() {
        return this.f10694b.o().f865a;
    }

    @Override // v.x
    public final Object b(int i2) {
        Object b3 = this.f10695c.b(i2);
        return b3 == null ? this.f10694b.p(i2) : b3;
    }

    @Override // v.x
    public final int c(Object obj) {
        return this.f10695c.c(obj);
    }

    @Override // v.x
    public final Object d(int i2) {
        return this.f10694b.n(i2);
    }

    @Override // v.x
    public final void e(int i2, Object obj, C0285q c0285q, int i3) {
        int i4;
        c0285q.W(1493551140);
        if ((i3 & 6) == 0) {
            i4 = (c0285q.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0285q.i(obj) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0285q.g(this) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            E.c(obj, i2, this.f10693a.f10809o, R.b.c(726189336, new R0.q(i2, 4, this), c0285q), c0285q, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new Z0(this, i2, obj, i3, 2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return z2.h.a(this.f10694b, ((i) obj).f10694b);
    }

    public final int hashCode() {
        return this.f10694b.hashCode();
    }
}
