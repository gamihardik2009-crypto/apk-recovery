package b0;

import C1.y;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0503a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7052a = B2.a.d(0.0f, 0.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7053b = 0;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static String d(long j3) {
        if (b(j3) == c(j3)) {
            return "CornerRadius.circular(" + y.K(b(j3)) + ')';
        }
        return "CornerRadius.elliptical(" + y.K(b(j3)) + ", " + y.K(c(j3)) + ')';
    }
}
