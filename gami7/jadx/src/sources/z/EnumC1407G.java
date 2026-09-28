package z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1407G {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC1407G f11511h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC1407G f11512i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC1407G f11513j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC1407G[] f11514k;

    static {
        EnumC1407G enumC1407G = new EnumC1407G("None", 0);
        f11511h = enumC1407G;
        EnumC1407G enumC1407G2 = new EnumC1407G("Selection", 1);
        f11512i = enumC1407G2;
        EnumC1407G enumC1407G3 = new EnumC1407G("Cursor", 2);
        f11513j = enumC1407G3;
        f11514k = new EnumC1407G[]{enumC1407G, enumC1407G2, enumC1407G3};
    }

    public static EnumC1407G valueOf(String str) {
        return (EnumC1407G) Enum.valueOf(EnumC1407G.class, str);
    }

    public static EnumC1407G[] values() {
        return (EnumC1407G[]) f11514k.clone();
    }
}
