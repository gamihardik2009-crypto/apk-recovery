package H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: H.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0095e2 {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0095e2 f2517h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0095e2 f2518i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0095e2 f2519j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0095e2[] f2520k;

    static {
        EnumC0095e2 enumC0095e2 = new EnumC0095e2("Focused", 0);
        f2517h = enumC0095e2;
        EnumC0095e2 enumC0095e22 = new EnumC0095e2("UnfocusedEmpty", 1);
        f2518i = enumC0095e22;
        EnumC0095e2 enumC0095e23 = new EnumC0095e2("UnfocusedNotEmpty", 2);
        f2519j = enumC0095e23;
        f2520k = new EnumC0095e2[]{enumC0095e2, enumC0095e22, enumC0095e23};
    }

    public static EnumC0095e2 valueOf(String str) {
        return (EnumC0095e2) Enum.valueOf(EnumC0095e2.class, str);
    }

    public static EnumC0095e2[] values() {
        return (EnumC0095e2[]) f2520k.clone();
    }
}
