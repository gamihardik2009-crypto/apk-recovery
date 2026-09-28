package s;

import J.C0275l;
import J.C0285q;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final S f10076a = new S(AbstractC1173l.f10149a, V.b.q);

    public static final S a(InterfaceC1169h interfaceC1169h, V.f fVar, C0285q c0285q, int i2) {
        if (z2.h.a(interfaceC1169h, AbstractC1173l.f10149a) && z2.h.a(fVar, V.b.q)) {
            c0285q.U(-849160037);
            c0285q.r(false);
            return f10076a;
        }
        c0285q.U(-849109166);
        boolean z3 = true;
        boolean z4 = (((i2 & 14) ^ 6) > 4 && c0285q.g(interfaceC1169h)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !c0285q.g(fVar)) && (i2 & 48) != 32) {
            z3 = false;
        }
        boolean z5 = z4 | z3;
        Object K3 = c0285q.K();
        if (z5 || K3 == C0275l.f4150a) {
            K3 = new S(interfaceC1169h, fVar);
            c0285q.e0(K3);
        }
        S s3 = (S) K3;
        c0285q.r(false);
        return s3;
    }
}
