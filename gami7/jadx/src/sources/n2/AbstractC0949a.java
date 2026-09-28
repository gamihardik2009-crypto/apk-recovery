package n2;

import D.C0043l;
import H.C0148m;
import J.AbstractC0286q0;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J2.AbstractC0304a;
import J2.C0311h;
import J2.H;
import J2.j0;
import J2.p0;
import a.AbstractC0423a;
import android.content.Context;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import n1.C0944e;
import n1.F;
import p.C1007b;
import p1.C1058a;
import q2.C1074e;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r1.C1141d;
import r1.C1142e;
import r1.C1143f;
import t0.AbstractC1265x;
import v.C1344P;
import v.C1345Q;
import v.C1346S;
import v.C1352f;
import v.C1354h;
import v.InterfaceC1364r;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0949a {
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(V.o r25, t.C1228w r26, s.InterfaceC1159L r27, boolean r28, s.InterfaceC1171j r29, V.e r30, p.U r31, boolean r32, y2.c r33, J.C0285q r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.AbstractC0949a.a(V.o, t.w, s.L, boolean, s.j, V.e, p.U, boolean, y2.c, J.q, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(V.o r25, t.C1228w r26, s.InterfaceC1159L r27, boolean r28, s.InterfaceC1169h r29, V.f r30, p.U r31, boolean r32, y2.c r33, J.C0285q r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.AbstractC0949a.b(V.o, t.w, s.L, boolean, s.h, V.f, p.U, boolean, y2.c, J.q, int, int):void");
    }

    public static final void c(y2.f fVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(674185128);
        int i4 = 6;
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(fVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            AbstractC0286q0 abstractC0286q0 = S.l.f5571a;
            S.j jVar = (S.j) c0285q.l(abstractC0286q0);
            Object[] objArr = {jVar};
            C1345Q c1345q = C1345Q.f11310i;
            C1344P c1344p = new C1344P(jVar, 1);
            K1.e eVar = S.n.f5572a;
            K1.e eVar2 = new K1.e(c1345q, c1344p);
            boolean i5 = c0285q.i(jVar);
            Object K3 = c0285q.K();
            if (i5 || K3 == C0275l.f4150a) {
                K3 = new C0944e(13, jVar);
                c0285q.e0(K3);
            }
            Object obj = (C1346S) AbstractC0423a.Y(objArr, eVar2, null, (y2.a) K3, c0285q, 0, 4);
            C0257c.a(abstractC0286q0.a(obj), R.b.c(1863926504, new C0148m(obj, 20, fVar), c0285q), c0285q, 56);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new R0.q(i2, i4, fVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(u.C1270a r27, V.o r28, u.x r29, s.InterfaceC1159L r30, boolean r31, s.InterfaceC1171j r32, s.InterfaceC1169h r33, p.U r34, boolean r35, y2.c r36, J.C0285q r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.AbstractC0949a.d(u.a, V.o, u.x, s.L, boolean, s.j, s.h, p.U, boolean, y2.c, J.q, int, int):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(n0.C0918A r8, q2.InterfaceC1073d r9) {
        /*
            boolean r0 = r9 instanceof o.C0977c
            if (r0 == 0) goto L13
            r0 = r9
            o.c r0 = (o.C0977c) r0
            int r1 = r0.f9184m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9184m = r1
            goto L18
        L13:
            o.c r0 = new o.c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9183l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9184m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            n0.A r8 = r0.f9182k
            C1.y.J(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            C1.y.J(r9)
        L34:
            r0.f9182k = r8
            r0.f9184m = r3
            n0.j r9 = n0.EnumC0931j.f8947i
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L41
            goto L6e
        L41:
            n0.i r9 = (n0.C0930i) r9
            int r2 = r9.f8944b
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.util.List r9 = r9.f8943a
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L51:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r9.get(r5)
            n0.r r6 = (n0.r) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L34
            boolean r7 = r6.f8964h
            if (r7 != 0) goto L34
            boolean r6 = r6.f8960d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L51
        L6a:
            java.lang.Object r1 = r9.get(r4)
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.AbstractC0949a.e(n0.A, q2.d):java.lang.Object");
    }

    public static final n1.y f(Context context) {
        z2.h.f(context, "context");
        n1.y yVar = new n1.y(context);
        F f3 = yVar.f9136v;
        f3.a(new o1.g(f3));
        yVar.f9136v.a(new o1.i());
        yVar.f9136v.a(new o1.o());
        return yVar;
    }

    public static void g(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new IllegalArgumentException(AbstractC1265x.d(i2, i3, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    public static final void h(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                B1.C.p(th, th2);
            }
        }
    }

    public static final G1.h i(r1.r rVar, boolean z3, String[] strArr, Callable callable) {
        return new G1.h(2, new C1141d(z3, rVar, strArr, callable, null));
    }

    public static final Object j(r1.r rVar, CancellationSignal cancellationSignal, Callable callable, InterfaceC1073d interfaceC1073d) {
        InterfaceC1078i k3;
        if (rVar.l() && rVar.g().q().g()) {
            return callable.call();
        }
        r1.y yVar = (r1.y) interfaceC1073d.n().s(r1.y.f10023j);
        if (yVar == null || (k3 = yVar.f10024h) == null) {
            k3 = AbstractC0960l.k(rVar);
        }
        C0311h c0311h = new C0311h(1, AbstractC0948C.i(interfaceC1073d));
        c0311h.r();
        C1143f c1143f = new C1143f(callable, c0311h, null);
        int i2 = 2 & 1;
        C1079j c1079j = C1079j.f9784h;
        if (i2 != 0) {
            k3 = c1079j;
        }
        int i3 = (2 & 2) != 0 ? 1 : 0;
        InterfaceC1078i h2 = J2.B.h(c1079j, k3, true);
        Q2.d dVar = H.f4356a;
        if (h2 != dVar && h2.s(C1074e.f9782h) == null) {
            h2 = h2.A(dVar);
        }
        if (i3 == 0) {
            throw null;
        }
        AbstractC0304a j0Var = i3 == 2 ? new j0(h2, c1143f) : new p0(h2, true);
        j0Var.m0(i3, j0Var, c1143f);
        c0311h.u(new C1007b(cancellationSignal, 5, j0Var));
        return c0311h.q();
    }

    public static final Object k(r1.r rVar, Callable callable, InterfaceC1073d interfaceC1073d) {
        InterfaceC1078i l3;
        if (rVar.l() && rVar.g().q().g()) {
            return callable.call();
        }
        r1.y yVar = (r1.y) interfaceC1073d.n().s(r1.y.f10023j);
        if (yVar == null || (l3 = yVar.f10024h) == null) {
            l3 = AbstractC0960l.l(rVar);
        }
        return J2.B.z(l3, new C1142e(callable, null), interfaceC1073d);
    }

    public static final int l(T2.a aVar) {
        int hashCode = aVar.b().b().hashCode();
        int f3 = aVar.b().f();
        for (int i2 = 0; i2 < f3; i2++) {
            hashCode = (hashCode * 31) + aVar.b().a(i2).hashCode();
        }
        return hashCode;
    }

    public static final String m(Object obj, LinkedHashMap linkedHashMap) {
        z2.h.f(obj, "route");
        T2.a M3 = K1.f.M(z2.t.a(obj.getClass()));
        new C1058a(M3, linkedHashMap).o(obj);
        String b3 = M3.b().b();
        if (M3.b().f() <= 0) {
            return b3 + "";
        }
        String a3 = M3.b().a(0);
        B1.t.w(linkedHashMap.get(a3));
        throw new IllegalStateException(("Cannot locate NavType for argument [" + a3 + ']').toString());
    }

    public Object n(int i2) {
        C1354h e3 = o().e(i2);
        return ((InterfaceC1364r) e3.f11347c).a().l(Integer.valueOf(i2 - e3.f11345a));
    }

    public abstract C0043l o();

    public Object p(int i2) {
        Object l3;
        C1354h e3 = o().e(i2);
        int i3 = i2 - e3.f11345a;
        y2.c key = ((InterfaceC1364r) e3.f11347c).getKey();
        return (key == null || (l3 = key.l(Integer.valueOf(i3))) == null) ? new C1352f(i2) : l3;
    }
}
