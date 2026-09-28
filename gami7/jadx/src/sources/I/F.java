package I;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: h, reason: collision with root package name */
    public static final F f3541h;

    /* renamed from: i, reason: collision with root package name */
    public static final F f3542i;

    /* renamed from: j, reason: collision with root package name */
    public static final F f3543j;

    /* renamed from: k, reason: collision with root package name */
    public static final F f3544k;

    /* renamed from: l, reason: collision with root package name */
    public static final F f3545l;

    /* renamed from: m, reason: collision with root package name */
    public static final F f3546m;

    /* renamed from: n, reason: collision with root package name */
    public static final F f3547n;

    /* renamed from: o, reason: collision with root package name */
    public static final F f3548o;

    /* renamed from: p, reason: collision with root package name */
    public static final F f3549p;
    public static final F q;

    /* renamed from: r, reason: collision with root package name */
    public static final F f3550r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ F[] f3551s;

    static {
        F f3 = new F("BodyLarge", 0);
        f3541h = f3;
        F f4 = new F("BodyMedium", 1);
        f3542i = f4;
        F f5 = new F("BodySmall", 2);
        f3543j = f5;
        F f6 = new F("DisplayLarge", 3);
        F f7 = new F("DisplayMedium", 4);
        f3544k = f7;
        F f8 = new F("DisplaySmall", 5);
        F f9 = new F("HeadlineLarge", 6);
        f3545l = f9;
        F f10 = new F("HeadlineMedium", 7);
        F f11 = new F("HeadlineSmall", 8);
        f3546m = f11;
        F f12 = new F("LabelLarge", 9);
        f3547n = f12;
        F f13 = new F("LabelMedium", 10);
        f3548o = f13;
        F f14 = new F("LabelSmall", 11);
        f3549p = f14;
        F f15 = new F("TitleLarge", 12);
        q = f15;
        F f16 = new F("TitleMedium", 13);
        F f17 = new F("TitleSmall", 14);
        f3550r = f17;
        f3551s = new F[]{f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f3551s.clone();
    }
}
