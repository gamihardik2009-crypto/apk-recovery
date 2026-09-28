package t0;

import m2.C0880v;

/* loaded from: classes.dex */
public final class Y extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10522i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z f10523j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.n f10524k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1246d f10525l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f10526m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f10527n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f10528o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f10529p;
    public final /* synthetic */ float q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(Z z3, V.n nVar, C1246d c1246d, long j3, r rVar, boolean z4, boolean z5, float f3, int i2) {
        super(0);
        this.f10522i = i2;
        this.f10523j = z3;
        this.f10524k = nVar;
        this.f10525l = c1246d;
        this.f10526m = j3;
        this.f10527n = rVar;
        this.f10528o = z4;
        this.f10529p = z5;
        this.q = f3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f10522i) {
            case 0:
                V.n e3 = AbstractC1248f.e(this.f10524k, this.f10525l.b());
                boolean z3 = this.f10529p;
                Z z4 = this.f10523j;
                C1246d c1246d = this.f10525l;
                long j3 = this.f10526m;
                r rVar = this.f10527n;
                boolean z5 = this.f10528o;
                if (e3 == null) {
                    z4.Y0(c1246d, j3, rVar, z5, z3);
                } else {
                    z4.getClass();
                    float f3 = this.q;
                    rVar.b(e3, f3, z3, new Y(z4, e3, c1246d, j3, rVar, z5, z3, f3, 0));
                }
                break;
            default:
                this.f10523j.k1(AbstractC1248f.e(this.f10524k, this.f10525l.b()), this.f10525l, this.f10526m, this.f10527n, this.f10528o, this.f10529p, this.q);
                break;
        }
        return C0880v.f8657a;
    }
}
