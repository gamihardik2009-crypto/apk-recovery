package H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: H.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0131j3 {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0131j3 f2767h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0131j3 f2768i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0131j3 f2769j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0131j3 f2770k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0131j3 f2771l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0131j3[] f2772m;

    static {
        EnumC0131j3 enumC0131j3 = new EnumC0131j3("TopBar", 0);
        f2767h = enumC0131j3;
        EnumC0131j3 enumC0131j32 = new EnumC0131j3("MainContent", 1);
        f2768i = enumC0131j32;
        EnumC0131j3 enumC0131j33 = new EnumC0131j3("Snackbar", 2);
        f2769j = enumC0131j33;
        EnumC0131j3 enumC0131j34 = new EnumC0131j3("Fab", 3);
        f2770k = enumC0131j34;
        EnumC0131j3 enumC0131j35 = new EnumC0131j3("BottomBar", 4);
        f2771l = enumC0131j35;
        f2772m = new EnumC0131j3[]{enumC0131j3, enumC0131j32, enumC0131j33, enumC0131j34, enumC0131j35};
    }

    public static EnumC0131j3 valueOf(String str) {
        return (EnumC0131j3) Enum.valueOf(EnumC0131j3.class, str);
    }

    public static EnumC0131j3[] values() {
        return (EnumC0131j3[]) f2772m.clone();
    }
}
