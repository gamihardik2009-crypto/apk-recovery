package M2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class S {

    /* renamed from: h, reason: collision with root package name */
    public static final S f4834h;

    /* renamed from: i, reason: collision with root package name */
    public static final S f4835i;

    /* renamed from: j, reason: collision with root package name */
    public static final S f4836j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ S[] f4837k;

    static {
        S s3 = new S("START", 0);
        f4834h = s3;
        S s4 = new S("STOP", 1);
        f4835i = s4;
        S s5 = new S("STOP_AND_RESET_REPLAY_CACHE", 2);
        f4836j = s5;
        f4837k = new S[]{s3, s4, s5};
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) f4837k.clone();
    }
}
