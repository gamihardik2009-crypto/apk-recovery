package B1;

import J.C0;
import J.C0257c;
import J.C0285q;
import c0.C0603v;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import s.AbstractC1166e;
import t0.C1250h;

/* loaded from: classes.dex */
public abstract /* synthetic */ class t {
    public static /* synthetic */ String A(int i2) {
        switch (i2) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case AbstractC1166e.f10138f /* 5 */:
                return "BLOCKED";
            case AbstractC1166e.f10136d /* 6 */:
                return "CANCELLED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String B(int i2) {
        switch (i2) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case AbstractC1166e.f10138f /* 5 */:
                return "METERED";
            case AbstractC1166e.f10136d /* 6 */:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String C(int i2) {
        switch (i2) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case AbstractC1166e.f10138f /* 5 */:
                return "BLOCKED";
            case AbstractC1166e.f10136d /* 6 */:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String D(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "COLLAPSED" : "NOT_CROSSED" : "CROSSED";
    }

    public static /* synthetic */ String E(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "Right" : "Middle" : "Left";
    }

    public static /* synthetic */ String F(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static final boolean a(int i2) {
        return i2 == 3 || i2 == 4 || i2 == 6;
    }

    public static /* synthetic */ long b(int i2) {
        if (i2 == 1) {
            return 0L;
        }
        if (i2 == 2) {
            return 1L;
        }
        if (i2 == 3) {
            return 2L;
        }
        if (i2 == 4) {
            return 3L;
        }
        if (i2 == 5) {
            return 4L;
        }
        throw null;
    }

    public static int c(float f3, int i2, int i3) {
        return (Float.hashCode(f3) + i2) * i3;
    }

    public static int d(int i2, int i3, long j3) {
        return (Long.hashCode(j3) + i2) * i3;
    }

    public static int e(int i2, int i3, String str) {
        return (str.hashCode() + i2) * i3;
    }

    public static int f(int i2, int i3, boolean z3) {
        return (Boolean.hashCode(z3) + i2) * i3;
    }

    public static Object g(C0285q c0285q, boolean z3, int i2) {
        c0285q.r(z3);
        c0285q.U(i2);
        return c0285q.K();
    }

    public static String h(String str, int i2) {
        return str + i2;
    }

    public static String i(StringBuilder sb, float f3, char c3) {
        sb.append(f3);
        sb.append(c3);
        return sb.toString();
    }

    public static String j(StringBuilder sb, int i2, char c3) {
        sb.append(i2);
        sb.append(c3);
        return sb.toString();
    }

    public static String k(StringBuilder sb, String str, char c3) {
        sb.append(str);
        sb.append(c3);
        return sb.toString();
    }

    public static StringBuilder l(String str, int i2, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, String str2) {
        z2.h.e(str, str2);
        return new StringBuilder();
    }

    public static /* synthetic */ Iterator n() {
        try {
            return Arrays.asList(new K2.b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static r.l o(C0285q c0285q) {
        r.l lVar = new r.l();
        c0285q.e0(lVar);
        return lVar;
    }

    public static void p(int i2, int i3, int i4, int i5, int i6) {
        K1.f.d(i2);
        K1.f.d(i3);
        K1.f.d(i4);
        K1.f.d(i5);
        K1.f.d(i6);
    }

    public static void q(int i2, C0285q c0285q, int i3, C1250h c1250h) {
        c0285q.e0(Integer.valueOf(i2));
        c0285q.c(Integer.valueOf(i3), c1250h);
    }

    public static void r(int i2, R.a aVar, C0 c02, C0285q c0285q, int i3) {
        aVar.i(c02, c0285q, Integer.valueOf(i2));
        c0285q.V(i3);
    }

    public static void s(int i2, y2.e eVar, C0285q c0285q, boolean z3, boolean z4) {
        eVar.j(c0285q, Integer.valueOf(i2));
        c0285q.r(z3);
        c0285q.r(z4);
    }

    public static void t(long j3, StringBuilder sb, String str) {
        sb.append((Object) C0603v.i(j3));
        sb.append(str);
    }

    public static void u(C0285q c0285q, boolean z3, boolean z4, boolean z5, boolean z6) {
        c0285q.r(z3);
        c0285q.r(z4);
        c0285q.r(z5);
        c0285q.r(z6);
    }

    public static /* synthetic */ void v(V.m mVar) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void w(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void x(StringBuilder sb, int i2, String str, String str2, String str3) {
        sb.append(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static Iterator y() {
        try {
            return Arrays.asList(new K2.a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void z(StringBuilder sb, int i2, String str, String str2, String str3) {
        sb.append(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        C0257c.X(sb.toString());
        throw null;
    }
}
