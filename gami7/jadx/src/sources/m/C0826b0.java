package m;

/* renamed from: m.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826b0 implements z0 {

    /* renamed from: h, reason: collision with root package name */
    public final z0 f8412h;

    /* renamed from: i, reason: collision with root package name */
    public final long f8413i;

    public C0826b0(z0 z0Var, long j3) {
        this.f8412h = z0Var;
        this.f8413i = j3;
    }

    @Override // m.z0
    public final boolean a() {
        return this.f8412h.a();
    }

    @Override // m.z0
    public final long b(AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        return this.f8412h.b(abstractC0845s, abstractC0845s2, abstractC0845s3) + this.f8413i;
    }

    @Override // m.z0
    public final AbstractC0845s e(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        long j4 = this.f8413i;
        return j3 < j4 ? abstractC0845s3 : this.f8412h.e(j3 - j4, abstractC0845s, abstractC0845s2, abstractC0845s3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0826b0)) {
            return false;
        }
        C0826b0 c0826b0 = (C0826b0) obj;
        return c0826b0.f8413i == this.f8413i && z2.h.a(c0826b0.f8412h, this.f8412h);
    }

    @Override // m.z0
    public final AbstractC0845s g(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        long j4 = this.f8413i;
        return j3 < j4 ? abstractC0845s : this.f8412h.g(j3 - j4, abstractC0845s, abstractC0845s2, abstractC0845s3);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8413i) + (this.f8412h.hashCode() * 31);
    }
}
