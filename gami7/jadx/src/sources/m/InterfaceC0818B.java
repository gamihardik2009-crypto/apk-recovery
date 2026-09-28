package m;

/* renamed from: m.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0818B extends InterfaceC0840m {
    @Override // m.InterfaceC0840m
    default z0 a(x0 x0Var) {
        return new K1.i(this);
    }

    float b(long j3, float f3, float f4, float f5);

    float c(long j3, float f3, float f4, float f5);

    long d(float f3, float f4, float f5);

    default float f(float f3, float f4, float f5) {
        return c(d(f3, f4, f5), f3, f4, f5);
    }
}
