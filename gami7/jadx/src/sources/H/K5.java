package H;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.C0302z;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import a.AbstractC0423a;
import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.AbstractC0571K;
import c0.InterfaceC0576P;
import com.example.bulksmsscheduler.R;
import java.util.ArrayList;
import java.util.List;
import m2.C0865g;
import n.C0911t;
import n2.AbstractC0963o;
import r0.AbstractC1108W;
import r0.InterfaceC1094H;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1177p;
import s.C1160M;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import x.C1388a;
import y.C1394b;
import y.C1396d;

/* loaded from: classes.dex */
public abstract class K5 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1682a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1683b = 7;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1684c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1685d;

    static {
        float f3 = 24;
        f1682a = f3;
        f1684c = f3;
        AbstractC0963o.v(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        List v3 = AbstractC0963o.v(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        ArrayList arrayList = new ArrayList(v3.size());
        int size = v3.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf((((Number) v3.get(i2)).intValue() % 12) + 12));
        }
        f1685d = 12;
    }

    public static final void a(V.o oVar, M5 m5, u5 u5Var, InterfaceC1094H interfaceC1094H, InterfaceC0576P interfaceC0576P, InterfaceC0576P interfaceC0576P2, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(1374241901);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.g(m5) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.g(u5Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c0285q.g(interfaceC1094H) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c0285q.g(interfaceC0576P) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c0285q.g(interfaceC0576P2) ? 131072 : 65536;
        }
        int i4 = i3;
        if ((i4 & 74899) == 74898 && c0285q.A()) {
            c0285q.P();
        } else {
            C0911t b3 = l0.c.b(I.B.f3453a, u5Var.f3188d);
            InterfaceC0576P a3 = AbstractC0204u3.a(I.B.f3454b, c0285q);
            z2.h.d(a3, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            C1396d c1396d = (C1396d) a3;
            String w2 = D1.w(R.string.m3c_time_picker_period_toggle_description, c0285q);
            c0285q.V(-2008454294);
            boolean g3 = c0285q.g(w2);
            Object K3 = c0285q.K();
            Object obj = C0275l.f4150a;
            if (g3 || K3 == obj) {
                K3 = new A0.o(w2, 9);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            V.o k3 = A0.m.b(A0.m.b(oVar, false, (y2.c) K3), false, C1388a.f11466i).k(new BorderModifierNodeElement(b3.f8850a, b3.f8851b, c1396d));
            c0285q.V(-1323940314);
            int i5 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            y2.a aVar = C1252j.f10598b;
            R.a i6 = AbstractC1108W.i(k3);
            if (!(c0285q.f4195a instanceof InterfaceC0259d)) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(aVar);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, interfaceC1094H, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i5))) {
                B1.t.q(i5, c0285q, i5, c1250h);
            }
            B1.t.r(0, i6, new J.C0(c0285q), c0285q, 2058660585);
            boolean z3 = !((Boolean) m5.f1755c.getValue()).booleanValue();
            c0285q.V(1654477599);
            int i7 = i4 & 112;
            boolean z4 = i7 == 32;
            Object K4 = c0285q.K();
            if (z4 || K4 == obj) {
                K4 = new w5(m5, 0);
                c0285q.e0(K4);
            }
            c0285q.r(false);
            int i8 = (i4 << 3) & 7168;
            e(z3, interfaceC0576P, (y2.a) K4, u5Var, AbstractC0177q0.f3023a, c0285q, ((i4 >> 9) & 112) | 24576 | i8);
            AbstractC1166e.a(c0285q, androidx.compose.foundation.a.b(androidx.compose.ui.layout.a.c(V.l.f5857b, "Spacer").k(new ZIndexElement(2.0f)).k(androidx.compose.foundation.layout.c.f6640b), u5Var.f3188d, AbstractC0571K.f7193a));
            boolean booleanValue = ((Boolean) m5.f1755c.getValue()).booleanValue();
            c0285q.V(1654478145);
            boolean z5 = i7 == 32;
            Object K5 = c0285q.K();
            if (z5 || K5 == obj) {
                K5 = new w5(m5, 1);
                c0285q.e0(K5);
            }
            c0285q.r(false);
            e(booleanValue, interfaceC0576P2, (y2.a) K5, u5Var, AbstractC0177q0.f3024b, c0285q, ((i4 >> 12) & 112) | 24576 | i8);
            c0285q.r(false);
            c0285q.r(true);
            c0285q.r(false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0103f3(oVar, m5, u5Var, interfaceC1094H, interfaceC0576P, interfaceC0576P2, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(H.M5 r32, V.o r33, H.u5 r34, J.C0285q r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.K5.b(H.M5, V.o, H.u5, J.q, int, int):void");
    }

    public static final void c(int i2, u5 u5Var, M5 m5, C0285q c0285q, V.o oVar) {
        int i3;
        boolean z3;
        boolean z4;
        c0285q.W(-475657989);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.g(u5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.g(m5) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            Object[] objArr = new Object[0];
            K1.e eVar = I0.z.f3931d;
            c0285q.V(565122579);
            int i5 = i4 & 896;
            boolean z5 = i5 == 256;
            Object K3 = c0285q.K();
            J.W w2 = C0275l.f4150a;
            if (z5 || K3 == w2) {
                K3 = new w5(m5, 2);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            InterfaceC0258c0 X3 = AbstractC0423a.X(objArr, eVar, (y2.a) K3, c0285q);
            Object[] objArr2 = new Object[0];
            c0285q.V(565122759);
            boolean z6 = i5 == 256;
            Object K4 = c0285q.K();
            if (z6 || K4 == w2) {
                K4 = new w5(m5, 3);
                c0285q.e0(K4);
            }
            c0285q.r(false);
            InterfaceC0258c0 X4 = AbstractC0423a.X(objArr2, eVar, (y2.a) K4, c0285q);
            V.o l3 = androidx.compose.foundation.layout.a.l(oVar, 0.0f, 0.0f, 0.0f, f1684c, 7);
            V.f fVar = V.b.q;
            c0285q.V(693286680);
            s.S a3 = s.Q.a(AbstractC1173l.f10149a, fVar, c0285q, 48);
            c0285q.V(-1323940314);
            int i6 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i7 = AbstractC1108W.i(l3);
            boolean z7 = c0285q.f4195a instanceof InterfaceC0259d;
            if (!z7) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C1250h c1250h = C1252j.f10602f;
            C0257c.V(c0285q, a3, c1250h);
            C1250h c1250h2 = C1252j.f10601e;
            C0257c.V(c0285q, n3, c1250h2);
            C1250h c1250h3 = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i6))) {
                B1.t.q(i6, c0285q, i6, c1250h3);
            }
            B1.t.r(0, i7, new J.C0(c0285q), c0285q, 2058660585);
            C0257c.a(t5.f3139a.a(C0.K.a(P5.a((O5) c0285q.l(P5.f1917a), I.A.f3448e), u5Var.f3195k, 0L, null, null, 0L, 3, 0L, null, null, 16744446)), R.b.b(c0285q, 1306700887, new O0(X3, m5, u5Var, X4, 1)), c0285q, 56);
            c0285q.V(565126032);
            if (m5.f1753a) {
                z3 = false;
                z4 = true;
            } else {
                V.l lVar = V.l.f5857b;
                V.o l4 = androidx.compose.foundation.layout.a.l(lVar, f1685d, 0.0f, 0.0f, 0.0f, 14);
                c0285q.V(733328855);
                s.r f3 = AbstractC1177p.f(V.b.f5831h, false, c0285q, 0);
                c0285q.V(-1323940314);
                int i8 = c0285q.f4194P;
                InterfaceC0282o0 n4 = c0285q.n();
                R.a i9 = AbstractC1108W.i(l4);
                if (!z7) {
                    C0257c.I();
                    throw null;
                }
                c0285q.Y();
                if (c0285q.f4193O) {
                    c0285q.m(c1251i);
                } else {
                    c0285q.h0();
                }
                C0257c.V(c0285q, f3, c1250h);
                C0257c.V(c0285q, n4, c1250h2);
                if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i8))) {
                    B1.t.q(i8, c0285q, i8, c1250h3);
                }
                B1.t.r(0, i9, new J.C0(c0285q), c0285q, 2058660585);
                f(((i4 >> 3) & 112) | 6 | ((i4 << 3) & 896), u5Var, m5, c0285q, androidx.compose.foundation.layout.c.k(lVar, I.A.f3445b, I.A.f3444a));
                z3 = false;
                z4 = true;
                B1.t.u(c0285q, false, true, false, false);
            }
            B1.t.u(c0285q, z3, z3, z4, z3);
            c0285q.r(z3);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new z5(oVar, u5Var, m5, i2);
        }
    }

    public static final void d(V.o oVar, int i2, M5 m5, int i3, u5 u5Var, C0285q c0285q, int i4) {
        int i5;
        c0285q.W(21099367);
        if ((i4 & 6) == 0) {
            i5 = (c0285q.g(oVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0285q.e(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0285q.g(m5) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0285q.e(i3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0285q.g(u5Var) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && c0285q.A()) {
            c0285q.P();
        } else {
            boolean a3 = C0186r3.a(m5.e(), i3);
            String w2 = D1.w(C0186r3.a(i3, 0) ? R.string.m3c_time_picker_hour_selection : R.string.m3c_time_picker_minute_selection, c0285q);
            long j3 = a3 ? u5Var.f3193i : u5Var.f3194j;
            long j4 = a3 ? u5Var.f3195k : u5Var.f3196l;
            c0285q.V(773894976);
            c0285q.V(-492369756);
            Object K3 = c0285q.K();
            Object obj = C0275l.f4150a;
            if (K3 == obj) {
                Object c0302z = new C0302z(C0257c.B(c0285q));
                c0285q.e0(c0302z);
                K3 = c0302z;
            }
            c0285q.r(false);
            Object obj2 = ((C0302z) K3).f4298h;
            c0285q.r(false);
            c0285q.V(-633372797);
            boolean g3 = c0285q.g(w2);
            Object K4 = c0285q.K();
            if (g3 || K4 == obj) {
                K4 = new A0.o(w2, 11);
                c0285q.e0(K4);
            }
            c0285q.r(false);
            V.o b3 = A0.m.b(oVar, true, (y2.c) K4);
            InterfaceC0576P a4 = AbstractC0204u3.a(I.B.f3459g, c0285q);
            c0285q.V(-633372653);
            boolean i6 = ((i5 & 7168) == 2048) | ((i5 & 896) == 256) | c0285q.i(obj2);
            Object K5 = c0285q.K();
            if (i6 || K5 == obj) {
                K5 = new E5(i3, 0, m5, obj2);
                c0285q.e0(K5);
            }
            c0285q.r(false);
            AbstractC0223x4.b(a3, (y2.a) K5, b3, false, a4, j3, 0L, 0.0f, 0.0f, null, null, R.b.b(c0285q, -1338709103, new F5(i3, m5, i2, j4)), c0285q, 0, 1992);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new G5(oVar, i2, m5, i3, u5Var, i4);
        }
    }

    public static final void e(boolean z3, InterfaceC0576P interfaceC0576P, y2.a aVar, u5 u5Var, y2.f fVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(-1937408098);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.h(z3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.g(interfaceC0576P) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(aVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c0285q.g(u5Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c0285q.i(fVar) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && c0285q.A()) {
            c0285q.P();
        } else {
            long j3 = z3 ? u5Var.f3191g : u5Var.f3192h;
            long j4 = z3 ? u5Var.f3189e : u5Var.f3190f;
            V.o k3 = new ZIndexElement(z3 ? 0.0f : 1.0f).k(androidx.compose.foundation.layout.c.f6640b);
            c0285q.V(526522672);
            boolean z4 = (i3 & 14) == 4;
            Object K3 = c0285q.K();
            if (z4 || K3 == C0275l.f4150a) {
                K3 = new H5(z3);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            float f3 = 0;
            D1.j(aVar, A0.m.b(k3, false, (y2.c) K3), false, interfaceC0576P, A.d(j4, j3, c0285q, 12), null, null, new C1160M(f3, f3, f3, f3), null, fVar, c0285q, ((i3 >> 6) & 14) | 12582912 | ((i3 << 6) & 7168) | ((i3 << 15) & 1879048192), 356);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new I5(z3, interfaceC0576P, aVar, u5Var, fVar, i2);
        }
    }

    public static final void f(int i2, u5 u5Var, M5 m5, C0285q c0285q, V.o oVar) {
        int i3;
        c0285q.W(-1898918107);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.g(m5) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.g(u5Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.V(-2030104119);
            Object K3 = c0285q.K();
            if (K3 == C0275l.f4150a) {
                K3 = X.f2131c;
                c0285q.e0(K3);
            }
            InterfaceC1094H interfaceC1094H = (InterfaceC1094H) K3;
            c0285q.r(false);
            InterfaceC0576P a3 = AbstractC0204u3.a(I.B.f3454b, c0285q);
            z2.h.d(a3, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            C1396d c1396d = (C1396d) a3;
            float f3 = (float) 0.0d;
            a(oVar, m5, u5Var, interfaceC1094H, AbstractC0204u3.b(c1396d), C1396d.a(c1396d, new C1394b(f3), new C1394b(f3), null, null, 12), c0285q, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new z5(oVar, m5, u5Var, i2);
        }
    }

    public static final void g(V.o oVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(2100674302);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            C0.K a3 = C0.K.a((C0.K) c0285q.l(t5.f3139a), 0L, 0L, null, null, 0L, 3, 0L, null, new N0.g(N0.f.f4983a, 17), 15695871);
            V.o a4 = A0.m.a(oVar, C0200u.f3143D);
            V.g gVar = V.b.f5835l;
            c0285q.V(733328855);
            s.r f3 = AbstractC1177p.f(gVar, false, c0285q, 6);
            c0285q.V(-1323940314);
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i5 = AbstractC1108W.i(a4);
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
            C0257c.V(c0285q, f3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                B1.t.q(i4, c0285q, i4, c1250h);
            }
            B1.t.r(0, i5, new J.C0(c0285q), c0285q, 2058660585);
            t5.b(":", null, AbstractC0107g0.d(I.A.f3451h, c0285q), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a3, c0285q, 6, 0, 65530);
            B1.t.u(c0285q, false, true, false, false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new v5(oVar, i2, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ce, code lost:
    
        if (z2.h.a(r51.K(), java.lang.Integer.valueOf(r3)) == false) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(V.o r43, I0.z r44, y2.c r45, H.M5 r46, int r47, z.Q r48, z.P r49, H.u5 r50, J.C0285q r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.K5.h(V.o, I0.z, y2.c, H.M5, int, z.Q, z.P, H.u5, J.q, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: NumberFormatException | IllegalArgumentException -> 0x0093, TryCatch #0 {NumberFormatException | IllegalArgumentException -> 0x0093, blocks: (B:15:0x0040, B:17:0x0048, B:19:0x0052, B:21:0x0061, B:23:0x0067, B:25:0x006c, B:27:0x0070, B:28:0x007c, B:31:0x0090, B:34:0x0084, B:35:0x0074, B:37:0x005b), top: B:14:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(int r8, H.M5 r9, I0.z r10, I0.z r11, int r12, y2.c r13) {
        /*
            C0.g r0 = r10.f3932a
            java.lang.String r0 = r0.f500a
            C0.g r11 = r11.f3932a
            java.lang.String r11 = r11.f500a
            boolean r11 = z2.h.a(r0, r11)
            if (r11 == 0) goto L13
            r13.l(r10)
            goto L93
        L13:
            C0.g r11 = r10.f3932a
            java.lang.String r11 = r11.f500a
            int r0 = r11.length()
            r1 = 1070141403(0x3fc90fdb, float:1.5707964)
            r2 = 1037465424(0x3dd67750, float:0.10471976)
            r3 = 0
            if (r0 != 0) goto L40
            boolean r8 = H.C0186r3.a(r8, r3)
            if (r8 == 0) goto L2e
            r9.f(r3)
            goto L36
        L2e:
            float r8 = (float) r3
            float r8 = r8 * r2
            float r8 = r8 - r1
            J.g0 r9 = r9.f1758f
            r9.h(r8)
        L36:
            java.lang.String r8 = ""
            I0.z r8 = I0.z.b(r10, r8)
            r13.l(r8)
            goto L93
        L40:
            int r0 = r11.length()     // Catch: java.lang.Throwable -> L93
            r4 = 3
            r5 = 1
            if (r0 != r4) goto L5b
            long r6 = r10.f3933b     // Catch: java.lang.Throwable -> L93
            int r0 = C0.J.f472c     // Catch: java.lang.Throwable -> L93
            r0 = 32
            long r6 = r6 >> r0
            int r0 = (int) r6     // Catch: java.lang.Throwable -> L93
            if (r0 != r5) goto L5b
            char r0 = r11.charAt(r3)     // Catch: java.lang.Throwable -> L93
            int r0 = B2.a.l(r0)     // Catch: java.lang.Throwable -> L93
            goto L5f
        L5b:
            int r0 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Throwable -> L93
        L5f:
            if (r0 > r12) goto L93
            boolean r8 = H.C0186r3.a(r8, r3)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L74
            r9.f(r0)     // Catch: java.lang.Throwable -> L93
            if (r0 <= r5) goto L7c
            boolean r8 = r9.f1753a     // Catch: java.lang.Throwable -> L93
            if (r8 != 0) goto L7c
            r9.g(r5)     // Catch: java.lang.Throwable -> L93
            goto L7c
        L74:
            float r8 = (float) r0     // Catch: java.lang.Throwable -> L93
            float r8 = r8 * r2
            float r8 = r8 - r1
            J.g0 r9 = r9.f1758f     // Catch: java.lang.Throwable -> L93
            r9.h(r8)     // Catch: java.lang.Throwable -> L93
        L7c:
            int r8 = r11.length()     // Catch: java.lang.Throwable -> L93
            r9 = 2
            if (r8 > r9) goto L84
            goto L90
        L84:
            char r8 = r11.charAt(r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L93
            I0.z r10 = I0.z.b(r10, r8)     // Catch: java.lang.Throwable -> L93
        L90:
            r13.l(r10)     // Catch: java.lang.Throwable -> L93
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H.K5.i(int, H.M5, I0.z, I0.z, int, y2.c):void");
    }

    public static final C0865g j(float f3, float f4) {
        if (Math.abs(f3 - f4) <= 3.141592653589793d) {
            return new C0865g(Float.valueOf(f3), Float.valueOf(f4));
        }
        double d3 = f3;
        if (d3 > 3.141592653589793d && f4 < 3.141592653589793d) {
            f4 += 6.2831855f;
        } else if (d3 < 3.141592653589793d && f4 > 3.141592653589793d) {
            f3 += 6.2831855f;
        }
        return new C0865g(Float.valueOf(f3), Float.valueOf(f4));
    }

    public static final M5 k(int i2, int i3, C0285q c0285q) {
        c0285q.V(1237715277);
        boolean is24HourFormat = DateFormat.is24HourFormat((Context) c0285q.l(AndroidCompositionLocals_androidKt.f6781b));
        Object[] objArr = new Object[0];
        C0114h0 c0114h0 = C0114h0.f2642J;
        C0200u c0200u = C0200u.F;
        K1.e eVar = S.n.f5572a;
        K1.e eVar2 = new K1.e(c0114h0, c0200u);
        c0285q.V(1737740702);
        boolean e3 = c0285q.e(i2) | c0285q.e(i3) | c0285q.h(is24HourFormat);
        Object K3 = c0285q.K();
        if (e3 || K3 == C0275l.f4150a) {
            K3 = new J5(i2, i3, is24HourFormat);
            c0285q.e0(K3);
        }
        c0285q.r(false);
        M5 m5 = (M5) AbstractC0423a.Y(objArr, eVar2, null, (y2.a) K3, c0285q, 0, 4);
        c0285q.r(false);
        return m5;
    }
}
