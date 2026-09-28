package l;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796e extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8202i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8203j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0796e(int i2, Object obj) {
        super(1);
        this.f8202i = i2;
        this.f8203j = obj;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f8202i) {
            case 0:
                return Boolean.valueOf(z2.h.a(obj, this.f8203j));
            default:
                ((Number) obj).intValue();
                return this.f8203j;
        }
    }
}
