package H;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0287r0;
import androidx.compose.foundation.BorderModifierNodeElement;
import c0.AbstractC0571K;
import c0.C0603v;
import c0.InterfaceC0576P;
import n.C0911t;

/* renamed from: H.x4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0223x4 {

    /* renamed from: a, reason: collision with root package name */
    public static final J.B f3310a = new J.B(J.W.f4109m, C0100f0.f2570v);

    public static final void a(V.o oVar, InterfaceC0576P interfaceC0576P, long j3, long j4, float f3, float f4, C0911t c0911t, R.a aVar, C0285q c0285q, int i2, int i3) {
        c0285q.V(-513881741);
        InterfaceC0576P interfaceC0576P2 = (i3 & 2) != 0 ? AbstractC0571K.f7193a : interfaceC0576P;
        long b3 = (i3 & 8) != 0 ? AbstractC0107g0.b(j3, c0285q) : j4;
        float f5 = (i3 & 16) != 0 ? 0 : f3;
        float f6 = (i3 & 32) != 0 ? 0 : f4;
        C0911t c0911t2 = (i3 & 64) != 0 ? null : c0911t;
        J.B b4 = f3310a;
        float f7 = ((O0.e) c0285q.l(b4)).f5138h + f5;
        C0257c.b(new C0287r0[]{AbstractC0183r0.f3050a.a(new C0603v(b3)), b4.a(new O0.e(f7))}, R.b.b(c0285q, -70914509, new C0205u4(oVar, interfaceC0576P2, j3, f7, c0911t2, f6, aVar)), c0285q, 48);
        c0285q.r(false);
    }

    public static final void b(boolean z3, y2.a aVar, V.o oVar, boolean z4, InterfaceC0576P interfaceC0576P, long j3, long j4, float f3, float f4, C0911t c0911t, r.l lVar, R.a aVar2, C0285q c0285q, int i2, int i3) {
        r.l lVar2;
        c0285q.V(540296512);
        boolean z5 = (i3 & 8) != 0 ? true : z4;
        long b3 = (i3 & 64) != 0 ? AbstractC0107g0.b(j3, c0285q) : j4;
        float f5 = (i3 & 128) != 0 ? 0 : f3;
        float f6 = (i3 & 256) != 0 ? 0 : f4;
        C0911t c0911t2 = (i3 & 512) != 0 ? null : c0911t;
        if ((i3 & 1024) != 0) {
            c0285q.V(-746935250);
            Object K3 = c0285q.K();
            if (K3 == C0275l.f4150a) {
                K3 = B1.t.o(c0285q);
            }
            c0285q.r(false);
            lVar2 = (r.l) K3;
        } else {
            lVar2 = lVar;
        }
        J.B b4 = f3310a;
        float f7 = ((O0.e) c0285q.l(b4)).f5138h + f5;
        C0257c.b(new C0287r0[]{AbstractC0183r0.f3050a.a(new C0603v(b3)), b4.a(new O0.e(f7))}, R.b.b(c0285q, -1164547968, new C0217w4(oVar, interfaceC0576P, j3, f7, c0911t2, z3, lVar2, z5, aVar, f6, aVar2)), c0285q, 48);
        c0285q.r(false);
    }

    public static final void c(y2.a aVar, V.o oVar, boolean z3, InterfaceC0576P interfaceC0576P, long j3, long j4, float f3, float f4, C0911t c0911t, r.l lVar, R.a aVar2, C0285q c0285q, int i2, int i3) {
        r.l lVar2;
        c0285q.V(-789752804);
        V.o oVar2 = (i3 & 2) != 0 ? V.l.f5857b : oVar;
        boolean z4 = (i3 & 4) != 0 ? true : z3;
        long b3 = (i3 & 32) != 0 ? AbstractC0107g0.b(j3, c0285q) : j4;
        float f5 = (i3 & 128) != 0 ? 0 : f4;
        C0911t c0911t2 = (i3 & 256) != 0 ? null : c0911t;
        if ((i3 & 512) != 0) {
            c0285q.V(-746940902);
            Object K3 = c0285q.K();
            if (K3 == C0275l.f4150a) {
                K3 = B1.t.o(c0285q);
            }
            c0285q.r(false);
            lVar2 = (r.l) K3;
        } else {
            lVar2 = lVar;
        }
        J.B b4 = f3310a;
        float f6 = ((O0.e) c0285q.l(b4)).f5138h + f3;
        C0257c.b(new C0287r0[]{AbstractC0183r0.f3050a.a(new C0603v(b3)), b4.a(new O0.e(f6))}, R.b.b(c0285q, 1279702876, new C0211v4(oVar2, interfaceC0576P, j3, f6, c0911t2, lVar2, z4, aVar, f5, aVar2)), c0285q, 48);
        c0285q.r(false);
    }

    public static final V.o d(V.o oVar, InterfaceC0576P interfaceC0576P, long j3, C0911t c0911t, float f3) {
        return B1.C.v(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, f3, 0.0f, interfaceC0576P, false, 124895).k(c0911t != null ? new BorderModifierNodeElement(c0911t.f8850a, c0911t.f8851b, interfaceC0576P) : V.l.f5857b), j3, interfaceC0576P), interfaceC0576P);
    }

    public static final long e(long j3, float f3, C0285q c0285q) {
        c0285q.V(-2079918090);
        C0093e0 c0093e0 = (C0093e0) c0285q.l(AbstractC0107g0.f2597a);
        boolean booleanValue = ((Boolean) c0285q.l(AbstractC0107g0.f2598b)).booleanValue();
        if (C0603v.c(j3, c0093e0.f2498p) && booleanValue) {
            j3 = AbstractC0107g0.f(c0093e0, f3);
        }
        c0285q.r(false);
        return j3;
    }
}
