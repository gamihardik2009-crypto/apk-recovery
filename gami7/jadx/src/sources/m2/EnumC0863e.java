package m2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0863e {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0863e f8643h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0863e f8644i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC0863e[] f8645j;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0863e EF0;

    static {
        EnumC0863e enumC0863e = new EnumC0863e("SYNCHRONIZED", 0);
        EnumC0863e enumC0863e2 = new EnumC0863e("PUBLICATION", 1);
        f8643h = enumC0863e2;
        EnumC0863e enumC0863e3 = new EnumC0863e("NONE", 2);
        f8644i = enumC0863e3;
        f8645j = new EnumC0863e[]{enumC0863e, enumC0863e2, enumC0863e3};
    }

    public static EnumC0863e valueOf(String str) {
        return (EnumC0863e) Enum.valueOf(EnumC0863e.class, str);
    }

    public static EnumC0863e[] values() {
        return (EnumC0863e[]) f8645j.clone();
    }
}
