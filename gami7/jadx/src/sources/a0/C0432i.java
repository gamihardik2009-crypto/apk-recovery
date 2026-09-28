package a0;

/* renamed from: a0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432i extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C0432i f6465j = new C0432i(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0432i f6466k = new C0432i(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C0432i f6467l = new C0432i(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C0432i f6468m = new C0432i(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C0432i f6469n = new C0432i(1, 4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6470i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0432i(int i2, int i3) {
        super(i2);
        this.f6470i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f6470i) {
            case 0:
                ((InterfaceC0433j) obj).b(false);
                break;
            case 1:
                int i2 = ((C0425b) obj).f6453a;
                break;
            case 2:
                int i3 = ((C0425b) obj).f6453a;
                break;
        }
        return Boolean.valueOf(AbstractC0427d.B((C0442s) obj));
    }
}
