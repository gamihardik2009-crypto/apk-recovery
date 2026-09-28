package H;

/* loaded from: classes.dex */
public final class J5 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1650i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1651j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1652k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J5(int i2, int i3, boolean z3) {
        super(0);
        this.f1650i = i2;
        this.f1651j = i3;
        this.f1652k = z3;
    }

    @Override // y2.a
    public final Object c() {
        return new M5(this.f1650i, this.f1651j, this.f1652k);
    }
}
