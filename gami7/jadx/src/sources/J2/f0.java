package J2;

import m2.C0880v;

/* loaded from: classes.dex */
public final class f0 extends d0 {

    /* renamed from: l, reason: collision with root package name */
    public final i0 f4391l;

    /* renamed from: m, reason: collision with root package name */
    public final g0 f4392m;

    /* renamed from: n, reason: collision with root package name */
    public final C0315l f4393n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f4394o;

    public f0(i0 i0Var, g0 g0Var, C0315l c0315l, Object obj) {
        this.f4391l = i0Var;
        this.f4392m = g0Var;
        this.f4393n = c0315l;
        this.f4394o = obj;
    }

    @Override // y2.c
    public final /* bridge */ /* synthetic */ Object l(Object obj) {
        r((Throwable) obj);
        return C0880v.f8657a;
    }

    @Override // J2.d0
    public final void r(Throwable th) {
        i0 i0Var = this.f4391l;
        i0Var.getClass();
        C0315l c02 = i0.c0(this.f4393n);
        g0 g0Var = this.f4392m;
        Object obj = this.f4394o;
        if (c02 != null) {
            while (B.n(c02.f4413l, false, new f0(i0Var, g0Var, c02, obj), 1) == m0.f4415h) {
                c02 = i0.c0(c02);
                if (c02 == null) {
                }
            }
            return;
        }
        i0Var.G(i0Var.Q(g0Var, obj));
    }
}
