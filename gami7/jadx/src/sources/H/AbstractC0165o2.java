package H;

import C0.C0018a;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import java.util.List;
import n2.AbstractC0963o;
import r0.AbstractC1108W;
import r0.C1097K;
import r0.InterfaceC1094H;
import t0.C1250h;
import t0.C1252j;
import t0.InterfaceC1253k;
import u0.AbstractC1296l0;

/* renamed from: H.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0165o2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2969a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2970b = 12;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2971c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2972d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2973e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f2974f;

    static {
        float f3 = 16;
        f2971c = f3;
        f2972d = f3;
        f2973e = f3;
        f2974f = f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(y2.e r25, V.o r26, y2.e r27, y2.e r28, y2.e r29, y2.e r30, H.C0109g2 r31, float r32, float r33, J.C0285q r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.AbstractC0165o2.a(y2.e, V.o, y2.e, y2.e, y2.e, y2.e, H.g2, float, float, J.q, int, int):void");
    }

    public static final void b(y2.e eVar, y2.e eVar2, y2.e eVar3, y2.e eVar4, y2.e eVar5, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(2052297037);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(eVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(eVar3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c0285q.i(eVar4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c0285q.i(eVar5) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && c0285q.A()) {
            c0285q.P();
        } else {
            O0.k kVar = (O0.k) c0285q.l(AbstractC1296l0.f11093l);
            List v3 = AbstractC0963o.v(eVar3, eVar4 == null ? AbstractC0142l0.f2835a : eVar4, eVar5 == null ? AbstractC0142l0.f2836b : eVar5, eVar == null ? AbstractC0142l0.f2837c : eVar, eVar2 == null ? AbstractC0142l0.f2838d : eVar2);
            c0285q.V(1361340338);
            boolean g3 = c0285q.g(kVar);
            Object K3 = c0285q.K();
            Object obj = C0275l.f4150a;
            if (g3 || K3 == obj) {
                K3 = new C0137k2(kVar);
                c0285q.e0(K3);
            }
            C0137k2 c0137k2 = (C0137k2) K3;
            c0285q.r(false);
            c0285q.V(1399185516);
            V.l lVar = V.l.f5857b;
            R.a aVar = new R.a(-1953651383, new C0018a(14, v3), true);
            c0285q.V(1157296644);
            boolean g4 = c0285q.g(c0137k2);
            Object K4 = c0285q.K();
            if (g4 || K4 == obj) {
                K4 = new C1097K(c0137k2);
                c0285q.e0(K4);
            }
            c0285q.r(false);
            InterfaceC1094H interfaceC1094H = (InterfaceC1094H) K4;
            c0285q.V(-1323940314);
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            y2.a aVar2 = C1252j.f10598b;
            R.a i5 = AbstractC1108W.i(lVar);
            if (!(c0285q.f4195a instanceof InterfaceC0259d)) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(aVar2);
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
            aVar.j(c0285q, 0);
            c0285q.r(false);
            c0285q.r(true);
            c0285q.r(false);
            c0285q.r(false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0144l2(eVar, eVar2, eVar3, eVar4, eVar5, i2);
        }
    }

    public static final void c(long j3, I.F f3, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(1133967795);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.f(j3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.g(f3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(eVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            D1.h(j3, P5.a((O5) c0285q.l(P5.f1917a), f3), eVar, c0285q, (i3 & 14) | (i3 & 896));
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0151m2(j3, f3, eVar, i2, 0);
        }
    }
}
