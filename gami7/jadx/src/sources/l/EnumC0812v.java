package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0812v {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0812v f8246h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0812v f8247i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0812v f8248j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0812v[] f8249k;

    static {
        EnumC0812v enumC0812v = new EnumC0812v("PreEnter", 0);
        f8246h = enumC0812v;
        EnumC0812v enumC0812v2 = new EnumC0812v("Visible", 1);
        f8247i = enumC0812v2;
        EnumC0812v enumC0812v3 = new EnumC0812v("PostExit", 2);
        f8248j = enumC0812v3;
        f8249k = new EnumC0812v[]{enumC0812v, enumC0812v2, enumC0812v3};
    }

    public static EnumC0812v valueOf(String str) {
        return (EnumC0812v) Enum.valueOf(EnumC0812v.class, str);
    }

    public static EnumC0812v[] values() {
        return (EnumC0812v[]) f8249k.clone();
    }
}
