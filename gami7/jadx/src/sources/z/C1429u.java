package z;

import a0.C0438o;
import m2.C0880v;
import u0.C1300n0;
import u0.R0;

/* renamed from: z.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1429u extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S f11824i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0438o f11825j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f11826k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f11827l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D.X f11828m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I0.s f11829n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1429u(S s3, C0438o c0438o, boolean z3, boolean z4, D.X x2, I0.s sVar) {
        super(1);
        this.f11824i = s3;
        this.f11825j = c0438o;
        this.f11826k = z3;
        this.f11827l = z4;
        this.f11828m = x2;
        this.f11829n = sVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        R0 r02;
        long j3 = ((b0.c) obj).f7058a;
        boolean z3 = !this.f11826k;
        S s3 = this.f11824i;
        if (!s3.b()) {
            this.f11825j.b();
        } else if (z3 && (r02 = s3.f11545c) != null) {
            ((C1300n0) r02).b();
        }
        if (s3.b() && this.f11827l) {
            if (s3.a() != EnumC1407G.f11512i) {
                p0 d3 = s3.d();
                if (d3 != null) {
                    int i2 = this.f11829n.i(d3.b(j3, true));
                    s3.f11561t.l(I0.z.a((I0.z) s3.f11546d.f239c, null, B1.C.j(i2, i2), 5));
                    if (s3.f11543a.f11605a.f500a.length() > 0) {
                        s3.f11553k.setValue(EnumC1407G.f11513j);
                    }
                }
            } else {
                this.f11828m.g(new b0.c(j3));
            }
        }
        return C0880v.f8657a;
    }
}
