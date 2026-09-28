package u0;

/* loaded from: classes.dex */
public interface V0 {
    float a();

    default float b() {
        return 2.0f;
    }

    default float c() {
        return 16.0f;
    }

    default float d() {
        return Float.MAX_VALUE;
    }

    long e();

    long f();

    default long g() {
        float f3 = 48;
        return C1.y.c(f3, f3);
    }
}
