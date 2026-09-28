package n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0931j {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0931j f8946h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0931j f8947i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0931j f8948j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0931j[] f8949k;

    static {
        EnumC0931j enumC0931j = new EnumC0931j("Initial", 0);
        f8946h = enumC0931j;
        EnumC0931j enumC0931j2 = new EnumC0931j("Main", 1);
        f8947i = enumC0931j2;
        EnumC0931j enumC0931j3 = new EnumC0931j("Final", 2);
        f8948j = enumC0931j3;
        f8949k = new EnumC0931j[]{enumC0931j, enumC0931j2, enumC0931j3};
    }

    public static EnumC0931j valueOf(String str) {
        return (EnumC0931j) Enum.valueOf(EnumC0931j.class, str);
    }

    public static EnumC0931j[] values() {
        return (EnumC0931j[]) f8949k.clone();
    }
}
