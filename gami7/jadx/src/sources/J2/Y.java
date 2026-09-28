package J2;

import m2.C0880v;
import q2.InterfaceC1073d;

/* loaded from: classes.dex */
public final class Y extends d0 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4378l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f4379m;

    public /* synthetic */ Y(int i2, Object obj) {
        this.f4378l = i2;
        this.f4379m = obj;
    }

    @Override // y2.c
    public final /* bridge */ /* synthetic */ Object l(Object obj) {
        switch (this.f4378l) {
            case 0:
                r((Throwable) obj);
                break;
            case 1:
                r((Throwable) obj);
                break;
            default:
                r((Throwable) obj);
                break;
        }
        return C0880v.f8657a;
    }

    @Override // J2.d0
    public final void r(Throwable th) {
        switch (this.f4378l) {
            case 0:
                ((y2.c) this.f4379m).l(th);
                break;
            case 1:
                Object V2 = q().V();
                boolean z3 = V2 instanceof C0319p;
                C0311h c0311h = (C0311h) this.f4379m;
                if (!z3) {
                    c0311h.t(B.x(V2));
                    break;
                } else {
                    c0311h.t(C1.y.n(((C0319p) V2).f4422a));
                    break;
                }
            default:
                ((InterfaceC1073d) this.f4379m).t(C0880v.f8657a);
                break;
        }
    }
}
