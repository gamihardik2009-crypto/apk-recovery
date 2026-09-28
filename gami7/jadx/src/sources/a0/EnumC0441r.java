package a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0441r {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0441r f6488h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0441r f6489i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0441r f6490j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0441r[] f6491k;

    static {
        EnumC0441r enumC0441r = new EnumC0441r("Active", 0);
        f6488h = enumC0441r;
        EnumC0441r enumC0441r2 = new EnumC0441r("ActiveParent", 1);
        f6489i = enumC0441r2;
        EnumC0441r enumC0441r3 = new EnumC0441r("Captured", 2);
        EnumC0441r enumC0441r4 = new EnumC0441r("Inactive", 3);
        f6490j = enumC0441r4;
        f6491k = new EnumC0441r[]{enumC0441r, enumC0441r2, enumC0441r3, enumC0441r4};
    }

    public static EnumC0441r valueOf(String str) {
        return (EnumC0441r) Enum.valueOf(EnumC0441r.class, str);
    }

    public static EnumC0441r[] values() {
        return (EnumC0441r[]) f6491k.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                throw new J2.r();
            }
        }
        return false;
    }
}
