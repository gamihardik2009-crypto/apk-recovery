package t;

import H.U2;
import J.C0257c;
import J.C0274k0;
import J.InterfaceC0258c0;
import J.W;
import J2.B;
import J2.InterfaceC0328z;
import T.AbstractC0379g;
import java.util.List;
import m.AbstractC0831e;
import m.C0841n;
import m.C0842o;
import m.y0;
import m2.C0880v;
import n.c0;
import n0.C0919B;
import n0.C0929h;
import n2.AbstractC0960l;
import n2.AbstractC0961m;
import p.InterfaceC1047v0;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import t0.C1236E;
import v.AbstractC1358l;
import v.C1334F;
import v.C1337I;
import v.C1350d;
import v.C1357k;
import v.InterfaceC1336H;

/* renamed from: t.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1228w implements InterfaceC1047v0 {

    /* renamed from: x, reason: collision with root package name */
    public static final K1.e f10342x = K1.f.I(C1222q.f10326i, C1218m.f10285l);

    /* renamed from: b, reason: collision with root package name */
    public boolean f10344b;

    /* renamed from: c, reason: collision with root package name */
    public C1219n f10345c;

    /* renamed from: d, reason: collision with root package name */
    public final C1221p f10346d;

    /* renamed from: h, reason: collision with root package name */
    public float f10350h;

    /* renamed from: k, reason: collision with root package name */
    public C1236E f10353k;

    /* renamed from: p, reason: collision with root package name */
    public final C1337I f10358p;

    /* renamed from: t, reason: collision with root package name */
    public final C0274k0 f10361t;

    /* renamed from: u, reason: collision with root package name */
    public final C0274k0 f10362u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC0258c0 f10363v;

    /* renamed from: w, reason: collision with root package name */
    public C0841n f10364w;

    /* renamed from: a, reason: collision with root package name */
    public final C1206a f10343a = new C1206a(2, 0);

    /* renamed from: e, reason: collision with root package name */
    public final C1210e f10347e = new C1210e(this);

    /* renamed from: f, reason: collision with root package name */
    public final C0274k0 f10348f = C0257c.N(AbstractC1231z.f10370b, W.f4106j);

    /* renamed from: g, reason: collision with root package name */
    public final r.l f10349g = new r.l();

    /* renamed from: i, reason: collision with root package name */
    public final p.r f10351i = new p.r(new C0919B(9, this));

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10352j = true;

    /* renamed from: l, reason: collision with root package name */
    public final C1223r f10354l = new C1223r(this, 0);

    /* renamed from: m, reason: collision with root package name */
    public final C1350d f10355m = new C1350d();

    /* renamed from: n, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f10356n = new androidx.compose.foundation.lazy.layout.a();

    /* renamed from: o, reason: collision with root package name */
    public final C0929h f10357o = new C0929h(2);
    public final C1210e q = new C1210e(this);

    /* renamed from: r, reason: collision with root package name */
    public final C1334F f10359r = new C1334F();

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC0258c0 f10360s = AbstractC0960l.h();

    public C1228w(int i2, int i3) {
        this.f10346d = new C1221p(i2, i3, 0);
        this.f10358p = new C1337I(new U2(i2, 3, this));
        Boolean bool = Boolean.FALSE;
        W w2 = W.f4109m;
        this.f10361t = C0257c.N(bool, w2);
        this.f10362u = C0257c.N(bool, w2);
        this.f10363v = AbstractC0960l.h();
        this.f10364w = new C0841n(y0.f8602a, Float.valueOf(0.0f), new C0842o(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static Object f(C1228w c1228w, int i2, InterfaceC1073d interfaceC1073d) {
        O0.b bVar = ((C1219n) c1228w.f10348f.getValue()).f10294h;
        float f3 = AbstractC1358l.f11374a;
        C1210e c1210e = c1228w.f10347e;
        Object e3 = c1210e.f10233a.e(c0.f8753h, new C1357k(i2, bVar, c1210e, 0, 100, null), interfaceC1073d);
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        C0880v c0880v = C0880v.f8657a;
        if (e3 != enumC1145a) {
            e3 = c0880v;
        }
        if (e3 != enumC1145a) {
            e3 = c0880v;
        }
        return e3 == enumC1145a ? e3 : c0880v;
    }

    public static Object j(C1228w c1228w, int i2, InterfaceC1073d interfaceC1073d) {
        c1228w.getClass();
        Object e3 = c1228w.e(c0.f8753h, new C1225t(c1228w, i2, 0, null), interfaceC1073d);
        return e3 == EnumC1145a.f10026h ? e3 : C0880v.f8657a;
    }

    @Override // p.InterfaceC1047v0
    public final boolean a() {
        return ((Boolean) this.f10361t.getValue()).booleanValue();
    }

    @Override // p.InterfaceC1047v0
    public final float b(float f3) {
        return this.f10351i.b(f3);
    }

    @Override // p.InterfaceC1047v0
    public final boolean c() {
        return ((Boolean) this.f10362u.getValue()).booleanValue();
    }

    @Override // p.InterfaceC1047v0
    public final boolean d() {
        return this.f10351i.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // p.InterfaceC1047v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(n.c0 r6, y2.e r7, q2.InterfaceC1073d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof t.C1224s
            if (r0 == 0) goto L13
            r0 = r8
            t.s r0 = (t.C1224s) r0
            int r1 = r0.f10334p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10334p = r1
            goto L18
        L13:
            t.s r0 = new t.s
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f10332n
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f10334p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            C1.y.J(r8)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            y2.e r7 = r0.f10331m
            n.c0 r6 = r0.f10330l
            t.w r2 = r0.f10329k
            C1.y.J(r8)
            goto L51
        L3c:
            C1.y.J(r8)
            r0.f10329k = r5
            r0.f10330l = r6
            r0.f10331m = r7
            r0.f10334p = r4
            v.d r8 = r5.f10355m
            java.lang.Object r8 = r8.l(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            p.r r8 = r2.f10351i
            r2 = 0
            r0.f10329k = r2
            r0.f10330l = r2
            r0.f10331m = r2
            r0.f10334p = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            m2.v r6 = m2.C0880v.f8657a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1228w.e(n.c0, y2.e, q2.d):java.lang.Object");
    }

    public final void g(C1219n c1219n, boolean z3, boolean z4) {
        if (!z3 && this.f10344b) {
            this.f10345c = c1219n;
            return;
        }
        if (z3) {
            this.f10344b = true;
        }
        C1220o c1220o = c1219n.f10287a;
        this.f10362u.setValue(Boolean.valueOf(((c1220o == null || c1220o.f10303a == 0) && c1219n.f10288b == 0) ? false : true));
        this.f10361t.setValue(Boolean.valueOf(c1219n.f10289c));
        this.f10350h -= c1219n.f10290d;
        this.f10348f.setValue(c1219n);
        C1221p c1221p = this.f10346d;
        if (z4) {
            int i2 = c1219n.f10288b;
            if (i2 < 0.0f) {
                c1221p.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i2 + ')').toString());
            }
            c1221p.f10322c.h(i2);
        } else {
            c1221p.getClass();
            c1221p.f10324e = c1220o != null ? c1220o.f10312j : null;
            if (c1221p.f10323d || c1219n.f10299m > 0) {
                c1221p.f10323d = true;
                int i3 = c1219n.f10288b;
                if (i3 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i3 + ')').toString());
                }
                c1221p.c(c1220o != null ? c1220o.f10303a : 0, i3);
            }
            if (this.f10352j) {
                C1206a c1206a = this.f10343a;
                if (c1206a.f10215b != -1) {
                    List list = c1219n.f10296j;
                    if (!list.isEmpty()) {
                        if (c1206a.f10215b != (c1206a.f10216c ? ((C1220o) AbstractC0961m.M(list)).f10303a + 1 : ((C1220o) AbstractC0961m.G(list)).f10303a - 1)) {
                            c1206a.f10215b = -1;
                            InterfaceC1336H interfaceC1336H = (InterfaceC1336H) c1206a.f10217d;
                            if (interfaceC1336H != null) {
                                interfaceC1336H.cancel();
                            }
                            c1206a.f10217d = null;
                        }
                    }
                }
            }
        }
        if (z3) {
            float P2 = c1219n.f10294h.P(AbstractC1231z.f10369a);
            float f3 = c1219n.f10291e;
            if (f3 <= P2) {
                return;
            }
            AbstractC0379g c3 = T.s.c();
            y2.c f4 = c3 != null ? c3.f() : null;
            AbstractC0379g d3 = T.s.d(c3);
            try {
                float floatValue = ((Number) this.f10364w.f8534i.getValue()).floatValue();
                C0841n c0841n = this.f10364w;
                boolean z5 = c0841n.f8538m;
                InterfaceC0328z interfaceC0328z = c1219n.f10293g;
                if (z5) {
                    this.f10364w = AbstractC0831e.j(c0841n, floatValue - f3, 0.0f, 30);
                    B.r(interfaceC0328z, null, 0, new C1226u(this, null), 3);
                } else {
                    this.f10364w = new C0841n(y0.f8602a, Float.valueOf(-f3), null, 60);
                    B.r(interfaceC0328z, null, 0, new C1227v(this, null), 3);
                }
                T.s.f(c3, d3, f4);
            } catch (Throwable th) {
                T.s.f(c3, d3, f4);
                throw th;
            }
        }
    }

    public final C1219n h() {
        return (C1219n) this.f10348f.getValue();
    }

    public final void i(float f3, C1219n c1219n) {
        InterfaceC1336H interfaceC1336H;
        InterfaceC1336H interfaceC1336H2;
        InterfaceC1336H interfaceC1336H3;
        if (this.f10352j) {
            C1206a c1206a = this.f10343a;
            c1206a.getClass();
            if (!c1219n.f10296j.isEmpty()) {
                boolean z3 = f3 < 0.0f;
                List list = c1219n.f10296j;
                int i2 = z3 ? ((C1220o) AbstractC0961m.M(list)).f10303a + 1 : ((C1220o) AbstractC0961m.G(list)).f10303a - 1;
                if (i2 < 0 || i2 >= c1219n.f10299m) {
                    return;
                }
                if (i2 != c1206a.f10215b) {
                    if (c1206a.f10216c != z3 && (interfaceC1336H3 = (InterfaceC1336H) c1206a.f10217d) != null) {
                        interfaceC1336H3.cancel();
                    }
                    c1206a.f10216c = z3;
                    c1206a.f10215b = i2;
                    C1228w c1228w = this.q.f10233a;
                    AbstractC0379g c3 = T.s.c();
                    y2.c f4 = c3 != null ? c3.f() : null;
                    AbstractC0379g d3 = T.s.d(c3);
                    try {
                        long j3 = ((C1219n) c1228w.f10348f.getValue()).f10295i;
                        T.s.f(c3, d3, f4);
                        c1206a.f10217d = c1228w.f10358p.a(j3, i2);
                    } catch (Throwable th) {
                        T.s.f(c3, d3, f4);
                        throw th;
                    }
                }
                if (!z3) {
                    if (c1219n.f10297k - ((C1220o) AbstractC0961m.G(list)).f10315m >= f3 || (interfaceC1336H = (InterfaceC1336H) c1206a.f10217d) == null) {
                        return;
                    }
                    interfaceC1336H.a();
                    return;
                }
                C1220o c1220o = (C1220o) AbstractC0961m.M(list);
                if (((c1220o.f10315m + c1220o.f10316n) + c1219n.f10302p) - c1219n.f10298l >= (-f3) || (interfaceC1336H2 = (InterfaceC1336H) c1206a.f10217d) == null) {
                    return;
                }
                interfaceC1336H2.a();
            }
        }
    }

    public final void k(int i2, int i3) {
        C1221p c1221p = this.f10346d;
        if (c1221p.f10321b.g() != i2 || c1221p.f10322c.g() != i3) {
            this.f10356n.e();
        }
        c1221p.c(i2, i3);
        c1221p.f10324e = null;
        C1236E c1236e = this.f10353k;
        if (c1236e != null) {
            c1236e.k();
        }
    }
}
