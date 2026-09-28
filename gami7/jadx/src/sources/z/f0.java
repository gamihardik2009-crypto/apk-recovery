package z;

import J.C0275l;
import J.C0285q;
import u0.C1299n;

/* loaded from: classes.dex */
public final class f0 extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S f11674i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D.X f11675j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I0.z f11676k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f11677l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f11678m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I0.s f11679n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q0 f11680o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.c f11681p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(int i2, D.X x2, I0.s sVar, I0.z zVar, C1426q c1426q, S s3, q0 q0Var, boolean z3, boolean z4) {
        super(3);
        this.f11674i = s3;
        this.f11675j = x2;
        this.f11676k = zVar;
        this.f11677l = z3;
        this.f11678m = z4;
        this.f11679n = sVar;
        this.f11680o = q0Var;
        this.f11681p = c1426q;
        this.q = i2;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0285q c0285q = (C0285q) obj2;
        ((Number) obj3).intValue();
        c0285q.U(851809892);
        Object K3 = c0285q.K();
        J.W w2 = C0275l.f4150a;
        if (K3 == w2) {
            K3 = new D.f0();
            c0285q.e0(K3);
        }
        D.f0 f0Var = (D.f0) K3;
        Object K4 = c0285q.K();
        if (K4 == w2) {
            K4 = new C1404D();
            c0285q.e0(K4);
        }
        I0.s sVar = this.f11679n;
        q0 q0Var = this.f11680o;
        e0 e0Var = new e0(this.f11674i, this.f11675j, this.f11676k, this.f11677l, this.f11678m, f0Var, sVar, q0Var, (C1404D) K4, this.f11681p, this.q);
        boolean i2 = c0285q.i(e0Var);
        Object K5 = c0285q.K();
        if (i2 || K5 == w2) {
            K5 = new C1299n(1, e0Var, e0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 2);
            c0285q.e0(K5);
        }
        V.o a3 = androidx.compose.ui.input.key.a.a((y2.c) ((z2.f) K5));
        c0285q.r(false);
        return a3;
    }
}
