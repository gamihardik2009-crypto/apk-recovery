package z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1406F {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC1406F f11507h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC1406F f11508i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC1406F f11509j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC1406F[] f11510k;

    static {
        EnumC1406F enumC1406F = new EnumC1406F("Cursor", 0);
        f11507h = enumC1406F;
        EnumC1406F enumC1406F2 = new EnumC1406F("SelectionStart", 1);
        f11508i = enumC1406F2;
        EnumC1406F enumC1406F3 = new EnumC1406F("SelectionEnd", 2);
        f11509j = enumC1406F3;
        f11510k = new EnumC1406F[]{enumC1406F, enumC1406F2, enumC1406F3};
    }

    public static EnumC1406F valueOf(String str) {
        return (EnumC1406F) Enum.valueOf(EnumC1406F.class, str);
    }

    public static EnumC1406F[] values() {
        return (EnumC1406F[]) f11510k.clone();
    }
}
