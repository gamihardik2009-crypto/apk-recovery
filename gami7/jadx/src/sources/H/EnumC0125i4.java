package H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: H.i4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0125i4 {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0125i4 f2740h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0125i4 f2741i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC0125i4[] f2742j;

    static {
        EnumC0125i4 enumC0125i4 = new EnumC0125i4("Dismissed", 0);
        f2740h = enumC0125i4;
        EnumC0125i4 enumC0125i42 = new EnumC0125i4("ActionPerformed", 1);
        f2741i = enumC0125i42;
        f2742j = new EnumC0125i4[]{enumC0125i4, enumC0125i42};
    }

    public static EnumC0125i4 valueOf(String str) {
        return (EnumC0125i4) Enum.valueOf(EnumC0125i4.class, str);
    }

    public static EnumC0125i4[] values() {
        return (EnumC0125i4[]) f2742j.clone();
    }
}
