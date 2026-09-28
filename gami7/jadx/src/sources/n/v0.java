package n;

/* loaded from: classes.dex */
public final class v0 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8864i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w0 f8865j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(w0 w0Var, int i2) {
        super(0);
        this.f8864i = i2;
        this.f8865j = w0Var;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f8864i) {
            case 0:
                return Boolean.valueOf(this.f8865j.f() > 0);
            default:
                w0 w0Var = this.f8865j;
                return Boolean.valueOf(w0Var.f8883a.g() < w0Var.f8886d.g());
        }
    }
}
