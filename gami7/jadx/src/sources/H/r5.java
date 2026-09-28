package H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r5 {

    /* renamed from: h, reason: collision with root package name */
    public static final r5 f3068h;

    /* renamed from: i, reason: collision with root package name */
    public static final r5 f3069i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ r5[] f3070j;

    static {
        r5 r5Var = new r5("Filled", 0);
        f3068h = r5Var;
        r5 r5Var2 = new r5("Outlined", 1);
        f3069i = r5Var2;
        f3070j = new r5[]{r5Var, r5Var2};
    }

    public static r5 valueOf(String str) {
        return (r5) Enum.valueOf(r5.class, str);
    }

    public static r5[] values() {
        return (r5[]) f3070j.clone();
    }
}
