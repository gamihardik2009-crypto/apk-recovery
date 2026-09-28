package H;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import c0.C0603v;
import m2.C0880v;
import s.InterfaceC1159L;

/* renamed from: H.h5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119h5 extends z2.i implements y2.i {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C0.K f2690A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ y2.e f2691B;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.e f2692i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z4 f2693j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f2694k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2695l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r.k f2696m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f2697n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f2698o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f2699p;
    public final /* synthetic */ y2.e q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y2.e f2700r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.e f2701s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y2.e f2702t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r5 f2703u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y2.e f2704v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f2705w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1159L f2706x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f2707y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0.K f2708z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119h5(y2.e eVar, Z4 z4, boolean z3, boolean z5, r.k kVar, y2.e eVar2, String str, y2.e eVar3, y2.e eVar4, y2.e eVar5, y2.e eVar6, y2.e eVar7, r5 r5Var, y2.e eVar8, boolean z6, InterfaceC1159L interfaceC1159L, boolean z7, C0.K k3, C0.K k4, y2.e eVar9) {
        super(7);
        this.f2692i = eVar;
        this.f2693j = z4;
        this.f2694k = z3;
        this.f2695l = z5;
        this.f2696m = kVar;
        this.f2697n = eVar2;
        this.f2698o = str;
        this.f2699p = eVar3;
        this.q = eVar4;
        this.f2700r = eVar5;
        this.f2701s = eVar6;
        this.f2702t = eVar7;
        this.f2703u = r5Var;
        this.f2704v = eVar8;
        this.f2705w = z6;
        this.f2706x = interfaceC1159L;
        this.f2707y = z7;
        this.f2708z = k3;
        this.f2690A = k4;
        this.f2691B = eVar9;
    }

    @Override // y2.i
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Integer num) {
        int i2;
        int i3;
        long j3;
        R.a aVar;
        R.a aVar2;
        R.a aVar3;
        R.a aVar4;
        float floatValue = ((Number) obj).floatValue();
        long j4 = ((C0603v) obj2).f7279a;
        long j5 = ((C0603v) obj3).f7279a;
        float floatValue2 = ((Number) obj4).floatValue();
        float floatValue3 = ((Number) obj5).floatValue();
        C0285q c0285q = (C0285q) obj6;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            i2 = (c0285q.d(floatValue) ? 4 : 2) | intValue;
        } else {
            i2 = intValue;
        }
        if ((intValue & 48) == 0) {
            i2 |= c0285q.f(j4) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i2 |= c0285q.f(j5) ? 256 : 128;
        }
        if ((intValue & 3072) == 0) {
            i2 |= c0285q.d(floatValue2) ? 2048 : 1024;
        }
        if ((intValue & 24576) == 0) {
            i2 |= c0285q.d(floatValue3) ? 16384 : 8192;
        }
        int i4 = i2;
        if ((74899 & i4) == 74898 && c0285q.A()) {
            c0285q.P();
        } else {
            y2.e eVar = this.f2692i;
            R.a b3 = eVar != null ? R.b.b(c0285q, -382297919, new C0098e5(floatValue, j5, eVar, this.f2707y, j4)) : null;
            Z4 z4 = this.f2693j;
            z4.getClass();
            c0285q.V(653850713);
            r.k kVar = this.f2696m;
            InterfaceC0258c0 e3 = n1.E.e(kVar, c0285q, 0);
            boolean z3 = this.f2695l;
            boolean z5 = this.f2694k;
            if (z5) {
                i3 = i4;
                j3 = z3 ? z4.E : ((Boolean) e3.getValue()).booleanValue() ? z4.f2221B : z4.f2222C;
            } else {
                i3 = i4;
                j3 = z4.f2223D;
            }
            InterfaceC0258c0 R3 = C0257c.R(new C0603v(j3), c0285q);
            c0285q.r(false);
            long j6 = ((C0603v) R3.getValue()).f7279a;
            y2.e eVar2 = this.f2697n;
            R.a b4 = (eVar2 == null || this.f2698o.length() != 0 || floatValue2 <= 0.0f) ? null : R.b.b(c0285q, -524658155, new C0105f5(floatValue2, j6, eVar2));
            c0285q.V(129569364);
            InterfaceC0258c0 R4 = C0257c.R(new C0603v(!z5 ? z4.f2229L : z3 ? z4.f2230M : ((Boolean) n1.E.e(kVar, c0285q, 0).getValue()).booleanValue() ? z4.f2227J : z4.f2228K), c0285q);
            c0285q.r(false);
            long j7 = ((C0603v) R4.getValue()).f7279a;
            y2.e eVar3 = this.f2699p;
            R.a b5 = (eVar3 == null || floatValue3 <= 0.0f) ? null : R.b.b(c0285q, 1824482619, new C0112g5(floatValue3, j7, this.f2708z, eVar3, 0));
            c0285q.V(1575329427);
            InterfaceC0258c0 R5 = C0257c.R(new C0603v(!z5 ? z4.f2233P : z3 ? z4.f2234Q : ((Boolean) n1.E.e(kVar, c0285q, 0).getValue()).booleanValue() ? z4.f2231N : z4.f2232O), c0285q);
            c0285q.r(false);
            long j8 = ((C0603v) R5.getValue()).f7279a;
            y2.e eVar4 = this.q;
            if (eVar4 == null || floatValue3 <= 0.0f) {
                aVar = b5;
                aVar2 = null;
            } else {
                aVar = b5;
                aVar2 = R.b.b(c0285q, 907456412, new C0112g5(floatValue3, j8, this.f2708z, eVar4, 1));
            }
            c0285q.V(925127045);
            InterfaceC0258c0 R6 = C0257c.R(new C0603v(!z5 ? z4.f2251r : z3 ? z4.f2252s : ((Boolean) n1.E.e(kVar, c0285q, 0).getValue()).booleanValue() ? z4.f2250p : z4.q), c0285q);
            c0285q.r(false);
            long j9 = ((C0603v) R6.getValue()).f7279a;
            y2.e eVar5 = this.f2700r;
            R.a b6 = eVar5 != null ? R.b.b(c0285q, 90769583, new Y1(1, j9, eVar5)) : null;
            c0285q.V(-109504137);
            InterfaceC0258c0 R7 = C0257c.R(new C0603v(!z5 ? z4.f2255v : z3 ? z4.f2256w : ((Boolean) n1.E.e(kVar, c0285q, 0).getValue()).booleanValue() ? z4.f2253t : z4.f2254u), c0285q);
            c0285q.r(false);
            long j10 = ((C0603v) R7.getValue()).f7279a;
            y2.e eVar6 = this.f2701s;
            if (eVar6 != null) {
                aVar3 = aVar2;
                aVar4 = R.b.b(c0285q, 2077796155, new Y1(2, j10, eVar6));
            } else {
                aVar3 = aVar2;
                aVar4 = null;
            }
            c0285q.V(1464709698);
            InterfaceC0258c0 R8 = C0257c.R(new C0603v(!z5 ? z4.f2225H : z3 ? z4.f2226I : ((Boolean) n1.E.e(kVar, c0285q, 0).getValue()).booleanValue() ? z4.F : z4.f2224G), c0285q);
            c0285q.r(false);
            long j11 = ((C0603v) R8.getValue()).f7279a;
            y2.e eVar7 = this.f2702t;
            R.a b7 = eVar7 != null ? R.b.b(c0285q, -1531019900, new F(j11, this.f2690A, eVar7, 2)) : null;
            int ordinal = this.f2703u.ordinal();
            V.l lVar = V.l.f5857b;
            y2.e eVar8 = this.f2691B;
            if (ordinal == 0) {
                c0285q.V(404042583);
                AbstractC0154m5.b(lVar, this.f2704v, b3, b4, b6, aVar4, aVar, aVar3, this.f2705w, floatValue, R.b.b(c0285q, -2124779163, new C0078c(eVar8, 8)), b7, this.f2706x, c0285q, ((i3 << 27) & 1879048192) | 6, 6);
                c0285q.r(false);
            } else if (ordinal != 1) {
                c0285q.V(404045277);
                c0285q.r(false);
            } else {
                c0285q.V(404043576);
                c0285q.V(404043645);
                Object K3 = c0285q.K();
                J.W w2 = C0275l.f4150a;
                if (K3 == w2) {
                    K3 = C0257c.N(new b0.f(0L), J.W.f4109m);
                    c0285q.e0(K3);
                }
                InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K3;
                c0285q.r(false);
                R.a b8 = R.b.b(c0285q, 1902535592, new F0((Object) interfaceC0258c0, (Object) this.f2706x, eVar8, 1));
                c0285q.V(404044653);
                boolean z6 = (i3 & 14) == 4;
                Object K4 = c0285q.K();
                if (z6 || K4 == w2) {
                    K4 = new C0091d5(floatValue, interfaceC0258c0, 0);
                    c0285q.e0(K4);
                }
                c0285q.r(false);
                R2.c(lVar, this.f2704v, b4, b3, b6, aVar4, aVar, aVar3, this.f2705w, floatValue, (y2.c) K4, b8, b7, this.f2706x, c0285q, ((i3 << 27) & 1879048192) | 6, 48);
                c0285q.r(false);
            }
        }
        return C0880v.f8657a;
    }
}
