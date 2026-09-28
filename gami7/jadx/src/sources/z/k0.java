package z;

/* loaded from: classes.dex */
public final class k0 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11721i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n0 f11722j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(n0 n0Var, int i2) {
        super(0);
        this.f11721i = i2;
        this.f11722j = n0Var;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f11721i) {
            case 0:
                return Boolean.valueOf(this.f11722j.a() > 0.0f);
            default:
                n0 n0Var = this.f11722j;
                return Boolean.valueOf(n0Var.f11742a.g() < n0Var.f11743b.g());
        }
    }
}
