package r0;

import a.AbstractC0423a;

/* renamed from: r0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1102P {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9833a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AbstractC1102P abstractC1102P, AbstractC1103Q abstractC1103Q) {
        abstractC1102P.getClass();
        if (abstractC1103Q instanceof t0.T) {
            ((t0.T) abstractC1103Q).E(abstractC1102P.f9833a);
        }
    }

    public static void d(AbstractC1102P abstractC1102P, AbstractC1103Q abstractC1103Q, int i2, int i3) {
        abstractC1102P.getClass();
        long m3 = AbstractC0423a.m(i2, i3);
        a(abstractC1102P, abstractC1103Q);
        abstractC1103Q.l0(O0.h.c(m3, abstractC1103Q.f9838l), 0.0f, null);
    }

    public static void e(AbstractC1102P abstractC1102P, AbstractC1103Q abstractC1103Q, long j3) {
        abstractC1102P.getClass();
        a(abstractC1102P, abstractC1103Q);
        abstractC1103Q.l0(O0.h.c(j3, abstractC1103Q.f9838l), 0.0f, null);
    }

    public static void f(AbstractC1102P abstractC1102P, AbstractC1103Q abstractC1103Q, int i2, int i3) {
        long m3 = AbstractC0423a.m(i2, i3);
        if (abstractC1102P.b() == O0.k.f5148h || abstractC1102P.c() == 0) {
            a(abstractC1102P, abstractC1103Q);
            abstractC1103Q.l0(O0.h.c(m3, abstractC1103Q.f9838l), 0.0f, null);
        } else {
            long m4 = AbstractC0423a.m((abstractC1102P.c() - abstractC1103Q.f9834h) - ((int) (m3 >> 32)), (int) (m3 & 4294967295L));
            a(abstractC1102P, abstractC1103Q);
            abstractC1103Q.l0(O0.h.c(m4, abstractC1103Q.f9838l), 0.0f, null);
        }
    }

    public static void g(AbstractC1102P abstractC1102P, AbstractC1103Q abstractC1103Q, long j3) {
        if (abstractC1102P.b() == O0.k.f5148h || abstractC1102P.c() == 0) {
            a(abstractC1102P, abstractC1103Q);
            abstractC1103Q.l0(O0.h.c(j3, abstractC1103Q.f9838l), 0.0f, null);
        } else {
            long m3 = AbstractC0423a.m((abstractC1102P.c() - abstractC1103Q.f9834h) - ((int) (j3 >> 32)), (int) (j3 & 4294967295L));
            a(abstractC1102P, abstractC1103Q);
            abstractC1103Q.l0(O0.h.c(m3, abstractC1103Q.f9838l), 0.0f, null);
        }
    }

    public static void h(AbstractC1102P abstractC1102P, AbstractC1103Q abstractC1103Q, int i2, int i3) {
        int i4 = AbstractC1105T.f9843b;
        C1104S c1104s = C1104S.f9839j;
        long m3 = AbstractC0423a.m(i2, i3);
        if (abstractC1102P.b() == O0.k.f5148h || abstractC1102P.c() == 0) {
            a(abstractC1102P, abstractC1103Q);
            abstractC1103Q.l0(O0.h.c(m3, abstractC1103Q.f9838l), 0.0f, c1104s);
        } else {
            long m4 = AbstractC0423a.m((abstractC1102P.c() - abstractC1103Q.f9834h) - ((int) (m3 >> 32)), (int) (m3 & 4294967295L));
            a(abstractC1102P, abstractC1103Q);
            abstractC1103Q.l0(O0.h.c(m4, abstractC1103Q.f9838l), 0.0f, c1104s);
        }
    }

    public static void i(AbstractC1102P abstractC1102P, AbstractC1103Q abstractC1103Q, long j3) {
        int i2 = AbstractC1105T.f9843b;
        C1104S c1104s = C1104S.f9839j;
        if (abstractC1102P.b() == O0.k.f5148h || abstractC1102P.c() == 0) {
            a(abstractC1102P, abstractC1103Q);
            abstractC1103Q.l0(O0.h.c(j3, abstractC1103Q.f9838l), 0.0f, c1104s);
        } else {
            long m3 = AbstractC0423a.m((abstractC1102P.c() - abstractC1103Q.f9834h) - ((int) (j3 >> 32)), (int) (j3 & 4294967295L));
            a(abstractC1102P, abstractC1103Q);
            abstractC1103Q.l0(O0.h.c(m3, abstractC1103Q.f9838l), 0.0f, c1104s);
        }
    }

    public static void j(AbstractC1102P abstractC1102P, AbstractC1103Q abstractC1103Q, int i2, int i3, y2.c cVar, int i4) {
        if ((i4 & 8) != 0) {
            int i5 = AbstractC1105T.f9843b;
            cVar = C1104S.f9839j;
        }
        abstractC1102P.getClass();
        long m3 = AbstractC0423a.m(i2, i3);
        a(abstractC1102P, abstractC1103Q);
        abstractC1103Q.l0(O0.h.c(m3, abstractC1103Q.f9838l), 0.0f, cVar);
    }

    public static void k(AbstractC1102P abstractC1102P, AbstractC1103Q abstractC1103Q, long j3) {
        int i2 = AbstractC1105T.f9843b;
        C1104S c1104s = C1104S.f9839j;
        abstractC1102P.getClass();
        a(abstractC1102P, abstractC1103Q);
        abstractC1103Q.l0(O0.h.c(j3, abstractC1103Q.f9838l), 0.0f, c1104s);
    }

    public abstract O0.k b();

    public abstract int c();
}
