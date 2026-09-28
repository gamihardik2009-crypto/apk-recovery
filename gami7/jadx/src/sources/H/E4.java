package H;

/* loaded from: classes.dex */
public final class E4 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f1445i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1446j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E4(float f3, float f4) {
        super(1);
        this.f1445i = f3;
        this.f1446j = f4;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        return Float.valueOf(((Boolean) obj).booleanValue() ? this.f1445i : this.f1446j);
    }
}
