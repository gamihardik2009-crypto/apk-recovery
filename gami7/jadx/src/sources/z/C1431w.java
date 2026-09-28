package z;

import C0.C0024g;
import a0.C0438o;
import m2.C0880v;
import o.C0982h;
import u0.C1306q0;

/* renamed from: z.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1431w extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I0.G f11834i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.z f11835j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f11836k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f11837l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I0.m f11838m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S f11839n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I0.s f11840o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D.X f11841p;
    public final /* synthetic */ C0438o q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431w(I0.G g3, I0.z zVar, boolean z3, boolean z4, I0.m mVar, S s3, I0.s sVar, D.X x2, C0438o c0438o) {
        super(1);
        this.f11834i = g3;
        this.f11835j = zVar;
        this.f11836k = z3;
        this.f11837l = z4;
        this.f11838m = mVar;
        this.f11839n = s3;
        this.f11840o = sVar;
        this.f11841p = x2;
        this.q = c0438o;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        A0.k kVar = (A0.k) obj;
        C0024g c0024g = this.f11834i.f3864a;
        F2.d[] dVarArr = A0.w.f123a;
        A0.x xVar = A0.t.f117x;
        F2.d[] dVarArr2 = A0.w.f123a;
        F2.d dVar = dVarArr2[16];
        xVar.a(kVar, c0024g);
        I0.z zVar = this.f11835j;
        long j3 = zVar.f3933b;
        A0.x xVar2 = A0.t.f118y;
        F2.d dVar2 = dVarArr2[17];
        xVar2.a(kVar, new C0.J(j3));
        C0880v c0880v = C0880v.f8657a;
        boolean z3 = this.f11836k;
        if (!z3) {
            kVar.e(A0.t.f103i, c0880v);
        }
        boolean z4 = this.f11837l;
        boolean z5 = z3 && !z4;
        A0.x xVar3 = A0.t.F;
        F2.d dVar3 = dVarArr2[23];
        xVar3.a(kVar, Boolean.valueOf(z5));
        S s3 = this.f11839n;
        A0.w.c(kVar, new C1426q(s3, 2));
        if (z5) {
            kVar.e(A0.j.f43i, new A0.a(null, new C1426q(s3, kVar)));
            kVar.e(A0.j.f47m, new A0.a(null, new C1430v(this.f11837l, this.f11836k, this.f11839n, kVar, this.f11835j)));
        }
        kVar.e(A0.j.f42h, new A0.a(null, new C0982h(this.f11840o, this.f11836k, this.f11835j, this.f11841p, this.f11839n, 1)));
        I0.m mVar = this.f11838m;
        int i2 = mVar.f3909e;
        D.c0 c0Var = new D.c0(s3, 19, mVar);
        kVar.e(A0.t.f119z, new I0.l(i2));
        kVar.e(A0.j.f48n, new A0.a(null, c0Var));
        kVar.e(A0.j.f36b, new A0.a(null, new C1306q0(s3, this.q, z4)));
        D.X x2 = this.f11841p;
        kVar.e(A0.j.f37c, new A0.a(null, new D.W(x2, 5)));
        if (!C0.J.b(zVar.f3933b)) {
            kVar.e(A0.j.f49o, new A0.a(null, new D.W(x2, 6)));
            if (z3 && !z4) {
                kVar.e(A0.j.f50p, new A0.a(null, new D.W(x2, 7)));
            }
        }
        if (z3 && !z4) {
            kVar.e(A0.j.q, new A0.a(null, new D.W(x2, 4)));
        }
        return c0880v;
    }
}
