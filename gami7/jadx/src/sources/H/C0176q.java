package H;

import J.C0285q;
import m2.C0880v;
import s.AbstractC1173l;
import s.C1168g;
import s0.C1194h;
import u0.AbstractC1296l0;

/* renamed from: H.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176q extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s.Y f3016i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N5 f3017j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f3018k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0.K f3019l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f3020m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f3021n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.e f3022o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0176q(s.Y y3, N5 n5, y2.e eVar, C0.K k3, boolean z3, y2.e eVar2, R.a aVar) {
        super(2);
        this.f3016i = y3;
        this.f3017j = n5;
        this.f3018k = eVar;
        this.f3019l = k3;
        this.f3020m = z3;
        this.f3021n = eVar2;
        this.f3022o = aVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            float P2 = 0.0f + ((O0.b) c0285q.l(AbstractC1296l0.f11087f)).P(I.C.f3464a);
            V.l lVar = V.l.f5857b;
            C1194h c1194h = s.b0.f10122a;
            V.o w2 = B1.C.w(V.a.b(lVar, new D.e0(8, this.f3016i)));
            N5 n5 = this.f3017j;
            long j3 = n5.f1799c;
            C1168g c1168g = AbstractC1173l.f10153e;
            AbstractC0224y.c(w2, P2, j3, n5.f1800d, n5.f1801e, this.f3018k, this.f3019l, 1.0f, c1168g, this.f3020m ? c1168g : AbstractC1173l.f10149a, 0, false, this.f3021n, this.f3022o, c0285q, 113246208, 3126);
        }
        return C0880v.f8657a;
    }
}
