package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090d4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.e f2442i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2443j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2444k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2445l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2446m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2447n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0090d4(y2.e eVar, y2.e eVar2, y2.e eVar3, long j3, long j4, boolean z3) {
        super(2);
        this.f2442i = eVar;
        this.f2443j = eVar2;
        this.f2444k = eVar3;
        this.f2445l = j3;
        this.f2446m = j4;
        this.f2447n = z3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            J.X0 x02 = P5.f1917a;
            C0.K a3 = P5.a((O5) c0285q.l(x02), I.y.f3828e);
            C0.K a4 = P5.a((O5) c0285q.l(x02), I.F.f3547n);
            C0257c.a(t5.f3139a.a(a3), R.b.b(c0285q, 835891690, new C0083c4(this.f2442i, this.f2443j, this.f2444k, a4, this.f2445l, this.f2446m, this.f2447n)), c0285q, 56);
        }
        return C0880v.f8657a;
    }
}
