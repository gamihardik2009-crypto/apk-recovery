package r0;

/* renamed from: r0.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1111Z {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f9850a;

    /* renamed from: b, reason: collision with root package name */
    public C1090D f9851b;

    /* renamed from: c, reason: collision with root package name */
    public final C1110Y f9852c = new C1110Y(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final C1110Y f9853d = new C1110Y(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final C1110Y f9854e = new C1110Y(this, 1);

    public C1111Z(c0 c0Var) {
        this.f9850a = c0Var;
    }

    public final C1090D a() {
        C1090D c1090d = this.f9851b;
        if (c1090d != null) {
            return c1090d;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }
}
