package H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: H.w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0216w3 {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0216w3 f3255h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0216w3 f3256i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC0216w3[] f3257j;

    static {
        EnumC0216w3 enumC0216w3 = new EnumC0216w3("THUMB", 0);
        f3255h = enumC0216w3;
        EnumC0216w3 enumC0216w32 = new EnumC0216w3("TRACK", 1);
        f3256i = enumC0216w32;
        f3257j = new EnumC0216w3[]{enumC0216w3, enumC0216w32};
    }

    public static EnumC0216w3 valueOf(String str) {
        return (EnumC0216w3) Enum.valueOf(EnumC0216w3.class, str);
    }

    public static EnumC0216w3[] values() {
        return (EnumC0216w3[]) f3257j.clone();
    }
}
