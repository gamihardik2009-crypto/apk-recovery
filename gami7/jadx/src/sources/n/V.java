package n;

/* loaded from: classes.dex */
public final class V extends z2.i implements y2.a {

    /* renamed from: j, reason: collision with root package name */
    public static final V f8716j = new V(0, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final V f8717k = new V(0, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8718i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(int i2, int i3) {
        super(i2);
        this.f8718i = i3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f8718i) {
            case 0:
                return C0883B.f8664a;
            default:
                return new h0();
        }
    }
}
