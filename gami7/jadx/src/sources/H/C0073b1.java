package H;

import J.C0294v;
import J.C0301y0;
import J.C0303z0;
import T.C0374b;
import android.os.Trace;
import j.C0736B;
import java.util.List;
import java.util.Set;
import m2.C0880v;
import n2.AbstractC0959k;
import t.C1213h;
import t.C1218m;

/* renamed from: H.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073b1 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2336i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2337j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2338k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2339l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2340m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2341n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2342o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2343p;
    public final /* synthetic */ Object q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2344r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0073b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i2) {
        super(1);
        this.f2336i = i2;
        this.f2337j = obj;
        this.f2338k = obj2;
        this.f2339l = obj3;
        this.f2340m = obj4;
        this.f2341n = obj5;
        this.f2342o = obj6;
        this.f2343p = obj7;
        this.q = obj8;
        this.f2344r = obj9;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // y2.c
    public final Object l(Object obj) {
        boolean v3;
        int i2;
        C0303z0 c0303z0;
        C0303z0 c0303z02;
        Object[] objArr;
        C0736B c0736b;
        Object[] objArr2;
        Object[] objArr3;
        int i3 = 1;
        switch (this.f2336i) {
            case 0:
                float f3 = A1.f1287a;
                E2.d dVar = (E2.d) this.f2337j;
                ((C1213h) obj).r(((dVar.f1077i - dVar.f1076h) + 1) * 12, null, C1218m.f10284k, new R.a(1137566309, new C0066a1((I) this.f2338k, (K) this.f2339l, (y2.c) this.f2340m, (H) this.f2341n, (Long) this.f2342o, (J0) this.f2343p, (InterfaceC0180q3) this.q, (B0) this.f2344r), true));
                return C0880v.f8657a;
            default:
                long longValue = ((Number) obj).longValue();
                C0303z0 c0303z03 = (C0303z0) this.f2337j;
                synchronized (c0303z03.f4302b) {
                    v3 = c0303z03.v();
                }
                boolean z3 = 0;
                if (v3) {
                    C0303z0 c0303z04 = (C0303z0) this.f2337j;
                    Trace.beginSection("Recomposer:animation");
                    try {
                        c0303z04.f4301a.c(longValue);
                        synchronized (T.n.f5710b) {
                            C0736B c0736b2 = ((C0374b) T.n.f5717i.get()).f5673h;
                            if (c0736b2 != null) {
                                objArr3 = c0736b2.h();
                            }
                        }
                        if (objArr3 != false) {
                            T.n.a();
                        }
                    } finally {
                    }
                }
                C0303z0 c0303z05 = (C0303z0) this.f2337j;
                C0736B c0736b3 = (C0736B) this.f2338k;
                C0736B c0736b4 = (C0736B) this.f2339l;
                List list = (List) this.f2340m;
                List list2 = (List) this.f2341n;
                C0736B c0736b5 = (C0736B) this.f2342o;
                List list3 = (List) this.f2343p;
                C0736B c0736b6 = (C0736B) this.q;
                Set set = (Set) this.f2344r;
                Trace.beginSection("Recomposer:recompose");
                try {
                    C0303z0.r(c0303z05);
                    synchronized (c0303z05.f4302b) {
                        try {
                            L.d dVar2 = c0303z05.f4308h;
                            int i4 = dVar2.f4620j;
                            if (i4 > 0) {
                                Object[] objArr4 = dVar2.f4618h;
                                int i5 = 0;
                                while (true) {
                                    list.add((C0294v) objArr4[i5]);
                                    int i6 = i5 + 1;
                                    if (i6 < i4) {
                                        i5 = i6;
                                    }
                                }
                            }
                            c0303z05.f4308h.g();
                        } finally {
                        }
                    }
                    c0736b3.b();
                    while (true) {
                        if (((list.isEmpty() ? 1 : 0) ^ i3) == 0 && ((list2.isEmpty() ? 1 : 0) ^ i3) == 0) {
                            try {
                                if (((list3.isEmpty() ? 1 : 0) ^ i3) != 0) {
                                    try {
                                        int size = list3.size();
                                        for (int i7 = z3; i7 < size; i7 += i3) {
                                            c0736b6.a((C0294v) list3.get(i7));
                                        }
                                        int size2 = list3.size();
                                        for (int i8 = z3; i8 < size2; i8 += i3) {
                                            ((C0294v) list3.get(i8)).f();
                                        }
                                        list3.clear();
                                    } catch (Exception e3) {
                                        C0303z0.C(c0303z05, e3, z3, 6);
                                        C0301y0.r(c0303z05, list, list2, list3, c0736b5, c0736b6, c0736b3, c0736b4);
                                        list3.clear();
                                    }
                                }
                                if (c0736b5.h()) {
                                    try {
                                        try {
                                            c0736b6.i(c0736b5);
                                            Object[] objArr5 = c0736b5.f7965b;
                                            long[] jArr = c0736b5.f7964a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i9 = 0;
                                                while (true) {
                                                    long j3 = jArr[i9];
                                                    c0303z0 = c0303z05;
                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j3 & 255) < 128) {
                                                                try {
                                                                    ((C0294v) objArr5[(i9 << 3) + i11]).h();
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    C0303z0 c0303z06 = c0303z0;
                                                                    C0303z0.C(c0303z06, e, false, 6);
                                                                    C0301y0.r(c0303z06, list, list2, list3, c0736b5, c0736b6, c0736b3, c0736b4);
                                                                    c0736b5.b();
                                                                    return C0880v.f8657a;
                                                                }
                                                            }
                                                            j3 >>= 8;
                                                            i11++;
                                                            objArr5 = objArr5;
                                                        }
                                                        objArr = objArr5;
                                                        if (i10 != 8) {
                                                        }
                                                    } else {
                                                        objArr = objArr5;
                                                    }
                                                    if (i9 != length) {
                                                        i9++;
                                                        c0303z05 = c0303z0;
                                                        objArr5 = objArr;
                                                    }
                                                }
                                            } else {
                                                c0303z0 = c0303z05;
                                            }
                                            c0303z02 = c0303z0;
                                        } catch (Exception e5) {
                                            e = e5;
                                            c0303z0 = c0303z05;
                                        }
                                    } finally {
                                        c0736b5.b();
                                    }
                                } else {
                                    c0303z02 = c0303z05;
                                }
                                if (c0736b6.h()) {
                                    try {
                                        try {
                                            Object[] objArr6 = c0736b6.f7965b;
                                            long[] jArr2 = c0736b6.f7964a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i12 = 0;
                                                while (true) {
                                                    long j4 = jArr2[i12];
                                                    long[] jArr3 = jArr2;
                                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                        int i14 = 0;
                                                        while (i14 < i13) {
                                                            if ((j4 & 255) < 128) {
                                                                ((C0294v) objArr6[(i12 << 3) + i14]).i();
                                                            }
                                                            j4 >>= 8;
                                                            i14++;
                                                            objArr6 = objArr6;
                                                        }
                                                        objArr2 = objArr6;
                                                        if (i13 != 8) {
                                                        }
                                                    } else {
                                                        objArr2 = objArr6;
                                                    }
                                                    if (i12 != length2) {
                                                        i12++;
                                                        jArr2 = jArr3;
                                                        objArr6 = objArr2;
                                                    }
                                                }
                                            }
                                            c0736b6.b();
                                        } catch (Exception e6) {
                                            C0303z0.C(c0303z02, e6, false, 6);
                                            c0736b = c0736b6;
                                            try {
                                                C0301y0.r(c0303z02, list, list2, list3, c0736b5, c0736b6, c0736b3, c0736b4);
                                                c0736b.b();
                                            } catch (Throwable th) {
                                                th = th;
                                                c0736b.b();
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c0736b = c0736b6;
                                        c0736b.b();
                                        throw th;
                                    }
                                }
                                synchronized (c0303z02.f4302b) {
                                    c0303z02.u();
                                }
                                T.n.k().m();
                                c0736b4.b();
                                c0736b3.b();
                                c0303z02.f4314n = null;
                                return C0880v.f8657a;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        int i15 = z3;
                        C0303z0 c0303z07 = c0303z05;
                        C0736B c0736b7 = c0736b6;
                        try {
                            try {
                                int size3 = list.size();
                                for (int i16 = i15; i16 < size3; i16++) {
                                    C0294v c0294v = (C0294v) list.get(i16);
                                    C0294v q = C0303z0.q(c0303z07, c0294v, c0736b3);
                                    if (q != null) {
                                        list3.add(q);
                                    }
                                    c0736b4.a(c0294v);
                                }
                                list.clear();
                                if (c0736b3.h() || c0303z07.f4308h.l()) {
                                    synchronized (c0303z07.f4302b) {
                                        try {
                                            List x2 = c0303z07.x();
                                            int size4 = x2.size();
                                            for (int i17 = i15; i17 < size4; i17++) {
                                                C0294v c0294v2 = (C0294v) x2.get(i17);
                                                if (!c0736b4.c(c0294v2) && c0294v2.v(set)) {
                                                    list.add(c0294v2);
                                                }
                                            }
                                            L.d dVar3 = c0303z07.f4308h;
                                            int i18 = dVar3.f4620j;
                                            int i19 = i15;
                                            int i20 = i19;
                                            while (i19 < i18) {
                                                C0294v c0294v3 = (C0294v) dVar3.f4618h[i19];
                                                if (c0736b4.c(c0294v3) || list.contains(c0294v3)) {
                                                    if (i20 > 0) {
                                                        Object[] objArr7 = dVar3.f4618h;
                                                        objArr7[i19 - i20] = objArr7[i19];
                                                    }
                                                    i2 = 1;
                                                } else {
                                                    list.add(c0294v3);
                                                    i2 = 1;
                                                    i20++;
                                                }
                                                i19 += i2;
                                            }
                                            int i21 = i18 - i20;
                                            AbstractC0959k.u(dVar3.f4618h, null, i21, i18);
                                            dVar3.f4620j = i21;
                                        } finally {
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        C0301y0.s(list2, c0303z07);
                                        while (!list2.isEmpty()) {
                                            List A3 = c0303z07.A(list2, c0736b3);
                                            c0736b5.getClass();
                                            for (Object obj2 : A3) {
                                                c0736b5.f7965b[c0736b5.d(obj2)] = obj2;
                                            }
                                            C0301y0.s(list2, c0303z07);
                                        }
                                    } catch (Exception e7) {
                                        C0303z0.C(c0303z07, e7, true, 2);
                                        C0301y0.r(c0303z07, list, list2, list3, c0736b5, c0736b7, c0736b3, c0736b4);
                                    }
                                }
                                c0736b6 = c0736b7;
                                z3 = i15;
                                c0303z05 = c0303z07;
                                i3 = 1;
                            } catch (Exception e8) {
                                C0303z0.C(c0303z07, e8, true, 2);
                                C0301y0.r(c0303z07, list, list2, list3, c0736b5, c0736b7, c0736b3, c0736b4);
                                list.clear();
                            }
                        } finally {
                            list.clear();
                        }
                    }
                } finally {
                }
                break;
        }
    }
}
