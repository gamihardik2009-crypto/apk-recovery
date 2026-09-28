package u;

import J.C0275l;
import J.C0285q;
import J2.B;
import a.AbstractC0423a;
import n2.C0970v;
import p.X;
import q2.C1079j;
import t.C1229x;
import t.C1230y;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final p f10813a;

    static {
        C1229x c1229x = new C1229x(1);
        C0970v c0970v = C0970v.f9165h;
        X x2 = X.f9518h;
        B.a(C1079j.f9784h);
        f10813a = new p(null, 0, false, 0.0f, c1229x, false, 0, o.f10739m, c0970v, 0, 0, 0, x2, 0, 0);
    }

    public static final x a(int i2, int i3, C0285q c0285q) {
        int i4 = 0;
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        K1.e eVar = x.f10794t;
        boolean e3 = c0285q.e(i2) | c0285q.e(0);
        Object K3 = c0285q.K();
        if (e3 || K3 == C0275l.f4150a) {
            K3 = new C1230y(i2, i4, 1);
            c0285q.e0(K3);
        }
        return (x) AbstractC0423a.Y(objArr, eVar, null, (y2.a) K3, c0285q, 0, 4);
    }
}
