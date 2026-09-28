package C1;

import B1.C;
import B1.C0011a;
import C0.F;
import C0.H;
import C0.J;
import D.Q;
import H.AbstractC0107g0;
import H.AbstractC0124i3;
import H.AbstractC0162o;
import H.AbstractC0223x4;
import H.C0093e0;
import H.K5;
import H.M5;
import H.O5;
import H.P5;
import H.t5;
import J.C0257c;
import J.C0266g0;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.C0302z;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.V0;
import J.W;
import J.X0;
import J2.InterfaceC0328z;
import W1.C0380a;
import W1.C0389j;
import W1.C0391l;
import W1.C0392m;
import a.AbstractC0423a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0461j;
import androidx.lifecycle.X;
import androidx.lifecycle.c0;
import androidx.work.impl.WorkDatabase;
import c0.C0578S;
import c0.C0603v;
import c2.AbstractC0626c;
import c2.C0627d;
import com.example.bulksmsscheduler.R;
import com.example.bulksmsscheduler.SmsApplication;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import k1.C0783a;
import l1.AbstractC0815b;
import m2.C0867i;
import n.r0;
import n.w0;
import n0.C0919B;
import n1.C0944e;
import n1.D;
import n2.AbstractC0946A;
import r0.AbstractC1108W;
import r0.InterfaceC1129r;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1165d;
import s.C1170i;
import s.C1180t;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import z.N;
import z.S;
import z.p0;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static C0712e f699a;

    /* renamed from: b, reason: collision with root package name */
    public static C0712e f700b;

    /* renamed from: c, reason: collision with root package name */
    public static C0712e f701c;

    /* renamed from: d, reason: collision with root package name */
    public static C0712e f702d;

    /* renamed from: e, reason: collision with root package name */
    public static C0712e f703e;

    public y() {
        new ConcurrentHashMap();
    }

    public static final long A(S s3, b0.d dVar, int i2) {
        H h2;
        p0 d3 = s3.d();
        C0.o oVar = (d3 == null || (h2 = d3.f11788a) == null) ? null : h2.f462b;
        InterfaceC1129r c3 = s3.c();
        return (oVar == null || c3 == null) ? J.f471b : oVar.f(dVar.i(c3.m(0L)), i2, F.f450b);
    }

    public static final C0712e B() {
        C0712e c0712e = f703e;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.Warning", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        V0 v0 = new V0(1);
        v0.h(1.0f, 21.0f);
        v0.e(22.0f);
        v0.f(12.0f, 2.0f);
        v0.f(1.0f, 21.0f);
        v0.a();
        v0.h(13.0f, 18.0f);
        v0.e(-2.0f);
        v0.l(-2.0f);
        v0.e(2.0f);
        v0.l(2.0f);
        v0.a();
        v0.h(13.0f, 14.0f);
        v0.e(-2.0f);
        v0.l(-4.0f);
        v0.e(2.0f);
        v0.l(4.0f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f703e = b3;
        return b3;
    }

    public static int C(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(B1.t.h("type needs to be >= FIRST and <= LAST, type=", i2));
    }

    public static final boolean D(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean E(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final boolean F(int i2) {
        int type;
        return (!E(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, java.util.Map] */
    public static final void G(Context context) {
        LinkedHashMap linkedHashMap;
        z2.h.f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        z2.h.e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            B1.s.d().a(s.f679a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            z2.h.e(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(C0031a.f619a.a(context), "androidx.work.workdb");
            String[] strArr = s.f680b;
            int m3 = AbstractC0946A.m(strArr.length);
            if (m3 < 16) {
                m3 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(m3);
            for (String str : strArr) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            if (linkedHashMap2.isEmpty()) {
                ?? singletonMap = Collections.singletonMap(databasePath2, file);
                z2.h.e(singletonMap, "singletonMap(...)");
                linkedHashMap = singletonMap;
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        B1.s.d().g(s.f679a, "Over-writing contents of " + file3);
                    }
                    B1.s.d().a(s.f679a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static final long H(float f3, long j3) {
        return (Float.isNaN(f3) || f3 >= 1.0f) ? j3 : C0603v.b(C0603v.d(j3) * f3, j3);
    }

    public static final w0 I(C0285q c0285q) {
        Object[] objArr = new Object[0];
        K1.e eVar = w0.f8882i;
        boolean e3 = c0285q.e(0);
        Object K3 = c0285q.K();
        if (e3 || K3 == C0275l.f4150a) {
            K3 = new r0(0);
            c0285q.e0(K3);
        }
        return (w0) AbstractC0423a.Y(objArr, eVar, null, (y2.a) K3, c0285q, 0, 4);
    }

    public static final void J(Object obj) {
        if (obj instanceof C0867i) {
            throw ((C0867i) obj).f8648h;
        }
    }

    public static final String K(float f3) {
        if (Float.isNaN(f3)) {
            return "NaN";
        }
        if (Float.isInfinite(f3)) {
            return f3 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f4 = f3 * pow;
        int i2 = (int) f4;
        if (f4 - i2 >= 0.5f) {
            i2++;
        }
        float f5 = i2 / pow;
        return max > 0 ? String.valueOf(f5) : String.valueOf((int) f5);
    }

    public static V.o L(V.o oVar, w0 w0Var) {
        return V.a.b(oVar, new androidx.compose.foundation.e(w0Var, false, null, true, true));
    }

    public static final b0.d M(InterfaceC1129r interfaceC1129r) {
        b0.d e3 = AbstractC1108W.e(interfaceC1129r);
        long d3 = interfaceC1129r.d(K1.f.e(e3.f7060a, e3.f7061b));
        long d4 = interfaceC1129r.d(K1.f.e(e3.f7062c, e3.f7063d));
        return new b0.d(b0.c.d(d3), b0.c.e(d3), b0.c.d(d4), b0.c.e(d4));
    }

    public static final void a(String str, String str2, String str3, C0285q c0285q, int i2) {
        int i3;
        z2.h.f(str, "clientName");
        z2.h.f(str2, "status");
        c0285q.W(1916603440);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= c0285q.g(str2) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= c0285q.g(str3) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            AbstractC0223x4.a(androidx.compose.foundation.layout.c.f6639a, y.e.a(20), ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2498p, 0L, 1, 0.0f, null, R.b.c(94071349, new C0391l(str2, str3, str, 1), c0285q), c0285q, 12607494, 104);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0380a(str, str2, str3, i2, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(y2.a r22, R0.s r23, y2.e r24, J.C0285q r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.y.b(y2.a, R0.s, y2.e, J.q, int, int):void");
    }

    public static final long c(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final void d(int i2, C0285q c0285q) {
        int i3 = 0;
        c0285q.W(67507504);
        if (i2 == 0 && c0285q.A()) {
            c0285q.P();
        } else {
            X0 x02 = AndroidCompositionLocals_androidKt.f6781b;
            Context context = (Context) c0285q.l(x02);
            Object[] copyOf = Arrays.copyOf(new D[0], 0);
            o1.p pVar = o1.p.f9261i;
            C0919B c0919b = new C0919B(6, context);
            K1.e eVar = S.n.f5572a;
            K1.e eVar2 = new K1.e(pVar, c0919b);
            boolean i4 = c0285q.i(context);
            Object K3 = c0285q.K();
            if (i4 || K3 == C0275l.f4150a) {
                K3 = new C0944e(2, context);
                c0285q.e0(K3);
            }
            n1.y yVar = (n1.y) AbstractC0423a.Y(copyOf, eVar2, null, (y2.a) K3, c0285q, 0, 4);
            Context applicationContext = ((Context) c0285q.l(x02)).getApplicationContext();
            z2.h.d(applicationContext, "null cannot be cast to non-null type com.example.bulksmsscheduler.SmsApplication");
            V1.b bVar = new V1.b(((SmsApplication) applicationContext).a(), applicationContext);
            c0285q.V(1729797275);
            c0 a3 = AbstractC0815b.a(c0285q);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            X f02 = AbstractC0423a.f0(z2.t.a(Y1.H.class), a3, bVar, a3 instanceof InterfaceC0461j ? ((InterfaceC0461j) a3).a() : C0783a.f8106i, c0285q);
            c0285q.r(false);
            AbstractC0124i3.b(null, null, R.b.c(495032331, new P1.k(yVar, i3), c0285q), null, null, 0, 0L, 0L, null, R.b.c(915634817, new P1.m(yVar, i3, (Y1.H) f02), c0285q), c0285q, 805306752, 507);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new P1.e(i2, 0);
        }
    }

    public static final void e(n1.y yVar, Y1.H h2, C0285q c0285q, int i2) {
        R1.a aVar;
        InterfaceC0258c0 interfaceC0258c0;
        InterfaceC0258c0 interfaceC0258c02;
        Object obj;
        InterfaceC0258c0 interfaceC0258c03;
        InterfaceC0258c0 interfaceC0258c04;
        InterfaceC0258c0 interfaceC0258c05;
        boolean z3;
        InterfaceC0258c0 interfaceC0258c06;
        z2.h.f(yVar, "navController");
        z2.h.f(h2, "viewModel");
        c0285q.W(89892322);
        Context context = (Context) c0285q.l(AndroidCompositionLocals_androidKt.f6781b);
        InterfaceC0258c0 G3 = C.G(h2.f6270h, c0285q);
        Object K3 = c0285q.K();
        Object obj2 = C0275l.f4150a;
        if (K3 == obj2) {
            Object c0302z = new C0302z(C0257c.B(c0285q));
            c0285q.e0(c0302z);
            K3 = c0302z;
        }
        InterfaceC0328z interfaceC0328z = ((C0302z) K3).f4298h;
        c0285q.U(-176118087);
        Object K4 = c0285q.K();
        W w2 = W.f4109m;
        if (K4 == obj2) {
            K4 = C0257c.N(LocalTime.of(18, 0), w2);
            c0285q.e0(K4);
        }
        InterfaceC0258c0 interfaceC0258c07 = (InterfaceC0258c0) K4;
        Object g3 = B1.t.g(c0285q, false, -176115816);
        if (g3 == obj2) {
            g3 = C0257c.N(LocalTime.of(9, 0), w2);
            c0285q.e0(g3);
        }
        InterfaceC0258c0 interfaceC0258c08 = (InterfaceC0258c0) g3;
        Object g4 = B1.t.g(c0285q, false, -176113558);
        if (g4 == obj2) {
            g4 = C0257c.N(Boolean.TRUE, w2);
            c0285q.e0(g4);
        }
        InterfaceC0258c0 interfaceC0258c09 = (InterfaceC0258c0) g4;
        Object g5 = B1.t.g(c0285q, false, -176111731);
        if (g5 == obj2) {
            g5 = C0257c.L(5.0f);
            c0285q.e0(g5);
        }
        C0266g0 c0266g0 = (C0266g0) g5;
        Object g6 = B1.t.g(c0285q, false, -176109621);
        if (g6 == obj2) {
            g6 = C0257c.N(Boolean.FALSE, w2);
            c0285q.e0(g6);
        }
        InterfaceC0258c0 interfaceC0258c010 = (InterfaceC0258c0) g6;
        Object g7 = B1.t.g(c0285q, false, -176107669);
        if (g7 == obj2) {
            g7 = C0257c.N(Boolean.FALSE, w2);
            c0285q.e0(g7);
        }
        InterfaceC0258c0 interfaceC0258c011 = (InterfaceC0258c0) g7;
        c0285q.r(false);
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("hh:mm a");
        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("HH:mm");
        R1.a aVar2 = (R1.a) G3.getValue();
        c0285q.U(-176100981);
        boolean g8 = c0285q.g(G3);
        Object K5 = c0285q.K();
        if (g8 || K5 == obj2) {
            aVar = aVar2;
            interfaceC0258c0 = interfaceC0258c011;
            interfaceC0258c02 = interfaceC0258c010;
            Object c0627d = new C0627d(G3, interfaceC0258c08, interfaceC0258c07, interfaceC0258c09, c0266g0, null);
            c0285q.e0(c0627d);
            K5 = c0627d;
        } else {
            aVar = aVar2;
            interfaceC0258c0 = interfaceC0258c011;
            interfaceC0258c02 = interfaceC0258c010;
        }
        c0285q.r(false);
        C0257c.e(c0285q, aVar, (y2.e) K5);
        c0285q.U(-176088900);
        if (((Boolean) interfaceC0258c02.getValue()).booleanValue()) {
            M5 k3 = K5.k(((LocalTime) interfaceC0258c08.getValue()).getHour(), ((LocalTime) interfaceC0258c08.getValue()).getMinute(), c0285q);
            c0285q.U(-176082427);
            Object K6 = c0285q.K();
            if (K6 == obj2) {
                interfaceC0258c05 = interfaceC0258c02;
                K6 = new C0392m(interfaceC0258c05, 18);
                c0285q.e0(K6);
            } else {
                interfaceC0258c05 = interfaceC0258c02;
            }
            c0285q.r(false);
            R.a c3 = R.b.c(-1240827851, new c2.j(k3, interfaceC0258c08, interfaceC0258c05, 0), c0285q);
            interfaceC0258c03 = interfaceC0258c08;
            R.a c4 = R.b.c(-1505475341, new C0389j(interfaceC0258c05, 9), c0285q);
            interfaceC0258c04 = interfaceC0258c07;
            R.a aVar3 = AbstractC0626c.f7321c;
            R.a c5 = R.b.c(-1902446576, new c2.k(k3, 0), c0285q);
            z3 = false;
            obj = obj2;
            AbstractC0162o.a((y2.a) K6, c3, null, c4, null, aVar3, c5, null, 0L, 0L, 0L, 0L, 0.0f, null, c0285q, 1772598, 0, 16276);
        } else {
            obj = obj2;
            interfaceC0258c03 = interfaceC0258c08;
            interfaceC0258c04 = interfaceC0258c07;
            interfaceC0258c05 = interfaceC0258c02;
            z3 = false;
        }
        c0285q.r(z3);
        c0285q.U(-176059444);
        if (((Boolean) interfaceC0258c0.getValue()).booleanValue()) {
            M5 k4 = K5.k(((LocalTime) interfaceC0258c04.getValue()).getHour(), ((LocalTime) interfaceC0258c04.getValue()).getMinute(), c0285q);
            c0285q.U(-176053149);
            Object K7 = c0285q.K();
            if (K7 == obj) {
                interfaceC0258c06 = interfaceC0258c0;
                K7 = new C0392m(interfaceC0258c06, 19);
                c0285q.e0(K7);
            } else {
                interfaceC0258c06 = interfaceC0258c0;
            }
            c0285q.r(z3);
            AbstractC0162o.a((y2.a) K7, R.b.c(-206641684, new c2.j(k4, interfaceC0258c04, interfaceC0258c06, 1), c0285q), null, R.b.c(-1129809110, new C0389j(interfaceC0258c06, 10), c0285q), null, AbstractC0626c.f7324f, R.b.c(-367076601, new c2.k(k4, 1), c0285q), null, 0L, 0L, 0L, 0L, 0.0f, null, c0285q, 1772598, 0, 16276);
        } else {
            interfaceC0258c06 = interfaceC0258c0;
        }
        c0285q.r(z3);
        InterfaceC0258c0 interfaceC0258c012 = interfaceC0258c04;
        AbstractC0124i3.b(null, R.b.c(1296064422, new c2.h(yVar, h2, ofPattern2, interfaceC0328z, G3, interfaceC0258c03, interfaceC0258c012, interfaceC0258c09, c0266g0), c0285q), null, null, null, 0, 0L, 0L, null, R.b.c(-308137935, new W1.y(c0266g0, ofPattern, interfaceC0258c03, interfaceC0258c05, interfaceC0258c012, interfaceC0258c06, interfaceC0258c09, context), c0285q), c0285q, 805306416, 509);
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new S1.d(yVar, h2, i2, 2);
        }
    }

    public static final void f(String str, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        y2.e eVar2;
        int i4;
        c0285q.W(1177036171);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= c0285q.i(eVar) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 91) == 18 && c0285q.A()) {
            c0285q.P();
            eVar2 = eVar;
            i4 = 1;
        } else {
            C1165d c1165d = AbstractC1173l.f10149a;
            C1170i c1170i = new C1170i(12);
            V.l lVar = V.l.f5857b;
            C1180t a3 = AbstractC1179s.a(c1170i, V.b.f5842t, c0285q, 6);
            int i6 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            V.o d3 = V.a.d(c0285q, lVar);
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
            C0257c.V(c0285q, a3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i6))) {
                B1.t.q(i6, c0285q, i6, c1250h);
            }
            C0257c.V(c0285q, d3, C1252j.f10600d);
            t5.b(str, androidx.compose.foundation.layout.a.l(lVar, 4, 0.0f, 0.0f, 0.0f, 14), ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2483a, 0L, null, H0.k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(P5.f1917a)).f1862i, c0285q, (i5 & 14) | 196656, 0, 65496);
            eVar2 = eVar;
            eVar2.j(c0285q, Integer.valueOf((i5 >> 3) & 14));
            i4 = 1;
            c0285q.r(true);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new b2.d(i2, i4, eVar2, str);
        }
    }

    public static final void g(V.o oVar, y2.e eVar, C0285q c0285q, int i2, int i3) {
        int i4;
        c0285q.W(-1177876616);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            if (i5 != 0) {
                oVar = V.l.f5857b;
            }
            R0.f fVar = R0.f.f5402b;
            int i6 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            V.o d3 = V.a.d(c0285q, oVar);
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            int i7 = (((((i4 << 3) & 112) | (((i4 >> 3) & 14) | 384)) << 6) & 896) | 6;
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
            C0257c.V(c0285q, fVar, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i6))) {
                B1.t.q(i6, c0285q, i6, c1250h);
            }
            C0257c.V(c0285q, d3, C1252j.f10600d);
            eVar.j(c0285q, Integer.valueOf((i7 >> 6) & 14));
            c0285q.r(true);
        }
        V.o oVar2 = oVar;
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new Q(oVar2, eVar, i2, i3, 1);
        }
    }

    public static final long h(S s3, b0.d dVar, b0.d dVar2, int i2) {
        long A3 = A(s3, dVar, i2);
        if (J.b(A3)) {
            return J.f471b;
        }
        long A4 = A(s3, dVar2, i2);
        if (J.b(A4)) {
            return J.f471b;
        }
        int i3 = (int) (A3 >> 32);
        int i4 = (int) (A4 & 4294967295L);
        return C.j(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static final boolean i(H h2, int i2) {
        int e3 = h2.e(i2);
        if (i2 == h2.h(e3) || i2 == h2.d(e3, false)) {
            if (h2.i(i2) == h2.a(i2)) {
                return false;
            }
        } else if (h2.a(i2) == h2.a(i2 - 1)) {
            return false;
        }
        return true;
    }

    public static void j(StringBuilder sb, Object obj, y2.c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.l(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static final void k(L2.w wVar, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = new CancellationException("Channel was consumed, consumer had failed");
                r0.initCause(th);
            }
        }
        wVar.a(r0);
    }

    public static final long l(long j3, I2.c cVar, I2.c cVar2) {
        z2.h.f(cVar, "sourceUnit");
        z2.h.f(cVar2, "targetUnit");
        return cVar2.f3965h.convert(j3, cVar.f3965h);
    }

    public static Handler m(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Y0.d.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e5) {
            e = e5;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final C0867i n(Throwable th) {
        z2.h.f(th, "exception");
        return new C0867i(th);
    }

    public static final w p(Context context, C0011a c0011a) {
        r1.q g3;
        z2.h.f(context, "context");
        N1.b bVar = new N1.b(c0011a.f261b);
        Context applicationContext = context.getApplicationContext();
        z2.h.e(applicationContext, "context.applicationContext");
        L1.o oVar = bVar.f5010a;
        z2.h.e(oVar, "workTaskExecutor.serialTaskExecutor");
        boolean z3 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        B1.u uVar = c0011a.f262c;
        z2.h.f(uVar, "clock");
        if (z3) {
            g3 = new r1.q(applicationContext, WorkDatabase.class, null);
            g3.f9979j = true;
        } else {
            g3 = AbstractC0946A.g(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            g3.f9978i = new q(applicationContext);
        }
        g3.f9976g = oVar;
        g3.f9973d.add(new c(uVar));
        g3.a(e.f627h);
        g3.a(new j(applicationContext, 2, 3));
        g3.a(e.f628i);
        g3.a(e.f629j);
        g3.a(new j(applicationContext, 5, 6));
        g3.a(e.f630k);
        g3.a(e.f631l);
        g3.a(e.f632m);
        g3.a(new j(applicationContext));
        g3.a(new j(applicationContext, 10, 11));
        g3.a(e.f623d);
        g3.a(e.f624e);
        g3.a(e.f625f);
        g3.a(e.f626g);
        g3.f9981l = false;
        g3.f9982m = true;
        WorkDatabase workDatabase = (WorkDatabase) g3.b();
        Context applicationContext2 = context.getApplicationContext();
        z2.h.e(applicationContext2, "context.applicationContext");
        I1.l lVar = new I1.l(applicationContext2, bVar);
        i iVar = new i(context.getApplicationContext(), c0011a, bVar, workDatabase);
        return new w(context.getApplicationContext(), c0011a, bVar, workDatabase, (List) x.f698p.d(context, c0011a, bVar, workDatabase, lVar, iVar), iVar, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        if ((!r7.j(r19)) != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(e0.InterfaceC0654d r18, f0.C0663b r19) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.y.q(e0.d, f0.b):void");
    }

    public static final boolean r(int i2, int i3) {
        return i2 == i3;
    }

    public static final long s(long j3, boolean z3, int i2, float f3) {
        int h2 = ((z3 || K1.f.t(i2, 2)) && O0.a.d(j3)) ? O0.a.h(j3) : Integer.MAX_VALUE;
        if (O0.a.j(j3) != h2) {
            h2 = C.C(N.l(f3), O0.a.j(j3), h2);
        }
        int g3 = O0.a.g(j3);
        int min = Math.min(0, 262142);
        int min2 = h2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(h2, 262142);
        int m3 = C.m(min2 == Integer.MAX_VALUE ? min : min2);
        return C.b(min, min2, Math.min(m3, 0), g3 != Integer.MAX_VALUE ? Math.min(m3, g3) : Integer.MAX_VALUE);
    }

    public static Object t(Object[] objArr, int i2, b bVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z3 = (i2 & 2) != 0;
        Object obj = null;
        int i4 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.k(obj2) - i3) * 2) + (bVar.l(obj2) == z3 ? 0 : 1);
            if (obj == null || i4 > abs) {
                obj = obj2;
                i4 = abs;
            }
        }
        return obj;
    }

    public static final K1.j v(K1.o oVar) {
        z2.h.f(oVar, "<this>");
        return new K1.j(oVar.f4564a, oVar.f4582t);
    }

    public static final C0712e w() {
        C0712e c0712e = f701c;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.DateRange", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        V0 v0 = new V0(1);
        v0.h(9.0f, 11.0f);
        v0.f(7.0f, 11.0f);
        v0.l(2.0f);
        v0.e(2.0f);
        v0.l(-2.0f);
        v0.a();
        v0.h(13.0f, 11.0f);
        v0.e(-2.0f);
        v0.l(2.0f);
        v0.e(2.0f);
        v0.l(-2.0f);
        v0.a();
        v0.h(17.0f, 11.0f);
        v0.e(-2.0f);
        v0.l(2.0f);
        v0.e(2.0f);
        v0.l(-2.0f);
        v0.a();
        v0.h(19.0f, 4.0f);
        v0.e(-1.0f);
        v0.f(18.0f, 2.0f);
        v0.e(-2.0f);
        v0.l(2.0f);
        v0.f(8.0f, 4.0f);
        v0.f(8.0f, 2.0f);
        v0.f(6.0f, 2.0f);
        v0.l(2.0f);
        v0.f(5.0f, 4.0f);
        v0.c(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        v0.f(3.0f, 20.0f);
        v0.c(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        v0.e(14.0f);
        v0.c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v0.f(21.0f, 6.0f);
        v0.c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        v0.a();
        v0.h(19.0f, 20.0f);
        v0.f(5.0f, 20.0f);
        v0.f(5.0f, 9.0f);
        v0.e(14.0f);
        v0.l(11.0f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f701c = b3;
        return b3;
    }

    public static final int x(C0.o oVar, long j3, u0.V0 v0) {
        float c3 = v0 != null ? v0.c() : 0.0f;
        int c4 = oVar.c(b0.c.e(j3));
        if (b0.c.e(j3) < oVar.d(c4) - c3 || b0.c.e(j3) > oVar.b(c4) + c3 || b0.c.d(j3) < (-c3) || b0.c.d(j3) > oVar.f526d + c3) {
            return -1;
        }
        return c4;
    }

    public static Intent y(Context context, ComponentName componentName) {
        String z3 = z(context, componentName);
        if (z3 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), z3);
        return z(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String z(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public abstract Typeface o(Context context, Z0.b[] bVarArr, int i2);

    public Z0.b u(Z0.b[] bVarArr, int i2) {
        return (Z0.b) t(bVarArr, i2, new b(13, false));
    }
}
