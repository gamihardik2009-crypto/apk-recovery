package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f241h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f242i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f243j;

    static {
        a aVar = new a("On", 0);
        f241h = aVar;
        a aVar2 = new a("Off", 1);
        f242i = aVar2;
        f243j = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f243j.clone();
    }
}
