package c0;

/* renamed from: c0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573M implements O0.b {

    /* renamed from: A, reason: collision with root package name */
    public O0.k f7197A;

    /* renamed from: B, reason: collision with root package name */
    public AbstractC0569I f7198B;

    /* renamed from: h, reason: collision with root package name */
    public int f7199h;

    /* renamed from: i, reason: collision with root package name */
    public float f7200i;

    /* renamed from: j, reason: collision with root package name */
    public float f7201j;

    /* renamed from: k, reason: collision with root package name */
    public float f7202k;

    /* renamed from: l, reason: collision with root package name */
    public float f7203l;

    /* renamed from: m, reason: collision with root package name */
    public float f7204m;

    /* renamed from: n, reason: collision with root package name */
    public float f7205n;

    /* renamed from: o, reason: collision with root package name */
    public long f7206o;

    /* renamed from: p, reason: collision with root package name */
    public long f7207p;
    public float q;

    /* renamed from: r, reason: collision with root package name */
    public float f7208r;

    /* renamed from: s, reason: collision with root package name */
    public float f7209s;

    /* renamed from: t, reason: collision with root package name */
    public float f7210t;

    /* renamed from: u, reason: collision with root package name */
    public long f7211u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0576P f7212v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7213w;

    /* renamed from: x, reason: collision with root package name */
    public int f7214x;

    /* renamed from: y, reason: collision with root package name */
    public long f7215y;

    /* renamed from: z, reason: collision with root package name */
    public O0.b f7216z;

    public final void a(float f3) {
        if (this.f7202k == f3) {
            return;
        }
        this.f7199h |= 4;
        this.f7202k = f3;
    }

    public final void b(long j3) {
        if (C0603v.c(this.f7206o, j3)) {
            return;
        }
        this.f7199h |= 64;
        this.f7206o = j3;
    }

    @Override // O0.b
    public final float c() {
        return this.f7216z.c();
    }

    public final void d(boolean z3) {
        if (this.f7213w != z3) {
            this.f7199h |= 16384;
            this.f7213w = z3;
        }
    }

    public final void f(float f3) {
        if (this.f7200i == f3) {
            return;
        }
        this.f7199h |= 1;
        this.f7200i = f3;
    }

    public final void g(float f3) {
        if (this.f7201j == f3) {
            return;
        }
        this.f7199h |= 2;
        this.f7201j = f3;
    }

    public final void h(float f3) {
        if (this.f7205n == f3) {
            return;
        }
        this.f7199h |= 32;
        this.f7205n = f3;
    }

    public final void i(InterfaceC0576P interfaceC0576P) {
        if (z2.h.a(this.f7212v, interfaceC0576P)) {
            return;
        }
        this.f7199h |= 8192;
        this.f7212v = interfaceC0576P;
    }

    public final void k(long j3) {
        if (C0603v.c(this.f7207p, j3)) {
            return;
        }
        this.f7199h |= 128;
        this.f7207p = j3;
    }

    public final void m(long j3) {
        if (C0580U.a(this.f7211u, j3)) {
            return;
        }
        this.f7199h |= 4096;
        this.f7211u = j3;
    }

    @Override // O0.b
    public final float s() {
        return this.f7216z.s();
    }
}
