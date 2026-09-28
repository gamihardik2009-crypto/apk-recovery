package w1;

import t0.AbstractC1265x;

/* renamed from: w1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1383e extends RuntimeException {

    /* renamed from: h, reason: collision with root package name */
    public final int f11447h;

    /* renamed from: i, reason: collision with root package name */
    public final Throwable f11448i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1383e(int i2, Throwable th) {
        super(th);
        AbstractC1265x.f("callbackName", i2);
        this.f11447h = i2;
        this.f11448i = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f11448i;
    }
}
