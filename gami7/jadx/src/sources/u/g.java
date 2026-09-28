package u;

import n2.AbstractC0963o;

/* loaded from: classes.dex */
public final class g extends z2.i implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final g f10688j = new g(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f10689k = new g(2, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10690i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i2, int i3) {
        super(i2);
        this.f10690i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f10690i) {
            case 0:
                ((Number) obj2).intValue();
                return new C1271b(1);
            default:
                x xVar = (x) obj2;
                return AbstractC0963o.v(Integer.valueOf(xVar.f10796b.a()), Integer.valueOf(xVar.f10796b.b()));
        }
    }
}
