package J;

/* renamed from: J.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287r0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0286q0 f4221a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4222b;

    /* renamed from: c, reason: collision with root package name */
    public final L0 f4223c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4224d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4225e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4226f = true;

    public C0287r0(AbstractC0286q0 abstractC0286q0, Object obj, boolean z3, L0 l02, boolean z4) {
        this.f4221a = abstractC0286q0;
        this.f4222b = z3;
        this.f4223c = l02;
        this.f4224d = z4;
        this.f4225e = obj;
    }

    public final Object a() {
        if (this.f4222b) {
            return null;
        }
        Object obj = this.f4225e;
        if (obj != null) {
            return obj;
        }
        C0257c.z("Unexpected form of a provided value");
        throw null;
    }
}
