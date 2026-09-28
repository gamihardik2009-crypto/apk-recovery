package T;

import D.C0043l;
import J.C0261e;
import J.a1;
import j.C0736B;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import n2.AbstractC0959k;
import n2.C0970v;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final K1.m f5709a = new K1.m();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5710b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static l f5711c;

    /* renamed from: d, reason: collision with root package name */
    public static int f5712d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f5713e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0043l f5714f;

    /* renamed from: g, reason: collision with root package name */
    public static List f5715g;

    /* renamed from: h, reason: collision with root package name */
    public static List f5716h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference f5717i;

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC0379g f5718j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0261e f5719k;

    static {
        l lVar = l.f5701l;
        f5711c = lVar;
        f5712d = 2;
        j jVar = new j();
        jVar.f5692c = new int[16];
        jVar.f5693d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        jVar.f5694e = iArr;
        f5713e = jVar;
        C0043l c0043l = new C0043l();
        c0043l.f866b = new int[16];
        c0043l.f867c = new a1[16];
        f5714f = c0043l;
        C0970v c0970v = C0970v.f9165h;
        f5715g = c0970v;
        f5716h = c0970v;
        int i4 = f5712d;
        f5712d = i4 + 1;
        C0374b c0374b = new C0374b(i4, lVar);
        f5711c = f5711c.g(c0374b.f5686b);
        AtomicReference atomicReference = new AtomicReference(c0374b);
        f5717i = atomicReference;
        f5718j = (AbstractC0379g) atomicReference.get();
        f5719k = new C0261e(0);
    }

    public static final void a() {
        f(m.f5706j);
    }

    public static final y2.c b(y2.c cVar, y2.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0373a(cVar, cVar2, 2);
    }

    public static final HashMap c(C0375c c0375c, C0375c c0375c2, l lVar) {
        long[] jArr;
        int i2;
        l lVar2;
        long[] jArr2;
        int i3;
        l lVar3;
        C0736B w2 = c0375c2.w();
        int d3 = c0375c.d();
        if (w2 != null) {
            l f3 = c0375c2.e().g(c0375c2.d()).f(c0375c2.f5675j);
            Object[] objArr = w2.f7965b;
            long[] jArr3 = w2.f7964a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return null;
            }
            int i4 = 0;
            HashMap hashMap = null;
            loop0: while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((255 & j3) < 128) {
                            A a3 = (A) objArr[(i4 << 3) + i7];
                            C a4 = a3.a();
                            C s3 = s(a4, d3, lVar);
                            if (s3 == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                C s4 = s(a4, d3, f3);
                                if (s4 != null && !z2.h.a(s3, s4)) {
                                    i3 = d3;
                                    lVar3 = f3;
                                    C s5 = s(a4, c0375c2.d(), c0375c2.e());
                                    if (s5 == null) {
                                        r();
                                        throw null;
                                    }
                                    C e3 = a3.e(s4, s3, s5);
                                    if (e3 == null) {
                                        break loop0;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s3, e3);
                                    hashMap = hashMap;
                                }
                            }
                            i3 = d3;
                            lVar3 = f3;
                        } else {
                            jArr2 = jArr3;
                            i3 = d3;
                            lVar3 = f3;
                        }
                        j3 >>= 8;
                        i7++;
                        i5 = 8;
                        jArr3 = jArr2;
                        d3 = i3;
                        f3 = lVar3;
                    }
                    jArr = jArr3;
                    i2 = d3;
                    lVar2 = f3;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    i2 = d3;
                    lVar2 = f3;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                jArr3 = jArr;
                d3 = i2;
                f3 = lVar2;
            }
            return hashMap;
        }
        return null;
    }

    public static final void d(AbstractC0379g abstractC0379g) {
        int i2;
        if (f5711c.e(abstractC0379g.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(abstractC0379g.d());
        sb.append(", disposed=");
        sb.append(abstractC0379g.f5687c);
        sb.append(", applied=");
        C0375c c0375c = abstractC0379g instanceof C0375c ? (C0375c) abstractC0379g : null;
        sb.append(c0375c != null ? Boolean.valueOf(c0375c.f5678m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f5710b) {
            j jVar = f5713e;
            i2 = jVar.f5690a > 0 ? ((int[]) jVar.f5692c)[0] : -1;
        }
        sb.append(i2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final l e(l lVar, int i2, int i3) {
        while (i2 < i3) {
            lVar = lVar.g(i2);
            i2++;
        }
        return lVar;
    }

    public static final Object f(y2.c cVar) {
        Object obj;
        C0736B c0736b;
        Object v3;
        AbstractC0379g abstractC0379g = f5718j;
        z2.h.d(abstractC0379g, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f5710b) {
            try {
                obj = f5717i.get();
                c0736b = ((C0374b) obj).f5673h;
                if (c0736b != null) {
                    f5719k.addAndGet(1);
                }
                v3 = v((AbstractC0379g) obj, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0736b != null) {
            try {
                List list = f5715g;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((y2.e) list.get(i2)).j(new L.f(c0736b), obj);
                }
            } finally {
                f5719k.addAndGet(-1);
            }
        }
        synchronized (f5710b) {
            g();
            if (c0736b != null) {
                Object[] objArr = c0736b.f7965b;
                long[] jArr = c0736b.f7964a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j3 = jArr[i3];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j3) < 128) {
                                    q((A) objArr[(i3 << 3) + i5]);
                                }
                                j3 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return v3;
    }

    public static final void g() {
        C0043l c0043l = f5714f;
        int i2 = c0043l.f865a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            a1 a1Var = ((a1[]) c0043l.f867c)[i3];
            if ((a1Var != null ? a1Var.get() : null) != null && !(!p((A) r5))) {
                if (i4 != i3) {
                    ((a1[]) c0043l.f867c)[i4] = a1Var;
                    int[] iArr = (int[]) c0043l.f866b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((a1[]) c0043l.f867c)[i5] = null;
            ((int[]) c0043l.f866b)[i5] = 0;
        }
        if (i4 != i2) {
            c0043l.f865a = i4;
        }
    }

    public static final AbstractC0379g h(AbstractC0379g abstractC0379g, y2.c cVar, boolean z3) {
        boolean z4 = abstractC0379g instanceof C0375c;
        if (z4 || abstractC0379g == null) {
            return new F(z4 ? (C0375c) abstractC0379g : null, cVar, null, false, z3);
        }
        return new G(abstractC0379g, cVar, z3);
    }

    public static final C i(C c3) {
        C s3;
        AbstractC0379g k3 = k();
        C s4 = s(c3, k3.d(), k3.e());
        if (s4 != null) {
            return s4;
        }
        synchronized (f5710b) {
            AbstractC0379g k4 = k();
            s3 = s(c3, k4.d(), k4.e());
        }
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final C j(C c3, AbstractC0379g abstractC0379g) {
        C s3 = s(c3, abstractC0379g.d(), abstractC0379g.e());
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final AbstractC0379g k() {
        AbstractC0379g abstractC0379g = (AbstractC0379g) f5709a.d();
        return abstractC0379g == null ? (AbstractC0379g) f5717i.get() : abstractC0379g;
    }

    public static final y2.c l(y2.c cVar, y2.c cVar2, boolean z3) {
        if (!z3) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0373a(cVar, cVar2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final T.C m(T.C r12, T.A r13) {
        /*
            T.C r0 = r13.a()
            int r1 = T.n.f5712d
            T.j r2 = T.n.f5713e
            int r3 = r2.f5690a
            r4 = 0
            if (r3 <= 0) goto L13
            java.lang.Object r1 = r2.f5692c
            int[] r1 = (int[]) r1
            r1 = r1[r4]
        L13:
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r5 = r3
        L17:
            if (r0 == 0) goto L59
            int r6 = r0.f5647a
            if (r6 != 0) goto L1f
        L1d:
            r3 = r0
            goto L59
        L1f:
            if (r6 == 0) goto L56
            if (r6 > r1) goto L56
            int r6 = r6 + 0
            r7 = 0
            r9 = 1
            r11 = 64
            if (r6 < 0) goto L37
            if (r6 >= r11) goto L37
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L46
        L35:
            r6 = r2
            goto L47
        L37:
            if (r6 < r11) goto L46
            r11 = 128(0x80, float:1.8E-43)
            if (r6 >= r11) goto L46
            int r6 = r6 + (-64)
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L46
            goto L35
        L46:
            r6 = r4
        L47:
            if (r6 != 0) goto L56
            if (r5 != 0) goto L4d
            r5 = r0
            goto L56
        L4d:
            int r1 = r0.f5647a
            int r2 = r5.f5647a
            if (r1 >= r2) goto L54
            goto L1d
        L54:
            r3 = r5
            goto L59
        L56:
            T.C r0 = r0.f5648b
            goto L17
        L59:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == 0) goto L61
            r3.f5647a = r0
            goto L70
        L61:
            T.C r3 = r12.b()
            r3.f5647a = r0
            T.C r12 = r13.a()
            r3.f5648b = r12
            r13.b(r3)
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: T.n.m(T.C, T.A):T.C");
    }

    public static final void n(AbstractC0379g abstractC0379g, A a3) {
        abstractC0379g.s(abstractC0379g.h() + 1);
        y2.c i2 = abstractC0379g.i();
        if (i2 != null) {
            i2.l(a3);
        }
    }

    public static final C o(C c3, A a3, AbstractC0379g abstractC0379g, C c4) {
        C m3;
        if (abstractC0379g.g()) {
            abstractC0379g.n(a3);
        }
        int d3 = abstractC0379g.d();
        if (c4.f5647a == d3) {
            return c4;
        }
        synchronized (f5710b) {
            m3 = m(c3, a3);
        }
        m3.f5647a = d3;
        if (c4.f5647a != 1) {
            abstractC0379g.n(a3);
        }
        return m3;
    }

    public static final boolean p(A a3) {
        C c3;
        int i2 = f5712d;
        j jVar = f5713e;
        if (jVar.f5690a > 0) {
            i2 = ((int[]) jVar.f5692c)[0];
        }
        C c4 = null;
        C c5 = null;
        int i3 = 0;
        for (C a4 = a3.a(); a4 != null; a4 = a4.f5648b) {
            int i4 = a4.f5647a;
            if (i4 != 0) {
                if (i4 >= i2) {
                    i3++;
                } else if (c4 == null) {
                    i3++;
                    c4 = a4;
                } else {
                    if (i4 < c4.f5647a) {
                        c3 = c4;
                        c4 = a4;
                    } else {
                        c3 = a4;
                    }
                    if (c5 == null) {
                        c5 = a3.a();
                        C c6 = c5;
                        while (true) {
                            if (c5 == null) {
                                c5 = c6;
                                break;
                            }
                            int i5 = c5.f5647a;
                            if (i5 >= i2) {
                                break;
                            }
                            if (c6.f5647a < i5) {
                                c6 = c5;
                            }
                            c5 = c5.f5648b;
                        }
                    }
                    c4.f5647a = 0;
                    c4.a(c5);
                    c4 = c3;
                }
            }
        }
        return i3 > 1;
    }

    public static final void q(A a3) {
        if (p(a3)) {
            C0043l c0043l = f5714f;
            int i2 = c0043l.f865a;
            int identityHashCode = System.identityHashCode(a3);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = c0043l.f865a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) c0043l.f866b)[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        a1 a1Var = ((a1[]) c0043l.f867c)[i6];
                        if (a3 == (a1Var != null ? a1Var.get() : null)) {
                            i3 = i6;
                        } else {
                            int i8 = i6 - 1;
                            while (-1 < i8 && ((int[]) c0043l.f866b)[i8] == identityHashCode) {
                                a1 a1Var2 = ((a1[]) c0043l.f867c)[i8];
                                if ((a1Var2 != null ? a1Var2.get() : null) == a3) {
                                    break;
                                } else {
                                    i8--;
                                }
                            }
                            int i9 = c0043l.f865a;
                            i8 = i6 + 1;
                            while (true) {
                                if (i8 >= i9) {
                                    i8 = -(c0043l.f865a + 1);
                                    break;
                                } else {
                                    if (((int[]) c0043l.f866b)[i8] != identityHashCode) {
                                        i8 = -(i8 + 1);
                                        break;
                                    }
                                    a1 a1Var3 = ((a1[]) c0043l.f867c)[i8];
                                    if ((a1Var3 != null ? a1Var3.get() : null) == a3) {
                                        break;
                                    } else {
                                        i8++;
                                    }
                                }
                            }
                            i3 = i8;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            a1[] a1VarArr = (a1[]) c0043l.f867c;
            int length = a1VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                a1[] a1VarArr2 = new a1[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                AbstractC0959k.q(a1VarArr, a1VarArr2, i12, i10, i2);
                AbstractC0959k.s((a1[]) c0043l.f867c, a1VarArr2, 0, i10, 6);
                AbstractC0959k.p((int[]) c0043l.f866b, iArr, i12, i10, i2);
                AbstractC0959k.r((int[]) c0043l.f866b, iArr, 0, i10, 6);
                c0043l.f867c = a1VarArr2;
                c0043l.f866b = iArr;
            } else {
                int i13 = i10 + 1;
                AbstractC0959k.q(a1VarArr, a1VarArr, i13, i10, i2);
                int[] iArr2 = (int[]) c0043l.f866b;
                AbstractC0959k.p(iArr2, iArr2, i13, i10, i2);
            }
            ((a1[]) c0043l.f867c)[i10] = new a1(a3);
            ((int[]) c0043l.f866b)[i10] = identityHashCode;
            c0043l.f865a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final C s(C c3, int i2, l lVar) {
        C c4 = null;
        while (c3 != null) {
            int i3 = c3.f5647a;
            if (i3 != 0 && i3 <= i2 && !lVar.e(i3) && (c4 == null || c4.f5647a < c3.f5647a)) {
                c4 = c3;
            }
            c3 = c3.f5648b;
        }
        if (c4 != null) {
            return c4;
        }
        return null;
    }

    public static final C t(C c3, A a3) {
        C s3;
        AbstractC0379g k3 = k();
        y2.c f3 = k3.f();
        if (f3 != null) {
            f3.l(a3);
        }
        C s4 = s(c3, k3.d(), k3.e());
        if (s4 != null) {
            return s4;
        }
        synchronized (f5710b) {
            AbstractC0379g k4 = k();
            C a4 = a3.a();
            z2.h.d(a4, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            s3 = s(a4, k4.d(), k4.e());
            if (s3 == null) {
                r();
                throw null;
            }
        }
        return s3;
    }

    public static final void u(int i2) {
        int i3;
        j jVar = f5713e;
        int i4 = ((int[]) jVar.f5694e)[i2];
        jVar.b(i4, jVar.f5690a - 1);
        jVar.f5690a--;
        int[] iArr = (int[]) jVar.f5692c;
        int i5 = iArr[i4];
        int i6 = i4;
        while (i6 > 0) {
            int i7 = ((i6 + 1) >> 1) - 1;
            if (iArr[i7] <= i5) {
                break;
            }
            jVar.b(i7, i6);
            i6 = i7;
        }
        int[] iArr2 = (int[]) jVar.f5692c;
        int i8 = jVar.f5690a >> 1;
        while (i4 < i8) {
            int i9 = (i4 + 1) << 1;
            int i10 = i9 - 1;
            if (i9 < jVar.f5690a && (i3 = iArr2[i9]) < iArr2[i10]) {
                if (i3 >= iArr2[i4]) {
                    break;
                }
                jVar.b(i9, i4);
                i4 = i9;
            } else {
                if (iArr2[i10] >= iArr2[i4]) {
                    break;
                }
                jVar.b(i10, i4);
                i4 = i10;
            }
        }
        ((int[]) jVar.f5694e)[i2] = jVar.f5691b;
        jVar.f5691b = i2;
    }

    public static final Object v(AbstractC0379g abstractC0379g, y2.c cVar) {
        Object l3 = cVar.l(f5711c.b(abstractC0379g.d()));
        synchronized (f5710b) {
            int i2 = f5712d;
            f5712d = i2 + 1;
            l b3 = f5711c.b(abstractC0379g.d());
            f5711c = b3;
            f5717i.set(new C0374b(i2, b3));
            abstractC0379g.c();
            f5711c = f5711c.g(i2);
        }
        return l3;
    }

    public static final C w(C c3, A a3, AbstractC0379g abstractC0379g) {
        C s3;
        if (abstractC0379g.g()) {
            abstractC0379g.n(a3);
        }
        int d3 = abstractC0379g.d();
        C s4 = s(c3, d3, abstractC0379g.e());
        if (s4 == null) {
            r();
            throw null;
        }
        if (s4.f5647a == abstractC0379g.d()) {
            return s4;
        }
        synchronized (f5710b) {
            s3 = s(a3.a(), d3, abstractC0379g.e());
            if (s3 == null) {
                r();
                throw null;
            }
            if (s3.f5647a != d3) {
                C m3 = m(s3, a3);
                m3.a(s3);
                m3.f5647a = abstractC0379g.d();
                s3 = m3;
            }
        }
        if (s4.f5647a != 1) {
            abstractC0379g.n(a3);
        }
        return s3;
    }
}
