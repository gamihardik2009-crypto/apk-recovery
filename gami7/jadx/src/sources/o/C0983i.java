package o;

import H.C0108g1;
import H.C0157n1;
import J.C0285q;
import J.C0291t0;
import T.r;

/* renamed from: o.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983i {

    /* renamed from: a, reason: collision with root package name */
    public final r f9199a = new r();

    public static void b(C0983i c0983i, C0108g1 c0108g1, boolean z3, y2.a aVar) {
        V.l lVar = V.l.f5857b;
        c0983i.getClass();
        c0983i.f9199a.add(new R.a(262103052, new C0982h(c0108g1, z3, lVar, null, aVar, 0), true));
    }

    public final void a(C0976b c0976b, C0285q c0285q, int i2) {
        c0285q.W(1320309496);
        int i3 = (i2 & 6) == 0 ? (c0285q.g(c0976b) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= c0285q.g(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            r rVar = this.f9199a;
            int size = rVar.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((y2.f) rVar.get(i4)).i(c0976b, c0285q, Integer.valueOf(i3 & 14));
            }
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0157n1(i2, 8, this, c0976b);
        }
    }
}
