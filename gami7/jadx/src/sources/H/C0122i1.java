package H;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1173l;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* renamed from: H.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122i1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.a f2720i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2721j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2722k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.a f2723l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2724m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.a f2725n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2726o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122i1(y2.a aVar, boolean z3, String str, y2.a aVar2, boolean z4, y2.a aVar3, boolean z5) {
        super(2);
        this.f2720i = aVar;
        this.f2721j = z3;
        this.f2722k = str;
        this.f2723l = aVar2;
        this.f2724m = z4;
        this.f2725n = aVar3;
        this.f2726o = z5;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            A1.n(this.f2720i, this.f2721j, null, R.b.b(c0285q, 1377272806, new C0195t0(this.f2722k, 1)), c0285q, 3072, 4);
            if (!this.f2721j) {
                c0285q.V(693286680);
                V.l lVar = V.l.f5857b;
                s.S a3 = s.Q.a(AbstractC1173l.f10149a, V.b.q, c0285q, 0);
                c0285q.V(-1323940314);
                int i2 = c0285q.f4194P;
                InterfaceC0282o0 n3 = c0285q.n();
                InterfaceC1253k.f10606f.getClass();
                C1251i c1251i = C1252j.f10598b;
                R.a i3 = AbstractC1108W.i(lVar);
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
                C0257c.V(c0285q, a3, C1252j.f10602f);
                C0257c.V(c0285q, n3, C1252j.f10601e);
                C1250h c1250h = C1252j.f10603g;
                if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
                    B1.t.q(i2, c0285q, i2, c1250h);
                }
                B1.t.r(0, i3, new J.C0(c0285q), c0285q, 2058660585);
                D1.e(this.f2723l, null, this.f2724m, null, null, AbstractC0135k0.f2797c, c0285q, 196608, 26);
                D1.e(this.f2725n, null, this.f2726o, null, null, AbstractC0135k0.f2798d, c0285q, 196608, 26);
                B1.t.u(c0285q, false, true, false, false);
            }
        }
        return C0880v.f8657a;
    }
}
