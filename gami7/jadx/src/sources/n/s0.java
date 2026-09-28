package n;

/* loaded from: classes.dex */
public final class s0 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8848i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t0 f8849j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(t0 t0Var, int i2) {
        super(0);
        this.f8848i = i2;
        this.f8849j = t0Var;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f8848i) {
            case 0:
                return Float.valueOf(this.f8849j.f8852u.f());
            default:
                return Float.valueOf(this.f8849j.f8852u.f8886d.g());
        }
    }
}
