package Q2;

import m.A0;
import m.AbstractC0845s;

/* loaded from: classes.dex */
public final class i implements A0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f5351h;

    @Override // m.z0
    public AbstractC0845s e(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        return abstractC0845s3;
    }

    @Override // m.z0
    public AbstractC0845s g(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        return j3 < ((long) this.f5351h) * 1000000 ? abstractC0845s : abstractC0845s2;
    }

    @Override // m.A0
    public int j() {
        return 0;
    }

    @Override // m.A0
    public int o() {
        return this.f5351h;
    }
}
