package X;

import A0.q;
import B1.RunnableC0015e;
import L2.g;
import a0.C0428e;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.lifecycle.InterfaceC0456e;
import androidx.lifecycle.InterfaceC0470t;
import j.AbstractC0754j;
import j.C0751g;
import j.C0761q;
import j.C0762r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m2.C0880v;
import n2.AbstractC0946A;
import t0.C1236E;
import u0.C1314v;
import u0.I0;
import u0.N;
import u0.P0;
import x0.AbstractC1391a;
import x0.d;
import x0.e;
import x0.i;
import z2.h;

/* loaded from: classes.dex */
public final class c implements InterfaceC0456e, View.OnAttachStateChangeListener {

    /* renamed from: h, reason: collision with root package name */
    public final C1314v f6185h;

    /* renamed from: i, reason: collision with root package name */
    public final y2.a f6186i;

    /* renamed from: j, reason: collision with root package name */
    public d f6187j;

    /* renamed from: k, reason: collision with root package name */
    public final C0761q f6188k = new C0761q();

    /* renamed from: l, reason: collision with root package name */
    public final C0762r f6189l = new C0762r();

    /* renamed from: m, reason: collision with root package name */
    public final long f6190m = 100;

    /* renamed from: n, reason: collision with root package name */
    public int f6191n = 1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6192o = true;

    /* renamed from: p, reason: collision with root package name */
    public final C0751g f6193p = new C0751g(0);
    public final g q = B2.a.c(1, 0, 6);

    /* renamed from: r, reason: collision with root package name */
    public final Handler f6194r = new Handler(Looper.getMainLooper());

    /* renamed from: s, reason: collision with root package name */
    public C0761q f6195s;

    /* renamed from: t, reason: collision with root package name */
    public long f6196t;

    /* renamed from: u, reason: collision with root package name */
    public final C0761q f6197u;

    /* renamed from: v, reason: collision with root package name */
    public P0 f6198v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6199w;

    /* renamed from: x, reason: collision with root package name */
    public final RunnableC0015e f6200x;

