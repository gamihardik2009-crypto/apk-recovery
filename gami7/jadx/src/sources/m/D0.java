package m;

/* loaded from: classes.dex */
public final class D0 implements A0, I0.s {

    /* renamed from: h, reason: collision with root package name */
    public final int f8293h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8294i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f8295j;

    public D0(I0.s sVar, int i2, int i3) {
        this.f8295j = sVar;
        this.f8293h = i2;
        this.f8294i = i3;
    }

    @Override // m.z0
    public AbstractC0845s e(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        return ((K1.i) this.f8295j).e(j3, abstractC0845s, abstractC0845s2, abstractC0845s3);
    }

    @Override // m.z0
    public AbstractC0845s g(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        return ((K1.i) this.f8295j).g(j3, abstractC0845s, abstractC0845s2, abstractC0845s3);
    }

    @Override // I0.s
    public int i(int i2) {
        int i3 = ((I0.s) this.f8295j).i(i2);
        if (i2 >= 0 && i2 <= this.f8294i) {
            z.r0.c(i3, this.f8293h, i2);
        }
        return i3;
    }

    @Override // m.A0
    public int j() {
        return this.f8293h;
    }

    @Override // I0.s
    public int l(int i2) {
        int l3 = ((I0.s) this.f8295j).l(i2);
        if (i2 >= 0 && i2 <= this.f8293h) {
            z.r0.b(l3, this.f8294i, i2);
        }
        return l3;
    }

    @Override // m.A0
    public int o() {
        return this.f8294i;
    }

    public D0(int i2, int i3, InterfaceC0851y interfaceC0851y) {
        this.f8293h = i2;
        this.f8294i = i3;
        this.f8295j = new K1.i(new C0821E(i2, i3, interfaceC0851y));
    }
}
