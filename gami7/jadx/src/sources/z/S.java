package z;

import C0.AbstractC0025h;
import C0.C0024g;
import J.C0257c;
import J.C0274k0;
import J.C0291t0;
import c0.AbstractC0571K;
import c0.C0589h;
import c0.C0603v;
import r0.InterfaceC1129r;
import u0.R0;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public Z f11543a;

    /* renamed from: b, reason: collision with root package name */
    public final C0291t0 f11544b;

    /* renamed from: c, reason: collision with root package name */
    public final R0 f11545c;

    /* renamed from: d, reason: collision with root package name */
    public final B.z f11546d;

    /* renamed from: e, reason: collision with root package name */
    public I0.F f11547e;

    /* renamed from: f, reason: collision with root package name */
    public final C0274k0 f11548f;

    /* renamed from: g, reason: collision with root package name */
    public final C0274k0 f11549g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1129r f11550h;

    /* renamed from: i, reason: collision with root package name */
    public final C0274k0 f11551i;

    /* renamed from: j, reason: collision with root package name */
    public C0024g f11552j;

    /* renamed from: k, reason: collision with root package name */
    public final C0274k0 f11553k;

    /* renamed from: l, reason: collision with root package name */
    public final C0274k0 f11554l;

    /* renamed from: m, reason: collision with root package name */
    public final C0274k0 f11555m;

    /* renamed from: n, reason: collision with root package name */
    public final C0274k0 f11556n;

    /* renamed from: o, reason: collision with root package name */
    public final C0274k0 f11557o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11558p;
    public final C0274k0 q;

    /* renamed from: r, reason: collision with root package name */
    public final O f11559r;

    /* renamed from: s, reason: collision with root package name */
    public y2.c f11560s;

    /* renamed from: t, reason: collision with root package name */
    public final C1426q f11561t;

    /* renamed from: u, reason: collision with root package name */
    public final C1426q f11562u;

    /* renamed from: v, reason: collision with root package name */
    public final C0589h f11563v;

    /* renamed from: w, reason: collision with root package name */
    public long f11564w;

    /* renamed from: x, reason: collision with root package name */
    public final C0274k0 f11565x;

    /* renamed from: y, reason: collision with root package name */
    public final C0274k0 f11566y;

    public S(Z z3, C0291t0 c0291t0, R0 r02) {
        this.f11543a = z3;
        this.f11544b = c0291t0;
        this.f11545c = r02;
        B.z zVar = new B.z();
        C0024g c0024g = AbstractC0025h.f504a;
        long j3 = C0.J.f471b;
        I0.z zVar2 = new I0.z(c0024g, j3, (C0.J) null);
        zVar.f239c = zVar2;
        zVar.f240d = new I0.j(c0024g, zVar2.f3933b);
        this.f11546d = zVar;
        Boolean bool = Boolean.FALSE;
        J.W w2 = J.W.f4109m;
        this.f11548f = C0257c.N(bool, w2);
        this.f11549g = C0257c.N(new O0.e(0), w2);
        this.f11551i = C0257c.N(null, w2);
        this.f11553k = C0257c.N(EnumC1407G.f11511h, w2);
        this.f11554l = C0257c.N(bool, w2);
        this.f11555m = C0257c.N(bool, w2);
        this.f11556n = C0257c.N(bool, w2);
        this.f11557o = C0257c.N(bool, w2);
        this.f11558p = true;
        this.q = C0257c.N(Boolean.TRUE, w2);
        this.f11559r = new O(r02);
        this.f11560s = C1413d.f11634o;
        this.f11561t = new C1426q(this, 5);
        this.f11562u = new C1426q(this, 4);
        this.f11563v = AbstractC0571K.g();
        this.f11564w = C0603v.f7277g;
        this.f11565x = C0257c.N(new C0.J(j3), w2);
        this.f11566y = C0257c.N(new C0.J(j3), w2);
    }

    public final EnumC1407G a() {
        return (EnumC1407G) this.f11553k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f11548f.getValue()).booleanValue();
    }

    public final InterfaceC1129r c() {
        InterfaceC1129r interfaceC1129r = this.f11550h;
        if (interfaceC1129r == null || !interfaceC1129r.n()) {
            return null;
        }
        return interfaceC1129r;
    }

    public final p0 d() {
        return (p0) this.f11551i.getValue();
    }

    public final boolean e() {
        return (C0.J.b(((C0.J) this.f11565x.getValue()).f473a) && C0.J.b(((C0.J) this.f11566y.getValue()).f473a)) ? false : true;
    }

    public final void f(long j3) {
        this.f11566y.setValue(new C0.J(j3));
    }

    public final void g(long j3) {
        this.f11565x.setValue(new C0.J(j3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r1.f11612h != r18) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(C0.C0024g r13, C0.C0024g r14, C0.K r15, boolean r16, O0.b r17, H0.d r18, y2.c r19, z.P r20, a0.InterfaceC0431h r21, long r22) {
        /*
            r12 = this;
            r0 = r12
            r1 = r19
            r0.f11560s = r1
            r1 = r22
            r0.f11564w = r1
            z.O r1 = r0.f11559r
            r2 = r20
            r1.f11527b = r2
            r2 = r21
            r1.f11528c = r2
            r1 = r13
            r0.f11552j = r1
            z.Z r1 = r0.f11543a
            n2.v r11 = n2.C0970v.f9165h
            C0.g r2 = r1.f11605a
            r3 = r14
            boolean r2 = z2.h.a(r2, r14)
            r8 = 1
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 1
            if (r2 == 0) goto L69
            C0.K r2 = r1.f11606b
            r4 = r15
            boolean r2 = z2.h.a(r2, r15)
            if (r2 == 0) goto L66
            boolean r2 = r1.f11609e
            r7 = r16
            if (r2 != r7) goto L63
            int r2 = r1.f11610f
            boolean r2 = K1.f.t(r2, r8)
            if (r2 == 0) goto L63
            int r2 = r1.f11607c
            if (r2 != r5) goto L63
            int r2 = r1.f11608d
            if (r2 != r6) goto L63
            O0.b r2 = r1.f11611g
            r9 = r17
            boolean r2 = z2.h.a(r2, r9)
            if (r2 == 0) goto L60
            java.util.List r2 = r1.f11613i
            boolean r2 = z2.h.a(r2, r11)
            if (r2 == 0) goto L60
            H0.d r2 = r1.f11612h
            r10 = r18
            if (r2 == r10) goto L79
            goto L6b
        L60:
            r10 = r18
            goto L6b
        L63:
            r9 = r17
            goto L60
        L66:
            r7 = r16
            goto L63
        L69:
            r4 = r15
            goto L66
        L6b:
            z.Z r1 = new z.Z
            r2 = r1
            r3 = r14
            r4 = r15
            r7 = r16
            r9 = r17
            r10 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L79:
            z.Z r2 = r0.f11543a
            if (r2 == r1) goto L80
            r2 = 1
            r0.f11558p = r2
        L80:
            r0.f11543a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.S.h(C0.g, C0.g, C0.K, boolean, O0.b, H0.d, y2.c, z.P, a0.h, long):void");
    }
}
