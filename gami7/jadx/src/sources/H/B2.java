package H;

import J.C0285q;
import c0.C0603v;
import m.AbstractC0831e;
import m2.C0880v;

/* loaded from: classes.dex */
public final class B2 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1345i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1346j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1347k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1348l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1349m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(C0215w2 c0215w2, boolean z3, boolean z4, y2.e eVar) {
        super(2);
        this.f1348l = c0215w2;
        this.f1346j = z3;
        this.f1347k = z4;
        this.f1349m = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f1345i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    C0.K a3 = P5.a((O5) c0285q.l(P5.f1917a), I.r.f3751h);
                    C0215w2 c0215w2 = (C0215w2) this.f1348l;
                    c0215w2.getClass();
                    c0285q.V(-1833866293);
                    J.W0 a4 = l.M.a(!this.f1347k ? c0215w2.f3254g : this.f1346j ? c0215w2.f3249b : c0215w2.f3252e, AbstractC0831e.n(100, 0, null, 6), c0285q, 48);
                    c0285q.r(false);
                    D1.h(((C0603v) a4.getValue()).f7279a, a3, (y2.e) this.f1349m, c0285q, 0);
                }
                break;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    K2.f1666a.a(this.f1346j, this.f1347k, (r.k) this.f1348l, (Z4) this.f1349m, null, 0.0f, 0.0f, c0285q2, 12582912, 112);
                }
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(Z4 z4, r.k kVar, boolean z3, boolean z5) {
        super(2);
        this.f1346j = z3;
        this.f1347k = z5;
        this.f1348l = kVar;
        this.f1349m = z4;
    }
}
