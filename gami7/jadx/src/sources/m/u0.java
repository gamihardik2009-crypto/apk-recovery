package m;

/* loaded from: classes.dex */
public final class u0 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8579i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f8580j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(p0 p0Var, int i2) {
        super(1);
        this.f8579i = i2;
        this.f8580j = p0Var;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f8579i) {
            case 0:
                return new t0(this.f8580j, 0);
            default:
                return new t0(this.f8580j, 1);
        }
    }
}
