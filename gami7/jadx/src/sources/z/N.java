package z;

import C0.C0021d;
import C0.C0024g;
import D.C0032a;
import D.C0053w;
import D.InterfaceC0045n;
import H.C0157n1;
import H.C3;
import J.C0257c;
import J.C0274k0;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import M2.C0346j;
import T.AbstractC0379g;
import a.AbstractC0423a;
import a0.C0438o;
import a0.InterfaceC0431h;
import android.view.KeyEvent;
import java.util.concurrent.atomic.AtomicReference;
import n0.C0922a;
import n1.C0944e;
import o.C0988n;
import p.C1007b;
import r0.InterfaceC1094H;
import r0.InterfaceC1096J;
import r0.InterfaceC1129r;
import s.AbstractC1177p;
import t0.AbstractC1265x;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import u0.AbstractC1296l0;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final M f11524a = new M();

    /* renamed from: b, reason: collision with root package name */
    public static final C0922a f11525b = new C0922a(1008);

    /* JADX WARN: Removed duplicated region for block: B:105:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r28, V.o r29, C0.K r30, y2.c r31, int r32, boolean r33, int r34, int r35, J.C0285q r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.N.a(java.lang.String, V.o, C0.K, y2.c, int, boolean, int, int, J.q, int, int):void");
    }

    public static final void b(D.X x2, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(-1985516685);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(x2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            Object K3 = c0285q.K();
            J.W w2 = C0275l.f4150a;
            if (K3 == w2) {
                K3 = new C0988n();
                c0285q.e0(K3);
            }
            C0988n c0988n = (C0988n) K3;
            Object K4 = c0285q.K();
            if (K4 == w2) {
                K4 = new C0944e(16, c0988n);
                c0285q.e0(K4);
            }
            n1.E.b(c0988n, (y2.a) K4, new C0053w(x2, 1, c0988n), null, x2.j(), eVar, c0285q, ((i3 << 12) & 458752) | 54, 8);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0157n1(i2, 13, x2, eVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0394 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x056e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0598 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0606 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0643 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x069e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0750 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0777 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x07a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0848 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0377 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(I0.z r51, y2.c r52, V.o r53, C0.K r54, I0.I r55, y2.c r56, r.l r57, c0.AbstractC0598q r58, boolean r59, int r60, int r61, I0.m r62, z.P r63, boolean r64, boolean r65, y2.f r66, J.C0285q r67, int r68, int r69, int r70) {
        /*
            Method dump skipped, instructions count: 2409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.N.c(I0.z, y2.c, V.o, C0.K, I0.I, y2.c, r.l, c0.q, boolean, int, int, I0.m, z.P, boolean, boolean, y2.f, J.q, int, int, int):void");
    }

    public static final void d(V.o oVar, D.X x2, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(-20551815);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(x2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(eVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            InterfaceC1094H e3 = AbstractC1177p.e(V.b.f5831h, true);
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            V.o d3 = V.a.d(c0285q, oVar);
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
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
            C0257c.V(c0285q, e3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                B1.t.q(i4, c0285q, i4, c1250h);
            }
            C0257c.V(c0285q, d3, C1252j.f10600d);
            int i5 = i3 >> 3;
            b(x2, eVar, c0285q, (i5 & 112) | (i5 & 14));
            c0285q.r(true);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0032a(oVar, x2, eVar, i2, 6);
        }
    }

    public static final void e(D.X x2, C0285q c0285q, int i2) {
        int i3;
        Z z3;
        int i4 = 0;
        c0285q.W(-1436003720);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(x2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            S s3 = x2.f783d;
            if (s3 != null && ((Boolean) s3.f11557o.getValue()).booleanValue()) {
                S s4 = x2.f783d;
                C0024g c0024g = (s4 == null || (z3 = s4.f11543a) == null) ? null : z3.f11605a;
                if (c0024g != null && c0024g.f500a.length() > 0) {
                    c0285q.U(-285446808);
                    boolean g3 = c0285q.g(x2);
                    Object K3 = c0285q.K();
                    Object obj = C0275l.f4150a;
                    if (g3 || K3 == obj) {
                        K3 = new D.U(x2, i4);
                        c0285q.e0(K3);
                    }
                    a0 a0Var = (a0) K3;
                    O0.b bVar = (O0.b) c0285q.l(AbstractC1296l0.f11087f);
                    I0.s sVar = x2.f781b;
                    long j3 = x2.l().f3933b;
                    int i6 = C0.J.f472c;
                    int l3 = sVar.l((int) (j3 >> 32));
                    S s5 = x2.f783d;
                    p0 d3 = s5 != null ? s5.d() : null;
                    z2.h.c(d3);
                    C0.H h2 = d3.f11788a;
                    b0.d c3 = h2.c(B1.C.C(l3, 0, h2.f461a.f451a.f500a.length()));
                    long e3 = K1.f.e((bVar.P(c0.f11628a) / 2) + c3.f7060a, c3.f7063d);
                    boolean f3 = c0285q.f(e3);
                    Object K4 = c0285q.K();
                    if (f3 || K4 == obj) {
                        K4 = new C1433y(e3);
                        c0285q.e0(K4);
                    }
                    InterfaceC0045n interfaceC0045n = (InterfaceC0045n) K4;
                    V.l lVar = V.l.f5857b;
                    boolean i7 = c0285q.i(a0Var) | c0285q.i(x2);
                    Object K5 = c0285q.K();
                    if (i7 || K5 == obj) {
                        K5 = new C1403C(a0Var, x2, null);
                        c0285q.e0(K5);
                    }
                    V.o a3 = n0.w.a(lVar, a0Var, (y2.e) K5);
                    boolean f4 = c0285q.f(e3);
                    Object K6 = c0285q.K();
                    if (f4 || K6 == obj) {
                        K6 = new C0346j(e3, i5);
                        c0285q.e0(K6);
                    }
                    AbstractC1412c.a(interfaceC0045n, A0.m.b(a3, false, (y2.c) K6), 0L, c0285q, 0, 4);
                    c0285q.r(false);
                }
            }
            c0285q.U(-284257090);
            c0285q.r(false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new R0.q(i2, 7, x2);
        }
    }

    public static final void f(D.X x2, boolean z3, C0285q c0285q, int i2) {
        int i3;
        p0 d3;
        C0.H h2;
        c0285q.W(626339208);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(x2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.h(z3) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else if (z3) {
            c0285q.U(-1286242594);
            S s3 = x2.f783d;
            C0.H h3 = null;
            if (s3 != null && (d3 = s3.d()) != null && (h2 = d3.f11788a) != null) {
                if (!(x2.f783d != null ? r6.f11558p : true)) {
                    h3 = h2;
                }
            }
            if (h3 == null) {
                c0285q.U(-1285984396);
            } else {
                c0285q.U(-1285984395);
                if (C0.J.b(x2.l().f3933b)) {
                    c0285q.U(-1679637798);
                    c0285q.r(false);
                } else {
                    c0285q.U(-1680616096);
                    int l3 = x2.f781b.l((int) (x2.l().f3933b >> 32));
                    int l4 = x2.f781b.l((int) (x2.l().f3933b & 4294967295L));
                    N0.h a3 = h3.a(l3);
                    N0.h a4 = h3.a(Math.max(l4 - 1, 0));
                    S s4 = x2.f783d;
                    if (s4 == null || !((Boolean) s4.f11555m.getValue()).booleanValue()) {
                        c0285q.U(-1679975078);
                        c0285q.r(false);
                    } else {
                        c0285q.U(-1680216289);
                        AbstractC0423a.s(true, a3, x2, c0285q, ((i3 << 6) & 896) | 6);
                        c0285q.r(false);
                    }
                    S s5 = x2.f783d;
                    if (s5 == null || !((Boolean) s5.f11556n.getValue()).booleanValue()) {
                        c0285q.U(-1679655654);
                        c0285q.r(false);
                    } else {
                        c0285q.U(-1679895904);
                        AbstractC0423a.s(false, a4, x2, c0285q, ((i3 << 6) & 896) | 6);
                        c0285q.r(false);
                    }
                    c0285q.r(false);
                }
                S s6 = x2.f783d;
                if (s6 != null) {
                    boolean z4 = !z2.h.a(x2.f797s.f3932a.f500a, x2.l().f3932a.f500a);
                    C0274k0 c0274k0 = s6.f11554l;
                    if (z4) {
                        c0274k0.setValue(Boolean.FALSE);
                    }
                    if (s6.b()) {
                        if (((Boolean) c0274k0.getValue()).booleanValue()) {
                            x2.s();
                        } else {
                            x2.m();
                        }
                    }
                }
            }
            c0285q.r(false);
            c0285q.r(false);
        } else {
            c0285q.U(651305535);
            c0285q.r(false);
            x2.m();
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C1432x(x2, z3, i2);
        }
    }

    public static final void g(S s3) {
        I0.F f3 = s3.f11547e;
        if (f3 != null) {
            s3.f11561t.l(I0.z.a((I0.z) s3.f11546d.f239c, null, 0L, 3));
            I0.A a3 = f3.f3862a;
            AtomicReference atomicReference = a3.f3839b;
            while (true) {
                if (atomicReference.compareAndSet(f3, null)) {
                    a3.f3838a.d();
                    break;
                } else if (atomicReference.get() != f3) {
                    break;
                }
            }
        }
        s3.f11547e = null;
    }

    public static final b0.d h(InterfaceC1096J interfaceC1096J, int i2, I0.G g3, C0.H h2, boolean z3, int i3) {
        b0.d c3 = h2 != null ? h2.c(g3.f3865b.l(i2)) : b0.d.f7059e;
        int l3 = interfaceC1096J.l(c0.f11628a);
        float f3 = c3.f7060a;
        return new b0.d(z3 ? (i3 - f3) - l3 : f3, c3.f7061b, z3 ? i3 - f3 : l3 + f3, c3.f7063d);
    }

    public static final boolean i(KeyEvent keyEvent, int i2) {
        return ((int) (K1.f.d(keyEvent.getKeyCode()) >> 32)) == i2;
    }

    public static final void j(I0.A a3, S s3, I0.z zVar, I0.m mVar, I0.s sVar) {
        B.z zVar2 = s3.f11546d;
        z2.s sVar2 = new z2.s();
        L2.d dVar = new L2.d(zVar2, s3.f11561t, sVar2, 18);
        I0.t tVar = a3.f3838a;
        tVar.h(zVar, mVar, dVar, s3.f11562u);
        I0.F f3 = new I0.F(a3, tVar);
        a3.f3839b.set(f3);
        sVar2.f11909h = f3;
        s3.f11547e = f3;
        r(s3, zVar, sVar);
    }

    public static I0.G k(long j3, I0.G g3) {
        int i2 = C0.J.f472c;
        I0.s sVar = g3.f3865b;
        int l3 = sVar.l((int) (j3 >> 32));
        int l4 = sVar.l((int) (j3 & 4294967295L));
        int min = Math.min(l3, l4);
        int max = Math.max(l3, l4);
        C0021d c0021d = new C0021d(g3.f3864a);
        c0021d.a(new C0.C(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, N0.j.f4994c, null, 61439), min, max);
        return new I0.G(c0021d.c(), sVar);
    }

    public static final int l(float f3) {
        return Math.round((float) Math.ceil(f3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.b() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m(java.lang.String r9, int r10) {
        /*
            boolean r0 = g1.C0687i.c()
            r1 = 0
            if (r0 == 0) goto L13
            g1.i r0 = g1.C0687i.a()
            int r2 = r0.b()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L6f
            g1.f r0 = r0.f7724e
            Q1.r r2 = r0.f7716b
            r2.getClass()
            r0 = -1
            if (r10 < 0) goto L66
            int r3 = r9.length()
            if (r10 < r3) goto L27
            goto L66
        L27:
            boolean r3 = r9 instanceof android.text.Spanned
            r4 = 0
            if (r3 == 0) goto L43
            r3 = r9
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r5 = r10 + 1
            java.lang.Class<g1.u> r6 = g1.u.class
            java.lang.Object[] r5 = r3.getSpans(r10, r5, r6)
            g1.u[] r5 = (g1.u[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L43
            r2 = r5[r4]
            int r2 = r3.getSpanEnd(r2)
            goto L67
        L43:
            int r3 = r10 + (-16)
            int r4 = java.lang.Math.max(r4, r3)
            int r3 = r9.length()
            int r5 = r10 + 16
            int r5 = java.lang.Math.min(r3, r5)
            g1.o r8 = new g1.o
            r8.<init>(r10)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1
            r3 = r9
            java.lang.Object r2 = r2.f(r3, r4, r5, r6, r7, r8)
            g1.o r2 = (g1.o) r2
            int r2 = r2.f7735j
            goto L67
        L66:
            r2 = r0
        L67:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L6e
            goto L6f
        L6e:
            r1 = r3
        L6f:
            if (r1 == 0) goto L76
            int r9 = r1.intValue()
            return r9
        L76:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r9)
            int r9 = r0.following(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z.N.m(java.lang.String, int):int");
    }

    public static final int n(String str, int i2) {
        int length = str.length();
        while (i2 < length) {
            if (str.charAt(i2) == '\n') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    public static final int o(String str, int i2) {
        while (i2 > 0) {
            if (str.charAt(i2 - 1) == '\n') {
                return i2;
            }
            i2--;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.b() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int p(java.lang.String r11, int r12) {
        /*
            boolean r0 = g1.C0687i.c()
            r1 = 0
            if (r0 == 0) goto L13
            g1.i r0 = g1.C0687i.a()
            int r2 = r0.b()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L75
            int r2 = r12 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            g1.f r0 = r0.f7724e
            Q1.r r4 = r0.f7716b
            r4.getClass()
            r0 = -1
            if (r2 < 0) goto L6c
            int r5 = r11.length()
            if (r2 < r5) goto L2e
            goto L6c
        L2e:
            boolean r5 = r11 instanceof android.text.Spanned
            if (r5 == 0) goto L49
            r5 = r11
            android.text.Spanned r5 = (android.text.Spanned) r5
            int r6 = r2 + 1
            java.lang.Class<g1.u> r7 = g1.u.class
            java.lang.Object[] r6 = r5.getSpans(r2, r6, r7)
            g1.u[] r6 = (g1.u[]) r6
            int r7 = r6.length
            if (r7 <= 0) goto L49
            r2 = r6[r3]
            int r2 = r5.getSpanStart(r2)
            goto L6d
        L49:
            int r5 = r2 + (-16)
            int r6 = java.lang.Math.max(r3, r5)
            int r3 = r11.length()
            int r5 = r2 + 16
            int r7 = java.lang.Math.min(r3, r5)
            g1.o r10 = new g1.o
            r10.<init>(r2)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r11
            java.lang.Object r2 = r4.f(r5, r6, r7, r8, r9, r10)
            g1.o r2 = (g1.o) r2
            int r2 = r2.f7734i
            goto L6d
        L6c:
            r2 = r0
        L6d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L74
            goto L75
        L74:
            r1 = r3
        L75:
            if (r1 == 0) goto L7c
            int r11 = r1.intValue()
            return r11
        L7c:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r11)
            int r11 = r0.preceding(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z.N.p(java.lang.String, int):int");
    }

    public static final V.o q(V.o oVar, S s3, InterfaceC0431h interfaceC0431h) {
        return androidx.compose.ui.input.key.a.b(oVar, new C1007b(interfaceC0431h, 19, s3));
    }

    public static final void r(S s3, I0.z zVar, I0.s sVar) {
        AbstractC0379g c3 = T.s.c();
        y2.c f3 = c3 != null ? c3.f() : null;
        AbstractC0379g d3 = T.s.d(c3);
        try {
            p0 d4 = s3.d();
            if (d4 == null) {
                return;
            }
            I0.F f4 = s3.f11547e;
            if (f4 == null) {
                return;
            }
            InterfaceC1129r c4 = s3.c();
            if (c4 == null) {
                return;
            }
            s(zVar, s3.f11543a, d4.f11788a, c4, f4, s3.b(), sVar);
        } finally {
            T.s.f(c3, d3, f3);
        }
    }

    public static void s(I0.z zVar, Z z3, C0.H h2, InterfaceC1129r interfaceC1129r, I0.F f3, boolean z4, I0.s sVar) {
        long a3;
        b0.d dVar;
        if (z4) {
            int l3 = sVar.l(C0.J.d(zVar.f3933b));
            if (l3 < h2.f461a.f451a.f500a.length()) {
                dVar = h2.b(l3);
            } else if (l3 != 0) {
                dVar = h2.b(l3 - 1);
            } else {
                a3 = d0.a(z3.f11606b, z3.f11611g, z3.f11612h, d0.f11642a, 1);
                dVar = new b0.d(0.0f, 0.0f, 1.0f, (int) (a3 & 4294967295L));
            }
            long K3 = interfaceC1129r.K(K1.f.e(dVar.f7060a, dVar.f7061b));
            b0.d n3 = AbstractC0423a.n(K1.f.e(b0.c.d(K3), b0.c.e(K3)), B1.C.i(dVar.d(), dVar.c()));
            if (z2.h.a((I0.F) f3.f3862a.f3839b.get(), f3)) {
                f3.f3863b.a(n3);
            }
        }
    }

    public static final V.o t(V.o oVar, S s3, D.X x2) {
        return androidx.compose.ui.input.key.a.b(oVar, new C1007b(s3, 18, x2));
    }

    public static final V.o u(V.o oVar, r.l lVar, boolean z3, y2.c cVar) {
        return z3 ? V.a.b(oVar, new D.H(6, lVar, cVar)) : oVar;
    }

    public static final V.o v(boolean z3, C0438o c0438o, r.l lVar, y2.c cVar) {
        return androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(c0438o), cVar), z3, lVar);
    }

    public static final V.o w(int i2, D.X x2, I0.s sVar, I0.z zVar, C1426q c1426q, S s3, q0 q0Var, boolean z3, boolean z4) {
        return V.a.b(V.l.f5857b, new f0(i2, x2, sVar, zVar, c1426q, s3, q0Var, z3, z4));
    }

    public static final V.o x(V.o oVar, n0 n0Var, r.l lVar, boolean z3) {
        return V.a.b(oVar, new C3(n0Var, z3, lVar));
    }

    public static final void y(int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            if (i2 > i3) {
                throw new IllegalArgumentException(AbstractC1265x.d(i2, i3, "minLines ", " must be less than or equal to maxLines ").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero").toString());
    }
}
