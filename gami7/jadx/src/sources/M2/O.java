package M2;

import J2.C0308e;
import J2.C0311h;
import N2.AbstractC0363b;
import N2.AbstractC0364c;
import N2.AbstractC0365d;
import java.util.Arrays;
import m.AbstractC0837j;
import m2.C0880v;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public class O extends AbstractC0363b implements H, InterfaceC0343g, N2.w {

    /* renamed from: l, reason: collision with root package name */
    public final int f4822l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4823m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4824n;

    /* renamed from: o, reason: collision with root package name */
    public Object[] f4825o;

    /* renamed from: p, reason: collision with root package name */
    public long f4826p;
    public long q;

    /* renamed from: r, reason: collision with root package name */
    public int f4827r;

    /* renamed from: s, reason: collision with root package name */
    public int f4828s;

    public O(int i2, int i3, int i4) {
        this.f4822l = i2;
        this.f4823m = i3;
        this.f4824n = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x007a, B:20:0x0082, B:28:0x0095, B:31:0x009c, B:32:0x00a0, B:34:0x00a1, B:40:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [N2.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [M2.O] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [M2.h] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [N2.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [M2.Q] */
    /* JADX WARN: Type inference failed for: r9v8, types: [M2.Q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00af -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(M2.O r8, M2.InterfaceC0344h r9, q2.InterfaceC1073d r10) {
        /*
            boolean r0 = r10 instanceof M2.N
            if (r0 == 0) goto L13
            r0 = r10
            M2.N r0 = (M2.N) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            M2.N r0 = new M2.N
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f4820o
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.q
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            J2.Z r8 = r0.f4819n
            M2.Q r9 = r0.f4818m
            M2.h r2 = r0.f4817l
            M2.O r5 = r0.f4816k
            C1.y.J(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L77
        L38:
            r8 = move-exception
            goto Lb5
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            J2.Z r8 = r0.f4819n
            M2.Q r9 = r0.f4818m
            M2.h r2 = r0.f4817l
            M2.O r5 = r0.f4816k
            C1.y.J(r10)     // Catch: java.lang.Throwable -> L38
            goto L7a
        L4f:
            M2.Q r9 = r0.f4818m
            M2.h r8 = r0.f4817l
            M2.O r2 = r0.f4816k
            C1.y.J(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb5
        L5e:
            C1.y.J(r10)
            N2.d r10 = r8.e()
            M2.Q r10 = (M2.Q) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            q2.i r2 = r0.f10205i     // Catch: java.lang.Throwable -> Lb2
            z2.h.c(r2)     // Catch: java.lang.Throwable -> Lb2
            J2.w r5 = J2.C0325w.f4437i     // Catch: java.lang.Throwable -> Lb2
            q2.g r2 = r2.s(r5)     // Catch: java.lang.Throwable -> Lb2
            J2.Z r2 = (J2.Z) r2     // Catch: java.lang.Throwable -> Lb2
        L77:
            r5 = r8
            r8 = r2
            r2 = r10
        L7a:
            java.lang.Object r10 = r5.u(r9)     // Catch: java.lang.Throwable -> L38
            O2.v r6 = M2.P.f4829a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L93
            r0.f4816k = r5     // Catch: java.lang.Throwable -> L38
            r0.f4817l = r2     // Catch: java.lang.Throwable -> L38
            r0.f4818m = r9     // Catch: java.lang.Throwable -> L38
            r0.f4819n = r8     // Catch: java.lang.Throwable -> L38
            r0.q = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.k(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L7a
            return
        L93:
            if (r8 == 0) goto La1
            boolean r6 = r8.b()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9c
            goto La1
        L9c:
            java.util.concurrent.CancellationException r8 = r8.i()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La1:
            r0.f4816k = r5     // Catch: java.lang.Throwable -> L38
            r0.f4817l = r2     // Catch: java.lang.Throwable -> L38
            r0.f4818m = r9     // Catch: java.lang.Throwable -> L38
            r0.f4819n = r8     // Catch: java.lang.Throwable -> L38
            r0.q = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.f(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
            return
        Lb2:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb5:
            r5.i(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.O.m(M2.O, M2.h, q2.d):void");
    }

    @Override // M2.H
    public final void a() {
        synchronized (this) {
            v(q() + this.f4827r, this.q, q() + this.f4827r, q() + this.f4827r + this.f4828s);
        }
    }

    @Override // M2.InterfaceC0343g
    public final Object b(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        m(this, interfaceC0344h, interfaceC1073d);
        return EnumC1145a.f10026h;
    }

    @Override // N2.w
    public final InterfaceC0343g c(InterfaceC1078i interfaceC1078i, int i2, int i3) {
        return P.m(this, interfaceC1078i, i2, i3);
    }

    @Override // M2.H
    public final boolean d(Object obj) {
        int i2;
        boolean z3;
        InterfaceC1073d[] interfaceC1073dArr = AbstractC0364c.f5032a;
        synchronized (this) {
            if (s(obj)) {
                interfaceC1073dArr = p(interfaceC1073dArr);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        for (InterfaceC1073d interfaceC1073d : interfaceC1073dArr) {
            if (interfaceC1073d != null) {
                interfaceC1073d.t(C0880v.f8657a);
            }
        }
        return z3;
    }

    @Override // M2.InterfaceC0344h
    public final Object f(Object obj, InterfaceC1073d interfaceC1073d) {
        InterfaceC1073d[] interfaceC1073dArr;
        M m3;
        if (d(obj)) {
            return C0880v.f8657a;
        }
        C0311h c0311h = new C0311h(1, AbstractC0948C.i(interfaceC1073d));
        c0311h.r();
        InterfaceC1073d[] interfaceC1073dArr2 = AbstractC0364c.f5032a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    c0311h.t(C0880v.f8657a);
                    interfaceC1073dArr = p(interfaceC1073dArr2);
                    m3 = null;
                } else {
                    M m4 = new M(this, this.f4827r + this.f4828s + q(), obj, c0311h);
                    o(m4);
                    this.f4828s++;
                    if (this.f4823m == 0) {
                        interfaceC1073dArr2 = p(interfaceC1073dArr2);
                    }
                    interfaceC1073dArr = interfaceC1073dArr2;
                    m3 = m4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m3 != null) {
            c0311h.u(new C0308e(1, m3));
        }
        for (InterfaceC1073d interfaceC1073d2 : interfaceC1073dArr) {
            if (interfaceC1073d2 != null) {
                interfaceC1073d2.t(C0880v.f8657a);
            }
        }
        Object q = c0311h.q();
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        if (q != enumC1145a) {
            q = C0880v.f8657a;
        }
        return q == enumC1145a ? q : C0880v.f8657a;
    }

    @Override // N2.AbstractC0363b
    public final AbstractC0365d g() {
        Q q = new Q();
        q.f4832a = -1L;
        return q;
    }

    @Override // N2.AbstractC0363b
    public final AbstractC0365d[] h() {
        return new Q[2];
    }

    public final Object k(Q q, N n3) {
        C0311h c0311h = new C0311h(1, AbstractC0948C.i(n3));
        c0311h.r();
        synchronized (this) {
            if (t(q) < 0) {
                q.f4833b = c0311h;
            } else {
                c0311h.t(C0880v.f8657a);
            }
        }
        Object q3 = c0311h.q();
        return q3 == EnumC1145a.f10026h ? q3 : C0880v.f8657a;
    }

    public final void l() {
        if (this.f4823m != 0 || this.f4828s > 1) {
            Object[] objArr = this.f4825o;
            z2.h.c(objArr);
            while (this.f4828s > 0) {
                long q = q();
                int i2 = this.f4827r;
                int i3 = this.f4828s;
                if (objArr[((int) ((q + (i2 + i3)) - 1)) & (objArr.length - 1)] != P.f4829a) {
                    return;
                }
                this.f4828s = i3 - 1;
                P.d(objArr, q() + this.f4827r + this.f4828s, null);
            }
        }
    }

    public final void n() {
        AbstractC0365d[] abstractC0365dArr;
        Object[] objArr = this.f4825o;
        z2.h.c(objArr);
        P.d(objArr, q(), null);
        this.f4827r--;
        long q = q() + 1;
        if (this.f4826p < q) {
            this.f4826p = q;
        }
        if (this.q < q) {
            if (this.f5029i != 0 && (abstractC0365dArr = this.f5028h) != null) {
                for (AbstractC0365d abstractC0365d : abstractC0365dArr) {
                    if (abstractC0365d != null) {
                        Q q3 = (Q) abstractC0365d;
                        long j3 = q3.f4832a;
                        if (j3 >= 0 && j3 < q) {
                            q3.f4832a = q;
                        }
                    }
                }
            }
            this.q = q;
        }
    }

    public final void o(Object obj) {
        int i2 = this.f4827r + this.f4828s;
        Object[] objArr = this.f4825o;
        if (objArr == null) {
            objArr = r(null, 0, 2);
        } else if (i2 >= objArr.length) {
            objArr = r(objArr, i2, objArr.length * 2);
        }
        P.d(objArr, q() + i2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final InterfaceC1073d[] p(InterfaceC1073d[] interfaceC1073dArr) {
        AbstractC0365d[] abstractC0365dArr;
        Q q;
        C0311h c0311h;
        int length = interfaceC1073dArr.length;
        if (this.f5029i != 0 && (abstractC0365dArr = this.f5028h) != null) {
            int length2 = abstractC0365dArr.length;
            int i2 = 0;
            interfaceC1073dArr = interfaceC1073dArr;
            while (i2 < length2) {
                AbstractC0365d abstractC0365d = abstractC0365dArr[i2];
                if (abstractC0365d != null && (c0311h = (q = (Q) abstractC0365d).f4833b) != null && t(q) >= 0) {
                    int length3 = interfaceC1073dArr.length;
                    interfaceC1073dArr = interfaceC1073dArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(interfaceC1073dArr, Math.max(2, interfaceC1073dArr.length * 2));
                        z2.h.e(copyOf, "copyOf(this, newSize)");
                        interfaceC1073dArr = copyOf;
                    }
                    interfaceC1073dArr[length] = c0311h;
                    q.f4833b = null;
                    length++;
                }
                i2++;
                interfaceC1073dArr = interfaceC1073dArr;
            }
        }
        return interfaceC1073dArr;
    }

    public final long q() {
        return Math.min(this.q, this.f4826p);
    }

    public final Object[] r(Object[] objArr, int i2, int i3) {
        if (i3 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i3];
        this.f4825o = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long q = q();
        for (int i4 = 0; i4 < i2; i4++) {
            long j3 = i4 + q;
            P.d(objArr2, j3, objArr[((int) j3) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean s(Object obj) {
        int i2 = this.f5029i;
        int i3 = this.f4822l;
        if (i2 == 0) {
            if (i3 != 0) {
                o(obj);
                int i4 = this.f4827r + 1;
                this.f4827r = i4;
                if (i4 > i3) {
                    n();
                }
                this.q = q() + this.f4827r;
            }
            return true;
        }
        int i5 = this.f4827r;
        int i6 = this.f4823m;
        if (i5 >= i6 && this.q <= this.f4826p) {
            int d3 = AbstractC0837j.d(this.f4824n);
            if (d3 == 0) {
                return false;
            }
            if (d3 == 2) {
                return true;
            }
        }
        o(obj);
        int i7 = this.f4827r + 1;
        this.f4827r = i7;
        if (i7 > i6) {
            n();
        }
        long q = q() + this.f4827r;
        long j3 = this.f4826p;
        if (((int) (q - j3)) > i3) {
            v(j3 + 1, this.q, q() + this.f4827r, q() + this.f4827r + this.f4828s);
        }
        return true;
    }

    public final long t(Q q) {
        long j3 = q.f4832a;
        if (j3 < q() + this.f4827r) {
            return j3;
        }
        if (this.f4823m <= 0 && j3 <= q() && this.f4828s != 0) {
            return j3;
        }
        return -1L;
    }

    public final Object u(Q q) {
        Object obj;
        InterfaceC1073d[] interfaceC1073dArr = AbstractC0364c.f5032a;
        synchronized (this) {
            try {
                long t3 = t(q);
                if (t3 < 0) {
                    obj = P.f4829a;
                } else {
                    long j3 = q.f4832a;
                    Object[] objArr = this.f4825o;
                    z2.h.c(objArr);
                    Object obj2 = objArr[((int) t3) & (objArr.length - 1)];
                    if (obj2 instanceof M) {
                        obj2 = ((M) obj2).f4814j;
                    }
                    q.f4832a = t3 + 1;
                    Object obj3 = obj2;
                    interfaceC1073dArr = w(j3);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1073d interfaceC1073d : interfaceC1073dArr) {
            if (interfaceC1073d != null) {
                interfaceC1073d.t(C0880v.f8657a);
            }
        }
        return obj;
    }

    public final void v(long j3, long j4, long j5, long j6) {
        long min = Math.min(j4, j3);
        for (long q = q(); q < min; q++) {
            Object[] objArr = this.f4825o;
            z2.h.c(objArr);
            P.d(objArr, q, null);
        }
        this.f4826p = j3;
        this.q = j4;
        this.f4827r = (int) (j5 - min);
        this.f4828s = (int) (j6 - j5);
    }

    public final InterfaceC1073d[] w(long j3) {
        long j4;
        long j5;
        InterfaceC1073d[] interfaceC1073dArr;
        long j6;
        AbstractC0365d[] abstractC0365dArr;
        long j7 = this.q;
        InterfaceC1073d[] interfaceC1073dArr2 = AbstractC0364c.f5032a;
        if (j3 > j7) {
            return interfaceC1073dArr2;
        }
        long q = q();
        long j8 = this.f4827r + q;
        int i2 = this.f4823m;
        if (i2 == 0 && this.f4828s > 0) {
            j8++;
        }
        if (this.f5029i != 0 && (abstractC0365dArr = this.f5028h) != null) {
            for (AbstractC0365d abstractC0365d : abstractC0365dArr) {
                if (abstractC0365d != null) {
                    long j9 = ((Q) abstractC0365d).f4832a;
                    if (j9 >= 0 && j9 < j8) {
                        j8 = j9;
                    }
                }
            }
        }
        if (j8 <= this.q) {
            return interfaceC1073dArr2;
        }
        long q3 = q() + this.f4827r;
        int min = this.f5029i > 0 ? Math.min(this.f4828s, i2 - ((int) (q3 - j8))) : this.f4828s;
        long j10 = this.f4828s + q3;
        O2.v vVar = P.f4829a;
        if (min > 0) {
            InterfaceC1073d[] interfaceC1073dArr3 = new InterfaceC1073d[min];
            Object[] objArr = this.f4825o;
            z2.h.c(objArr);
            long j11 = q3;
            int i3 = 0;
            while (true) {
                if (q3 >= j10) {
                    j4 = j8;
                    j5 = j10;
                    break;
                }
                j4 = j8;
                Object obj = objArr[((int) q3) & (objArr.length - 1)];
                if (obj != vVar) {
                    z2.h.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    M m3 = (M) obj;
                    int i4 = i3 + 1;
                    j5 = j10;
                    interfaceC1073dArr3[i3] = m3.f4815k;
                    P.d(objArr, q3, vVar);
                    P.d(objArr, j11, m3.f4814j);
                    j6 = 1;
                    j11++;
                    if (i4 >= min) {
                        break;
                    }
                    i3 = i4;
                } else {
                    j5 = j10;
                    j6 = 1;
                }
                q3 += j6;
                j8 = j4;
                j10 = j5;
            }
            interfaceC1073dArr = interfaceC1073dArr3;
            q3 = j11;
        } else {
            j4 = j8;
            j5 = j10;
            interfaceC1073dArr = interfaceC1073dArr2;
        }
        int i5 = (int) (q3 - q);
        long j12 = this.f5029i == 0 ? q3 : j4;
        long max = Math.max(this.f4826p, q3 - Math.min(this.f4822l, i5));
        if (i2 == 0 && max < j5) {
            Object[] objArr2 = this.f4825o;
            z2.h.c(objArr2);
            if (z2.h.a(objArr2[((int) max) & (objArr2.length - 1)], vVar)) {
                q3++;
                max++;
            }
        }
        v(max, j12, q3, j5);
        l();
        return (interfaceC1073dArr.length == 0) ^ true ? p(interfaceC1073dArr) : interfaceC1073dArr;
    }
}
