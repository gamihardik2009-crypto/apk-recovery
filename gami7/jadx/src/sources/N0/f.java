package N0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final float f4983a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f4984b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f4985c;

    static {
        a(0.0f);
        a(0.5f);
        f4983a = 0.5f;
        a(-1.0f);
        f4984b = -1.0f;
        a(1.0f);
        f4985c = 1.0f;
    }

    public static void a(float f3) {
        if ((0.0f > f3 || f3 > 1.0f) && f3 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }
}
