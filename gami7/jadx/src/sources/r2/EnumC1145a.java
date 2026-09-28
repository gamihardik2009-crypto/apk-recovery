package r2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1145a {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC1145a f10026h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC1145a f10027i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC1145a f10028j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC1145a[] f10029k;

    static {
        EnumC1145a enumC1145a = new EnumC1145a("COROUTINE_SUSPENDED", 0);
        f10026h = enumC1145a;
        EnumC1145a enumC1145a2 = new EnumC1145a("UNDECIDED", 1);
        f10027i = enumC1145a2;
        EnumC1145a enumC1145a3 = new EnumC1145a("RESUMED", 2);
        f10028j = enumC1145a3;
        f10029k = new EnumC1145a[]{enumC1145a, enumC1145a2, enumC1145a3};
    }

    public static EnumC1145a valueOf(String str) {
        return (EnumC1145a) Enum.valueOf(EnumC1145a.class, str);
    }

    public static EnumC1145a[] values() {
        return (EnumC1145a[]) f10029k.clone();
    }
}
