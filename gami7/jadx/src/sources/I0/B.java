package I0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: h, reason: collision with root package name */
    public static final B f3840h;

    /* renamed from: i, reason: collision with root package name */
    public static final B f3841i;

    /* renamed from: j, reason: collision with root package name */
    public static final B f3842j;

    /* renamed from: k, reason: collision with root package name */
    public static final B f3843k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ B[] f3844l;

    static {
        B b3 = new B("StartInput", 0);
        f3840h = b3;
        B b4 = new B("StopInput", 1);
        f3841i = b4;
        B b5 = new B("ShowKeyboard", 2);
        f3842j = b5;
        B b6 = new B("HideKeyboard", 3);
        f3843k = b6;
        f3844l = new B[]{b3, b4, b5, b6};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f3844l.clone();
    }
}
