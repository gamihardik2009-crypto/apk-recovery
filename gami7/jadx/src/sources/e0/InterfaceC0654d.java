package e0;

import B1.C;
import K1.m;
import O0.k;
import c0.AbstractC0598q;
import c0.C0588g;
import c0.C0594m;
import c0.InterfaceC0570J;

/* renamed from: e0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0654d extends O0.b {
    static void A(InterfaceC0654d interfaceC0654d, AbstractC0598q abstractC0598q, long j3, long j4, long j5, h hVar, int i2) {
        long j6 = (i2 & 2) != 0 ? 0L : j3;
        interfaceC0654d.h0(abstractC0598q, j6, (i2 & 4) != 0 ? v0(interfaceC0654d.e(), j6) : j4, j5, 1.0f, (i2 & 32) != 0 ? g.f7556a : hVar, null, 3);
    }

    static /* synthetic */ void O(InterfaceC0654d interfaceC0654d, AbstractC0598q abstractC0598q, long j3, long j4, float f3, AbstractC0655e abstractC0655e, int i2) {
        long j5 = (i2 & 2) != 0 ? 0L : j3;
        interfaceC0654d.u(abstractC0598q, j5, (i2 & 4) != 0 ? v0(interfaceC0654d.e(), j5) : j4, (i2 & 8) != 0 ? 1.0f : f3, (i2 & 16) != 0 ? g.f7556a : abstractC0655e, null, 3);
    }

    static void S(InterfaceC0654d interfaceC0654d, long j3, long j4, long j5, long j6, AbstractC0655e abstractC0655e, int i2) {
        interfaceC0654d.x0(j3, (i2 & 2) != 0 ? 0L : j4, j5, j6, abstractC0655e, 1.0f, null, 3);
    }

    static /* synthetic */ void U(InterfaceC0654d interfaceC0654d, InterfaceC0570J interfaceC0570J, AbstractC0598q abstractC0598q, float f3, h hVar, int i2) {
        if ((i2 & 4) != 0) {
            f3 = 1.0f;
        }
        float f4 = f3;
        AbstractC0655e abstractC0655e = hVar;
        if ((i2 & 8) != 0) {
            abstractC0655e = g.f7556a;
        }
        interfaceC0654d.B(interfaceC0570J, abstractC0598q, f4, abstractC0655e, null, (i2 & 32) != 0 ? 3 : 0);
    }

    static void q(InterfaceC0654d interfaceC0654d, C0588g c0588g, long j3, float f3, C0594m c0594m, int i2) {
        interfaceC0654d.Z(c0588g, 0L, j3, 0L, j3, (i2 & 32) != 0 ? 1.0f : f3, g.f7556a, c0594m, 3, 1);
    }

    static long v0(long j3, long j4) {
        return C.i(b0.f.d(j3) - b0.c.d(j4), b0.f.b(j3) - b0.c.e(j4));
    }

    void B(InterfaceC0570J interfaceC0570J, AbstractC0598q abstractC0598q, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2);

    void X(InterfaceC0570J interfaceC0570J, long j3, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2);

    void Z(C0588g c0588g, long j3, long j4, long j5, long j6, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2, int i3);

    void c0(C0588g c0588g, long j3, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2);

    default long e() {
        return e0().j();
    }

    m e0();

    k getLayoutDirection();

    void h0(AbstractC0598q abstractC0598q, long j3, long j4, long j5, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2);

    void k0(long j3, float f3, long j4, float f4, AbstractC0655e abstractC0655e, C0594m c0594m, int i2);

    void o(AbstractC0598q abstractC0598q, long j3, long j4, float f3, int i2, float f4, C0594m c0594m, int i3);

    void u(AbstractC0598q abstractC0598q, long j3, long j4, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2);

    void v(long j3, long j4, long j5, float f3, int i2, float f4, C0594m c0594m, int i3);

    void w0(long j3, long j4, long j5, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2);

    default long x() {
        return C.R(e0().j());
    }

    void x0(long j3, long j4, long j5, long j6, AbstractC0655e abstractC0655e, float f3, C0594m c0594m, int i2);
}
