package t;

/* renamed from: t.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1230y extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10366i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10367j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10368k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1230y(int i2, int i3, int i4) {
        super(0);
        this.f10366i = i4;
        this.f10367j = i2;
        this.f10368k = i3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f10366i) {
            case 0:
                return new C1228w(this.f10367j, this.f10368k);
            default:
                return new u.x(this.f10367j, this.f10368k);
        }
    }
}
