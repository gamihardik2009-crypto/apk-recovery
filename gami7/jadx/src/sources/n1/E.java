package n1;

import H.S3;
import J.AbstractC0286q0;
import J.C0257c;
import J.C0268h0;
import J.C0274k0;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0258c0;
import J.W;
import T.AbstractC0379g;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import l.U;
import m.C0850x;
import n0.C0919B;
import n0.C0929h;
import n2.AbstractC0946A;
import n2.C0970v;
import p.C1031n;
import r0.AbstractC1101O;
import s0.C1194h;
import u0.AbstractC1296l0;
import v.C1333E;
import v.C1334F;
import v.C1359m;
import w1.C1380b;
import w1.C1381c;

/* loaded from: classes.dex */
public abstract class E {
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(o.C0988n r14, y2.a r15, V.o r16, y2.c r17, J.C0285q r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.E.a(o.n, y2.a, V.o, y2.c, J.q, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(o.C0988n r16, y2.a r17, y2.c r18, V.o r19, boolean r20, y2.e r21, J.C0285q r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.E.b(o.n, y2.a, y2.c, V.o, boolean, y2.e, J.q, int, int):void");
    }

    public static final void c(Object obj, int i2, C1334F c1334f, y2.e eVar, C0285q c0285q, int i3) {
        int i4;
        c0285q.W(-2079116560);
        if ((i3 & 6) == 0) {
            i4 = (c0285q.i(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0285q.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0285q.i(c1334f) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0285q.i(eVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0285q.A()) {
            c0285q.P();
        } else {
            boolean g3 = c0285q.g(obj) | c0285q.g(c1334f);
            Object K3 = c0285q.K();
            Object obj2 = C0275l.f4150a;
            if (g3 || K3 == obj2) {
                K3 = new C1333E(obj, c1334f);
                c0285q.e0(K3);
            }
            C1333E c1333e = (C1333E) K3;
            C0268h0 c0268h0 = c1333e.f11281c;
            C0274k0 c0274k0 = c1333e.f11283e;
            C0274k0 c0274k02 = c1333e.f11284f;
            c0268h0.h(i2);
            AbstractC0286q0 abstractC0286q0 = AbstractC1101O.f9832a;
            C1333E c1333e2 = (C1333E) c0285q.l(abstractC0286q0);
            AbstractC0379g c3 = T.s.c();
            y2.c f3 = c3 != null ? c3.f() : null;
            AbstractC0379g d3 = T.s.d(c3);
            try {
                if (c1333e2 != ((C1333E) c0274k02.getValue())) {
                    c0274k02.setValue(c1333e2);
                    if (c1333e.f11282d.g() > 0) {
                        C1333E c1333e3 = (C1333E) c0274k0.getValue();
                        if (c1333e3 != null) {
                            c1333e3.c();
                        }
                        if (c1333e2 != null) {
                            c1333e2.b();
                        } else {
                            c1333e2 = null;
                        }
                        c0274k0.setValue(c1333e2);
                    }
                }
                T.s.f(c3, d3, f3);
                boolean g4 = c0285q.g(c1333e);
                Object K4 = c0285q.K();
                if (g4 || K4 == obj2) {
                    K4 = new C0919B(19, c1333e);
                    c0285q.e0(K4);
                }
                C0257c.d(c1333e, (y2.c) K4, c0285q);
                C0257c.a(abstractC0286q0.a(c1333e), eVar, c0285q, ((i4 >> 6) & 112) | 8);
            } catch (Throwable th) {
                T.s.f(c3, d3, f3);
                throw th;
            }
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new S3(obj, i2, c1334f, eVar, i3);
        }
    }

    public static final List d(v.x xVar, C1334F c1334f, C0929h c0929h) {
        E2.d dVar;
        if (!c0929h.f8942a.l() && c1334f.f11285h.isEmpty()) {
            return C0970v.f9165h;
        }
        ArrayList arrayList = new ArrayList();
        L.d dVar2 = c0929h.f8942a;
        if (!dVar2.l()) {
            dVar = E2.d.f1083k;
        } else {
            if (dVar2.k()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = dVar2.f4618h;
            int i2 = ((C1359m) objArr[0]).f11377a;
            int i3 = dVar2.f4620j;
            if (i3 > 0) {
                int i4 = 0;
                do {
                    int i5 = ((C1359m) objArr[i4]).f11377a;
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    i4++;
                } while (i4 < i3);
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("negative minIndex".toString());
            }
            if (dVar2.k()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = dVar2.f4618h;
            int i6 = ((C1359m) objArr2[0]).f11378b;
            int i7 = dVar2.f4620j;
            if (i7 > 0) {
                int i8 = 0;
                do {
                    int i9 = ((C1359m) objArr2[i8]).f11378b;
                    if (i9 > i6) {
                        i6 = i9;
                    }
                    i8++;
                } while (i8 < i7);
            }
            dVar = new E2.d(i2, Math.min(i6, xVar.a() - 1), 1);
        }
        int size = c1334f.f11285h.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1333E c1333e = (C1333E) c1334f.get(i10);
            int i11 = AbstractC0946A.i(c1333e.f11281c.g(), c1333e.f11279a, xVar);
            int i12 = dVar.f1076h;
            if ((i11 > dVar.f1077i || i12 > i11) && i11 >= 0 && i11 < xVar.a()) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        int i13 = dVar.f1076h;
        int i14 = dVar.f1077i;
        if (i13 <= i14) {
            while (true) {
                arrayList.add(Integer.valueOf(i13));
                if (i13 == i14) {
                    break;
                }
                i13++;
            }
        }
        return arrayList;
    }

    public static final InterfaceC0258c0 e(r.k kVar, C0285q c0285q, int i2) {
        Object K3 = c0285q.K();
        W w2 = C0275l.f4150a;
        if (K3 == w2) {
            K3 = C0257c.N(Boolean.FALSE, W.f4109m);
            c0285q.e0(K3);
        }
        InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K3;
        boolean z3 = (((i2 & 14) ^ 6) > 4 && c0285q.g(kVar)) || (i2 & 6) == 4;
        Object K4 = c0285q.K();
        if (z3 || K4 == w2) {
            K4 = new r.g(kVar, interfaceC0258c0, null);
            c0285q.e0(K4);
        }
        C0257c.e(c0285q, kVar, (y2.e) K4);
        return interfaceC0258c0;
    }

    public static void f(w wVar, String str, R.a aVar) {
        F f3 = wVar.f9108g;
        f3.getClass();
        o1.j jVar = new o1.j((o1.i) f3.b(k(o1.i.class)), str, aVar);
        jVar.f9246i = null;
        jVar.f9247j = null;
        jVar.f9248k = null;
        jVar.f9249l = null;
        jVar.f9250m = null;
        wVar.f9110i.add(jVar.a());
    }

    public static boolean h(String str, String str2) {
        z2.h.f(str, "current");
        if (z2.h.a(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    int i5 = i4 + 1;
                    if (i4 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i3 - 1 == 0 && i4 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i3++;
                    }
                    i2++;
                    i4 = i5;
                } else if (i3 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    z2.h.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return z2.h.a(H2.l.h0(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static C1031n i(C0285q c0285q) {
        float f3 = U.f8166a;
        O0.b bVar = (O0.b) c0285q.l(AbstractC1296l0.f11087f);
        boolean d3 = c0285q.d(bVar.c());
        Object K3 = c0285q.K();
        Object obj = C0275l.f4150a;
        if (d3 || K3 == obj) {
            K3 = new C0850x(new B.F(bVar));
            c0285q.e0(K3);
        }
        C0850x c0850x = (C0850x) K3;
        boolean g3 = c0285q.g(c0850x);
        Object K4 = c0285q.K();
        if (g3 || K4 == obj) {
            K4 = new C1031n(c0850x);
            c0285q.e0(K4);
        }
        return (C1031n) K4;
    }

    public static String k(Class cls) {
        LinkedHashMap linkedHashMap = F.f9014b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            C c3 = (C) cls.getAnnotation(C.class);
            str = c3 != null ? c3.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, str);
        }
        z2.h.c(str);
        return str;
    }

    public static C1380b l(C1381c c1381c, SQLiteDatabase sQLiteDatabase) {
        z2.h.f(c1381c, "refHolder");
        z2.h.f(sQLiteDatabase, "sqLiteDatabase");
        C1380b c1380b = c1381c.f11444a;
        if (c1380b != null && z2.h.a(c1380b.f11443h, sQLiteDatabase)) {
            return c1380b;
        }
        C1380b c1380b2 = new C1380b(sQLiteDatabase);
        c1381c.f11444a = c1380b2;
        return c1380b2;
    }

    public abstract boolean g(C1194h c1194h);

    public abstract Object j(C1194h c1194h);
}
