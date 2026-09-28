package v;

/* renamed from: v.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1340L extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11293i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1343O f11294j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1340L(C1343O c1343o, int i2) {
        super(0);
        this.f11293i = i2;
        this.f11294j = c1343o;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f11293i) {
            case 0:
                C1343O c1343o = this.f11294j;
                return Float.valueOf(c1343o.f11303v.a() - c1343o.f11303v.c());
            case 1:
                return Float.valueOf(this.f11294j.f11303v.b());
            default:
                return Float.valueOf(this.f11294j.f11303v.f());
        }
    }
}
