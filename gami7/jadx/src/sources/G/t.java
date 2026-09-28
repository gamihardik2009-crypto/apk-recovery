package G;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import c0.C0603v;
import m.AbstractC0852z;
import m.w0;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f1201a = new w0(15, AbstractC0852z.f8613c, 2);

    public static final e a(boolean z3, float f3, long j3, C0285q c0285q, int i2, int i3) {
        c0285q.V(1635163520);
        if ((i3 & 1) != 0) {
            z3 = true;
        }
        if ((i3 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i3 & 4) != 0) {
            j3 = C0603v.f7277g;
        }
        InterfaceC0258c0 R3 = C0257c.R(new C0603v(j3), c0285q);
        Boolean valueOf = Boolean.valueOf(z3);
        O0.e eVar = new O0.e(f3);
        c0285q.V(511388516);
        boolean g3 = c0285q.g(valueOf) | c0285q.g(eVar);
        Object K3 = c0285q.K();
        if (g3 || K3 == C0275l.f4150a) {
            K3 = new e(z3, f3, R3);
            c0285q.e0(K3);
        }
        c0285q.r(false);
        e eVar2 = (e) K3;
        c0285q.r(false);
        return eVar2;
    }
}
