package m2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0860b {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0860b f8641h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0860b[] f8642i;

    static {
        EnumC0860b enumC0860b = new EnumC0860b("WARNING", 0);
        f8641h = enumC0860b;
        f8642i = new EnumC0860b[]{enumC0860b, new EnumC0860b("ERROR", 1), new EnumC0860b("HIDDEN", 2)};
    }

    public static EnumC0860b valueOf(String str) {
        return (EnumC0860b) Enum.valueOf(EnumC0860b.class, str);
    }

    public static EnumC0860b[] values() {
        return (EnumC0860b[]) f8642i.clone();
    }
}
