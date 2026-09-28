package H;

import J.C0257c;
import J.C0274k0;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import r0.AbstractC1108W;

/* renamed from: H.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0124i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0274k0 f2737a = C0257c.N(Boolean.TRUE, J.W.f4109m);

    /* renamed from: b, reason: collision with root package name */
    public static final J.X0 f2738b = new J.X0(C0100f0.f2568t);

    /* renamed from: c, reason: collision with root package name */
    public static final float f2739c = 16;

    public static final void a(int i2, y2.e eVar, y2.f fVar, y2.e eVar2, y2.e eVar3, s.Y y3, y2.e eVar4, C0285q c0285q, int i3) {
        int i4;
        c0285q.W(1307205667);
        if ((i3 & 6) == 0) {
            i4 = (c0285q.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0285q.i(fVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0285q.i(eVar2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0285q.i(eVar3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0285q.g(y3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0285q.i(eVar4) ? 1048576 : 524288;
        }
        if ((i4 & 599187) == 599186 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.V(1646578117);
            boolean z3 = ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((458752 & i4) == 131072) | ((57344 & i4) == 16384) | ((i4 & 14) == 4) | ((3670016 & i4) == 1048576) | ((i4 & 896) == 256);
            Object K3 = c0285q.K();
            if (z3 || K3 == C0275l.f4150a) {
                K3 = new C0089d3(eVar, eVar2, eVar3, i2, y3, eVar4, fVar, 0);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            AbstractC1108W.b(null, (y2.e) K3, c0285q, 0, 1);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0096e3(i2, eVar, fVar, eVar2, eVar3, y3, eVar4, i3, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0247 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(V.o r29, y2.e r30, y2.e r31, y2.e r32, y2.e r33, int r34, long r35, long r37, s.Y r39, y2.f r40, J.C0285q r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.AbstractC0124i3.b(V.o, y2.e, y2.e, y2.e, y2.e, int, long, long, s.Y, y2.f, J.q, int, int):void");
    }

    public static final void c(int i2, y2.e eVar, y2.f fVar, y2.e eVar2, y2.e eVar3, s.Y y3, y2.e eVar4, C0285q c0285q, int i3) {
        int i4;
        c0285q.W(-2037614249);
        if ((i3 & 6) == 0) {
            i4 = (c0285q.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0285q.i(fVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0285q.i(eVar2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0285q.i(eVar3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0285q.g(y3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0285q.i(eVar4) ? 1048576 : 524288;
        }
        if ((i4 & 599187) == 599186 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.V(-273325894);
            boolean z3 = ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((458752 & i4) == 131072) | ((57344 & i4) == 16384) | ((i4 & 14) == 4) | ((3670016 & i4) == 1048576) | ((i4 & 896) == 256);
            Object K3 = c0285q.K();
            if (z3 || K3 == C0275l.f4150a) {
                K3 = new C0089d3(eVar, eVar2, eVar3, i2, y3, eVar4, fVar, 1);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            AbstractC1108W.b(null, (y2.e) K3, c0285q, 0, 1);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0096e3(i2, eVar, fVar, eVar2, eVar3, y3, eVar4, i3, 2);
        }
    }

    public static final void d(int i2, y2.e eVar, y2.f fVar, y2.e eVar2, y2.e eVar3, s.Y y3, y2.e eVar4, C0285q c0285q, int i3) {
        int i4;
        c0285q.W(-975511942);
        if ((i3 & 6) == 0) {
            i4 = (c0285q.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0285q.i(fVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0285q.i(eVar2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0285q.i(eVar3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0285q.g(y3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0285q.i(eVar4) ? 1048576 : 524288;
        }
        if ((599187 & i4) == 599186 && c0285q.A()) {
            c0285q.P();
        } else if (((Boolean) f2737a.getValue()).booleanValue()) {
            c0285q.V(-915303637);
            c(i2, eVar, fVar, eVar2, eVar3, y3, eVar4, c0285q, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (i4 & 3670016));
            c0285q.r(false);
        } else {
            c0285q.V(-915303332);
            a(i2, eVar, fVar, eVar2, eVar3, y3, eVar4, c0285q, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (i4 & 3670016));
            c0285q.r(false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0096e3(i2, eVar, fVar, eVar2, eVar3, y3, eVar4, i3, 1);
        }
    }
}
