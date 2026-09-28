package r0;

/* renamed from: r0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1098L implements c0 {

    /* renamed from: i, reason: collision with root package name */
    public static final C1098L f9827i = new C1098L(0);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9828h;

    public /* synthetic */ C1098L(int i2) {
        this.f9828h = i2;
    }

    public long a(long j3, long j4) {
        switch (this.f9828h) {
            case 1:
                float min = Math.min(b0.f.d(j4) / b0.f.d(j3), b0.f.b(j4) / b0.f.b(j3));
                return AbstractC1108W.a(min, min);
            default:
                if (b0.f.d(j3) <= b0.f.d(j4) && b0.f.b(j3) <= b0.f.b(j4)) {
                    return AbstractC1108W.a(1.0f, 1.0f);
                }
                float min2 = Math.min(b0.f.d(j4) / b0.f.d(j3), b0.f.b(j4) / b0.f.b(j3));
                return AbstractC1108W.a(min2, min2);
        }
    }

    @Override // r0.c0
    public boolean b(Object obj, Object obj2) {
        return false;
    }

    @Override // r0.c0
    public void d(b0 b0Var) {
        b0Var.clear();
    }

    public String toString() {
        switch (this.f9828h) {
            case 3:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
