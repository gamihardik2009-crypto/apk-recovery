package O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: h, reason: collision with root package name */
    public static final k f5148h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f5149i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ k[] f5150j;

    static {
        k kVar = new k("Ltr", 0);
        f5148h = kVar;
        k kVar2 = new k("Rtl", 1);
        f5149i = kVar2;
        f5150j = new k[]{kVar, kVar2};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f5150j.clone();
    }
}
