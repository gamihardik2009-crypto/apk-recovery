package H;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import r0.AbstractC1108W;
import r0.InterfaceC1094H;
import s.C1160M;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* renamed from: H.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0127j {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2747a = 280;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2748b = 560;

    /* renamed from: c, reason: collision with root package name */
    public static final C1160M f2749c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1160M f2750d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1160M f2751e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1160M f2752f;

    static {
        float f3 = 24;
        f2749c = new C1160M(f3, f3, f3, f3);
        float f4 = 16;
        f2750d = androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, f4, 7);
        f2751e = androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, f4, 7);
        f2752f = androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, f3, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(y2.e r33, V.o r34, y2.e r35, y2.e r36, y2.e r37, c0.InterfaceC0576P r38, long r39, float r41, long r42, long r44, long r46, long r48, J.C0285q r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.AbstractC0127j.a(y2.e, V.o, y2.e, y2.e, y2.e, c0.P, long, float, long, long, long, long, J.q, int, int, int):void");
    }

    public static final void b(float f3, float f4, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(586821353);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.d(f3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.d(f4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(eVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.V(-1133133582);
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object K3 = c0285q.K();
            if (z3 || K3 == C0275l.f4150a) {
                K3 = new C0113h(f3, f4);
                c0285q.e0(K3);
            }
            InterfaceC1094H interfaceC1094H = (InterfaceC1094H) K3;
            c0285q.r(false);
            c0285q.V(-1323940314);
            V.l lVar = V.l.f5857b;
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i5 = AbstractC1108W.i(lVar);
            int i6 = ((((i3 >> 6) & 14) << 9) & 7168) | 6;
            if (!(c0285q.f4195a instanceof InterfaceC0259d)) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, interfaceC1094H, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                B1.t.q(i4, c0285q, i4, c1250h);
            }
            B1.t.r(0, i5, new J.C0(c0285q), c0285q, 2058660585);
            B1.t.s((i6 >> 9) & 14, eVar, c0285q, false, true);
            c0285q.r(false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0120i(f3, f4, eVar, i2);
        }
    }
}