    public c(C1314v c1314v, C0428e c0428e) {
        this.f6185h = c1314v;
        this.f6186i = c0428e;
        C0761q c0761q = AbstractC0754j.f8005a;
        h.d(c0761q, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f6195s = c0761q;
        this.f6197u = new C0761q();
        q a3 = c1314v.getSemanticsOwner().a();
        h.d(c0761q, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f6198v = new P0(a3, c0761q);
        this.f6200x = new RunnableC0015e(5, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:13:0x004e, B:17:0x005b, B:19:0x0063, B:21:0x006c, B:22:0x006f, B:24:0x0073, B:25:0x007c, B:34:0x003c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008d -> B:13:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(q2.InterfaceC1073d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.b
            if (r0 == 0) goto L13
            r0 = r9
            X.b r0 = (X.b) r0
            int r1 = r0.f6184o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6184o = r1
            goto L18
        L13:
            X.b r0 = new X.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f6182m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f6184o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            L2.a r2 = r0.f6181l
            X.c r5 = r0.f6180k
            C1.y.J(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4e
        L2e:
            r9 = move-exception
            goto L9c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            L2.a r2 = r0.f6181l
            X.c r5 = r0.f6180k
            C1.y.J(r9)     // Catch: java.lang.Throwable -> L2e
            goto L5b
        L40:
            C1.y.J(r9)
            L2.g r9 = r8.q     // Catch: java.lang.Throwable -> L9a
            r9.getClass()     // Catch: java.lang.Throwable -> L9a
            L2.a r2 = new L2.a     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            r5 = r8
        L4e:
            r0.f6180k = r5     // Catch: java.lang.Throwable -> L2e
            r0.f6181l = r2     // Catch: java.lang.Throwable -> L2e
            r0.f6184o = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r2.b(r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L5b
            return r1
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L90
            r2.c()     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r5.h()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L6f
            r5.i()     // Catch: java.lang.Throwable -> L2e
        L6f:
            boolean r9 = r5.f6199w     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L7c
            r5.f6199w = r4     // Catch: java.lang.Throwable -> L2e
            android.os.Handler r9 = r5.f6194r     // Catch: java.lang.Throwable -> L2e
            B1.e r6 = r5.f6200x     // Catch: java.lang.Throwable -> L2e
            r9.post(r6)     // Catch: java.lang.Throwable -> L2e
        L7c:
            j.g r9 = r5.f6193p     // Catch: java.lang.Throwable -> L2e
            r9.clear()     // Catch: java.lang.Throwable -> L2e
            long r6 = r5.f6190m     // Catch: java.lang.Throwable -> L2e
            r0.f6180k = r5     // Catch: java.lang.Throwable -> L2e
            r0.f6181l = r2     // Catch: java.lang.Throwable -> L2e
            r0.f6184o = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = J2.B.f(r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L4e
            return r1
        L90:
            j.g r9 = r5.f6193p
            r9.clear()
            m2.v r9 = m2.C0880v.f8657a
            return r9
        L98:
            r5 = r8
            goto L9c
        L9a:
            r9 = move-exception
            goto L98
        L9c:
            j.g r0 = r5.f6193p
            r0.clear()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.c.a(q2.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r15) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.c.c(int):void");
    }

    @Override // androidx.lifecycle.InterfaceC0456e
    public final void e(InterfaceC0470t interfaceC0470t) {
        n(this.f6185h.getSemanticsOwner().a());
        i();
        this.f6187j = null;
    }

    @Override // androidx.lifecycle.InterfaceC0456e
    public final void f(InterfaceC0470t interfaceC0470t) {
        this.f6187j = (d) this.f6186i.c();
        m(this.f6185h.getSemanticsOwner().a());
        i();
    }

    public final C0761q g() {
        if (this.f6192o) {
            this.f6192o = false;
            this.f6195s = N.q(this.f6185h.getSemanticsOwner());
            this.f6196t = System.currentTimeMillis();
        }
        return this.f6195s;
    }

    public final boolean h() {
        return this.f6187j != null;
    }

    public final void i() {
        String str;
        String str2;
        d dVar = this.f6187j;
        if (dVar != null && Build.VERSION.SDK_INT >= 29) {
            C0761q c0761q = this.f6188k;
            int i2 = c0761q.f8027e;
            Object obj = dVar.f11472a;
            String str3 = "TREAT_AS_VIEW_TREE_APPEARED";
            char c3 = 7;
            long j3 = -9187201950435737472L;
            int i3 = 0;
            View view = dVar.f11473b;
            if (i2 != 0) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = c0761q.f8025c;
                long[] jArr = c0761q.f8023a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j4 = jArr[i4];
                        str2 = str3;
                        if ((((~j4) << 7) & j4 & j3) != j3) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j4 & 255) < 128) {
                                    arrayList.add((i) objArr[(i4 << 3) + i6]);
                                }
                                j4 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        str3 = str2;
                        j3 = -9187201950435737472L;
                    }
                } else {
                    str2 = "TREAT_AS_VIEW_TREE_APPEARED";
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList2.add(((i) arrayList.get(i7)).f11474a);
                }
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 34) {
                    x0.c.a(I0.b(obj), arrayList2);
                } else if (i8 >= 29) {
                    ViewStructure b3 = x0.b.b(I0.b(obj), view);
                    AbstractC1391a.a(b3).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    x0.b.d(I0.b(obj), b3);
                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                        x0.b.d(I0.b(obj), (ViewStructure) arrayList2.get(i9));
                    }
                    ViewStructure b4 = x0.b.b(I0.b(obj), view);
                    str3 = str2;
                    AbstractC1391a.a(b4).putBoolean(str3, true);
                    x0.b.d(I0.b(obj), b4);
                    c0761q.a();
                }
                str3 = str2;
                c0761q.a();
            }
            C0762r c0762r = this.f6189l;
            if (c0762r.f8032d != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = c0762r.f8030b;
                long[] jArr2 = c0762r.f8029a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j5 = jArr2[i10];
                        long[] jArr3 = jArr2;
                        str = str3;
                        if ((((~j5) << c3) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j5 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i10 << 3) + i12]));
                                }
                                j5 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length2) {
                            break;
                        }
                        i10++;
                        jArr2 = jArr3;
                        str3 = str;
                        c3 = 7;
                    }
                } else {
                    str = str3;
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i13)).intValue()));
                }
                long[] jArr4 = new long[arrayList4.size()];
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    jArr4[i3] = ((Number) it.next()).longValue();
                    i3++;
                }
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 34) {
                    x0.b.f(I0.b(obj), e.a(view), jArr4);
                } else if (i14 >= 29) {
                    ViewStructure b5 = x0.b.b(I0.b(obj), view);
                    AbstractC1391a.a(b5).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    x0.b.d(I0.b(obj), b5);
                    x0.b.f(I0.b(obj), e.a(view), jArr4);
                    ViewStructure b6 = x0.b.b(I0.b(obj), view);
                    AbstractC1391a.a(b6).putBoolean(str, true);
                    x0.b.d(I0.b(obj), b6);
                }
                c0762r.b();
            }
        }
    }

    public final void j(q qVar, P0 p02) {
        List h2 = q.h(qVar, true, 4);
        int size = h2.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar2 = (q) h2.get(i2);
            if (g().b(qVar2.f75g) && !p02.f10966b.c(qVar2.f75g)) {
                m(qVar2);
            }
        }
        C0761q c0761q = this.f6197u;
        int[] iArr = c0761q.f8024b;
        long[] jArr = c0761q.f8023a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            if (!g().b(i6)) {
                                c(i6);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List h3 = q.h(qVar, true, 4);
        int size2 = h3.size();
        for (int i7 = 0; i7 < size2; i7++) {
            q qVar3 = (q) h3.get(i7);
            if (g().b(qVar3.f75g)) {
                int i8 = qVar3.f75g;
                if (c0761q.b(i8)) {
                    Object e3 = c0761q.e(i8);
                    if (e3 == null) {
                        AbstractC0946A.s("node not present in pruned tree before this change");
                        throw null;
                    }
                    j(qVar3, (P0) e3);
                } else {
                    continue;
                }
            }
        }
    }

    public final void k(String str, int i2) {
        d dVar;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29 && (dVar = this.f6187j) != null) {
            long j3 = i2;
            Object obj = dVar.f11472a;
            AutofillId a3 = i3 >= 29 ? x0.b.a(I0.b(obj), e.a(dVar.f11473b), j3) : null;
            if (a3 == null) {
                AbstractC0946A.s("Invalid content capture ID");
                throw null;
            }
            if (i3 >= 29) {
                x0.b.e(I0.b(obj), a3, str);
            }
        }
    }

    public final void l(q qVar, P0 p02) {
        C0762r c0762r = new C0762r();
        List h2 = q.h(qVar, true, 4);
        int size = h2.size();
        int i2 = 0;
        while (true) {
            g gVar = this.q;
            C0880v c0880v = C0880v.f8657a;
            C0751g c0751g = this.f6193p;
            C1236E c1236e = qVar.f71c;
            if (i2 >= size) {
                C0762r c0762r2 = p02.f10966b;
                int[] iArr = c0762r2.f8030b;
                long[] jArr = c0762r2.f8029a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j3 = jArr[i3];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j3 & 255) < 128) {
                                    if (!c0762r.c(iArr[(i3 << 3) + i6])) {
                                        if (c0751g.add(c1236e)) {
                                            gVar.q(c0880v);
                                            return;
                                        }
                                        return;
                                    }
                                    i4 = 8;
                                }
                                j3 >>= i4;
                            }
                            if (i5 != i4) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                List h3 = q.h(qVar, true, 4);
                int size2 = h3.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    q qVar2 = (q) h3.get(i7);
                    if (g().b(qVar2.f75g)) {
                        Object e3 = this.f6197u.e(qVar2.f75g);
                        if (e3 == null) {
                            AbstractC0946A.s("node not present in pruned tree before this change");
                            throw null;
                        }
                        l(qVar2, (P0) e3);
                    }
                }
                return;
            }
            q qVar3 = (q) h2.get(i2);
            if (g().b(qVar3.f75g)) {
                C0762r c0762r3 = p02.f10966b;
                int i8 = qVar3.f75g;
                if (!c0762r3.c(i8)) {
                    if (c0751g.add(c1236e)) {
                        gVar.q(c0880v);
                        return;
                    }
                    return;
                }
                c0762r.a(i8);
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0216, code lost:
    
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r10 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0214, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(A0.q r21) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.c.m(A0.q):void");
    }

    public final void n(q qVar) {
        if (h()) {
            c(qVar.f75g);
            List k3 = qVar.k();
            int size = k3.size();
            for (int i2 = 0; i2 < size; i2++) {
                n((q) k3.get(i2));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f6194r.removeCallbacks(this.f6200x);
        this.f6187j = null;
    }
}
