package B1;

import B1.C;
import C0.C0024g;
import C0.J;
import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.C0093e0;
import H.C0157n1;
import H.D1;
import H.O5;
import H.P5;
import H.t5;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.C0302z;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.P0;
import J.T;
import J.V0;
import J.W;
import J.X0;
import J2.InterfaceC0328z;
import K.H;
import M2.K;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0466o;
import androidx.lifecycle.InterfaceC0470t;
import androidx.work.impl.WorkDatabase;
import b.AbstractActivityC0489m;
import b.C0502z;
import b.InterfaceC0501y;
import c.AbstractC0555e;
import c.C0558h;
import c.C0559i;
import c.C0560j;
import c0.AbstractC0571K;
import c0.C0578S;
import c0.C0603v;
import c0.InterfaceC0576P;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import j1.AbstractC0777e;
import j1.C0775c;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m2.C0880v;
import n0.AbstractC0937p;
import n0.C0930i;
import n2.AbstractC0946A;
import n2.AbstractC0963o;
import n2.AbstractC0968t;
import q2.C1079j;
import q2.InterfaceC1078i;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1180t;
import s.Q;
import s.S;
import t0.AbstractC1248f;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.C1261t;
import t0.InterfaceC1253k;
import t2.AbstractC1269a;
import u2.AbstractC1328a;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: b, reason: collision with root package name */
    public static C0712e f246b;

    /* renamed from: c, reason: collision with root package name */
    public static C0712e f247c;

    /* renamed from: d, reason: collision with root package name */
    public static C0712e f248d;

    /* renamed from: e, reason: collision with root package name */
    public static C0712e f249e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250a;

    public /* synthetic */ C(int i2) {
        this.f250a = i2;
    }

    public static double A(double d3, double d4, double d5) {
        if (d4 <= d5) {
            return d3 < d4 ? d4 : d3 > d5 ? d5 : d3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d5 + " is less than minimum " + d4 + '.');
    }

    public static float B(float f3, float f4, float f5) {
        if (f4 <= f5) {
            return f3 < f4 ? f4 : f3 > f5 ? f5 : f3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f5 + " is less than minimum " + f4 + '.');
    }

    public static int C(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static long D(long j3, long j4, long j5) {
        if (j4 <= j5) {
            return j3 < j4 ? j4 : j3 > j5 ? j5 : j3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j5 + " is less than minimum " + j4 + '.');
    }

    public static Comparable E(Float f3, E2.a aVar) {
        z2.h.f(aVar, "range");
        if (aVar.a()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
        }
        float f4 = aVar.f1074a;
        if (E2.a.b(f3, Float.valueOf(f4)) && !E2.a.b(Float.valueOf(f4), f3)) {
            return Float.valueOf(f4);
        }
        float f5 = aVar.f1075b;
        return (!E2.a.b(Float.valueOf(f5), f3) || E2.a.b(f3, Float.valueOf(f5))) ? f3 : Float.valueOf(f5);
    }

    public static final long F(long j3, int i2) {
        int i3 = J.f472c;
        int i4 = (int) (j3 >> 32);
        int C3 = C(i4, 0, i2);
        int i5 = (int) (4294967295L & j3);
        int C4 = C(i5, 0, i2);
        return (C3 == i4 && C4 == i5) ? j3 : j(C3, C4);
    }

    public static final InterfaceC0258c0 G(K k3, C0285q c0285q) {
        c0285q.V(743249048);
        InterfaceC0470t interfaceC0470t = (InterfaceC0470t) c0285q.l(AbstractC0777e.f8096a);
        EnumC0466o enumC0466o = EnumC0466o.f6901k;
        C1079j c1079j = C1079j.f9784h;
        Object value = k3.f4811h.getValue();
        C0472v e3 = interfaceC0470t.e();
        c0285q.V(1977777920);
        Object[] objArr = {k3, e3, enumC0466o, c1079j};
        c0285q.V(710004817);
        boolean i2 = c0285q.i(e3) | c0285q.g(enumC0466o) | c0285q.i(c1079j) | c0285q.i(k3);
        Object K3 = c0285q.K();
        Object obj = C0275l.f4150a;
        if (i2 || K3 == obj) {
            Object c0775c = new C0775c(e3, enumC0466o, c1079j, k3, null);
            c0285q.e0(c0775c);
            K3 = c0775c;
        }
        y2.e eVar = (y2.e) K3;
        c0285q.r(false);
        Object K4 = c0285q.K();
        if (K4 == obj) {
            K4 = C0257c.N(value, W.f4109m);
            c0285q.e0(K4);
        }
        InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K4;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean i3 = c0285q.i(eVar);
        Object K5 = c0285q.K();
        if (i3 || K5 == obj) {
            K5 = new P0(eVar, interfaceC0258c0, null);
            c0285q.e0(K5);
        }
        y2.e eVar2 = (y2.e) K5;
        InterfaceC1078i h2 = c0285q.f4196b.h();
        boolean z3 = false;
        for (Object obj2 : Arrays.copyOf(copyOf, copyOf.length)) {
            z3 |= c0285q.g(obj2);
        }
        Object K6 = c0285q.K();
        if (z3 || K6 == obj) {
            c0285q.e0(new T(h2, eVar2));
        }
        c0285q.r(false);
        c0285q.r(false);
        return interfaceC0258c0;
    }

    public static final long H(long j3, long j4) {
        return l0.c.e(C((int) (j4 >> 32), O0.a.j(j3), O0.a.h(j3)), C((int) (j4 & 4294967295L), O0.a.i(j3), O0.a.g(j3)));
    }

    public static final long I(long j3, long j4) {
        return b(C(O0.a.j(j4), O0.a.j(j3), O0.a.h(j3)), C(O0.a.h(j4), O0.a.j(j3), O0.a.h(j3)), C(O0.a.i(j4), O0.a.i(j3), O0.a.g(j3)), C(O0.a.g(j4), O0.a.i(j3), O0.a.g(j3)));
    }

    public static final int J(long j3, int i2) {
        return C(i2, O0.a.i(j3), O0.a.g(j3));
    }

    public static final int K(long j3, int i2) {
        return C(i2, O0.a.j(j3), O0.a.h(j3));
    }

    public static final long L(int i2, int i3, int i4, int i5) {
        int i6 = i5 == Integer.MAX_VALUE ? i4 : i5;
        int q = q(i6);
        int i7 = i3 == Integer.MAX_VALUE ? i2 : i3;
        int q3 = q(i7);
        if (q + q3 > 31) {
            throw new IllegalArgumentException("Can't represent a width of " + i7 + " and height of " + i6 + " in Constraints");
        }
        int i8 = i3 + 1;
        int i9 = i8 & (~(i8 >> 31));
        int i10 = i5 + 1;
        int i11 = i10 & (~(i10 >> 31));
        int i12 = 0;
        if (q3 != 13) {
            if (q3 == 18) {
                i12 = 3;
            } else if (q3 == 15) {
                i12 = 1;
            } else if (q3 == 16) {
                i12 = 2;
            }
        }
        int i13 = (((i12 & 2) >> 1) * 3) + ((i12 & 1) << 1);
        return (i9 << 33) | i12 | (i2 << 2) | (i4 << (i13 + 15)) | (i11 << (i13 + 46));
    }

    public static final H0.e M(Context context) {
        return new H0.e(new C1.b(context), new H0.a(Build.VERSION.SDK_INT >= 31 ? H0.l.f3406a.a(context) : 0));
    }

    public static final boolean P(int i2, int i3) {
        return i2 == i3;
    }

    public static String Q(List list, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final long R(long j3) {
        if (j3 != 9205357640488583168L) {
            return K1.f.e(Float.intBitsToFloat((int) (j3 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j3 & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static Set S() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final Object T(A0.k kVar, A0.x xVar) {
        Object obj = kVar.f60h.get(xVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final C0024g U(I0.z zVar) {
        C0024g c0024g = zVar.f3932a;
        c0024g.getClass();
        long j3 = zVar.f3933b;
        return c0024g.subSequence(J.e(j3), J.d(j3));
    }

    public static final C0712e V() {
        C0712e c0712e = f249e;
        if (c0712e != null) {
            return c0712e;
        }
        C0711d c0711d = new C0711d("Filled.Settings", false);
        int i2 = AbstractC0732y.f7958a;
        C0578S c0578s = new C0578S(C0603v.f7272b);
        V0 v0 = new V0(1);
        v0.h(19.14f, 12.94f);
        v0.c(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        v0.c(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        v0.g(2.03f, -1.58f);
        v0.c(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        v0.g(-1.92f, -3.32f);
        v0.c(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        v0.g(-2.39f, 0.96f);
        v0.c(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        v0.f(14.4f, 2.81f);
        v0.c(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        v0.e(-3.84f);
        v0.c(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        v0.f(9.25f, 5.35f);
        v0.b(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        v0.f(5.24f, 5.33f);
        v0.c(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        v0.f(2.74f, 8.87f);
        v0.b(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        v0.g(2.03f, 1.58f);
        v0.b(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        v0.j(0.02f, 0.64f, 0.07f, 0.94f);
        v0.g(-2.03f, 1.58f);
        v0.c(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        v0.g(1.92f, 3.32f);
        v0.c(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        v0.g(2.39f, -0.96f);
        v0.c(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        v0.g(0.36f, 2.54f);
        v0.c(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        v0.e(3.84f);
        v0.c(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        v0.g(0.36f, -2.54f);
        v0.c(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        v0.g(2.39f, 0.96f);
        v0.c(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        v0.g(1.92f, -3.32f);
        v0.c(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        v0.f(19.14f, 12.94f);
        v0.a();
        v0.h(12.0f, 15.6f);
        v0.c(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        v0.j(1.62f, -3.6f, 3.6f, -3.6f);
        v0.j(3.6f, 1.62f, 3.6f, 3.6f);
        v0.i(13.98f, 15.6f, 12.0f, 15.6f);
        v0.a();
        C0711d.a(c0711d, v0.f4104h, c0578s);
        C0712e b3 = c0711d.b();
        f249e = b3;
        return b3;
    }

    public static final long W(double d3) {
        return f0((float) d3, 4294967296L);
    }

    public static final long X(int i2) {
        return f0(i2, 4294967296L);
    }

    public static final C0024g Z(I0.z zVar, int i2) {
        C0024g c0024g = zVar.f3932a;
        long j3 = zVar.f3933b;
        return c0024g.subSequence(J.d(j3), Math.min(J.d(j3) + i2, zVar.f3932a.f500a.length()));
    }

    public static final void a(V.o oVar, y2.c cVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(cVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            AbstractC1166e.a(c0285q, androidx.compose.ui.draw.a.a(oVar, cVar));
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0157n1(i2, 7, oVar, cVar);
        }
    }

    public static final C0024g a0(I0.z zVar, int i2) {
        C0024g c0024g = zVar.f3932a;
        long j3 = zVar.f3933b;
        return c0024g.subSequence(Math.max(0, J.e(j3) - i2), J.e(j3));
    }

    public static final long b(int i2, int i3, int i4, int i5) {
        boolean z3 = false;
        if (!(i3 >= i2)) {
            K1.f.R("maxWidth(" + i3 + ") must be >= than minWidth(" + i2 + ')');
            throw null;
        }
        if (!(i5 >= i4)) {
            K1.f.R("maxHeight(" + i5 + ") must be >= than minHeight(" + i4 + ')');
            throw null;
        }
        if (i2 >= 0 && i4 >= 0) {
            z3 = true;
        }
        if (z3) {
            return L(i2, i3, i4, i5);
        }
        K1.f.R("minWidth(" + i2 + ") and minHeight(" + i4 + ") must be >= 0");
        throw null;
    }

    public static final boolean b0(C0930i c0930i) {
        List list = c0930i.f8943a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!AbstractC0937p.e(((n0.r) list.get(i2)).f8965i, 2)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long c(int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return b(0, i2, 0, i3);
    }

    public static final boolean c0(long j3) {
        O0.n[] nVarArr = O0.m.f5152b;
        return (j3 & 1095216660480L) == 0;
    }

    public static final void d(int i2, C0285q c0285q) {
        c0285q.W(-505152747);
        if (i2 == 0 && c0285q.A()) {
            c0285q.P();
        } else {
            V.l lVar = V.l.f5857b;
            V.o l3 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.f6640b, 0.0f, 0.0f, 0.0f, 100, 7);
            C1180t a3 = AbstractC1179s.a(AbstractC1173l.f10153e, V.b.f5843u, c0285q, 54);
            int i3 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            V.o d3 = V.a.d(c0285q, l3);
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
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i3))) {
                t.q(i3, c0285q, i3, c1250h);
            }
            C0257c.V(c0285q, d3, C1252j.f10600d);
            C0712e w2 = C1.y.w();
            V.o j3 = androidx.compose.foundation.layout.c.j(lVar, 64);
            X0 x02 = AbstractC0107g0.f2597a;
            AbstractC0088d2.a(w2, null, j3, C0603v.b(0.2f, ((C0093e0) c0285q.l(x02)).f2500s), c0285q, 432, 0);
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.b(lVar, 16));
            X0 x03 = P5.f1917a;
            t5.b("The book is empty", null, ((C0093e0) c0285q.l(x02)).f2500s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(x03)).f1861h, c0285q, 6, 0, 65530);
            t5.b("Start automation to see your plan here", null, C0603v.b(0.6f, ((C0093e0) c0285q.l(x02)).f2500s), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(x03)).f1865l, c0285q, 6, 0, 65530);
            c0285q.r(true);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new P1.e(i2, 2);
        }
    }

    public static final long d0(int i2, int i3, long j3) {
        int j4 = O0.a.j(j3) + i2;
        if (j4 < 0) {
            j4 = 0;
        }
        int h2 = O0.a.h(j3);
        if (h2 != Integer.MAX_VALUE && (h2 = h2 + i2) < 0) {
            h2 = 0;
        }
        int i4 = O0.a.i(j3) + i3;
        if (i4 < 0) {
            i4 = 0;
        }
        int g3 = O0.a.g(j3);
        if (g3 != Integer.MAX_VALUE) {
            int i5 = g3 + i3;
            g3 = i5 >= 0 ? i5 : 0;
        }
        return b(j4, h2, i4, g3);
    }

    public static final void e(boolean z3, y2.e eVar, C0285q c0285q, int i2, int i3) {
        int i4;
        c0285q.W(-642000585);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (c0285q.h(z3) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((2 & i3) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= c0285q.g(eVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            if (i5 != 0) {
                z3 = true;
            }
            InterfaceC0258c0 R3 = C0257c.R(eVar, c0285q);
            c0285q.V(-723524056);
            c0285q.V(-3687241);
            Object K3 = c0285q.K();
            Object obj = C0275l.f4150a;
            if (K3 == obj) {
                Object c0302z = new C0302z(C0257c.B(c0285q));
                c0285q.e0(c0302z);
                K3 = c0302z;
            }
            c0285q.r(false);
            InterfaceC0328z interfaceC0328z = ((C0302z) K3).f4298h;
            c0285q.r(false);
            c0285q.V(-1071578902);
            Object K4 = c0285q.K();
            if (K4 == obj) {
                K4 = new C0560j(z3, interfaceC0328z, R3);
                c0285q.e0(K4);
            }
            C0560j c0560j = (C0560j) K4;
            c0285q.r(false);
            Boolean valueOf = Boolean.valueOf(z3);
            c0285q.V(-1071576918);
            boolean g3 = c0285q.g(c0560j) | c0285q.h(z3);
            Object K5 = c0285q.K();
            Object obj2 = null;
            if (g3 || K5 == obj) {
                K5 = new C0558h(c0560j, z3, null);
                c0285q.e0(K5);
            }
            c0285q.r(false);
            C0257c.e(c0285q, valueOf, (y2.e) K5);
            J.B b3 = AbstractC0555e.f7166a;
            c0285q.V(-2068013981);
            InterfaceC0501y interfaceC0501y = (InterfaceC0501y) c0285q.l(AbstractC0555e.f7166a);
            c0285q.V(1680121597);
            if (interfaceC0501y == null) {
                View view = (View) c0285q.l(AndroidCompositionLocals_androidKt.f6785f);
                z2.h.f(view, "<this>");
                interfaceC0501y = (InterfaceC0501y) G2.i.h0(G2.i.j0(G2.i.i0(view, C0502z.f7049j), C0502z.f7050k));
            }
            c0285q.r(false);
            if (interfaceC0501y == null) {
                Object obj3 = (Context) c0285q.l(AndroidCompositionLocals_androidKt.f6781b);
                while (true) {
                    if (!(obj3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (obj3 instanceof InterfaceC0501y) {
                        obj2 = obj3;
                        break;
                    }
                    obj3 = ((ContextWrapper) obj3).getBaseContext();
                }
                interfaceC0501y = (InterfaceC0501y) obj2;
            }
            c0285q.r(false);
            if (interfaceC0501y == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            Object b4 = interfaceC0501y.b();
            Object obj4 = (InterfaceC0470t) c0285q.l(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            c0285q.V(-1071576546);
            boolean g4 = c0285q.g(b4) | c0285q.g(obj4) | c0285q.g(c0560j);
            Object K6 = c0285q.K();
            if (g4 || K6 == obj) {
                K6 = new L2.d(b4, obj4, c0560j, 5);
                c0285q.e0(K6);
            }
            c0285q.r(false);
            C0257c.c(obj4, b4, (y2.c) K6, c0285q);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0559i(z3, eVar, i2, i3);
        }
    }

    public static /* synthetic */ long e0(int i2, int i3, int i4, long j3) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return d0(i2, i3, j3);
    }

    public static final void f(final R1.g gVar, C0285q c0285q, final int i2) {
        int i3;
        String str;
        long d3;
        z2.h.f(gVar, "item");
        c0285q.W(-1091540216);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(gVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            R1.f fVar = gVar.f5506a;
            R1.b bVar = gVar.f5507b;
            if (bVar == null) {
                C0291t0 t3 = c0285q.t();
                if (t3 != null) {
                    final int i4 = 0;
                    t3.f4235d = new y2.e() { // from class: a2.d
                        @Override // y2.e
                        public final Object j(Object obj, Object obj2) {
                            int i5 = i4;
                            C0285q c0285q2 = (C0285q) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    R1.g gVar2 = gVar;
                                    z2.h.f(gVar2, "$item");
                                    C.f(gVar2, c0285q2, C0257c.Y(i2 | 1));
                                    break;
                                default:
                                    R1.g gVar3 = gVar;
                                    z2.h.f(gVar3, "$item");
                                    C.f(gVar3, c0285q2, C0257c.Y(i2 | 1));
                                    break;
                            }
                            return C0880v.f8657a;
                        }
                    };
                    return;
                }
                return;
            }
            try {
                str = LocalTime.parse(fVar.f5500e).format(DateTimeFormatter.ofPattern("hh:mm a"));
            } catch (Exception unused) {
                str = fVar.f5500e;
            }
            String str2 = str;
            int ordinal = fVar.f5501f.ordinal();
            if (ordinal == 0) {
                c0285q.U(385650914);
                c0285q.r(false);
                d3 = AbstractC0571K.d(4279213400L);
            } else if (ordinal == 1) {
                c0285q.U(385653366);
                d3 = ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2504w;
                c0285q.r(false);
            } else if (ordinal != 2) {
                c0285q.U(385657153);
                d3 = ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2500s;
                c0285q.r(false);
            } else {
                c0285q.U(385655482);
                d3 = ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2488f;
                c0285q.r(false);
            }
            D1.b(androidx.compose.foundation.layout.c.f6639a, y.e.a(24), D1.l(((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2498p, c0285q, 0), D1.m(1, c0285q, 62), null, R.b.c(-1358601002, new X1.e(bVar, fVar, d3, str2), c0285q), c0285q, 196614, 16);
        }
        C0291t0 t4 = c0285q.t();
        if (t4 != null) {
            final int i5 = 1;
            t4.f4235d = new y2.e() { // from class: a2.d
                @Override // y2.e
                public final Object j(Object obj, Object obj2) {
                    int i52 = i5;
                    C0285q c0285q2 = (C0285q) obj;
                    ((Integer) obj2).intValue();
                    switch (i52) {
                        case 0:
                            R1.g gVar2 = gVar;
                            z2.h.f(gVar2, "$item");
                            C.f(gVar2, c0285q2, C0257c.Y(i2 | 1));
                            break;
                        default:
                            R1.g gVar3 = gVar;
                            z2.h.f(gVar3, "$item");
                            C.f(gVar3, c0285q2, C0257c.Y(i2 | 1));
                            break;
                    }
                    return C0880v.f8657a;
                }
            };
        }
    }

    public static final long f0(float f3, long j3) {
        long floatToIntBits = j3 | (Float.floatToIntBits(f3) & 4294967295L);
        O0.n[] nVarArr = O0.m.f5152b;
        return floatToIntBits;
    }

    public static final void g(final C0712e c0712e, final String str, final long j3, C0285q c0285q, final int i2) {
        int i3;
        z2.h.f(str, "text");
        c0285q.W(-226867062);
        if ((i2 & 14) == 0) {
            i3 = (c0285q.g(c0712e) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= c0285q.g(str) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= c0285q.f(j3) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            V.f fVar = V.b.f5840r;
            V.l lVar = V.l.f5857b;
            S a3 = Q.a(AbstractC1173l.f10149a, fVar, c0285q, 48);
            int i4 = c0285q.f4194P;
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
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                t.q(i4, c0285q, i4, c1250h);
            }
            C0257c.V(c0285q, d3, C1252j.f10600d);
            AbstractC0088d2.a(c0712e, null, androidx.compose.foundation.layout.c.j(lVar, 16), C0603v.b(0.6f, j3), c0285q, (i3 & 14) | 432, 0);
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.n(lVar, 4));
            t5.b(str, null, ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2500s, 0L, null, H0.k.f3402k, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(P5.f1917a)).f1868o, c0285q, ((i3 >> 3) & 14) | 196608, 0, 65498);
            c0285q.r(true);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new y2.e() { // from class: a2.e
                @Override // y2.e
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C0712e c0712e2 = C0712e.this;
                    z2.h.f(c0712e2, "$icon");
                    String str2 = str;
                    z2.h.f(str2, "$text");
                    C.g(c0712e2, str2, j3, (C0285q) obj, C0257c.Y(i2 | 1));
                    return C0880v.f8657a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0150, code lost:
    
        if (z2.h.a(r45.K(), java.lang.Integer.valueOf(r3)) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(int r44, J.C0285q r45) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.C.h(int, J.q):void");
    }

    public static final long i(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final long j(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i2 + ", end: " + i3 + ']').toString());
        }
        if (i3 >= 0) {
            long j3 = (i3 & 4294967295L) | (i2 << 32);
            int i4 = J.f472c;
            return j3;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i2 + ", end: " + i3 + ']').toString());
    }

    public static final void j0(H h2, int i2, int i3) {
        int i4 = 1 << i2;
        int i5 = h2.f4455n;
        if ((i5 & i4) == 0) {
            h2.f4455n = i4 | i5;
            h2.f4451j[(h2.f4452k - h2.N().f4447a) + i2] = i3;
        } else {
            C0257c.X("Already pushed argument " + h2.N().b(i2));
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(n0.C0918A r7, q2.InterfaceC1073d r8) {
        /*
            boolean r0 = r8 instanceof D.C0051u
            if (r0 == 0) goto L13
            r0 = r8
            D.u r0 = (D.C0051u) r0
            int r1 = r0.f899m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f899m = r1
            goto L18
        L13:
            D.u r0 = new D.u
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f898l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f899m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            n0.A r7 = r0.f897k
            C1.y.J(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            C1.y.J(r8)
        L34:
            n0.j r8 = n0.EnumC0931j.f8947i
            r0.f897k = r7
            r0.f899m = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L41
            goto L5d
        L41:
            n0.i r8 = (n0.C0930i) r8
            java.util.List r2 = r8.f8943a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            n0.r r6 = (n0.r) r6
            boolean r6 = n0.AbstractC0937p.a(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            r1 = r8
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.C.k(n0.A, q2.d):java.lang.Object");
    }

    public static final void k0(H h2, int i2, Object obj) {
        int i3 = 1 << i2;
        int i4 = h2.f4456o;
        if ((i4 & i3) == 0) {
            h2.f4456o = i3 | i4;
            h2.f4453l[(h2.f4454m - h2.N().f4448b) + i2] = obj;
        } else {
            C0257c.X("Already pushed argument " + h2.N().c(i2));
            throw null;
        }
    }

    public static final boolean l(Y.d dVar, long j3) {
        if (!dVar.f5858h.f5869t) {
            return false;
        }
        C1261t c1261t = (C1261t) AbstractC1248f.v(dVar).f10378C.f4241c;
        if (!c1261t.T0().f5869t) {
            return false;
        }
        long j4 = c1261t.f9836j;
        long K3 = c1261t.K(0L);
        float d3 = b0.c.d(K3);
        float e3 = b0.c.e(K3);
        float f3 = ((int) (j4 >> 32)) + d3;
        float f4 = ((int) (j4 & 4294967295L)) + e3;
        float d4 = b0.c.d(j3);
        if (d3 > d4 || d4 > f3) {
            return false;
        }
        float e4 = b0.c.e(j3);
        return e3 <= e4 && e4 <= f4;
    }

    public static E2.b l0(E2.d dVar) {
        z2.h.f(dVar, "<this>");
        return new E2.b(dVar.f1076h, dVar.f1077i, dVar.f1078j > 0 ? 2 : -2);
    }

    public static final int m(int i2) {
        if (i2 < 8191) {
            return 262142;
        }
        if (i2 < 32767) {
            return 65534;
        }
        if (i2 < 65535) {
            return 32766;
        }
        if (i2 < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException("Can't represent a size of " + i2 + " in Constraints");
    }

    public static E2.d m0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new E2.d(i2, i3 - 1, 1);
        }
        E2.d dVar = E2.d.f1083k;
        return E2.d.f1083k;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(n0.C0918A r11, B.F r12, D.C0043l r13, n0.C0930i r14, q2.InterfaceC1073d r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.C.n(n0.A, B.F, D.l, n0.i, q2.d):java.lang.Object");
    }

    public static final V.o n0(y2.c cVar) {
        return n0.w.a(V.l.f5857b, 8675309, new D.C(cVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00ad, B:15:0x00b5, B:17:0x00c1, B:19:0x00cd, B:21:0x00d0, B:24:0x00d2, B:28:0x00d6, B:32:0x0041, B:34:0x0065, B:36:0x0069, B:38:0x0079, B:39:0x0085, B:41:0x0093, B:45:0x0081, B:47:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6 A[Catch: CancellationException -> 0x0030, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00ad, B:15:0x00b5, B:17:0x00c1, B:19:0x00cd, B:21:0x00d0, B:24:0x00d2, B:28:0x00d6, B:32:0x0041, B:34:0x0065, B:36:0x0069, B:38:0x0079, B:39:0x0085, B:41:0x0093, B:45:0x0081, B:47:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00ad, B:15:0x00b5, B:17:0x00c1, B:19:0x00cd, B:21:0x00d0, B:24:0x00d2, B:28:0x00d6, B:32:0x0041, B:34:0x0065, B:36:0x0069, B:38:0x0079, B:39:0x0085, B:41:0x0093, B:45:0x0081, B:47:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(n0.C0918A r11, z.a0 r12, n0.C0930i r13, q2.InterfaceC1073d r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.C.o(n0.A, z.a0, n0.i, q2.d):java.lang.Object");
    }

    public static void p(Throwable th, Throwable th2) {
        z2.h.f(th, "<this>");
        z2.h.f(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC1328a.f11270a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC1269a.f10666a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final int q(int i2) {
        if (i2 < 8191) {
            return 13;
        }
        if (i2 < 32767) {
            return 15;
        }
        if (i2 < 65535) {
            return 16;
        }
        return i2 < 262143 ? 18 : 255;
    }

    public static final void u(WorkDatabase workDatabase, C0011a c0011a, C1.p pVar) {
        int i2;
        z2.h.f(c0011a, "configuration");
        z2.h.f(pVar, "continuation");
        ArrayList w2 = AbstractC0963o.w(pVar);
        int i3 = 0;
        while (!w2.isEmpty()) {
            List list = ((C1.p) AbstractC0968t.D(w2)).f672k;
            z2.h.e(list, "current.work");
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if ((!((D) it.next()).f252b.f4573j.f282h.isEmpty()) && (i2 = i2 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i3 += i2;
        }
        if (i3 == 0) {
            return;
        }
        K1.q v3 = workDatabase.v();
        v3.getClass();
        r1.v a3 = r1.v.a("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        r1.r rVar = v3.f4587a;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            int i4 = p3.moveToFirst() ? p3.getInt(0) : 0;
            p3.close();
            a3.c();
            int i5 = i4 + i3;
            int i6 = c0011a.f268i;
            if (i5 <= i6) {
                return;
            }
            throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + i6 + ";\nalready enqueued count: " + i4 + ";\ncurrent enqueue operation count: " + i3 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
        } catch (Throwable th) {
            p3.close();
            a3.c();
            throw th;
        }
    }

    public static final V.o v(V.o oVar, InterfaceC0576P interfaceC0576P) {
        return androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, interfaceC0576P, true, 124927);
    }

    public static final V.o w(V.o oVar) {
        return androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }

    public static float x(float f3, float f4) {
        return f3 < f4 ? f4 : f3;
    }

    public static long y(long j3, long j4) {
        return j3 < j4 ? j4 : j3;
    }

    public static float z(float f3, float f4) {
        return f3 > f4 ? f4 : f3;
    }

    public abstract Intent N(AbstractActivityC0489m abstractActivityC0489m, Serializable serializable);

    public void O(w wVar) {
        new C1.p((C1.w) this, "SmsWorker_Next", 1, Collections.singletonList(wVar)).I();
    }

    public abstract N.e Y(AbstractActivityC0489m abstractActivityC0489m, Serializable serializable);

    public abstract Object g0(Intent intent, int i2);

    public abstract void h0(S0.f fVar, S0.f fVar2);

    public int hashCode() {
        switch (this.f250a) {
            case 19:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract void i0(S0.f fVar, Thread thread);

    public abstract boolean r(S0.g gVar, S0.c cVar, S0.c cVar2);

    public abstract boolean s(S0.g gVar, Object obj, Object obj2);

    public abstract boolean t(S0.g gVar, S0.f fVar, S0.f fVar2);

    public String toString() {
        switch (this.f250a) {
            case 19:
                String b3 = z2.t.a(getClass()).b();
                z2.h.c(b3);
                return b3;
            default:
                return super.toString();
        }
    }
}
