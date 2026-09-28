package s;

import J.C0275l;
import J.C0285q;

/* renamed from: s.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1179s {

    /* renamed from: a, reason: collision with root package name */
    public static final C1180t f10177a = new C1180t(AbstractC1173l.f10151c, V.b.f5842t);

    public static final C1180t a(InterfaceC1171j interfaceC1171j, V.e eVar, C0285q c0285q, int i2) {
        if (z2.h.a(interfaceC1171j, AbstractC1173l.f10151c) && z2.h.a(eVar, V.b.f5842t)) {
            c0285q.U(345884104);
            c0285q.r(false);
            return f10177a;
        }
        c0285q.U(345937951);
        boolean z3 = true;
        boolean z4 = (((i2 & 14) ^ 6) > 4 && c0285q.g(interfaceC1171j)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !c0285q.g(eVar)) && (i2 & 48) != 32) {
            z3 = false;
        }
        boolean z5 = z4 | z3;
        Object K3 = c0285q.K();
        if (z5 || K3 == C0275l.f4150a) {
            K3 = new C1180t(interfaceC1171j, eVar);
            c0285q.e0(K3);
        }
        C1180t c1180t = (C1180t) K3;
        c0285q.r(false);
        return c1180t;
    }
}
