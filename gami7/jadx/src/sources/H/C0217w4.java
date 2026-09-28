package H;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import androidx.compose.material3.MinimumInteractiveModifier;
import c0.InterfaceC0576P;
import m2.C0880v;
import n.C0911t;
import r0.AbstractC1108W;
import s.AbstractC1177p;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import u0.AbstractC1296l0;

/* renamed from: H.w4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217w4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.o f3258i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0576P f3259j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f3260k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f3261l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0911t f3262m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f3263n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r.l f3264o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f3265p;
    public final /* synthetic */ y2.a q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f3266r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.e f3267s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0217w4(V.o oVar, InterfaceC0576P interfaceC0576P, long j3, float f3, C0911t c0911t, boolean z3, r.l lVar, boolean z4, y2.a aVar, float f4, R.a aVar2) {
        super(2);
        this.f3258i = oVar;
        this.f3259j = interfaceC0576P;
        this.f3260k = j3;
        this.f3261l = f3;
        this.f3262m = c0911t;
        this.f3263n = z3;
        this.f3264o = lVar;
        this.f3265p = z4;
        this.q = aVar;
        this.f3266r = f4;
        this.f3267s = aVar2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            J.X0 x02 = AbstractC0102f2.f2577a;
            V.o d3 = AbstractC0223x4.d(this.f3258i.k(MinimumInteractiveModifier.f6721b), this.f3259j, AbstractC0223x4.e(this.f3260k, this.f3261l, c0285q), this.f3262m, ((O0.b) c0285q.l(AbstractC1296l0.f11087f)).P(this.f3266r));
            G.e a3 = G.t.a(false, 0.0f, 0L, c0285q, 0, 7);
            V.o a4 = androidx.compose.foundation.selection.b.a(d3, this.f3263n, this.f3264o, a3, this.f3265p, null, this.q);
            c0285q.V(733328855);
            s.r f3 = AbstractC1177p.f(V.b.f5831h, true, c0285q, 48);
            c0285q.V(-1323940314);
            int i2 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i3 = AbstractC1108W.i(a4);
            if (!(c0285q.f4195a instanceof InterfaceC0259d)) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, f3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
                B1.t.q(i2, c0285q, i2, c1250h);
            }
            B1.t.r(0, i3, new J.C0(c0285q), c0285q, 2058660585);
            this.f3267s.j(c0285q, 0);
            c0285q.r(false);
            c0285q.r(true);
            c0285q.r(false);
            c0285q.r(false);
        }
        return C0880v.f8657a;
    }
}
