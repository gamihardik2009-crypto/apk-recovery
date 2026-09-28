package J;

import C0.C0018a;
import K.C0329a;
import K.C0330b;
import K.C0331c;
import K.C0333e;
import android.os.Trace;
import android.util.SparseArray;
import j.AbstractC0740F;
import j.C0735A;
import j.C0736B;
import j.C0759o;
import j.C0761q;
import j.C0769y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import m2.C0865g;
import n2.AbstractC0967s;

/* renamed from: J.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285q {

    /* renamed from: A, reason: collision with root package name */
    public int f4181A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4182B;

    /* renamed from: C, reason: collision with root package name */
    public final C0281o f4183C;

    /* renamed from: D, reason: collision with root package name */
    public final V0 f4184D;
    public boolean E;
    public D0 F;

    /* renamed from: G, reason: collision with root package name */
    public E0 f4185G;

    /* renamed from: H, reason: collision with root package name */
    public G0 f4186H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f4187I;

    /* renamed from: J, reason: collision with root package name */
    public InterfaceC0282o0 f4188J;

    /* renamed from: K, reason: collision with root package name */
    public C0329a f4189K;

    /* renamed from: L, reason: collision with root package name */
    public final C0330b f4190L;

    /* renamed from: M, reason: collision with root package name */
    public C0255b f4191M;

    /* renamed from: N, reason: collision with root package name */
    public C0331c f4192N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f4193O;

    /* renamed from: P, reason: collision with root package name */
    public int f4194P;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0259d f4195a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0288s f4196b;

    /* renamed from: c, reason: collision with root package name */
    public final E0 f4197c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f4198d;

    /* renamed from: e, reason: collision with root package name */
    public final C0329a f4199e;

    /* renamed from: f, reason: collision with root package name */
    public final C0329a f4200f;

    /* renamed from: g, reason: collision with root package name */
    public final C0294v f4201g;

    /* renamed from: i, reason: collision with root package name */
    public C0280n0 f4203i;

    /* renamed from: j, reason: collision with root package name */
    public int f4204j;

    /* renamed from: k, reason: collision with root package name */
    public int f4205k;

    /* renamed from: l, reason: collision with root package name */
    public int f4206l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f4208n;

    /* renamed from: o, reason: collision with root package name */
    public C0759o f4209o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4210p;
    public boolean q;

    /* renamed from: u, reason: collision with root package name */
    public B.F f4214u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4215v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4217x;

    /* renamed from: z, reason: collision with root package name */
    public int f4219z;

    /* renamed from: h, reason: collision with root package name */
    public final V0 f4202h = new V0(0);

    /* renamed from: m, reason: collision with root package name */
    public final N f4207m = new N();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f4211r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final N f4212s = new N();

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0282o0 f4213t = R.e.f5376k;

    /* renamed from: w, reason: collision with root package name */
    public final N f4216w = new N();

    /* renamed from: y, reason: collision with root package name */
    public int f4218y = -1;

    public C0285q(t0.r0 r0Var, AbstractC0288s abstractC0288s, E0 e02, C0735A c0735a, C0329a c0329a, C0329a c0329a2, C0294v c0294v) {
        this.f4195a = r0Var;
        this.f4196b = abstractC0288s;
        this.f4197c = e02;
        this.f4198d = c0735a;
        this.f4199e = c0329a;
        this.f4200f = c0329a2;
        this.f4201g = c0294v;
        this.f4182B = abstractC0288s.e() || abstractC0288s.c();
        this.f4183C = new C0281o(0, this);
        this.f4184D = new V0(0);
        D0 e3 = e02.e();
        e3.c();
        this.F = e3;
        E0 e03 = new E0();
        if (abstractC0288s.e()) {
            e03.b();
        }
        if (abstractC0288s.c()) {
            e03.q = new C0761q();
        }
        this.f4185G = e03;
        G0 f3 = e03.f();
        f3.e(true);
        this.f4186H = f3;
        this.f4190L = new C0330b(this, c0329a);
        D0 e4 = this.f4185G.e();
        try {
            C0255b a3 = e4.a(0);
            e4.c();
            this.f4191M = a3;
            this.f4192N = new C0331c();
        } catch (Throwable th) {
            e4.c();
            throw th;
        }
    }

    public static final int M(C0285q c0285q, int i2, boolean z3, int i3) {
        D0 d02 = c0285q.F;
        int[] iArr = d02.f3980b;
        int i4 = i2 * 5;
        if (!((iArr[i4 + 1] & 134217728) != 0)) {
            if (!C0257c.h(iArr, i2)) {
                if (C0257c.m(iArr, i2)) {
                    return 1;
                }
                return C0257c.o(iArr, i2);
            }
            int i5 = iArr[i4 + 3] + i2;
            int i6 = 0;
            for (int i7 = i2 + 1; i7 < i5; i7 += iArr[(i7 * 5) + 3]) {
                boolean m3 = C0257c.m(iArr, i7);
                C0330b c0330b = c0285q.f4190L;
                if (m3) {
                    c0330b.g();
                    Object i8 = d02.i(i7);
                    c0330b.g();
                    c0330b.f4465h.f4104h.add(i8);
                }
                i6 += M(c0285q, i7, m3 || z3, m3 ? 0 : i3 + i6);
                if (m3) {
                    c0330b.g();
                    c0330b.e();
                }
            }
            if (C0257c.m(iArr, i2)) {
                return 1;
            }
            return i6;
        }
        int i9 = iArr[i4];
        Object j3 = d02.j(iArr, i2);
        if (i9 != 206 || !z2.h.a(j3, C0257c.f4123e)) {
            if (C0257c.m(iArr, i2)) {
                return 1;
            }
            return C0257c.o(iArr, i2);
        }
        Object g3 = d02.g(i2, 0);
        C0277m c0277m = g3 instanceof C0277m ? (C0277m) g3 : null;
        if (c0277m != null) {
            for (C0285q c0285q2 : c0277m.f4156h.f4164e) {
                C0330b c0330b2 = c0285q2.f4190L;
                E0 e02 = c0285q2.f4197c;
                if (e02.f3999i > 0 && C0257c.h(e02.f3998h, 0)) {
                    C0329a c0329a = new C0329a();
                    c0285q2.f4189K = c0329a;
                    D0 e3 = e02.e();
                    try {
                        c0285q2.F = e3;
                        C0329a c0329a2 = c0330b2.f4459b;
                        try {
                            c0330b2.f4459b = c0329a;
                            c0285q2.L(0);
                            c0330b2.f();
                            if (c0330b2.f4460c) {
                                C0329a c0329a3 = c0330b2.f4459b;
                                c0329a3.getClass();
                                c0329a3.f4457h.O(K.A.f4441c);
                                if (c0330b2.f4460c) {
                                    c0330b2.h(false);
                                    c0330b2.h(false);
                                    C0329a c0329a4 = c0330b2.f4459b;
                                    c0329a4.getClass();
                                    c0329a4.f4457h.O(K.m.f4481c);
                                    c0330b2.f4460c = false;
                                }
                            }
                            c0330b2.f4459b = c0329a2;
                        } catch (Throwable th) {
                            c0330b2.f4459b = c0329a2;
                            throw th;
                        }
                    } finally {
                        e3.c();
                    }
                }
                c0285q.f4196b.m(c0285q2.f4201g);
            }
        }
        return C0257c.o(iArr, i2);
    }

    public static final void b(C0285q c0285q, InterfaceC0282o0 interfaceC0282o0, Object obj) {
        c0285q.Q(126665345, 0, null, null);
        c0285q.C();
        c0285q.f0(obj);
        int i2 = c0285q.f4194P;
        try {
            c0285q.f4194P = 126665345;
            if (c0285q.f4193O) {
                G0.u(c0285q.f4186H);
            }
            boolean z3 = (c0285q.f4193O || z2.h.a(c0285q.F.e(), interfaceC0282o0)) ? false : true;
            if (z3) {
                c0285q.I(interfaceC0282o0);
            }
            c0285q.Q(202, 0, C0257c.f4121c, interfaceC0282o0);
            c0285q.f4188J = null;
            boolean z4 = c0285q.f4215v;
            c0285q.f4215v = z3;
            C0257c.J(c0285q, new R.a(316014703, new C0018a(3, obj), true));
            c0285q.f4215v = z4;
            c0285q.r(false);
            c0285q.f4188J = null;
            c0285q.f4194P = i2;
            c0285q.r(false);
        } catch (Throwable th) {
            c0285q.r(false);
            c0285q.f4188J = null;
            c0285q.f4194P = i2;
            c0285q.r(false);
            throw th;
        }
    }

    public final boolean A() {
        C0291t0 y3;
        return (this.f4193O || this.f4217x || this.f4215v || (y3 = y()) == null || (y3.f4232a & 8) != 0) ? false : true;
    }

    public final void B(ArrayList arrayList) {
        C0329a c0329a = this.f4200f;
        C0330b c0330b = this.f4190L;
        C0329a c0329a2 = c0330b.f4459b;
        try {
            c0330b.f4459b = c0329a;
            c0329a.getClass();
            c0329a.f4457h.O(K.y.f4497c);
            if (arrayList.size() <= 0) {
                C0329a c0329a3 = c0330b.f4459b;
                c0329a3.getClass();
                c0329a3.f4457h.O(K.n.f4482c);
                c0330b.f4463f = 0;
                return;
            }
            C0865g c0865g = (C0865g) arrayList.get(0);
            AbstractC0254a0 abstractC0254a0 = (AbstractC0254a0) c0865g.f8646h;
            abstractC0254a0.getClass();
            abstractC0254a0.getClass();
            throw null;
        } finally {
            c0330b.f4459b = c0329a2;
        }
    }

    public final Object C() {
        boolean z3 = this.f4193O;
        W w2 = C0275l.f4150a;
        if (z3) {
            i0();
            return w2;
        }
        Object h2 = this.F.h();
        return (!this.f4217x || (h2 instanceof C0277m)) ? h2 : w2;
    }

    public final int D(int i2) {
        int p3 = C0257c.p(this.F.f3980b, i2) + 1;
        int i3 = 0;
        while (p3 < i2) {
            if (!C0257c.l(this.F.f3980b, p3)) {
                i3++;
            }
            p3 += C0257c.j(this.F.f3980b, p3);
        }
        return i3;
    }

    public final boolean E(B.F f3) {
        C0329a c0329a = this.f4199e;
        if (!c0329a.f4457h.L()) {
            C0257c.y("Expected applyChanges() to have been called");
            throw null;
        }
        if (((C0769y) f3.f165i).f8069e <= 0 && !(!this.f4211r.isEmpty())) {
            return false;
        }
        p(f3, null);
        return c0329a.f4457h.M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(J.C0294v r9, J.C0294v r10, java.lang.Integer r11, java.util.List r12, y2.a r13) {
        /*
            r8 = this;
            boolean r0 = r8.E
            int r1 = r8.f4204j
            r2 = 1
            r8.E = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.f4204j = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            m2.g r6 = (m2.C0865g) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.f8646h     // Catch: java.lang.Throwable -> L24
            J.t0 r7 = (J.C0291t0) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.f8647i     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.a0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.a0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L53
            boolean r12 = z2.h.a(r10, r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L53
            if (r11 < 0) goto L53
            r9.f4270w = r10     // Catch: java.lang.Throwable -> L24
            r9.f4271x = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.c()     // Catch: java.lang.Throwable -> L4d
            r9.f4270w = r5     // Catch: java.lang.Throwable -> L24
            r9.f4271x = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.f4270w = r5     // Catch: java.lang.Throwable -> L24
            r9.f4271x = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.c()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.c()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.E = r0
            r8.f4204j = r1
            return r10
        L62:
            r8.E = r0
            r8.f4204j = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0285q.F(J.v, J.v, java.lang.Integer, java.util.List, y2.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r10.f4060b < r3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0082, code lost:
    
        if (J.C0291t0.a((J.F) r12, r11) != false) goto L20;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0285q.G():void");
    }

    public final void H() {
        L(this.F.f3985g);
        C0330b c0330b = this.f4190L;
        c0330b.h(false);
        C0285q c0285q = c0330b.f4458a;
        D0 d02 = c0285q.F;
        if (d02.f3981c > 0) {
            int i2 = d02.f3987i;
            N n3 = c0330b.f4461d;
            int i3 = n3.f4054b;
            if ((i3 > 0 ? n3.f4053a[i3 - 1] : -2) != i2) {
                if (!c0330b.f4460c && c0330b.f4462e) {
                    c0330b.h(false);
                    C0329a c0329a = c0330b.f4459b;
                    c0329a.getClass();
                    c0329a.f4457h.O(K.p.f4484c);
                    c0330b.f4460c = true;
                }
                if (i2 > 0) {
                    C0255b a3 = d02.a(i2);
                    n3.b(i2);
                    c0330b.h(false);
                    C0329a c0329a2 = c0330b.f4459b;
                    c0329a2.getClass();
                    K.o oVar = K.o.f4483c;
                    K.H h2 = c0329a2.f4457h;
                    h2.P(oVar);
                    B1.C.k0(h2, 0, a3);
                    int i4 = h2.f4455n;
                    int i5 = oVar.f4447a;
                    int I3 = K.H.I(h2, i5);
                    int i6 = oVar.f4448b;
                    if (i4 != I3 || h2.f4456o != K.H.I(h2, i6)) {
                        StringBuilder sb = new StringBuilder();
                        int i7 = 0;
                        for (int i8 = 0; i8 < i5; i8++) {
                            if (((1 << i8) & h2.f4455n) != 0) {
                                if (i7 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(oVar.b(i8));
                                i7++;
                            }
                        }
                        String sb2 = sb.toString();
                        StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
                        int i9 = 0;
                        for (int i10 = 0; i10 < i6; i10++) {
                            if (((1 << i10) & h2.f4456o) != 0) {
                                if (i7 > 0) {
                                    m3.append(", ");
                                }
                                m3.append(oVar.c(i10));
                                i9++;
                            }
                        }
                        String sb3 = m3.toString();
                        z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                        sb4.append(oVar);
                        sb4.append(". Not all arguments were provided. Missing ");
                        B1.t.x(sb4, i7, " int arguments (", sb2, ") and ");
                        B1.t.z(sb4, i9, " object arguments (", sb3, ").");
                        throw null;
                    }
                    c0330b.f4460c = true;
                }
            }
        }
        C0329a c0329a3 = c0330b.f4459b;
        c0329a3.getClass();
        c0329a3.f4457h.O(K.w.f4495c);
        int i11 = c0330b.f4463f;
        D0 d03 = c0285q.F;
        c0330b.f4463f = C0257c.j(d03.f3980b, d03.f3985g) + i11;
    }

    public final void I(InterfaceC0282o0 interfaceC0282o0) {
        B.F f3 = this.f4214u;
        if (f3 == null) {
            f3 = new B.F(9);
            this.f4214u = f3;
        }
        ((SparseArray) f3.f165i).put(this.F.f3985g, interfaceC0282o0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(int r8, int r9, int r10) {
        /*
            r7 = this;
            J.D0 r0 = r7.F
            if (r8 != r9) goto L7
        L4:
            r10 = r8
            goto L79
        L7:
            if (r8 == r10) goto L79
            if (r9 != r10) goto Ld
            goto L79
        Ld:
            int[] r1 = r0.f3980b
            int r1 = J.C0257c.p(r1, r8)
            if (r1 != r9) goto L18
            r10 = r9
            goto L79
        L18:
            int[] r1 = r0.f3980b
            int r2 = J.C0257c.p(r1, r9)
            if (r2 != r8) goto L21
            goto L4
        L21:
            int r2 = r8 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            int r3 = r9 * 5
            int r3 = r3 + 2
            r3 = r1[r3]
            if (r2 != r3) goto L31
            r10 = r2
            goto L79
        L31:
            r2 = 0
            r3 = r8
            r4 = r2
        L34:
            if (r3 <= 0) goto L3f
            if (r3 == r10) goto L3f
            int r3 = J.C0257c.p(r1, r3)
            int r4 = r4 + 1
            goto L34
        L3f:
            r3 = r9
            r5 = r2
        L41:
            if (r3 <= 0) goto L4c
            if (r3 == r10) goto L4c
            int r3 = J.C0257c.p(r1, r3)
            int r5 = r5 + 1
            goto L41
        L4c:
            int r10 = r4 - r5
            r6 = r8
            r3 = r2
        L50:
            if (r3 >= r10) goto L5b
            int r6 = r6 * 5
            int r6 = r6 + 2
            r6 = r1[r6]
            int r3 = r3 + 1
            goto L50
        L5b:
            int r5 = r5 - r4
            r10 = r9
        L5d:
            if (r2 >= r5) goto L68
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 + 1
            goto L5d
        L68:
            r2 = r10
            r10 = r6
        L6a:
            if (r10 == r2) goto L79
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            goto L6a
        L79:
            if (r8 <= 0) goto L91
            if (r8 == r10) goto L91
            int[] r1 = r0.f3980b
            boolean r1 = J.C0257c.m(r1, r8)
            if (r1 == 0) goto L8a
            K.b r1 = r7.f4190L
            r1.e()
        L8a:
            int[] r1 = r0.f3980b
            int r8 = J.C0257c.p(r1, r8)
            goto L79
        L91:
            r7.q(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0285q.J(int, int, int):void");
    }

    public final Object K() {
        boolean z3 = this.f4193O;
        W w2 = C0275l.f4150a;
        if (z3) {
            i0();
            return w2;
        }
        Object h2 = this.F.h();
        return (!this.f4217x || (h2 instanceof C0277m)) ? h2 instanceof B0 ? ((B0) h2).f3969a : h2 : w2;
    }

    public final void L(int i2) {
        M(this, i2, false, 0);
        this.f4190L.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() {
        /*
            r12 = this;
            java.util.ArrayList r0 = r12.f4211r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            int r0 = r12.f4205k
            J.D0 r1 = r12.F
            int r1 = r1.l()
            int r1 = r1 + r0
            r12.f4205k = r1
            goto Ldf
        L15:
            J.D0 r0 = r12.F
            int r1 = r0.f()
            int r2 = r0.f3985g
            int r3 = r0.f3986h
            r4 = 0
            int[] r5 = r0.f3980b
            if (r2 >= r3) goto L29
            java.lang.Object r2 = r0.j(r5, r2)
            goto L2a
        L29:
            r2 = r4
        L2a:
            java.lang.Object r3 = r0.e()
            int r6 = r12.f4206l
            J.W r7 = J.C0275l.f4150a
            r8 = 207(0xcf, float:2.9E-43)
            r9 = 3
            if (r2 != 0) goto L63
            if (r3 == 0) goto L54
            if (r1 != r8) goto L54
            boolean r10 = z2.h.a(r3, r7)
            if (r10 != 0) goto L54
            int r10 = r3.hashCode()
            int r11 = r12.f4194P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
            r12.f4194P = r10
            goto L7f
        L54:
            int r10 = r12.f4194P
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r1
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
        L60:
            r12.f4194P = r10
            goto L7f
        L63:
            boolean r10 = r2 instanceof java.lang.Enum
            if (r10 == 0) goto L7a
            r10 = r2
            java.lang.Enum r10 = (java.lang.Enum) r10
            int r10 = r10.ordinal()
        L6e:
            int r11 = r12.f4194P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            goto L60
        L7a:
            int r10 = r2.hashCode()
            goto L6e
        L7f:
            int r10 = r0.f3985g
            boolean r5 = J.C0257c.m(r5, r10)
            r12.T(r4, r5)
            r12.G()
            r0.d()
            if (r2 != 0) goto Lc4
            if (r3 == 0) goto Lb1
            if (r1 != r8) goto Lb1
            boolean r0 = z2.h.a(r3, r7)
            if (r0 != 0) goto Lb1
            int r0 = r3.hashCode()
            int r1 = r12.f4194P
            r1 = r1 ^ r6
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f4194P = r0
            goto Ldf
        Lb1:
            int r0 = r12.f4194P
            r0 = r0 ^ r6
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
        Lbd:
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f4194P = r0
            goto Ldf
        Lc4:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Lda
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
        Lce:
            int r1 = r12.f4194P
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            goto Lbd
        Lda:
            int r0 = r2.hashCode()
            goto Lce
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0285q.N():void");
    }

    public final void O() {
        D0 d02 = this.F;
        int i2 = d02.f3987i;
        this.f4205k = i2 >= 0 ? C0257c.o(d02.f3980b, i2) : 0;
        this.F.m();
    }

    public final void P() {
        if (this.f4205k != 0) {
            C0257c.y("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        C0291t0 y3 = y();
        if (y3 != null) {
            y3.f4232a |= 16;
        }
        if (this.f4211r.isEmpty()) {
            O();
        } else {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(int r27, int r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0285q.Q(int, int, java.lang.Object, java.lang.Object):void");
    }

    public final void R() {
        Q(-127, 0, null, null);
    }

    public final void S(int i2, C0262e0 c0262e0) {
        Q(i2, 0, c0262e0, null);
    }

    public final void T(Object obj, boolean z3) {
        if (z3) {
            D0 d02 = this.F;
            if (d02.f3989k <= 0) {
                if (C0257c.m(d02.f3980b, d02.f3985g)) {
                    d02.n();
                    return;
                } else {
                    C0257c.W("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.F.e() != obj) {
            C0330b c0330b = this.f4190L;
            c0330b.getClass();
            c0330b.h(false);
            C0329a c0329a = c0330b.f4459b;
            c0329a.getClass();
            K.C c3 = K.C.f4443c;
            K.H h2 = c0329a.f4457h;
            h2.P(c3);
            B1.C.k0(h2, 0, obj);
            int i2 = h2.f4455n;
            int i3 = c3.f4447a;
            int I3 = K.H.I(h2, i3);
            int i4 = c3.f4448b;
            if (i2 != I3 || h2.f4456o != K.H.I(h2, i4)) {
                StringBuilder sb = new StringBuilder();
                int i5 = 0;
                for (int i6 = 0; i6 < i3; i6++) {
                    if (((1 << i6) & h2.f4455n) != 0) {
                        if (i5 > 0) {
                            sb.append(", ");
                        }
                        sb.append(c3.b(i6));
                        i5++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
                int i7 = 0;
                for (int i8 = 0; i8 < i4; i8++) {
                    if (((1 << i8) & h2.f4456o) != 0) {
                        if (i5 > 0) {
                            m3.append(", ");
                        }
                        m3.append(c3.c(i8));
                        i7++;
                    }
                }
                String sb3 = m3.toString();
                z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(c3);
                sb4.append(". Not all arguments were provided. Missing ");
                B1.t.x(sb4, i5, " int arguments (", sb2, ") and ");
                B1.t.z(sb4, i7, " object arguments (", sb3, ").");
                throw null;
            }
        }
        this.F.n();
    }

    public final void U(int i2) {
        int i3;
        int i4;
        if (this.f4203i != null) {
            Q(i2, 0, null, null);
            return;
        }
        i0();
        this.f4194P = this.f4206l ^ Integer.rotateLeft(Integer.rotateLeft(this.f4194P, 3) ^ i2, 3);
        this.f4206l++;
        D0 d02 = this.F;
        boolean z3 = this.f4193O;
        W w2 = C0275l.f4150a;
        if (z3) {
            d02.f3989k++;
            this.f4186H.K(i2, w2, w2, false);
            w(false, null);
            return;
        }
        if (d02.f() == i2 && ((i4 = d02.f3985g) >= d02.f3986h || !C0257c.l(d02.f3980b, i4))) {
            d02.n();
            w(false, null);
            return;
        }
        if (d02.f3989k <= 0 && (i3 = d02.f3985g) != d02.f3986h) {
            int i5 = this.f4204j;
            H();
            this.f4190L.i(i5, d02.l());
            C0257c.q(this.f4211r, i3, d02.f3985g);
        }
        d02.f3989k++;
        this.f4193O = true;
        this.f4188J = null;
        if (this.f4186H.f4035v) {
            G0 f3 = this.f4185G.f();
            this.f4186H = f3;
            f3.F();
            this.f4187I = false;
            this.f4188J = null;
        }
        G0 g02 = this.f4186H;
        g02.d();
        int i6 = g02.f4032s;
        g02.K(i2, w2, w2, false);
        this.f4191M = g02.b(i6);
        w(false, null);
    }

    public final void V(int i2) {
        Q(i2, 0, null, null);
    }

    public final C0285q W(int i2) {
        C0291t0 c0291t0;
        U(i2);
        boolean z3 = this.f4193O;
        V0 v0 = this.f4184D;
        C0294v c0294v = this.f4201g;
        if (z3) {
            z2.h.d(c0294v, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            C0291t0 c0291t02 = new C0291t0(c0294v);
            v0.f4104h.add(c0291t02);
            f0(c0291t02);
            c0291t02.f4236e = this.f4181A;
            c0291t02.f4232a &= -17;
        } else {
            ArrayList arrayList = this.f4211r;
            int G3 = C0257c.G(this.F.f3987i, arrayList);
            O o3 = G3 >= 0 ? (O) arrayList.remove(G3) : null;
            Object h2 = this.F.h();
            if (z2.h.a(h2, C0275l.f4150a)) {
                z2.h.d(c0294v, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                c0291t0 = new C0291t0(c0294v);
                f0(c0291t0);
            } else {
                z2.h.d(h2, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                c0291t0 = (C0291t0) h2;
            }
            if (o3 == null) {
                int i3 = c0291t0.f4232a;
                boolean z4 = (i3 & 64) != 0;
                if (z4) {
                    c0291t0.f4232a = i3 & (-65);
                }
                if (!z4) {
                    c0291t0.f4232a &= -9;
                    v0.f4104h.add(c0291t0);
                    c0291t0.f4236e = this.f4181A;
                    c0291t0.f4232a &= -17;
                }
            }
            c0291t0.f4232a |= 8;
            v0.f4104h.add(c0291t0);
            c0291t0.f4236e = this.f4181A;
            c0291t0.f4232a &= -17;
        }
        return this;
    }

    public final void X(Object obj) {
        if (!this.f4193O && this.F.f() == 207 && !z2.h.a(this.F.e(), obj) && this.f4218y < 0) {
            this.f4218y = this.F.f3985g;
            this.f4217x = true;
        }
        Q(207, 0, null, obj);
    }

    public final void Y() {
        Q(125, 2, null, null);
        this.q = true;
    }

    public final void Z() {
        this.f4206l = 0;
        E0 e02 = this.f4197c;
        this.F = e02.e();
        Q(100, 0, null, null);
        AbstractC0288s abstractC0288s = this.f4196b;
        abstractC0288s.n();
        this.f4213t = abstractC0288s.f();
        this.f4216w.b(this.f4215v ? 1 : 0);
        this.f4215v = g(this.f4213t);
        this.f4188J = null;
        if (!this.f4210p) {
            this.f4210p = abstractC0288s.d();
        }
        if (!this.f4182B) {
            this.f4182B = abstractC0288s.e();
        }
        Set set = (Set) C0257c.P(this.f4213t, U.b.f5775a);
        if (set != null) {
            set.add(e02);
            abstractC0288s.k(set);
        }
        Q(abstractC0288s.g(), 0, null, null);
    }

    public final void a() {
        j();
        this.f4202h.f4104h.clear();
        this.f4207m.f4054b = 0;
        this.f4212s.f4054b = 0;
        this.f4216w.f4054b = 0;
        this.f4214u = null;
        C0331c c0331c = this.f4192N;
        c0331c.f4471i.J();
        c0331c.f4470h.J();
        this.f4194P = 0;
        this.f4219z = 0;
        this.q = false;
        this.f4193O = false;
        this.f4217x = false;
        this.E = false;
        this.f4218y = -1;
        D0 d02 = this.F;
        if (!d02.f3984f) {
            d02.c();
        }
        if (this.f4186H.f4035v) {
            return;
        }
        x();
    }

    public final boolean a0(C0291t0 c0291t0, Object obj) {
        C0255b c0255b = c0291t0.f4234c;
        if (c0255b == null) {
            return false;
        }
        int a3 = this.F.f3979a.a(c0255b);
        if (!this.E || a3 < this.F.f3985g) {
            return false;
        }
        ArrayList arrayList = this.f4211r;
        int G3 = C0257c.G(a3, arrayList);
        if (G3 < 0) {
            int i2 = -(G3 + 1);
            if (!(obj instanceof F)) {
                obj = null;
            }
            arrayList.add(i2, new O(c0291t0, a3, obj));
        } else {
            O o3 = (O) arrayList.get(G3);
            if (obj instanceof F) {
                Object obj2 = o3.f4061c;
                if (obj2 == null) {
                    o3.f4061c = obj;
                } else if (obj2 instanceof C0736B) {
                    ((C0736B) obj2).a(obj);
                } else {
                    int i3 = AbstractC0740F.f7972a;
                    C0736B c0736b = new C0736B(2);
                    c0736b.f7965b[c0736b.d(obj2)] = obj2;
                    c0736b.f7965b[c0736b.d(obj)] = obj;
                    o3.f4061c = c0736b;
                }
            } else {
                o3.f4061c = null;
            }
        }
        return true;
    }

    public final void b0(int i2, int i3) {
        if (g0(i2) != i3) {
            if (i2 < 0) {
                C0759o c0759o = this.f4209o;
                if (c0759o == null) {
                    c0759o = new C0759o();
                    this.f4209o = c0759o;
                }
                c0759o.f(i2, i3);
                return;
            }
            int[] iArr = this.f4208n;
            if (iArr == null) {
                int i4 = this.F.f3981c;
                int[] iArr2 = new int[i4];
                Arrays.fill(iArr2, 0, i4, -1);
                this.f4208n = iArr2;
                iArr = iArr2;
            }
            iArr[i2] = i3;
        }
    }

    public final void c(Object obj, y2.e eVar) {
        int i2 = 0;
        if (this.f4193O) {
            C0331c c0331c = this.f4192N;
            c0331c.getClass();
            K.D d3 = K.D.f4444c;
            K.H h2 = c0331c.f4470h;
            h2.P(d3);
            B1.C.k0(h2, 0, obj);
            z2.h.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            z2.v.d(2, eVar);
            B1.C.k0(h2, 1, eVar);
            int i3 = h2.f4455n;
            int i4 = d3.f4447a;
            int I3 = K.H.I(h2, i4);
            int i5 = d3.f4448b;
            if (i3 == I3 && h2.f4456o == K.H.I(h2, i5)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            while (i6 < i4) {
                int i7 = i4;
                if (((1 << i6) & h2.f4455n) != 0) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(d3.b(i6));
                    i2++;
                }
                i6++;
                i4 = i7;
            }
            String sb2 = sb.toString();
            StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
            int i8 = 0;
            int i9 = 0;
            while (i9 < i5) {
                int i10 = i5;
                if (((1 << i9) & h2.f4456o) != 0) {
                    if (i2 > 0) {
                        m3.append(", ");
                    }
                    m3.append(d3.c(i9));
                    i8++;
                }
                i9++;
                i5 = i10;
            }
            String sb3 = m3.toString();
            z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(d3);
            sb4.append(". Not all arguments were provided. Missing ");
            B1.t.x(sb4, i2, " int arguments (", sb2, ") and ");
            B1.t.z(sb4, i8, " object arguments (", sb3, ").");
            throw null;
        }
        C0330b c0330b = this.f4190L;
        c0330b.f();
        C0329a c0329a = c0330b.f4459b;
        c0329a.getClass();
        K.D d4 = K.D.f4444c;
        K.H h3 = c0329a.f4457h;
        h3.P(d4);
        int i11 = 0;
        B1.C.k0(h3, 0, obj);
        z2.h.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        z2.v.d(2, eVar);
        B1.C.k0(h3, 1, eVar);
        int i12 = h3.f4455n;
        int i13 = d4.f4447a;
        int I4 = K.H.I(h3, i13);
        int i14 = d4.f4448b;
        if (i12 == I4 && h3.f4456o == K.H.I(h3, i14)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        for (int i15 = 0; i15 < i13; i15++) {
            if (((1 << i15) & h3.f4455n) != 0) {
                if (i11 > 0) {
                    sb5.append(", ");
                }
                sb5.append(d4.b(i15));
                i11++;
            }
        }
        String sb6 = sb5.toString();
        StringBuilder m4 = B1.t.m(sb6, "StringBuilder().apply(builderAction).toString()");
        int i16 = 0;
        int i17 = 0;
        while (i16 < i14) {
            int i18 = i14;
            if (((1 << i16) & h3.f4456o) != 0) {
                if (i11 > 0) {
                    m4.append(", ");
                }
                m4.append(d4.c(i16));
                i17++;
            }
            i16++;
            i14 = i18;
        }
        String sb7 = m4.toString();
        z2.h.e(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(d4);
        sb8.append(". Not all arguments were provided. Missing ");
        B1.t.x(sb8, i11, " int arguments (", sb6, ") and ");
        B1.t.z(sb8, i17, " object arguments (", sb7, ").");
        throw null;
    }

    public final void c0(int i2, int i3) {
        int g02 = g0(i2);
        if (g02 != i3) {
            int i4 = i3 - g02;
            V0 v0 = this.f4202h;
            int size = v0.f4104h.size() - 1;
            while (i2 != -1) {
                int g03 = g0(i2) + i4;
                b0(i2, g03);
                int i5 = size;
                while (true) {
                    if (-1 < i5) {
                        C0280n0 c0280n0 = (C0280n0) v0.f4104h.get(i5);
                        if (c0280n0 != null && c0280n0.a(i2, g03)) {
                            size = i5 - 1;
                            break;
                        }
                        i5--;
                    } else {
                        break;
                    }
                }
                if (i2 < 0) {
                    i2 = this.F.f3987i;
                } else if (C0257c.m(this.F.f3980b, i2)) {
                    return;
                } else {
                    i2 = C0257c.p(this.F.f3980b, i2);
                }
            }
        }
    }

    public final boolean d(float f3) {
        Object C3 = C();
        if ((C3 instanceof Float) && f3 == ((Number) C3).floatValue()) {
            return false;
        }
        f0(Float.valueOf(f3));
        return true;
    }

    public final R.e d0(InterfaceC0282o0 interfaceC0282o0, R.e eVar) {
        R.e eVar2 = (R.e) interfaceC0282o0;
        eVar2.getClass();
        R.d dVar = new R.d(eVar2);
        dVar.f5375n = eVar2;
        dVar.putAll(eVar);
        R.e c3 = dVar.c();
        S(204, C0257c.f4122d);
        C();
        f0(c3);
        C();
        f0(eVar);
        r(false);
        return c3;
    }

    public final boolean e(int i2) {
        Object C3 = C();
        if ((C3 instanceof Integer) && i2 == ((Number) C3).intValue()) {
            return false;
        }
        f0(Integer.valueOf(i2));
        return true;
    }

    public final void e0(Object obj) {
        int i2;
        D0 d02;
        int i3;
        G0 g02;
        if (obj instanceof A0) {
            C0255b c0255b = null;
            if (this.f4193O) {
                C0329a c0329a = this.f4190L.f4459b;
                c0329a.getClass();
                K.v vVar = K.v.f4494c;
                K.H h2 = c0329a.f4457h;
                h2.P(vVar);
                B1.C.k0(h2, 0, (A0) obj);
                int i4 = h2.f4455n;
                int i5 = vVar.f4447a;
                int I3 = K.H.I(h2, i5);
                int i6 = vVar.f4448b;
                if (i4 != I3 || h2.f4456o != K.H.I(h2, i6)) {
                    StringBuilder sb = new StringBuilder();
                    int i7 = 0;
                    for (int i8 = 0; i8 < i5; i8++) {
                        if (((1 << i8) & h2.f4455n) != 0) {
                            if (i7 > 0) {
                                sb.append(", ");
                            }
                            sb.append(vVar.b(i8));
                            i7++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i9 = 0;
                    for (int i10 = 0; i10 < i6; i10++) {
                        if (((1 << i10) & h2.f4456o) != 0) {
                            if (i7 > 0) {
                                m3.append(", ");
                            }
                            m3.append(vVar.c(i10));
                            i9++;
                        }
                    }
                    String sb3 = m3.toString();
                    z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(vVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    B1.t.x(sb4, i7, " int arguments (", sb2, ") and ");
                    B1.t.z(sb4, i9, " object arguments (", sb3, ").");
                    throw null;
                }
            }
            this.f4198d.add(obj);
            A0 a02 = (A0) obj;
            if (this.f4193O) {
                G0 g03 = this.f4186H;
                int i11 = g03.f4032s;
                if (i11 > g03.f4034u + 1) {
                    int i12 = i11 - 1;
                    int z3 = g03.z(g03.f4016b, i12);
                    while (true) {
                        i3 = i12;
                        i12 = z3;
                        g02 = this.f4186H;
                        if (i12 == g02.f4034u || i12 < 0) {
                            break;
                        } else {
                            z3 = g02.z(g02.f4016b, i12);
                        }
                    }
                    c0255b = g02.b(i3);
                }
            } else {
                D0 d03 = this.F;
                int i13 = d03.f3985g;
                if (i13 > d03.f3987i + 1) {
                    int i14 = i13 - 1;
                    int p3 = C0257c.p(d03.f3980b, i14);
                    while (true) {
                        i2 = i14;
                        i14 = p3;
                        d02 = this.F;
                        if (i14 == d02.f3987i || i14 < 0) {
                            break;
                        } else {
                            p3 = C0257c.p(d02.f3980b, i14);
                        }
                    }
                    c0255b = d02.a(i2);
                }
            }
            B0 b02 = new B0();
            b02.f3969a = a02;
            b02.f3970b = c0255b;
            obj = b02;
        }
        f0(obj);
    }

    public final boolean f(long j3) {
        Object C3 = C();
        if ((C3 instanceof Long) && j3 == ((Number) C3).longValue()) {
            return false;
        }
        f0(Long.valueOf(j3));
        return true;
    }

    public final void f0(Object obj) {
        int i2;
        int i3;
        if (this.f4193O) {
            this.f4186H.M(obj);
            return;
        }
        D0 d02 = this.F;
        boolean z3 = d02.f3992n;
        int i4 = 1;
        C0330b c0330b = this.f4190L;
        if (!z3) {
            C0255b a3 = d02.a(d02.f3987i);
            C0329a c0329a = c0330b.f4459b;
            c0329a.getClass();
            C0333e c0333e = C0333e.f4473c;
            K.H h2 = c0329a.f4457h;
            h2.P(c0333e);
            int i5 = 0;
            B1.C.k0(h2, 0, a3);
            B1.C.k0(h2, 1, obj);
            int i6 = h2.f4455n;
            int i7 = c0333e.f4447a;
            int I3 = K.H.I(h2, i7);
            int i8 = c0333e.f4448b;
            if (i6 == I3 && h2.f4456o == K.H.I(h2, i8)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i9 = 0;
            while (i9 < i7) {
                if (((i4 << i9) & h2.f4455n) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0333e.b(i9));
                    i5++;
                }
                i9++;
                i4 = 1;
            }
            String sb2 = sb.toString();
            StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8) {
                int i12 = i8;
                if (((1 << i10) & h2.f4456o) != 0) {
                    if (i5 > 0) {
                        m3.append(", ");
                    }
                    m3.append(c0333e.c(i10));
                    i11++;
                }
                i10++;
                i8 = i12;
            }
            String sb3 = m3.toString();
            z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(c0333e);
            sb4.append(". Not all arguments were provided. Missing ");
            B1.t.x(sb4, i5, " int arguments (", sb2, ") and ");
            B1.t.z(sb4, i11, " object arguments (", sb3, ").");
            throw null;
        }
        int r3 = (d02.f3990l - C0257c.r(d02.f3980b, d02.f3987i)) - 1;
        if (c0330b.f4458a.F.f3987i - c0330b.f4463f >= 0) {
            c0330b.h(true);
            C0329a c0329a2 = c0330b.f4459b;
            K.q qVar = K.q.f4488g;
            K.H h3 = c0329a2.f4457h;
            h3.P(qVar);
            B1.C.k0(h3, 0, obj);
            B1.C.j0(h3, 0, r3);
            if (h3.f4455n == K.H.I(h3, 1) && h3.f4456o == K.H.I(h3, 1)) {
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            if ((h3.f4455n & 1) != 0) {
                sb5.append(qVar.b(0));
                i2 = 1;
            } else {
                i2 = 0;
            }
            String sb6 = sb5.toString();
            StringBuilder m4 = B1.t.m(sb6, "StringBuilder().apply(builderAction).toString()");
            if ((h3.f4456o & 1) != 0) {
                if (i2 > 0) {
                    m4.append(", ");
                }
                m4.append(qVar.c(0));
            } else {
                i4 = 0;
            }
            String sb7 = m4.toString();
            z2.h.e(sb7, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb8 = new StringBuilder("Error while pushing ");
            sb8.append(qVar);
            sb8.append(". Not all arguments were provided. Missing ");
            B1.t.x(sb8, i2, " int arguments (", sb6, ") and ");
            B1.t.z(sb8, i4, " object arguments (", sb7, ").");
            throw null;
        }
        D0 d03 = this.F;
        C0255b a4 = d03.a(d03.f3987i);
        C0329a c0329a3 = c0330b.f4459b;
        K.q qVar2 = K.q.f4487f;
        K.H h4 = c0329a3.f4457h;
        h4.P(qVar2);
        B1.C.k0(h4, 0, obj);
        B1.C.k0(h4, 1, a4);
        B1.C.j0(h4, 0, r3);
        if (h4.f4455n == K.H.I(h4, 1) && h4.f4456o == K.H.I(h4, 2)) {
            return;
        }
        StringBuilder sb9 = new StringBuilder();
        if ((h4.f4455n & 1) != 0) {
            sb9.append(qVar2.b(0));
            i3 = 1;
        } else {
            i3 = 0;
        }
        String sb10 = sb9.toString();
        StringBuilder m5 = B1.t.m(sb10, "StringBuilder().apply(builderAction).toString()");
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 2; i13 < i15; i15 = 2) {
            if (((1 << i13) & h4.f4456o) != 0) {
                if (i3 > 0) {
                    m5.append(", ");
                }
                m5.append(qVar2.c(i13));
                i14++;
            }
            i13++;
        }
        String sb11 = m5.toString();
        z2.h.e(sb11, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb12 = new StringBuilder("Error while pushing ");
        sb12.append(qVar2);
        sb12.append(". Not all arguments were provided. Missing ");
        B1.t.x(sb12, i3, " int arguments (", sb10, ") and ");
        B1.t.z(sb12, i14, " object arguments (", sb11, ").");
        throw null;
    }

    public final boolean g(Object obj) {
        if (z2.h.a(C(), obj)) {
            return false;
        }
        f0(obj);
        return true;
    }

    public final int g0(int i2) {
        int i3;
        if (i2 >= 0) {
            int[] iArr = this.f4208n;
            return (iArr == null || (i3 = iArr[i2]) < 0) ? C0257c.o(this.F.f3980b, i2) : i3;
        }
        C0759o c0759o = this.f4209o;
        if (c0759o == null || c0759o.c(i2) < 0) {
            return 0;
        }
        return c0759o.d(i2);
    }

    public final boolean h(boolean z3) {
        Object C3 = C();
        if ((C3 instanceof Boolean) && z3 == ((Boolean) C3).booleanValue()) {
            return false;
        }
        f0(Boolean.valueOf(z3));
        return true;
    }

    public final void h0() {
        if (!this.q) {
            C0257c.y("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.q = false;
        if (!(!this.f4193O)) {
            C0257c.y("useNode() called while inserting");
            throw null;
        }
        D0 d02 = this.F;
        Object i2 = d02.i(d02.f3987i);
        C0330b c0330b = this.f4190L;
        c0330b.g();
        c0330b.f4465h.f4104h.add(i2);
        if (this.f4217x && (i2 instanceof InterfaceC0271j)) {
            c0330b.f();
            C0329a c0329a = c0330b.f4459b;
            c0329a.getClass();
            if (i2 instanceof InterfaceC0271j) {
                c0329a.f4457h.O(K.F.f4446c);
            }
        }
    }

    public final boolean i(Object obj) {
        if (C() == obj) {
            return false;
        }
        f0(obj);
        return true;
    }

    public final void i0() {
        if (!this.q) {
            return;
        }
        C0257c.y("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    public final void j() {
        this.f4203i = null;
        this.f4204j = 0;
        this.f4205k = 0;
        this.f4194P = 0;
        this.q = false;
        C0330b c0330b = this.f4190L;
        c0330b.f4460c = false;
        c0330b.f4461d.f4054b = 0;
        c0330b.f4463f = 0;
        this.f4184D.f4104h.clear();
        this.f4208n = null;
        this.f4209o = null;
    }

    public final int k(int i2, int i3, int i4, int i5) {
        int i6;
        Object b3;
        if (i2 == i4) {
            return i5;
        }
        D0 d02 = this.F;
        boolean l3 = C0257c.l(d02.f3980b, i2);
        int[] iArr = d02.f3980b;
        if (l3) {
            Object j3 = d02.j(iArr, i2);
            i6 = j3 != null ? j3 instanceof Enum ? ((Enum) j3).ordinal() : j3.hashCode() : 0;
        } else {
            int i7 = iArr[i2 * 5];
            if (i7 == 207 && (b3 = d02.b(iArr, i2)) != null && !z2.h.a(b3, C0275l.f4150a)) {
                i7 = b3.hashCode();
            }
            i6 = i7;
        }
        if (i6 == 126665345) {
            return i6;
        }
        int p3 = C0257c.p(this.F.f3980b, i2);
        if (p3 != i4) {
            i5 = k(p3, D(p3), i4, i5);
        }
        if (C0257c.l(this.F.f3980b, i2)) {
            i3 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i5, 3) ^ i6, 3) ^ i3;
    }

    public final Object l(AbstractC0286q0 abstractC0286q0) {
        return C0257c.P(n(), abstractC0286q0);
    }

    public final void m(y2.a aVar) {
        int i2;
        int i3;
        int i4;
        if (!this.q) {
            C0257c.y("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.q = false;
        if (!this.f4193O) {
            C0257c.y("createNode() can only be called when inserting");
            throw null;
        }
        N n3 = this.f4207m;
        int i5 = n3.f4053a[n3.f4054b - 1];
        G0 g02 = this.f4186H;
        C0255b b3 = g02.b(g02.f4034u);
        this.f4205k++;
        C0331c c0331c = this.f4192N;
        K.q qVar = K.q.f4485d;
        K.H h2 = c0331c.f4470h;
        h2.P(qVar);
        B1.C.k0(h2, 0, aVar);
        B1.C.j0(h2, 0, i5);
        B1.C.k0(h2, 1, b3);
        if (!(h2.f4455n == K.H.I(h2, 1) && h2.f4456o == K.H.I(h2, 2))) {
            StringBuilder sb = new StringBuilder();
            if ((h2.f4455n & 1) != 0) {
                sb.append(qVar.b(0));
                i4 = 1;
            } else {
                i4 = 0;
            }
            String sb2 = sb.toString();
            StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
            int i6 = 0;
            for (int i7 = 0; i7 < 2; i7++) {
                if (((1 << i7) & h2.f4456o) != 0) {
                    if (i4 > 0) {
                        m3.append(", ");
                    }
                    m3.append(qVar.c(i7));
                    i6++;
                }
            }
            String sb3 = m3.toString();
            z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(qVar);
            sb4.append(". Not all arguments were provided. Missing ");
            B1.t.x(sb4, i4, " int arguments (", sb2, ") and ");
            B1.t.z(sb4, i6, " object arguments (", sb3, ").");
            throw null;
        }
        K.q qVar2 = K.q.f4486e;
        K.H h3 = c0331c.f4471i;
        h3.P(qVar2);
        B1.C.j0(h3, 0, i5);
        B1.C.k0(h3, 0, b3);
        if (h3.f4455n == K.H.I(h3, 1) && h3.f4456o == K.H.I(h3, 1)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        if ((h3.f4455n & 1) != 0) {
            sb5.append(qVar2.b(0));
            i2 = 1;
        } else {
            i2 = 0;
        }
        String sb6 = sb5.toString();
        StringBuilder m4 = B1.t.m(sb6, "StringBuilder().apply(builderAction).toString()");
        if ((h3.f4456o & 1) != 0) {
            if (i2 > 0) {
                m4.append(", ");
            }
            m4.append(qVar2.c(0));
            i3 = 1;
        } else {
            i3 = 0;
        }
        String sb7 = m4.toString();
        z2.h.e(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(qVar2);
        sb8.append(". Not all arguments were provided. Missing ");
        B1.t.x(sb8, i2, " int arguments (", sb6, ") and ");
        B1.t.z(sb8, i3, " object arguments (", sb7, ").");
        throw null;
    }

    public final InterfaceC0282o0 n() {
        InterfaceC0282o0 interfaceC0282o0;
        InterfaceC0282o0 interfaceC0282o02;
        Object obj;
        Object obj2;
        InterfaceC0282o0 interfaceC0282o03 = this.f4188J;
        if (interfaceC0282o03 != null) {
            return interfaceC0282o03;
        }
        int i2 = this.F.f3987i;
        boolean z3 = this.f4193O;
        C0262e0 c0262e0 = C0257c.f4121c;
        if (z3 && this.f4187I) {
            int i3 = this.f4186H.f4034u;
            while (i3 > 0) {
                G0 g02 = this.f4186H;
                if (g02.f4016b[g02.p(i3) * 5] == 202) {
                    G0 g03 = this.f4186H;
                    int p3 = g03.p(i3);
                    if (C0257c.l(g03.f4016b, p3)) {
                        Object[] objArr = g03.f4017c;
                        int[] iArr = g03.f4016b;
                        int i4 = p3 * 5;
                        obj = objArr[C0257c.A(iArr[i4 + 1] >> 30) + iArr[i4 + 4]];
                    } else {
                        obj = null;
                    }
                    if (z2.h.a(obj, c0262e0)) {
                        G0 g04 = this.f4186H;
                        int p4 = g04.p(i3);
                        if (C0257c.k(g04.f4016b, p4)) {
                            Object[] objArr2 = g04.f4017c;
                            int[] iArr2 = g04.f4016b;
                            obj2 = objArr2[C0257c.A(iArr2[(p4 * 5) + 1] >> 29) + g04.f(iArr2, p4)];
                        } else {
                            obj2 = C0275l.f4150a;
                        }
                        z2.h.d(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        InterfaceC0282o0 interfaceC0282o04 = (InterfaceC0282o0) obj2;
                        this.f4188J = interfaceC0282o04;
                        return interfaceC0282o04;
                    }
                }
                G0 g05 = this.f4186H;
                i3 = g05.z(g05.f4016b, i3);
            }
        }
        if (this.F.f3981c > 0) {
            while (i2 > 0) {
                D0 d02 = this.F;
                int[] iArr3 = d02.f3980b;
                if (iArr3[i2 * 5] == 202 && z2.h.a(d02.j(iArr3, i2), c0262e0)) {
                    B.F f3 = this.f4214u;
                    if (f3 == null || (interfaceC0282o02 = (InterfaceC0282o0) ((SparseArray) f3.f165i).get(i2)) == null) {
                        D0 d03 = this.F;
                        Object b3 = d03.b(d03.f3980b, i2);
                        z2.h.d(b3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC0282o0 = (InterfaceC0282o0) b3;
                    } else {
                        interfaceC0282o0 = interfaceC0282o02;
                    }
                    this.f4188J = interfaceC0282o0;
                    return interfaceC0282o0;
                }
                i2 = C0257c.p(this.F.f3980b, i2);
            }
        }
        InterfaceC0282o0 interfaceC0282o05 = this.f4213t;
        this.f4188J = interfaceC0282o05;
        return interfaceC0282o05;
    }

    public final void o(boolean z3) {
        if (!(this.f4205k == 0)) {
            C0257c.y("No nodes can be emitted before calling dactivateToEndGroup");
            throw null;
        }
        if (this.f4193O) {
            return;
        }
        if (!z3) {
            O();
            return;
        }
        D0 d02 = this.F;
        int i2 = d02.f3985g;
        int i3 = d02.f3986h;
        C0330b c0330b = this.f4190L;
        c0330b.getClass();
        c0330b.h(false);
        C0329a c0329a = c0330b.f4459b;
        c0329a.getClass();
        c0329a.f4457h.O(K.i.f4477c);
        C0257c.q(this.f4211r, i2, i3);
        this.F.m();
    }

    public final void p(B.F f3, R.a aVar) {
        int i2;
        if (!(!this.E)) {
            C0257c.y("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f4181A = T.n.k().d();
            this.f4214u = null;
            C0769y c0769y = (C0769y) f3.f165i;
            Object[] objArr = c0769y.f8066b;
            Object[] objArr2 = c0769y.f8067c;
            long[] jArr = c0769y.f8065a;
            int length = jArr.length - 2;
            ArrayList arrayList = this.f4211r;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j3 = jArr[i3];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j3 & 255) < 128) {
                                int i7 = (i3 << 3) + i6;
                                Object obj = objArr[i7];
                                Object obj2 = objArr2[i7];
                                z2.h.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                C0255b c0255b = ((C0291t0) obj).f4234c;
                                if (c0255b != null) {
                                    int i8 = c0255b.f4117a;
                                    C0291t0 c0291t0 = (C0291t0) obj;
                                    if (obj2 == W.f4108l) {
                                        obj2 = null;
                                    }
                                    arrayList.add(new O(c0291t0, i8, obj2));
                                }
                                i2 = 8;
                            } else {
                                i2 = i4;
                            }
                            j3 >>= i2;
                            i6++;
                            i4 = i2;
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
            AbstractC0967s.A(arrayList, C0257c.f4124f);
            this.f4204j = 0;
            this.E = true;
            try {
                Z();
                Object C3 = C();
                if (C3 != aVar && aVar != null) {
                    f0(aVar);
                }
                C0281o c0281o = this.f4183C;
                L.d E = C0257c.E();
                try {
                    E.b(c0281o);
                    C0262e0 c0262e0 = C0257c.f4119a;
                    if (aVar != null) {
                        S(200, c0262e0);
                        C0257c.J(this, aVar);
                        r(false);
                    } else if (!this.f4215v || C3 == null || z2.h.a(C3, C0275l.f4150a)) {
                        N();
                    } else {
                        S(200, c0262e0);
                        z2.v.d(2, C3);
                        C0257c.J(this, (y2.e) C3);
                        r(false);
                    }
                    E.n(E.f4620j - 1);
                    v();
                    this.E = false;
                    arrayList.clear();
                    C0257c.T(this.f4186H.f4035v);
                    x();
                    Trace.endSection();
                } finally {
                    E.n(E.f4620j - 1);
                }
            } catch (Throwable th) {
                this.E = false;
                arrayList.clear();
                a();
                C0257c.T(this.f4186H.f4035v);
                x();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void q(int i2, int i3) {
        if (i2 <= 0 || i2 == i3) {
            return;
        }
        q(C0257c.p(this.F.f3980b, i2), i3);
        if (C0257c.m(this.F.f3980b, i2)) {
            Object i4 = this.F.i(i2);
            C0330b c0330b = this.f4190L;
            c0330b.g();
            c0330b.f4465h.f4104h.add(i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0813  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(boolean r41) {
        /*
            Method dump skipped, instructions count: 2636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0285q.r(boolean):void");
    }

    public final void s() {
        r(false);
        C0291t0 y3 = y();
        if (y3 != null) {
            int i2 = y3.f4232a;
            if ((i2 & 1) != 0) {
                y3.f4232a = i2 | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final J.C0291t0 t() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0285q.t():J.t0");
    }

    public final void u() {
        if (this.f4217x && this.F.f3987i == this.f4218y) {
            this.f4218y = -1;
            this.f4217x = false;
        }
        r(false);
    }

    public final void v() {
        r(false);
        this.f4196b.b();
        r(false);
        C0330b c0330b = this.f4190L;
        if (c0330b.f4460c) {
            c0330b.h(false);
            c0330b.h(false);
            C0329a c0329a = c0330b.f4459b;
            c0329a.getClass();
            c0329a.f4457h.O(K.m.f4481c);
            c0330b.f4460c = false;
        }
        c0330b.f();
        if (!(c0330b.f4461d.f4054b == 0)) {
            C0257c.y("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f4202h.f4104h.isEmpty()) {
            C0257c.y("Start/end imbalance");
            throw null;
        }
        j();
        this.F.c();
        this.f4215v = this.f4216w.a() != 0;
    }

    public final void w(boolean z3, C0280n0 c0280n0) {
        this.f4202h.f4104h.add(this.f4203i);
        this.f4203i = c0280n0;
        int i2 = this.f4205k;
        N n3 = this.f4207m;
        n3.b(i2);
        n3.b(this.f4206l);
        n3.b(this.f4204j);
        if (z3) {
            this.f4204j = 0;
        }
        this.f4205k = 0;
        this.f4206l = 0;
    }

    public final void x() {
        E0 e02 = new E0();
        if (this.f4182B) {
            e02.b();
        }
        if (this.f4196b.c()) {
            e02.q = new C0761q();
        }
        this.f4185G = e02;
        G0 f3 = e02.f();
        f3.e(true);
        this.f4186H = f3;
    }

    public final C0291t0 y() {
        if (this.f4219z == 0) {
            V0 v0 = this.f4184D;
            if (!v0.f4104h.isEmpty()) {
                return (C0291t0) v0.f4104h.get(r0.size() - 1);
            }
        }
        return null;
    }

    public final boolean z() {
        C0291t0 y3;
        return (A() && !this.f4215v && ((y3 = y()) == null || (y3.f4232a & 4) == 0)) ? false : true;
    }
}
