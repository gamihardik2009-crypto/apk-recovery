package t0;

import c0.C0573M;
import java.util.HashMap;
import java.util.Map;
import n0.C0919B;
import n2.AbstractC0946A;
import r0.AbstractC1114c;
import r0.C1125n;

/* renamed from: t0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1237F {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1243a f10405a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10407c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10408d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10409e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10410f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10411g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1243a f10412h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10414j;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10406b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f10413i = new HashMap();

    public C1237F(InterfaceC1243a interfaceC1243a, int i2) {
        this.f10414j = i2;
        this.f10405a = interfaceC1243a;
    }

    public static final void a(C1237F c1237f, C1125n c1125n, int i2, Z z3) {
        c1237f.getClass();
        float f3 = i2;
        long e3 = K1.f.e(f3, f3);
        while (true) {
            e3 = c1237f.b(z3, e3);
            z3 = z3.f10549v;
            z2.h.c(z3);
            if (z2.h.a(z3, c1237f.f10405a.T())) {
                break;
            } else if (c1237f.c(z3).containsKey(c1125n)) {
                float d3 = c1237f.d(z3, c1125n);
                e3 = K1.f.e(d3, d3);
            }
        }
        int round = Math.round(c1125n instanceof C1125n ? b0.c.e(e3) : b0.c.d(e3));
        HashMap hashMap = c1237f.f10413i;
        if (hashMap.containsKey(c1125n)) {
            int intValue = ((Number) AbstractC0946A.k(hashMap, c1125n)).intValue();
            C1125n c1125n2 = AbstractC1114c.f9858a;
            round = ((Number) c1125n.f9880a.j(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
        }
        hashMap.put(c1125n, Integer.valueOf(round));
    }

    public final long b(Z z3, long j3) {
        switch (this.f10414j) {
            case 0:
                C0573M c0573m = Z.f10530N;
                return z3.m1(j3, true);
            default:
                O R02 = z3.R0();
                z2.h.c(R02);
                long j4 = R02.f10491t;
                return b0.c.h(K1.f.e((int) (j4 >> 32), (int) (j4 & 4294967295L)), j3);
        }
    }

    public final Map c(Z z3) {
        switch (this.f10414j) {
            case 0:
                return z3.C0().i();
            default:
                O R02 = z3.R0();
                z2.h.c(R02);
                return R02.C0().i();
        }
    }

    public final int d(Z z3, C1125n c1125n) {
        switch (this.f10414j) {
            case 0:
                return z3.d0(c1125n);
            default:
                O R02 = z3.R0();
                z2.h.c(R02);
                return R02.d0(c1125n);
        }
    }

    public final boolean e() {
        return this.f10407c || this.f10409e || this.f10410f || this.f10411g;
    }

    public final boolean f() {
        i();
        return this.f10412h != null;
    }

    public final void g() {
        this.f10406b = true;
        InterfaceC1243a interfaceC1243a = this.f10405a;
        InterfaceC1243a f3 = interfaceC1243a.f();
        if (f3 == null) {
            return;
        }
        if (this.f10407c) {
            f3.Y();
        } else if (this.f10409e || this.f10408d) {
            f3.requestLayout();
        }
        if (this.f10410f) {
            interfaceC1243a.Y();
        }
        if (this.f10411g) {
            interfaceC1243a.requestLayout();
        }
        f3.i().g();
    }

    public final void h() {
        HashMap hashMap = this.f10413i;
        hashMap.clear();
        C0919B c0919b = new C0919B(10, this);
        InterfaceC1243a interfaceC1243a = this.f10405a;
        interfaceC1243a.w(c0919b);
        hashMap.putAll(c(interfaceC1243a.T()));
        this.f10406b = false;
    }

    public final void i() {
        C1237F i2;
        C1237F i3;
        boolean e3 = e();
        InterfaceC1243a interfaceC1243a = this.f10405a;
        if (!e3) {
            InterfaceC1243a f3 = interfaceC1243a.f();
            if (f3 == null) {
                return;
            }
            interfaceC1243a = f3.i().f10412h;
            if (interfaceC1243a == null || !interfaceC1243a.i().e()) {
                InterfaceC1243a interfaceC1243a2 = this.f10412h;
                if (interfaceC1243a2 == null || interfaceC1243a2.i().e()) {
                    return;
                }
                InterfaceC1243a f4 = interfaceC1243a2.f();
                if (f4 != null && (i3 = f4.i()) != null) {
                    i3.i();
                }
                InterfaceC1243a f5 = interfaceC1243a2.f();
                interfaceC1243a = (f5 == null || (i2 = f5.i()) == null) ? null : i2.f10412h;
            }
        }
        this.f10412h = interfaceC1243a;
    }
}
