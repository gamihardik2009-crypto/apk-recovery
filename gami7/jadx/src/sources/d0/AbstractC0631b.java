package d0;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0631b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7391a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f7392b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f7393c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f7394d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7395e = 0;

    static {
        long j3 = 3;
        long j4 = j3 << 32;
        f7391a = (0 & 4294967295L) | j4;
        f7392b = (1 & 4294967295L) | j4;
        f7393c = j4 | (2 & 4294967295L);
        f7394d = (j3 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static String b(long j3) {
        return a(j3, f7391a) ? "Rgb" : a(j3, f7392b) ? "Xyz" : a(j3, f7393c) ? "Lab" : a(j3, f7394d) ? "Cmyk" : "Unknown";
    }
}
