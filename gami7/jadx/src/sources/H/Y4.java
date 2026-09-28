package H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Y4 {

    /* renamed from: h, reason: collision with root package name */
    public static final Y4 f2187h;

    /* renamed from: i, reason: collision with root package name */
    public static final Y4 f2188i;

    /* renamed from: j, reason: collision with root package name */
    public static final Y4 f2189j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Y4[] f2190k;

    static {
        Y4 y4 = new Y4("Tabs", 0);
        f2187h = y4;
        Y4 y42 = new Y4("Divider", 1);
        f2188i = y42;
        Y4 y43 = new Y4("Indicator", 2);
        f2189j = y43;
        f2190k = new Y4[]{y4, y42, y43};
    }

    public static Y4 valueOf(String str) {
        return (Y4) Enum.valueOf(Y4.class, str);
    }

    public static Y4[] values() {
        return (Y4[]) f2190k.clone();
    }
}
