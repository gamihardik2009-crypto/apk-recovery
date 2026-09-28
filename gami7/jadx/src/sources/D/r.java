package D;

/* loaded from: classes.dex */
public final class r implements InterfaceC0042k {

    /* renamed from: b, reason: collision with root package name */
    public static final r f882b = new r(0);

    /* renamed from: c, reason: collision with root package name */
    public static final r f883c = new r(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0.E f884d = new C0.E(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0.E f885e = new C0.E(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C0.E f886f = new C0.E(4);

    /* renamed from: g, reason: collision with root package name */
    public static final C0.E f887g = new C0.E(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f888a;

    public /* synthetic */ r(int i2) {
        this.f888a = i2;
    }

    @Override // D.InterfaceC0042k
    public long a(C0046o c0046o, int i2) {
        switch (this.f888a) {
            case 0:
                String str = ((C0.H) c0046o.f875e).f461a.f451a.f500a;
                return B1.C.j(z.N.o(str, i2), z.N.n(str, i2));
            default:
                return ((C0.H) c0046o.f875e).k(i2);
        }
    }
}
